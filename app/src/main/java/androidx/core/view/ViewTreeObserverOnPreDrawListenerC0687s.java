package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: androidx.core.view.s */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0687s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: n */
    private final View f3631n;

    /* renamed from: o */
    private ViewTreeObserver f3632o;

    /* renamed from: p */
    private final Runnable f3633p;

    private ViewTreeObserverOnPreDrawListenerC0687s(View view, Runnable runnable) {
        this.f3631n = view;
        this.f3632o = view.getViewTreeObserver();
        this.f3633p = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0687s m3776a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        ViewTreeObserverOnPreDrawListenerC0687s viewTreeObserverOnPreDrawListenerC0687s = new ViewTreeObserverOnPreDrawListenerC0687s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0687s);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0687s);
        return viewTreeObserverOnPreDrawListenerC0687s;
    }

    /* renamed from: b */
    public void m3777b() {
        if (this.f3632o.isAlive()) {
            this.f3632o.removeOnPreDrawListener(this);
        } else {
            this.f3631n.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3631n.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m3777b();
        this.f3633p.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3632o = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m3777b();
    }
}
