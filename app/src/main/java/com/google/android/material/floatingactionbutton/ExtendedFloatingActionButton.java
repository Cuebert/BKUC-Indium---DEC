package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0690v;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C2479b;
import java.util.Iterator;
import java.util.List;
import p111i4.C3529k;
import p111i4.C3530l;
import p125j4.C3607h;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0558b {

    /* renamed from: Q */
    private static final int f9432Q = C3529k.f14709s;

    /* renamed from: R */
    static final Property<View, Float> f9433R = new C2463b(Float.class, "width");

    /* renamed from: S */
    static final Property<View, Float> f9434S = new C2464c(Float.class, "height");

    /* renamed from: T */
    static final Property<View, Float> f9435T = new C2465d(Float.class, "paddingStart");

    /* renamed from: U */
    static final Property<View, Float> f9436U = new C2466e(Float.class, "paddingEnd");

    /* renamed from: D */
    private int f9437D;

    /* renamed from: E */
    private final InterfaceC2474c f9438E;

    /* renamed from: F */
    private final InterfaceC2474c f9439F;

    /* renamed from: G */
    private final InterfaceC2474c f9440G;

    /* renamed from: H */
    private final InterfaceC2474c f9441H;

    /* renamed from: I */
    private final int f9442I;

    /* renamed from: J */
    private int f9443J;

    /* renamed from: K */
    private int f9444K;

    /* renamed from: L */
    private final CoordinatorLayout.AbstractC0559c<ExtendedFloatingActionButton> f9445L;

    /* renamed from: M */
    private boolean f9446M;

    /* renamed from: N */
    private boolean f9447N;

    /* renamed from: O */
    private boolean f9448O;

    /* renamed from: P */
    protected ColorStateList f9449P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C2462a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f9453a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2474c f9454b;

        C2462a(InterfaceC2474c interfaceC2474c, AbstractC2467f abstractC2467f) {
            this.f9454b = interfaceC2474c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9453a = true;
            this.f9454b.m11262b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9454b.m11261a();
            if (this.f9453a) {
                return;
            }
            this.f9454b.m11268h(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f9454b.onAnimationStart(animator);
            this.f9453a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes.dex */
    static class C2463b extends Property<View, Float> {
        C2463b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes.dex */
    static class C2464c extends Property<View, Float> {
        C2464c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes.dex */
    static class C2465d extends Property<View, Float> {
        C2465d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C0690v.m3801J(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C0690v.m3788C0(view, f10.intValue(), view.getPaddingTop(), C0690v.m3799I(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes.dex */
    static class C2466e extends Property<View, Float> {
        C2466e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C0690v.m3799I(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C0690v.m3788C0(view, C0690v.m3801J(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2467f {
    }

    /* renamed from: q */
    private boolean m11146q() {
        return getVisibility() != 0 ? this.f9437D == 2 : this.f9437D != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m11147r(InterfaceC2474c interfaceC2474c, AbstractC2467f abstractC2467f) {
        if (interfaceC2474c.m11269i()) {
            return;
        }
        if (!m11149t()) {
            interfaceC2474c.m11263c();
            interfaceC2474c.m11268h(abstractC2467f);
            return;
        }
        measure(0, 0);
        AnimatorSet m11266f = interfaceC2474c.m11266f();
        m11266f.addListener(new C2462a(interfaceC2474c, abstractC2467f));
        Iterator<Animator.AnimatorListener> it = interfaceC2474c.m11267g().iterator();
        while (it.hasNext()) {
            m11266f.addListener(it.next());
        }
        m11266f.start();
    }

    /* renamed from: s */
    private void m11148s() {
        this.f9449P = getTextColors();
    }

    /* renamed from: t */
    private boolean m11149t() {
        return (C0690v.m3814U(this) || (!m11146q() && this.f9448O)) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0558b
    public CoordinatorLayout.AbstractC0559c<ExtendedFloatingActionButton> getBehavior() {
        return this.f9445L;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i10 = this.f9442I;
        return i10 < 0 ? (Math.min(C0690v.m3801J(this), C0690v.m3799I(this)) * 2) + getIconSize() : i10;
    }

    public C3607h getExtendMotionSpec() {
        return this.f9439F.m11265e();
    }

    public C3607h getHideMotionSpec() {
        return this.f9441H.m11265e();
    }

    public C3607h getShowMotionSpec() {
        return this.f9440G.m11265e();
    }

    public C3607h getShrinkMotionSpec() {
        return this.f9438E.m11265e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9446M && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f9446M = false;
            this.f9438E.m11263c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f9448O = z10;
    }

    public void setExtendMotionSpec(C3607h c3607h) {
        this.f9439F.m11264d(c3607h);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(C3607h.m15431c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f9446M == z10) {
            return;
        }
        InterfaceC2474c interfaceC2474c = z10 ? this.f9439F : this.f9438E;
        if (interfaceC2474c.m11269i()) {
            return;
        }
        interfaceC2474c.m11263c();
    }

    public void setHideMotionSpec(C3607h c3607h) {
        this.f9441H.m11264d(c3607h);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C3607h.m15431c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.f9446M || this.f9447N) {
            return;
        }
        this.f9443J = C0690v.m3801J(this);
        this.f9444K = C0690v.m3799I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.f9446M || this.f9447N) {
            return;
        }
        this.f9443J = i10;
        this.f9444K = i12;
    }

    public void setShowMotionSpec(C3607h c3607h) {
        this.f9440G.m11264d(c3607h);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C3607h.m15431c(getContext(), i10));
    }

    public void setShrinkMotionSpec(C3607h c3607h) {
        this.f9438E.m11264d(c3607h);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(C3607h.m15431c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        m11148s();
    }

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0559c<T> {

        /* renamed from: a */
        private Rect f9450a;

        /* renamed from: b */
        private boolean f9451b;

        /* renamed from: c */
        private boolean f9452c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9451b = false;
            this.f9452c = true;
        }

        /* renamed from: G */
        private static boolean m11150G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0562f) {
                return ((CoordinatorLayout.C0562f) layoutParams).m2696f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m11151J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f9451b || this.f9452c) && ((CoordinatorLayout.C0562f) extendedFloatingActionButton.getLayoutParams()).m2695e() == view.getId();
        }

        /* renamed from: L */
        private boolean m11152L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m11151J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f9450a == null) {
                this.f9450a = new Rect();
            }
            Rect rect = this.f9450a;
            C2479b.m11339a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m11158K(extendedFloatingActionButton);
                return true;
            }
            m11154E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m11153M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m11151J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0562f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m11158K(extendedFloatingActionButton);
                return true;
            }
            m11154E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: E */
        protected void m11154E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            InterfaceC2474c interfaceC2474c;
            if (this.f9452c) {
                interfaceC2474c = extendedFloatingActionButton.f9439F;
            } else {
                interfaceC2474c = extendedFloatingActionButton.f9440G;
            }
            extendedFloatingActionButton.m11147r(interfaceC2474c, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean mo2663b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2663b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean mo2669h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m11152L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!m11150G(view)) {
                return false;
            }
            m11153M(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo2673l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> m2648l = coordinatorLayout.m2648l(extendedFloatingActionButton);
            int size = m2648l.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = m2648l.get(i11);
                if (view instanceof AppBarLayout) {
                    if (m11152L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m11150G(view) && m11153M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m2636C(extendedFloatingActionButton, i10);
            return true;
        }

        /* renamed from: K */
        protected void m11158K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            InterfaceC2474c interfaceC2474c;
            if (this.f9452c) {
                interfaceC2474c = extendedFloatingActionButton.f9438E;
            } else {
                interfaceC2474c = extendedFloatingActionButton.f9441H;
            }
            extendedFloatingActionButton.m11147r(interfaceC2474c, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: g */
        public void mo2668g(CoordinatorLayout.C0562f c0562f) {
            if (c0562f.f3030h == 0) {
                c0562f.f3030h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f15051s1);
            this.f9451b = obtainStyledAttributes.getBoolean(C3530l.f15059t1, false);
            this.f9452c = obtainStyledAttributes.getBoolean(C3530l.f15067u1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m11148s();
    }
}
