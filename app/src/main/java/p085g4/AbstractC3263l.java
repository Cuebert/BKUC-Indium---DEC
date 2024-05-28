package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.l */
/* loaded from: classes.dex */
public abstract class AbstractC3263l<TResult> {
    /* renamed from: a */
    public AbstractC3263l<TResult> mo14494a(Executor executor, InterfaceC3249e interfaceC3249e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public AbstractC3263l<TResult> mo14495b(InterfaceC3251f<TResult> interfaceC3251f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public AbstractC3263l<TResult> mo14496c(Executor executor, InterfaceC3251f<TResult> interfaceC3251f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract AbstractC3263l<TResult> mo14497d(InterfaceC3253g interfaceC3253g);

    /* renamed from: e */
    public abstract AbstractC3263l<TResult> mo14498e(Executor executor, InterfaceC3253g interfaceC3253g);

    /* renamed from: f */
    public abstract AbstractC3263l<TResult> mo14499f(InterfaceC3255h<? super TResult> interfaceC3255h);

    /* renamed from: g */
    public abstract AbstractC3263l<TResult> mo14500g(Executor executor, InterfaceC3255h<? super TResult> interfaceC3255h);

    /* renamed from: h */
    public <TContinuationResult> AbstractC3263l<TContinuationResult> mo14501h(Executor executor, InterfaceC3245c<TResult, TContinuationResult> interfaceC3245c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> AbstractC3263l<TContinuationResult> mo14502i(Executor executor, InterfaceC3245c<TResult, AbstractC3263l<TContinuationResult>> interfaceC3245c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: j */
    public abstract Exception mo14503j();

    /* renamed from: k */
    public abstract TResult mo14504k();

    /* renamed from: l */
    public abstract <X extends Throwable> TResult mo14505l(Class<X> cls) throws Throwable;

    /* renamed from: m */
    public abstract boolean mo14506m();

    /* renamed from: n */
    public abstract boolean mo14507n();

    /* renamed from: o */
    public abstract boolean mo14508o();

    /* renamed from: p */
    public <TContinuationResult> AbstractC3263l<TContinuationResult> mo14509p(InterfaceC3261k<TResult, TContinuationResult> interfaceC3261k) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: q */
    public <TContinuationResult> AbstractC3263l<TContinuationResult> mo14510q(Executor executor, InterfaceC3261k<TResult, TContinuationResult> interfaceC3261k) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
