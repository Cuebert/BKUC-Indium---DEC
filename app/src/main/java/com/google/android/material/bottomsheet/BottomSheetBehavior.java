package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.InterfaceC0663f;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C2489l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3528j;
import p111i4.C3529k;
import p111i4.C3530l;
import p207q0.C4291a;
import p272v4.C4981c;
import p306y0.C5591c;
import p310y4.C5888g;
import p310y4.C5892k;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0559c<V> {

    /* renamed from: Y */
    private static final int f9065Y = C3529k.f14696f;

    /* renamed from: A */
    float f9066A;

    /* renamed from: B */
    int f9067B;

    /* renamed from: C */
    float f9068C;

    /* renamed from: D */
    boolean f9069D;

    /* renamed from: E */
    private boolean f9070E;

    /* renamed from: F */
    private boolean f9071F;

    /* renamed from: G */
    int f9072G;

    /* renamed from: H */
    C5591c f9073H;

    /* renamed from: I */
    private boolean f9074I;

    /* renamed from: J */
    private int f9075J;

    /* renamed from: K */
    private boolean f9076K;

    /* renamed from: L */
    private int f9077L;

    /* renamed from: M */
    int f9078M;

    /* renamed from: N */
    int f9079N;

    /* renamed from: O */
    WeakReference<V> f9080O;

    /* renamed from: P */
    WeakReference<View> f9081P;

    /* renamed from: Q */
    private final ArrayList<AbstractC2419g> f9082Q;

    /* renamed from: R */
    private VelocityTracker f9083R;

    /* renamed from: S */
    int f9084S;

    /* renamed from: T */
    private int f9085T;

    /* renamed from: U */
    boolean f9086U;

    /* renamed from: V */
    private Map<View, Integer> f9087V;

    /* renamed from: W */
    private int f9088W;

    /* renamed from: X */
    private final C5591c.c f9089X;

    /* renamed from: a */
    private int f9090a;

    /* renamed from: b */
    private boolean f9091b;

    /* renamed from: c */
    private boolean f9092c;

    /* renamed from: d */
    private float f9093d;

    /* renamed from: e */
    private int f9094e;

    /* renamed from: f */
    private boolean f9095f;

    /* renamed from: g */
    private int f9096g;

    /* renamed from: h */
    private int f9097h;

    /* renamed from: i */
    private boolean f9098i;

    /* renamed from: j */
    private C5888g f9099j;

    /* renamed from: k */
    private int f9100k;

    /* renamed from: l */
    private int f9101l;

    /* renamed from: m */
    private boolean f9102m;

    /* renamed from: n */
    private boolean f9103n;

    /* renamed from: o */
    private boolean f9104o;

    /* renamed from: p */
    private boolean f9105p;

    /* renamed from: q */
    private boolean f9106q;

    /* renamed from: r */
    private int f9107r;

    /* renamed from: s */
    private int f9108s;

    /* renamed from: t */
    private C5892k f9109t;

    /* renamed from: u */
    private boolean f9110u;

    /* renamed from: v */
    private BottomSheetBehavior<V>.RunnableC2420h f9111v;

    /* renamed from: w */
    private ValueAnimator f9112w;

    /* renamed from: x */
    int f9113x;

    /* renamed from: y */
    int f9114y;

    /* renamed from: z */
    int f9115z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    class RunnableC2413a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f9121n;

        /* renamed from: o */
        final /* synthetic */ ViewGroup.LayoutParams f9122o;

        RunnableC2413a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f9121n = view;
            this.f9122o = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9121n.setLayoutParams(this.f9122o);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public class RunnableC2414b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f9124n;

        /* renamed from: o */
        final /* synthetic */ int f9125o;

        RunnableC2414b(View view, int i10) {
            this.f9124n = view;
            this.f9125o = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m10703v0(this.f9124n, this.f9125o);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    public class C2415c implements ValueAnimator.AnimatorUpdateListener {
        C2415c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f9099j != null) {
                BottomSheetBehavior.this.f9099j.m20836Y(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes.dex */
    public class C2416d implements C2489l.c {

        /* renamed from: a */
        final /* synthetic */ boolean f9128a;

        C2416d(boolean z10) {
            this.f9128a = z10;
        }

        @Override // com.google.android.material.internal.C2489l.c
        /* renamed from: a */
        public C0675g0 mo10709a(View view, C0675g0 c0675g0, C2489l.d dVar) {
            BottomSheetBehavior.this.f9108s = c0675g0.m3669l();
            boolean m11382d = C2489l.m11382d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f9103n) {
                BottomSheetBehavior.this.f9107r = c0675g0.m3666i();
                paddingBottom = dVar.f9668d + BottomSheetBehavior.this.f9107r;
            }
            if (BottomSheetBehavior.this.f9104o) {
                paddingLeft = (m11382d ? dVar.f9667c : dVar.f9665a) + c0675g0.m3667j();
            }
            if (BottomSheetBehavior.this.f9105p) {
                paddingRight = (m11382d ? dVar.f9665a : dVar.f9667c) + c0675g0.m3668k();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f9128a) {
                BottomSheetBehavior.this.f9101l = c0675g0.m3664g().f3322d;
            }
            if (BottomSheetBehavior.this.f9103n || this.f9128a) {
                BottomSheetBehavior.this.m10657C0(false);
            }
            return c0675g0;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes.dex */
    class C2417e extends C5591c.c {
        C2417e() {
        }

        /* renamed from: n */
        private boolean m10710n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f9079N + bottomSheetBehavior.m10688b0()) / 2;
        }

        @Override // p306y0.C5591c.c
        /* renamed from: a */
        public int mo10583a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // p306y0.C5591c.c
        /* renamed from: b */
        public int mo10584b(View view, int i10, int i11) {
            int m10688b0 = BottomSheetBehavior.this.m10688b0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C4291a.m17788b(i10, m10688b0, bottomSheetBehavior.f9069D ? bottomSheetBehavior.f9079N : bottomSheetBehavior.f9067B);
        }

        @Override // p306y0.C5591c.c
        /* renamed from: e */
        public int mo10711e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f9069D) {
                return bottomSheetBehavior.f9079N;
            }
            return bottomSheetBehavior.f9067B;
        }

        @Override // p306y0.C5591c.c
        /* renamed from: j */
        public void mo10587j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f9071F) {
                BottomSheetBehavior.this.m10702t0(1);
            }
        }

        @Override // p306y0.C5591c.c
        /* renamed from: k */
        public void mo10588k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.m10686Z(i11);
        }

        @Override // p306y0.C5591c.c
        /* renamed from: l */
        public void mo10589l(View view, float f10, float f11) {
            int i10;
            int i11 = 4;
            if (f11 < 0.0f) {
                if (BottomSheetBehavior.this.f9091b) {
                    i10 = BottomSheetBehavior.this.f9114y;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i12 = bottomSheetBehavior.f9115z;
                    if (top > i12) {
                        i10 = i12;
                        i11 = 6;
                    } else {
                        i10 = bottomSheetBehavior.m10688b0();
                    }
                }
                i11 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f9069D && bottomSheetBehavior2.m10704x0(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > 500.0f) || m10710n(view)) {
                        i10 = BottomSheetBehavior.this.f9079N;
                        i11 = 5;
                    } else {
                        if (BottomSheetBehavior.this.f9091b) {
                            i10 = BottomSheetBehavior.this.f9114y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.m10688b0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f9115z)) {
                            i10 = BottomSheetBehavior.this.m10688b0();
                        } else {
                            i10 = BottomSheetBehavior.this.f9115z;
                            i11 = 6;
                        }
                        i11 = 3;
                    }
                } else if (f11 != 0.0f && Math.abs(f10) <= Math.abs(f11)) {
                    if (BottomSheetBehavior.this.f9091b) {
                        i10 = BottomSheetBehavior.this.f9067B;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f9115z) < Math.abs(top2 - BottomSheetBehavior.this.f9067B)) {
                            i10 = BottomSheetBehavior.this.f9115z;
                            i11 = 6;
                        } else {
                            i10 = BottomSheetBehavior.this.f9067B;
                        }
                    }
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f9091b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f9114y) < Math.abs(top3 - BottomSheetBehavior.this.f9067B)) {
                            i10 = BottomSheetBehavior.this.f9114y;
                            i11 = 3;
                        } else {
                            i10 = BottomSheetBehavior.this.f9067B;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i13 = bottomSheetBehavior3.f9115z;
                        if (top3 < i13) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.f9067B)) {
                                i10 = BottomSheetBehavior.this.m10688b0();
                                i11 = 3;
                            } else {
                                i10 = BottomSheetBehavior.this.f9115z;
                            }
                        } else if (Math.abs(top3 - i13) < Math.abs(top3 - BottomSheetBehavior.this.f9067B)) {
                            i10 = BottomSheetBehavior.this.f9115z;
                        } else {
                            i10 = BottomSheetBehavior.this.f9067B;
                        }
                        i11 = 6;
                    }
                }
            }
            BottomSheetBehavior.this.m10705y0(view, i11, i10, true);
        }

        @Override // p306y0.C5591c.c
        /* renamed from: m */
        public boolean mo10590m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f9072G;
            if (i11 == 1 || bottomSheetBehavior.f9086U) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f9084S == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f9081P;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f9080O;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes.dex */
    public class C2418f implements InterfaceC0663f {

        /* renamed from: a */
        final /* synthetic */ int f9131a;

        C2418f(int i10) {
            this.f9131a = i10;
        }

        @Override // androidx.core.view.accessibility.InterfaceC0663f
        /* renamed from: a */
        public boolean mo3595a(View view, InterfaceC0663f.a aVar) {
            BottomSheetBehavior.this.m10701s0(this.f9131a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2419g {
        /* renamed from: a */
        public abstract void m10712a(View view, float f10);

        /* renamed from: b */
        public abstract void m10713b(View view, int i10);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    /* loaded from: classes.dex */
    public class RunnableC2420h implements Runnable {

        /* renamed from: n */
        private final View f9133n;

        /* renamed from: o */
        private boolean f9134o;

        /* renamed from: p */
        int f9135p;

        RunnableC2420h(View view, int i10) {
            this.f9133n = view;
            this.f9135p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5591c c5591c = BottomSheetBehavior.this.f9073H;
            if (c5591c != null && c5591c.m20602k(true)) {
                C0690v.m3837i0(this.f9133n, this);
            } else {
                BottomSheetBehavior.this.m10702t0(this.f9135p);
            }
            this.f9134o = false;
        }
    }

    public BottomSheetBehavior() {
        this.f9090a = 0;
        this.f9091b = true;
        this.f9092c = false;
        this.f9100k = -1;
        this.f9111v = null;
        this.f9066A = 0.5f;
        this.f9068C = -1.0f;
        this.f9071F = true;
        this.f9072G = 4;
        this.f9082Q = new ArrayList<>();
        this.f9088W = -1;
        this.f9089X = new C2417e();
    }

    /* renamed from: A0 */
    private void m10655A0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f9110u != z10) {
            this.f9110u = z10;
            if (this.f9099j == null || (valueAnimator = this.f9112w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f9112w.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f9112w.setFloatValues(1.0f - f10, f10);
            this.f9112w.start();
        }
    }

    /* renamed from: B0 */
    private void m10656B0(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f9080O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f9087V != null) {
                    return;
                } else {
                    this.f9087V = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f9080O.get()) {
                    if (z10) {
                        this.f9087V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f9092c) {
                            C0690v.m3871z0(childAt, 4);
                        }
                    } else if (this.f9092c && (map = this.f9087V) != null && map.containsKey(childAt)) {
                        C0690v.m3871z0(childAt, this.f9087V.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f9087V = null;
            } else if (this.f9092c) {
                this.f9080O.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* renamed from: C0 */
    public void m10657C0(boolean z10) {
        V v10;
        if (this.f9080O != null) {
            m10672S();
            if (this.f9072G != 4 || (v10 = this.f9080O.get()) == null) {
                return;
            }
            if (z10) {
                m10684w0(this.f9072G);
            } else {
                v10.requestLayout();
            }
        }
    }

    /* renamed from: R */
    private int m10671R(V v10, int i10, int i11) {
        return C0690v.m3824c(v10, v10.getResources().getString(i10), m10675V(i11));
    }

    /* renamed from: S */
    private void m10672S() {
        int m10674U = m10674U();
        if (this.f9091b) {
            this.f9067B = Math.max(this.f9079N - m10674U, this.f9114y);
        } else {
            this.f9067B = this.f9079N - m10674U;
        }
    }

    /* renamed from: T */
    private void m10673T() {
        this.f9115z = (int) (this.f9079N * (1.0f - this.f9066A));
    }

    /* renamed from: U */
    private int m10674U() {
        int i10;
        if (this.f9095f) {
            return Math.min(Math.max(this.f9096g, this.f9079N - ((this.f9078M * 9) / 16)), this.f9077L) + this.f9107r;
        }
        if (!this.f9102m && !this.f9103n && (i10 = this.f9101l) > 0) {
            return Math.max(this.f9094e, i10 + this.f9097h);
        }
        return this.f9094e + this.f9107r;
    }

    /* renamed from: V */
    private InterfaceC0663f m10675V(int i10) {
        return new C2418f(i10);
    }

    /* renamed from: W */
    private void m10676W(Context context, AttributeSet attributeSet, boolean z10) {
        m10677X(context, attributeSet, z10, null);
    }

    /* renamed from: X */
    private void m10677X(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f9098i) {
            this.f9109t = C5892k.m20866e(context, attributeSet, C3520b.f14517c, f9065Y).m20906m();
            C5888g c5888g = new C5888g(this.f9109t);
            this.f9099j = c5888g;
            c5888g.m20828M(context);
            if (z10 && colorStateList != null) {
                this.f9099j.m20835X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f9099j.setTint(typedValue.data);
        }
    }

    /* renamed from: Y */
    private void m10678Y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9112w = ofFloat;
        ofFloat.setDuration(500L);
        this.f9112w.addUpdateListener(new C2415c());
    }

    /* renamed from: c0 */
    private float m10679c0() {
        VelocityTracker velocityTracker = this.f9083R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f9093d);
        return this.f9083R.getYVelocity(this.f9084S);
    }

    /* renamed from: e0 */
    private void m10680e0(V v10, C0660c.a aVar, int i10) {
        C0690v.m3845m0(v10, aVar, null, m10675V(i10));
    }

    /* renamed from: f0 */
    private void m10681f0() {
        this.f9084S = -1;
        VelocityTracker velocityTracker = this.f9083R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9083R = null;
        }
    }

    /* renamed from: g0 */
    private void m10682g0(SavedState savedState) {
        int i10 = this.f9090a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f9094e = savedState.f9117o;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f9091b = savedState.f9118p;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f9069D = savedState.f9119q;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f9070E = savedState.f9120r;
        }
    }

    /* renamed from: u0 */
    private void m10683u0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || m10689d0() || this.f9095f) ? false : true;
        if (this.f9103n || this.f9104o || this.f9105p || z10) {
            C2489l.m11379a(view, new C2416d(z10));
        }
    }

    /* renamed from: w0 */
    private void m10684w0(int i10) {
        V v10 = this.f9080O.get();
        if (v10 == null) {
            return;
        }
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && C0690v.m3813T(v10)) {
            v10.post(new RunnableC2414b(v10, i10));
        } else {
            m10703v0(v10, i10);
        }
    }

    /* renamed from: z0 */
    private void m10685z0() {
        V v10;
        WeakReference<V> weakReference = this.f9080O;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        C0690v.m3841k0(v10, 524288);
        C0690v.m3841k0(v10, 262144);
        C0690v.m3841k0(v10, 1048576);
        int i10 = this.f9088W;
        if (i10 != -1) {
            C0690v.m3841k0(v10, i10);
        }
        if (!this.f9091b && this.f9072G != 6) {
            this.f9088W = m10671R(v10, C3528j.f14671a, 6);
        }
        if (this.f9069D && this.f9072G != 5) {
            m10680e0(v10, C0660c.a.f3554y, 5);
        }
        int i11 = this.f9072G;
        if (i11 == 3) {
            m10680e0(v10, C0660c.a.f3553x, this.f9091b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            m10680e0(v10, C0660c.a.f3552w, this.f9091b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            m10680e0(v10, C0660c.a.f3553x, 4);
            m10680e0(v10, C0660c.a.f3552w, 3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: A */
    public boolean mo2658A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f9075J = 0;
        this.f9076K = false;
        return (i10 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: C */
    public void mo2660C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        int i11;
        int i12 = 3;
        if (v10.getTop() == m10688b0()) {
            m10702t0(3);
            return;
        }
        WeakReference<View> weakReference = this.f9081P;
        if (weakReference != null && view == weakReference.get() && this.f9076K) {
            if (this.f9075J > 0) {
                if (this.f9091b) {
                    i11 = this.f9114y;
                } else {
                    int top = v10.getTop();
                    int i13 = this.f9115z;
                    if (top > i13) {
                        i11 = i13;
                        i12 = 6;
                    } else {
                        i11 = m10688b0();
                    }
                }
            } else if (this.f9069D && m10704x0(v10, m10679c0())) {
                i11 = this.f9079N;
                i12 = 5;
            } else if (this.f9075J == 0) {
                int top2 = v10.getTop();
                if (this.f9091b) {
                    if (Math.abs(top2 - this.f9114y) < Math.abs(top2 - this.f9067B)) {
                        i11 = this.f9114y;
                    } else {
                        i11 = this.f9067B;
                        i12 = 4;
                    }
                } else {
                    int i14 = this.f9115z;
                    if (top2 < i14) {
                        if (top2 < Math.abs(top2 - this.f9067B)) {
                            i11 = m10688b0();
                        } else {
                            i11 = this.f9115z;
                        }
                    } else if (Math.abs(top2 - i14) < Math.abs(top2 - this.f9067B)) {
                        i11 = this.f9115z;
                    } else {
                        i11 = this.f9067B;
                        i12 = 4;
                    }
                    i12 = 6;
                }
            } else {
                if (this.f9091b) {
                    i11 = this.f9067B;
                } else {
                    int top3 = v10.getTop();
                    if (Math.abs(top3 - this.f9115z) < Math.abs(top3 - this.f9067B)) {
                        i11 = this.f9115z;
                        i12 = 6;
                    } else {
                        i11 = this.f9067B;
                    }
                }
                i12 = 4;
            }
            m10705y0(v10, i12, i11, false);
            this.f9076K = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: D */
    public boolean mo2661D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9072G == 1 && actionMasked == 0) {
            return true;
        }
        C5591c c5591c = this.f9073H;
        if (c5591c != null) {
            c5591c.m20608z(motionEvent);
        }
        if (actionMasked == 0) {
            m10681f0();
        }
        if (this.f9083R == null) {
            this.f9083R = VelocityTracker.obtain();
        }
        this.f9083R.addMovement(motionEvent);
        if (this.f9073H != null && actionMasked == 2 && !this.f9074I && Math.abs(this.f9085T - motionEvent.getY()) > this.f9073H.m20604u()) {
            this.f9073H.m20601b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f9074I;
    }

    /* renamed from: Z */
    void m10686Z(int i10) {
        float f10;
        float f11;
        V v10 = this.f9080O.get();
        if (v10 == null || this.f9082Q.isEmpty()) {
            return;
        }
        int i11 = this.f9067B;
        if (i10 <= i11 && i11 != m10688b0()) {
            int i12 = this.f9067B;
            f10 = i12 - i10;
            f11 = i12 - m10688b0();
        } else {
            int i13 = this.f9067B;
            f10 = i13 - i10;
            f11 = this.f9079N - i13;
        }
        float f12 = f10 / f11;
        for (int i14 = 0; i14 < this.f9082Q.size(); i14++) {
            this.f9082Q.get(i14).m10712a(v10, f12);
        }
    }

    /* renamed from: a0 */
    View m10687a0(View view) {
        if (C0690v.m3815V(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View m10687a0 = m10687a0(viewGroup.getChildAt(i10));
            if (m10687a0 != null) {
                return m10687a0;
            }
        }
        return null;
    }

    /* renamed from: b0 */
    public int m10688b0() {
        if (this.f9091b) {
            return this.f9114y;
        }
        return Math.max(this.f9113x, this.f9106q ? 0 : this.f9108s);
    }

    /* renamed from: d0 */
    public boolean m10689d0() {
        return this.f9102m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: g */
    public void mo2668g(CoordinatorLayout.C0562f c0562f) {
        super.mo2668g(c0562f);
        this.f9080O = null;
        this.f9073H = null;
    }

    /* renamed from: h0 */
    public void m10690h0(boolean z10) {
        this.f9071F = z10;
    }

    /* renamed from: i0 */
    public void m10691i0(int i10) {
        if (i10 >= 0) {
            this.f9113x = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: j */
    public void mo2671j() {
        super.mo2671j();
        this.f9080O = null;
        this.f9073H = null;
    }

    /* renamed from: j0 */
    public void m10692j0(boolean z10) {
        if (this.f9091b == z10) {
            return;
        }
        this.f9091b = z10;
        if (this.f9080O != null) {
            m10672S();
        }
        m10702t0((this.f9091b && this.f9072G == 6) ? 3 : this.f9072G);
        m10685z0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: k */
    public boolean mo2672k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        C5591c c5591c;
        if (v10.isShown() && this.f9071F) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m10681f0();
            }
            if (this.f9083R == null) {
                this.f9083R = VelocityTracker.obtain();
            }
            this.f9083R.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x10 = (int) motionEvent.getX();
                this.f9085T = (int) motionEvent.getY();
                if (this.f9072G != 2) {
                    WeakReference<View> weakReference = this.f9081P;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.m2654v(view, x10, this.f9085T)) {
                        this.f9084S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f9086U = true;
                    }
                }
                this.f9074I = this.f9084S == -1 && !coordinatorLayout.m2654v(v10, x10, this.f9085T);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f9086U = false;
                this.f9084S = -1;
                if (this.f9074I) {
                    this.f9074I = false;
                    return false;
                }
            }
            if (!this.f9074I && (c5591c = this.f9073H) != null && c5591c.m20597G(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f9081P;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.f9074I || this.f9072G == 1 || coordinatorLayout.m2654v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9073H == null || Math.abs(((float) this.f9085T) - motionEvent.getY()) <= ((float) this.f9073H.m20604u())) ? false : true;
        }
        this.f9074I = true;
        return false;
    }

    /* renamed from: k0 */
    public void m10693k0(boolean z10) {
        this.f9102m = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: l */
    public boolean mo2673l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        C5888g c5888g;
        if (C0690v.m3785B(coordinatorLayout) && !C0690v.m3785B(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f9080O == null) {
            this.f9096g = coordinatorLayout.getResources().getDimensionPixelSize(C3522d.f14575b);
            m10683u0(v10);
            this.f9080O = new WeakReference<>(v10);
            if (this.f9098i && (c5888g = this.f9099j) != null) {
                C0690v.m3859t0(v10, c5888g);
            }
            C5888g c5888g2 = this.f9099j;
            if (c5888g2 != null) {
                float f10 = this.f9068C;
                if (f10 == -1.0f) {
                    f10 = C0690v.m3868y(v10);
                }
                c5888g2.m20834W(f10);
                boolean z10 = this.f9072G == 3;
                this.f9110u = z10;
                this.f9099j.m20836Y(z10 ? 0.0f : 1.0f);
            }
            m10685z0();
            if (C0690v.m3787C(v10) == 0) {
                C0690v.m3871z0(v10, 1);
            }
            int measuredWidth = v10.getMeasuredWidth();
            int i11 = this.f9100k;
            if (measuredWidth > i11 && i11 != -1) {
                ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
                layoutParams.width = this.f9100k;
                v10.post(new RunnableC2413a(v10, layoutParams));
            }
        }
        if (this.f9073H == null) {
            this.f9073H = C5591c.m20587m(coordinatorLayout, this.f9089X);
        }
        int top = v10.getTop();
        coordinatorLayout.m2636C(v10, i10);
        this.f9078M = coordinatorLayout.getWidth();
        this.f9079N = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f9077L = height;
        int i12 = this.f9079N;
        int i13 = i12 - height;
        int i14 = this.f9108s;
        if (i13 < i14) {
            if (this.f9106q) {
                this.f9077L = i12;
            } else {
                this.f9077L = i12 - i14;
            }
        }
        this.f9114y = Math.max(0, i12 - this.f9077L);
        m10673T();
        m10672S();
        int i15 = this.f9072G;
        if (i15 == 3) {
            C0690v.m3823b0(v10, m10688b0());
        } else if (i15 == 6) {
            C0690v.m3823b0(v10, this.f9115z);
        } else if (this.f9069D && i15 == 5) {
            C0690v.m3823b0(v10, this.f9079N);
        } else if (i15 == 4) {
            C0690v.m3823b0(v10, this.f9067B);
        } else if (i15 == 1 || i15 == 2) {
            C0690v.m3823b0(v10, top - v10.getTop());
        }
        this.f9081P = new WeakReference<>(m10687a0(v10));
        return true;
    }

    /* renamed from: l0 */
    public void m10694l0(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f9066A = f10;
            if (this.f9080O != null) {
                m10673T();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* renamed from: m0 */
    public void m10695m0(boolean z10) {
        if (this.f9069D != z10) {
            this.f9069D = z10;
            if (!z10 && this.f9072G == 5) {
                m10701s0(4);
            }
            m10685z0();
        }
    }

    /* renamed from: n0 */
    public void m10696n0(int i10) {
        this.f9100k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: o */
    public boolean mo2676o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference = this.f9081P;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f9072G != 3 || super.mo2676o(coordinatorLayout, v10, view, f10, f11);
    }

    /* renamed from: o0 */
    public void m10697o0(int i10) {
        m10698p0(i10, false);
    }

    /* renamed from: p0 */
    public final void m10698p0(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f9095f) {
                this.f9095f = true;
            }
            z11 = false;
        } else {
            if (this.f9095f || this.f9094e != i10) {
                this.f9095f = false;
                this.f9094e = Math.max(0, i10);
            }
            z11 = false;
        }
        if (z11) {
            m10657C0(z10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: q */
    public void mo2678q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f9081P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < m10688b0()) {
                iArr[1] = top - m10688b0();
                C0690v.m3823b0(v10, -iArr[1]);
                m10702t0(3);
            } else {
                if (!this.f9071F) {
                    return;
                }
                iArr[1] = i11;
                C0690v.m3823b0(v10, -i11);
                m10702t0(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i14 = this.f9067B;
            if (i13 > i14 && !this.f9069D) {
                iArr[1] = top - i14;
                C0690v.m3823b0(v10, -iArr[1]);
                m10702t0(4);
            } else {
                if (!this.f9071F) {
                    return;
                }
                iArr[1] = i11;
                C0690v.m3823b0(v10, -i11);
                m10702t0(1);
            }
        }
        m10686Z(v10.getTop());
        this.f9075J = i11;
        this.f9076K = true;
    }

    /* renamed from: q0 */
    public void m10699q0(int i10) {
        this.f9090a = i10;
    }

    /* renamed from: r0 */
    public void m10700r0(boolean z10) {
        this.f9070E = z10;
    }

    /* renamed from: s0 */
    public void m10701s0(int i10) {
        if (i10 == this.f9072G) {
            return;
        }
        if (this.f9080O == null) {
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f9069D && i10 == 5)) {
                this.f9072G = i10;
                return;
            }
            return;
        }
        m10684w0(i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: t */
    public void mo2681t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    /* renamed from: t0 */
    void m10702t0(int i10) {
        V v10;
        if (this.f9072G == i10) {
            return;
        }
        this.f9072G = i10;
        WeakReference<V> weakReference = this.f9080O;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            m10656B0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            m10656B0(false);
        }
        m10655A0(i10);
        for (int i11 = 0; i11 < this.f9082Q.size(); i11++) {
            this.f9082Q.get(i11).m10713b(v10, i10);
        }
        m10685z0();
    }

    /* renamed from: v0 */
    void m10703v0(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.f9067B;
        } else if (i10 == 6) {
            int i13 = this.f9115z;
            if (!this.f9091b || i13 > (i12 = this.f9114y)) {
                i11 = i13;
            } else {
                i11 = i12;
                i10 = 3;
            }
        } else if (i10 == 3) {
            i11 = m10688b0();
        } else if (this.f9069D && i10 == 5) {
            i11 = this.f9079N;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i10);
        }
        m10705y0(view, i10, i11, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: x */
    public void mo2685x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2685x(coordinatorLayout, v10, savedState.getSuperState());
        m10682g0(savedState);
        int i10 = savedState.f9116n;
        if (i10 != 1 && i10 != 2) {
            this.f9072G = i10;
        } else {
            this.f9072G = 4;
        }
    }

    /* renamed from: x0 */
    boolean m10704x0(View view, float f10) {
        if (this.f9070E) {
            return true;
        }
        if (view.getTop() < this.f9067B) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f9067B)) / ((float) m10674U()) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: y */
    public Parcelable mo2686y(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.mo2686y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: y0 */
    void m10705y0(View view, int i10, int i11, boolean z10) {
        C5591c c5591c = this.f9073H;
        if (c5591c != null && (!z10 ? !c5591c.m20598H(view, view.getLeft(), i11) : !c5591c.m20596F(view.getLeft(), i11))) {
            m10702t0(2);
            m10655A0(i10);
            if (this.f9111v == null) {
                this.f9111v = new RunnableC2420h(view, i10);
            }
            if (!((RunnableC2420h) this.f9111v).f9134o) {
                BottomSheetBehavior<V>.RunnableC2420h runnableC2420h = this.f9111v;
                runnableC2420h.f9135p = i10;
                C0690v.m3837i0(view, runnableC2420h);
                ((RunnableC2420h) this.f9111v).f9134o = true;
                return;
            }
            this.f9111v.f9135p = i10;
            return;
        }
        m10702t0(i10);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2412a();

        /* renamed from: n */
        final int f9116n;

        /* renamed from: o */
        int f9117o;

        /* renamed from: p */
        boolean f9118p;

        /* renamed from: q */
        boolean f9119q;

        /* renamed from: r */
        boolean f9120r;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes.dex */
        static class C2412a implements Parcelable.ClassLoaderCreator<SavedState> {
            C2412a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f9116n = parcel.readInt();
            this.f9117o = parcel.readInt();
            this.f9118p = parcel.readInt() == 1;
            this.f9119q = parcel.readInt() == 1;
            this.f9120r = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9116n);
            parcel.writeInt(this.f9117o);
            parcel.writeInt(this.f9118p ? 1 : 0);
            parcel.writeInt(this.f9119q ? 1 : 0);
            parcel.writeInt(this.f9120r ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9116n = bottomSheetBehavior.f9072G;
            this.f9117o = ((BottomSheetBehavior) bottomSheetBehavior).f9094e;
            this.f9118p = ((BottomSheetBehavior) bottomSheetBehavior).f9091b;
            this.f9119q = bottomSheetBehavior.f9069D;
            this.f9120r = ((BottomSheetBehavior) bottomSheetBehavior).f9070E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f9090a = 0;
        this.f9091b = true;
        this.f9092c = false;
        this.f9100k = -1;
        this.f9111v = null;
        this.f9066A = 0.5f;
        this.f9068C = -1.0f;
        this.f9071F = true;
        this.f9072G = 4;
        this.f9082Q = new ArrayList<>();
        this.f9088W = -1;
        this.f9089X = new C2417e();
        this.f9097h = context.getResources().getDimensionPixelSize(C3522d.f14567U);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14754F);
        this.f9098i = obtainStyledAttributes.hasValue(C3530l.f14877W);
        int i11 = C3530l.f14778I;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            m10677X(context, attributeSet, hasValue, C4981c.m19404a(context, obtainStyledAttributes, i11));
        } else {
            m10676W(context, attributeSet, hasValue);
        }
        m10678Y();
        this.f9068C = obtainStyledAttributes.getDimension(C3530l.f14770H, -1.0f);
        int i12 = C3530l.f14762G;
        if (obtainStyledAttributes.hasValue(i12)) {
            m10696n0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = C3530l.f14821O;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i13);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            m10697o0(i10);
        } else {
            m10697o0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        m10695m0(obtainStyledAttributes.getBoolean(C3530l.f14814N, false));
        m10693k0(obtainStyledAttributes.getBoolean(C3530l.f14842R, false));
        m10692j0(obtainStyledAttributes.getBoolean(C3530l.f14800L, true));
        m10700r0(obtainStyledAttributes.getBoolean(C3530l.f14835Q, false));
        m10690h0(obtainStyledAttributes.getBoolean(C3530l.f14786J, true));
        m10699q0(obtainStyledAttributes.getInt(C3530l.f14828P, 0));
        m10694l0(obtainStyledAttributes.getFloat(C3530l.f14807M, 0.5f));
        int i14 = C3530l.f14793K;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i14);
        if (peekValue2 != null && peekValue2.type == 16) {
            m10691i0(peekValue2.data);
        } else {
            m10691i0(obtainStyledAttributes.getDimensionPixelOffset(i14, 0));
        }
        this.f9103n = obtainStyledAttributes.getBoolean(C3530l.f14849S, false);
        this.f9104o = obtainStyledAttributes.getBoolean(C3530l.f14856T, false);
        this.f9105p = obtainStyledAttributes.getBoolean(C3530l.f14863U, false);
        this.f9106q = obtainStyledAttributes.getBoolean(C3530l.f14870V, true);
        obtainStyledAttributes.recycle();
        this.f9093d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
