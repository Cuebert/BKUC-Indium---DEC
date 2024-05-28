package p030c4;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C1379b;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import p282w2.C5105c;
import p282w2.C5106d;
import p321z2.C5984j;

/* renamed from: c4.a */
/* loaded from: classes.dex */
public class C1128a {

    /* renamed from: a */
    private static final C1379b f5458a = C1379b.m7589f();

    /* renamed from: b */
    private static final Object f5459b = new Object();

    /* renamed from: c */
    private static Method f5460c = null;

    /* renamed from: d */
    private static Method f5461d = null;

    /* renamed from: c4.a$a */
    /* loaded from: classes.dex */
    public interface a {
        void onProviderInstallFailed(int i10, Intent intent);

        void onProviderInstalled();
    }

    /* renamed from: a */
    public static void m6519a(Context context) throws C5106d, C5105c {
        Context context2;
        C5984j.m21287k(context, "Context must not be null");
        f5458a.m7593k(context, 11925000);
        synchronized (f5459b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m7756e(context, DynamiteModule.f6435f, "com.google.android.gms.providerinstaller.dynamite").m7764b();
            } catch (DynamiteModule.C1426a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context m7598d = C1381d.m7598d(context);
                if (m7598d != null) {
                    try {
                        if (f5461d == null) {
                            Class cls = Long.TYPE;
                            f5461d = m6522d(m7598d, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f5461d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e11) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                    }
                }
                if (m7598d != null) {
                    m6523e(m7598d, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new C5105c(8);
                }
            }
            m6523e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    /* renamed from: b */
    public static void m6520b(Context context, a aVar) {
        C5984j.m21287k(context, "Context must not be null");
        C5984j.m21287k(aVar, "Listener must not be null");
        C5984j.m21281e("Must be called on the UI thread");
        new AsyncTaskC1129b(context, aVar).execute(new Void[0]);
    }

    /* renamed from: d */
    private static Method m6522d(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: e */
    private static void m6523e(Context context, Context context2, String str) throws C5105c {
        try {
            if (f5460c == null) {
                f5460c = m6522d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f5460c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new C5105c(8);
        }
    }
}
