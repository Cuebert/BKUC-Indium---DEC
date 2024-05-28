package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0492x2;
import androidx.camera.view.AbstractC0524k;
import androidx.concurrent.futures.C0541c;
import androidx.core.content.C0587a;
import androidx.core.util.C0654h;
import androidx.core.util.InterfaceC0647a;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.x */
/* loaded from: classes.dex */
public final class C0537x extends AbstractC0524k {

    /* renamed from: e */
    TextureView f2364e;

    /* renamed from: f */
    SurfaceTexture f2365f;

    /* renamed from: g */
    InterfaceFutureC2565m<C0492x2.f> f2366g;

    /* renamed from: h */
    C0492x2 f2367h;

    /* renamed from: i */
    boolean f2368i;

    /* renamed from: j */
    SurfaceTexture f2369j;

    /* renamed from: k */
    AtomicReference<C0541c.a<Void>> f2370k;

    /* renamed from: l */
    AbstractC0524k.a f2371l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.x$a */
    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C6034a implements InterfaceC5583c<C0492x2.f> {

            /* renamed from: a */
            final /* synthetic */ SurfaceTexture f2373a;

            C6034a(SurfaceTexture surfaceTexture) {
                this.f2373a = surfaceTexture;
            }

            @Override // p305y.InterfaceC5583c
            /* renamed from: a */
            public void mo1361a(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            @Override // p305y.InterfaceC5583c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(C0492x2.f fVar) {
                C0654h.m3470i(fVar.mo2033a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C0463q1.m2202a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f2373a.release();
                C0537x c0537x = C0537x.this;
                if (c0537x.f2369j != null) {
                    c0537x.f2369j = null;
                }
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C0463q1.m2202a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            C0537x c0537x = C0537x.this;
            c0537x.f2365f = surfaceTexture;
            if (c0537x.f2366g != null) {
                C0654h.m3467f(c0537x.f2367h);
                C0463q1.m2202a("TextureViewImpl", "Surface invalidated " + C0537x.this.f2367h);
                C0537x.this.f2367h.m2266k().m19676c();
                return;
            }
            c0537x.m2481u();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C0537x c0537x = C0537x.this;
            c0537x.f2365f = null;
            InterfaceFutureC2565m<C0492x2.f> interfaceFutureC2565m = c0537x.f2366g;
            if (interfaceFutureC2565m != null) {
                C5586f.m20502b(interfaceFutureC2565m, new C6034a(surfaceTexture), C0587a.m3032f(C0537x.this.f2364e.getContext()));
                C0537x.this.f2369j = surfaceTexture;
                return false;
            }
            C0463q1.m2202a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C0463q1.m2202a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C0541c.a<Void> andSet = C0537x.this.f2370k.getAndSet(null);
            if (andSet != null) {
                andSet.m2519c(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0537x(FrameLayout frameLayout, C0519f c0519f) {
        super(frameLayout, c0519f);
        this.f2368i = false;
        this.f2370k = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m2474o(C0492x2 c0492x2) {
        C0492x2 c0492x22 = this.f2367h;
        if (c0492x22 != null && c0492x22 == c0492x2) {
            this.f2367h = null;
            this.f2366g = null;
        }
        m2478s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m2475p(Surface surface, final C0541c.a aVar) throws Exception {
        C0463q1.m2202a("TextureViewImpl", "Surface set on Preview.");
        C0492x2 c0492x2 = this.f2367h;
        Executor m20219a = C5493a.m20219a();
        Objects.requireNonNull(aVar);
        c0492x2.m2269v(surface, m20219a, new InterfaceC0647a() { // from class: androidx.camera.view.u
            @Override // androidx.core.util.InterfaceC0647a
            /* renamed from: a */
            public final void mo2469a(Object obj) {
                C0541c.a.this.m2519c((C0492x2.f) obj);
            }
        });
        return "provideSurface[request=" + this.f2367h + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m2476q(Surface surface, InterfaceFutureC2565m interfaceFutureC2565m, C0492x2 c0492x2) {
        C0463q1.m2202a("TextureViewImpl", "Safe to release surface.");
        m2478s();
        surface.release();
        if (this.f2366g == interfaceFutureC2565m) {
            this.f2366g = null;
        }
        if (this.f2367h == c0492x2) {
            this.f2367h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m2477r(C0541c.a aVar) throws Exception {
        this.f2370k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    /* renamed from: s */
    private void m2478s() {
        AbstractC0524k.a aVar = this.f2371l;
        if (aVar != null) {
            aVar.mo2444a();
            this.f2371l = null;
        }
    }

    /* renamed from: t */
    private void m2479t() {
        if (!this.f2368i || this.f2369j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f2364e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f2369j;
        if (surfaceTexture != surfaceTexture2) {
            this.f2364e.setSurfaceTexture(surfaceTexture2);
            this.f2369j = null;
            this.f2368i = false;
        }
    }

    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: b */
    View mo2446b() {
        return this.f2364e;
    }

    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: c */
    Bitmap mo2447c() {
        TextureView textureView = this.f2364e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f2364e.getBitmap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: d */
    public void mo2448d() {
        m2479t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: e */
    public void mo2449e() {
        this.f2368i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: g */
    public void mo2451g(final C0492x2 c0492x2, AbstractC0524k.a aVar) {
        this.f2331a = c0492x2.m2267l();
        this.f2371l = aVar;
        m2480n();
        C0492x2 c0492x22 = this.f2367h;
        if (c0492x22 != null) {
            c0492x22.m2272y();
        }
        this.f2367h = c0492x2;
        c0492x2.m2264i(C0587a.m3032f(this.f2364e.getContext()), new Runnable() { // from class: androidx.camera.view.w
            @Override // java.lang.Runnable
            public final void run() {
                C0537x.this.m2474o(c0492x2);
            }
        });
        m2481u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: i */
    public InterfaceFutureC2565m<Void> mo2453i() {
        return C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.view.s
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m2477r;
                m2477r = C0537x.this.m2477r(aVar);
                return m2477r;
            }
        });
    }

    /* renamed from: n */
    public void m2480n() {
        C0654h.m3467f(this.f2332b);
        C0654h.m3467f(this.f2331a);
        TextureView textureView = new TextureView(this.f2332b.getContext());
        this.f2364e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f2331a.getWidth(), this.f2331a.getHeight()));
        this.f2364e.setSurfaceTextureListener(new a());
        this.f2332b.removeAllViews();
        this.f2332b.addView(this.f2364e);
    }

    /* renamed from: u */
    void m2481u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f2331a;
        if (size == null || (surfaceTexture = this.f2365f) == null || this.f2367h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f2331a.getHeight());
        final Surface surface = new Surface(this.f2365f);
        final C0492x2 c0492x2 = this.f2367h;
        final InterfaceFutureC2565m<C0492x2.f> m2515a = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.view.t
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m2475p;
                m2475p = C0537x.this.m2475p(surface, aVar);
                return m2475p;
            }
        });
        this.f2366g = m2515a;
        m2515a.mo2501b(new Runnable() { // from class: androidx.camera.view.v
            @Override // java.lang.Runnable
            public final void run() {
                C0537x.this.m2476q(surface, m2515a, c0492x2);
            }
        }, C0587a.m3032f(this.f2364e.getContext()));
        m2450f();
    }
}
