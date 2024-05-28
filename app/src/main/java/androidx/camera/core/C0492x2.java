package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0492x2;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import androidx.core.util.InterfaceC0647a;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p279w.AbstractC5073r0;
import p279w.InterfaceC5017d0;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* renamed from: androidx.camera.core.x2 */
/* loaded from: classes.dex */
public final class C0492x2 {

    /* renamed from: a */
    private final Object f2146a = new Object();

    /* renamed from: b */
    private final Size f2147b;

    /* renamed from: c */
    private final boolean f2148c;

    /* renamed from: d */
    private final InterfaceC5017d0 f2149d;

    /* renamed from: e */
    final InterfaceFutureC2565m<Surface> f2150e;

    /* renamed from: f */
    private final C0541c.a<Surface> f2151f;

    /* renamed from: g */
    private final InterfaceFutureC2565m<Void> f2152g;

    /* renamed from: h */
    private final C0541c.a<Void> f2153h;

    /* renamed from: i */
    private final AbstractC5073r0 f2154i;

    /* renamed from: j */
    private g f2155j;

    /* renamed from: k */
    private h f2156k;

    /* renamed from: l */
    private Executor f2157l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.x2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f2158a;

        /* renamed from: b */
        final /* synthetic */ InterfaceFutureC2565m f2159b;

