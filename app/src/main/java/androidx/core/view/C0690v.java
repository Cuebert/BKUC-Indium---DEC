package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C0656a;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.InterfaceC0663f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p093h0.C3362g;
import p182o0.C4112e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.v */
/* loaded from: classes.dex */
public class C0690v {

    /* renamed from: c */
    private static Field f3638c;

    /* renamed from: e */
    private static ThreadLocal<Rect> f3640e;

    /* renamed from: a */
    private static final AtomicInteger f3636a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, C0665b0> f3637b = null;

    /* renamed from: d */
    private static boolean f3639d = false;

    /* renamed from: f */
    private static final int[] f3641f = {C4112e.f16705b, C4112e.f16706c, C4112e.f16717n, C4112e.f16728y, C4112e.f16686B, C4112e.f16687C, C4112e.f16688D, C4112e.f16689E, C4112e.f16690F, C4112e.f16691G, C4112e.f16707d, C4112e.f16708e, C4112e.f16709f, C4112e.f16710g, C4112e.f16711h, C4112e.f16712i, C4112e.f16713j, C4112e.f16714k, C4112e.f16715l, C4112e.f16716m, C4112e.f16718o, C4112e.f16719p, C4112e.f16720q, C4112e.f16721r, C4112e.f16722s, C4112e.f16723t, C4112e.f16724u, C4112e.f16725v, C4112e.f16726w, C4112e.f16727x, C4112e.f16729z, C4112e.f16685A};

    /* renamed from: g */
    private static final InterfaceC0686r f3642g = C0689u.f3635n;

    /* renamed from: h */
    private static final e f3643h = new e();

