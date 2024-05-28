package com.roblox.client;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0152b;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.DeviceParams;
import java.util.Iterator;
import java.util.List;
import p033c7.C1134c;
import p035c9.C1152l;
import p177n7.C4073a;
import p302x9.C5570a;
import p302x9.C5571b;

/* renamed from: com.roblox.client.d1 */
/* loaded from: classes.dex */
public class C2817d1 {

    /* renamed from: a */
    public static DisplayMetrics f11010a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.d1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f11011n;

        /* renamed from: o */
        final /* synthetic */ EditText f11012o;

        a(View view, EditText editText) {
            this.f11011n = view;
            this.f11012o = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f11011n.getContext().getSystemService("input_method")).showSoftInput(this.f11012o, 1);
        }
    }

    /* renamed from: com.roblox.client.d1$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f11013n;

        b(View view) {
            this.f11013n = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f11013n.getContext().getSystemService("input_method")).showSoftInput(this.f11013n, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.d1$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f11014n;

        c(View view) {
            this.f11014n = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2817d1.m12471j(this.f11014n.getContext(), this.f11014n);
        }
    }

    /* renamed from: a */
    public static void m12462a(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT <= C1134c.m6537a().mo6544C0() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Parcel obtain = Parcel.obtain();
            memoryInfo.writeToParcel(obtain, 0);
            if (obtain.dataSize() < 32) {
                return;
            }
            obtain.setDataPosition(obtain.dataSize() - 32);
            long readLong = obtain.readLong();
            obtain.readLong();
            obtain.readLong();
            long readLong2 = obtain.readLong();
            deviceParams.lowMemoryKillerBackgroundAppThreshold = readLong;
            deviceParams.lowMemoryKillerForegroundAppThreshold = readLong2;
        }
    }

    /* renamed from: b */
    public static DialogC0152b m12463b(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextAppearance(context, R.style.TextAppearance.DeviceDefault.Large);
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        DialogC0152b m695a = new DialogC0152b.a(context).m695a();
        m695a.m694i(textView, 150, 100, 150, 100);
        m695a.setCanceledOnTouchOutside(true);
        try {
            m695a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
        return m695a;
    }

    /* renamed from: c */
    public static float m12464c(Context context, int i10) {
        return i10 * m12465d(context).density;
    }

    /* renamed from: d */
    public static DisplayMetrics m12465d(Context context) {
        DisplayMetrics displayMetrics = f11010a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        f11010a = displayMetrics2;
        return displayMetrics2;
    }

    /* renamed from: e */
    public static boolean m12466e() {
        if (NativeSettingsInterface.nativeCPUSupportsNEON()) {
            return true;
        }
        List<String> m20476a = C5571b.m20476a("/proc/cpuinfo");
        Iterator<String> it = m20476a.iterator();
        while (it.hasNext()) {
            if (it.next().contains("neon")) {
                return true;
            }
        }
        new C4073a("NeonNotFound").m16948e("cpuinfo", m20476a.toString()).m16951h();
        return false;
    }

    /* renamed from: f */
    public static String m12467f(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return BuildConfig.FLAVOR;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return "WiFi";
        }
        if (type != 0) {
            return "Other";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 20:
                return "5G";
            default:
                return "Other";
        }
    }

    /* renamed from: g */
    public static Point m12468g(Context context) {
        return C5570a.m20474d(context);
    }

    /* renamed from: h */
    public static Point m12469h(Context context) {
        return C5570a.m20475e(context);
    }

    /* renamed from: i */
    public static void m12470i(Activity activity) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }

    /* renamed from: j */
    public static void m12471j(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: k */
    public static void m12472k(View view) {
        if (view != null) {
            new Handler(Looper.getMainLooper()).post(new c(view));
        }
    }

    /* renamed from: l */
    public static boolean m12473l(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* renamed from: m */
    public static void m12474m(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://navigate?url=" + str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent2.addFlags(268435456);
            if (C1152l.m6730a(context, intent2)) {
                context.startActivity(intent2);
                return;
            }
            DialogC0152b.a aVar = new DialogC0152b.a(context);
            aVar.m702h(context.getString(C2748c0.f10535J3));
            aVar.m706l(context.getString(C2748c0.f10519G2), null);
            aVar.m695a().show();
        }
    }

    /* renamed from: n */
    public static float m12475n(Context context, float f10) {
        return f10 / context.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: o */
    public static void m12476o(View view) {
        if (view != null) {
            new Handler(Looper.getMainLooper()).post(new b(view));
        }
    }

    /* renamed from: p */
    public static void m12477p(View view, EditText editText) {
        if (view != null && editText != null) {
            new Handler(Looper.getMainLooper()).post(new a(view, editText));
        } else if (view != null) {
            m12476o(view);
        }
    }
}
