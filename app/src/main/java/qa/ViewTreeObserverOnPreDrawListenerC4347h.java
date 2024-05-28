package qa;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: qa.h */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC4347h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: n */
    final C4363x f17673n;

    /* renamed from: o */
    final WeakReference<ImageView> f17674o;

    /* renamed from: p */
    InterfaceC4341e f17675p;

    public ViewTreeObserverOnPreDrawListenerC4347h(C4363x c4363x, ImageView imageView, InterfaceC4341e interfaceC4341e) {
        this.f17673n = c4363x;
        this.f17674o = new WeakReference<>(imageView);
        this.f17675p = interfaceC4341e;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* renamed from: a */
    public void m17957a() {
        this.f17675p = null;
        ImageView imageView = this.f17674o.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f17674o.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f17673n.m18047h().m18045f(width, height).m18043d(imageView, this.f17675p);
        }
        return true;
    }
}
