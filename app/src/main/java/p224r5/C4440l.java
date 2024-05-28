package p224r5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p071f4.C3144a;

/* renamed from: r5.l */
/* loaded from: classes.dex */
public final class C4440l {

    /* renamed from: a */
    private static final long f18033a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f18034b = new Object();

    /* renamed from: c */
    private static C3144a f18035c;

    /* renamed from: a */
    public static ComponentName m18248a(Context context, Intent intent) {
        synchronized (f18034b) {
            if (f18035c == null) {
                C3144a c3144a = new C3144a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f18035c = c3144a;
                c3144a.m13827c(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            m18250c(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f18035c.m13825a(f18033a);
            }
            return startService;
        }
    }

    /* renamed from: b */
    public static void m18249b(Intent intent) {
        synchronized (f18034b) {
            if (f18035c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                m18250c(intent, false);
                f18035c.m13826b();
            }
        }
    }

    /* renamed from: c */
    private static void m18250c(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }
}
