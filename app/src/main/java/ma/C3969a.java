package ma;

import android.os.SystemClock;
import com.roblox.universalapp.logging.JNILoggingProtocol;

/* renamed from: ma.a */
/* loaded from: classes.dex */
public class C3969a {

    /* renamed from: a */
    private static C3969a f16355a;

    /* renamed from: e */
    public static synchronized C3969a m16695e() {
        C3969a c3969a;
        synchronized (C3969a.class) {
            if (f16355a == null) {
                f16355a = new C3969a();
            }
            c3969a = f16355a;
        }
        return c3969a;
    }

    /* renamed from: a */
    public long m16696a() {
        try {
            return JNILoggingProtocol.nativeGetTimestamp();
        } catch (UnsatisfiedLinkError unused) {
            return 0L;
        }
    }

    /* renamed from: b */
    public void m16697b(String str) {
        m16698c(str, 0L);
    }

    /* renamed from: c */
    public void m16698c(String str, long j10) {
        try {
            JNILoggingProtocol.m13358a(str, j10, new Object[0]);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* renamed from: d */
    public void m16699d(String str, long j10) {
        C3969a m16695e = m16695e();
        m16695e.m16698c(str, (m16695e.m16696a() + j10) - SystemClock.elapsedRealtime());
    }
}
