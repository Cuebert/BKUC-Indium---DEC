package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0690v;
import androidx.fragment.app.AbstractC0825z;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0859z;
import p015b1.C0967b;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public class C0816q {

    /* renamed from: a */
    private final C0811l f4072a;

    /* renamed from: b */
    private final C0818s f4073b;

    /* renamed from: c */
    private final Fragment f4074c;

    /* renamed from: d */
    private boolean f4075d = false;

    /* renamed from: e */
    private int f4076e = -1;

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: n */
        final /* synthetic */ View f4077n;

        a(View view) {
            this.f4077n = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4077n.removeOnAttachStateChangeListener(this);
            C0690v.m3847n0(this.f4077n);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4079a;

        static {
            int[] iArr = new int[AbstractC0839f.c.values().length];
            f4079a = iArr;
            try {
                iArr[AbstractC0839f.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4079a[AbstractC0839f.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4079a[AbstractC0839f.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4079a[AbstractC0839f.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0816q(C0811l c0811l, C0818s c0818s, Fragment fragment) {
        this.f4072a = c0811l;
        this.f4073b = c0818s;
        this.f4074c = fragment;
    }

    /* renamed from: l */
    private boolean m4690l(View view) {
        if (view == this.f4074c.f3802U) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4074c.f3802U) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m4691q() {
        Bundle bundle = new Bundle();
        this.f4074c.m4380u1(bundle);
        this.f4072a.m4671j(this.f4074c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4074c.f3802U != null) {
            m4709t();
        }
        if (this.f4074c.f3823p != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4074c.f3823p);
        }
        if (this.f4074c.f3824q != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4074c.f3824q);
        }
        if (!this.f4074c.f3804W) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4074c.f3804W);
        }
        return bundle;
    }

    /* renamed from: a */
    public void m4692a() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4074c);
        }
        Fragment fragment = this.f4074c;
        fragment.m4333a1(fragment.f3822o);
        C0811l c0811l = this.f4072a;
        Fragment fragment2 = this.f4074c;
        c0811l.m4662a(fragment2, fragment2.f3822o, false);
    }

    /* renamed from: b */
    public void m4693b() {
        int m4731j = this.f4073b.m4731j(this.f4074c);
        Fragment fragment = this.f4074c;
        fragment.f3801T.addView(fragment.f3802U, m4731j);
    }

    /* renamed from: c */
    public void m4694c() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4074c);
        }
        Fragment fragment = this.f4074c;
        Fragment fragment2 = fragment.f3828u;
        C0816q c0816q = null;
        if (fragment2 != null) {
            C0816q m4734m = this.f4073b.m4734m(fragment2.f3826s);
            if (m4734m != null) {
                Fragment fragment3 = this.f4074c;
                fragment3.f3829v = fragment3.f3828u.f3826s;
                fragment3.f3828u = null;
                c0816q = m4734m;
            } else {
                throw new IllegalStateException("Fragment " + this.f4074c + " declared target fragment " + this.f4074c.f3828u + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3829v;
            if (str != null && (c0816q = this.f4073b.m4734m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4074c + " declared target fragment " + this.f4074c.f3829v + " that does not belong to this FragmentManager!");
            }
        }
        if (c0816q != null && (FragmentManager.f3865P || c0816q.m4702k().f3821n < 1)) {
            c0816q.m4703m();
        }
        Fragment fragment4 = this.f4074c;
        fragment4.f3788G = fragment4.f3787F.m4519v0();
        Fragment fragment5 = this.f4074c;
        fragment5.f3790I = fragment5.f3787F.m4524y0();
        this.f4072a.m4668g(this.f4074c, false);
        this.f4074c.m4335b1();
        this.f4072a.m4663b(this.f4074c, false);
    }

    /* renamed from: d */
    public int m4695d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f4074c;
        if (fragment2.f3787F == null) {
            return fragment2.f3821n;
        }
        int i10 = this.f4076e;
        int i11 = b.f4079a[fragment2.f3812e0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = Math.min(i10, 5);
            } else if (i11 == 3) {
                i10 = Math.min(i10, 1);
            } else if (i11 != 4) {
                i10 = Math.min(i10, -1);
            } else {
                i10 = Math.min(i10, 0);
            }
        }
        Fragment fragment3 = this.f4074c;
        if (fragment3.f3782A) {
            if (fragment3.f3783B) {
                i10 = Math.max(this.f4076e, 2);
                View view = this.f4074c.f3802U;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f4076e < 4 ? Math.min(i10, fragment3.f3821n) : Math.min(i10, 1);
            }
        }
        if (!this.f4074c.f3832y) {
            i10 = Math.min(i10, 1);
        }
        AbstractC0825z.e.b bVar = null;
        if (FragmentManager.f3865P && (viewGroup = (fragment = this.f4074c).f3801T) != null) {
            bVar = AbstractC0825z.m4824n(viewGroup, fragment.m4289K()).m4834l(this);
        }
        if (bVar == AbstractC0825z.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == AbstractC0825z.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f4074c;
            if (fragment4.f3833z) {
                if (fragment4.m4352k0()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f4074c;
        if (fragment5.f3803V && fragment5.f3821n < 5) {
            i10 = Math.min(i10, 4);
        }
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f4074c);
        }
        return i10;
    }

    /* renamed from: e */
    public void m4696e() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4074c);
        }
        Fragment fragment = this.f4074c;
        if (!fragment.f3811d0) {
            this.f4072a.m4669h(fragment, fragment.f3822o, false);
            Fragment fragment2 = this.f4074c;
            fragment2.m4340e1(fragment2.f3822o);
            C0811l c0811l = this.f4072a;
            Fragment fragment3 = this.f4074c;
            c0811l.m4664c(fragment3, fragment3.f3822o, false);
            return;
        }
        fragment.m4268B1(fragment.f3822o);
        this.f4074c.f3821n = 1;
    }

    /* renamed from: f */
    public void m4697f() {
        String str;
        if (this.f4074c.f3782A) {
            return;
        }
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4074c);
        }
        Fragment fragment = this.f4074c;
        LayoutInflater m4353k1 = fragment.m4353k1(fragment.f3822o);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f4074c;
        ViewGroup viewGroup2 = fragment2.f3801T;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.f3792K;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment2.f3787F.m4510p0().mo4397c(this.f4074c.f3792K);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f4074c;
                        if (!fragment3.f3784C) {
                            try {
                                str = fragment3.m4307Q().getResourceName(this.f4074c.f3792K);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4074c.f3792K) + " (" + str + ") for fragment " + this.f4074c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4074c + " for a container view with no id");
                }
            }
        }
        Fragment fragment4 = this.f4074c;
        fragment4.f3801T = viewGroup;
        fragment4.mo4343g1(m4353k1, viewGroup, fragment4.f3822o);
        View view = this.f4074c.f3802U;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4074c;
            fragment5.f3802U.setTag(C0967b.f5125a, fragment5);
            if (viewGroup != null) {
                m4693b();
            }
            Fragment fragment6 = this.f4074c;
            if (fragment6.f3794M) {
                fragment6.f3802U.setVisibility(8);
            }
            if (C0690v.m3813T(this.f4074c.f3802U)) {
                C0690v.m3847n0(this.f4074c.f3802U);
            } else {
                View view2 = this.f4074c.f3802U;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f4074c.m4388x1();
            C0811l c0811l = this.f4072a;
            Fragment fragment7 = this.f4074c;
            c0811l.m4674m(fragment7, fragment7.f3802U, fragment7.f3822o, false);
            int visibility = this.f4074c.f3802U.getVisibility();
            float alpha = this.f4074c.f3802U.getAlpha();
            if (FragmentManager.f3865P) {
                this.f4074c.m4306P1(alpha);
                Fragment fragment8 = this.f4074c;
                if (fragment8.f3801T != null && visibility == 0) {
                    View findFocus = fragment8.f3802U.findFocus();
                    if (findFocus != null) {
                        this.f4074c.m4285I1(findFocus);
                        if (FragmentManager.m4403H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4074c);
                        }
                    }
                    this.f4074c.f3802U.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f4074c;
                if (visibility == 0 && fragment9.f3801T != null) {
                    z10 = true;
                }
                fragment9.f3807Z = z10;
            }
        }
        this.f4074c.f3821n = 2;
    }

    /* renamed from: g */
    public void m4698g() {
        Fragment m4727f;
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4074c);
        }
        Fragment fragment = this.f4074c;
        boolean z10 = true;
        boolean z11 = fragment.f3833z && !fragment.m4352k0();
        if (z11 || this.f4073b.m4736o().m4687o(this.f4074c)) {
            AbstractC0809j<?> abstractC0809j = this.f4074c.f3788G;
            if (abstractC0809j instanceof InterfaceC0859z) {
                z10 = this.f4073b.m4736o().m4684l();
            } else if (abstractC0809j.m4659g() instanceof Activity) {
                z10 = true ^ ((Activity) abstractC0809j.m4659g()).isChangingConfigurations();
            }
            if (z11 || z10) {
                this.f4073b.m4736o().m4679f(this.f4074c);
            }
            this.f4074c.m4346h1();
            this.f4072a.m4665d(this.f4074c, false);
            for (C0816q c0816q : this.f4073b.m4732k()) {
                if (c0816q != null) {
                    Fragment m4702k = c0816q.m4702k();
                    if (this.f4074c.f3826s.equals(m4702k.f3829v)) {
                        m4702k.f3828u = this.f4074c;
                        m4702k.f3829v = null;
                    }
                }
            }
            Fragment fragment2 = this.f4074c;
            String str = fragment2.f3829v;
            if (str != null) {
                fragment2.f3828u = this.f4073b.m4727f(str);
            }
            this.f4073b.m4738q(this);
            return;
        }
        String str2 = this.f4074c.f3829v;
        if (str2 != null && (m4727f = this.f4073b.m4727f(str2)) != null && m4727f.f3796O) {
            this.f4074c.f3828u = m4727f;
        }
        this.f4074c.f3821n = 0;
    }

    /* renamed from: h */
    public void m4699h() {
        View view;
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4074c);
        }
        Fragment fragment = this.f4074c;
        ViewGroup viewGroup = fragment.f3801T;
        if (viewGroup != null && (view = fragment.f3802U) != null) {
            viewGroup.removeView(view);
        }
        this.f4074c.m4348i1();
        this.f4072a.m4675n(this.f4074c, false);
        Fragment fragment2 = this.f4074c;
        fragment2.f3801T = null;
        fragment2.f3802U = null;
        fragment2.f3814g0 = null;
        fragment2.f3815h0.mo4867o(null);
        this.f4074c.f3783B = false;
    }

    /* renamed from: i */
    public void m4700i() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4074c);
        }
        this.f4074c.m4351j1();
        boolean z10 = false;
        this.f4072a.m4666e(this.f4074c, false);
        Fragment fragment = this.f4074c;
        fragment.f3821n = -1;
        fragment.f3788G = null;
        fragment.f3790I = null;
        fragment.f3787F = null;
        if (fragment.f3833z && !fragment.m4352k0()) {
            z10 = true;
        }
        if (z10 || this.f4073b.m4736o().m4687o(this.f4074c)) {
            if (FragmentManager.m4403H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4074c);
            }
            this.f4074c.m4339e0();
        }
    }

    /* renamed from: j */
    public void m4701j() {
        Fragment fragment = this.f4074c;
        if (fragment.f3782A && fragment.f3783B && !fragment.f3785D) {
            if (FragmentManager.m4403H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4074c);
            }
            Fragment fragment2 = this.f4074c;
            fragment2.mo4343g1(fragment2.m4353k1(fragment2.f3822o), null, this.f4074c.f3822o);
            View view = this.f4074c.f3802U;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4074c;
                fragment3.f3802U.setTag(C0967b.f5125a, fragment3);
                Fragment fragment4 = this.f4074c;
                if (fragment4.f3794M) {
                    fragment4.f3802U.setVisibility(8);
                }
                this.f4074c.m4388x1();
                C0811l c0811l = this.f4072a;
                Fragment fragment5 = this.f4074c;
                c0811l.m4674m(fragment5, fragment5.f3802U, fragment5.f3822o, false);
                this.f4074c.f3821n = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m4702k() {
        return this.f4074c;
    }

    /* renamed from: m */
    public void m4703m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4075d) {
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m4702k());
                return;
            }
            return;
        }
        try {
            this.f4075d = true;
            while (true) {
                int m4695d = m4695d();
                Fragment fragment = this.f4074c;
                int i10 = fragment.f3821n;
                if (m4695d == i10) {
                    if (FragmentManager.f3865P && fragment.f3808a0) {
                        if (fragment.f3802U != null && (viewGroup = fragment.f3801T) != null) {
                            AbstractC0825z m4824n = AbstractC0825z.m4824n(viewGroup, fragment.m4289K());
                            if (this.f4074c.f3794M) {
                                m4824n.m4828c(this);
                            } else {
                                m4824n.m4830e(this);
                            }
                        }
                        Fragment fragment2 = this.f4074c;
                        FragmentManager fragmentManager = fragment2.f3787F;
                        if (fragmentManager != null) {
                            fragmentManager.m4448F0(fragment2);
                        }
                        Fragment fragment3 = this.f4074c;
                        fragment3.f3808a0 = false;
                        fragment3.mo4287J0(fragment3.f3794M);
                    }
                    return;
                }
                if (m4695d > i10) {
                    switch (i10 + 1) {
                        case 0:
                            m4694c();
                            break;
                        case 1:
                            m4696e();
                            break;
                        case 2:
                            m4701j();
                            m4697f();
                            break;
                        case 3:
                            m4692a();
                            break;
                        case 4:
                            if (fragment.f3802U != null && (viewGroup2 = fragment.f3801T) != null) {
                                AbstractC0825z.m4824n(viewGroup2, fragment.m4289K()).m4827b(AbstractC0825z.e.c.m4850c(this.f4074c.f3802U.getVisibility()), this);
                            }
                            this.f4074c.f3821n = 4;
                            break;
                        case 5:
                            m4711v();
                            break;
                        case 6:
                            fragment.f3821n = 6;
                            break;
                        case 7:
                            m4706p();
                            break;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            m4700i();
                            break;
                        case 0:
                            m4698g();
                            break;
                        case 1:
                            m4699h();
                            this.f4074c.f3821n = 1;
                            break;
                        case 2:
                            fragment.f3783B = false;
                            fragment.f3821n = 2;
                            break;
                        case 3:
                            if (FragmentManager.m4403H0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4074c);
                            }
                            Fragment fragment4 = this.f4074c;
                            if (fragment4.f3802U != null && fragment4.f3823p == null) {
                                m4709t();
                            }
                            Fragment fragment5 = this.f4074c;
                            if (fragment5.f3802U != null && (viewGroup3 = fragment5.f3801T) != null) {
                                AbstractC0825z.m4824n(viewGroup3, fragment5.m4289K()).m4829d(this);
                            }
                            this.f4074c.f3821n = 3;
                            break;
                        case 4:
                            m4712w();
                            break;
                        case 5:
                            fragment.f3821n = 5;
                            break;
                        case 6:
                            m4704n();
                            break;
                    }
                }
            }
        } finally {
            this.f4075d = false;
        }
    }

    /* renamed from: n */
    public void m4704n() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4074c);
        }
        this.f4074c.m4365p1();
        this.f4072a.m4667f(this.f4074c, false);
    }

    /* renamed from: o */
    public void m4705o(ClassLoader classLoader) {
        Bundle bundle = this.f4074c.f3822o;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4074c;
        fragment.f3823p = fragment.f3822o.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4074c;
        fragment2.f3824q = fragment2.f3822o.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4074c;
        fragment3.f3829v = fragment3.f3822o.getString("android:target_state");
        Fragment fragment4 = this.f4074c;
        if (fragment4.f3829v != null) {
            fragment4.f3830w = fragment4.f3822o.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4074c;
        Boolean bool = fragment5.f3825r;
        if (bool != null) {
            fragment5.f3804W = bool.booleanValue();
            this.f4074c.f3825r = null;
        } else {
            fragment5.f3804W = fragment5.f3822o.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4074c;
        if (fragment6.f3804W) {
            return;
        }
        fragment6.f3803V = true;
    }

    /* renamed from: p */
    public void m4706p() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4074c);
        }
        View m4271D = this.f4074c.m4271D();
        if (m4271D != null && m4690l(m4271D)) {
            boolean requestFocus = m4271D.requestFocus();
            if (FragmentManager.m4403H0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(m4271D);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4074c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4074c.f3802U.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4074c.m4285I1(null);
        this.f4074c.m4377t1();
        this.f4072a.m4670i(this.f4074c, false);
        Fragment fragment = this.f4074c;
        fragment.f3822o = null;
        fragment.f3823p = null;
        fragment.f3824q = null;
    }

    /* renamed from: r */
    public Fragment.SavedState m4707r() {
        Bundle m4691q;
        if (this.f4074c.f3821n <= -1 || (m4691q = m4691q()) == null) {
            return null;
        }
        return new Fragment.SavedState(m4691q);
    }

    /* renamed from: s */
    public FragmentState m4708s() {
        FragmentState fragmentState = new FragmentState(this.f4074c);
        Fragment fragment = this.f4074c;
        if (fragment.f3821n > -1 && fragmentState.f3953z == null) {
            Bundle m4691q = m4691q();
            fragmentState.f3953z = m4691q;
            if (this.f4074c.f3829v != null) {
                if (m4691q == null) {
                    fragmentState.f3953z = new Bundle();
                }
                fragmentState.f3953z.putString("android:target_state", this.f4074c.f3829v);
                int i10 = this.f4074c.f3830w;
                if (i10 != 0) {
                    fragmentState.f3953z.putInt("android:target_req_state", i10);
                }
            }
        } else {
            fragmentState.f3953z = fragment.f3822o;
        }
        return fragmentState;
    }

    /* renamed from: t */
    public void m4709t() {
        if (this.f4074c.f3802U == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4074c.f3802U.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4074c.f3823p = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4074c.f3814g0.m4818e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4074c.f3824q = bundle;
    }

    /* renamed from: u */
    public void m4710u(int i10) {
        this.f4076e = i10;
    }

    /* renamed from: v */
    public void m4711v() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4074c);
        }
        this.f4074c.m4383v1();
        this.f4072a.m4672k(this.f4074c, false);
    }

    /* renamed from: w */
    public void m4712w() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4074c);
        }
        this.f4074c.m4385w1();
        this.f4072a.m4673l(this.f4074c, false);
    }

    public C0816q(C0811l c0811l, C0818s c0818s, ClassLoader classLoader, C0808i c0808i, FragmentState fragmentState) {
        this.f4072a = c0811l;
        this.f4073b = c0818s;
        Fragment mo4533a = c0808i.mo4533a(classLoader, fragmentState.f3941n);
        this.f4074c = mo4533a;
        Bundle bundle = fragmentState.f3950w;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo4533a.m4282H1(fragmentState.f3950w);
        mo4533a.f3826s = fragmentState.f3942o;
        mo4533a.f3782A = fragmentState.f3943p;
        mo4533a.f3784C = true;
        mo4533a.f3791J = fragmentState.f3944q;
        mo4533a.f3792K = fragmentState.f3945r;
        mo4533a.f3793L = fragmentState.f3946s;
        mo4533a.f3796O = fragmentState.f3947t;
        mo4533a.f3833z = fragmentState.f3948u;
        mo4533a.f3795N = fragmentState.f3949v;
        mo4533a.f3794M = fragmentState.f3951x;
        mo4533a.f3812e0 = AbstractC0839f.c.values()[fragmentState.f3952y];
        Bundle bundle2 = fragmentState.f3953z;
        if (bundle2 != null) {
            mo4533a.f3822o = bundle2;
        } else {
            mo4533a.f3822o = new Bundle();
        }
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo4533a);
        }
    }

    public C0816q(C0811l c0811l, C0818s c0818s, Fragment fragment, FragmentState fragmentState) {
        this.f4072a = c0811l;
        this.f4073b = c0818s;
        this.f4074c = fragment;
        fragment.f3823p = null;
        fragment.f3824q = null;
        fragment.f3786E = 0;
        fragment.f3783B = false;
        fragment.f3832y = false;
        Fragment fragment2 = fragment.f3828u;
        fragment.f3829v = fragment2 != null ? fragment2.f3826s : null;
        fragment.f3828u = null;
        Bundle bundle = fragmentState.f3953z;
        if (bundle != null) {
            fragment.f3822o = bundle;
        } else {
            fragment.f3822o = new Bundle();
        }
    }
}
