package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C0492x2;
import com.google.common.util.concurrent.InterfaceFutureC2565m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.k */
/* loaded from: classes.dex */
public abstract class AbstractC0524k {

    /* renamed from: a */
    Size f2331a;

    /* renamed from: b */
    FrameLayout f2332b;

    /* renamed from: c */
    private final C0519f f2333c;

    /* renamed from: d */
    private boolean f2334d = false;

    /* renamed from: androidx.camera.view.k$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo2444a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0524k(FrameLayout frameLayout, C0519f c0519f) {
        this.f2332b = frameLayout;
        this.f2333c = c0519f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m2445a() {
        Bitmap mo2447c = mo2447c();
        if (mo2447c == null) {
            return null;
        }
        return this.f2333c.m2432a(mo2447c, new Size(this.f2332b.getWidth(), this.f2332b.getHeight()), this.f2332b.getLayoutDirection());
    }

    /* renamed from: b */
    abstract View mo2446b();

    /* renamed from: c */
    abstract Bitmap mo2447c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo2448d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo2449e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2450f() {
        this.f2334d = true;
        m2452h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo2451g(C0492x2 c0492x2, a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2452h() {
        View mo2446b = mo2446b();
        if (mo2446b == null || !this.f2334d) {
            return;
        }
        this.f2333c.m2443q(new Size(this.f2332b.getWidth(), this.f2332b.getHeight()), this.f2332b.getLayoutDirection(), mo2446b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract InterfaceFutureC2565m<Void> mo2453i();
}
