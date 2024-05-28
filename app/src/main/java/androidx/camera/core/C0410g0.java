package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p169n.InterfaceC4005a;
import p279w.InterfaceC5030g1;
import p279w.InterfaceC5034h1;
import p279w.InterfaceC5049l0;
import p292x.C5493a;
import p305y.C5586f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.g0 */
/* loaded from: classes.dex */
public class C0410g0 implements InterfaceC5049l0 {

    /* renamed from: a */
    private final InterfaceC5049l0 f1885a;

    /* renamed from: b */
    private final InterfaceC5049l0 f1886b;

    /* renamed from: c */
    private final InterfaceFutureC2565m<List<Void>> f1887c;

    /* renamed from: d */
    final Executor f1888d;

    /* renamed from: e */
    private final int f1889e;

    /* renamed from: f */
    private InterfaceC5034h1 f1890f = null;

    /* renamed from: g */
    private InterfaceC0419i1 f1891g = null;

    /* renamed from: h */
    private final Object f1892h = new Object();

    /* renamed from: i */
    private boolean f1893i = false;

    /* renamed from: j */
    private boolean f1894j = false;

    /* renamed from: k */
    C0541c.a<Void> f1895k;

    /* renamed from: l */
    private InterfaceFutureC2565m<Void> f1896l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0410g0(InterfaceC5049l0 interfaceC5049l0, int i10, InterfaceC5049l0 interfaceC5049l02, Executor executor) {
        this.f1885a = interfaceC5049l0;
        this.f1886b = interfaceC5049l02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC5049l0.mo2026d());
        arrayList.add(interfaceC5049l02.mo2026d());
        this.f1887c = C5586f.m20503c(arrayList);
        this.f1888d = executor;
        this.f1889e = i10;
    }

    /* renamed from: j */
    private void m2017j() {
        boolean z10;
        boolean z11;
        final C0541c.a<Void> aVar;
        synchronized (this.f1892h) {
            z10 = this.f1893i;
            z11 = this.f1894j;
            aVar = this.f1895k;
            if (z10 && !z11) {
                this.f1890f.close();
            }
        }
        if (!z10 || z11 || aVar == null) {
            return;
        }
        this.f1887c.mo2501b(new Runnable() { // from class: androidx.camera.core.d0
            @Override // java.lang.Runnable
            public final void run() {
                C0541c.a.this.m2519c(null);
            }
        }, C5493a.m20219a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Void m2019l(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m2020m(C0541c.a aVar) throws Exception {
        synchronized (this.f1892h) {
            this.f1895k = aVar;
        }
        return "CaptureProcessorPipeline-close";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m2022o(InterfaceC5034h1 interfaceC5034h1) {
        final InterfaceC0443l1 mo1877i = interfaceC5034h1.mo1877i();
        try {
            this.f1888d.execute(new Runnable() { // from class: androidx.camera.core.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C0410g0.this.m2021n(mo1877i);
                }
            });
        } catch (RejectedExecutionException unused) {
            C0463q1.m2204c("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            mo1877i.close();
        }
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: a */
    public void mo2023a(InterfaceC5030g1 interfaceC5030g1) {
        synchronized (this.f1892h) {
            if (this.f1893i) {
                return;
            }
            this.f1894j = true;
            InterfaceFutureC2565m<InterfaceC0443l1> mo2164a = interfaceC5030g1.mo2164a(interfaceC5030g1.mo2165b().get(0).intValue());
            C0654h.m3462a(mo2164a.isDone());
            try {
                this.f1891g = mo2164a.get().mo1857q();
                this.f1885a.mo2023a(interfaceC5030g1);
            } catch (InterruptedException | ExecutionException unused) {
                throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
            }
        }
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: b */
    public void mo2024b(Size size) {
        C0394d c0394d = new C0394d(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f1889e));
        this.f1890f = c0394d;
        this.f1885a.mo2025c(c0394d.mo1870a(), 35);
        this.f1885a.mo2024b(size);
        this.f1886b.mo2024b(size);
        this.f1890f.mo1873e(new InterfaceC5034h1.a() { // from class: androidx.camera.core.f0
            @Override // p279w.InterfaceC5034h1.a
            /* renamed from: a */
            public final void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
                C0410g0.this.m2022o(interfaceC5034h1);
            }
        }, C5493a.m20219a());
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: c */
    public void mo2025c(Surface surface, int i10) {
        this.f1886b.mo2025c(surface, i10);
    }

    @Override // p279w.InterfaceC5049l0
    public void close() {
        synchronized (this.f1892h) {
            if (this.f1893i) {
                return;
            }
            this.f1893i = true;
            this.f1885a.close();
            this.f1886b.close();
            m2017j();
        }
    }

    @Override // p279w.InterfaceC5049l0
    /* renamed from: d */
    public InterfaceFutureC2565m<Void> mo2026d() {
        InterfaceFutureC2565m<Void> m20510j;
        synchronized (this.f1892h) {
            if (this.f1893i && !this.f1894j) {
                m20510j = C5586f.m20515o(this.f1887c, new InterfaceC4005a() { // from class: androidx.camera.core.e0
                    @Override // p169n.InterfaceC4005a
                    /* renamed from: a */
                    public final Object mo1403a(Object obj) {
                        Void m2019l;
                        m2019l = C0410g0.m2019l((List) obj);
                        return m2019l;
                    }
                }, C5493a.m20219a());
            } else {
                if (this.f1896l == null) {
                    this.f1896l = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.core.b0
                        @Override // androidx.concurrent.futures.C0541c.c
                        /* renamed from: a */
                        public final Object mo1498a(C0541c.a aVar) {
                            Object m2020m;
                            m2020m = C0410g0.this.m2020m(aVar);
                            return m2020m;
                        }
                    });
                }
                m20510j = C5586f.m20510j(this.f1896l);
            }
        }
        return m20510j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m2021n(InterfaceC0443l1 interfaceC0443l1) {
        boolean z10;
        synchronized (this.f1892h) {
            z10 = this.f1893i;
        }
        if (!z10) {
            Size size = new Size(interfaceC0443l1.mo1853g(), interfaceC0443l1.getHeight());
            C0654h.m3467f(this.f1891g);
            String next = this.f1891g.mo2028a().m19579d().iterator().next();
            int intValue = ((Integer) this.f1891g.mo2028a().m19578c(next)).intValue();
            C0448m2 c0448m2 = new C0448m2(interfaceC0443l1, size, this.f1891g);
            this.f1891g = null;
            C0452n2 c0452n2 = new C0452n2(Collections.singletonList(Integer.valueOf(intValue)), next);
            c0452n2.m2166c(c0448m2);
            try {
                this.f1886b.mo2023a(c0452n2);
            } catch (Exception e10) {
                C0463q1.m2204c("CaptureProcessorPipeline", "Post processing image failed! " + e10.getMessage());
            }
        }
        synchronized (this.f1892h) {
            this.f1894j = false;
        }
        m2017j();
    }
}
