package p309y3;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: y3.u6 */
/* loaded from: classes.dex */
public class C5835u6 implements Closeable {

    /* renamed from: u */
    private static final Map<String, C5835u6> f21384u = new HashMap();

    /* renamed from: n */
    private final String f21385n;

    /* renamed from: o */
    private int f21386o;

    /* renamed from: p */
    private double f21387p;

    /* renamed from: q */
    private long f21388q;

    /* renamed from: r */
    private long f21389r;

    /* renamed from: s */
    private long f21390s;

    /* renamed from: t */
    private long f21391t;

    /* JADX INFO: Access modifiers changed from: private */
    public C5835u6(String str) {
        this.f21390s = 2147483647L;
        this.f21391t = -2147483648L;
        this.f21385n = str;
    }

    public /* synthetic */ C5835u6(String str, C5817s6 c5817s6) {
        this("unusedTag");
    }

    /* renamed from: b */
    private final void m20773b() {
        this.f21386o = 0;
        this.f21387p = 0.0d;
        this.f21388q = 0L;
        this.f21390s = 2147483647L;
        this.f21391t = -2147483648L;
    }

    /* renamed from: l */
    public static long m20774l() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    /* renamed from: z */
    public static C5835u6 m20775z(String str) {
        C5826t6 c5826t6;
        C5827t7.m20771a();
        if (!C5827t7.m20772b()) {
            c5826t6 = C5826t6.f21365v;
            return c5826t6;
        }
        Map<String, C5835u6> map = f21384u;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C5835u6("detectorTaskWithResource#run"));
        }
        return map.get("detectorTaskWithResource#run");
    }

    /* renamed from: c */
    public C5835u6 mo20768c() {
        this.f21388q = m20774l();
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f21388q;
        if (j10 != 0) {
            mo20770i(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    /* renamed from: e */
    public void mo20769e(long j10) {
        long m20774l = m20774l();
        long j11 = this.f21389r;
        if (j11 != 0 && m20774l - j11 >= 1000000) {
            m20773b();
        }
        this.f21389r = m20774l;
        this.f21386o++;
        this.f21387p += j10;
        this.f21390s = Math.min(this.f21390s, j10);
        this.f21391t = Math.max(this.f21391t, j10);
        if (this.f21386o % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f21385n, Long.valueOf(j10), Integer.valueOf(this.f21386o), Long.valueOf(this.f21390s), Long.valueOf(this.f21391t), Integer.valueOf((int) (this.f21387p / this.f21386o)));
            C5827t7.m20771a();
        }
        if (this.f21386o % 500 == 0) {
            m20773b();
        }
    }

    /* renamed from: i */
    public void mo20770i(long j10) {
        mo20769e(m20774l() - j10);
    }
}
