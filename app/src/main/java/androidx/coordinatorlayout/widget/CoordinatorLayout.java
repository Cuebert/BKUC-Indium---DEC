package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0587a;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.util.C0649c;
import androidx.core.util.C0653g;
import androidx.core.util.InterfaceC0651e;
import androidx.core.view.C0670e;
import androidx.core.view.C0675g0;
import androidx.core.view.C0683o;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0681m;
import androidx.core.view.InterfaceC0682n;
import androidx.core.view.InterfaceC0684p;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p170n0.C4006a;
import p170n0.C4007b;
import p170n0.C4008c;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0681m, InterfaceC0682n {

    /* renamed from: H */
    static final String f2995H;

    /* renamed from: I */
    static final Class<?>[] f2996I;

    /* renamed from: J */
    static final ThreadLocal<Map<String, Constructor<AbstractC0559c>>> f2997J;

    /* renamed from: K */
    static final Comparator<View> f2998K;

    /* renamed from: L */
    private static final InterfaceC0651e<Rect> f2999L;

    /* renamed from: A */
    private boolean f3000A;

    /* renamed from: B */
    private C0675g0 f3001B;

    /* renamed from: C */
    private boolean f3002C;

    /* renamed from: D */
    private Drawable f3003D;

    /* renamed from: E */
    ViewGroup.OnHierarchyChangeListener f3004E;

    /* renamed from: F */
    private InterfaceC0684p f3005F;

    /* renamed from: G */
    private final C0683o f3006G;

    /* renamed from: n */
    private final List<View> f3007n;

    /* renamed from: o */
    private final C0565a<View> f3008o;

    /* renamed from: p */
    private final List<View> f3009p;

    /* renamed from: q */
    private final List<View> f3010q;

    /* renamed from: r */
    private Paint f3011r;

    /* renamed from: s */
    private final int[] f3012s;

    /* renamed from: t */
    private final int[] f3013t;

    /* renamed from: u */
    private boolean f3014u;

    /* renamed from: v */
    private boolean f3015v;

    /* renamed from: w */
    private int[] f3016w;

    /* renamed from: x */
    private View f3017x;

    /* renamed from: y */
    private View f3018y;

    /* renamed from: z */
    private ViewTreeObserverOnPreDrawListenerC0563g f3019z;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0557a implements InterfaceC0684p {
        C0557a() {
        }

        @Override // androidx.core.view.InterfaceC0684p
        /* renamed from: L */
        public C0675g0 mo823L(View view, C0675g0 c0675g0) {
            return CoordinatorLayout.this.m2640Q(c0675g0);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0558b {
        AbstractC0559c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0559c<V extends View> {
        public AbstractC0559c() {
        }

        /* renamed from: A */
        public boolean mo2658A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return m2687z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m2659B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        /* renamed from: C */
        public void mo2660C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                m2659B(coordinatorLayout, v10, view);
            }
        }

        /* renamed from: D */
        public boolean mo2661D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m2662a(CoordinatorLayout coordinatorLayout, V v10) {
            return m2665d(coordinatorLayout, v10) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2663b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m2664c(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        /* renamed from: d */
        public float m2665d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2666e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        /* renamed from: f */
        public C0675g0 m2667f(CoordinatorLayout coordinatorLayout, V v10, C0675g0 c0675g0) {
            return c0675g0;
        }

        /* renamed from: g */
        public void mo2668g(C0562f c0562f) {
        }

        /* renamed from: h */
        public boolean mo2669h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo2670i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        /* renamed from: j */
        public void mo2671j() {
        }

        /* renamed from: k */
        public boolean mo2672k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2673l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2674m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        /* renamed from: n */
        public boolean m2675n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2676o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m2677p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2678q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                m2677p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m2679r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        /* renamed from: s */
        public void m2680s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                m2679r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        /* renamed from: t */
        public void mo2681t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            m2680s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        /* renamed from: u */
        public void m2682u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        /* renamed from: v */
        public void m2683v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                m2682u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        /* renamed from: w */
        public boolean mo2684w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        /* renamed from: x */
        public void mo2685x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2686y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m2687z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public AbstractC0559c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface InterfaceC0560d {
        Class<? extends AbstractC0559c> value();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    public class ViewGroupOnHierarchyChangeListenerC0561e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0561e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3004E;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m2635B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3004E;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnPreDrawListenerC0563g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0563g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m2635B(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    static class C0564h implements Comparator<View> {
        C0564h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m3808O = C0690v.m3808O(view);
            float m3808O2 = C0690v.m3808O(view2);
            if (m3808O > m3808O2) {
                return -1;
            }
            return m3808O < m3808O2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2995H = r02 != null ? r02.getName() : null;
        f2998K = new C0564h();
        f2996I = new Class[]{Context.class, AttributeSet.class};
        f2997J = new ThreadLocal<>();
        f2999L = new C0653g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4006a.f16419a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    static AbstractC0559c m2611E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2995H;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0559c>>> threadLocal = f2997J;
            Map<String, Constructor<AbstractC0559c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0559c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2996I);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    /* renamed from: F */
    private boolean m2612F(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3009p;
        m2628t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            C0562f c0562f = (C0562f) view.getLayoutParams();
            AbstractC0559c m2696f = c0562f.m2696f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z10 && m2696f != null) {
                    if (i10 == 0) {
                        z10 = m2696f.mo2672k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z10 = m2696f.mo2661D(this, view, motionEvent);
                    }
                    if (z10) {
                        this.f3017x = view;
                    }
                }
                boolean m2693c = c0562f.m2693c();
                boolean m2699i = c0562f.m2699i(this, view);
                z11 = m2699i && !m2693c;
                if (m2699i && !z11) {
                    break;
                }
            } else if (m2696f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    m2696f.mo2672k(this, view, motionEvent2);
                } else if (i10 == 1) {
                    m2696f.mo2661D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z10;
    }

    /* renamed from: G */
    private void m2613G() {
        this.f3007n.clear();
        this.f3008o.m2714c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C0562f m2653s = m2653s(childAt);
            m2653s.m2694d(this, childAt);
            this.f3008o.m2713b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (m2653s.m2692b(this, childAt, childAt2)) {
                        if (!this.f3008o.m2715d(childAt2)) {
                            this.f3008o.m2713b(childAt2);
                        }
                        this.f3008o.m2712a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3007n.addAll(this.f3008o.m2718i());
        Collections.reverse(this.f3007n);
    }

    /* renamed from: I */
    private static void m2614I(Rect rect) {
        rect.setEmpty();
        f2999L.mo3459a(rect);
    }

    /* renamed from: K */
    private void m2615K(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC0559c m2696f = ((C0562f) childAt.getLayoutParams()).m2696f();
            if (m2696f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    m2696f.mo2672k(this, childAt, obtain);
                } else {
                    m2696f.mo2661D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C0562f) getChildAt(i11).getLayoutParams()).m2703m();
        }
        this.f3017x = null;
        this.f3014u = false;
    }

    /* renamed from: L */
    private static int m2616L(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    /* renamed from: M */
    private static int m2617M(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    /* renamed from: N */
    private static int m2618N(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    /* renamed from: O */
    private void m2619O(View view, int i10) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        int i11 = c0562f.f3031i;
        if (i11 != i10) {
            C0690v.m3821a0(view, i10 - i11);
            c0562f.f3031i = i10;
        }
    }

    /* renamed from: P */
    private void m2620P(View view, int i10) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        int i11 = c0562f.f3032j;
        if (i11 != i10) {
            C0690v.m3823b0(view, i10 - i11);
            c0562f.f3032j = i10;
        }
    }

    /* renamed from: R */
    private void m2621R() {
        if (C0690v.m3785B(this)) {
            if (this.f3005F == null) {
                this.f3005F = new C0557a();
            }
            C0690v.m3786B0(this, this.f3005F);
            setSystemUiVisibility(1280);
            return;
        }
        C0690v.m3786B0(this, null);
    }

    /* renamed from: a */
    private static Rect m2622a() {
        Rect mo3460b = f2999L.mo3460b();
        return mo3460b == null ? new Rect() : mo3460b;
    }

    /* renamed from: c */
    private static int m2623c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    /* renamed from: d */
    private void m2624d(C0562f c0562f, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0562f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c0562f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0562f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    /* renamed from: e */
    private C0675g0 m2625e(C0675g0 c0675g0) {
        AbstractC0559c m2696f;
        if (c0675g0.m3671o()) {
            return c0675g0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (C0690v.m3785B(childAt) && (m2696f = ((C0562f) childAt.getLayoutParams()).m2696f()) != null) {
                c0675g0 = m2696f.m2667f(this, childAt, c0675g0);
                if (c0675g0.m3671o()) {
                    break;
                }
            }
        }
        return c0675g0;
    }

    /* renamed from: p */
    private void m2626p(View view, int i10, Rect rect, Rect rect2, C0562f c0562f, int i11, int i12) {
        int width;
        int height;
        int m3641b = C0670e.m3641b(m2616L(c0562f.f3025c), i10);
        int m3641b2 = C0670e.m3641b(m2617M(c0562f.f3026d), i10);
        int i13 = m3641b & 7;
        int i14 = m3641b & 112;
        int i15 = m3641b2 & 7;
        int i16 = m3641b2 & 112;
        if (i15 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i15 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i16 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i16 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    /* renamed from: q */
    private int m2627q(int i10) {
        int[] iArr = this.f3016w;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* renamed from: t */
    private void m2628t(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2998K;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: u */
    private boolean m2629u(View view) {
        return this.f3008o.m2719j(view);
    }

    /* renamed from: w */
    private void m2630w(View view, int i10) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        Rect m2622a = m2622a();
        m2622a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0562f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0562f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0562f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin);
        if (this.f3001B != null && C0690v.m3785B(this) && !C0690v.m3785B(view)) {
            m2622a.left += this.f3001B.m3667j();
            m2622a.top += this.f3001B.m3669l();
            m2622a.right -= this.f3001B.m3668k();
            m2622a.bottom -= this.f3001B.m3666i();
        }
        Rect m2622a2 = m2622a();
        C0670e.m3640a(m2617M(c0562f.f3025c), view.getMeasuredWidth(), view.getMeasuredHeight(), m2622a, m2622a2, i10);
        view.layout(m2622a2.left, m2622a2.top, m2622a2.right, m2622a2.bottom);
        m2614I(m2622a);
        m2614I(m2622a2);
    }

    /* renamed from: x */
    private void m2631x(View view, View view2, int i10) {
        Rect m2622a = m2622a();
        Rect m2622a2 = m2622a();
        try {
            m2650n(view2, m2622a);
            m2651o(view, i10, m2622a, m2622a2);
            view.layout(m2622a2.left, m2622a2.top, m2622a2.right, m2622a2.bottom);
        } finally {
            m2614I(m2622a);
            m2614I(m2622a2);
        }
    }

    /* renamed from: y */
    private void m2632y(View view, int i10, int i11) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        int m3641b = C0670e.m3641b(m2618N(c0562f.f3025c), i11);
        int i12 = m3641b & 7;
        int i13 = m3641b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int m2627q = m2627q(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            m2627q += measuredWidth / 2;
        } else if (i12 == 5) {
            m2627q += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0562f).leftMargin, Math.min(m2627q, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0562f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0562f).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: z */
    private void m2633z(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (C0690v.m3814U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0562f c0562f = (C0562f) view.getLayoutParams();
            AbstractC0559c m2696f = c0562f.m2696f();
            Rect m2622a = m2622a();
            Rect m2622a2 = m2622a();
            m2622a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m2696f != null && m2696f.mo2663b(this, view, m2622a)) {
                if (!m2622a2.contains(m2622a)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m2622a.toShortString() + " | Bounds:" + m2622a2.toShortString());
                }
            } else {
                m2622a.set(m2622a2);
            }
            m2614I(m2622a2);
            if (m2622a.isEmpty()) {
                m2614I(m2622a);
                return;
            }
            int m3641b = C0670e.m3641b(c0562f.f3030h, i10);
            boolean z12 = true;
            if ((m3641b & 48) != 48 || (i15 = (m2622a.top - ((ViewGroup.MarginLayoutParams) c0562f).topMargin) - c0562f.f3032j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                m2620P(view, i16 - i15);
                z10 = true;
            }
            if ((m3641b & 80) == 80 && (height = ((getHeight() - m2622a.bottom) - ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin) + c0562f.f3032j) < (i14 = rect.bottom)) {
                m2620P(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                m2620P(view, 0);
            }
            if ((m3641b & 3) != 3 || (i12 = (m2622a.left - ((ViewGroup.MarginLayoutParams) c0562f).leftMargin) - c0562f.f3031i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                m2619O(view, i13 - i12);
                z11 = true;
            }
            if ((m3641b & 5) != 5 || (width = ((getWidth() - m2622a.right) - ((ViewGroup.MarginLayoutParams) c0562f).rightMargin) + c0562f.f3031i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                m2619O(view, width - i11);
            }
            if (!z12) {
                m2619O(view, 0);
            }
            m2614I(m2622a);
        }
    }

    /* renamed from: A */
    void m2634A(View view, int i10) {
        AbstractC0559c m2696f;
        C0562f c0562f = (C0562f) view.getLayoutParams();
        if (c0562f.f3033k != null) {
            Rect m2622a = m2622a();
            Rect m2622a2 = m2622a();
            Rect m2622a3 = m2622a();
            m2650n(c0562f.f3033k, m2622a);
            m2647k(view, false, m2622a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m2626p(view, i10, m2622a, m2622a3, c0562f, measuredWidth, measuredHeight);
            boolean z10 = (m2622a3.left == m2622a2.left && m2622a3.top == m2622a2.top) ? false : true;
            m2624d(c0562f, m2622a3, measuredWidth, measuredHeight);
            int i11 = m2622a3.left - m2622a2.left;
            int i12 = m2622a3.top - m2622a2.top;
            if (i11 != 0) {
                C0690v.m3821a0(view, i11);
            }
            if (i12 != 0) {
                C0690v.m3823b0(view, i12);
            }
            if (z10 && (m2696f = c0562f.m2696f()) != null) {
                m2696f.mo2669h(this, view, c0562f.f3033k);
            }
            m2614I(m2622a);
            m2614I(m2622a2);
            m2614I(m2622a3);
        }
    }

    /* renamed from: B */
    final void m2635B(int i10) {
        boolean z10;
        int m3791E = C0690v.m3791E(this);
        int size = this.f3007n.size();
        Rect m2622a = m2622a();
        Rect m2622a2 = m2622a();
        Rect m2622a3 = m2622a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f3007n.get(i11);
            C0562f c0562f = (C0562f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (c0562f.f3034l == this.f3007n.get(i12)) {
                        m2634A(view, m3791E);
                    }
                }
                m2647k(view, true, m2622a2);
                if (c0562f.f3029g != 0 && !m2622a2.isEmpty()) {
                    int m3641b = C0670e.m3641b(c0562f.f3029g, m3791E);
                    int i13 = m3641b & 112;
                    if (i13 == 48) {
                        m2622a.top = Math.max(m2622a.top, m2622a2.bottom);
                    } else if (i13 == 80) {
                        m2622a.bottom = Math.max(m2622a.bottom, getHeight() - m2622a2.top);
                    }
                    int i14 = m3641b & 7;
                    if (i14 == 3) {
                        m2622a.left = Math.max(m2622a.left, m2622a2.right);
                    } else if (i14 == 5) {
                        m2622a.right = Math.max(m2622a.right, getWidth() - m2622a2.left);
                    }
                }
                if (c0562f.f3030h != 0 && view.getVisibility() == 0) {
                    m2633z(view, m2622a, m3791E);
                }
                if (i10 != 2) {
                    m2652r(view, m2622a3);
                    if (!m2622a3.equals(m2622a2)) {
                        m2638H(view, m2622a2);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f3007n.get(i15);
                    C0562f c0562f2 = (C0562f) view2.getLayoutParams();
                    AbstractC0559c m2696f = c0562f2.m2696f();
                    if (m2696f != null && m2696f.mo2666e(this, view2, view)) {
                        if (i10 == 0 && c0562f2.m2697g()) {
                            c0562f2.m2701k();
                        } else {
                            if (i10 != 2) {
                                z10 = m2696f.mo2669h(this, view2, view);
                            } else {
                                m2696f.mo2670i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                c0562f2.m2705p(z10);
                            }
                        }
                    }
                }
            }
        }
        m2614I(m2622a);
        m2614I(m2622a2);
        m2614I(m2622a3);
    }

    /* renamed from: C */
    public void m2636C(View view, int i10) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        if (!c0562f.m2691a()) {
            View view2 = c0562f.f3033k;
            if (view2 != null) {
                m2631x(view, view2, i10);
                return;
            }
            int i11 = c0562f.f3027e;
            if (i11 >= 0) {
                m2632y(view, i11, i10);
                return;
            } else {
                m2630w(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: D */
    public void m2637D(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* renamed from: H */
    void m2638H(View view, Rect rect) {
        ((C0562f) view.getLayoutParams()).m2706q(rect);
    }

    /* renamed from: J */
    void m2639J() {
        if (this.f3015v && this.f3019z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3019z);
        }
        this.f3000A = false;
    }

    /* renamed from: Q */
    final C0675g0 m2640Q(C0675g0 c0675g0) {
        if (C0649c.m3452a(this.f3001B, c0675g0)) {
            return c0675g0;
        }
        this.f3001B = c0675g0;
        boolean z10 = c0675g0 != null && c0675g0.m3669l() > 0;
        this.f3002C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        C0675g0 m2625e = m2625e(c0675g0);
        requestLayout();
        return m2625e;
    }

    /* renamed from: b */
    void m2641b() {
        if (this.f3015v) {
            if (this.f3019z == null) {
                this.f3019z = new ViewTreeObserverOnPreDrawListenerC0563g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3019z);
        }
        this.f3000A = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0562f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        AbstractC0559c abstractC0559c = c0562f.f3023a;
        if (abstractC0559c != null) {
            float m2665d = abstractC0559c.m2665d(this, view);
            if (m2665d > 0.0f) {
                if (this.f3011r == null) {
                    this.f3011r = new Paint();
                }
                this.f3011r.setColor(c0562f.f3023a.m2664c(this, view));
                this.f3011r.setAlpha(m2623c(Math.round(m2665d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3011r);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3003D;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m2642f(View view) {
        List m2716g = this.f3008o.m2716g(view);
        if (m2716g == null || m2716g.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < m2716g.size(); i10++) {
            View view2 = (View) m2716g.get(i10);
            AbstractC0559c m2696f = ((C0562f) view2.getLayoutParams()).m2696f();
            if (m2696f != null) {
                m2696f.mo2669h(this, view2, view);
            }
        }
    }

    /* renamed from: g */
    void m2643g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (m2629u(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f3000A) {
            if (z10) {
                m2641b();
            } else {
                m2639J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m2613G();
        return Collections.unmodifiableList(this.f3007n);
    }

    public final C0675g0 getLastWindowInsets() {
        return this.f3001B;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3006G.m3770a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3003D;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public C0562f generateDefaultLayoutParams() {
        return new C0562f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public C0562f generateLayoutParams(AttributeSet attributeSet) {
        return new C0562f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public C0562f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0562f) {
            return new C0562f((C0562f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0562f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0562f(layoutParams);
    }

    /* renamed from: k */
    void m2647k(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            m2650n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l */
    public List<View> m2648l(View view) {
        List<View> m2717h = this.f3008o.m2717h(view);
        this.f3010q.clear();
        if (m2717h != null) {
            this.f3010q.addAll(m2717h);
        }
        return this.f3010q;
    }

    /* renamed from: m */
    public List<View> m2649m(View view) {
        List m2716g = this.f3008o.m2716g(view);
        this.f3010q.clear();
        if (m2716g != null) {
            this.f3010q.addAll(m2716g);
        }
        return this.f3010q;
    }

    /* renamed from: n */
    void m2650n(View view, Rect rect) {
        C0566b.m2720a(this, view, rect);
    }

    /* renamed from: o */
    void m2651o(View view, int i10, Rect rect, Rect rect2) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2626p(view, i10, rect, rect2, c0562f, measuredWidth, measuredHeight);
        m2624d(c0562f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2615K(false);
        if (this.f3000A) {
            if (this.f3019z == null) {
                this.f3019z = new ViewTreeObserverOnPreDrawListenerC0563g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3019z);
        }
        if (this.f3001B == null && C0690v.m3785B(this)) {
            C0690v.m3847n0(this);
        }
        this.f3015v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2615K(false);
        if (this.f3000A && this.f3019z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3019z);
        }
        View view = this.f3018y;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3015v = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3002C || this.f3003D == null) {
            return;
        }
        C0675g0 c0675g0 = this.f3001B;
        int m3669l = c0675g0 != null ? c0675g0.m3669l() : 0;
        if (m3669l > 0) {
            this.f3003D.setBounds(0, 0, getWidth(), m3669l);
            this.f3003D.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2615K(true);
        }
        boolean m2612F = m2612F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2615K(true);
        }
        return m2612F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC0559c m2696f;
        int m3791E = C0690v.m3791E(this);
        int size = this.f3007n.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f3007n.get(i14);
            if (view.getVisibility() != 8 && ((m2696f = ((C0562f) view.getLayoutParams()).m2696f()) == null || !m2696f.mo2673l(this, view, m3791E))) {
                m2636C(view, m3791E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011a, code lost:
    
        if (r0.mo2674m(r30, r20, r11, r21, r23, 0) == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        AbstractC0559c m2696f;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0562f c0562f = (C0562f) childAt.getLayoutParams();
                if (c0562f.m2700j(0) && (m2696f = c0562f.m2696f()) != null) {
                    z11 |= m2696f.m2675n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            m2635B(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC0559c m2696f;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0562f c0562f = (C0562f) childAt.getLayoutParams();
                if (c0562f.m2700j(0) && (m2696f = c0562f.m2696f()) != null) {
                    z10 |= m2696f.mo2676o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f3020n;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            AbstractC0559c m2696f = m2653s(childAt).m2696f();
            if (id != -1 && m2696f != null && (parcelable2 = sparseArray.get(id)) != null) {
                m2696f.mo2685x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo2686y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            AbstractC0559c m2696f = ((C0562f) childAt.getLayoutParams()).m2696f();
            if (id != -1 && m2696f != null && (mo2686y = m2696f.mo2686y(this, childAt)) != null) {
                sparseArray.append(id, mo2686y);
            }
        }
        savedState.f3020n = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3017x
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m2612F(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f3017x
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0562f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m2696f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f3017x
            boolean r6 = r6.mo2661D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f3017x
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m2615K(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    void m2652r(View view, Rect rect) {
        rect.set(((C0562f) view.getLayoutParams()).m2698h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC0559c m2696f = ((C0562f) view.getLayoutParams()).m2696f();
        if (m2696f == null || !m2696f.mo2684w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f3014u) {
            return;
        }
        m2615K(false);
        this.f3014u = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    C0562f m2653s(View view) {
        C0562f c0562f = (C0562f) view.getLayoutParams();
        if (!c0562f.f3024b) {
            if (view instanceof InterfaceC0558b) {
                AbstractC0559c behavior = ((InterfaceC0558b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0562f.m2704o(behavior);
                c0562f.f3024b = true;
            } else {
                InterfaceC0560d interfaceC0560d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0560d = (InterfaceC0560d) cls.getAnnotation(InterfaceC0560d.class);
                    if (interfaceC0560d != null) {
                        break;
                    }
                }
                if (interfaceC0560d != null) {
                    try {
                        c0562f.m2704o(interfaceC0560d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0560d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                c0562f.f3024b = true;
            }
        }
        return c0562f;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        m2621R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3004E = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3003D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f3003D = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f3003D.setState(getDrawableState());
                }
                C0609a.m3258m(this.f3003D, C0690v.m3791E(this));
                this.f3003D.setVisible(getVisibility() == 0, false);
                this.f3003D.setCallback(this);
            }
            C0690v.m3835h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C0587a.m3031e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f3003D;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f3003D.setVisible(z10, false);
    }

    /* renamed from: v */
    public boolean m2654v(View view, int i10, int i11) {
        Rect m2622a = m2622a();
        m2650n(view, m2622a);
        try {
            return m2622a.contains(i10, i11);
        } finally {
            m2614I(m2622a);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3003D;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f3007n = new ArrayList();
        this.f3008o = new C0565a<>();
        this.f3009p = new ArrayList();
        this.f3010q = new ArrayList();
        this.f3012s = new int[2];
        this.f3013t = new int[2];
        this.f3006G = new C0683o(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4008c.f16422b, 0, C4007b.f16420a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4008c.f16422b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, C4008c.f16422b, attributeSet, obtainStyledAttributes, 0, C4007b.f16420a);
            } else {
                saveAttributeDataForStyleable(context, C4008c.f16422b, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C4008c.f16423c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3016w = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f3016w.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f3016w[i11] = (int) (r12[i11] * f10);
            }
        }
        this.f3003D = obtainStyledAttributes.getDrawable(C4008c.f16424d);
        obtainStyledAttributes.recycle();
        m2621R();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0561e());
        if (C0690v.m3787C(this) == 0) {
            C0690v.m3871z0(this, 1);
        }
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC0559c m2696f;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0562f c0562f = (C0562f) childAt.getLayoutParams();
                if (c0562f.m2700j(i12) && (m2696f = c0562f.m2696f()) != null) {
                    int[] iArr2 = this.f3012s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m2696f.mo2678q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f3012s;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f3012s;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            m2635B(1);
        }
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f3013t);
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        AbstractC0559c m2696f;
        this.f3006G.m3772c(view, view2, i10, i11);
        this.f3018y = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            C0562f c0562f = (C0562f) childAt.getLayoutParams();
            if (c0562f.m2700j(i11) && (m2696f = c0562f.m2696f()) != null) {
                m2696f.m2683v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC0681m
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0562f c0562f = (C0562f) childAt.getLayoutParams();
                AbstractC0559c m2696f = c0562f.m2696f();
                if (m2696f != null) {
                    boolean mo2658A = m2696f.mo2658A(this, childAt, view, view2, i10, i11);
                    z10 |= mo2658A;
                    c0562f.m2707r(i11, mo2658A);
                } else {
                    c0562f.m2707r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.InterfaceC0681m
    public void onStopNestedScroll(View view, int i10) {
        this.f3006G.m3774e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0562f c0562f = (C0562f) childAt.getLayoutParams();
            if (c0562f.m2700j(i10)) {
                AbstractC0559c m2696f = c0562f.m2696f();
                if (m2696f != null) {
                    m2696f.mo2660C(this, childAt, view, i10);
                }
                c0562f.m2702l(i10);
                c0562f.m2701k();
            }
        }
        this.f3018y = null;
    }

    @Override // androidx.core.view.InterfaceC0682n
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AbstractC0559c m2696f;
        int min;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C0562f c0562f = (C0562f) childAt.getLayoutParams();
                if (c0562f.m2700j(i14) && (m2696f = c0562f.m2696f()) != null) {
                    int[] iArr2 = this.f3012s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m2696f.mo2681t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f3012s;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    if (i13 > 0) {
                        min = Math.max(i16, this.f3012s[1]);
                    } else {
                        min = Math.min(i16, this.f3012s[1]);
                    }
                    i16 = min;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            m2635B(1);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0556a();

        /* renamed from: n */
        SparseArray<Parcelable> f3020n;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes.dex */
        static class C0556a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0556a() {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3020n = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f3020n.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f3020n;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f3020n.keyAt(i11);
                parcelableArr[i11] = this.f3020n.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0562f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0559c f3023a;

        /* renamed from: b */
        boolean f3024b;

        /* renamed from: c */
        public int f3025c;

        /* renamed from: d */
        public int f3026d;

        /* renamed from: e */
        public int f3027e;

        /* renamed from: f */
        int f3028f;

        /* renamed from: g */
        public int f3029g;

        /* renamed from: h */
        public int f3030h;

        /* renamed from: i */
        int f3031i;

        /* renamed from: j */
        int f3032j;

        /* renamed from: k */
        View f3033k;

        /* renamed from: l */
        View f3034l;

        /* renamed from: m */
        private boolean f3035m;

        /* renamed from: n */
        private boolean f3036n;

        /* renamed from: o */
        private boolean f3037o;

        /* renamed from: p */
        private boolean f3038p;

        /* renamed from: q */
        final Rect f3039q;

        /* renamed from: r */
        Object f3040r;

        public C0562f(int i10, int i11) {
            super(i10, i11);
            this.f3024b = false;
            this.f3025c = 0;
            this.f3026d = 0;
            this.f3027e = -1;
            this.f3028f = -1;
            this.f3029g = 0;
            this.f3030h = 0;
            this.f3039q = new Rect();
        }

        /* renamed from: n */
        private void m2688n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3028f);
            this.f3033k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3034l = null;
                    this.f3033k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3028f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3034l = null;
                    this.f3033k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f3034l = null;
                        this.f3033k = null;
                        return;
                    }
                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f3034l = findViewById;
        }

        /* renamed from: s */
        private boolean m2689s(View view, int i10) {
            int m3641b = C0670e.m3641b(((C0562f) view.getLayoutParams()).f3029g, i10);
            return m3641b != 0 && (C0670e.m3641b(this.f3030h, i10) & m3641b) == m3641b;
        }

        /* renamed from: t */
        private boolean m2690t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3033k.getId() != this.f3028f) {
                return false;
            }
            View view2 = this.f3033k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                } else {
                    this.f3034l = null;
                    this.f3033k = null;
                    return false;
                }
            }
            this.f3034l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m2691a() {
            return this.f3033k == null && this.f3028f != -1;
        }

        /* renamed from: b */
        boolean m2692b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0559c abstractC0559c;
            return view2 == this.f3034l || m2689s(view2, C0690v.m3791E(coordinatorLayout)) || ((abstractC0559c = this.f3023a) != null && abstractC0559c.mo2666e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        boolean m2693c() {
            if (this.f3023a == null) {
                this.f3035m = false;
            }
            return this.f3035m;
        }

        /* renamed from: d */
        View m2694d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3028f == -1) {
                this.f3034l = null;
                this.f3033k = null;
                return null;
            }
            if (this.f3033k == null || !m2690t(view, coordinatorLayout)) {
                m2688n(view, coordinatorLayout);
            }
            return this.f3033k;
        }

        /* renamed from: e */
        public int m2695e() {
            return this.f3028f;
        }

        /* renamed from: f */
        public AbstractC0559c m2696f() {
            return this.f3023a;
        }

        /* renamed from: g */
        boolean m2697g() {
            return this.f3038p;
        }

        /* renamed from: h */
        Rect m2698h() {
            return this.f3039q;
        }

        /* renamed from: i */
        boolean m2699i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f3035m;
            if (z10) {
                return true;
            }
            AbstractC0559c abstractC0559c = this.f3023a;
            boolean m2662a = (abstractC0559c != null ? abstractC0559c.m2662a(coordinatorLayout, view) : false) | z10;
            this.f3035m = m2662a;
            return m2662a;
        }

        /* renamed from: j */
        boolean m2700j(int i10) {
            if (i10 == 0) {
                return this.f3036n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f3037o;
        }

        /* renamed from: k */
        void m2701k() {
            this.f3038p = false;
        }

        /* renamed from: l */
        void m2702l(int i10) {
            m2707r(i10, false);
        }

        /* renamed from: m */
        void m2703m() {
            this.f3035m = false;
        }

        /* renamed from: o */
        public void m2704o(AbstractC0559c abstractC0559c) {
            AbstractC0559c abstractC0559c2 = this.f3023a;
            if (abstractC0559c2 != abstractC0559c) {
                if (abstractC0559c2 != null) {
                    abstractC0559c2.mo2671j();
                }
                this.f3023a = abstractC0559c;
                this.f3040r = null;
                this.f3024b = true;
                if (abstractC0559c != null) {
                    abstractC0559c.mo2668g(this);
                }
            }
        }

        /* renamed from: p */
        void m2705p(boolean z10) {
            this.f3038p = z10;
        }

        /* renamed from: q */
        void m2706q(Rect rect) {
            this.f3039q.set(rect);
        }

        /* renamed from: r */
        void m2707r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f3036n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f3037o = z10;
            }
        }

        C0562f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3024b = false;
            this.f3025c = 0;
            this.f3026d = 0;
            this.f3027e = -1;
            this.f3028f = -1;
            this.f3029g = 0;
            this.f3030h = 0;
            this.f3039q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4008c.f16425e);
            this.f3025c = obtainStyledAttributes.getInteger(C4008c.f16426f, 0);
            this.f3028f = obtainStyledAttributes.getResourceId(C4008c.f16427g, -1);
            this.f3026d = obtainStyledAttributes.getInteger(C4008c.f16428h, 0);
            this.f3027e = obtainStyledAttributes.getInteger(C4008c.f16432l, -1);
            this.f3029g = obtainStyledAttributes.getInt(C4008c.f16431k, 0);
            this.f3030h = obtainStyledAttributes.getInt(C4008c.f16430j, 0);
            int i10 = C4008c.f16429i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f3024b = hasValue;
            if (hasValue) {
                this.f3023a = CoordinatorLayout.m2611E(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            AbstractC0559c abstractC0559c = this.f3023a;
            if (abstractC0559c != null) {
                abstractC0559c.mo2668g(this);
            }
        }

        public C0562f(C0562f c0562f) {
            super((ViewGroup.MarginLayoutParams) c0562f);
            this.f3024b = false;
            this.f3025c = 0;
            this.f3026d = 0;
            this.f3027e = -1;
            this.f3028f = -1;
            this.f3029g = 0;
            this.f3030h = 0;
            this.f3039q = new Rect();
        }

        public C0562f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3024b = false;
            this.f3025c = 0;
            this.f3026d = 0;
            this.f3027e = -1;
            this.f3028f = -1;
            this.f3029g = 0;
            this.f3030h = 0;
            this.f3039q = new Rect();
        }

        public C0562f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3024b = false;
            this.f3025c = 0;
            this.f3026d = 0;
            this.f3027e = -1;
            this.f3028f = -1;
            this.f3029g = 0;
            this.f3030h = 0;
            this.f3039q = new Rect();
        }
    }
}
