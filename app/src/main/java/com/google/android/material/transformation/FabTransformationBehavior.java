package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0690v;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p006a5.C0032a;
import p006a5.C0033b;
import p111i4.C3524f;
import p125j4.C3600a;
import p125j4.C3601b;
import p125j4.C3602c;
import p125j4.C3603d;
import p125j4.C3604e;
import p125j4.C3607h;
import p125j4.C3608i;
import p125j4.C3609j;
import p162m4.C3952a;
import p162m4.C3954c;
import p162m4.InterfaceC3955d;
import p247t4.C4731a;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f10047c;

    /* renamed from: d */
    private final RectF f10048d;

    /* renamed from: e */
    private final RectF f10049e;

    /* renamed from: f */
    private final int[] f10050f;

    /* renamed from: g */
    private float f10051g;

    /* renamed from: h */
    private float f10052h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C2547a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10053a;

        /* renamed from: b */
        final /* synthetic */ View f10054b;

        /* renamed from: c */
        final /* synthetic */ View f10055c;

        C2547a(boolean z10, View view, View view2) {
            this.f10053a = z10;
            this.f10054b = view;
            this.f10055c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10053a) {
                return;
            }
            this.f10054b.setVisibility(4);
            this.f10055c.setAlpha(1.0f);
            this.f10055c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10053a) {
                this.f10054b.setVisibility(0);
                this.f10055c.setAlpha(0.0f);
                this.f10055c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes.dex */
    public class C2548b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10057a;

        C2548b(View view) {
            this.f10057a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10057a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes.dex */
    public class C2549c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3955d f10059a;

        /* renamed from: b */
        final /* synthetic */ Drawable f10060b;

        C2549c(InterfaceC3955d interfaceC3955d, Drawable drawable) {
            this.f10059a = interfaceC3955d;
            this.f10060b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10059a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10059a.setCircularRevealOverlayDrawable(this.f10060b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes.dex */
    public class C2550d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3955d f10062a;

        C2550d(InterfaceC3955d interfaceC3955d) {
            this.f10062a = interfaceC3955d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC3955d.e revealInfo = this.f10062a.getRevealInfo();
            revealInfo.f16346c = Float.MAX_VALUE;
            this.f10062a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes.dex */
    public static class C2551e {

        /* renamed from: a */
        public C3607h f10064a;

        /* renamed from: b */
        public C3609j f10065b;
    }

    public FabTransformationBehavior() {
        this.f10047c = new Rect();
        this.f10048d = new RectF();
        this.f10049e = new RectF();
        this.f10050f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m11755K(View view) {
        View findViewById = view.findViewById(C3524f.f14607A);
        if (findViewById != null) {
            return m11775f0(findViewById);
        }
        if (!(view instanceof C0033b) && !(view instanceof C0032a)) {
            return m11775f0(view);
        }
        return m11775f0(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: L */
    private void m11756L(View view, C2551e c2551e, C3608i c3608i, C3608i c3608i2, float f10, float f11, float f12, float f13, RectF rectF) {
        float m11763S = m11763S(c2551e, c3608i, f10, f12);
        float m11763S2 = m11763S(c2551e, c3608i2, f11, f13);
        Rect rect = this.f10047c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f10048d;
        rectF2.set(rect);
        RectF rectF3 = this.f10049e;
        m11764T(view, rectF3);
        rectF3.offset(m11763S, m11763S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m11757M(View view, RectF rectF) {
        m11764T(view, rectF);
        rectF.offset(this.f10051g, this.f10052h);
    }

    /* renamed from: N */
    private Pair<C3608i, C3608i> m11758N(float f10, float f11, boolean z10, C2551e c2551e) {
        C3608i m15433e;
        C3608i m15433e2;
        if (f10 == 0.0f || f11 == 0.0f) {
            m15433e = c2551e.f10064a.m15433e("translationXLinear");
            m15433e2 = c2551e.f10064a.m15433e("translationYLinear");
        } else if ((z10 && f11 < 0.0f) || (!z10 && f11 > 0.0f)) {
            m15433e = c2551e.f10064a.m15433e("translationXCurveUpwards");
            m15433e2 = c2551e.f10064a.m15433e("translationYCurveUpwards");
        } else {
            m15433e = c2551e.f10064a.m15433e("translationXCurveDownwards");
            m15433e2 = c2551e.f10064a.m15433e("translationYCurveDownwards");
        }
        return new Pair<>(m15433e, m15433e2);
    }

    /* renamed from: O */
    private float m11759O(View view, View view2, C3609j c3609j) {
        RectF rectF = this.f10048d;
        RectF rectF2 = this.f10049e;
        m11757M(view, rectF);
        m11764T(view2, rectF2);
        rectF2.offset(-m11761Q(view, view2, c3609j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m11760P(View view, View view2, C3609j c3609j) {
        RectF rectF = this.f10048d;
        RectF rectF2 = this.f10049e;
        m11757M(view, rectF);
        m11764T(view2, rectF2);
        rectF2.offset(0.0f, -m11762R(view, view2, c3609j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m11761Q(View view, View view2, C3609j c3609j) {
        float centerX;
        float centerX2;
        float f10;
        RectF rectF = this.f10048d;
        RectF rectF2 = this.f10049e;
        m11757M(view, rectF);
        m11764T(view2, rectF2);
        int i10 = c3609j.f15243a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i10 == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f10 = 0.0f;
            return f10 + c3609j.f15244b;
        }
        f10 = centerX - centerX2;
        return f10 + c3609j.f15244b;
    }

    /* renamed from: R */
    private float m11762R(View view, View view2, C3609j c3609j) {
        float centerY;
        float centerY2;
        float f10;
        RectF rectF = this.f10048d;
        RectF rectF2 = this.f10049e;
        m11757M(view, rectF);
        m11764T(view2, rectF2);
        int i10 = c3609j.f15243a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i10 == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f10 = 0.0f;
            return f10 + c3609j.f15245c;
        }
        f10 = centerY - centerY2;
        return f10 + c3609j.f15245c;
    }

    /* renamed from: S */
    private float m11763S(C2551e c2551e, C3608i c3608i, float f10, float f11) {
        long m15441c = c3608i.m15441c();
        long m15442d = c3608i.m15442d();
        C3608i m15433e = c2551e.f10064a.m15433e("expansion");
        return C3600a.m15417a(f10, f11, c3608i.m15443e().getInterpolation(((float) (((m15433e.m15441c() + m15433e.m15442d()) + 17) - m15441c)) / ((float) m15442d)));
    }

    /* renamed from: T */
    private void m11764T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f10050f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m11765U(View view, View view2, boolean z10, boolean z11, C2551e c2551e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m11755K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC3955d) && C3954c.f16339a == 0) || (m11755K = m11755K(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    C3603d.f15229a.set(m11755K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m11755K, C3603d.f15229a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m11755K, C3603d.f15229a, 0.0f);
            }
            c2551e.f10064a.m15433e("contentFade").m15440a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    private void m11766V(View view, View view2, boolean z10, boolean z11, C2551e c2551e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC3955d) {
            InterfaceC3955d interfaceC3955d = (InterfaceC3955d) view2;
            int m11774d0 = m11774d0(view);
            int i10 = 16777215 & m11774d0;
            if (z10) {
                if (!z11) {
                    interfaceC3955d.setCircularRevealScrimColor(m11774d0);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC3955d, InterfaceC3955d.d.f16343a, i10);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC3955d, InterfaceC3955d.d.f16343a, m11774d0);
            }
            ofInt.setEvaluator(C3602c.m15421b());
            c2551e.f10064a.m15433e("color").m15440a(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: W */
    private void m11767W(View view, View view2, boolean z10, C2551e c2551e, List<Animator> list) {
        float m11761Q = m11761Q(view, view2, c2551e.f10065b);
        float m11762R = m11762R(view, view2, c2551e.f10065b);
        Pair<C3608i, C3608i> m11758N = m11758N(m11761Q, m11762R, z10, c2551e);
        C3608i c3608i = (C3608i) m11758N.first;
        C3608i c3608i2 = (C3608i) m11758N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            m11761Q = this.f10051g;
        }
        fArr[0] = m11761Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            m11762R = this.f10052h;
        }
        fArr2[0] = m11762R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c3608i.m15440a(ofFloat);
        c3608i2.m15440a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m11768X(View view, View view2, boolean z10, boolean z11, C2551e c2551e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m3868y = C0690v.m3868y(view2) - C0690v.m3868y(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-m3868y);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -m3868y);
        }
        c2551e.f10064a.m15433e("elevation").m15440a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    private void m11769Y(View view, View view2, boolean z10, boolean z11, C2551e c2551e, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC3955d) {
            InterfaceC3955d interfaceC3955d = (InterfaceC3955d) view2;
            float m11759O = m11759O(view, view2, c2551e.f10065b);
            float m11760P = m11760P(view, view2, c2551e.f10065b);
            ((FloatingActionButton) view).m11179i(this.f10047c);
            float width = this.f10047c.width() / 2.0f;
            C3608i m15433e = c2551e.f10064a.m15433e("expansion");
            if (z10) {
                if (!z11) {
                    interfaceC3955d.setRevealInfo(new InterfaceC3955d.e(m11759O, m11760P, width));
                }
                if (z11) {
                    width = interfaceC3955d.getRevealInfo().f16346c;
                }
                animator = C3952a.m16679a(interfaceC3955d, m11759O, m11760P, C4731a.m18862b(m11759O, m11760P, 0.0f, 0.0f, f10, f11));
                animator.addListener(new C2550d(interfaceC3955d));
                m11772b0(view2, m15433e.m15441c(), (int) m11759O, (int) m11760P, width, list);
            } else {
                float f12 = interfaceC3955d.getRevealInfo().f16346c;
                Animator m16679a = C3952a.m16679a(interfaceC3955d, m11759O, m11760P, width);
                int i10 = (int) m11759O;
                int i11 = (int) m11760P;
                m11772b0(view2, m15433e.m15441c(), i10, i11, f12, list);
                m11771a0(view2, m15433e.m15441c(), m15433e.m15442d(), c2551e.f10064a.m15434f(), i10, i11, width, list);
                animator = m16679a;
            }
            m15433e.m15440a(animator);
            list.add(animator);
            list2.add(C3952a.m16680b(interfaceC3955d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    private void m11770Z(View view, View view2, boolean z10, boolean z11, C2551e c2551e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC3955d) && (view instanceof ImageView)) {
            InterfaceC3955d interfaceC3955d = (InterfaceC3955d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C3604e.f15230b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C3604e.f15230b, 255);
            }
            ofInt.addUpdateListener(new C2548b(view2));
            c2551e.f10064a.m15433e("iconFade").m15440a(ofInt);
            list.add(ofInt);
            list2.add(new C2549c(interfaceC3955d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m11771a0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(j13);
            createCircularReveal.setDuration(j12 - j13);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: b0 */
    private void m11772b0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m11773c0(View view, View view2, boolean z10, boolean z11, C2551e c2551e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m11761Q = m11761Q(view, view2, c2551e.f10065b);
        float m11762R = m11762R(view, view2, c2551e.f10065b);
        Pair<C3608i, C3608i> m11758N = m11758N(m11761Q, m11762R, z10, c2551e);
        C3608i c3608i = (C3608i) m11758N.first;
        C3608i c3608i2 = (C3608i) m11758N.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-m11761Q);
                view2.setTranslationY(-m11762R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m11756L(view2, c2551e, c3608i, c3608i2, -m11761Q, -m11762R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -m11761Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -m11762R);
        }
        c3608i.m15440a(ofFloat);
        c3608i2.m15440a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m11774d0(View view) {
        ColorStateList m3860u = C0690v.m3860u(view);
        if (m3860u != null) {
            return m3860u.getColorForState(view.getDrawableState(), m3860u.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m11775f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo11754J(View view, View view2, boolean z10, boolean z11) {
        C2551e mo11776e0 = mo11776e0(view2.getContext(), z10);
        if (z10) {
            this.f10051g = view.getTranslationX();
            this.f10052h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m11768X(view, view2, z10, z11, mo11776e0, arrayList, arrayList2);
        RectF rectF = this.f10048d;
        m11773c0(view, view2, z10, z11, mo11776e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m11767W(view, view2, z10, mo11776e0, arrayList);
        m11770Z(view, view2, z10, z11, mo11776e0, arrayList, arrayList2);
        m11769Y(view, view2, z10, z11, mo11776e0, width, height, arrayList, arrayList2);
        m11766V(view, view2, z10, z11, mo11776e0, arrayList, arrayList2);
        m11765U(view, view2, z10, z11, mo11776e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C3601b.m15420a(animatorSet, arrayList);
        animatorSet.addListener(new C2547a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: e */
    public boolean mo2666e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    protected abstract C2551e mo11776e0(Context context, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: g */
    public void mo2668g(CoordinatorLayout.C0562f c0562f) {
        if (c0562f.f3030h == 0) {
            c0562f.f3030h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10047c = new Rect();
        this.f10048d = new RectF();
        this.f10049e = new RectF();
        this.f10050f = new int[2];
    }
}
