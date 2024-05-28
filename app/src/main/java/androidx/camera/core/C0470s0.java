package androidx.camera.core;

import androidx.camera.core.AbstractC0418i0;
import androidx.camera.core.C0470s0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p279w.InterfaceC5034h1;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* renamed from: androidx.camera.core.s0 */
/* loaded from: classes.dex */
public final class C0470s0 extends AbstractC0462q0 {

    /* renamed from: u */
    final Executor f2084u;

    /* renamed from: v */
    private final Object f2085v = new Object();

    /* renamed from: w */
    InterfaceC0443l1 f2086w;

    /* renamed from: x */
    private b f2087x;

    /* renamed from: androidx.camera.core.s0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ b f2088a;

        a(b bVar) {
            this.f2088a = bVar;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            this.f2088a.close();
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r12) {
        }
    }

    /* renamed from: androidx.camera.core.s0$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC0418i0 {

        /* renamed from: p */
        final WeakReference<C0470s0> f2090p;

        b(InterfaceC0443l1 interfaceC0443l1, C0470s0 c0470s0) {
            super(interfaceC0443l1);
            this.f2090p = new WeakReference<>(c0470s0);
            m2035b(new AbstractC0418i0.a() { // from class: androidx.camera.core.t0
                public /* synthetic */ C0474t0() {
                }

                @Override // androidx.camera.core.AbstractC0418i0.a
                /* renamed from: b */
                public final void mo1997b(InterfaceC0443l1 interfaceC0443l12) {
                    C0470s0.b.this.m2229z(interfaceC0443l12);
                }
            });
        }

        /* renamed from: z */
        public /* synthetic */ void m2229z(InterfaceC0443l1 interfaceC0443l1) {
            C0470s0 c0470s0 = this.f2090p.get();
            if (c0470s0 != null) {
                c0470s0.f2084u.execute(new Runnable() { // from class: androidx.camera.core.u0
                    public /* synthetic */ RunnableC0478u0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0470s0.this.m2224A();
                    }
                });
            }
        }
    }

    public C0470s0(Executor executor) {
        this.f2084u = executor;
    }

    /* renamed from: A */
    public void m2224A() {
        synchronized (this.f2085v) {
            this.f2087x = null;
            InterfaceC0443l1 interfaceC0443l1 = this.f2086w;
            if (interfaceC0443l1 != null) {
                this.f2086w = null;
                mo2193p(interfaceC0443l1);
            }
        }
    }

    @Override // androidx.camera.core.AbstractC0462q0
    /* renamed from: d */
    InterfaceC0443l1 mo2188d(InterfaceC5034h1 interfaceC5034h1) {
        return interfaceC5034h1.mo1871c();
    }

    @Override // androidx.camera.core.AbstractC0462q0
    /* renamed from: g */
    public void mo2191g() {
        synchronized (this.f2085v) {
            InterfaceC0443l1 interfaceC0443l1 = this.f2086w;
            if (interfaceC0443l1 != null) {
                interfaceC0443l1.close();
                this.f2086w = null;
            }
        }
    }

    @Override // androidx.camera.core.AbstractC0462q0
    /* renamed from: p */
    void mo2193p(InterfaceC0443l1 interfaceC0443l1) {
        synchronized (this.f2085v) {
            if (!this.f2070s) {
                interfaceC0443l1.close();
                return;
            }
            if (this.f2087x == null) {
                b bVar = new b(interfaceC0443l1, this);
                this.f2087x = bVar;
                C5586f.m20502b(m2189e(bVar), new a(bVar), C5493a.m20219a());
            } else {
                if (interfaceC0443l1.mo1857q().mo2029c() <= this.f2087x.mo1857q().mo2029c()) {
                    interfaceC0443l1.close();
                } else {
                    InterfaceC0443l1 interfaceC0443l12 = this.f2086w;
                    if (interfaceC0443l12 != null) {
                        interfaceC0443l12.close();
                    }
                    this.f2086w = interfaceC0443l1;
                }
            }
        }
    }
}
