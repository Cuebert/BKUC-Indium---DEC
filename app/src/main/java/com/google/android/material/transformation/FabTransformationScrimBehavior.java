package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p125j4.C3601b;
import p125j4.C3608i;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C3608i f10066c;

    /* renamed from: d */
    private final C3608i f10067d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes.dex */
    class C2552a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10068a;

        /* renamed from: b */
        final /* synthetic */ View f10069b;

        C2552a(boolean z10, View view) {
            this.f10068a = z10;
            this.f10069b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10068a) {
                return;
            }
            this.f10069b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10068a) {
                this.f10069b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f10066c = new C3608i(75L, 150L);
        this.f10067d = new C3608i(0L, 150L);
    }

    /* renamed from: K */
    private void m11777K(View view, boolean z10, boolean z11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        C3608i c3608i = z10 ? this.f10066c : this.f10067d;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c3608i.m15440a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: D */
    public boolean mo2661D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2661D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo11754J(View view, View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        m11777K(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C3601b.m15420a(animatorSet, arrayList);
        animatorSet.addListener(new C2552a(z10, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: e */
    public boolean mo2666e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10066c = new C3608i(75L, 150L);
        this.f10067d = new C3608i(0L, 150L);
    }
}