    /* renamed from: androidx.core.view.v$a */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: i */
        public Boolean mo3872d(View view) {
            return Boolean.valueOf(q.m3992d(view));
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: j */
        public void mo3873e(View view, Boolean bool) {
            q.m3997i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: k */
        public boolean mo3874h(Boolean bool, Boolean bool2) {
            return !m3891a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.v$b */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: i */
        public CharSequence mo3872d(View view) {
            return q.m3990b(view);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: j */
        public void mo3873e(View view, CharSequence charSequence) {
            q.m3996h(view, charSequence);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: k */
        public boolean mo3874h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.v$c */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: i */
        public CharSequence mo3872d(View view) {
            return s.m4002a(view);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: j */
        public void mo3873e(View view, CharSequence charSequence) {
            s.m4003b(view, charSequence);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: k */
        public boolean mo3874h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.v$d */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: i */
        public Boolean mo3872d(View view) {
            return Boolean.valueOf(q.m3991c(view));
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: j */
        public void mo3873e(View view, Boolean bool) {
            q.m3995g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.C0690v.f
        /* renamed from: k */
        public boolean mo3874h(Boolean bool, Boolean bool2) {
            return !m3891a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.v$e */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: n */
        private final WeakHashMap<View, Boolean> f3644n = new WeakHashMap<>();

        e() {
        }

        /* renamed from: a */
        private void m3887a(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                C0690v.m3819Z(view, z11 ? 16 : 32);
                this.f3644n.put(view, Boolean.valueOf(z11));
            }
        }

        /* renamed from: b */
        private void m3888b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3644n.entrySet()) {
                    m3887a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m3888b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.v$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a */
        private final int f3645a;

        /* renamed from: b */
        private final Class<T> f3646b;

        /* renamed from: c */
        private final int f3647c;

        /* renamed from: d */
        private final int f3648d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        /* renamed from: b */
        private boolean m3889b() {
            return true;
        }

        /* renamed from: c */
        private boolean m3890c() {
            return Build.VERSION.SDK_INT >= this.f3647c;
        }

        /* renamed from: a */
        boolean m3891a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo3872d(View view);

        /* renamed from: e */
        abstract void mo3873e(View view, T t10);

        /* renamed from: f */
        T m3892f(View view) {
            if (m3890c()) {
                return mo3872d(view);
            }
            if (!m3889b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f3645a);
            if (this.f3646b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        /* renamed from: g */
        void m3893g(View view, T t10) {
            if (m3890c()) {
                mo3873e(view, t10);
            } else if (m3889b() && mo3874h(m3892f(view), t10)) {
                C0690v.m3842l(view);
                view.setTag(this.f3645a, t10);
                C0690v.m3819Z(view, this.f3648d);
            }
        }

        /* renamed from: h */
        abstract boolean mo3874h(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f3645a = i10;
            this.f3646b = cls;
            this.f3648d = i11;
            this.f3647c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v$g */
    /* loaded from: classes.dex */
    public static class g {
        /* renamed from: a */
        static boolean m3894a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.v$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        static AccessibilityNodeProvider m3895a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m3896b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m3897c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m3898d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m3899e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m3900f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m3901g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m3902h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m3903i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m3904j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        /* renamed from: k */
        static void m3905k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m3906l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        /* renamed from: m */
        static void m3907m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m3908n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        /* renamed from: o */
        static void m3909o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m3910p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m3911q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m3912r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        /* renamed from: s */
        static void m3913s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        static int m3914a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m3915b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m3916c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m3917d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m3918e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m3919f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m3920g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m3921h(View view, int i10) {
            view.setLabelFor(i10);
        }

        /* renamed from: i */
        static void m3922i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m3923j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        /* renamed from: k */
        static void m3924k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        static Rect m3925a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m3926b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m3927c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.v$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static int m3928a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m3929b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m3930c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m3931d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m3932e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        /* renamed from: f */
        static void m3933f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        /* renamed from: g */
        static void m3934g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* renamed from: androidx.core.view.v$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        static WindowInsets m3935a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m3936b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m3937c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.v$m */
    /* loaded from: classes.dex */
    public static class m {

        /* renamed from: androidx.core.view.v$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0675g0 f3649a = null;

            /* renamed from: b */
            final /* synthetic */ View f3650b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC0684p f3651c;

            a(View view, InterfaceC0684p interfaceC0684p) {
                this.f3650b = view;
                this.f3651c = interfaceC0684p;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0675g0 m3657w = C0675g0.m3657w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.m3938a(windowInsets, this.f3650b);
                    if (m3657w.equals(this.f3649a)) {
                        return this.f3651c.mo823L(view, m3657w).m3677u();
                    }
                }
                this.f3649a = m3657w;
                C0675g0 mo823L = this.f3651c.mo823L(view, m3657w);
                if (i10 >= 30) {
                    return mo823L.m3677u();
                }
                C0690v.m3847n0(view);
                return mo823L.m3677u();
            }
        }

        /* renamed from: a */
        static void m3938a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C4112e.f16703S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0675g0 m3939b(View view, C0675g0 c0675g0, Rect rect) {
            WindowInsets m3677u = c0675g0.m3677u();
            if (m3677u != null) {
                return C0675g0.m3657w(view.computeSystemWindowInsets(m3677u, rect), view);
            }
            rect.setEmpty();
            return c0675g0;
        }

        /* renamed from: c */
        static boolean m3940c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        /* renamed from: d */
        static boolean m3941d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        /* renamed from: e */
        static boolean m3942e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m3943f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        /* renamed from: g */
        static ColorStateList m3944g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m3945h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m3946i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C0675g0 m3947j(View view) {
            return C0675g0.a.m3678a(view);
        }

        /* renamed from: k */
        static String m3948k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m3949l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m3950m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m3951n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m3952o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m3953p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m3954q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m3955r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m3956s(View view, float f10) {
            view.setElevation(f10);
        }

        /* renamed from: t */
        static void m3957t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        /* renamed from: u */
        static void m3958u(View view, InterfaceC0684p interfaceC0684p) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C4112e.f16696L, interfaceC0684p);
            }
            if (interfaceC0684p == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C4112e.f16703S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0684p));
            }
        }

        /* renamed from: v */
        static void m3959v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m3960w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        /* renamed from: x */
        static void m3961x(View view, float f10) {
            view.setZ(f10);
        }

        /* renamed from: y */
        static boolean m3962y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        /* renamed from: z */
        static void m3963z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.v$n */
    /* loaded from: classes.dex */
    public static class n {
        /* renamed from: a */
        public static C0675g0 m3964a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0675g0 m3656v = C0675g0.m3656v(rootWindowInsets);
            m3656v.m3675s(m3656v);
            m3656v.m3661d(view.getRootView());
            return m3656v;
        }

        /* renamed from: b */
        static int m3965b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m3966c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        /* renamed from: d */
        static void m3967d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v$o */
    /* loaded from: classes.dex */
    public static class o {
        /* renamed from: a */
        static void m3968a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        static void m3969b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        static void m3970c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        static void m3971d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        static boolean m3972e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        /* renamed from: f */
        static void m3973f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v$p */
    /* loaded from: classes.dex */
    public static class p {
        /* renamed from: a */
        static void m3974a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        /* renamed from: b */
        static int m3975b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m3976c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m3977d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m3978e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m3979f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m3980g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m3981h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        /* renamed from: i */
        static boolean m3982i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m3983j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m3984k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        /* renamed from: l */
        static void m3985l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        /* renamed from: m */
        static void m3986m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        /* renamed from: n */
        static void m3987n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        /* renamed from: o */
        static void m3988o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.v$q */
    /* loaded from: classes.dex */
    public static class q {
        /* renamed from: a */
        static void m3989a(View view, v vVar) {
            int i10 = C4112e.f16702R;
            C3362g c3362g = (C3362g) view.getTag(i10);
            if (c3362g == null) {
                c3362g = new C3362g();
                view.setTag(i10, c3362g);
            }
            Objects.requireNonNull(vVar);
            ViewOnUnhandledKeyEventListenerC0691w viewOnUnhandledKeyEventListenerC0691w = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.w
                public /* synthetic */ ViewOnUnhandledKeyEventListenerC0691w() {
                }

                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C0690v.v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c3362g.put(vVar, viewOnUnhandledKeyEventListenerC0691w);
            view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0691w);
        }

        /* renamed from: b */
        static CharSequence m3990b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m3991c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m3992d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m3993e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C3362g c3362g = (C3362g) view.getTag(C4112e.f16702R);
            if (c3362g == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c3362g.get(vVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        static <T> T m3994f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        /* renamed from: g */
        static void m3995g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        /* renamed from: h */
        static void m3996h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m3997i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* renamed from: androidx.core.view.v$r */
    /* loaded from: classes.dex */
    public static class r {
        /* renamed from: a */
        static View.AccessibilityDelegate m3998a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m3999b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m4000c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        /* renamed from: d */
        static void m4001d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.v$s */
    /* loaded from: classes.dex */
    public static class s {
        /* renamed from: a */
        static CharSequence m4002a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m4003b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.v$t */
    /* loaded from: classes.dex */
    public static final class t {
        /* renamed from: a */
        public static String[] m4004a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C0666c m4005b(View view, C0666c c0666c) {
            ContentInfo m3617f = c0666c.m3617f();
            ContentInfo performReceiveContent = view.performReceiveContent(m3617f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == m3617f ? c0666c : C0666c.m3613g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m4006c(View view, String[] strArr, InterfaceC0685q interfaceC0685q) {
            if (interfaceC0685q == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(interfaceC0685q));
            }
        }
    }

    /* renamed from: androidx.core.view.v$u */
    /* loaded from: classes.dex */
    private static final class u implements OnReceiveContentListener {

        /* renamed from: a */
        private final InterfaceC0685q f3652a;

        u(InterfaceC0685q interfaceC0685q) {
            this.f3652a = interfaceC0685q;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0666c m3613g = C0666c.m3613g(contentInfo);
            C0666c mo3775a = this.f3652a.mo3775a(view, m3613g);
            if (mo3775a == null) {
                return null;
            }
            return mo3775a == m3613g ? contentInfo : mo3775a.m3617f();
        }
    }

    /* renamed from: androidx.core.view.v$v */
    /* loaded from: classes.dex */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v$w */
    /* loaded from: classes.dex */
    public static class w {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f3653d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3654a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f3655b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f3656c = null;

        w() {
        }

        /* renamed from: a */
        static w m4007a(View view) {
            int i10 = C4112e.f16701Q;
            w wVar = (w) view.getTag(i10);
            if (wVar != null) {
                return wVar;
            }
            w wVar2 = new w();
            view.setTag(i10, wVar2);
            return wVar2;
        }

        /* renamed from: c */
        private View m4008c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3654a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m4008c = m4008c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m4008c != null) {
                            return m4008c;
                        }
                    }
                }
                if (m4010e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m4009d() {
            if (this.f3655b == null) {
                this.f3655b = new SparseArray<>();
            }
            return this.f3655b;
        }

        /* renamed from: e */
        private boolean m4010e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C4112e.f16702R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m4011g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3654a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3653d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3654a == null) {
                    this.f3654a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f3653d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3654a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3654a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m4012b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4011g();
            }
            View m4008c = m4008c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m4008c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4009d().put(keyCode, new WeakReference<>(m4008c));
                }
            }
            return m4008c != null;
        }

        /* renamed from: f */
        boolean m4013f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3656c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3656c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> m4009d = m4009d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m4009d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = m4009d.valueAt(indexOfKey);
                m4009d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = m4009d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C0690v.m3813T(view)) {
                m4010e(view, keyEvent);
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private static InterfaceC0686r m3783A(View view) {
        if (view instanceof InterfaceC0686r) {
            return (InterfaceC0686r) view;
        }
        return f3642g;
    }

    /* renamed from: A0 */
    public static void m3784A0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m3985l(view, i10);
        }
    }

    /* renamed from: B */
    public static boolean m3785B(View view) {
        return h.m3896b(view);
    }

    /* renamed from: B0 */
    public static void m3786B0(View view, InterfaceC0684p interfaceC0684p) {
        m.m3958u(view, interfaceC0684p);
    }

    /* renamed from: C */
    public static int m3787C(View view) {
        return h.m3897c(view);
    }

    /* renamed from: C0 */
    public static void m3788C0(View view, int i10, int i11, int i12, int i13) {
        i.m3924k(view, i10, i11, i12, i13);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: D */
    public static int m3789D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.m3975b(view);
        }
        return 0;
    }

    /* renamed from: D0 */
    public static void m3790D0(View view, C0688t c0688t) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.m3971d(view, (PointerIcon) (c0688t != null ? c0688t.m3779a() : null));
        }
    }

    /* renamed from: E */
    public static int m3791E(View view) {
        return i.m3917d(view);
    }

    /* renamed from: E0 */
    public static void m3792E0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.m3967d(view, i10, i11);
        }
    }

    /* renamed from: F */
    public static int m3793F(View view) {
        return h.m3898d(view);
    }

    /* renamed from: F0 */
    public static void m3794F0(View view, CharSequence charSequence) {
        m3800I0().m3893g(view, charSequence);
    }

    /* renamed from: G */
    public static int m3795G(View view) {
        return h.m3899e(view);
    }

    /* renamed from: G0 */
    public static void m3796G0(View view, String str) {
        m.m3959v(view, str);
    }

    /* renamed from: H */
    public static String[] m3797H(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.m4004a(view);
        }
        return (String[]) view.getTag(C4112e.f16698N);
    }

    /* renamed from: H0 */
    private static void m3798H0(View view) {
        if (m3787C(view) == 0) {
            m3871z0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m3787C((View) parent) == 4) {
                m3871z0(view, 2);
                return;
            }
        }
    }

