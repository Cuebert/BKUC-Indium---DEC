package androidx.camera.core;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.C0497z;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.utils.C0424d;
import androidx.concurrent.futures.C0541c;
import androidx.core.os.C0626e;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p279w.AbstractC5033h0;
import p279w.C5021e0;
import p279w.C5037i0;
import p279w.InterfaceC5005a0;
import p279w.InterfaceC5067p2;
import p279w.InterfaceC5096z;
import p305y.C5586f;

/* renamed from: androidx.camera.core.y */
/* loaded from: classes.dex */
public final class C0493y {

    /* renamed from: o */
    private static final Object f2169o = new Object();

    /* renamed from: p */
    private static final SparseArray<Integer> f2170p = new SparseArray<>();

    /* renamed from: c */
    private final C0497z f2173c;

    /* renamed from: d */
    private final Executor f2174d;

    /* renamed from: e */
    private final Handler f2175e;

    /* renamed from: f */
    private final HandlerThread f2176f;

    /* renamed from: g */
    private InterfaceC5005a0 f2177g;

    /* renamed from: h */
    private InterfaceC5096z f2178h;

    /* renamed from: i */
    private InterfaceC5067p2 f2179i;

    /* renamed from: j */
    private Context f2180j;

    /* renamed from: k */
    private final InterfaceFutureC2565m<Void> f2181k;

    /* renamed from: n */
    private final Integer f2184n;

    /* renamed from: a */
    final C5021e0 f2171a = new C5021e0();

    /* renamed from: b */
    private final Object f2172b = new Object();

    /* renamed from: l */
    private a f2182l = a.UNINITIALIZED;

    /* renamed from: m */
    private InterfaceFutureC2565m<Void> f2183m = C5586f.m20508h(null);

