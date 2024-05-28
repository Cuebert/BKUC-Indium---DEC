package p162m4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p162m4.InterfaceC3955d;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public final class C3952a {

    /* renamed from: m4.a$a */
    /* loaded from: classes.dex */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3955d f16338a;

        a(InterfaceC3955d interfaceC3955d) {
            this.f16338a = interfaceC3955d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16338a.mo16681a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16338a.mo16682b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m16679a(InterfaceC3955d interfaceC3955d, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC3955d, (Property<InterfaceC3955d, V>) InterfaceC3955d.c.f16342a, (TypeEvaluator) InterfaceC3955d.b.f16340b, (Object[]) new InterfaceC3955d.e[]{new InterfaceC3955d.e(f10, f11, f12)});
        InterfaceC3955d.e revealInfo = interfaceC3955d.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC3955d, (int) f10, (int) f11, revealInfo.f16346c, f12);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m16680b(InterfaceC3955d interfaceC3955d) {
        return new a(interfaceC3955d);
    }
}
