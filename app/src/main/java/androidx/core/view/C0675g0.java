package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C0602b;
import androidx.core.util.C0649c;
import androidx.core.util.C0654h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.g0 */
/* loaded from: classes.dex */
public class C0675g0 {

    /* renamed from: b */
    public static final C0675g0 f3591b;

    /* renamed from: a */
    private final l f3592a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.g0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static Field f3593a;

        /* renamed from: b */
        private static Field f3594b;

        /* renamed from: c */
        private static Field f3595c;

        /* renamed from: d */
        private static boolean f3596d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3593a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3594b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3595c = declaredField3;
                declaredField3.setAccessible(true);
                f3596d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        /* renamed from: a */
        public static C0675g0 m3678a(View view) {
            if (f3596d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3593a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3594b.get(obj);
                        Rect rect2 = (Rect) f3595c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0675g0 m3679a = new b().m3680b(C0602b.m3183c(rect)).m3681c(C0602b.m3183c(rect2)).m3679a();
                            m3679a.m3675s(m3679a);
                            m3679a.m3661d(view.getRootView());
                            return m3679a;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.g0$e */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(C0675g0 c0675g0) {
            super(c0675g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.g0$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final C0675g0 f3605a;

        /* renamed from: b */
        C0602b[] f3606b;

        f() {
            this(new C0675g0((C0675g0) null));
        }

        /* renamed from: a */
        protected final void m3689a() {
            C0602b[] c0602bArr = this.f3606b;
            if (c0602bArr != null) {
                C0602b c0602b = c0602bArr[m.m3715b(1)];
                C0602b c0602b2 = this.f3606b[m.m3715b(2)];
                if (c0602b2 == null) {
                    c0602b2 = this.f3605a.m3663f(2);
                }
                if (c0602b == null) {
                    c0602b = this.f3605a.m3663f(1);
                }
                mo3685f(C0602b.m3181a(c0602b, c0602b2));
                C0602b c0602b3 = this.f3606b[m.m3715b(16)];
                if (c0602b3 != null) {
                    mo3687e(c0602b3);
                }
                C0602b c0602b4 = this.f3606b[m.m3715b(32)];
                if (c0602b4 != null) {
                    mo3686c(c0602b4);
                }
                C0602b c0602b5 = this.f3606b[m.m3715b(64)];
                if (c0602b5 != null) {
                    mo3688g(c0602b5);
                }
            }
        }

        /* renamed from: b */
        C0675g0 mo3683b() {
            throw null;
        }

        /* renamed from: c */
        void mo3686c(C0602b c0602b) {
        }

        /* renamed from: d */
        void mo3684d(C0602b c0602b) {
            throw null;
        }

        /* renamed from: e */
        void mo3687e(C0602b c0602b) {
        }

        /* renamed from: f */
        void mo3685f(C0602b c0602b) {
            throw null;
        }

        /* renamed from: g */
        void mo3688g(C0602b c0602b) {
        }

        f(C0675g0 c0675g0) {
            this.f3605a = c0675g0;
        }
    }

    /* renamed from: androidx.core.view.g0$i */
    /* loaded from: classes.dex */
    private static class i extends h {
        i(C0675g0 c0675g0, WindowInsets windowInsets) {
            super(c0675g0, windowInsets);
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: a */
        C0675g0 mo3709a() {
            return C0675g0.m3656v(this.f3612c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C0675g0.g, androidx.core.view.C0675g0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f3612c, iVar.f3612c) && Objects.equals(this.f3616g, iVar.f3616g);
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: f */
        C0668d mo3710f() {
            return C0668d.m3629e(this.f3612c.getDisplayCutout());
        }

        @Override // androidx.core.view.C0675g0.l
        public int hashCode() {
            return this.f3612c.hashCode();
        }

        i(C0675g0 c0675g0, i iVar) {
            super(c0675g0, iVar);
        }
    }

    /* renamed from: androidx.core.view.g0$k */
    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q */
        static final C0675g0 f3621q = C0675g0.m3656v(WindowInsets.CONSUMED);

        k(C0675g0 c0675g0, WindowInsets windowInsets) {
            super(c0675g0, windowInsets);
        }

        @Override // androidx.core.view.C0675g0.g, androidx.core.view.C0675g0.l
        /* renamed from: d */
        final void mo3694d(View view) {
        }

        @Override // androidx.core.view.C0675g0.g, androidx.core.view.C0675g0.l
        /* renamed from: g */
        public C0602b mo3696g(int i10) {
            return C0602b.m3184d(this.f3612c.getInsets(n.m3718a(i10)));
        }

        k(C0675g0 c0675g0, k kVar) {
            super(c0675g0, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.g0$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b */
        static final C0675g0 f3622b = new b().m3679a().m3658a().m3659b().m3660c();

        /* renamed from: a */
        final C0675g0 f3623a;

        l(C0675g0 c0675g0) {
            this.f3623a = c0675g0;
        }

        /* renamed from: a */
        C0675g0 mo3709a() {
            return this.f3623a;
        }

        /* renamed from: b */
        C0675g0 mo3704b() {
            return this.f3623a;
        }

        /* renamed from: c */
        C0675g0 mo3705c() {
            return this.f3623a;
        }

        /* renamed from: d */
        void mo3694d(View view) {
        }

        /* renamed from: e */
        void mo3695e(C0675g0 c0675g0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo3699o() == lVar.mo3699o() && mo3707n() == lVar.mo3707n() && C0649c.m3452a(mo3697k(), lVar.mo3697k()) && C0649c.m3452a(mo3706i(), lVar.mo3706i()) && C0649c.m3452a(mo3710f(), lVar.mo3710f());
        }

        /* renamed from: f */
        C0668d mo3710f() {
            return null;
        }

        /* renamed from: g */
        C0602b mo3696g(int i10) {
            return C0602b.f3318e;
        }

        /* renamed from: h */
        C0602b mo3711h() {
            return mo3697k();
        }

        public int hashCode() {
            return C0649c.m3453b(Boolean.valueOf(mo3699o()), Boolean.valueOf(mo3707n()), mo3697k(), mo3706i(), mo3710f());
        }

        /* renamed from: i */
        C0602b mo3706i() {
            return C0602b.f3318e;
        }

        /* renamed from: j */
        C0602b mo3712j() {
            return mo3697k();
        }

        /* renamed from: k */
        C0602b mo3697k() {
            return C0602b.f3318e;
        }

        /* renamed from: l */
        C0602b mo3713l() {
            return mo3697k();
        }

        /* renamed from: m */
        C0675g0 mo3698m(int i10, int i11, int i12, int i13) {
            return f3622b;
        }

        /* renamed from: n */
        boolean mo3707n() {
            return false;
        }

        /* renamed from: o */
        boolean mo3699o() {
            return false;
        }

        /* renamed from: p */
        public void mo3700p(C0602b[] c0602bArr) {
        }

        /* renamed from: q */
        void mo3701q(C0602b c0602b) {
        }

        /* renamed from: r */
        void mo3702r(C0675g0 c0675g0) {
        }

        /* renamed from: s */
        public void mo3708s(C0602b c0602b) {
        }
    }

    /* renamed from: androidx.core.view.g0$m */
    /* loaded from: classes.dex */
    public static final class m {
        /* renamed from: a */
        public static int m3714a() {
            return 128;
        }

        /* renamed from: b */
        static int m3715b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        /* renamed from: c */
        public static int m3716c() {
            return 2;
        }

        /* renamed from: d */
        public static int m3717d() {
            return 1;
        }
    }

    /* renamed from: androidx.core.view.g0$n */
    /* loaded from: classes.dex */
    private static final class n {
        /* renamed from: a */
        static int m3718a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3591b = k.f3621q;
        } else {
            f3591b = l.f3622b;
        }
    }

    private C0675g0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3592a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f3592a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f3592a = new i(this, windowInsets);
        } else {
            this.f3592a = new h(this, windowInsets);
        }
    }

    /* renamed from: n */
    static C0602b m3655n(C0602b c0602b, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, c0602b.f3319a - i10);
        int max2 = Math.max(0, c0602b.f3320b - i11);
        int max3 = Math.max(0, c0602b.f3321c - i12);
        int max4 = Math.max(0, c0602b.f3322d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? c0602b : C0602b.m3182b(max, max2, max3, max4);
    }

    /* renamed from: v */
    public static C0675g0 m3656v(WindowInsets windowInsets) {
        return m3657w(windowInsets, null);
    }

    /* renamed from: w */
    public static C0675g0 m3657w(WindowInsets windowInsets, View view) {
        C0675g0 c0675g0 = new C0675g0((WindowInsets) C0654h.m3467f(windowInsets));
        if (view != null && C0690v.m3813T(view)) {
            c0675g0.m3675s(C0690v.m3803K(view));
            c0675g0.m3661d(view.getRootView());
        }
        return c0675g0;
    }

    @Deprecated
    /* renamed from: a */
    public C0675g0 m3658a() {
        return this.f3592a.mo3709a();
    }

    @Deprecated
    /* renamed from: b */
    public C0675g0 m3659b() {
        return this.f3592a.mo3704b();
    }

    @Deprecated
    /* renamed from: c */
    public C0675g0 m3660c() {
        return this.f3592a.mo3705c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3661d(View view) {
        this.f3592a.mo3694d(view);
    }

    /* renamed from: e */
    public C0668d m3662e() {
        return this.f3592a.mo3710f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0675g0) {
            return C0649c.m3452a(this.f3592a, ((C0675g0) obj).f3592a);
        }
        return false;
    }

    /* renamed from: f */
    public C0602b m3663f(int i10) {
        return this.f3592a.mo3696g(i10);
    }

    @Deprecated
    /* renamed from: g */
    public C0602b m3664g() {
        return this.f3592a.mo3711h();
    }

    @Deprecated
    /* renamed from: h */
    public C0602b m3665h() {
        return this.f3592a.mo3706i();
    }

    public int hashCode() {
        l lVar = this.f3592a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m3666i() {
        return this.f3592a.mo3697k().f3322d;
    }

    @Deprecated
    /* renamed from: j */
    public int m3667j() {
        return this.f3592a.mo3697k().f3319a;
    }

    @Deprecated
    /* renamed from: k */
    public int m3668k() {
        return this.f3592a.mo3697k().f3321c;
    }

    @Deprecated
    /* renamed from: l */
    public int m3669l() {
        return this.f3592a.mo3697k().f3320b;
    }

    /* renamed from: m */
    public C0675g0 m3670m(int i10, int i11, int i12, int i13) {
        return this.f3592a.mo3698m(i10, i11, i12, i13);
    }

    /* renamed from: o */
    public boolean m3671o() {
        return this.f3592a.mo3707n();
    }

    @Deprecated
    /* renamed from: p */
    public C0675g0 m3672p(int i10, int i11, int i12, int i13) {
        return new b(this).m3681c(C0602b.m3182b(i10, i11, i12, i13)).m3679a();
    }

    /* renamed from: q */
    void m3673q(C0602b[] c0602bArr) {
        this.f3592a.mo3700p(c0602bArr);
    }

    /* renamed from: r */
    void m3674r(C0602b c0602b) {
        this.f3592a.mo3701q(c0602b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m3675s(C0675g0 c0675g0) {
        this.f3592a.mo3702r(c0675g0);
    }

    /* renamed from: t */
    void m3676t(C0602b c0602b) {
        this.f3592a.mo3708s(c0602b);
    }

    /* renamed from: u */
    public WindowInsets m3677u() {
        l lVar = this.f3592a;
        if (lVar instanceof g) {
            return ((g) lVar).f3612c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.g0$c */
    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e */
        private static Field f3598e;

        /* renamed from: f */
        private static boolean f3599f;

        /* renamed from: g */
        private static Constructor<WindowInsets> f3600g;

        /* renamed from: h */
        private static boolean f3601h;

        /* renamed from: c */
        private WindowInsets f3602c;

        /* renamed from: d */
        private C0602b f3603d;

        c() {
            this.f3602c = m3682h();
        }

        /* renamed from: h */
        private static WindowInsets m3682h() {
            if (!f3599f) {
                try {
                    f3598e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3599f = true;
            }
            Field field = f3598e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f3601h) {
                try {
                    f3600g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f3601h = true;
            }
            Constructor<WindowInsets> constructor = f3600g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: b */
        C0675g0 mo3683b() {
            m3689a();
            C0675g0 m3656v = C0675g0.m3656v(this.f3602c);
            m3656v.m3673q(this.f3606b);
            m3656v.m3676t(this.f3603d);
            return m3656v;
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: d */
        void mo3684d(C0602b c0602b) {
            this.f3603d = c0602b;
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: f */
        void mo3685f(C0602b c0602b) {
            WindowInsets windowInsets = this.f3602c;
            if (windowInsets != null) {
                this.f3602c = windowInsets.replaceSystemWindowInsets(c0602b.f3319a, c0602b.f3320b, c0602b.f3321c, c0602b.f3322d);
            }
        }

        c(C0675g0 c0675g0) {
            super(c0675g0);
            this.f3602c = c0675g0.m3677u();
        }
    }

    /* renamed from: androidx.core.view.g0$d */
    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f3604c;

        d() {
            this.f3604c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: b */
        C0675g0 mo3683b() {
            m3689a();
            C0675g0 m3656v = C0675g0.m3656v(this.f3604c.build());
            m3656v.m3673q(this.f3606b);
            return m3656v;
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: c */
        void mo3686c(C0602b c0602b) {
            this.f3604c.setMandatorySystemGestureInsets(c0602b.m3185e());
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: d */
        void mo3684d(C0602b c0602b) {
            this.f3604c.setStableInsets(c0602b.m3185e());
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: e */
        void mo3687e(C0602b c0602b) {
            this.f3604c.setSystemGestureInsets(c0602b.m3185e());
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: f */
        void mo3685f(C0602b c0602b) {
            this.f3604c.setSystemWindowInsets(c0602b.m3185e());
        }

        @Override // androidx.core.view.C0675g0.f
        /* renamed from: g */
        void mo3688g(C0602b c0602b) {
            this.f3604c.setTappableElementInsets(c0602b.m3185e());
        }

        d(C0675g0 c0675g0) {
            super(c0675g0);
            WindowInsets.Builder builder;
            WindowInsets m3677u = c0675g0.m3677u();
            if (m3677u != null) {
                builder = new WindowInsets.Builder(m3677u);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3604c = builder;
        }
    }

    /* renamed from: androidx.core.view.g0$h */
    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m */
        private C0602b f3617m;

        h(C0675g0 c0675g0, WindowInsets windowInsets) {
            super(c0675g0, windowInsets);
            this.f3617m = null;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: b */
        C0675g0 mo3704b() {
            return C0675g0.m3656v(this.f3612c.consumeStableInsets());
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: c */
        C0675g0 mo3705c() {
            return C0675g0.m3656v(this.f3612c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: i */
        final C0602b mo3706i() {
            if (this.f3617m == null) {
                this.f3617m = C0602b.m3182b(this.f3612c.getStableInsetLeft(), this.f3612c.getStableInsetTop(), this.f3612c.getStableInsetRight(), this.f3612c.getStableInsetBottom());
            }
            return this.f3617m;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: n */
        boolean mo3707n() {
            return this.f3612c.isConsumed();
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: s */
        public void mo3708s(C0602b c0602b) {
            this.f3617m = c0602b;
        }

        h(C0675g0 c0675g0, h hVar) {
            super(c0675g0, hVar);
            this.f3617m = null;
            this.f3617m = hVar.f3617m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.g0$g */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h */
        private static boolean f3607h;

        /* renamed from: i */
        private static Method f3608i;

        /* renamed from: j */
        private static Class<?> f3609j;

        /* renamed from: k */
        private static Field f3610k;

        /* renamed from: l */
        private static Field f3611l;

        /* renamed from: c */
        final WindowInsets f3612c;

        /* renamed from: d */
        private C0602b[] f3613d;

        /* renamed from: e */
        private C0602b f3614e;

        /* renamed from: f */
        private C0675g0 f3615f;

        /* renamed from: g */
        C0602b f3616g;

        g(C0675g0 c0675g0, WindowInsets windowInsets) {
            super(c0675g0);
            this.f3614e = null;
            this.f3612c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C0602b m3690t(int i10, boolean z10) {
            C0602b c0602b = C0602b.f3318e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c0602b = C0602b.m3181a(c0602b, m3703u(i11, z10));
                }
            }
            return c0602b;
        }

        /* renamed from: v */
        private C0602b m3691v() {
            C0675g0 c0675g0 = this.f3615f;
            if (c0675g0 != null) {
                return c0675g0.m3665h();
            }
            return C0602b.f3318e;
        }

        /* renamed from: w */
        private C0602b m3692w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3607h) {
                    m3693x();
                }
                Method method = f3608i;
                if (method != null && f3609j != null && f3610k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3610k.get(f3611l.get(invoke));
                        if (rect != null) {
                            return C0602b.m3183c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m3693x() {
            try {
                f3608i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3609j = cls;
                f3610k = cls.getDeclaredField("mVisibleInsets");
                f3611l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3610k.setAccessible(true);
                f3611l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f3607h = true;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: d */
        void mo3694d(View view) {
            C0602b m3692w = m3692w(view);
            if (m3692w == null) {
                m3692w = C0602b.f3318e;
            }
            mo3701q(m3692w);
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: e */
        void mo3695e(C0675g0 c0675g0) {
            c0675g0.m3675s(this.f3615f);
            c0675g0.m3674r(this.f3616g);
        }

        @Override // androidx.core.view.C0675g0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3616g, ((g) obj).f3616g);
            }
            return false;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: g */
        public C0602b mo3696g(int i10) {
            return m3690t(i10, false);
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: k */
        final C0602b mo3697k() {
            if (this.f3614e == null) {
                this.f3614e = C0602b.m3182b(this.f3612c.getSystemWindowInsetLeft(), this.f3612c.getSystemWindowInsetTop(), this.f3612c.getSystemWindowInsetRight(), this.f3612c.getSystemWindowInsetBottom());
            }
            return this.f3614e;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: m */
        C0675g0 mo3698m(int i10, int i11, int i12, int i13) {
            b bVar = new b(C0675g0.m3656v(this.f3612c));
            bVar.m3681c(C0675g0.m3655n(mo3697k(), i10, i11, i12, i13));
            bVar.m3680b(C0675g0.m3655n(mo3706i(), i10, i11, i12, i13));
            return bVar.m3679a();
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: o */
        boolean mo3699o() {
            return this.f3612c.isRound();
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: p */
        public void mo3700p(C0602b[] c0602bArr) {
            this.f3613d = c0602bArr;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: q */
        void mo3701q(C0602b c0602b) {
            this.f3616g = c0602b;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: r */
        void mo3702r(C0675g0 c0675g0) {
            this.f3615f = c0675g0;
        }

        /* renamed from: u */
        protected C0602b m3703u(int i10, boolean z10) {
            C0602b m3665h;
            int i11;
            C0668d mo3710f;
            if (i10 == 1) {
                if (z10) {
                    return C0602b.m3182b(0, Math.max(m3691v().f3320b, mo3697k().f3320b), 0, 0);
                }
                return C0602b.m3182b(0, mo3697k().f3320b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C0602b m3691v = m3691v();
                    C0602b mo3706i = mo3706i();
                    return C0602b.m3182b(Math.max(m3691v.f3319a, mo3706i.f3319a), 0, Math.max(m3691v.f3321c, mo3706i.f3321c), Math.max(m3691v.f3322d, mo3706i.f3322d));
                }
                C0602b mo3697k = mo3697k();
                C0675g0 c0675g0 = this.f3615f;
                m3665h = c0675g0 != null ? c0675g0.m3665h() : null;
                int i12 = mo3697k.f3322d;
                if (m3665h != null) {
                    i12 = Math.min(i12, m3665h.f3322d);
                }
                return C0602b.m3182b(mo3697k.f3319a, 0, mo3697k.f3321c, i12);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return mo3712j();
                }
                if (i10 == 32) {
                    return mo3711h();
                }
                if (i10 == 64) {
                    return mo3713l();
                }
                if (i10 != 128) {
                    return C0602b.f3318e;
                }
                C0675g0 c0675g02 = this.f3615f;
                if (c0675g02 != null) {
                    mo3710f = c0675g02.m3662e();
                } else {
                    mo3710f = mo3710f();
                }
                if (mo3710f != null) {
                    return C0602b.m3182b(mo3710f.m3631b(), mo3710f.m3633d(), mo3710f.m3632c(), mo3710f.m3630a());
                }
                return C0602b.f3318e;
            }
            C0602b[] c0602bArr = this.f3613d;
            m3665h = c0602bArr != null ? c0602bArr[m.m3715b(8)] : null;
            if (m3665h != null) {
                return m3665h;
            }
            C0602b mo3697k2 = mo3697k();
            C0602b m3691v2 = m3691v();
            int i13 = mo3697k2.f3322d;
            if (i13 > m3691v2.f3322d) {
                return C0602b.m3182b(0, 0, 0, i13);
            }
            C0602b c0602b = this.f3616g;
            if (c0602b != null && !c0602b.equals(C0602b.f3318e) && (i11 = this.f3616g.f3322d) > m3691v2.f3322d) {
                return C0602b.m3182b(0, 0, 0, i11);
            }
            return C0602b.f3318e;
        }

        g(C0675g0 c0675g0, g gVar) {
            this(c0675g0, new WindowInsets(gVar.f3612c));
        }
    }

    /* renamed from: androidx.core.view.g0$j */
    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n */
        private C0602b f3618n;

        /* renamed from: o */
        private C0602b f3619o;

        /* renamed from: p */
        private C0602b f3620p;

        j(C0675g0 c0675g0, WindowInsets windowInsets) {
            super(c0675g0, windowInsets);
            this.f3618n = null;
            this.f3619o = null;
            this.f3620p = null;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: h */
        C0602b mo3711h() {
            if (this.f3619o == null) {
                this.f3619o = C0602b.m3184d(this.f3612c.getMandatorySystemGestureInsets());
            }
            return this.f3619o;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: j */
        C0602b mo3712j() {
            if (this.f3618n == null) {
                this.f3618n = C0602b.m3184d(this.f3612c.getSystemGestureInsets());
            }
            return this.f3618n;
        }

        @Override // androidx.core.view.C0675g0.l
        /* renamed from: l */
        C0602b mo3713l() {
            if (this.f3620p == null) {
                this.f3620p = C0602b.m3184d(this.f3612c.getTappableElementInsets());
            }
            return this.f3620p;
        }

        @Override // androidx.core.view.C0675g0.g, androidx.core.view.C0675g0.l
        /* renamed from: m */
        C0675g0 mo3698m(int i10, int i11, int i12, int i13) {
            return C0675g0.m3656v(this.f3612c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.C0675g0.h, androidx.core.view.C0675g0.l
        /* renamed from: s */
        public void mo3708s(C0602b c0602b) {
        }

        j(C0675g0 c0675g0, j jVar) {
            super(c0675g0, jVar);
            this.f3618n = null;
            this.f3619o = null;
            this.f3620p = null;
        }
    }

    /* renamed from: androidx.core.view.g0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final f f3597a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f3597a = new e();
            } else if (i10 >= 29) {
                this.f3597a = new d();
            } else {
                this.f3597a = new c();
            }
        }

        /* renamed from: a */
        public C0675g0 m3679a() {
            return this.f3597a.mo3683b();
        }

        @Deprecated
        /* renamed from: b */
        public b m3680b(C0602b c0602b) {
            this.f3597a.mo3684d(c0602b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public b m3681c(C0602b c0602b) {
            this.f3597a.mo3685f(c0602b);
            return this;
        }

        public b(C0675g0 c0675g0) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f3597a = new e(c0675g0);
            } else if (i10 >= 29) {
                this.f3597a = new d(c0675g0);
            } else {
                this.f3597a = new c(c0675g0);
            }
        }
    }

    public C0675g0(C0675g0 c0675g0) {
        if (c0675g0 != null) {
            l lVar = c0675g0.f3592a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f3592a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f3592a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f3592a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f3592a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f3592a = new g(this, (g) lVar);
            } else {
                this.f3592a = new l(this);
            }
            lVar.mo3695e(this);
            return;
        }
        this.f3592a = new l(this);
    }
}
