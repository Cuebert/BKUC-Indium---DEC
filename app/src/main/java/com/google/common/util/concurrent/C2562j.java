package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p059e5.C3075g;
import p072f5.AbstractC3149c;

/* renamed from: com.google.common.util.concurrent.j */
/* loaded from: classes.dex */
public final class C2562j extends AbstractC2563k {

    /* renamed from: com.google.common.util.concurrent.j$a */
    /* loaded from: classes.dex */
    public static final class a<V> {

        /* renamed from: a */
        private final boolean f10130a;

        /* renamed from: b */
        private final AbstractC3149c<InterfaceFutureC2565m<? extends V>> f10131b;

        /* synthetic */ a(boolean z10, AbstractC3149c abstractC3149c, RunnableC2561i runnableC2561i) {
            this(z10, abstractC3149c);
        }

        /* renamed from: a */
        public <C> InterfaceFutureC2565m<C> m11854a(Callable<C> callable, Executor executor) {
            return new C2559g(this.f10131b, this.f10130a, executor, callable);
        }

        private a(boolean z10, AbstractC3149c<InterfaceFutureC2565m<? extends V>> abstractC3149c) {
            this.f10130a = z10;
            this.f10131b = abstractC3149c;
        }
    }

    /* renamed from: a */
    public static <V> V m11852a(Future<V> future) throws ExecutionException {
        C3075g.m13557l(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C2570r.m11864a(future);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <V> a<V> m11853b(InterfaceFutureC2565m<? extends V>... interfaceFutureC2565mArr) {
        return new a<>(false, AbstractC3149c.m13837q(interfaceFutureC2565mArr), null);
    }
}
