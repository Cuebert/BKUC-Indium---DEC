package com.birbit.android.jobqueue;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p183o1.C4119e;

/* renamed from: com.birbit.android.jobqueue.f */
/* loaded from: classes.dex */
public class C1293f {

    /* renamed from: a */
    protected Long f5795a;

    /* renamed from: b */
    protected String f5796b;

    /* renamed from: c */
    protected int f5797c;

    /* renamed from: d */
    protected String f5798d;

    /* renamed from: e */
    protected int f5799e;

    /* renamed from: f */
    protected long f5800f;

    /* renamed from: g */
    protected long f5801g;

    /* renamed from: h */
    protected long f5802h;

    /* renamed from: i */
    protected long f5803i;

    /* renamed from: j */
    protected long f5804j;

    /* renamed from: k */
    transient AbstractC1292e f5805k;

    /* renamed from: l */
    protected final Set<String> f5806l;

    /* renamed from: m */
    private boolean f5807m;

    /* renamed from: n */
    private boolean f5808n;

    /* renamed from: o */
    private boolean f5809o;

    /* renamed from: com.birbit.android.jobqueue.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private int f5810a;

        /* renamed from: b */
        private String f5811b;

        /* renamed from: c */
        private int f5812c;

        /* renamed from: d */
        private AbstractC1292e f5813d;

        /* renamed from: e */
        private long f5814e;

        /* renamed from: g */
        private Long f5816g;

        /* renamed from: h */
        private long f5817h;

        /* renamed from: f */
        private long f5815f = Long.MIN_VALUE;

        /* renamed from: i */
        private int f5818i = 0;

        /* renamed from: a */
        public C1293f m7086a() {
            AbstractC1292e abstractC1292e = this.f5813d;
            if (abstractC1292e != null) {
                int i10 = this.f5818i;
                if ((i10 & 2) == 0) {
                    throw new IllegalArgumentException("must provide a priority");
                }
                if ((i10 & 1) == 0) {
                    throw new IllegalArgumentException("must provide a session id");
                }
                if ((i10 & 4) != 0) {
                    C1293f c1293f = new C1293f(this.f5810a, this.f5811b, this.f5812c, abstractC1292e, this.f5814e, this.f5815f, this.f5817h);
                    Long l10 = this.f5816g;
                    if (l10 != null) {
                        c1293f.m7085z(l10.longValue());
                    }
                    return c1293f;
                }
                throw new IllegalArgumentException("must provide a created timestamp");
            }
            throw new IllegalArgumentException("must provide a job");
        }

        /* renamed from: b */
        public b m7087b(long j10) {
            this.f5814e = j10;
            this.f5818i |= 4;
            return this;
        }

        /* renamed from: c */
        public b m7088c(long j10) {
            this.f5815f = j10;
            return this;
        }

        /* renamed from: d */
        public b m7089d(String str) {
            this.f5811b = str;
            return this;
        }

        /* renamed from: e */
        public b m7090e(long j10) {
            this.f5816g = Long.valueOf(j10);
            return this;
        }

        /* renamed from: f */
        public b m7091f(AbstractC1292e abstractC1292e) {
            this.f5813d = abstractC1292e;
            return this;
        }

        /* renamed from: g */
        public b m7092g(int i10) {
            this.f5810a = i10;
            this.f5818i |= 2;
            return this;
        }

        /* renamed from: h */
        public b m7093h(int i10) {
            this.f5812c = i10;
            return this;
        }

        /* renamed from: i */
        public b m7094i(long j10) {
            this.f5817h = j10;
            this.f5818i |= 1;
            return this;
        }
    }

    /* renamed from: A */
    public void m7057A(int i10) {
        this.f5797c = i10;
        this.f5805k.f5791w = i10;
    }

    /* renamed from: B */
    public void m7058B(int i10) {
        this.f5799e = i10;
    }

    /* renamed from: C */
    public void m7059C(long j10) {
        this.f5802h = j10;
    }

    /* renamed from: a */
    public long m7060a() {
        return this.f5801g;
    }

    /* renamed from: b */
    public long m7061b() {
        return this.f5800f;
    }

    /* renamed from: c */
    public String m7062c() {
        return this.f5798d;
    }

    /* renamed from: d */
    public String m7063d() {
        return this.f5796b;
    }

    /* renamed from: e */
    public Long m7064e() {
        return this.f5795a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1293f) {
            return this.f5796b.equals(((C1293f) obj).f5796b);
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC1292e m7065f() {
        return this.f5805k;
    }

    /* renamed from: g */
    public int m7066g() {
        return this.f5797c;
    }

    /* renamed from: h */
    public long m7067h() {
        return this.f5803i;
    }

    public int hashCode() {
        return this.f5796b.hashCode();
    }

    /* renamed from: i */
    public long m7068i() {
        return this.f5804j;
    }

    /* renamed from: j */
    public C4119e m7069j() {
        return this.f5805k.f5780A;
    }

    /* renamed from: k */
    public int m7070k() {
        return this.f5799e;
    }

    /* renamed from: l */
    public long m7071l() {
        return this.f5802h;
    }

    /* renamed from: m */
    public Set<String> m7072m() {
        return this.f5806l;
    }

    /* renamed from: n */
    public boolean m7073n() {
        Set<String> set = this.f5806l;
        return set != null && set.size() > 0;
    }

    /* renamed from: o */
    public boolean m7074o() {
        return this.f5807m;
    }

    /* renamed from: p */
    public boolean m7075p() {
        return this.f5808n;
    }

    /* renamed from: q */
    public void m7076q() {
        this.f5807m = true;
        this.f5805k.f5793y = true;
    }

    /* renamed from: r */
    public void m7077r() {
        this.f5808n = true;
        m7076q();
    }

    /* renamed from: s */
    public synchronized void m7078s() {
        this.f5809o = true;
    }

    /* renamed from: t */
    public void m7079t(int i10) {
        this.f5805k.mo7049m(i10);
    }

    /* renamed from: u */
    public boolean m7080u(long j10) {
        return this.f5803i > j10;
    }

    /* renamed from: v */
    public boolean m7081v(long j10) {
        return this.f5804j > j10;
    }

    /* renamed from: w */
    public int m7082w(int i10) {
        return this.f5805k.m7053q(this, i10);
    }

    /* renamed from: x */
    public void m7083x(Context context) {
        this.f5805k.m7055s(context);
    }

    /* renamed from: y */
    public void m7084y(long j10) {
        this.f5800f = j10;
    }

    /* renamed from: z */
    public void m7085z(long j10) {
        this.f5795a = Long.valueOf(j10);
    }

    private C1293f(int i10, String str, int i11, AbstractC1292e abstractC1292e, long j10, long j11, long j12) {
        this.f5796b = abstractC1292e.m7039c();
        this.f5797c = i10;
        this.f5798d = str;
        this.f5799e = i11;
        this.f5801g = j10;
        this.f5800f = j11;
        this.f5805k = abstractC1292e;
        abstractC1292e.f5791w = i10;
        this.f5802h = j12;
        this.f5803i = abstractC1292e.m7041e();
        this.f5804j = abstractC1292e.m7042f();
        this.f5806l = abstractC1292e.m7046j() == null ? null : Collections.unmodifiableSet(abstractC1292e.m7046j());
    }
}
