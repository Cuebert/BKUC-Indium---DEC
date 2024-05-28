package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0403e3;
import androidx.camera.core.C0469s;
import androidx.camera.core.C0493y;
import androidx.camera.core.C0497z;
import androidx.camera.core.InterfaceC0437k;
import androidx.camera.core.InterfaceC0461q;
import androidx.camera.core.impl.utils.C0424d;
import androidx.camera.core.impl.utils.C0432l;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import androidx.lifecycle.InterfaceC0845l;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p169n.InterfaceC4005a;
import p279w.C5091x0;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5078t;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;
import p305y.InterfaceC5583c;
import p318z.C5937e;

/* renamed from: androidx.camera.lifecycle.e */
/* loaded from: classes.dex */
public final class C0506e {

    /* renamed from: h */
    private static final C0506e f2252h = new C0506e();

    /* renamed from: c */
    private InterfaceFutureC2565m<C0493y> f2255c;

    /* renamed from: f */
    private C0493y f2258f;

    /* renamed from: g */
    private Context f2259g;

    /* renamed from: a */
    private final Object f2253a = new Object();

    /* renamed from: b */
    private C0497z.b f2254b = null;

    /* renamed from: d */
    private InterfaceFutureC2565m<Void> f2256d = C5586f.m20508h(null);

    /* renamed from: e */
    private final LifecycleCameraRepository f2257e = new LifecycleCameraRepository();

    /* renamed from: androidx.camera.lifecycle.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f2260a;

        /* renamed from: b */
        final /* synthetic */ C0493y f2261b;

        a(C0541c.a aVar, C0493y c0493y) {
            this.f2260a = aVar;
            this.f2261b = c0493y;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            this.f2260a.m2521f(th);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r22) {
            this.f2260a.m2519c(this.f2261b);
        }
    }

    private C0506e() {
    }

    /* renamed from: f */
    public static InterfaceFutureC2565m<C0506e> m2384f(Context context) {
        C0654h.m3467f(context);
        return C5586f.m20515o(f2252h.m2385g(context), new InterfaceC4005a() { // from class: androidx.camera.lifecycle.c

            /* renamed from: a */
            public final /* synthetic */ Context f2250a;

            public /* synthetic */ C0504c(Context context2) {
                r1 = context2;
            }

            @Override // p169n.InterfaceC4005a
            /* renamed from: a */
            public final Object mo1403a(Object obj) {
                C0506e m2386h;
                m2386h = C0506e.m2386h(r1, (C0493y) obj);
                return m2386h;
            }
        }, C5493a.m20219a());
    }

    /* renamed from: g */
    private InterfaceFutureC2565m<C0493y> m2385g(Context context) {
        synchronized (this.f2253a) {
            InterfaceFutureC2565m<C0493y> interfaceFutureC2565m = this.f2255c;
            if (interfaceFutureC2565m != null) {
                return interfaceFutureC2565m;
            }
            InterfaceFutureC2565m<C0493y> m2515a = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.lifecycle.b

                /* renamed from: b */
                public final /* synthetic */ C0493y f2249b;

                public /* synthetic */ C0503b(C0493y c0493y) {
                    r2 = c0493y;
                }

                @Override // androidx.concurrent.futures.C0541c.c
                /* renamed from: a */
                public final Object mo1498a(C0541c.a aVar) {
                    Object m2388j;
                    m2388j = C0506e.this.m2388j(r2, aVar);
                    return m2388j;
                }
            });
            this.f2255c = m2515a;
            return m2515a;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ C0506e m2386h(Context context, C0493y c0493y) {
        C0506e c0506e = f2252h;
        c0506e.m2389k(c0493y);
        c0506e.m2390l(C0424d.m2055a(context));
        return c0506e;
    }

    /* renamed from: j */
    public /* synthetic */ Object m2388j(C0493y c0493y, C0541c.a aVar) throws Exception {
        synchronized (this.f2253a) {
            C5586f.m20502b(C5584d.m20496a(this.f2256d).m20500f(new InterfaceC5581a() { // from class: androidx.camera.lifecycle.d
                public /* synthetic */ C0505d() {
                }

                @Override // p305y.InterfaceC5581a
                /* renamed from: a */
                public final InterfaceFutureC2565m mo1404a(Object obj) {
                    InterfaceFutureC2565m m2294h;
                    m2294h = C0493y.this.m2294h();
                    return m2294h;
                }
            }, C5493a.m20219a()), new a(aVar, c0493y), C5493a.m20219a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: k */
    private void m2389k(C0493y c0493y) {
        this.f2258f = c0493y;
    }

    /* renamed from: l */
    private void m2390l(Context context) {
        this.f2259g = context;
    }

    /* renamed from: d */
    InterfaceC0437k m2391d(InterfaceC0845l interfaceC0845l, C0469s c0469s, C0403e3 c0403e3, AbstractC0496y2... abstractC0496y2Arr) {
        InterfaceC5078t interfaceC5078t;
        InterfaceC5078t mo19699a;
        C0432l.m2119a();
        C0469s.a m2220c = C0469s.a.m2220c(c0469s);
        int length = abstractC0496y2Arr.length;
        int i10 = 0;
        while (true) {
            interfaceC5078t = null;
            if (i10 >= length) {
                break;
            }
            C0469s mo1380y = abstractC0496y2Arr[i10].m2305g().mo1380y(null);
            if (mo1380y != null) {
                Iterator<InterfaceC0461q> it = mo1380y.m2217c().iterator();
                while (it.hasNext()) {
                    m2220c.m2221a(it.next());
                }
            }
            i10++;
        }
        LinkedHashSet<InterfaceC5017d0> m2215a = m2220c.m2222b().m2215a(this.f2258f.m2292e().m19538a());
        if (!m2215a.isEmpty()) {
            LifecycleCamera m2372c = this.f2257e.m2372c(interfaceC0845l, C5937e.m21117u(m2215a));
            Collection<LifecycleCamera> m2373e = this.f2257e.m2373e();
            for (AbstractC0496y2 abstractC0496y2 : abstractC0496y2Arr) {
                for (LifecycleCamera lifecycleCamera : m2373e) {
                    if (lifecycleCamera.m2362o(abstractC0496y2) && lifecycleCamera != m2372c) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", abstractC0496y2));
                    }
                }
            }
            if (m2372c == null) {
                m2372c = this.f2257e.m2371b(interfaceC0845l, new C5937e(m2215a, this.f2258f.m2291d(), this.f2258f.m2293g()));
            }
            Iterator<InterfaceC0461q> it2 = c0469s.m2217c().iterator();
            while (it2.hasNext()) {
                InterfaceC0461q next = it2.next();
                if (next.mo2175a() != InterfaceC0461q.f2050a && (mo19699a = C5091x0.m19722a(next.mo2175a()).mo19699a(m2372c.m2356b(), this.f2259g)) != null) {
                    if (interfaceC5078t != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    interfaceC5078t = mo19699a;
                }
            }
            m2372c.m2357g(interfaceC5078t);
            if (abstractC0496y2Arr.length == 0) {
                return m2372c;
            }
            this.f2257e.m2370a(m2372c, c0403e3, Arrays.asList(abstractC0496y2Arr));
            return m2372c;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* renamed from: e */
    public InterfaceC0437k m2392e(InterfaceC0845l interfaceC0845l, C0469s c0469s, AbstractC0496y2... abstractC0496y2Arr) {
        return m2391d(interfaceC0845l, c0469s, null, abstractC0496y2Arr);
    }
}
