package p135k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0690v;

/* renamed from: k1.d */
/* loaded from: classes.dex */
public class C3721d extends AbstractC3726f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.d$a */
    /* loaded from: classes.dex */
    public class a extends C3735m {

        /* renamed from: a */
        final /* synthetic */ View f15611a;

        a(View view) {
            this.f15611a = view;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            C3747y.m15947g(this.f15611a, 1.0f);
            C3747y.m15941a(this.f15611a);
            abstractC3734l.mo15887Z(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.d$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f15613a;

        /* renamed from: b */
        private boolean f15614b = false;

        b(View view) {
            this.f15613a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3747y.m15947g(this.f15613a, 1.0f);
            if (this.f15614b) {
                this.f15613a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0690v.m3810Q(this.f15613a) && this.f15613a.getLayerType() == 0) {
                this.f15614b = true;
                this.f15613a.setLayerType(2, null);
            }
        }
    }

    public C3721d(int i10) {
        m15856s0(i10);
    }

    /* renamed from: t0 */
    private Animator m15839t0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C3747y.m15947g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C3747y.f15729b, f11);
        ofFloat.addListener(new b(view));
        mo15888a(new a(view));
        return ofFloat;
    }

    /* renamed from: u0 */
    private static float m15840u0(C3740r c3740r, float f10) {
        Float f11;
        return (c3740r == null || (f11 = (Float) c3740r.f15718a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // p135k1.AbstractC3726f0, p135k1.AbstractC3734l
    /* renamed from: n */
    public void mo15817n(C3740r c3740r) {
        super.mo15817n(c3740r);
        c3740r.f15718a.put("android:fade:transitionAlpha", Float.valueOf(C3747y.m15943c(c3740r.f15719b)));
    }

    @Override // p135k1.AbstractC3726f0
    /* renamed from: o0 */
    public Animator mo15841o0(ViewGroup viewGroup, View view, C3740r c3740r, C3740r c3740r2) {
        float m15840u0 = m15840u0(c3740r, 0.0f);
        return m15839t0(view, m15840u0 != 1.0f ? m15840u0 : 0.0f, 1.0f);
    }

    @Override // p135k1.AbstractC3726f0
    /* renamed from: q0 */
    public Animator mo15842q0(ViewGroup viewGroup, View view, C3740r c3740r, C3740r c3740r2) {
        C3747y.m15945e(view);
        return m15839t0(view, m15840u0(c3740r, 1.0f), 0.0f);
    }
}
