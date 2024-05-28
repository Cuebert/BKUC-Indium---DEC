package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p125j4.C3600a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0559c<V> {

    /* renamed from: a */
    private int f8996a;

    /* renamed from: b */
    private int f8997b;

    /* renamed from: c */
    private int f8998c;

    /* renamed from: d */
    private ViewPropertyAnimator f8999d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    public class C2397a extends AnimatorListenerAdapter {
        C2397a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f8999d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f8996a = 0;
        this.f8997b = 2;
        this.f8998c = 0;
    }

    /* renamed from: F */
    private void m10569F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f8999d = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new C2397a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: A */
    public boolean mo2658A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    /* renamed from: G */
    public void m10570G(V v10, int i10) {
        this.f8998c = i10;
        if (this.f8997b == 1) {
            v10.setTranslationY(this.f8996a + i10);
        }
    }

    /* renamed from: H */
    public void m10571H(V v10) {
        if (this.f8997b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f8999d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f8997b = 1;
        m10569F(v10, this.f8996a + this.f8998c, 175L, C3600a.f15225c);
    }

    /* renamed from: I */
    public void m10572I(V v10) {
        if (this.f8997b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f8999d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f8997b = 2;
        m10569F(v10, 0, 225L, C3600a.f15226d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: l */
    public boolean mo2673l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f8996a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.mo2673l(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: t */
    public void mo2681t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            m10571H(v10);
        } else if (i11 < 0) {
            m10572I(v10);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8996a = 0;
        this.f8997b = 2;
        this.f8998c = 0;
    }
}
