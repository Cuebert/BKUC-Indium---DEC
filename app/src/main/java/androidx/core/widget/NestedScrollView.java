package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0656a;
import androidx.core.view.C0678j;
import androidx.core.view.C0680l;
import androidx.core.view.C0683o;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0679k;
import androidx.core.view.InterfaceC0682n;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.C0662e;
import java.util.ArrayList;
import p182o0.C4108a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0682n, InterfaceC0679k {

    /* renamed from: O */
    private static final float f3659O = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: P */
    private static final C0696a f3660P = new C0696a();

    /* renamed from: Q */
    private static final int[] f3661Q = {R.attr.fillViewport};

    /* renamed from: A */
    private boolean f3662A;

    /* renamed from: B */
    private int f3663B;

    /* renamed from: C */
    private int f3664C;

    /* renamed from: D */
    private int f3665D;

    /* renamed from: E */
    private int f3666E;

    /* renamed from: F */
    private final int[] f3667F;

    /* renamed from: G */
    private final int[] f3668G;

    /* renamed from: H */
    private int f3669H;

    /* renamed from: I */
    private int f3670I;

    /* renamed from: J */
    private SavedState f3671J;

    /* renamed from: K */
    private final C0683o f3672K;

    /* renamed from: L */
    private final C0680l f3673L;

    /* renamed from: M */
    private float f3674M;

    /* renamed from: N */
    private InterfaceC0698c f3675N;

    /* renamed from: n */
    private final float f3676n;

    /* renamed from: o */
    private long f3677o;

    /* renamed from: p */
    private final Rect f3678p;

    /* renamed from: q */
    private OverScroller f3679q;

    /* renamed from: r */
    public EdgeEffect f3680r;

    /* renamed from: s */
    public EdgeEffect f3681s;

    /* renamed from: t */
    private int f3682t;

    /* renamed from: u */
    private boolean f3683u;

    /* renamed from: v */
    private boolean f3684v;

    /* renamed from: w */
    private View f3685w;

    /* renamed from: x */
    private boolean f3686x;

    /* renamed from: y */
    private VelocityTracker f3687y;

    /* renamed from: z */
    private boolean f3688z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0695a();

        /* renamed from: n */
        public int f3689n;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        /* loaded from: classes.dex */
        class C0695a implements Parcelable.Creator<SavedState> {
            C0695a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3689n + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3689n);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3689n = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    public static class C0696a extends C0656a {
        C0696a() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: f */
        public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3483f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0662e.m3587a(accessibilityEvent, nestedScrollView.getScrollX());
            C0662e.m3588b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            int scrollRange;
            super.mo3484g(view, c0660c);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0660c.m3532Z(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0660c.m3562r0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0660c.m3535b(C0660c.a.f3547r);
                c0660c.m3535b(C0660c.a.f3515C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0660c.m3535b(C0660c.a.f3546q);
                c0660c.m3535b(C0660c.a.f3517E);
            }
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: j */
        public boolean mo3487j(View view, int i10, Bundle bundle) {
            if (super.mo3487j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m4075P(0, max, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m4075P(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    static class C0697b {
        /* renamed from: a */
        static boolean m4089a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0698c {
        /* renamed from: a */
        void mo665a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4108a.f16677c);
    }

    /* renamed from: A */
    private void m4042A(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3673L.m3760e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    /* renamed from: B */
    private void m4043B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3666E) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3682t = (int) motionEvent.getY(i10);
            this.f3666E = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f3687y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: E */
    private void m4044E() {
        VelocityTracker velocityTracker = this.f3687y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3687y = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m4045F(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3680r
            float r0 = androidx.core.widget.C0702d.m4135b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f3680r
            float r4 = -r4
            float r4 = androidx.core.widget.C0702d.m4137d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3680r
            float r5 = androidx.core.widget.C0702d.m4135b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3680r
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f3681s
            float r0 = androidx.core.widget.C0702d.m4135b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f3681s
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C0702d.m4137d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3681s
            float r5 = androidx.core.widget.C0702d.m4135b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3681s
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4045F(int, float):int");
    }

    /* renamed from: G */
    private void m4046G(boolean z10) {
        if (z10) {
            m4076Q(2, 1);
        } else {
            m4077S(1);
        }
        this.f3670I = getScrollY();
        C0690v.m3835h0(this);
    }

    /* renamed from: H */
    private boolean m4047H(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View m4061n = m4061n(z11, i11, i12);
        if (m4061n == null) {
            m4061n = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m4048I(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (m4061n != findFocus()) {
            m4061n.requestFocus(i10);
        }
        return z10;
    }

    /* renamed from: I */
    private int m4048I(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (i12 == 1) {
            m4076Q(2, i12);
        }
        boolean z11 = false;
        if (m4081h(0, i10, this.f3668G, this.f3667F, i12)) {
            i13 = i10 - this.f3668G[1];
            i14 = this.f3667F[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = m4055c() && !z10;
        boolean z13 = m4071C(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !m4086r(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3668G;
        iArr[1] = 0;
        m4082i(0, scrollY2, 0, i13 - scrollY2, this.f3667F, i12, iArr);
        int i15 = i14 + this.f3667F[1];
        int i16 = i13 - this.f3668G[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                C0702d.m4137d(this.f3680r, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f3681s.isFinished()) {
                    this.f3681s.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            C0702d.m4137d(this.f3681s, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f3680r.isFinished()) {
                this.f3680r.onRelease();
            }
        }
        if (this.f3680r.isFinished() && this.f3681s.isFinished()) {
            z11 = z13;
        } else {
            C0690v.m3835h0(this);
        }
        if (z11 && i12 == 0) {
            this.f3687y.clear();
        }
        if (i12 == 1) {
            m4077S(i12);
            this.f3680r.onRelease();
            this.f3681s.onRelease();
        }
        return i15;
    }

    /* renamed from: J */
    private void m4049J(View view) {
        view.getDrawingRect(this.f3678p);
        offsetDescendantRectToMyCoords(view, this.f3678p);
        int m4079f = m4079f(this.f3678p);
        if (m4079f != 0) {
            scrollBy(0, m4079f);
        }
    }

    /* renamed from: K */
    private boolean m4050K(Rect rect, boolean z10) {
        int m4079f = m4079f(rect);
        boolean z11 = m4079f != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, m4079f);
            } else {
                m4073M(0, m4079f);
            }
        }
        return z11;
    }

    /* renamed from: L */
    private boolean m4051L(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return m4062q(-i10) < C0702d.m4135b(edgeEffect) * ((float) getHeight());
    }

    /* renamed from: N */
    private void m4052N(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3677o > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3679q.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            m4046G(z10);
        } else {
            if (!this.f3679q.isFinished()) {
                m4054a();
            }
            scrollBy(i10, i11);
        }
        this.f3677o = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: R */
    private boolean m4053R(MotionEvent motionEvent) {
        boolean z10;
        if (C0702d.m4135b(this.f3680r) != 0.0f) {
            C0702d.m4137d(this.f3680r, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (C0702d.m4135b(this.f3681s) == 0.0f) {
            return z10;
        }
        C0702d.m4137d(this.f3681s, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: a */
    private void m4054a() {
        this.f3679q.abortAnimation();
        m4077S(1);
    }

    /* renamed from: c */
    private boolean m4055c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m4056d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: e */
    private static int m4057e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3674M == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f3674M = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3674M;
    }

    /* renamed from: j */
    private void m4058j(int i10) {
        if (i10 != 0) {
            if (this.f3662A) {
                m4073M(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    /* renamed from: k */
    private boolean m4059k(int i10) {
        if (C0702d.m4135b(this.f3680r) != 0.0f) {
            if (m4051L(this.f3680r, i10)) {
                this.f3680r.onAbsorb(i10);
            } else {
                m4084o(-i10);
            }
        } else {
            if (C0702d.m4135b(this.f3681s) == 0.0f) {
                return false;
            }
            int i11 = -i10;
            if (m4051L(this.f3681s, i11)) {
                this.f3681s.onAbsorb(i11);
            } else {
                m4084o(i11);
            }
        }
        return true;
    }

    /* renamed from: l */
    private void m4060l() {
        this.f3666E = -1;
        this.f3686x = false;
        m4044E();
        m4077S(0);
        this.f3680r.onRelease();
        this.f3681s.onRelease();
    }

    /* renamed from: n */
    private View m4061n(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: q */
    private float m4062q(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f3676n * 0.015f));
        float f10 = f3659O;
        return (float) (this.f3676n * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    /* renamed from: s */
    private boolean m4063s(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    /* renamed from: t */
    private void m4064t() {
        VelocityTracker velocityTracker = this.f3687y;
        if (velocityTracker == null) {
            this.f3687y = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: u */
    private void m4065u() {
        this.f3679q = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3663B = viewConfiguration.getScaledTouchSlop();
        this.f3664C = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3665D = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: v */
    private void m4066v() {
        if (this.f3687y == null) {
            this.f3687y = VelocityTracker.obtain();
        }
    }

    /* renamed from: w */
    private void m4067w(int i10, int i11) {
        this.f3682t = i10;
        this.f3666E = i11;
        m4076Q(2, 0);
    }

    /* renamed from: x */
    private boolean m4068x(View view) {
        return !m4070z(view, 0, getHeight());
    }

    /* renamed from: y */
    private static boolean m4069y(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m4069y((View) parent, view2);
    }

    /* renamed from: z */
    private boolean m4070z(View view, int i10, int i11) {
        view.getDrawingRect(this.f3678p);
        offsetDescendantRectToMyCoords(view, this.f3678p);
        return this.f3678p.bottom + i10 >= getScrollY() && this.f3678p.top - i10 <= getScrollY() + i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m4071C(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m4086r(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f3679q
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4071C(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: D */
    public boolean m4072D(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f3678p.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3678p;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3678p.top = getScrollY() - height;
            Rect rect2 = this.f3678p;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3678p;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return m4047H(i10, i11, i12);
    }

    /* renamed from: M */
    public final void m4073M(int i10, int i11) {
        m4052N(i10, i11, 250, false);
    }

    /* renamed from: O */
    void m4074O(int i10, int i11, int i12, boolean z10) {
        m4052N(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* renamed from: P */
    void m4075P(int i10, int i11, boolean z10) {
        m4074O(i10, i11, 250, z10);
    }

    /* renamed from: Q */
    public boolean m4076Q(int i10, int i11) {
        return this.f3673L.m3767p(i10, i11);
    }

    /* renamed from: S */
    public void m4077S(int i10) {
        this.f3673L.m3769r(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean m4078b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m4070z(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f3678p);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3678p);
            m4048I(m4079f(this.f3678p), 0, 1, true);
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m4048I(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && m4068x(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3679q.isFinished()) {
            return;
        }
        this.f3679q.computeScrollOffset();
        int currY = this.f3679q.getCurrY();
        int m4080g = m4080g(currY - this.f3670I);
        this.f3670I = currY;
        int[] iArr = this.f3668G;
        boolean z10 = false;
        iArr[1] = 0;
        m4081h(0, m4080g, iArr, null, 1);
        int i10 = m4080g - this.f3668G[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            m4071C(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f3668G;
            iArr2[1] = 0;
            m4082i(0, scrollY2, 0, i11, this.f3667F, 1, iArr2);
            i10 = i11 - this.f3668G[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f3680r.isFinished()) {
                        this.f3680r.onAbsorb((int) this.f3679q.getCurrVelocity());
                    }
                } else if (this.f3681s.isFinished()) {
                    this.f3681s.onAbsorb((int) this.f3679q.getCurrVelocity());
                }
            }
            m4054a();
        }
        if (!this.f3679q.isFinished()) {
            C0690v.m3835h0(this);
        } else {
            m4077S(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m4083m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3673L.m3756a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3673L.m3757b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return m4081h(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3673L.m3761f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f3680r.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C0697b.m4089a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (C0697b.m4089a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f3680r.setSize(width, height);
            if (this.f3680r.draw(canvas)) {
                C0690v.m3835h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f3681s.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (C0697b.m4089a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i11 = 0 + getPaddingLeft();
        }
        if (C0697b.m4089a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3681s.setSize(width2, height2);
        if (this.f3681s.draw(canvas)) {
            C0690v.m3835h0(this);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: f */
    protected int m4079f(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        }
        if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        }
        if (rect.height() > height) {
            i10 = 0 - (i13 - rect.bottom);
        } else {
            i10 = 0 - (scrollY - rect.top);
        }
        return Math.max(i10, -getScrollY());
    }

    /* renamed from: g */
    int m4080g(int i10) {
        int height = getHeight();
        if (i10 > 0 && C0702d.m4135b(this.f3680r) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * C0702d.m4137d(this.f3680r, ((-i10) * 4.0f) / height, 0.5f));
            if (round != i10) {
                this.f3680r.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || C0702d.m4135b(this.f3681s) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int round2 = Math.round((f10 / 4.0f) * C0702d.m4137d(this.f3681s, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            this.f3681s.finish();
        }
        return i10 - round2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3672K.m3770a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean m4081h(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f3673L.m3759d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m4086r(0);
    }

    /* renamed from: i */
    public void m4082i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f3673L.m3760e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3673L.m3764l();
    }

    /* renamed from: m */
    public boolean m4083m(KeyEvent keyEvent) {
        this.f3678p.setEmpty();
        if (!m4056d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            if (!keyEvent.isAltPressed()) {
                return m4078b(33);
            }
            return m4085p(33);
        }
        if (keyCode == 20) {
            if (!keyEvent.isAltPressed()) {
                return m4078b(130);
            }
            return m4085p(130);
        }
        if (keyCode != 62) {
            return false;
        }
        m4072D(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: o */
    public void m4084o(int i10) {
        if (getChildCount() > 0) {
            this.f3679q.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m4046G(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3684v = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        if (motionEvent.getAction() != 8 || this.f3686x) {
            return false;
        }
        if (C0678j.m3751a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (C0678j.m3751a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            f10 = 0.0f;
            i10 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        m4048I(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, C0678j.m3751a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f3686x) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f3666E;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f3682t) > this.f3663B && (2 & getNestedScrollAxes()) == 0) {
                                this.f3686x = true;
                                this.f3682t = y10;
                                m4066v();
                                this.f3687y.addMovement(motionEvent);
                                this.f3669H = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        m4043B(motionEvent);
                    }
                }
            }
            this.f3686x = false;
            this.f3666E = -1;
            m4044E();
            if (this.f3679q.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0690v.m3835h0(this);
            }
            m4077S(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!m4063s((int) motionEvent.getX(), y11)) {
                if (!m4053R(motionEvent) && this.f3679q.isFinished()) {
                    z10 = false;
                }
                this.f3686x = z10;
                m4044E();
            } else {
                this.f3682t = y11;
                this.f3666E = motionEvent.getPointerId(0);
                m4064t();
                this.f3687y.addMovement(motionEvent);
                this.f3679q.computeScrollOffset();
                if (!m4053R(motionEvent) && this.f3679q.isFinished()) {
                    z10 = false;
                }
                this.f3686x = z10;
                m4076Q(2, 0);
            }
        }
        return this.f3686x;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f3683u = false;
        View view = this.f3685w;
        if (view != null && m4069y(view, this)) {
            m4049J(this.f3685w);
        }
        this.f3685w = null;
        if (!this.f3684v) {
            if (this.f3671J != null) {
                scrollTo(getScrollX(), this.f3671J.f3689n);
                this.f3671J = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m4057e = m4057e(scrollY, paddingTop, i14);
            if (m4057e != scrollY) {
                scrollTo(getScrollX(), m4057e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3684v = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3688z && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        m4084o((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        m4081h(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.InterfaceC0682n
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m4042A(i13, i14, iArr);
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f3672K.m3772c(view, view2, i10, i11);
        m4076Q(2, i11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || m4068x(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3671J = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3689n = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC0698c interfaceC0698c = this.f3675N;
        if (interfaceC0698c != null) {
            interfaceC0698c.mo665a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m4070z(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f3678p);
        offsetDescendantRectToMyCoords(findFocus, this.f3678p);
        m4058j(m4079f(this.f3678p));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // androidx.core.view.InterfaceC0681m
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onStopNestedScroll(View view, int i10) {
        this.f3672K.m3774e(view, i10);
        m4077S(i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m4066v();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3669H = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f3669H);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3687y;
                velocityTracker.computeCurrentVelocity(1000, this.f3665D);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3666E);
                if (Math.abs(yVelocity) >= this.f3664C) {
                    if (!m4059k(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            m4084o(i10);
                        }
                    }
                } else if (this.f3679q.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0690v.m3835h0(this);
                }
                m4060l();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3666E);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3666E + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f3682t - y10;
                    int m4045F = i11 - m4045F(i11, motionEvent.getX(findPointerIndex));
                    if (!this.f3686x && Math.abs(m4045F) > this.f3663B) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3686x = true;
                        m4045F = m4045F > 0 ? m4045F - this.f3663B : m4045F + this.f3663B;
                    }
                    if (this.f3686x) {
                        int m4048I = m4048I(m4045F, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f3682t = y10 - m4048I;
                        this.f3669H += m4048I;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3686x && getChildCount() > 0 && this.f3679q.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0690v.m3835h0(this);
                }
                m4060l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3682t = (int) motionEvent.getY(actionIndex);
                this.f3666E = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m4043B(motionEvent);
                this.f3682t = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3666E));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3686x && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3679q.isFinished()) {
                m4054a();
            }
            m4067w((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f3687y;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public boolean m4085p(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f3678p;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3678p.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3678p;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3678p;
        return m4047H(i10, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean m4086r(int i10) {
        return this.f3673L.m3763k(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3683u) {
            m4049J(view2);
        } else {
            this.f3685w = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m4050K(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            m4044E();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3683u = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m4057e = m4057e(i10, width, width2);
            int m4057e2 = m4057e(i11, height, height2);
            if (m4057e == getScrollX() && m4057e2 == getScrollY()) {
                return;
            }
            super.scrollTo(m4057e, m4057e2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f3688z) {
            this.f3688z = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f3673L.m3765m(z10);
    }

    public void setOnScrollChangeListener(InterfaceC0698c interfaceC0698c) {
        this.f3675N = interfaceC0698c;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f3662A = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return m4076Q(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m4077S(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3678p = new Rect();
        this.f3683u = true;
        this.f3684v = false;
        this.f3685w = null;
        this.f3686x = false;
        this.f3662A = true;
        this.f3666E = -1;
        this.f3667F = new int[2];
        this.f3668G = new int[2];
        this.f3680r = C0702d.m4134a(context, attributeSet);
        this.f3681s = C0702d.m4134a(context, attributeSet);
        this.f3676n = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m4065u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3661Q, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3672K = new C0683o(this);
        this.f3673L = new C0680l(this);
        setNestedScrollingEnabled(true);
        C0690v.m3853q0(this, f3660P);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        m4042A(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m4042A(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
