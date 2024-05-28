package com.google.common.util.concurrent;

import androidx.concurrent.futures.C0540b;
import com.google.common.util.concurrent.AbstractC2553a;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p072f5.C3155i;

/* renamed from: com.google.common.util.concurrent.f */
/* loaded from: classes.dex */
abstract class AbstractC2558f<OutputT> extends AbstractC2553a.j<OutputT> {

    /* renamed from: w */
    private static final b f10117w;

    /* renamed from: x */
    private static final Logger f10118x = Logger.getLogger(AbstractC2558f.class.getName());

    /* renamed from: u */
    private volatile Set<Throwable> f10119u = null;

    /* renamed from: v */
    private volatile int f10120v;

    /* renamed from: com.google.common.util.concurrent.f$b */
    /* loaded from: classes.dex */
    private static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract void mo11841a(AbstractC2558f<?> abstractC2558f, Set<Throwable> set, Set<Throwable> set2);

        /* renamed from: b */
        abstract int mo11842b(AbstractC2558f<?> abstractC2558f);
    }

    /* renamed from: com.google.common.util.concurrent.f$c */
    /* loaded from: classes.dex */
    private static final class c extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<AbstractC2558f<?>, Set<Throwable>> f10121a;

        /* renamed from: b */
        final AtomicIntegerFieldUpdater<AbstractC2558f<?>> f10122b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f10121a = atomicReferenceFieldUpdater;
            this.f10122b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AbstractC2558f.b
        /* renamed from: a */
        void mo11841a(AbstractC2558f<?> abstractC2558f, Set<Throwable> set, Set<Throwable> set2) {
            C0540b.m2514a(this.f10121a, abstractC2558f, set, set2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2558f.b
        /* renamed from: b */
        int mo11842b(AbstractC2558f<?> abstractC2558f) {
            return this.f10122b.decrementAndGet(abstractC2558f);
        }
    }

    /* renamed from: com.google.common.util.concurrent.f$d */
    /* loaded from: classes.dex */
    private static final class d extends b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC2558f.b
        /* renamed from: a */
        void mo11841a(AbstractC2558f<?> abstractC2558f, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (abstractC2558f) {
                if (((AbstractC2558f) abstractC2558f).f10119u == set) {
                    ((AbstractC2558f) abstractC2558f).f10119u = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC2558f.b
        /* renamed from: b */
        int mo11842b(AbstractC2558f<?> abstractC2558f) {
            int m11837G;
            synchronized (abstractC2558f) {
                m11837G = AbstractC2558f.m11837G(abstractC2558f);
            }
            return m11837G;
        }
    }

    static {
        b bVar;
        Throwable th = null;
        byte b10 = 0;
        try {
            bVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC2558f.class, Set.class, "u"), AtomicIntegerFieldUpdater.newUpdater(AbstractC2558f.class, "v"));
        } catch (Throwable th2) {
            d dVar = new d();
            th = th2;
            bVar = dVar;
        }
        f10117w = bVar;
        if (th != null) {
            f10118x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2558f(int i10) {
        this.f10120v = i10;
    }

    /* renamed from: G */
    static /* synthetic */ int m11837G(AbstractC2558f abstractC2558f) {
        int i10 = abstractC2558f.f10120v - 1;
        abstractC2558f.f10120v = i10;
        return i10;
    }

    /* renamed from: H */
    abstract void mo11829H(Set<Throwable> set);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m11838I() {
        this.f10119u = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final int m11839J() {
        return f10117w.mo11842b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final Set<Throwable> m11840K() {
        Set<Throwable> set = this.f10119u;
        if (set != null) {
            return set;
        }
        Set<Throwable> m13855a = C3155i.m13855a();
        mo11829H(m13855a);
        f10117w.mo11841a(this, null, m13855a);
        Set<Throwable> set2 = this.f10119u;
        Objects.requireNonNull(set2);
        return set2;
    }
}
