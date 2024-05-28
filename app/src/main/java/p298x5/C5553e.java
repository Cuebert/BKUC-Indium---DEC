package p298x5;

import com.google.firebase.installations.C2618f;
import java.util.concurrent.TimeUnit;

/* renamed from: x5.e */
/* loaded from: classes.dex */
class C5553e {

    /* renamed from: d */
    private static final long f20598d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f20599e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C2618f f20600a = C2618f.m12029c();

    /* renamed from: b */
    private long f20601b;

    /* renamed from: c */
    private int f20602c;

    /* renamed from: a */
    private synchronized long m20339a(int i10) {
        if (!m20340c(i10)) {
            return f20598d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f20602c) + this.f20600a.m12035e(), f20599e);
    }

    /* renamed from: c */
    private static boolean m20340c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    /* renamed from: d */
    private static boolean m20341d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    /* renamed from: e */
    private synchronized void m20342e() {
        this.f20602c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m20343b() {
        boolean z10;
        if (this.f20602c != 0) {
            z10 = this.f20600a.m12033a() > this.f20601b;
        }
        return z10;
    }

    /* renamed from: f */
    public synchronized void m20344f(int i10) {
        if (m20341d(i10)) {
            m20342e();
            return;
        }
        this.f20602c++;
        this.f20601b = this.f20600a.m12033a() + m20339a(i10);
    }
}
