package p057e3;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;

@Deprecated
/* renamed from: e3.b */
/* loaded from: classes.dex */
public class C3063b {
    /* renamed from: a */
    public static String m13530a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock));
        if (true == TextUtils.isEmpty(str)) {
            str = BuildConfig.FLAVOR;
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