    /* renamed from: androidx.camera.core.y$a */
    /* loaded from: classes.dex */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C0493y(Context context, C0497z.b bVar) {
        if (bVar != null) {
            this.f2173c = bVar.getCameraXConfig();
        } else {
            C0497z.b m2282f = m2282f(context);
            if (m2282f != null) {
                this.f2173c = m2282f.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor m2324I = this.f2173c.m2324I(null);
        Handler m2327L = this.f2173c.m2327L(null);
        this.f2174d = m2324I == null ? new ExecutorC0453o() : m2324I;
        if (m2327L == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f2176f = handlerThread;
            handlerThread.start();
            this.f2175e = C0626e.m3346a(handlerThread.getLooper());
        } else {
            this.f2176f = null;
            this.f2175e = m2327L;
        }
        Integer num = (Integer) this.f2173c.mo1365a(C0497z.f2216F, null);
        this.f2184n = num;
        m2283i(num);
        this.f2181k = m2285k(context);
    }

    /* renamed from: f */
    private static C0497z.b m2282f(Context context) {
        ComponentCallbacks2 m2056b = C0424d.m2056b(context);
        if (m2056b instanceof C0497z.b) {
            return (C0497z.b) m2056b;
        }
        try {
            Context m2055a = C0424d.m2055a(context);
            Bundle bundle = m2055a.getPackageManager().getServiceInfo(new ComponentName(m2055a, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string == null) {
                C0463q1.m2204c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (C0497z.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            C0463q1.m2205d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e10);
            return null;
        }
    }

    /* renamed from: i */
    private static void m2283i(Integer num) {
        synchronized (f2169o) {
            if (num == null) {
                return;
            }
            C0654h.m3464c(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = f2170p;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            m2290p();
        }
    }

    /* renamed from: j */
    private void m2284j(Executor executor, long j10, Context context, C0541c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.w

            /* renamed from: o */
            public final /* synthetic */ Context f2130o;

            /* renamed from: p */
            public final /* synthetic */ Executor f2131p;

            /* renamed from: q */
            public final /* synthetic */ C0541c.a f2132q;

            /* renamed from: r */
            public final /* synthetic */ long f2133r;

            public /* synthetic */ RunnableC0485w(Context context2, Executor executor2, C0541c.a aVar2, long j102) {
                r2 = context2;
                r3 = executor2;
                r4 = aVar2;
                r5 = j102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0493y.this.m2287m(r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: k */
    private InterfaceFutureC2565m<Void> m2285k(Context context) {
        InterfaceFutureC2565m<Void> m2515a;
        synchronized (this.f2172b) {
            C0654h.m3470i(this.f2182l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f2182l = a.INITIALIZING;
            m2515a = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.core.v

                /* renamed from: b */
                public final /* synthetic */ Context f2121b;

                public /* synthetic */ C0481v(Context context2) {
                    r2 = context2;
                }

                @Override // androidx.concurrent.futures.C0541c.c
                /* renamed from: a */
                public final Object mo1498a(C0541c.a aVar) {
                    Object m2288n;
                    m2288n = C0493y.this.m2288n(r2, aVar);
                    return m2288n;
                }
            });
        }
        return m2515a;
    }

    /* renamed from: l */
    public /* synthetic */ void m2286l(Executor executor, long j10, C0541c.a aVar) {
        m2284j(executor, j10, this.f2180j, aVar);
    }

    /* renamed from: m */
    public /* synthetic */ void m2287m(Context context, Executor executor, C0541c.a aVar, long j10) {
        try {
            Application m2056b = C0424d.m2056b(context);
            this.f2180j = m2056b;
            if (m2056b == null) {
                this.f2180j = C0424d.m2055a(context);
            }
            InterfaceC5005a0.a m2325J = this.f2173c.m2325J(null);
            if (m2325J != null) {
                AbstractC5033h0 m19567a = AbstractC5033h0.m19567a(this.f2174d, this.f2175e);
                C0469s m2323H = this.f2173c.m2323H(null);
                this.f2177g = m2325J.mo17635a(this.f2180j, m19567a, m2323H);
                InterfaceC5096z.a m2326K = this.f2173c.m2326K(null);
                if (m2326K != null) {
                    this.f2178h = m2326K.mo17634a(this.f2180j, this.f2177g.mo1784b(), this.f2177g.mo1785c());
                    InterfaceC5067p2.c m2328M = this.f2173c.m2328M(null);
                    if (m2328M != null) {
                        this.f2179i = m2328M.mo17636a(this.f2180j);
                        if (executor instanceof ExecutorC0453o) {
                            ((ExecutorC0453o) executor).m2172c(this.f2177g);
                        }
                        this.f2171a.m19539b(this.f2177g);
                        C5037i0.m19572a(this.f2180j, this.f2171a, m2323H);
                        m2289o();
                        aVar.m2519c(null);
                        return;
                    }
                    throw new C0459p1(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new C0459p1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new C0459p1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (C0459p1 | RuntimeException | C5037i0.a e10) {
            if (SystemClock.elapsedRealtime() - j10 < 2500) {
                C0463q1.m2213l("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e10);
                C0626e.m3347b(this.f2175e, new Runnable() { // from class: androidx.camera.core.x

                    /* renamed from: o */
                    public final /* synthetic */ Executor f2139o;

                    /* renamed from: p */
                    public final /* synthetic */ long f2140p;

                    /* renamed from: q */
                    public final /* synthetic */ C0541c.a f2141q;

                    public /* synthetic */ RunnableC0489x(Executor executor2, long j102, C0541c.a aVar2) {
                        r2 = executor2;
                        r3 = j102;
                        r5 = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0493y.this.m2286l(r2, r3, r5);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f2172b) {
                this.f2182l = a.INITIALIZING_ERROR;
            }
            if (e10 instanceof C5037i0.a) {
                C0463q1.m2204c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar2.m2519c(null);
            } else if (e10 instanceof C0459p1) {
                aVar2.m2521f(e10);
            } else {
                aVar2.m2521f(new C0459p1(e10));
            }
        }
    }

    /* renamed from: n */
    public /* synthetic */ Object m2288n(Context context, C0541c.a aVar) throws Exception {
        m2284j(this.f2174d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* renamed from: o */
    private void m2289o() {
        synchronized (this.f2172b) {
            this.f2182l = a.INITIALIZED;
        }
    }

    /* renamed from: p */
    private static void m2290p() {
        SparseArray<Integer> sparseArray = f2170p;
        if (sparseArray.size() == 0) {
            C0463q1.m2209h();
            return;
        }
        if (sparseArray.get(3) != null) {
            C0463q1.m2210i(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            C0463q1.m2210i(4);
        } else if (sparseArray.get(5) != null) {
            C0463q1.m2210i(5);
        } else if (sparseArray.get(6) != null) {
            C0463q1.m2210i(6);
        }
    }

    /* renamed from: d */
    public InterfaceC5096z m2291d() {
        InterfaceC5096z interfaceC5096z = this.f2178h;
        if (interfaceC5096z != null) {
            return interfaceC5096z;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: e */
    public C5021e0 m2292e() {
        return this.f2171a;
    }

    /* renamed from: g */
    public InterfaceC5067p2 m2293g() {
        InterfaceC5067p2 interfaceC5067p2 = this.f2179i;
        if (interfaceC5067p2 != null) {
            return interfaceC5067p2;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: h */
    public InterfaceFutureC2565m<Void> m2294h() {
        return this.f2181k;
    }
}
