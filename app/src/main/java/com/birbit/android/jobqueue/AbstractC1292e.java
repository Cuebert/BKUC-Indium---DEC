package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.timer.Timer;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p183o1.C4118d;
import p183o1.C4119e;
import p233s1.C4516a;

/* renamed from: com.birbit.android.jobqueue.e */
/* loaded from: classes.dex */
public abstract class AbstractC1292e implements Serializable {

    /* renamed from: A */
    transient C4119e f5780A;

    /* renamed from: B */
    private transient boolean f5781B;

    /* renamed from: p */
    private transient long f5784p;

    /* renamed from: r */
    private transient long f5786r;

    /* renamed from: s */
    private String f5787s;

    /* renamed from: t */
    private boolean f5788t;

    /* renamed from: u */
    private Set<String> f5789u;

    /* renamed from: v */
    private transient int f5790v;

    /* renamed from: w */
    transient int f5791w;

    /* renamed from: x */
    private transient long f5792x;

    /* renamed from: y */
    transient boolean f5793y;

    /* renamed from: z */
    private transient Context f5794z;

    /* renamed from: n */
    private String f5782n = UUID.randomUUID().toString();

    /* renamed from: o */
    private long f5783o = Long.MIN_VALUE;

    /* renamed from: q */
    private long f5785q = Long.MIN_VALUE;

    public AbstractC1292e(C4118d c4118d) {
        this.f5784p = 0L;
        this.f5786r = 0L;
        this.f5784p = c4118d.m17104d();
        this.f5786r = c4118d.m17105e();
        this.f5788t = c4118d.m17108h();
        this.f5787s = c4118d.m17102b();
        this.f5791w = c4118d.m17103c();
        this.f5792x = c4118d.m17101a();
        String m17106f = c4118d.m17106f();
        if (c4118d.m17107g() == null && m17106f == null) {
            return;
        }
        HashSet<String> m17107g = c4118d.m17107g() != null ? c4118d.m17107g() : new HashSet<>();
        if (m17106f != null) {
            String m7037a = m7037a(m17106f);
            m17107g.add(m7037a);
            if (this.f5787s == null) {
                this.f5787s = m7037a;
            }
        }
        this.f5789u = Collections.unmodifiableSet(m17107g);
    }

    /* renamed from: a */
    private String m7037a(String str) {
        return "job-single-id:" + str;
    }

    /* renamed from: b */
    public final long m7038b() {
        return this.f5792x;
    }

    /* renamed from: c */
    public String m7039c() {
        return this.f5782n;
    }

    /* renamed from: d */
    public final int m7040d() {
        return this.f5791w;
    }

    /* renamed from: e */
    public long m7041e() {
        return this.f5783o;
    }

    /* renamed from: f */
    public long m7042f() {
        return this.f5785q;
    }

    /* renamed from: g */
    protected int m7043g() {
        return 20;
    }

    /* renamed from: h */
    public final String m7044h() {
        return this.f5787s;
    }

    /* renamed from: i */
    public final String m7045i() {
        Set<String> set = this.f5789u;
        if (set == null) {
            return null;
        }
        for (String str : set) {
            if (str.startsWith("job-single-id:")) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: j */
    public final Set<String> m7046j() {
        return this.f5789u;
    }

    /* renamed from: k */
    public final boolean m7047k() {
        return this.f5788t;
    }

    /* renamed from: l */
    public abstract void mo7048l();

    /* renamed from: m */
    public abstract void mo7049m(int i10);

    /* renamed from: n */
    public abstract void mo7050n() throws Throwable;

    /* renamed from: o */
    public final boolean m7051o(Timer timer) {
        if (this.f5781B) {
            if (this.f5783o > timer.nanoTime()) {
                return true;
            }
        } else if (this.f5784p != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m7052p(Timer timer) {
        if (this.f5781B) {
            if (this.f5785q > timer.nanoTime()) {
                return true;
            }
        } else if (this.f5786r != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final int m7053q(C1293f c1293f, int i10) {
        boolean z10;
        boolean z11;
        this.f5790v = i10;
        if (C4516a.m18536e()) {
            C4516a.m18533b("running job %s", getClass().getSimpleName());
        }
        try {
            mo7050n();
            if (C4516a.m18536e()) {
                C4516a.m18533b("finished job %s", this);
            }
            z11 = false;
            z10 = false;
        } catch (Throwable th) {
            C4516a.m18535d(th, "error while executing job %s", this);
            z10 = i10 < m7043g();
            if (z10 && !this.f5793y) {
                try {
                    C4119e mo7056t = mo7056t(th, i10, m7043g());
                    if (mo7056t == null) {
                        mo7056t = C4119e.f16802e;
                    }
                    this.f5780A = mo7056t;
                    z10 = mo7056t.m17112c();
                } catch (Throwable th2) {
                    C4516a.m18535d(th2, "shouldReRunOnThrowable did throw an exception", new Object[0]);
                }
            }
            z11 = true;
        }
        C4516a.m18533b("safeRunResult for %s : %s. re run:%s. cancelled: %s", this, Boolean.valueOf(!z11), Boolean.valueOf(z10), Boolean.valueOf(this.f5793y));
        if (!z11) {
            return 1;
        }
        if (c1293f.m7075p()) {
            return 6;
        }
        if (c1293f.m7074o()) {
            return 3;
        }
        if (z10) {
            return 4;
        }
        return i10 < m7043g() ? 5 : 2;
    }

    /* renamed from: r */
    public void m7054r(Timer timer) {
        if (!this.f5781B) {
            long j10 = this.f5784p;
            if (j10 == Long.MIN_VALUE) {
                this.f5783o = Long.MIN_VALUE;
            } else if (j10 == Long.MAX_VALUE) {
                this.f5783o = Long.MAX_VALUE;
            } else {
                this.f5783o = timer.nanoTime() + TimeUnit.MILLISECONDS.toNanos(this.f5784p);
            }
            long j11 = this.f5786r;
            if (j11 == Long.MIN_VALUE) {
                this.f5785q = Long.MIN_VALUE;
            } else if (j11 == Long.MAX_VALUE) {
                this.f5785q = Long.MAX_VALUE;
            } else {
                this.f5785q = timer.nanoTime() + TimeUnit.MILLISECONDS.toNanos(this.f5786r);
            }
            long j12 = this.f5783o;
            long j13 = this.f5785q;
            if (j12 < j13) {
                this.f5783o = j13;
            }
            this.f5781B = true;
            return;
        }
        throw new IllegalStateException("Cannot add the same job twice");
    }

    /* renamed from: s */
    public void m7055s(Context context) {
        this.f5794z = context;
    }

    /* renamed from: t */
    protected abstract C4119e mo7056t(Throwable th, int i10, int i11);
}
