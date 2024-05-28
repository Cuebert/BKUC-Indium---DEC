package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.AbstractC0418i0;
import java.util.concurrent.Executor;
import p279w.InterfaceC5034h1;

/* renamed from: androidx.camera.core.l2 */
/* loaded from: classes.dex */
public class C0444l2 implements InterfaceC5034h1 {

    /* renamed from: d */
    private final InterfaceC5034h1 f2003d;

    /* renamed from: e */
    private final Surface f2004e;

    /* renamed from: a */
    private final Object f2000a = new Object();

    /* renamed from: b */
    private int f2001b = 0;

    /* renamed from: c */
    private boolean f2002c = false;

    /* renamed from: f */
    private final AbstractC0418i0.a f2005f = new AbstractC0418i0.a() { // from class: androidx.camera.core.j2
        @Override // androidx.camera.core.AbstractC0418i0.a
        /* renamed from: b */
        public final void mo1997b(InterfaceC0443l1 interfaceC0443l1) {
            C0444l2.this.m2128k(interfaceC0443l1);
        }
    };

    public C0444l2(InterfaceC5034h1 interfaceC5034h1) {
        this.f2003d = interfaceC5034h1;
        this.f2004e = interfaceC5034h1.mo1870a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m2128k(InterfaceC0443l1 interfaceC0443l1) {
        synchronized (this.f2000a) {
            int i10 = this.f2001b - 1;
            this.f2001b = i10;
            if (this.f2002c && i10 == 0) {
                close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m2129l(InterfaceC5034h1.a aVar, InterfaceC5034h1 interfaceC5034h1) {
        aVar.mo1382a(this);
    }

    /* renamed from: n */
    private InterfaceC0443l1 m2130n(InterfaceC0443l1 interfaceC0443l1) {
        if (interfaceC0443l1 == null) {
            return null;
        }
        this.f2001b++;
        C0456o2 c0456o2 = new C0456o2(interfaceC0443l1);
        c0456o2.m2035b(this.f2005f);
        return c0456o2;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: a */
    public Surface mo1870a() {
        Surface mo1870a;
        synchronized (this.f2000a) {
            mo1870a = this.f2003d.mo1870a();
        }
        return mo1870a;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: c */
    public InterfaceC0443l1 mo1871c() {
        InterfaceC0443l1 m2130n;
        synchronized (this.f2000a) {
            m2130n = m2130n(this.f2003d.mo1871c());
        }
        return m2130n;
    }

    @Override // p279w.InterfaceC5034h1
    public void close() {
        synchronized (this.f2000a) {
            Surface surface = this.f2004e;
            if (surface != null) {
                surface.release();
            }
            this.f2003d.close();
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: d */
    public int mo1872d() {
        int mo1872d;
        synchronized (this.f2000a) {
            mo1872d = this.f2003d.mo1872d();
        }
        return mo1872d;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: e */
    public void mo1873e(final InterfaceC5034h1.a aVar, Executor executor) {
        synchronized (this.f2000a) {
            this.f2003d.mo1873e(new InterfaceC5034h1.a() { // from class: androidx.camera.core.k2
                @Override // p279w.InterfaceC5034h1.a
                /* renamed from: a */
                public final void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
                    C0444l2.this.m2129l(aVar, interfaceC5034h1);
                }
            }, executor);
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: f */
    public void mo1874f() {
        synchronized (this.f2000a) {
            this.f2003d.mo1874f();
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: g */
    public int mo1875g() {
        int mo1875g;
        synchronized (this.f2000a) {
            mo1875g = this.f2003d.mo1875g();
        }
        return mo1875g;
    }

    @Override // p279w.InterfaceC5034h1
    public int getHeight() {
        int height;
        synchronized (this.f2000a) {
            height = this.f2003d.getHeight();
        }
        return height;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: h */
    public int mo1876h() {
        int mo1876h;
        synchronized (this.f2000a) {
            mo1876h = this.f2003d.mo1876h();
        }
        return mo1876h;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: i */
    public InterfaceC0443l1 mo1877i() {
        InterfaceC0443l1 m2130n;
        synchronized (this.f2000a) {
            m2130n = m2130n(this.f2003d.mo1877i());
        }
        return m2130n;
    }

    /* renamed from: m */
    public void m2131m() {
        synchronized (this.f2000a) {
            this.f2002c = true;
            this.f2003d.mo1874f();
            if (this.f2001b == 0) {
                close();
            }
        }
    }
}
