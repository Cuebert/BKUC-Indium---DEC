package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.b0 */
/* loaded from: classes.dex */
public final class C0665b0 {

    /* renamed from: a */
    private final WeakReference<View> f3565a;

    /* renamed from: b */
    Runnable f3566b = null;

    /* renamed from: c */
    Runnable f3567c = null;

    /* renamed from: d */
    int f3568d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.b0$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0667c0 f3569a;

        /* renamed from: b */
        final /* synthetic */ View f3570b;

        a(InterfaceC0667c0 interfaceC0667c0, View view) {
            this.f3569a = interfaceC0667c0;
            this.f3570b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3569a.onAnimationCancel(this.f3570b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3569a.onAnimationEnd(this.f3570b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3569a.onAnimationStart(this.f3570b);
        }
    }

    /* renamed from: androidx.core.view.b0$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static ViewPropertyAnimator m3610a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0665b0(View view) {
        this.f3565a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m3599i(View view, InterfaceC0667c0 interfaceC0667c0) {
        if (interfaceC0667c0 != null) {
            view.animate().setListener(new a(interfaceC0667c0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C0665b0 m3600b(float f10) {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    /* renamed from: c */
    public void m3601c() {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m3602d() {
        View view = this.f3565a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C0665b0 m3603f(long j10) {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    /* renamed from: g */
    public C0665b0 m3604g(Interpolator interpolator) {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C0665b0 m3605h(InterfaceC0667c0 interfaceC0667c0) {
        View view = this.f3565a.get();
        if (view != null) {
            m3599i(view, interfaceC0667c0);
        }
        return this;
    }

    /* renamed from: j */
    public C0665b0 m3606j(long j10) {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    /* renamed from: k */
    public C0665b0 m3607k(final InterfaceC0671e0 interfaceC0671e0) {
        final View view = this.f3565a.get();
        if (view != null) {
            b.m3610a(view.animate(), interfaceC0671e0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC0671e0.this.mo904a(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: l */
    public void m3608l() {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C0665b0 m3609m(float f10) {
        View view = this.f3565a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