    /* renamed from: I */
    public static int m3799I(View view) {
        return i.m3918e(view);
    }

    /* renamed from: I0 */
    private static f<CharSequence> m3800I0() {
        return new c(C4112e.f16700P, CharSequence.class, 64, 30);
    }

    /* renamed from: J */
    public static int m3801J(View view) {
        return i.m3919f(view);
    }

    /* renamed from: J0 */
    public static void m3802J0(View view) {
        m.m3963z(view);
    }

    /* renamed from: K */
    public static C0675g0 m3803K(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.m3964a(view);
        }
        return m.m3947j(view);
    }

    /* renamed from: K0 */
    private static void m3804K0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: L */
    public static CharSequence m3805L(View view) {
        return m3800I0().m3892f(view);
    }

    /* renamed from: M */
    public static String m3806M(View view) {
        return m.m3948k(view);
    }

    @Deprecated
    /* renamed from: N */
    public static int m3807N(View view) {
        return h.m3901g(view);
    }

    /* renamed from: O */
    public static float m3808O(View view) {
        return m.m3950m(view);
    }

    /* renamed from: P */
    public static boolean m3809P(View view) {
        return g.m3894a(view);
    }

    /* renamed from: Q */
    public static boolean m3810Q(View view) {
        return h.m3902h(view);
    }

    /* renamed from: R */
    public static boolean m3811R(View view) {
        return h.m3903i(view);
    }

    /* renamed from: S */
    public static boolean m3812S(View view) {
        Boolean m3892f = m3822b().m3892f(view);
        return m3892f != null && m3892f.booleanValue();
    }

    /* renamed from: T */
    public static boolean m3813T(View view) {
        return k.m3929b(view);
    }

    /* renamed from: U */
    public static boolean m3814U(View view) {
        return k.m3930c(view);
    }

    /* renamed from: V */
    public static boolean m3815V(View view) {
        return m.m3953p(view);
    }

    /* renamed from: W */
    public static boolean m3816W(View view) {
        return i.m3920g(view);
    }

    /* renamed from: X */
    public static boolean m3817X(View view) {
        Boolean m3892f = m3851p0().m3892f(view);
        return m3892f != null && m3892f.booleanValue();
    }

    /* renamed from: Y */
    public static /* synthetic */ C0666c m3818Y(C0666c c0666c) {
        return c0666c;
    }

    /* renamed from: Z */
    static void m3819Z(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m3854r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (m3852q(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                k.m3934g(obtain, i10);
                if (z10) {
                    obtain.getText().add(m3854r(view));
                    m3798H0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.m3934g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m3854r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.m3932e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    /* renamed from: a0 */
    public static void m3821a0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect m3870z = m3870z();
        boolean z10 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m3870z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !m3870z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m3830f(view, i10);
        if (z10 && m3870z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m3870z);
        }
    }

    /* renamed from: b */
    private static f<Boolean> m3822b() {
        return new d(C4112e.f16694J, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m3823b0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect m3870z = m3870z();
        boolean z10 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m3870z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !m3870z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m3832g(view, i10);
        if (z10 && m3870z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m3870z);
        }
    }

    /* renamed from: c */
    public static int m3824c(View view, CharSequence charSequence, InterfaceC0663f interfaceC0663f) {
        int m3858t = m3858t(view, charSequence);
        if (m3858t != -1) {
            m3826d(view, new C0660c.a(m3858t, charSequence, interfaceC0663f));
        }
        return m3858t;
    }

    /* renamed from: c0 */
    public static C0675g0 m3825c0(View view, C0675g0 c0675g0) {
        WindowInsets m3677u = c0675g0.m3677u();
        if (m3677u != null) {
            WindowInsets m3936b = l.m3936b(view, m3677u);
            if (!m3936b.equals(m3677u)) {
                return C0675g0.m3657w(m3936b, view);
            }
        }
        return c0675g0;
    }

    /* renamed from: d */
    private static void m3826d(View view, C0660c.a aVar) {
        m3842l(view);
        m3843l0(aVar.m3575b(), view);
        m3856s(view).add(aVar);
        m3819Z(view, 0);
    }

    /* renamed from: d0 */
    public static void m3827d0(View view, C0660c c0660c) {
        view.onInitializeAccessibilityNodeInfo(c0660c.m3573y0());
    }

    /* renamed from: e */
    public static C0665b0 m3828e(View view) {
        if (f3637b == null) {
            f3637b = new WeakHashMap<>();
        }
        C0665b0 c0665b0 = f3637b.get(view);
        if (c0665b0 != null) {
            return c0665b0;
        }
        C0665b0 c0665b02 = new C0665b0(view);
        f3637b.put(view, c0665b02);
        return c0665b02;
    }

    /* renamed from: e0 */
    private static f<CharSequence> m3829e0() {
        return new b(C4112e.f16695K, CharSequence.class, 8, 28);
    }

    /* renamed from: f */
    private static void m3830f(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            m3804K0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m3804K0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static boolean m3831f0(View view, int i10, Bundle bundle) {
        return h.m3904j(view, i10, bundle);
    }

    /* renamed from: g */
    private static void m3832g(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            m3804K0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m3804K0((View) parent);
            }
        }
    }

    /* renamed from: g0 */
    public static C0666c m3833g0(View view, C0666c c0666c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0666c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.m4005b(view, c0666c);
        }
        InterfaceC0685q interfaceC0685q = (InterfaceC0685q) view.getTag(C4112e.f16697M);
        if (interfaceC0685q != null) {
            C0666c mo3775a = interfaceC0685q.mo3775a(view, c0666c);
            if (mo3775a == null) {
                return null;
            }
            return m3783A(view).onReceiveContent(mo3775a);
        }
        return m3783A(view).onReceiveContent(c0666c);
    }

    /* renamed from: h */
    public static C0675g0 m3834h(View view, C0675g0 c0675g0, Rect rect) {
        return m.m3939b(view, c0675g0, rect);
    }

    /* renamed from: h0 */
    public static void m3835h0(View view) {
        h.m3905k(view);
    }

    /* renamed from: i */
    public static C0675g0 m3836i(View view, C0675g0 c0675g0) {
        WindowInsets m3677u = c0675g0.m3677u();
        if (m3677u != null) {
            WindowInsets m3935a = l.m3935a(view, m3677u);
            if (!m3935a.equals(m3677u)) {
                return C0675g0.m3657w(m3935a, view);
            }
        }
        return c0675g0;
    }

    /* renamed from: i0 */
    public static void m3837i0(View view, Runnable runnable) {
        h.m3907m(view, runnable);
    }

    /* renamed from: j */
    public static boolean m3838j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.m4007a(view).m4012b(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: j0 */
    public static void m3839j0(View view, Runnable runnable, long j10) {
        h.m3908n(view, runnable, j10);
    }

    /* renamed from: k */
    public static boolean m3840k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.m4007a(view).m4013f(keyEvent);
    }

    /* renamed from: k0 */
    public static void m3841k0(View view, int i10) {
        m3843l0(i10, view);
        m3819Z(view, 0);
    }

    /* renamed from: l */
    static void m3842l(View view) {
        C0656a m3846n = m3846n(view);
        if (m3846n == null) {
            m3846n = new C0656a();
        }
        m3853q0(view, m3846n);
    }

    /* renamed from: l0 */
    private static void m3843l0(int i10, View view) {
        List<C0660c.a> m3856s = m3856s(view);
        for (int i11 = 0; i11 < m3856s.size(); i11++) {
            if (m3856s.get(i11).m3575b() == i10) {
                m3856s.remove(i11);
                return;
            }
        }
    }

    /* renamed from: m */
    public static int m3844m() {
        return i.m3914a();
    }

    /* renamed from: m0 */
    public static void m3845m0(View view, C0660c.a aVar, CharSequence charSequence, InterfaceC0663f interfaceC0663f) {
        if (interfaceC0663f == null && charSequence == null) {
            m3841k0(view, aVar.m3575b());
        } else {
            m3826d(view, aVar.m3574a(charSequence, interfaceC0663f));
        }
    }

    /* renamed from: n */
    public static C0656a m3846n(View view) {
        View.AccessibilityDelegate m3848o = m3848o(view);
        if (m3848o == null) {
            return null;
        }
        if (m3848o instanceof C0656a.a) {
            return ((C0656a.a) m3848o).f3503a;
        }
        return new C0656a(m3848o);
    }

    /* renamed from: n0 */
    public static void m3847n0(View view) {
        l.m3937c(view);
    }

    /* renamed from: o */
    private static View.AccessibilityDelegate m3848o(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.m3998a(view);
        }
        return m3850p(view);
    }

    /* renamed from: o0 */
    public static void m3849o0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.m4000c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: p */
    private static View.AccessibilityDelegate m3850p(View view) {
        if (f3639d) {
            return null;
        }
        if (f3638c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3638c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3639d = true;
                return null;
            }
        }
        try {
            Object obj = f3638c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3639d = true;
            return null;
        }
    }

    /* renamed from: p0 */
    private static f<Boolean> m3851p0() {
        return new a(C4112e.f16699O, Boolean.class, 28);
    }

    /* renamed from: q */
    public static int m3852q(View view) {
        return k.m3928a(view);
    }

    /* renamed from: q0 */
    public static void m3853q0(View view, C0656a c0656a) {
        if (c0656a == null && (m3848o(view) instanceof C0656a.a)) {
            c0656a = new C0656a();
        }
        view.setAccessibilityDelegate(c0656a == null ? null : c0656a.m3482d());
    }

    /* renamed from: r */
    public static CharSequence m3854r(View view) {
        return m3829e0().m3892f(view);
    }

    /* renamed from: r0 */
    public static void m3855r0(View view, boolean z10) {
        m3822b().m3893g(view, Boolean.valueOf(z10));
    }

    /* renamed from: s */
    private static List<C0660c.a> m3856s(View view) {
        int i10 = C4112e.f16692H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    /* renamed from: s0 */
    public static void m3857s0(View view, int i10) {
        k.m3933f(view, i10);
    }

    /* renamed from: t */
    private static int m3858t(View view, CharSequence charSequence) {
        List<C0660c.a> m3856s = m3856s(view);
        for (int i10 = 0; i10 < m3856s.size(); i10++) {
            if (TextUtils.equals(charSequence, m3856s.get(i10).m3576c())) {
                return m3856s.get(i10).m3575b();
            }
        }
        int i11 = 0;
        int i12 = -1;
        while (true) {
            int[] iArr = f3641f;
            if (i11 >= iArr.length || i12 != -1) {
                break;
            }
            int i13 = iArr[i11];
            boolean z10 = true;
            for (int i14 = 0; i14 < m3856s.size(); i14++) {
                z10 &= m3856s.get(i14).m3575b() != i13;
            }
            if (z10) {
                i12 = i13;
            }
            i11++;
        }
        return i12;
    }

    /* renamed from: t0 */
    public static void m3859t0(View view, Drawable drawable) {
        h.m3911q(view, drawable);
    }

    /* renamed from: u */
    public static ColorStateList m3860u(View view) {
        return m.m3944g(view);
    }

    /* renamed from: u0 */
    public static void m3861u0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        m.m3954q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (m.m3944g(view) == null && m.m3945h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.m3911q(view, background);
        }
    }

    /* renamed from: v */
    public static PorterDuff.Mode m3862v(View view) {
        return m.m3945h(view);
    }

    /* renamed from: v0 */
    public static void m3863v0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        m.m3955r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (m.m3944g(view) == null && m.m3945h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.m3911q(view, background);
        }
    }

    /* renamed from: w */
    public static Rect m3864w(View view) {
        return j.m3925a(view);
    }

    /* renamed from: w0 */
    public static void m3865w0(View view, Rect rect) {
        j.m3927c(view, rect);
    }

    /* renamed from: x */
    public static Display m3866x(View view) {
        return i.m3915b(view);
    }

    /* renamed from: x0 */
    public static void m3867x0(View view, float f10) {
        m.m3956s(view, f10);
    }

    /* renamed from: y */
    public static float m3868y(View view) {
        return m.m3946i(view);
    }

    /* renamed from: y0 */
    public static void m3869y0(View view, boolean z10) {
        h.m3912r(view, z10);
    }

    /* renamed from: z */
    private static Rect m3870z() {
        if (f3640e == null) {
            f3640e = new ThreadLocal<>();
        }
        Rect rect = f3640e.get();
        if (rect == null) {
            rect = new Rect();
            f3640e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: z0 */
    public static void m3871z0(View view, int i10) {
        h.m3913s(view, i10);
    }
}
