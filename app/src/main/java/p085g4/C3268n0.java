package p085g4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p321z2.C5984j;

/* renamed from: g4.n0 */
/* loaded from: classes.dex */
public final class C3268n0<TResult> extends AbstractC3263l<TResult> {

    /* renamed from: a */
    private final Object f13710a = new Object();

    /* renamed from: b */
    private final C3260j0 f13711b = new C3260j0();

    /* renamed from: c */
    private boolean f13712c;

    /* renamed from: d */
    private volatile boolean f13713d;

    /* renamed from: e */
    private Object f13714e;

    /* renamed from: f */
    private Exception f13715f;

    /* renamed from: w */
    private final void m14517w() {
        C5984j.m21290n(this.f13712c, "Task is not yet complete");
    }

    /* renamed from: x */
    private final void m14518x() {
        if (this.f13713d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: y */
    private final void m14519y() {
        if (this.f13712c) {
            throw C3247d.m14484a(this);
        }
    }

    /* renamed from: z */
    private final void m14520z() {
        synchronized (this.f13710a) {
            if (this.f13712c) {
                this.f13711b.m14493b(this);
            }
        }
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: a */
    public final AbstractC3263l<TResult> mo14494a(Executor executor, InterfaceC3249e interfaceC3249e) {
        this.f13711b.m14492a(new C3281z(executor, interfaceC3249e));
        m14520z();
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: b */
    public final AbstractC3263l<TResult> mo14495b(InterfaceC3251f<TResult> interfaceC3251f) {
        this.f13711b.m14492a(new C3244b0(C3267n.f13708a, interfaceC3251f));
        m14520z();
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: c */
    public final AbstractC3263l<TResult> mo14496c(Executor executor, InterfaceC3251f<TResult> interfaceC3251f) {
        this.f13711b.m14492a(new C3244b0(executor, interfaceC3251f));
        m14520z();
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: d */
    public final AbstractC3263l<TResult> mo14497d(InterfaceC3253g interfaceC3253g) {
        mo14498e(C3267n.f13708a, interfaceC3253g);
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: e */
    public final AbstractC3263l<TResult> mo14498e(Executor executor, InterfaceC3253g interfaceC3253g) {
        this.f13711b.m14492a(new C3248d0(executor, interfaceC3253g));
        m14520z();
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: f */
    public final AbstractC3263l<TResult> mo14499f(InterfaceC3255h<? super TResult> interfaceC3255h) {
        mo14500g(C3267n.f13708a, interfaceC3255h);
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: g */
    public final AbstractC3263l<TResult> mo14500g(Executor executor, InterfaceC3255h<? super TResult> interfaceC3255h) {
        this.f13711b.m14492a(new C3252f0(executor, interfaceC3255h));
        m14520z();
        return this;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: h */
    public final <TContinuationResult> AbstractC3263l<TContinuationResult> mo14501h(Executor executor, InterfaceC3245c<TResult, TContinuationResult> interfaceC3245c) {
        C3268n0 c3268n0 = new C3268n0();
        this.f13711b.m14492a(new C3277v(executor, interfaceC3245c, c3268n0));
        m14520z();
        return c3268n0;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: i */
    public final <TContinuationResult> AbstractC3263l<TContinuationResult> mo14502i(Executor executor, InterfaceC3245c<TResult, AbstractC3263l<TContinuationResult>> interfaceC3245c) {
        C3268n0 c3268n0 = new C3268n0();
        this.f13711b.m14492a(new C3279x(executor, interfaceC3245c, c3268n0));
        m14520z();
        return c3268n0;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: j */
    public final Exception mo14503j() {
        Exception exc;
        synchronized (this.f13710a) {
            exc = this.f13715f;
        }
        return exc;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: k */
    public final TResult mo14504k() {
        TResult tresult;
        synchronized (this.f13710a) {
            m14517w();
            m14518x();
            Exception exc = this.f13715f;
            if (exc == null) {
                tresult = (TResult) this.f13714e;
            } else {
                throw new C3259j(exc);
            }
        }
        return tresult;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: l */
    public final <X extends Throwable> TResult mo14505l(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f13710a) {
            m14517w();
            m14518x();
            if (!cls.isInstance(this.f13715f)) {
                Exception exc = this.f13715f;
                if (exc == null) {
                    tresult = (TResult) this.f13714e;
                } else {
                    throw new C3259j(exc);
                }
            } else {
                throw cls.cast(this.f13715f);
            }
        }
        return tresult;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: m */
    public final boolean mo14506m() {
        return this.f13713d;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: n */
    public final boolean mo14507n() {
        boolean z10;
        synchronized (this.f13710a) {
            z10 = this.f13712c;
        }
        return z10;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: o */
    public final boolean mo14508o() {
        boolean z10;
        synchronized (this.f13710a) {
            z10 = false;
            if (this.f13712c && !this.f13713d && this.f13715f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: p */
    public final <TContinuationResult> AbstractC3263l<TContinuationResult> mo14509p(InterfaceC3261k<TResult, TContinuationResult> interfaceC3261k) {
        Executor executor = C3267n.f13708a;
        C3268n0 c3268n0 = new C3268n0();
        this.f13711b.m14492a(new C3256h0(executor, interfaceC3261k, c3268n0));
        m14520z();
        return c3268n0;
    }

    @Override // p085g4.AbstractC3263l
    /* renamed from: q */
    public final <TContinuationResult> AbstractC3263l<TContinuationResult> mo14510q(Executor executor, InterfaceC3261k<TResult, TContinuationResult> interfaceC3261k) {
        C3268n0 c3268n0 = new C3268n0();
        this.f13711b.m14492a(new C3256h0(executor, interfaceC3261k, c3268n0));
        m14520z();
        return c3268n0;
    }

    /* renamed from: r */
    public final void m14521r(Exception exc) {
        C5984j.m21287k(exc, "Exception must not be null");
        synchronized (this.f13710a) {
            m14519y();
            this.f13712c = true;
            this.f13715f = exc;
        }
        this.f13711b.m14493b(this);
    }

    /* renamed from: s */
    public final void m14522s(Object obj) {
        synchronized (this.f13710a) {
            m14519y();
            this.f13712c = true;
            this.f13714e = obj;
        }
        this.f13711b.m14493b(this);
    }

    /* renamed from: t */
    public final boolean m14523t() {
        synchronized (this.f13710a) {
            if (this.f13712c) {
                return false;
            }
            this.f13712c = true;
            this.f13713d = true;
            this.f13711b.m14493b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m14524u(Exception exc) {
        C5984j.m21287k(exc, "Exception must not be null");
        synchronized (this.f13710a) {
            if (this.f13712c) {
                return false;
            }
            this.f13712c = true;
            this.f13715f = exc;
            this.f13711b.m14493b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean m14525v(Object obj) {
        synchronized (this.f13710a) {
            if (this.f13712c) {
                return false;
            }
            this.f13712c = true;
            this.f13714e = obj;
            this.f13711b.m14493b(this);
            return true;
        }
    }
}
