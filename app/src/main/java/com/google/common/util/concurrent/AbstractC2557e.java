package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import p059e5.C3075g;
import p072f5.AbstractC3148b;
import p072f5.AbstractC3156j;

/* renamed from: com.google.common.util.concurrent.e */
/* loaded from: classes.dex */
public abstract class AbstractC2557e<InputT, OutputT> extends AbstractC2558f<OutputT> {

    /* renamed from: B */
    private static final Logger f10110B = Logger.getLogger(AbstractC2557e.class.getName());

    /* renamed from: A */
    private final boolean f10111A;

    /* renamed from: y */
    private AbstractC3148b<? extends InterfaceFutureC2565m<? extends InputT>> f10112y;

    /* renamed from: z */
    private final boolean f10113z;

    /* renamed from: com.google.common.util.concurrent.e$a */
    /* loaded from: classes.dex */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AbstractC2557e(AbstractC3148b<? extends InterfaceFutureC2565m<? extends InputT>> abstractC3148b, boolean z10, boolean z11) {
        super(abstractC3148b.size());
        this.f10112y = (AbstractC3148b) C3075g.m13551f(abstractC3148b);
        this.f10113z = z10;
        this.f10111A = z11;
    }

    /* renamed from: N */
    private static boolean m11821N(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    private void m11822P(int i10, Future<? extends InputT> future) {
        try {
            mo11830O(i10, C2562j.m11852a(future));
        } catch (ExecutionException e10) {
            m11824S(e10.getCause());
        } catch (Throwable th) {
            m11824S(th);
        }
    }

    /* renamed from: Q */
    public void m11826V(AbstractC3148b<? extends Future<? extends InputT>> abstractC3148b) {
        int m11839J = m11839J();
        C3075g.m13556k(m11839J >= 0, "Less than 0 remaining futures");
        if (m11839J == 0) {
            m11828X(abstractC3148b);
        }
    }

    /* renamed from: S */
    private void m11824S(Throwable th) {
        C3075g.m13551f(th);
        if (this.f10113z && !m11802C(th) && m11821N(m11840K(), th)) {
            m11827W(th);
        } else if (th instanceof Error) {
            m11827W(th);
        }
    }

    /* renamed from: U */
    public /* synthetic */ void m11825U(InterfaceFutureC2565m interfaceFutureC2565m, int i10) {
        try {
            if (interfaceFutureC2565m.isCancelled()) {
                this.f10112y = null;
                cancel(false);
            } else {
                m11822P(i10, interfaceFutureC2565m);
            }
        } finally {
            m11826V(null);
        }
    }

    /* renamed from: W */
    private static void m11827W(Throwable th) {
        f10110B.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* renamed from: X */
    private void m11828X(AbstractC3148b<? extends Future<? extends InputT>> abstractC3148b) {
        if (abstractC3148b != null) {
            int i10 = 0;
            AbstractC3156j<? extends Future<? extends InputT>> it = abstractC3148b.iterator();
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    m11822P(i10, next);
                }
                i10++;
            }
        }
        m11838I();
        mo11831R();
        mo11833Y(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AbstractC2558f
    /* renamed from: H */
    final void mo11829H(Set<Throwable> set) {
        C3075g.m13551f(set);
        if (isCancelled()) {
            return;
        }
        Throwable mo11804a = mo11804a();
        Objects.requireNonNull(mo11804a);
        m11821N(set, mo11804a);
    }

    /* renamed from: O */
    abstract void mo11830O(int i10, InputT inputt);

    /* renamed from: R */
    abstract void mo11831R();

    /* renamed from: T */
    public final void m11832T() {
        Objects.requireNonNull(this.f10112y);
        if (this.f10112y.isEmpty()) {
            mo11831R();
            return;
        }
        if (this.f10113z) {
            int i10 = 0;
            AbstractC3156j<? extends InterfaceFutureC2565m<? extends InputT>> it = this.f10112y.iterator();
            while (it.hasNext()) {
                InterfaceFutureC2565m<? extends InputT> next = it.next();
                next.mo2501b(new Runnable() { // from class: com.google.common.util.concurrent.c

                    /* renamed from: o */
                    public final /* synthetic */ InterfaceFutureC2565m f10106o;

                    /* renamed from: p */
                    public final /* synthetic */ int f10107p;

                    public /* synthetic */ RunnableC2555c(InterfaceFutureC2565m next2, int i102) {
                        r2 = next2;
                        r3 = i102;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2557e.this.m11825U(r2, r3);
                    }
                }, C2566n.m11859a());
                i102++;
            }
            return;
        }
        RunnableC2556d runnableC2556d = new Runnable() { // from class: com.google.common.util.concurrent.d

            /* renamed from: o */
            public final /* synthetic */ AbstractC3148b f10109o;

            public /* synthetic */ RunnableC2556d(AbstractC3148b abstractC3148b) {
                r2 = abstractC3148b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2557e.this.m11826V(r2);
            }
        };
        AbstractC3156j<? extends InterfaceFutureC2565m<? extends InputT>> it2 = this.f10112y.iterator();
        while (it2.hasNext()) {
            it2.next().mo2501b(runnableC2556d, C2566n.m11859a());
        }
    }

    /* renamed from: Y */
    public void mo11833Y(a aVar) {
        C3075g.m13551f(aVar);
        this.f10112y = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC2553a
    /* renamed from: n */
    public final void mo11805n() {
        super.mo11805n();
        AbstractC3148b<? extends InterfaceFutureC2565m<? extends InputT>> abstractC3148b = this.f10112y;
        mo11833Y(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (abstractC3148b != null)) {
            boolean m11803D = m11803D();
            AbstractC3156j<? extends InterfaceFutureC2565m<? extends InputT>> it = abstractC3148b.iterator();
            while (it.hasNext()) {
                it.next().cancel(m11803D);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC2553a
    /* renamed from: y */
    public final String mo11807y() {
        AbstractC3148b<? extends InterfaceFutureC2565m<? extends InputT>> abstractC3148b = this.f10112y;
        if (abstractC3148b != null) {
            String valueOf = String.valueOf(abstractC3148b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("futures=");
            sb2.append(valueOf);
            return sb2.toString();
        }
        return super.mo11807y();
    }
}
