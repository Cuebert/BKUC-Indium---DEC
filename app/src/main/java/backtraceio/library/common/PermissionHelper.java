package backtraceio.library.common;

import android.content.Context;
import androidx.core.content.C0587a;

/* loaded from: classes.dex */
public class PermissionHelper {
    public static boolean isPermissionForAccessWifiStateGranted(Context context) {
        return C0587a.m3027a(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static boolean isPermissionForBluetoothGranted(Context context) {
        return C0587a.m3027a(context, "android.permission.BLUETOOTH") == 0;
    }

    public static boolean isPermissionForInternetGranted(Context context) {
        return C0587a.m3027a(context, "android.permission.INTERNET") == 0;
    }

    public static boolean isPermissionForReadExternalStorageGranted(Context context) {
        return C0587a.m3027a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
