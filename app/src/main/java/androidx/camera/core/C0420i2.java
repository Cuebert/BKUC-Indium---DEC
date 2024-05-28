package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.concurrent.ScheduledExecutorService;
import p279w.AbstractC5032h;
import p279w.AbstractC5073r0;
import p279w.C5027f2;
import p279w.InterfaceC5034h1;
import p279w.InterfaceC5049l0;
import p279w.InterfaceC5053m0;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.i2 */
/* loaded from: classes.dex */
public final class C0420i2 extends AbstractC5073r0 {

    /* renamed from: m */
    final Object f1910m;

    /* renamed from: n */
    private final InterfaceC5034h1.a f1911n;

    /* renamed from: o */
    boolean f1912o;

    /* renamed from: p */
    private final Size f1913p;

    /* renamed from: q */
    final C0475t1 f1914q;

    /* renamed from: r */
    final Surface f1915r;

    /* renamed from: s */
    private final Handler f1916s;

    /* renamed from: t */
    final InterfaceC5053m0 f1917t;

    /* renamed from: u */
    final InterfaceC5049l0 f1918u;

    /* renamed from: v */
    private final AbstractC5032h f1919v;

    /* renamed from: w */
    private final AbstractC5073r0 f1920w;

    /* renamed from: x */
    private String f1921x;

    /* renamed from: androidx.camera.core.i2$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5583c<Surface> {
        a() {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            C0463q1.m2205d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            synchronized (C0420i2.this.f1910m) {
                C0420i2.this.f1918u.mo2025c(surface, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0420i2(int i10, int i11, int i12, Handler handler, InterfaceC5053m0 interfaceC5053m0, InterfaceC5049l0 interfaceC5049l0, AbstractC5073r0 abstractC5073r0, String str) {
        super(new Size(i10, i11), i12);
        this.f1910m = new Object();
        InterfaceC5034h1.a aVar = new InterfaceC5034h1.a() { // from class: androidx.camera.core.h2
            @Override // p279w.InterfaceC5034h1.a
            /* renamed from: a */
            public final void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
                C0420i2.this.m2040t(interfaceC5034h1);
            }
        };
        this.f1911n = aVar;
        this.f1912o = false;
        Size size = new Size(i10, i11);
        this.f1913p = size;
        if (handler != null) {
            this.f1916s = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.f1916s = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService m20223e = C5493a.m20223e(this.f1916s);
        C0475t1 c0475t1 = new C0475t1(i10, i11, i12, 2);
        this.f1914q = c0475t1;
        c0475t1.mo1873e(aVar, m20223e);
        this.f1915r = c0475t1.mo1870a();
        this.f1919v = c0475t1.m2243o();
        this.f1918u = interfaceC5049l0;
        interfaceC5049l0.mo2024b(size);
        this.f1917t = interfaceC5053m0;
        this.f1920w = abstractC5073r0;
        this.f1921x = str;
        C5586f.m20502b(abstractC5073r0.m19681h(), new a(), C5493a.m20219a());
        m19682i().mo2501b(new Runnable() { // from class: androidx.camera.core.g2
            @Override // java.lang.Runnable
            public final void run() {
                C0420i2.this.m2041u();
            }
        }, C5493a.m20219a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m2040t(InterfaceC5034h1 interfaceC5034h1) {
        synchronized (this.f1910m) {
            m2044s(interfaceC5034h1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m2041u() {
        synchronized (this.f1910m) {
            if (this.f1912o) {
                return;
            }
            this.f1914q.close();
            this.f1915r.release();
            this.f1920w.m19676c();
            this.f1912o = true;
        }
    }

    @Override // p279w.AbstractC5073r0
    /* renamed from: n */
    public InterfaceFutureC2565m<Surface> mo2042n() {
        InterfaceFutureC2565m<Surface> m20508h;
        synchronized (this.f1910m) {
            m20508h = C5586f.m20508h(this.f1915r);
        }
        return m20508h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public AbstractC5032h m2043r() {
        AbstractC5032h abstractC5032h;
        synchronized (this.f1910m) {
            if (!this.f1912o) {
                abstractC5032h = this.f1919v;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return abstractC5032h;
    }

    /* renamed from: s */
    void m2044s(InterfaceC5034h1 interfaceC5034h1) {
        if (this.f1912o) {
            return;
        }
        InterfaceC0443l1 interfaceC0443l1 = null;
        try {
            interfaceC0443l1 = interfaceC5034h1.mo1877i();
        } catch (IllegalStateException e10) {
            C0463q1.m2205d("ProcessingSurfaceTextur", "Failed to acquire next image.", e10);
        }
        if (interfaceC0443l1 == null) {
            return;
        }
        InterfaceC0419i1 mo1857q = interfaceC0443l1.mo1857q();
        if (mo1857q == null) {
            interfaceC0443l1.close();
            return;
        }
        Integer num = (Integer) mo1857q.mo2028a().m19578c(this.f1921x);
        if (num == null) {
            interfaceC0443l1.close();
            return;
        }
        if (this.f1917t.mo19607b() != num.intValue()) {
            C0463q1.m2212k("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
            interfaceC0443l1.close();
            return;
        }
        C5027f2 c5027f2 = new C5027f2(interfaceC0443l1, this.f1921x);
        this.f1918u.mo2023a(c5027f2);
        c5027f2.m19551c();
    }
}
