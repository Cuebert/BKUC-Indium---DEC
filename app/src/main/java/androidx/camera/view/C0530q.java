package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0492x2;
import androidx.camera.view.AbstractC0524k;
import androidx.camera.view.C0530q;
import androidx.core.content.C0587a;
import androidx.core.util.C0654h;
import androidx.core.util.InterfaceC0647a;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import p305y.C5586f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.q */
/* loaded from: classes.dex */
public final class C0530q extends AbstractC0524k {

    /* renamed from: e */
    SurfaceView f2345e;

    /* renamed from: f */
    final b f2346f;

    /* renamed from: g */
    private AbstractC0524k.a f2347g;

    /* renamed from: androidx.camera.view.q$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        static void m2461a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.q$b */
    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: n */
        private Size f2348n;

        /* renamed from: o */
        private C0492x2 f2349o;

        /* renamed from: p */
        private Size f2350p;

        /* renamed from: q */
        private boolean f2351q = false;

        b() {
        }

        /* renamed from: b */
        private boolean m2463b() {
            Size size;
            return (this.f2351q || this.f2349o == null || (size = this.f2348n) == null || !size.equals(this.f2350p)) ? false : true;
        }

        /* renamed from: c */
        private void m2464c() {
            if (this.f2349o != null) {
                C0463q1.m2202a("SurfaceViewImpl", "Request canceled: " + this.f2349o);
                this.f2349o.m2272y();
            }
        }

        /* renamed from: d */
        private void m2465d() {
            if (this.f2349o != null) {
                C0463q1.m2202a("SurfaceViewImpl", "Surface invalidated " + this.f2349o);
                this.f2349o.m2266k().m19676c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m2466e(C0492x2.f fVar) {
            C0463q1.m2202a("SurfaceViewImpl", "Safe to release surface.");
            C0530q.this.m2460o();
        }

        /* renamed from: g */
        private boolean m2467g() {
            Surface surface = C0530q.this.f2345e.getHolder().getSurface();
            if (!m2463b()) {
                return false;
            }
            C0463q1.m2202a("SurfaceViewImpl", "Surface set on Preview.");
            this.f2349o.m2269v(surface, C0587a.m3032f(C0530q.this.f2345e.getContext()), new InterfaceC0647a() { // from class: androidx.camera.view.r
                @Override // androidx.core.util.InterfaceC0647a
                /* renamed from: a */
                public final void mo2469a(Object obj) {
                    C0530q.b.this.m2466e((C0492x2.f) obj);
                }
            });
            this.f2351q = true;
            C0530q.this.m2450f();
            return true;
        }

        /* renamed from: f */
        void m2468f(C0492x2 c0492x2) {
            m2464c();
            this.f2349o = c0492x2;
            Size m2267l = c0492x2.m2267l();
            this.f2348n = m2267l;
            this.f2351q = false;
            if (m2467g()) {
                return;
            }
            C0463q1.m2202a("SurfaceViewImpl", "Wait for new Surface creation.");
            C0530q.this.f2345e.getHolder().setFixedSize(m2267l.getWidth(), m2267l.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C0463q1.m2202a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f2350p = new Size(i11, i12);
            m2467g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C0463q1.m2202a("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C0463q1.m2202a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f2351q) {
                m2465d();
            } else {
                m2464c();
            }
            this.f2351q = false;
            this.f2349o = null;
            this.f2350p = null;
            this.f2348n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0530q(FrameLayout frameLayout, C0519f c0519f) {
        super(frameLayout, c0519f);
        this.f2346f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m2457m(int i10) {
        if (i10 == 0) {
            C0463q1.m2202a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        C0463q1.m2204c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m2458n(C0492x2 c0492x2) {
        this.f2346f.m2468f(c0492x2);
    }

    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: b */
    View mo2446b() {
        return this.f2345e;
    }

    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: c */
    Bitmap mo2447c() {
        SurfaceView surfaceView = this.f2345e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f2345e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f2345e.getWidth(), this.f2345e.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f2345e;
        a.m2461a(surfaceView2, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.n
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C0530q.m2457m(i10);
            }
        }, surfaceView2.getHandler());
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: d */
    public void mo2448d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: e */
    public void mo2449e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: g */
    public void mo2451g(final C0492x2 c0492x2, AbstractC0524k.a aVar) {
        this.f2331a = c0492x2.m2267l();
        this.f2347g = aVar;
        m2459l();
        c0492x2.m2264i(C0587a.m3032f(this.f2345e.getContext()), new Runnable() { // from class: androidx.camera.view.o
            @Override // java.lang.Runnable
            public final void run() {
                C0530q.this.m2460o();
            }
        });
        this.f2345e.post(new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                C0530q.this.m2458n(c0492x2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC0524k
    /* renamed from: i */
    public InterfaceFutureC2565m<Void> mo2453i() {
        return C5586f.m20508h(null);
    }

    /* renamed from: l */
    void m2459l() {
        C0654h.m3467f(this.f2332b);
        C0654h.m3467f(this.f2331a);
        SurfaceView surfaceView = new SurfaceView(this.f2332b.getContext());
        this.f2345e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f2331a.getWidth(), this.f2331a.getHeight()));
        this.f2332b.removeAllViews();
        this.f2332b.addView(this.f2345e);
        this.f2345e.getHolder().addCallback(this.f2346f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2460o() {
        AbstractC0524k.a aVar = this.f2347g;
        if (aVar != null) {
            aVar.mo2444a();
            this.f2347g = null;
        }
    }
}
