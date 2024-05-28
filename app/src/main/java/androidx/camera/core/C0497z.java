package androidx.camera.core;

import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.C5098z1;
import p279w.InterfaceC5005a0;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5066p1;
import p279w.InterfaceC5067p2;
import p279w.InterfaceC5096z;
import p318z.C5940h;
import p318z.InterfaceC5941i;

/* renamed from: androidx.camera.core.z */
/* loaded from: classes.dex */
public final class C0497z implements InterfaceC5941i<C0493y> {

    /* renamed from: A */
    static final InterfaceC5061o0.a<InterfaceC5005a0.a> f2211A = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC5005a0.a.class);

    /* renamed from: B */
    static final InterfaceC5061o0.a<InterfaceC5096z.a> f2212B = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC5096z.a.class);

    /* renamed from: C */
    static final InterfaceC5061o0.a<InterfaceC5067p2.c> f2213C = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC5067p2.c.class);

    /* renamed from: D */
    static final InterfaceC5061o0.a<Executor> f2214D = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: E */
    static final InterfaceC5061o0.a<Handler> f2215E = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: F */
    static final InterfaceC5061o0.a<Integer> f2216F = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: G */
    static final InterfaceC5061o0.a<C0469s> f2217G = InterfaceC5061o0.a.m19653a("camerax.core.appConfig.availableCamerasLimiter", C0469s.class);

    /* renamed from: z */
    private final C5083u1 f2218z;

    /* renamed from: androidx.camera.core.z$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C5070q1 f2219a;

        public a() {
            this(C5070q1.m19660L());
        }

        /* renamed from: b */
        private InterfaceC5066p1 m2329b() {
            return this.f2219a;
        }

        /* renamed from: a */
        public C0497z m2330a() {
            return new C0497z(C5083u1.m19702J(this.f2219a));
        }

        /* renamed from: c */
        public a m2331c(InterfaceC5005a0.a aVar) {
            m2329b().mo19659g(C0497z.f2211A, aVar);
            return this;
        }

        /* renamed from: d */
        public a m2332d(InterfaceC5096z.a aVar) {
            m2329b().mo19659g(C0497z.f2212B, aVar);
            return this;
        }

        /* renamed from: e */
        public a m2333e(Class<C0493y> cls) {
            m2329b().mo19659g(InterfaceC5941i.f21845w, cls);
            if (m2329b().mo1365a(InterfaceC5941i.f21844v, null) == null) {
                m2334f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public a m2334f(String str) {
            m2329b().mo19659g(InterfaceC5941i.f21844v, str);
            return this;
        }

        /* renamed from: g */
        public a m2335g(InterfaceC5067p2.c cVar) {
            m2329b().mo19659g(C0497z.f2213C, cVar);
            return this;
        }

        private a(C5070q1 c5070q1) {
            this.f2219a = c5070q1;
            Class cls = (Class) c5070q1.mo1365a(InterfaceC5941i.f21845w, null);
            if (cls != null && !cls.equals(C0493y.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m2333e(C0493y.class);
        }
    }

    /* renamed from: androidx.camera.core.z$b */
    /* loaded from: classes.dex */
    public interface b {
        C0497z getCameraXConfig();
    }

    C0497z(C5083u1 c5083u1) {
        this.f2218z = c5083u1;
    }

    @Override // p318z.InterfaceC5941i
    /* renamed from: B */
    public /* synthetic */ String mo1363B(String str) {
        return C5940h.m21132a(this, str);
    }

    /* renamed from: H */
    public C0469s m2323H(C0469s c0469s) {
        return (C0469s) this.f2218z.mo1365a(f2217G, c0469s);
    }

    /* renamed from: I */
    public Executor m2324I(Executor executor) {
        return (Executor) this.f2218z.mo1365a(f2214D, executor);
    }

    /* renamed from: J */
    public InterfaceC5005a0.a m2325J(InterfaceC5005a0.a aVar) {
        return (InterfaceC5005a0.a) this.f2218z.mo1365a(f2211A, aVar);
    }

    /* renamed from: K */
    public InterfaceC5096z.a m2326K(InterfaceC5096z.a aVar) {
        return (InterfaceC5096z.a) this.f2218z.mo1365a(f2212B, aVar);
    }

    /* renamed from: L */
    public Handler m2327L(Handler handler) {
        return (Handler) this.f2218z.mo1365a(f2215E, handler);
    }

    /* renamed from: M */
    public InterfaceC5067p2.c m2328M(InterfaceC5067p2.c cVar) {
        return (InterfaceC5067p2.c) this.f2218z.mo1365a(f2213C, cVar);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: a */
    public /* synthetic */ Object mo1365a(InterfaceC5061o0.a aVar, Object obj) {
        return C5098z1.m19739g(this, aVar, obj);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: b */
    public /* synthetic */ Object mo1366b(InterfaceC5061o0.a aVar) {
        return C5098z1.m19738f(this, aVar);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: c */
    public /* synthetic */ Set mo1367c() {
        return C5098z1.m19737e(this);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: d */
    public /* synthetic */ InterfaceC5061o0.c mo1368d(InterfaceC5061o0.a aVar) {
        return C5098z1.m19735c(this, aVar);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: e */
    public /* synthetic */ boolean mo1369e(InterfaceC5061o0.a aVar) {
        return C5098z1.m19733a(this, aVar);
    }

    @Override // p279w.InterfaceC5007a2
    /* renamed from: o */
    public InterfaceC5061o0 mo1373o() {
        return this.f2218z;
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: t */
    public /* synthetic */ Object mo1376t(InterfaceC5061o0.a aVar, InterfaceC5061o0.c cVar) {
        return C5098z1.m19740h(this, aVar, cVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: v */
    public /* synthetic */ void mo1377v(String str, InterfaceC5061o0.b bVar) {
        C5098z1.m19734b(this, str, bVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: x */
    public /* synthetic */ Set mo1379x(InterfaceC5061o0.a aVar) {
        return C5098z1.m19736d(this, aVar);
    }
}
