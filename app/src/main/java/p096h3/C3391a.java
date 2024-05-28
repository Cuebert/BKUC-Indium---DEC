package p096h3;

import android.content.Context;
import p070f3.C3137k;

/* renamed from: h3.a */
/* loaded from: classes.dex */
public class C3391a {

    /* renamed from: a */
    private static Context f14198a;

    /* renamed from: b */
    private static Boolean f14199b;

    /* renamed from: a */
    public static synchronized boolean m14945a(Context context) {
        Boolean bool;
        synchronized (C3391a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f14198a;
            if (context2 != null && (bool = f14199b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f14199b = null;
            if (C3137k.m13804h()) {
                f14199b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f14199b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f14199b = Boolean.FALSE;
                }
            }
            f14198a = applicationContext;
            return f14199b.booleanValue();
        }
    }
}
