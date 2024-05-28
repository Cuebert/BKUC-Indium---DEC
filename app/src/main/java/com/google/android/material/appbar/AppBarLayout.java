package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0679k;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.InterfaceC0663f;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.List;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3525g;
import p111i4.C3529k;
import p111i4.C3530l;
import p125j4.C3600a;
import p207q0.C4291a;
import p310y4.C5888g;
import p310y4.C5889h;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0558b {

    /* renamed from: E */
    private static final int f8888E = C3529k.f14695e;

    /* renamed from: A */
    private WeakReference<View> f8889A;

    /* renamed from: B */
    private ValueAnimator f8890B;

    /* renamed from: C */
    private int[] f8891C;

    /* renamed from: D */
    private Drawable f8892D;

    /* renamed from: n */
    private int f8893n;

    /* renamed from: o */
    private int f8894o;

    /* renamed from: p */
    private int f8895p;

    /* renamed from: q */
    private int f8896q;

    /* renamed from: r */
    private boolean f8897r;

    /* renamed from: s */
    private int f8898s;

    /* renamed from: t */
    private C0675g0 f8899t;

    /* renamed from: u */
    private List<InterfaceC2387b> f8900u;

    /* renamed from: v */
    private boolean f8901v;

    /* renamed from: w */
    private boolean f8902w;

    /* renamed from: x */
    private boolean f8903x;

    /* renamed from: y */
    private boolean f8904y;

    /* renamed from: z */
    private int f8905z;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.C2391c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo10481E() {
            return super.mo10481E();
        }

        @Override // com.google.android.material.appbar.C2391c
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo10482G(int i10) {
            return super.mo10482G(i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo2673l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.mo2673l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo2674m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.mo2674m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo2678q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.mo2678q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo2681t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.mo2681t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo2685x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo2685x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo2686y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo2686y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo2658A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.mo2658A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo2660C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.mo2660C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC2390b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m10483R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0559c m2696f = ((CoordinatorLayout.C0562f) appBarLayout.getLayoutParams()).m2696f();
            if (m2696f instanceof BaseBehavior) {
                return ((BaseBehavior) m2696f).mo10462M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m10484S(View view, View view2) {
            CoordinatorLayout.AbstractC0559c m2696f = ((CoordinatorLayout.C0562f) view2.getLayoutParams()).m2696f();
            if (m2696f instanceof BaseBehavior) {
                C0690v.m3823b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m2696f).f8906k) + m10507M()) - m10505I(view2));
            }
        }

        /* renamed from: T */
        private void m10485T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m10438j()) {
                    appBarLayout.m10442p(appBarLayout.m10443r(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC2390b
        /* renamed from: J */
        float mo10487J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m10483R = m10483R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m10483R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m10483R / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC2390b
        /* renamed from: L */
        public int mo10488L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo10488L(view);
        }

        @Override // com.google.android.material.appbar.AbstractC2390b
        /* renamed from: Q */
        public AppBarLayout mo10486H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: e */
        public boolean mo2666e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: h */
        public boolean mo2669h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m10484S(view, view2);
            m10485T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: i */
        public void mo2670i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0690v.m3841k0(coordinatorLayout, C0660c.a.f3546q.m3575b());
                C0690v.m3841k0(coordinatorLayout, C0660c.a.f3547r.m3575b());
            }
        }

        @Override // com.google.android.material.appbar.C2391c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2673l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.mo2673l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.AbstractC2390b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo2674m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.mo2674m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: w */
        public boolean mo2684w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout mo10486H = mo10486H(coordinatorLayout.m2648l(view));
            if (mo10486H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f8945d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo10486H.m10441m(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14804L3);
            m10508O(obtainStyledAttributes.getDimensionPixelSize(C3530l.f14811M3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes.dex */
    public class C2386a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5888g f8927a;

        C2386a(C5888g c5888g) {
            this.f8927a = c5888g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8927a.m20834W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2387b<T extends AppBarLayout> {
        /* renamed from: a */
        void m10490a(T t10, int i10);
    }

    /* renamed from: a */
    private void m10423a() {
        WeakReference<View> weakReference = this.f8889A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8889A = null;
    }

    /* renamed from: b */
    private View m10424b(View view) {
        int i10;
        if (this.f8889A == null && (i10 = this.f8905z) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f8905z);
            }
            if (findViewById != null) {
                this.f8889A = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f8889A;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m10425g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((C2388c) getChildAt(i10).getLayoutParams()).m10493c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m10426i() {
        this.f8894o = -1;
        this.f8895p = -1;
        this.f8896q = -1;
    }

    /* renamed from: n */
    private void m10427n(boolean z10, boolean z11, boolean z12) {
        this.f8898s = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: o */
    private boolean m10428o(boolean z10) {
        if (this.f8902w == z10) {
            return false;
        }
        this.f8902w = z10;
        refreshDrawableState();
        return true;
    }

    /* renamed from: q */
    private boolean m10429q() {
        return this.f8892D != null && getTopInset() > 0;
    }

    /* renamed from: s */
    private boolean m10430s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C0690v.m3785B(childAt)) ? false : true;
    }

    /* renamed from: t */
    private void m10431t(C5888g c5888g, boolean z10) {
        float dimension = getResources().getDimension(C3522d.f14573a);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f8890B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.f8890B = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C3525g.f14649a));
        this.f8890B.setInterpolator(C3600a.f15223a);
        this.f8890B.addUpdateListener(new C2386a(c5888g));
        this.f8890B.start();
    }

    /* renamed from: u */
    private void m10432u() {
        setWillNotDraw(!m10429q());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public C2388c generateDefaultLayoutParams() {
        return new C2388c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2388c;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public C2388c generateLayoutParams(AttributeSet attributeSet) {
        return new C2388c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m10429q()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f8893n);
            this.f8892D.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8892D;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public C2388c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C2388c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2388c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2388c(layoutParams);
    }

    /* renamed from: f */
    boolean m10436f() {
        return this.f8897r;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0558b
    public CoordinatorLayout.AbstractC0559c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int i10;
        int m3793F;
        int i11 = this.f8895p;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C2388c c2388c = (C2388c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = c2388c.f8929a;
            if ((i13 & 5) != 5) {
                if (i12 > 0) {
                    break;
                }
            } else {
                int i14 = ((LinearLayout.LayoutParams) c2388c).topMargin + ((LinearLayout.LayoutParams) c2388c).bottomMargin;
                if ((i13 & 8) != 0) {
                    m3793F = C0690v.m3793F(childAt);
                } else if ((i13 & 2) != 0) {
                    m3793F = measuredHeight - C0690v.m3793F(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && C0690v.m3785B(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + m3793F;
                if (childCount == 0) {
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                }
                i12 += i10;
            }
        }
        int max = Math.max(0, i12);
        this.f8895p = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f8896q;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            C2388c c2388c = (C2388c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c2388c).topMargin + ((LinearLayout.LayoutParams) c2388c).bottomMargin;
            int i13 = c2388c.f8929a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= C0690v.m3793F(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f8896q = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f8905z;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m3793F = C0690v.m3793F(this);
        if (m3793F == 0) {
            int childCount = getChildCount();
            m3793F = childCount >= 1 ? C0690v.m3793F(getChildAt(childCount - 1)) : 0;
            if (m3793F == 0) {
                return getHeight() / 3;
            }
        }
        return (m3793F * 2) + topInset;
    }

    int getPendingAction() {
        return this.f8898s;
    }

    public Drawable getStatusBarForeground() {
        return this.f8892D;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0675g0 c0675g0 = this.f8899t;
        if (c0675g0 != null) {
            return c0675g0.m3669l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f8894o;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            C2388c c2388c = (C2388c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = c2388c.f8929a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + ((LinearLayout.LayoutParams) c2388c).topMargin + ((LinearLayout.LayoutParams) c2388c).bottomMargin;
            if (i11 == 0 && C0690v.m3785B(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= C0690v.m3793F(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f8894o = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m10437h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean m10438j() {
        return this.f8904y;
    }

    /* renamed from: k */
    void m10439k(int i10) {
        this.f8893n = i10;
        if (!willNotDraw()) {
            C0690v.m3835h0(this);
        }
        List<InterfaceC2387b> list = this.f8900u;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC2387b interfaceC2387b = this.f8900u.get(i11);
                if (interfaceC2387b != null) {
                    interfaceC2387b.m10490a(this, i10);
                }
            }
        }
    }

    /* renamed from: l */
    void m10440l() {
        this.f8898s = 0;
    }

    /* renamed from: m */
    public void m10441m(boolean z10, boolean z11) {
        m10427n(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5889h.m20860e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f8891C == null) {
            this.f8891C = new int[4];
        }
        int[] iArr = this.f8891C;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f8902w;
        int i11 = C3520b.f14508A;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f8903x) ? C3520b.f14509B : -C3520b.f14509B;
        int i12 = C3520b.f14539y;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f8903x) ? C3520b.f14538x : -C3520b.f14538x;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10423a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (C0690v.m3785B(this) && m10430s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0690v.m3823b0(getChildAt(childCount), topInset);
            }
        }
        m10426i();
        this.f8897r = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((C2388c) getChildAt(i14).getLayoutParams()).m10492b() != null) {
                this.f8897r = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f8892D;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f8901v) {
            return;
        }
        if (!this.f8904y && !m10425g()) {
            z11 = false;
        }
        m10428o(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && C0690v.m3785B(this) && m10430s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C4291a.m17788b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m10426i();
    }

    /* renamed from: p */
    boolean m10442p(boolean z10) {
        if (this.f8903x == z10) {
            return false;
        }
        this.f8903x = z10;
        refreshDrawableState();
        if (!this.f8904y || !(getBackground() instanceof C5888g)) {
            return true;
        }
        m10431t((C5888g) getBackground(), z10);
        return true;
    }

    /* renamed from: r */
    boolean m10443r(View view) {
        View m10424b = m10424b(view);
        if (m10424b != null) {
            view = m10424b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C5889h.m20859d(this, f10);
    }

    public void setExpanded(boolean z10) {
        m10441m(z10, C0690v.m3814U(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f8904y = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f8905z = i10;
        m10423a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f8892D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f8892D = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f8892D.setState(getDrawableState());
                }
                C0609a.m3258m(this.f8892D, C0690v.m3791E(this));
                this.f8892D.setVisible(getVisibility() == 0, false);
                this.f8892D.setCallback(this);
            }
            m10432u();
            C0690v.m3835h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C3121a.m13770d(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        C2393e.m10515a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f8892D;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8892D;
    }

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC2389a<T> {

        /* renamed from: k */
        private int f8906k;

        /* renamed from: l */
        private int f8907l;

        /* renamed from: m */
        private ValueAnimator f8908m;

        /* renamed from: n */
        private int f8909n;

        /* renamed from: o */
        private boolean f8910o;

        /* renamed from: p */
        private float f8911p;

        /* renamed from: q */
        private WeakReference<View> f8912q;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        public class C2383a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f8916a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f8917b;

            C2383a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f8916a = coordinatorLayout;
                this.f8917b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m10502P(this.f8916a, this.f8917b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes.dex */
        public class C2384b implements InterfaceC0663f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f8919a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f8920b;

            /* renamed from: c */
            final /* synthetic */ View f8921c;

            /* renamed from: d */
            final /* synthetic */ int f8922d;

            C2384b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f8919a = coordinatorLayout;
                this.f8920b = appBarLayout;
                this.f8921c = view;
                this.f8922d = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.InterfaceC0663f
            /* renamed from: a */
            public boolean mo3595a(View view, InterfaceC0663f.a aVar) {
                BaseBehavior.this.mo2678q(this.f8919a, this.f8920b, this.f8921c, 0, this.f8922d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes.dex */
        public class C2385c implements InterfaceC0663f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f8924a;

            /* renamed from: b */
            final /* synthetic */ boolean f8925b;

            C2385c(AppBarLayout appBarLayout, boolean z10) {
                this.f8924a = appBarLayout;
                this.f8925b = z10;
            }

            @Override // androidx.core.view.accessibility.InterfaceC0663f
            /* renamed from: a */
            public boolean mo3595a(View view, InterfaceC0663f.a aVar) {
                this.f8924a.setExpanded(this.f8925b);
                return true;
            }
        }

        public BaseBehavior() {
            this.f8909n = -1;
        }

        /* renamed from: S */
        private void m10445S(CoordinatorLayout coordinatorLayout, T t10, View view) {
            if (mo10462M() != (-t10.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m10446T(coordinatorLayout, t10, C0660c.a.f3546q, false);
            }
            if (mo10462M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i10 = -t10.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        C0690v.m3845m0(coordinatorLayout, C0660c.a.f3547r, null, new C2384b(coordinatorLayout, t10, view, i10));
                        return;
                    }
                    return;
                }
                m10446T(coordinatorLayout, t10, C0660c.a.f3547r, true);
            }
        }

        /* renamed from: T */
        private void m10446T(CoordinatorLayout coordinatorLayout, T t10, C0660c.a aVar, boolean z10) {
            C0690v.m3845m0(coordinatorLayout, aVar, null, new C2385c(t10, z10));
        }

        /* renamed from: U */
        private void m10447U(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int height;
            int abs = Math.abs(mo10462M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t10.getHeight()) + 1.0f) * 150.0f);
            }
            m10448V(coordinatorLayout, t10, i10, height);
        }

        /* renamed from: V */
        private void m10448V(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int mo10462M = mo10462M();
            if (mo10462M == i10) {
                ValueAnimator valueAnimator = this.f8908m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f8908m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f8908m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f8908m = valueAnimator3;
                valueAnimator3.setInterpolator(C3600a.f15227e);
                this.f8908m.addUpdateListener(new C2383a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f8908m.setDuration(Math.min(i11, 600));
            this.f8908m.setIntValues(mo10462M, i10);
            this.f8908m.start();
        }

        /* renamed from: X */
        private boolean m10449X(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.m10437h() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        /* renamed from: Y */
        private static boolean m10450Y(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* renamed from: Z */
        private View m10451Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC0679k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m10452a0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m10453b0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2388c c2388c = (C2388c) childAt.getLayoutParams();
                if (m10450Y(c2388c.m10491a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c2388c).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c2388c).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m10454e0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                C2388c c2388c = (C2388c) childAt.getLayoutParams();
                Interpolator m10492b = c2388c.m10492b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (m10492b != null) {
                    int m10491a = c2388c.m10491a();
                    if ((m10491a & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c2388c).topMargin + ((LinearLayout.LayoutParams) c2388c).bottomMargin;
                        if ((m10491a & 2) != 0) {
                            i11 -= C0690v.m3793F(childAt);
                        }
                    }
                    if (C0690v.m3785B(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * m10492b.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        /* renamed from: p0 */
        private boolean m10455p0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> m2649m = coordinatorLayout.m2649m(t10);
            int size = m2649m.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.AbstractC0559c m2696f = ((CoordinatorLayout.C0562f) m2649m.get(i10).getLayoutParams()).m2696f();
                if (m2696f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m2696f).m10506K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m10456q0(CoordinatorLayout coordinatorLayout, T t10) {
            int mo10462M = mo10462M();
            int m10453b0 = m10453b0(t10, mo10462M);
            if (m10453b0 >= 0) {
                View childAt = t10.getChildAt(m10453b0);
                C2388c c2388c = (C2388c) childAt.getLayoutParams();
                int m10491a = c2388c.m10491a();
                if ((m10491a & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (m10453b0 == t10.getChildCount() - 1) {
                        i11 += t10.getTopInset();
                    }
                    if (m10450Y(m10491a, 2)) {
                        i11 += C0690v.m3793F(childAt);
                    } else if (m10450Y(m10491a, 5)) {
                        int m3793F = C0690v.m3793F(childAt) + i11;
                        if (mo10462M < m3793F) {
                            i10 = m3793F;
                        } else {
                            i11 = m3793F;
                        }
                    }
                    if (m10450Y(m10491a, 32)) {
                        i10 += ((LinearLayout.LayoutParams) c2388c).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) c2388c).bottomMargin;
                    }
                    if (mo10462M < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    m10447U(coordinatorLayout, t10, C4291a.m17788b(i10, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m10457r0(CoordinatorLayout coordinatorLayout, T t10) {
            C0690v.m3841k0(coordinatorLayout, C0660c.a.f3546q.m3575b());
            C0690v.m3841k0(coordinatorLayout, C0660c.a.f3547r.m3575b());
            View m10451Z = m10451Z(coordinatorLayout);
            if (m10451Z == null || t10.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0562f) m10451Z.getLayoutParams()).m2696f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m10445S(coordinatorLayout, t10, m10451Z);
        }

        /* renamed from: s0 */
        private void m10458s0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View m10452a0 = m10452a0(t10, i10);
            if (m10452a0 != null) {
                int m10491a = ((C2388c) m10452a0.getLayoutParams()).m10491a();
                boolean z11 = false;
                if ((m10491a & 1) != 0) {
                    int m3793F = C0690v.m3793F(m10452a0);
                    if (i11 <= 0 || (m10491a & 12) == 0 ? !((m10491a & 2) == 0 || (-i10) < (m10452a0.getBottom() - m3793F) - t10.getTopInset()) : (-i10) >= (m10452a0.getBottom() - m3793F) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
                if (t10.m10438j()) {
                    z11 = t10.m10443r(m10451Z(coordinatorLayout));
                }
                boolean m10442p = t10.m10442p(z11);
                if (z10 || (m10442p && m10455p0(coordinatorLayout, t10))) {
                    t10.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC2389a
        /* renamed from: M */
        int mo10462M() {
            return mo10481E() + this.f8906k;
        }

        @Override // com.google.android.material.appbar.AbstractC2389a
        /* renamed from: W */
        public boolean mo10459H(T t10) {
            WeakReference<View> weakReference = this.f8912q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.AbstractC2389a
        /* renamed from: c0 */
        public int mo10460K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.AbstractC2389a
        /* renamed from: d0 */
        public int mo10461L(T t10) {
            return t10.getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.AbstractC2389a
        /* renamed from: f0 */
        public void mo10463N(CoordinatorLayout coordinatorLayout, T t10) {
            m10456q0(coordinatorLayout, t10);
            if (t10.m10438j()) {
                t10.m10442p(t10.m10443r(m10451Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C2391c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: g0 */
        public boolean mo2673l(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            int round;
            boolean mo2673l = super.mo2673l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            int i11 = this.f8909n;
            if (i11 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t10.getChildAt(i11);
                int i12 = -childAt.getBottom();
                if (this.f8910o) {
                    round = C0690v.m3793F(childAt) + t10.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f8911p);
                }
                m10502P(coordinatorLayout, t10, i12 + round);
            } else if (pendingAction != 0) {
                boolean z10 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i13 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        m10447U(coordinatorLayout, t10, i13, 0.0f);
                    } else {
                        m10502P(coordinatorLayout, t10, i13);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        m10447U(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        m10502P(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.m10440l();
            this.f8909n = -1;
            mo10482G(C4291a.m17788b(mo10481E(), -t10.getTotalScrollRange(), 0));
            m10458s0(coordinatorLayout, t10, mo10481E(), 0, true);
            t10.m10439k(mo10481E());
            m10457r0(coordinatorLayout, t10);
            return mo2673l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: h0 */
        public boolean mo2674m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0562f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.m2637D(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.mo2674m(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: i0 */
        public void mo2678q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    int i15 = -t10.getTotalScrollRange();
                    i13 = i15;
                    i14 = t10.getDownNestedPreScrollRange() + i15;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                if (i13 != i14) {
                    iArr[1] = m10501O(coordinatorLayout, t10, i11, i13, i14);
                }
            }
            if (t10.m10438j()) {
                t10.m10442p(t10.m10443r(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: j0 */
        public void mo2681t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = m10501O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                m10457r0(coordinatorLayout, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: k0 */
        public void mo2685x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo2685x(coordinatorLayout, t10, savedState.getSuperState());
                this.f8909n = savedState.f8913n;
                this.f8911p = savedState.f8914o;
                this.f8910o = savedState.f8915p;
                return;
            }
            super.mo2685x(coordinatorLayout, t10, parcelable);
            this.f8909n = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: l0 */
        public Parcelable mo2686y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable mo2686y = super.mo2686y(coordinatorLayout, t10);
            int mo10481E = mo10481E();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + mo10481E;
                if (childAt.getTop() + mo10481E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(mo2686y);
                    savedState.f8913n = i10;
                    savedState.f8915p = bottom == C0690v.m3793F(childAt) + t10.getTopInset();
                    savedState.f8914o = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return mo2686y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: m0 */
        public boolean mo2658A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.m10438j() || m10449X(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f8908m) != null) {
                valueAnimator.cancel();
            }
            this.f8912q = null;
            this.f8907l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: n0 */
        public void mo2660C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f8907l == 0 || i10 == 1) {
                m10456q0(coordinatorLayout, t10);
                if (t10.m10438j()) {
                    t10.m10442p(t10.m10443r(view));
                }
            }
            this.f8912q = new WeakReference<>(view);
        }

        @Override // com.google.android.material.appbar.AbstractC2389a
        /* renamed from: o0 */
        public int mo10464Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int mo10462M = mo10462M();
            int i13 = 0;
            if (i11 != 0 && mo10462M >= i11 && mo10462M <= i12) {
                int m17788b = C4291a.m17788b(i10, i11, i12);
                if (mo10462M != m17788b) {
                    int m10454e0 = t10.m10436f() ? m10454e0(t10, m17788b) : m17788b;
                    boolean mo10482G = mo10482G(m10454e0);
                    i13 = mo10462M - m17788b;
                    this.f8906k = m17788b - m10454e0;
                    if (!mo10482G && t10.m10436f()) {
                        coordinatorLayout.m2642f(t10);
                    }
                    t10.m10439k(mo10481E());
                    m10458s0(coordinatorLayout, t10, m17788b, m17788b < mo10462M ? -1 : 1, false);
                }
            } else {
                this.f8906k = 0;
            }
            m10457r0(coordinatorLayout, t10);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8909n = -1;
        }

        /* loaded from: classes.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C2382a();

            /* renamed from: n */
            int f8913n;

            /* renamed from: o */
            float f8914o;

            /* renamed from: p */
            boolean f8915p;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes.dex */
            static class C2382a implements Parcelable.ClassLoaderCreator<SavedState> {
                C2382a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f8913n = parcel.readInt();
                this.f8914o = parcel.readFloat();
                this.f8915p = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.f8913n);
                parcel.writeFloat(this.f8914o);
                parcel.writeByte(this.f8915p ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes.dex */
    public static class C2388c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f8929a;

        /* renamed from: b */
        Interpolator f8930b;

        public C2388c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8929a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f15001m);
            this.f8929a = obtainStyledAttributes.getInt(C3530l.f15009n, 0);
            int i10 = C3530l.f15017o;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f8930b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int m10491a() {
            return this.f8929a;
        }

        /* renamed from: b */
        public Interpolator m10492b() {
            return this.f8930b;
        }

        /* renamed from: c */
        boolean m10493c() {
            int i10 = this.f8929a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public C2388c(int i10, int i11) {
            super(i10, i11);
            this.f8929a = 1;
        }

        public C2388c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8929a = 1;
        }

        public C2388c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8929a = 1;
        }

        public C2388c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8929a = 1;
        }
    }
}
