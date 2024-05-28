package p257u1;

import com.birbit.android.jobqueue.C1293f;
import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;

/* renamed from: u1.j */
/* loaded from: classes.dex */
public class C4817j extends AbstractC4611b {

    /* renamed from: d */
    private C1293f f18685d;

    /* renamed from: e */
    private Object f18686e;

    /* renamed from: f */
    private int f18687f;

    public C4817j() {
        super(EnumC4616g.RUN_JOB_RESULT);
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
        this.f18685d = null;
    }

    /* renamed from: c */
    public C1293f m18993c() {
        return this.f18685d;
    }

    /* renamed from: d */
    public int m18994d() {
        return this.f18687f;
    }

    /* renamed from: e */
    public Object m18995e() {
        return this.f18686e;
    }

    /* renamed from: f */
    public void m18996f(C1293f c1293f) {
        this.f18685d = c1293f;
    }

    /* renamed from: g */
    public void m18997g(int i10) {
        this.f18687f = i10;
    }

    /* renamed from: h */
    public void m18998h(Object obj) {
        this.f18686e = obj;
    }
}