        a(C0541c.a aVar, InterfaceFutureC2565m interfaceFutureC2565m) {
            this.f2158a = aVar;
            this.f2159b = interfaceFutureC2565m;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            if (th instanceof e) {
                C0654h.m3469h(this.f2159b.cancel(false));
            } else {
                C0654h.m3469h(this.f2158a.m2519c(null));
            }
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r22) {
            C0654h.m3469h(this.f2158a.m2519c(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.x2$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC5073r0 {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // p279w.AbstractC5073r0
        /* renamed from: n */
        protected InterfaceFutureC2565m<Surface> mo2042n() {
            return C0492x2.this.f2150e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.x2$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC5583c<Surface> {

        /* renamed from: a */
        final /* synthetic */ InterfaceFutureC2565m f2162a;

        /* renamed from: b */
        final /* synthetic */ C0541c.a f2163b;

        /* renamed from: c */
        final /* synthetic */ String f2164c;

        c(InterfaceFutureC2565m interfaceFutureC2565m, C0541c.a aVar, String str) {
            this.f2162a = interfaceFutureC2565m;
            this.f2163b = aVar;
            this.f2164c = str;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            if (th instanceof CancellationException) {
                C0654h.m3469h(this.f2163b.m2521f(new e(this.f2164c + " cancelled.", th)));
                return;
            }
            this.f2163b.m2519c(null);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Surface surface) {
            C5586f.m20511k(this.f2162a, this.f2163b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.x2$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0647a f2166a;

        /* renamed from: b */
        final /* synthetic */ Surface f2167b;

        d(InterfaceC0647a interfaceC0647a, Surface surface) {
            this.f2166a = interfaceC0647a;
            this.f2167b = surface;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            C0654h.m3470i(th instanceof e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f2166a.mo2469a(f.m2276c(1, this.f2167b));
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r32) {
            this.f2166a.mo2469a(f.m2276c(0, this.f2167b));
        }
    }

    /* renamed from: androidx.camera.core.x2$e */
    /* loaded from: classes.dex */
    private static final class e extends RuntimeException {
        e(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: androidx.camera.core.x2$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        /* renamed from: c */
        static f m2276c(int i10, Surface surface) {
            return new C0417i(i10, surface);
        }

        /* renamed from: a */
        public abstract int mo2033a();

        /* renamed from: b */
        public abstract Surface mo2034b();
    }

    /* renamed from: androidx.camera.core.x2$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        /* renamed from: d */
        public static g m2277d(Rect rect, int i10, int i11) {
            return new C0433j(rect, i10, i11);
        }

        /* renamed from: a */
        public abstract Rect mo2121a();

        /* renamed from: b */
        public abstract int mo2122b();

        /* renamed from: c */
        public abstract int mo2123c();
    }

    /* renamed from: androidx.camera.core.x2$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        void mo2278a(g gVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.core.q2.<init>(java.util.concurrent.atomic.AtomicReference, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public C0492x2(android.util.Size r6, p279w.InterfaceC5017d0 r7, boolean r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f2146a = r0
            r5.f2147b = r6
            r5.f2149d = r7
            r5.f2148c = r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SurfaceRequest[size: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = ", id: "
            r7.append(r8)
            int r8 = r5.hashCode()
            r7.append(r8)
            java.lang.String r8 = "]"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r8.<init>(r0)
            androidx.camera.core.q2 r1 = new androidx.camera.core.q2
            r1.<init>()
            com.google.common.util.concurrent.m r1 = androidx.concurrent.futures.C0541c.m2515a(r1)
            java.lang.Object r8 = r8.get()
            androidx.concurrent.futures.c$a r8 = (androidx.concurrent.futures.C0541c.a) r8
            java.lang.Object r8 = androidx.core.util.C0654h.m3467f(r8)
            androidx.concurrent.futures.c$a r8 = (androidx.concurrent.futures.C0541c.a) r8
            r5.f2153h = r8
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>(r0)
            androidx.camera.core.r2 r3 = new androidx.camera.core.r2
            r3.<init>()
            com.google.common.util.concurrent.m r3 = androidx.concurrent.futures.C0541c.m2515a(r3)
            r5.f2152g = r3
            androidx.camera.core.x2$a r4 = new androidx.camera.core.x2$a
            r4.<init>(r8, r1)
            java.util.concurrent.Executor r8 = p292x.C5493a.m20219a()
            p305y.C5586f.m20502b(r3, r4, r8)
            java.lang.Object r8 = r2.get()
            androidx.concurrent.futures.c$a r8 = (androidx.concurrent.futures.C0541c.a) r8
            java.lang.Object r8 = androidx.core.util.C0654h.m3467f(r8)
            androidx.concurrent.futures.c$a r8 = (androidx.concurrent.futures.C0541c.a) r8
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r0)
            androidx.camera.core.p2 r0 = new androidx.camera.core.p2
            r0.<init>()
            com.google.common.util.concurrent.m r0 = androidx.concurrent.futures.C0541c.m2515a(r0)
            r5.f2150e = r0
            java.lang.Object r1 = r1.get()
            androidx.concurrent.futures.c$a r1 = (androidx.concurrent.futures.C0541c.a) r1
            java.lang.Object r1 = androidx.core.util.C0654h.m3467f(r1)
            androidx.concurrent.futures.c$a r1 = (androidx.concurrent.futures.C0541c.a) r1
            r5.f2151f = r1
            androidx.camera.core.x2$b r1 = new androidx.camera.core.x2$b
            r2 = 34
            r1.<init>(r6, r2)
            r5.f2154i = r1
            com.google.common.util.concurrent.m r6 = r1.m19682i()
            androidx.camera.core.x2$c r1 = new androidx.camera.core.x2$c
            r1.<init>(r6, r8, r7)
            java.util.concurrent.Executor r7 = p292x.C5493a.m20219a()
            p305y.C5586f.m20502b(r0, r1, r7)
            androidx.camera.core.u2 r7 = new androidx.camera.core.u2
            r7.<init>()
            java.util.concurrent.Executor r8 = p292x.C5493a.m20219a()
            r6.mo2501b(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0492x2.<init>(android.util.Size, w.d0, boolean):void");
    }

    /* renamed from: n */
    public static /* synthetic */ Object m2256n(AtomicReference atomicReference, String str, C0541c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* renamed from: o */
    public static /* synthetic */ Object m2257o(AtomicReference atomicReference, String str, C0541c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* renamed from: p */
    public static /* synthetic */ Object m2258p(AtomicReference atomicReference, String str, C0541c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* renamed from: q */
    public /* synthetic */ void m2259q() {
        this.f2150e.cancel(true);
    }

    /* renamed from: r */
    public static /* synthetic */ void m2260r(InterfaceC0647a interfaceC0647a, Surface surface) {
        interfaceC0647a.mo2469a(f.m2276c(3, surface));
    }

    /* renamed from: s */
    public static /* synthetic */ void m2261s(InterfaceC0647a interfaceC0647a, Surface surface) {
        interfaceC0647a.mo2469a(f.m2276c(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    /* renamed from: i */
    public void m2264i(Executor executor, Runnable runnable) {
        this.f2153h.m2517a(runnable, executor);
    }

    /* renamed from: j */
    public InterfaceC5017d0 m2265j() {
        return this.f2149d;
    }

    /* renamed from: k */
    public AbstractC5073r0 m2266k() {
        return this.f2154i;
    }

    /* renamed from: l */
    public Size m2267l() {
        return this.f2147b;
    }

    /* renamed from: m */
    public boolean m2268m() {
        return this.f2148c;
    }

    /* renamed from: v */
    public void m2269v(Surface surface, Executor executor, InterfaceC0647a<f> interfaceC0647a) {
        if (!this.f2151f.m2519c(surface) && !this.f2150e.isCancelled()) {
            C0654h.m3469h(this.f2150e.isDone());
            try {
                this.f2150e.get();
                executor.execute(new Runnable() { // from class: androidx.camera.core.v2

                    /* renamed from: o */
                    public final /* synthetic */ Surface f2128o;

                    public /* synthetic */ RunnableC0484v2(Surface surface2) {
                        r2 = surface2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0492x2.m2260r(InterfaceC0647a.this, r2);
                    }
                });
                return;
            } catch (InterruptedException | ExecutionException unused) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.w2

                    /* renamed from: o */
                    public final /* synthetic */ Surface f2137o;

                    public /* synthetic */ RunnableC0488w2(Surface surface2) {
                        r2 = surface2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0492x2.m2261s(InterfaceC0647a.this, r2);
                    }
                });
                return;
            }
        }
        C5586f.m20502b(this.f2152g, new d(interfaceC0647a, surface2), executor);
    }

    /* renamed from: w */
    public void m2270w(Executor executor, h hVar) {
        g gVar;
        synchronized (this.f2146a) {
            this.f2156k = hVar;
            this.f2157l = executor;
            gVar = this.f2155j;
        }
        if (gVar != null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.s2

                /* renamed from: o */
                public final /* synthetic */ C0492x2.g f2093o;

                public /* synthetic */ RunnableC0472s2(C0492x2.g gVar2) {
                    r2 = gVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0492x2.h.this.mo2278a(r2);
                }
            });
        }
    }

    /* renamed from: x */
    public void m2271x(g gVar) {
        h hVar;
        Executor executor;
        synchronized (this.f2146a) {
            this.f2155j = gVar;
            hVar = this.f2156k;
            executor = this.f2157l;
        }
        if (hVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.core.t2

            /* renamed from: o */
            public final /* synthetic */ C0492x2.g f2115o;

            public /* synthetic */ RunnableC0476t2(C0492x2.g gVar2) {
                r2 = gVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0492x2.h.this.mo2278a(r2);
            }
        });
    }

    /* renamed from: y */
    public boolean m2272y() {
        return this.f2151f.m2521f(new AbstractC5073r0.b("Surface request will not complete."));
    }
}
