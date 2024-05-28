package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0585r;
import androidx.core.view.C0674g;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0833a0;
import androidx.lifecycle.C0835b0;
import androidx.lifecycle.C0846m;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.C0857x;
import androidx.lifecycle.C0858y;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0859z;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC0860a;
import androidx.savedstate.C0927b;
import androidx.savedstate.C0929d;
import androidx.savedstate.InterfaceC0928c;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0845l, InterfaceC0859z, InterfaceC0928c {

    /* renamed from: n0 */
    static final Object f3781n0 = new Object();

    /* renamed from: A */
    boolean f3782A;

    /* renamed from: B */
    boolean f3783B;

    /* renamed from: C */
    boolean f3784C;

    /* renamed from: D */
    boolean f3785D;

    /* renamed from: E */
    int f3786E;

    /* renamed from: F */
    FragmentManager f3787F;

    /* renamed from: G */
    AbstractC0809j<?> f3788G;

    /* renamed from: I */
    Fragment f3790I;

    /* renamed from: J */
    int f3791J;

    /* renamed from: K */
    int f3792K;

    /* renamed from: L */
    String f3793L;

    /* renamed from: M */
    boolean f3794M;

    /* renamed from: N */
    boolean f3795N;

    /* renamed from: O */
    boolean f3796O;

    /* renamed from: P */
    boolean f3797P;

    /* renamed from: Q */
    boolean f3798Q;

    /* renamed from: S */
    private boolean f3800S;

    /* renamed from: T */
    ViewGroup f3801T;

    /* renamed from: U */
    View f3802U;

    /* renamed from: V */
    boolean f3803V;

    /* renamed from: X */
    C0775e f3805X;

    /* renamed from: Z */
    boolean f3807Z;

    /* renamed from: a0 */
    boolean f3808a0;

    /* renamed from: b0 */
    float f3809b0;

    /* renamed from: c0 */
    LayoutInflater f3810c0;

    /* renamed from: d0 */
    boolean f3811d0;

    /* renamed from: f0 */
    C0846m f3813f0;

    /* renamed from: g0 */
    C0823x f3814g0;

    /* renamed from: i0 */
    C0857x.a f3816i0;

    /* renamed from: j0 */
    C0927b f3817j0;

    /* renamed from: k0 */
    private int f3818k0;

    /* renamed from: o */
    Bundle f3822o;

    /* renamed from: p */
    SparseArray<Parcelable> f3823p;

    /* renamed from: q */
    Bundle f3824q;

    /* renamed from: r */
    Boolean f3825r;

    /* renamed from: t */
    Bundle f3827t;

    /* renamed from: u */
    Fragment f3828u;

    /* renamed from: w */
    int f3830w;

    /* renamed from: y */
    boolean f3832y;

    /* renamed from: z */
    boolean f3833z;

    /* renamed from: n */
    int f3821n = -1;

    /* renamed from: s */
    String f3826s = UUID.randomUUID().toString();

    /* renamed from: v */
    String f3829v = null;

    /* renamed from: x */
    private Boolean f3831x = null;

    /* renamed from: H */
    FragmentManager f3789H = new C0812m();

    /* renamed from: R */
    boolean f3799R = true;

    /* renamed from: W */
    boolean f3804W = true;

    /* renamed from: Y */
    Runnable f3806Y = new RunnableC0771a();

    /* renamed from: e0 */
    AbstractC0839f.c f3812e0 = AbstractC0839f.c.RESUMED;

    /* renamed from: h0 */
    C0851r<InterfaceC0845l> f3815h0 = new C0851r<>();

    /* renamed from: l0 */
    private final AtomicInteger f3819l0 = new AtomicInteger();

    /* renamed from: m0 */
    private final ArrayList<AbstractC0777g> f3820m0 = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$5 */
    /* loaded from: classes.dex */
    public class C07695 implements InterfaceC0843j {
        C07695() {
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            View view;
            if (bVar != AbstractC0839f.b.ON_STOP || (view = Fragment.this.f3802U) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    public class RunnableC0771a implements Runnable {
        RunnableC0771a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m4325W1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class RunnableC0772b implements Runnable {
        RunnableC0772b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m4344h(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public class RunnableC0773c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ AbstractC0825z f3838n;

        RunnableC0773c(AbstractC0825z abstractC0825z) {
            this.f3838n = abstractC0825z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3838n.m4831g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public class C0774d extends AbstractC0805f {
        C0774d() {
        }

        @Override // androidx.fragment.app.AbstractC0805f
        /* renamed from: c */
        public View mo4397c(int i10) {
            View view = Fragment.this.f3802U;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0805f
        /* renamed from: d */
        public boolean mo4398d() {
            return Fragment.this.f3802U != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public static class C0775e {

        /* renamed from: a */
        View f3841a;

        /* renamed from: b */
        Animator f3842b;

        /* renamed from: c */
        boolean f3843c;

        /* renamed from: d */
        int f3844d;

        /* renamed from: e */
        int f3845e;

        /* renamed from: f */
        int f3846f;

        /* renamed from: g */
        int f3847g;

        /* renamed from: h */
        int f3848h;

        /* renamed from: i */
        ArrayList<String> f3849i;

        /* renamed from: j */
        ArrayList<String> f3850j;

        /* renamed from: k */
        Object f3851k = null;

        /* renamed from: l */
        Object f3852l;

        /* renamed from: m */
        Object f3853m;

        /* renamed from: n */
        Object f3854n;

        /* renamed from: o */
        Object f3855o;

        /* renamed from: p */
        Object f3856p;

        /* renamed from: q */
        Boolean f3857q;

        /* renamed from: r */
        Boolean f3858r;

        /* renamed from: s */
        float f3859s;

        /* renamed from: t */
        View f3860t;

        /* renamed from: u */
        boolean f3861u;

        /* renamed from: v */
        InterfaceC0778h f3862v;

        /* renamed from: w */
        boolean f3863w;

        C0775e() {
            Object obj = Fragment.f3781n0;
            this.f3852l = obj;
            this.f3853m = null;
            this.f3854n = obj;
            this.f3855o = null;
            this.f3856p = obj;
            this.f3859s = 1.0f;
            this.f3860t = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public static class C0776f extends RuntimeException {
        public C0776f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0777g {
        private AbstractC0777g() {
        }

        /* renamed from: a */
        abstract void m4399a();
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes.dex */
    public interface InterfaceC0778h {
        /* renamed from: a */
        void mo4400a();

        /* renamed from: b */
        void mo4401b();
    }

    public Fragment() {
        m4260d0();
    }

    /* renamed from: C1 */
    private void m4258C1() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3802U != null) {
            m4272D1(this.f3822o);
        }
        this.f3822o = null;
    }

    /* renamed from: H */
    private int m4259H() {
        AbstractC0839f.c cVar = this.f3812e0;
        if (cVar != AbstractC0839f.c.INITIALIZED && this.f3790I != null) {
            return Math.min(cVar.ordinal(), this.f3790I.m4259H());
        }
        return cVar.ordinal();
    }

    /* renamed from: d0 */
    private void m4260d0() {
        this.f3813f0 = new C0846m(this);
        this.f3817j0 = C0927b.m5897a(this);
        this.f3816i0 = null;
    }

    @Deprecated
    /* renamed from: f0 */
    public static Fragment m4261f0(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C0808i.m4657d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.m4282H1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new C0776f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new C0776f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C0776f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C0776f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    /* renamed from: n */
    private C0775e m4262n() {
        if (this.f3805X == null) {
            this.f3805X = new C0775e();
        }
        return this.f3805X;
    }

    /* renamed from: A */
    public int m4263A() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return 0;
        }
        return c0775e.f3845e;
    }

    /* renamed from: A0 */
    public Animation m4264A0(int i10, boolean z10, int i11) {
        return null;
    }

    /* renamed from: A1 */
    public final View m4265A1() {
        View m4334b0 = m4334b0();
        if (m4334b0 != null) {
            return m4334b0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: B */
    public Object m4266B() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        return c0775e.f3853m;
    }

    /* renamed from: B0 */
    public Animator m4267B0(int i10, boolean z10, int i11) {
        return null;
    }

    /* renamed from: B1 */
    public void m4268B1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f3789H.m4496i1(parcelable);
        this.f3789H.m4443D();
    }

    /* renamed from: C */
    public AbstractC0585r m4269C() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        Objects.requireNonNull(c0775e);
        return null;
    }

    /* renamed from: C0 */
    public void m4270C0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: D */
    public View m4271D() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        return c0775e.f3860t;
    }

    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f3818k0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* renamed from: D1 */
    final void m4272D1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3823p;
        if (sparseArray != null) {
            this.f3802U.restoreHierarchyState(sparseArray);
            this.f3823p = null;
        }
        if (this.f3802U != null) {
            this.f3814g0.m4817d(this.f3824q);
            this.f3824q = null;
        }
        this.f3800S = false;
        mo4331Z0(bundle);
        if (this.f3800S) {
            if (this.f3802U != null) {
                this.f3814g0.m4814a(AbstractC0839f.b.ON_CREATE);
            }
        } else {
            throw new C0801b0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @Deprecated
    /* renamed from: E */
    public final FragmentManager m4273E() {
        return this.f3787F;
    }

    /* renamed from: E0 */
    public void mo4274E0() {
        this.f3800S = true;
    }

    /* renamed from: E1 */
    public void m4275E1(View view) {
        m4262n().f3841a = view;
    }

    /* renamed from: F */
    public final Object m4276F() {
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        if (abstractC0809j == null) {
            return null;
        }
        return abstractC0809j.mo4620j();
    }

    /* renamed from: F0 */
    public void m4277F0() {
    }

    /* renamed from: F1 */
    public void m4278F1(int i10, int i11, int i12, int i13) {
        if (this.f3805X == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m4262n().f3844d = i10;
        m4262n().f3845e = i11;
        m4262n().f3846f = i12;
        m4262n().f3847g = i13;
    }

    @Deprecated
    /* renamed from: G */
    public LayoutInflater m4279G(Bundle bundle) {
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        if (abstractC0809j != null) {
            LayoutInflater mo4621m = abstractC0809j.mo4621m();
            C0674g.m3654a(mo4621m, this.f3789H.m4521w0());
            return mo4621m;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: G0 */
    public void mo4280G0() {
        this.f3800S = true;
    }

    /* renamed from: G1 */
    public void m4281G1(Animator animator) {
        m4262n().f3842b = animator;
    }

    /* renamed from: H0 */
    public void mo267H0() {
        this.f3800S = true;
    }

    /* renamed from: H1 */
    public void m4282H1(Bundle bundle) {
        if (this.f3787F != null && m4367q0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3827t = bundle;
    }

    /* renamed from: I */
    public int m4283I() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return 0;
        }
        return c0775e.f3848h;
    }

    /* renamed from: I0 */
    public LayoutInflater mo4284I0(Bundle bundle) {
        return m4279G(bundle);
    }

    /* renamed from: I1 */
    public void m4285I1(View view) {
        m4262n().f3860t = view;
    }

    /* renamed from: J */
    public final Fragment m4286J() {
        return this.f3790I;
    }

    /* renamed from: J0 */
    public void mo4287J0(boolean z10) {
    }

    /* renamed from: J1 */
    public void m4288J1(boolean z10) {
        m4262n().f3863w = z10;
    }

    /* renamed from: K */
    public final FragmentManager m4289K() {
        FragmentManager fragmentManager = this.f3787F;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    /* renamed from: K0 */
    public void m4290K0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f3800S = true;
    }

    /* renamed from: K1 */
    public void m4291K1(SavedState savedState) {
        Bundle bundle;
        if (this.f3787F == null) {
            if (savedState == null || (bundle = savedState.f3835n) == null) {
                bundle = null;
            }
            this.f3822o = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    /* renamed from: L */
    public boolean m4292L() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return false;
        }
        return c0775e.f3843c;
    }

    /* renamed from: L0 */
    public void m4293L0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3800S = true;
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        Activity m4658e = abstractC0809j == null ? null : abstractC0809j.m4658e();
        if (m4658e != null) {
            this.f3800S = false;
            m4290K0(m4658e, attributeSet, bundle);
        }
    }

    /* renamed from: L1 */
    public void m4294L1(boolean z10) {
        if (this.f3799R != z10) {
            this.f3799R = z10;
            if (this.f3798Q && m4342g0() && !m4345h0()) {
                this.f3788G.mo4623p();
            }
        }
    }

    /* renamed from: M */
    public int m4295M() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return 0;
        }
        return c0775e.f3846f;
    }

    /* renamed from: M0 */
    public void m4296M0(boolean z10) {
    }

    /* renamed from: M1 */
    public void m4297M1(int i10) {
        if (this.f3805X == null && i10 == 0) {
            return;
        }
        m4262n();
        this.f3805X.f3848h = i10;
    }

    /* renamed from: N */
    public int m4298N() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return 0;
        }
        return c0775e.f3847g;
    }

    /* renamed from: N0 */
    public boolean m4299N0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: N1 */
    public void m4300N1(InterfaceC0778h interfaceC0778h) {
        m4262n();
        C0775e c0775e = this.f3805X;
        InterfaceC0778h interfaceC0778h2 = c0775e.f3862v;
        if (interfaceC0778h == interfaceC0778h2) {
            return;
        }
        if (interfaceC0778h != null && interfaceC0778h2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0775e.f3861u) {
            c0775e.f3862v = interfaceC0778h;
        }
        if (interfaceC0778h != null) {
            interfaceC0778h.mo4401b();
        }
    }

    /* renamed from: O */
    public float m4301O() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return 1.0f;
        }
        return c0775e.f3859s;
    }

    /* renamed from: O0 */
    public void m4302O0(Menu menu) {
    }

    /* renamed from: O1 */
    public void m4303O1(boolean z10) {
        if (this.f3805X == null) {
            return;
        }
        m4262n().f3843c = z10;
    }

    /* renamed from: P */
    public Object m4304P() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        Object obj = c0775e.f3854n;
        return obj == f3781n0 ? m4266B() : obj;
    }

    /* renamed from: P0 */
    public void mo4305P0() {
        this.f3800S = true;
    }

    /* renamed from: P1 */
    public void m4306P1(float f10) {
        m4262n().f3859s = f10;
    }

    /* renamed from: Q */
    public final Resources m4307Q() {
        return m4393z1().getResources();
    }

    /* renamed from: Q0 */
    public void m4308Q0(boolean z10) {
    }

    @Deprecated
    /* renamed from: Q1 */
    public void m4309Q1(boolean z10) {
        this.f3796O = z10;
        FragmentManager fragmentManager = this.f3787F;
        if (fragmentManager == null) {
            this.f3797P = true;
        } else if (z10) {
            fragmentManager.m4494i(this);
        } else {
            fragmentManager.m4491g1(this);
        }
    }

    @Deprecated
    /* renamed from: R */
    public final boolean m4310R() {
        return this.f3796O;
    }

    /* renamed from: R0 */
    public void m4311R0(Menu menu) {
    }

    /* renamed from: R1 */
    public void m4312R1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m4262n();
        C0775e c0775e = this.f3805X;
        c0775e.f3849i = arrayList;
        c0775e.f3850j = arrayList2;
    }

    /* renamed from: S */
    public Object m4313S() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        Object obj = c0775e.f3852l;
        return obj == f3781n0 ? m4389y() : obj;
    }

    /* renamed from: S0 */
    public void m4314S0(boolean z10) {
    }

    @Deprecated
    /* renamed from: S1 */
    public void m4315S1(boolean z10) {
        if (!this.f3804W && z10 && this.f3821n < 5 && this.f3787F != null && m4342g0() && this.f3811d0) {
            FragmentManager fragmentManager = this.f3787F;
            fragmentManager.m4475V0(fragmentManager.m4520w(this));
        }
        this.f3804W = z10;
        this.f3803V = this.f3821n < 5 && !z10;
        if (this.f3822o != null) {
            this.f3825r = Boolean.valueOf(z10);
        }
    }

    /* renamed from: T */
    public Object m4316T() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        return c0775e.f3855o;
    }

    @Deprecated
    /* renamed from: T0 */
    public void m4317T0(int i10, String[] strArr, int[] iArr) {
    }

    /* renamed from: T1 */
    public void m4318T1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        m4320U1(intent, null);
    }

    /* renamed from: U0 */
    public void mo4319U0() {
        this.f3800S = true;
    }

    /* renamed from: U1 */
    public void m4320U1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        if (abstractC0809j != null) {
            abstractC0809j.m4661o(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: V */
    public Object m4321V() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        Object obj = c0775e.f3856p;
        return obj == f3781n0 ? m4316T() : obj;
    }

    /* renamed from: V0 */
    public void mo4322V0(Bundle bundle) {
    }

    @Deprecated
    /* renamed from: V1 */
    public void m4323V1(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f3788G != null) {
            m4289K().m4461N0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: W */
    public ArrayList<String> m4324W() {
        ArrayList<String> arrayList;
        C0775e c0775e = this.f3805X;
        return (c0775e == null || (arrayList = c0775e.f3849i) == null) ? new ArrayList<>() : arrayList;
    }

    /* renamed from: W0 */
    public void mo268W0() {
        this.f3800S = true;
    }

    /* renamed from: W1 */
    public void m4325W1() {
        if (this.f3805X == null || !m4262n().f3861u) {
            return;
        }
        if (this.f3788G == null) {
            m4262n().f3861u = false;
        } else if (Looper.myLooper() != this.f3788G.m4660h().getLooper()) {
            this.f3788G.m4660h().postAtFrontOfQueue(new RunnableC0772b());
        } else {
            m4344h(true);
        }
    }

    /* renamed from: X */
    public ArrayList<String> m4326X() {
        ArrayList<String> arrayList;
        C0775e c0775e = this.f3805X;
        return (c0775e == null || (arrayList = c0775e.f3850j) == null) ? new ArrayList<>() : arrayList;
    }

    /* renamed from: X0 */
    public void mo4327X0() {
        this.f3800S = true;
    }

    /* renamed from: Y */
    public final String m4328Y(int i10) {
        return m4307Q().getString(i10);
    }

    /* renamed from: Y0 */
    public void m4329Y0(View view, Bundle bundle) {
    }

    /* renamed from: Z */
    public final String m4330Z(int i10, Object... objArr) {
        return m4307Q().getString(i10, objArr);
    }

    /* renamed from: Z0 */
    public void mo4331Z0(Bundle bundle) {
        this.f3800S = true;
    }

    @Deprecated
    /* renamed from: a0 */
    public final Fragment m4332a0() {
        String str;
        Fragment fragment = this.f3828u;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f3787F;
        if (fragmentManager == null || (str = this.f3829v) == null) {
            return null;
        }
        return fragmentManager.m4493h0(str);
    }

    /* renamed from: a1 */
    public void m4333a1(Bundle bundle) {
        this.f3789H.m4471T0();
        this.f3821n = 3;
        this.f3800S = false;
        mo4376t0(bundle);
        if (this.f3800S) {
            m4258C1();
            this.f3789H.m4525z();
        } else {
            throw new C0801b0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    /* renamed from: b0 */
    public View m4334b0() {
        return this.f3802U;
    }

    /* renamed from: b1 */
    public void m4335b1() {
        Iterator<AbstractC0777g> it = this.f3820m0.iterator();
        while (it.hasNext()) {
            it.next().m4399a();
        }
        this.f3820m0.clear();
        this.f3789H.m4499k(this.f3788G, mo4347i(), this);
        this.f3821n = 0;
        this.f3800S = false;
        mo269w0(this.f3788G.m4659g());
        if (this.f3800S) {
            this.f3787F.m4453J(this);
            this.f3789H.m4438A();
        } else {
            throw new C0801b0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: c0 */
    public LiveData<InterfaceC0845l> m4336c0() {
        return this.f3815h0;
    }

    /* renamed from: c1 */
    public void m4337c1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3789H.m4440B(configuration);
    }

    /* renamed from: d1 */
    public boolean m4338d1(MenuItem menuItem) {
        if (this.f3794M) {
            return false;
        }
        if (m4390y0(menuItem)) {
            return true;
        }
        return this.f3789H.m4441C(menuItem);
    }

    /* renamed from: e0 */
    public void m4339e0() {
        m4260d0();
        this.f3826s = UUID.randomUUID().toString();
        this.f3832y = false;
        this.f3833z = false;
        this.f3782A = false;
        this.f3783B = false;
        this.f3784C = false;
        this.f3786E = 0;
        this.f3787F = null;
        this.f3789H = new C0812m();
        this.f3788G = null;
        this.f3791J = 0;
        this.f3792K = 0;
        this.f3793L = null;
        this.f3794M = false;
        this.f3795N = false;
    }

    /* renamed from: e1 */
    public void m4340e1(Bundle bundle) {
        this.f3789H.m4471T0();
        this.f3821n = 1;
        this.f3800S = false;
        this.f3813f0.mo4889a(new InterfaceC0843j() { // from class: androidx.fragment.app.Fragment.5
            C07695() {
            }

            @Override // androidx.lifecycle.InterfaceC0843j
            /* renamed from: e */
            public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
                View view;
                if (bVar != AbstractC0839f.b.ON_STOP || (view = Fragment.this.f3802U) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f3817j0.m5899c(bundle);
        mo270z0(bundle);
        this.f3811d0 = true;
        if (this.f3800S) {
            this.f3813f0.m4909h(AbstractC0839f.b.ON_CREATE);
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.InterfaceC0845l
    /* renamed from: f */
    public AbstractC0839f mo583f() {
        return this.f3813f0;
    }

    /* renamed from: f1 */
    public boolean m4341f1(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f3794M) {
            return false;
        }
        if (this.f3798Q && this.f3799R) {
            z10 = true;
            m4270C0(menu, menuInflater);
        }
        return z10 | this.f3789H.m4445E(menu, menuInflater);
    }

    /* renamed from: g0 */
    public final boolean m4342g0() {
        return this.f3788G != null && this.f3832y;
    }

    /* renamed from: g1 */
    public void mo4343g1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3789H.m4471T0();
        this.f3785D = true;
        this.f3814g0 = new C0823x(this, mo584i0());
        View mo264D0 = mo264D0(layoutInflater, viewGroup, bundle);
        this.f3802U = mo264D0;
        if (mo264D0 != null) {
            this.f3814g0.m4815b();
            C0833a0.m4885a(this.f3802U, this.f3814g0);
            C0835b0.m4886a(this.f3802U, this.f3814g0);
            C0929d.m5901a(this.f3802U, this.f3814g0);
            this.f3815h0.mo4867o(this.f3814g0);
            return;
        }
        if (!this.f3814g0.m4816c()) {
            this.f3814g0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* renamed from: h */
    void m4344h(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0775e c0775e = this.f3805X;
        InterfaceC0778h interfaceC0778h = null;
        if (c0775e != null) {
            c0775e.f3861u = false;
            InterfaceC0778h interfaceC0778h2 = c0775e.f3862v;
            c0775e.f3862v = null;
            interfaceC0778h = interfaceC0778h2;
        }
        if (interfaceC0778h != null) {
            interfaceC0778h.mo4400a();
            return;
        }
        if (!FragmentManager.f3865P || this.f3802U == null || (viewGroup = this.f3801T) == null || (fragmentManager = this.f3787F) == null) {
            return;
        }
        AbstractC0825z m4824n = AbstractC0825z.m4824n(viewGroup, fragmentManager);
        m4824n.m4836p();
        if (z10) {
            this.f3788G.m4660h().post(new RunnableC0773c(m4824n));
        } else {
            m4824n.m4831g();
        }
    }

    /* renamed from: h0 */
    public final boolean m4345h0() {
        return this.f3794M;
    }

    /* renamed from: h1 */
    public void m4346h1() {
        this.f3789H.m4447F();
        this.f3813f0.m4909h(AbstractC0839f.b.ON_DESTROY);
        this.f3821n = 0;
        this.f3800S = false;
        this.f3811d0 = false;
        mo4274E0();
        if (this.f3800S) {
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public AbstractC0805f mo4347i() {
        return new C0774d();
    }

    @Override // androidx.lifecycle.InterfaceC0859z
    /* renamed from: i0 */
    public C0858y mo584i0() {
        if (this.f3787F != null) {
            if (m4259H() != AbstractC0839f.c.INITIALIZED.ordinal()) {
                return this.f3787F.m4442C0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: i1 */
    public void m4348i1() {
        this.f3789H.m4449G();
        if (this.f3802U != null && this.f3814g0.mo583f().mo4890b().m4895b(AbstractC0839f.c.CREATED)) {
            this.f3814g0.m4814a(AbstractC0839f.b.ON_DESTROY);
        }
        this.f3821n = 1;
        this.f3800S = false;
        mo4280G0();
        if (this.f3800S) {
            AbstractC0860a.m4955b(this).mo4958d();
            this.f3785D = false;
        } else {
            throw new C0801b0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* renamed from: j */
    public void mo4349j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3791J));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3792K));
        printWriter.print(" mTag=");
        printWriter.println(this.f3793L);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3821n);
        printWriter.print(" mWho=");
        printWriter.print(this.f3826s);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3786E);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3832y);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3833z);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3782A);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3783B);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3794M);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3795N);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3799R);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3798Q);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3796O);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3804W);
        if (this.f3787F != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3787F);
        }
        if (this.f3788G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3788G);
        }
        if (this.f3790I != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3790I);
        }
        if (this.f3827t != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3827t);
        }
        if (this.f3822o != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3822o);
        }
        if (this.f3823p != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3823p);
        }
        if (this.f3824q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3824q);
        }
        Fragment m4332a0 = m4332a0();
        if (m4332a0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m4332a0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3830w);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m4292L());
        if (m4386x() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m4386x());
        }
        if (m4263A() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m4263A());
        }
        if (m4295M() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m4295M());
        }
        if (m4298N() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m4298N());
        }
        if (this.f3801T != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3801T);
        }
        if (this.f3802U != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3802U);
        }
        if (m4372s() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m4372s());
        }
        if (m4384w() != null) {
            AbstractC0860a.m4955b(this).mo4956a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3789H + ":");
        this.f3789H.m4477X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: j0 */
    public boolean m4350j0() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return false;
        }
        return c0775e.f3863w;
    }

    /* renamed from: j1 */
    public void m4351j1() {
        this.f3821n = -1;
        this.f3800S = false;
        mo267H0();
        this.f3810c0 = null;
        if (this.f3800S) {
            if (this.f3789H.m4450G0()) {
                return;
            }
            this.f3789H.m4447F();
            this.f3789H = new C0812m();
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* renamed from: k0 */
    public final boolean m4352k0() {
        return this.f3786E > 0;
    }

    /* renamed from: k1 */
    public LayoutInflater m4353k1(Bundle bundle) {
        LayoutInflater mo4284I0 = mo4284I0(bundle);
        this.f3810c0 = mo4284I0;
        return mo4284I0;
    }

    @Override // androidx.savedstate.InterfaceC0928c
    /* renamed from: l */
    public final SavedStateRegistry mo586l() {
        return this.f3817j0.m5898b();
    }

    /* renamed from: l0 */
    public final boolean m4354l0() {
        FragmentManager fragmentManager;
        return this.f3799R && ((fragmentManager = this.f3787F) == null || fragmentManager.m4454J0(this.f3790I));
    }

    /* renamed from: l1 */
    public void m4355l1() {
        onLowMemory();
        this.f3789H.m4451H();
    }

    /* renamed from: m0 */
    public boolean m4356m0() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return false;
        }
        return c0775e.f3861u;
    }

    /* renamed from: m1 */
    public void m4357m1(boolean z10) {
        m4296M0(z10);
        this.f3789H.m4452I(z10);
    }

    /* renamed from: n0 */
    public final boolean m4358n0() {
        return this.f3833z;
    }

    /* renamed from: n1 */
    public boolean m4359n1(MenuItem menuItem) {
        if (this.f3794M) {
            return false;
        }
        if (this.f3798Q && this.f3799R && m4299N0(menuItem)) {
            return true;
        }
        return this.f3789H.m4455K(menuItem);
    }

    /* renamed from: o */
    public Fragment m4360o(String str) {
        return str.equals(this.f3826s) ? this : this.f3789H.m4500k0(str);
    }

    /* renamed from: o0 */
    public final boolean m4361o0() {
        Fragment m4286J = m4286J();
        return m4286J != null && (m4286J.m4358n0() || m4286J.m4361o0());
    }

    /* renamed from: o1 */
    public void m4362o1(Menu menu) {
        if (this.f3794M) {
            return;
        }
        if (this.f3798Q && this.f3799R) {
            m4302O0(menu);
        }
        this.f3789H.m4457L(menu);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3800S = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4391y1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3800S = true;
    }

    /* renamed from: p */
    public final ActivityC0803d m4363p() {
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        if (abstractC0809j == null) {
            return null;
        }
        return (ActivityC0803d) abstractC0809j.m4658e();
    }

    /* renamed from: p0 */
    public final boolean m4364p0() {
        return this.f3821n >= 7;
    }

    /* renamed from: p1 */
    public void m4365p1() {
        this.f3789H.m4460N();
        if (this.f3802U != null) {
            this.f3814g0.m4814a(AbstractC0839f.b.ON_PAUSE);
        }
        this.f3813f0.m4909h(AbstractC0839f.b.ON_PAUSE);
        this.f3821n = 6;
        this.f3800S = false;
        mo4305P0();
        if (this.f3800S) {
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onPause()");
    }

    /* renamed from: q */
    public boolean m4366q() {
        Boolean bool;
        C0775e c0775e = this.f3805X;
        if (c0775e == null || (bool = c0775e.f3858r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: q0 */
    public final boolean m4367q0() {
        FragmentManager fragmentManager = this.f3787F;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m4459M0();
    }

    /* renamed from: q1 */
    public void m4368q1(boolean z10) {
        m4308Q0(z10);
        this.f3789H.m4462O(z10);
    }

    /* renamed from: r */
    public boolean m4369r() {
        Boolean bool;
        C0775e c0775e = this.f3805X;
        if (c0775e == null || (bool = c0775e.f3857q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: r0 */
    public final boolean m4370r0() {
        View view;
        return (!m4342g0() || m4345h0() || (view = this.f3802U) == null || view.getWindowToken() == null || this.f3802U.getVisibility() != 0) ? false : true;
    }

    /* renamed from: r1 */
    public boolean m4371r1(Menu menu) {
        boolean z10 = false;
        if (this.f3794M) {
            return false;
        }
        if (this.f3798Q && this.f3799R) {
            z10 = true;
            m4311R0(menu);
        }
        return z10 | this.f3789H.m4463P(menu);
    }

    /* renamed from: s */
    public View m4372s() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        return c0775e.f3841a;
    }

    /* renamed from: s0 */
    public void m4373s0() {
        this.f3789H.m4471T0();
    }

    /* renamed from: s1 */
    public void m4374s1() {
        boolean m4456K0 = this.f3787F.m4456K0(this);
        Boolean bool = this.f3831x;
        if (bool == null || bool.booleanValue() != m4456K0) {
            this.f3831x = Boolean.valueOf(m4456K0);
            m4314S0(m4456K0);
            this.f3789H.m4465Q();
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        m4323V1(intent, i10, null);
    }

    /* renamed from: t */
    public Animator m4375t() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        return c0775e.f3842b;
    }

    @Deprecated
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        this.f3800S = true;
    }

    /* renamed from: t1 */
    public void m4377t1() {
        this.f3789H.m4471T0();
        this.f3789H.m4482b0(true);
        this.f3821n = 7;
        this.f3800S = false;
        mo4319U0();
        if (this.f3800S) {
            C0846m c0846m = this.f3813f0;
            AbstractC0839f.b bVar = AbstractC0839f.b.ON_RESUME;
            c0846m.m4909h(bVar);
            if (this.f3802U != null) {
                this.f3814g0.m4814a(bVar);
            }
            this.f3789H.m4467R();
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onResume()");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f3826s);
        if (this.f3791J != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3791J));
        }
        if (this.f3793L != null) {
            sb2.append(" tag=");
            sb2.append(this.f3793L);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public final Bundle m4378u() {
        return this.f3827t;
    }

    @Deprecated
    /* renamed from: u0 */
    public void mo4379u0(int i10, int i11, Intent intent) {
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* renamed from: u1 */
    public void m4380u1(Bundle bundle) {
        mo4322V0(bundle);
        this.f3817j0.m5900d(bundle);
        Parcelable m4501k1 = this.f3789H.m4501k1();
        if (m4501k1 != null) {
            bundle.putParcelable("android:support:fragments", m4501k1);
        }
    }

    /* renamed from: v */
    public final FragmentManager m4381v() {
        if (this.f3788G != null) {
            return this.f3789H;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Deprecated
    /* renamed from: v0 */
    public void mo4382v0(Activity activity) {
        this.f3800S = true;
    }

    /* renamed from: v1 */
    public void m4383v1() {
        this.f3789H.m4471T0();
        this.f3789H.m4482b0(true);
        this.f3821n = 5;
        this.f3800S = false;
        mo268W0();
        if (this.f3800S) {
            C0846m c0846m = this.f3813f0;
            AbstractC0839f.b bVar = AbstractC0839f.b.ON_START;
            c0846m.m4909h(bVar);
            if (this.f3802U != null) {
                this.f3814g0.m4814a(bVar);
            }
            this.f3789H.m4469S();
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: w */
    public Context m4384w() {
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        if (abstractC0809j == null) {
            return null;
        }
        return abstractC0809j.m4659g();
    }

    /* renamed from: w0 */
    public void mo269w0(Context context) {
        this.f3800S = true;
        AbstractC0809j<?> abstractC0809j = this.f3788G;
        Activity m4658e = abstractC0809j == null ? null : abstractC0809j.m4658e();
        if (m4658e != null) {
            this.f3800S = false;
            mo4382v0(m4658e);
        }
    }

    /* renamed from: w1 */
    public void m4385w1() {
        this.f3789H.m4472U();
        if (this.f3802U != null) {
            this.f3814g0.m4814a(AbstractC0839f.b.ON_STOP);
        }
        this.f3813f0.m4909h(AbstractC0839f.b.ON_STOP);
        this.f3821n = 4;
        this.f3800S = false;
        mo4327X0();
        if (this.f3800S) {
            return;
        }
        throw new C0801b0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: x */
    public int m4386x() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return 0;
        }
        return c0775e.f3844d;
    }

    @Deprecated
    /* renamed from: x0 */
    public void m4387x0(Fragment fragment) {
    }

    /* renamed from: x1 */
    public void m4388x1() {
        m4329Y0(this.f3802U, this.f3822o);
        this.f3789H.m4474V();
    }

    /* renamed from: y */
    public Object m4389y() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        return c0775e.f3851k;
    }

    /* renamed from: y0 */
    public boolean m4390y0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: y1 */
    public final ActivityC0803d m4391y1() {
        ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            return m4363p;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: z */
    public AbstractC0585r m4392z() {
        C0775e c0775e = this.f3805X;
        if (c0775e == null) {
            return null;
        }
        Objects.requireNonNull(c0775e);
        return null;
    }

    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        this.f3800S = true;
        m4268B1(bundle);
        if (this.f3789H.m4458L0(1)) {
            return;
        }
        this.f3789H.m4443D();
    }

    /* renamed from: z1 */
    public final Context m4393z1() {
        Context m4384w = m4384w();
        if (m4384w != null) {
            return m4384w;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0770a();

        /* renamed from: n */
        final Bundle f3835n;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        /* loaded from: classes.dex */
        class C0770a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0770a() {
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

        public SavedState(Bundle bundle) {
            this.f3835n = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f3835n);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3835n = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }
}
