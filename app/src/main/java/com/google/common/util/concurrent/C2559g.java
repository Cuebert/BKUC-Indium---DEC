package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC2557e;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p059e5.C3075g;
import p072f5.AbstractC3148b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.util.concurrent.g */
/* loaded from: classes.dex */
public final class C2559g<V> extends AbstractC2557e<Object, V> {

    /* renamed from: C */
    private C2559g<V>.b<?> f10123C;

    /* renamed from: com.google.common.util.concurrent.g$a */
    /* loaded from: classes.dex */
    private final class a extends C2559g<V>.b<V> {

        /* renamed from: r */
        private final Callable<V> f10124r;

        a(Callable<V> callable, Executor executor) {
            super(executor);
            this.f10124r = (Callable) C3075g.m13551f(callable);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC2564l
        /* renamed from: e */
        V mo11844e() throws Exception {
            return this.f10124r.call();
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC2564l
        /* renamed from: f */
        String mo11845f() {
            return this.f10124r.toString();
        }

        @Override // com.google.common.util.concurrent.C2559g.b
        /* renamed from: i */
        void mo11846i(V v10) {
            C2559g.this.mo11801B(v10);
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$b */
    /* loaded from: classes.dex */
    private abstract class b<T> extends AbstractRunnableC2564l<T> {

        /* renamed from: p */
        private final Executor f10126p;

        b(Executor executor) {
            this.f10126p = (Executor) C3075g.m13551f(executor);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC2564l
        /* renamed from: a */
        final void mo11847a(Throwable th) {
            C2559g.this.f10123C = null;
            if (th instanceof ExecutionException) {
                C2559g.this.m11802C(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                C2559g.this.cancel(false);
            } else {
                C2559g.this.m11802C(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC2564l
        /* renamed from: b */
        final void mo11848b(T t10) {
            C2559g.this.f10123C = null;
            mo11846i(t10);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC2564l
        /* renamed from: d */
        final boolean mo11849d() {
            return C2559g.this.isDone();
        }

        /* renamed from: h */
        final void m11850h() {
            try {
                this.f10126p.execute(this);
            } catch (RejectedExecutionException e10) {
                C2559g.this.m11802C(e10);
            }
        }

        /* renamed from: i */
        abstract void mo11846i(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2559g(AbstractC3148b<? extends InterfaceFutureC2565m<?>> abstractC3148b, boolean z10, Executor executor, Callable<V> callable) {
        super(abstractC3148b, z10, false);
        this.f10123C = new a(callable, executor);
        m11832T();
    }

    @Override // com.google.common.util.concurrent.AbstractC2557e
    /* renamed from: O */
    void mo11830O(int i10, Object obj) {
    }

    @Override // com.google.common.util.concurrent.AbstractC2557e
    /* renamed from: R */
    void mo11831R() {
        C2559g<V>.b<?> bVar = this.f10123C;
        if (bVar != null) {
            bVar.m11850h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.util.concurrent.AbstractC2557e
    /* renamed from: Y */
    public void mo11833Y(AbstractC2557e.a aVar) {
        super.mo11833Y(aVar);
        if (aVar == AbstractC2557e.a.OUTPUT_FUTURE_DONE) {
            this.f10123C = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC2553a
    /* renamed from: x */
    protected void mo11806x() {
        C2559g<V>.b<?> bVar = this.f10123C;
        if (bVar != null) {
            bVar.m11856c();
        }
    }
}
