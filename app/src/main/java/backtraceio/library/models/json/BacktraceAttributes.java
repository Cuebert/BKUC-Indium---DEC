package backtraceio.library.models.json;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.DeviceAttributesHelper;
import backtraceio.library.common.TypeHelper;
import backtraceio.library.enums.ScreenOrientation;
import backtraceio.library.logger.BacktraceLogger;
import com.appsflyer.oaid.BuildConfig;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class BacktraceAttributes {
    private static final transient String LOG_TAG = "BacktraceAttributes";
    private static boolean isMetricsEnabled;
    private static String sessionId;
    public Map<String, String> attributes = new HashMap();
    private final Map<String, Object> complexAttributes = new HashMap();
    private final Context context;

    public BacktraceAttributes(Context context, BacktraceReport backtraceReport, Map<String, Object> map) {
        this.context = context;
        if (backtraceReport != null) {
            convertReportAttributes(backtraceReport);
            setExceptionAttributes(backtraceReport);
        }
        if (map != null) {
            convertClientAttributes(map);
        }
        if (backtraceReport != null && map != null) {
            BacktraceReport.concatAttributes(backtraceReport, map);
        }
        setAppInformation();
        setDeviceInformation();
        setScreenInformation();
        if (isMetricsEnabled) {
            this.attributes.put("application.session", sessionId);
        }
    }

    private void convertAttributes(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                if (TypeHelper.isPrimitiveOrPrimitiveWrapperOrString(value.getClass())) {
                    this.attributes.put(entry.getKey(), value.toString());
                } else {
                    this.complexAttributes.put(entry.getKey(), value);
                }
            }
        }
    }

    private void convertClientAttributes(Map<String, Object> map) {
        convertAttributes(map);
    }

    private void convertReportAttributes(BacktraceReport backtraceReport) {
        convertAttributes(BacktraceReport.concatAttributes(backtraceReport, null));
        if (backtraceReport.exceptionTypeReport.booleanValue()) {
            this.complexAttributes.put("Exception properties", backtraceReport.exception);
        }
    }

    public static void enableMetrics() {
        isMetricsEnabled = true;
        sessionId = UUID.randomUUID().toString();
    }

    private int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", 0);
    }

    private ScreenOrientation getScreenOrientation() {
        int i10 = this.context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return ScreenOrientation.PORTRAIT;
        }
        if (i10 == 2) {
            return ScreenOrientation.LANDSCAPE;
        }
        return ScreenOrientation.UNDEFINED;
    }

    private void setAppInformation() {
        this.attributes.put("application.package", this.context.getApplicationContext().getPackageName());
        this.attributes.put("application", getApplicationName());
        String applicationVersionOrEmpty = getApplicationVersionOrEmpty();
        if (BacktraceStringHelper.isNullOrEmpty(applicationVersionOrEmpty)) {
            return;
        }
        this.attributes.put("application.version", applicationVersionOrEmpty);
        this.attributes.put("version", applicationVersionOrEmpty);
    }

    private void setDeviceInformation() {
        this.attributes.put("uname.version", Build.VERSION.RELEASE);
        this.attributes.put("culture", Locale.getDefault().getDisplayLanguage());
        this.attributes.put("build.type", "Release");
        this.attributes.put("device.model", Build.MODEL);
        this.attributes.put("device.brand", Build.BRAND);
        this.attributes.put("device.product", Build.PRODUCT);
        this.attributes.put("device.sdk", String.valueOf(Build.VERSION.SDK_INT));
        this.attributes.put("device.manufacturer", Build.MANUFACTURER);
        this.attributes.put("device.os_version", System.getProperty("os.version"));
        this.attributes.putAll(new DeviceAttributesHelper(this.context).getDeviceAttributes());
    }

    private void setExceptionAttributes(BacktraceReport backtraceReport) {
        if (backtraceReport == null) {
            return;
        }
        if (!backtraceReport.exceptionTypeReport.booleanValue()) {
            this.attributes.put("error.message", backtraceReport.message);
        } else {
            this.attributes.put("classifier", backtraceReport.exception.getClass().getName());
            this.attributes.put("error.message", backtraceReport.exception.getMessage());
        }
    }

    private void setScreenInformation() {
        Display defaultDisplay = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.attributes.put("screen.width", String.valueOf(displayMetrics.widthPixels));
        this.attributes.put("screen.height", String.valueOf(displayMetrics.heightPixels));
        this.attributes.put("screen.dpi", String.valueOf(displayMetrics.densityDpi));
        this.attributes.put("screen.orientation", getScreenOrientation().toString());
        this.attributes.put("screen.brightness", String.valueOf(getScreenBrightness()));
    }

    public Map<String, Object> getAllAttributes() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.attributes);
        hashMap.putAll(this.complexAttributes);
        return hashMap;
    }

    public String getApplicationName() {
        return this.context.getApplicationInfo().loadLabel(this.context.getPackageManager()).toString();
    }

    public String getApplicationVersionOrEmpty() {
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            BacktraceLogger.m6449e(LOG_TAG, "Could not resolve application version");
            e10.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public Map<String, Object> getComplexAttributes() {
        return this.complexAttributes;
    }
}
