package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0130b;
import androidx.activity.InterfaceC0131c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0141b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0140a;
import androidx.activity.result.InterfaceC0142c;
import androidx.core.os.C0623b;
import androidx.fragment.app.AbstractC0819t;
import androidx.fragment.app.C0804e;
import androidx.fragment.app.C0820u;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0858y;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0859z;
import com.appsflyer.oaid.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p015b1.C0967b;
import p025c.AbstractC1112a;
import p025c.C1113b;
import p025c.C1114c;
import p093h0.C3357b;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: O */
    private static boolean f3864O = false;

    /* renamed from: P */
    static boolean f3865P = true;

    /* renamed from: A */
    private AbstractC0141b<IntentSenderRequest> f3866A;

    /* renamed from: B */
    private AbstractC0141b<String[]> f3867B;

    /* renamed from: D */
    private boolean f3869D;

    /* renamed from: E */
    private boolean f3870E;

    /* renamed from: F */
    private boolean f3871F;

    /* renamed from: G */
    private boolean f3872G;

    /* renamed from: H */
    private boolean f3873H;

    /* renamed from: I */
    private ArrayList<C0798a> f3874I;

    /* renamed from: J */
    private ArrayList<Boolean> f3875J;

    /* renamed from: K */
    private ArrayList<Fragment> f3876K;

    /* renamed from: L */
    private ArrayList<C0795o> f3877L;

    /* renamed from: M */
    private C0813n f3878M;

    /* renamed from: b */
    private boolean f3881b;

    /* renamed from: d */
    ArrayList<C0798a> f3883d;

    /* renamed from: e */
    private ArrayList<Fragment> f3884e;

    /* renamed from: g */
    private OnBackPressedDispatcher f3886g;

    /* renamed from: l */
    private ArrayList<InterfaceC0792l> f3891l;

    /* renamed from: r */
    private AbstractC0809j<?> f3897r;

    /* renamed from: s */
    private AbstractC0805f f3898s;

    /* renamed from: t */
    private Fragment f3899t;

    /* renamed from: u */
    Fragment f3900u;

    /* renamed from: z */
    private AbstractC0141b<Intent> f3905z;

    /* renamed from: a */
    private final ArrayList<InterfaceC0793m> f3880a = new ArrayList<>();

    /* renamed from: c */
    private final C0818s f3882c = new C0818s();

    /* renamed from: f */
    private final LayoutInflaterFactory2C0810k f3885f = new LayoutInflaterFactory2C0810k(this);

    /* renamed from: h */
    private final AbstractC0130b f3887h = new C0783c(false);

    /* renamed from: i */
    private final AtomicInteger f3888i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f3889j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f3890k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<C0623b>> f3892m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C0820u.g f3893n = new C0784d();

    /* renamed from: o */
    private final C0811l f3894o = new C0811l(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<InterfaceC0814o> f3895p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f3896q = -1;

    /* renamed from: v */
    private C0808i f3901v = null;

    /* renamed from: w */
    private C0808i f3902w = new C0785e();

    /* renamed from: x */
    private InterfaceC0799a0 f3903x = null;

    /* renamed from: y */
    private InterfaceC0799a0 f3904y = new C0786f();

    /* renamed from: C */
    ArrayDeque<LaunchedFragmentInfo> f3868C = new ArrayDeque<>();

    /* renamed from: N */
    private Runnable f3879N = new RunnableC0787g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: classes.dex */
    class C07796 implements InterfaceC0843j {

        /* renamed from: n */
        final /* synthetic */ String f3906n;

        /* renamed from: o */
        final /* synthetic */ InterfaceC0815p f3907o;

        /* renamed from: p */
        final /* synthetic */ AbstractC0839f f3908p;

        /* renamed from: q */
        final /* synthetic */ FragmentManager f3909q;

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            Bundle bundle;
            if (bVar == AbstractC0839f.b.ON_START && (bundle = (Bundle) this.f3909q.f3889j.get(this.f3906n)) != null) {
                this.f3907o.m4689a(this.f3906n, bundle);
                this.f3909q.m4513r(this.f3906n);
            }
            if (bVar == AbstractC0839f.b.ON_DESTROY) {
                this.f3908p.mo4891c(this);
                this.f3909q.f3890k.remove(this.f3906n);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes.dex */
    public class C0781a implements InterfaceC0140a<ActivityResult> {
        C0781a() {
        }

        @Override // androidx.activity.result.InterfaceC0140a
        /* renamed from: b */
        public void mo635a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3868C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3910n;
            int i10 = pollFirst.f3911o;
            Fragment m4730i = FragmentManager.this.f3882c.m4730i(str);
            if (m4730i == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m4730i.mo4379u0(i10, activityResult.m608b(), activityResult.m607a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes.dex */
    public class C0782b implements InterfaceC0140a<Map<String, Boolean>> {
        C0782b() {
        }

        @Override // androidx.activity.result.InterfaceC0140a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo635a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3868C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3910n;
            int i11 = pollFirst.f3911o;
            Fragment m4730i = FragmentManager.this.f3882c.m4730i(str);
            if (m4730i == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m4730i.m4317T0(i11, strArr, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes.dex */
    public class C0783c extends AbstractC0130b {
        C0783c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.AbstractC0130b
        /* renamed from: b */
        public void mo601b() {
            FragmentManager.this.m4444D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes.dex */
    public class C0784d implements C0820u.g {
        C0784d() {
        }

        @Override // androidx.fragment.app.C0820u.g
        /* renamed from: a */
        public void mo4531a(Fragment fragment, C0623b c0623b) {
            if (c0623b.m3338b()) {
                return;
            }
            FragmentManager.this.m4485d1(fragment, c0623b);
        }

        @Override // androidx.fragment.app.C0820u.g
        /* renamed from: b */
        public void mo4532b(Fragment fragment, C0623b c0623b) {
            FragmentManager.this.m4488f(fragment, c0623b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes.dex */
    public class C0785e extends C0808i {
        C0785e() {
        }

        @Override // androidx.fragment.app.C0808i
        /* renamed from: a */
        public Fragment mo4533a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m4519v0().m4629b(FragmentManager.this.m4519v0().m4659g(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes.dex */
    public class C0786f implements InterfaceC0799a0 {
        C0786f() {
        }

        @Override // androidx.fragment.app.InterfaceC0799a0
        /* renamed from: a */
        public AbstractC0825z mo4534a(ViewGroup viewGroup) {
            return new C0800b(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes.dex */
    public class RunnableC0787g implements Runnable {
        RunnableC0787g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m4482b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes.dex */
    public class C0788h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3919a;

        /* renamed from: b */
        final /* synthetic */ View f3920b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3921c;

        C0788h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3919a = viewGroup;
            this.f3920b = view;
            this.f3921c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3919a.endViewTransition(this.f3920b);
            animator.removeListener(this);
            Fragment fragment = this.f3921c;
            View view = fragment.f3802U;
            if (view == null || !fragment.f3794M) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes.dex */
    public class C0789i implements InterfaceC0814o {

        /* renamed from: n */
        final /* synthetic */ Fragment f3923n;

        C0789i(Fragment fragment) {
            this.f3923n = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0814o
        /* renamed from: a */
        public void mo4535a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3923n.m4387x0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes.dex */
    public class C0790j implements InterfaceC0140a<ActivityResult> {
        C0790j() {
        }

        @Override // androidx.activity.result.InterfaceC0140a
        /* renamed from: b */
        public void mo635a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3868C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3910n;
            int i10 = pollFirst.f3911o;
            Fragment m4730i = FragmentManager.this.f3882c.m4730i(str);
            if (m4730i == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m4730i.mo4379u0(i10, activityResult.m608b(), activityResult.m607a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes.dex */
    public static class C0791k extends AbstractC1112a<IntentSenderRequest, ActivityResult> {
        C0791k() {
        }

        @Override // p025c.AbstractC1112a
        /* renamed from: d */
        public Intent mo4537a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m626a = intentSenderRequest.m626a();
            if (m626a != null && (bundleExtra = m626a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m626a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m626a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0139b(intentSenderRequest.m629d()).m633b(null).m634c(intentSenderRequest.m628c(), intentSenderRequest.m627b()).m632a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p025c.AbstractC1112a
        /* renamed from: e */
        public ActivityResult mo4538c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0792l {
        /* renamed from: a */
        void m4541a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0793m {
        /* renamed from: a */
        boolean mo4542a(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes.dex */
    public class C0794n implements InterfaceC0793m {

        /* renamed from: a */
        final String f3926a;

        /* renamed from: b */
        final int f3927b;

        /* renamed from: c */
        final int f3928c;

        C0794n(String str, int i10, int i11) {
            this.f3926a = str;
            this.f3927b = i10;
            this.f3928c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0793m
        /* renamed from: a */
        public boolean mo4542a(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3900u;
            if (fragment == null || this.f3927b >= 0 || this.f3926a != null || !fragment.m4381v().m4479Y0()) {
                return FragmentManager.this.m4481a1(arrayList, arrayList2, this.f3926a, this.f3927b, this.f3928c);
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes.dex */
    public static class C0795o implements Fragment.InterfaceC0778h {

        /* renamed from: a */
        final boolean f3930a;

        /* renamed from: b */
        final C0798a f3931b;

        /* renamed from: c */
        private int f3932c;

        C0795o(C0798a c0798a, boolean z10) {
            this.f3930a = z10;
            this.f3931b = c0798a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0778h
        /* renamed from: a */
        public void mo4400a() {
            int i10 = this.f3932c - 1;
            this.f3932c = i10;
            if (i10 != 0) {
                return;
            }
            this.f3931b.f3954t.m4505m1();
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0778h
        /* renamed from: b */
        public void mo4401b() {
            this.f3932c++;
        }

        /* renamed from: c */
        void m4543c() {
            C0798a c0798a = this.f3931b;
            c0798a.f3954t.m4517u(c0798a, this.f3930a, false, false);
        }

        /* renamed from: d */
        void m4544d() {
            boolean z10 = this.f3932c > 0;
            for (Fragment fragment : this.f3931b.f3954t.m4518u0()) {
                fragment.m4300N1(null);
                if (z10 && fragment.m4356m0()) {
                    fragment.m4325W1();
                }
            }
            C0798a c0798a = this.f3931b;
            c0798a.f3954t.m4517u(c0798a, this.f3930a, !z10, true);
        }

        /* renamed from: e */
        public boolean m4545e() {
            return this.f3932c == 0;
        }
    }

    /* renamed from: B0 */
    public static Fragment m4402B0(View view) {
        Object tag = view.getTag(C0967b.f5125a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: H0 */
    public static boolean m4403H0(int i10) {
        return f3864O || Log.isLoggable("FragmentManager", i10);
    }

    /* renamed from: I0 */
    private boolean m4404I0(Fragment fragment) {
        return (fragment.f3798Q && fragment.f3799R) || fragment.f3789H.m4508o();
    }

    /* renamed from: M */
    private void m4405M(Fragment fragment) {
        if (fragment == null || !fragment.equals(m4493h0(fragment.f3826s))) {
            return;
        }
        fragment.m4374s1();
    }

    /* renamed from: O0 */
    private void m4406O0(C3357b<Fragment> c3357b) {
        int size = c3357b.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment m14794p = c3357b.m14794p(i10);
            if (!m14794p.f3832y) {
                View m4265A1 = m14794p.m4265A1();
                m14794p.f3809b0 = m4265A1.getAlpha();
                m4265A1.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: T */
    private void m4407T(int i10) {
        try {
            this.f3881b = true;
            this.f3882c.m4725d(i10);
            m4466Q0(i10, false);
            if (f3865P) {
                Iterator<AbstractC0825z> it = m4431s().iterator();
                while (it.hasNext()) {
                    it.next().m4832j();
                }
            }
            this.f3881b = false;
            m4482b0(true);
        } catch (Throwable th) {
            this.f3881b = false;
            throw th;
        }
    }

    /* renamed from: W */
    private void m4408W() {
        if (this.f3873H) {
            this.f3873H = false;
            m4432s1();
        }
    }

    /* renamed from: Y */
    private void m4409Y() {
        if (f3865P) {
            Iterator<AbstractC0825z> it = m4431s().iterator();
            while (it.hasNext()) {
                it.next().m4832j();
            }
        } else {
            if (this.f3892m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f3892m.keySet()) {
                m4425n(fragment);
                m4468R0(fragment);
            }
        }
    }

    /* renamed from: Z0 */
    private boolean m4410Z0(String str, int i10, int i11) {
        m4482b0(false);
        m4412a0(true);
        Fragment fragment = this.f3900u;
        if (fragment != null && i10 < 0 && str == null && fragment.m4381v().m4479Y0()) {
            return true;
        }
        boolean m4481a1 = m4481a1(this.f3874I, this.f3875J, str, i10, i11);
        if (m4481a1) {
            this.f3881b = true;
            try {
                m4419f1(this.f3874I, this.f3875J);
            } finally {
                m4428q();
            }
        }
        m4435u1();
        m4408W();
        this.f3882c.m4723b();
        return m4481a1;
    }

    /* renamed from: a0 */
    private void m4412a0(boolean z10) {
        if (!this.f3881b) {
            if (this.f3897r == null) {
                if (this.f3872G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f3897r.m4660h().getLooper()) {
                if (!z10) {
                    m4427p();
                }
                if (this.f3874I == null) {
                    this.f3874I = new ArrayList<>();
                    this.f3875J = new ArrayList<>();
                }
                this.f3881b = true;
                try {
                    m4420g0(null, null);
                    return;
                } finally {
                    this.f3881b = false;
                }
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: b1 */
    private int m4414b1(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, C3357b<Fragment> c3357b) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            C0798a c0798a = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (c0798a.m4555F() && !c0798a.m4554D(arrayList, i13 + 1, i11)) {
                if (this.f3877L == null) {
                    this.f3877L = new ArrayList<>();
                }
                C0795o c0795o = new C0795o(c0798a, booleanValue);
                this.f3877L.add(c0795o);
                c0798a.m4557H(c0795o);
                if (booleanValue) {
                    c0798a.m4571y();
                } else {
                    c0798a.m4572z(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, c0798a);
                }
                m4416d(c3357b);
            }
        }
        return i12;
    }

    /* renamed from: d */
    private void m4416d(C3357b<Fragment> c3357b) {
        int i10 = this.f3896q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment.f3821n < min) {
                m4470S0(fragment, min);
                if (fragment.f3802U != null && !fragment.f3794M && fragment.f3807Z) {
                    c3357b.add(fragment);
                }
            }
        }
    }

    /* renamed from: d0 */
    private static void m4417d0(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C0798a c0798a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c0798a.m4567u(-1);
                c0798a.m4572z(i10 == i11 + (-1));
            } else {
                c0798a.m4567u(1);
                c0798a.m4571y();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4418e0(java.util.ArrayList<androidx.fragment.app.C0798a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m4418e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: f1 */
    private void m4419f1(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            m4420g0(arrayList, arrayList2);
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).f4107r) {
                    if (i11 != i10) {
                        m4418e0(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f4107r) {
                            i11++;
                        }
                    }
                    m4418e0(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                m4418e0(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: g0 */
    private void m4420g0(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0795o> arrayList3 = this.f3877L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            C0795o c0795o = this.f3877L.get(i10);
            if (arrayList != null && !c0795o.f3930a && (indexOf2 = arrayList.indexOf(c0795o.f3931b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f3877L.remove(i10);
                i10--;
                size--;
                c0795o.m4543c();
            } else if (c0795o.m4545e() || (arrayList != null && c0795o.f3931b.m4554D(arrayList, 0, arrayList.size()))) {
                this.f3877L.remove(i10);
                i10--;
                size--;
                if (arrayList != null && !c0795o.f3930a && (indexOf = arrayList.indexOf(c0795o.f3931b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    c0795o.m4543c();
                } else {
                    c0795o.m4544d();
                }
            }
            i10++;
        }
    }

    /* renamed from: h1 */
    private void m4421h1() {
        if (this.f3891l != null) {
            for (int i10 = 0; i10 < this.f3891l.size(); i10++) {
                this.f3891l.get(i10).m4541a();
            }
        }
    }

    /* renamed from: j1 */
    public static int m4422j1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: l0 */
    private void m4423l0() {
        if (f3865P) {
            Iterator<AbstractC0825z> it = m4431s().iterator();
            while (it.hasNext()) {
                it.next().m4833k();
            }
        } else if (this.f3877L != null) {
            while (!this.f3877L.isEmpty()) {
                this.f3877L.remove(0).m4544d();
            }
        }
    }

    /* renamed from: m0 */
    private boolean m4424m0(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3880a) {
            if (this.f3880a.isEmpty()) {
                return false;
            }
            int size = this.f3880a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f3880a.get(i10).mo4542a(arrayList, arrayList2);
            }
            this.f3880a.clear();
            this.f3897r.m4660h().removeCallbacks(this.f3879N);
            return z10;
        }
    }

    /* renamed from: n */
    private void m4425n(Fragment fragment) {
        HashSet<C0623b> hashSet = this.f3892m.get(fragment);
        if (hashSet != null) {
            Iterator<C0623b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m3337a();
            }
            hashSet.clear();
            m4437x(fragment);
            this.f3892m.remove(fragment);
        }
    }

    /* renamed from: o0 */
    private C0813n m4426o0(Fragment fragment) {
        return this.f3878M.m4681h(fragment);
    }

    /* renamed from: p */
    private void m4427p() {
        if (m4459M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q */
    private void m4428q() {
        this.f3881b = false;
        this.f3875J.clear();
        this.f3874I.clear();
    }

    /* renamed from: q1 */
    private void m4429q1(Fragment fragment) {
        ViewGroup m4430r0 = m4430r0(fragment);
        if (m4430r0 == null || fragment.m4386x() + fragment.m4263A() + fragment.m4295M() + fragment.m4298N() <= 0) {
            return;
        }
        int i10 = C0967b.f5127c;
        if (m4430r0.getTag(i10) == null) {
            m4430r0.setTag(i10, fragment);
        }
        ((Fragment) m4430r0.getTag(i10)).m4303O1(fragment.m4292L());
    }

    /* renamed from: r0 */
    private ViewGroup m4430r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3801T;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3792K > 0 && this.f3898s.mo4398d()) {
            View mo4397c = this.f3898s.mo4397c(fragment.f3792K);
            if (mo4397c instanceof ViewGroup) {
                return (ViewGroup) mo4397c;
            }
        }
        return null;
    }

    /* renamed from: s */
    private Set<AbstractC0825z> m4431s() {
        HashSet hashSet = new HashSet();
        Iterator<C0816q> it = this.f3882c.m4732k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m4702k().f3801T;
            if (viewGroup != null) {
                hashSet.add(AbstractC0825z.m4825o(viewGroup, m4439A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: s1 */
    private void m4432s1() {
        Iterator<C0816q> it = this.f3882c.m4732k().iterator();
        while (it.hasNext()) {
            m4475V0(it.next());
        }
    }

    /* renamed from: t */
    private Set<AbstractC0825z> m4433t(ArrayList<C0798a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<AbstractC0819t.a> it = arrayList.get(i10).f4092c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4110b;
                if (fragment != null && (viewGroup = fragment.f3801T) != null) {
                    hashSet.add(AbstractC0825z.m4824n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* renamed from: t1 */
    private void m4434t1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0824y("FragmentManager"));
        AbstractC0809j<?> abstractC0809j = this.f3897r;
        if (abstractC0809j != null) {
            try {
                abstractC0809j.mo4619i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            m4477X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    /* renamed from: u1 */
    private void m4435u1() {
        synchronized (this.f3880a) {
            if (!this.f3880a.isEmpty()) {
                this.f3887h.m605f(true);
            } else {
                this.f3887h.m605f(m4506n0() > 0 && m4456K0(this.f3899t));
            }
        }
    }

    /* renamed from: v */
    private void m4436v(Fragment fragment) {
        Animator animator;
        if (fragment.f3802U != null) {
            C0804e.d m4627c = C0804e.m4627c(this.f3897r.m4659g(), fragment, !fragment.f3794M, fragment.m4292L());
            if (m4627c != null && (animator = m4627c.f4041b) != null) {
                animator.setTarget(fragment.f3802U);
                if (fragment.f3794M) {
                    if (fragment.m4350j0()) {
                        fragment.m4288J1(false);
                    } else {
                        ViewGroup viewGroup = fragment.f3801T;
                        View view = fragment.f3802U;
                        viewGroup.startViewTransition(view);
                        m4627c.f4041b.addListener(new C0788h(viewGroup, view, fragment));
                    }
                } else {
                    fragment.f3802U.setVisibility(0);
                }
                m4627c.f4041b.start();
            } else {
                if (m4627c != null) {
                    fragment.f3802U.startAnimation(m4627c.f4040a);
                    m4627c.f4040a.start();
                }
                fragment.f3802U.setVisibility((!fragment.f3794M || fragment.m4350j0()) ? 0 : 8);
                if (fragment.m4350j0()) {
                    fragment.m4288J1(false);
                }
            }
        }
        m4448F0(fragment);
        fragment.f3808a0 = false;
        fragment.mo4287J0(fragment.f3794M);
    }

    /* renamed from: x */
    private void m4437x(Fragment fragment) {
        fragment.m4348i1();
        this.f3894o.m4675n(fragment, false);
        fragment.f3801T = null;
        fragment.f3802U = null;
        fragment.f3814g0 = null;
        fragment.f3815h0.mo4867o(null);
        fragment.f3783B = false;
    }

    /* renamed from: A */
    public void m4438A() {
        this.f3870E = false;
        this.f3871F = false;
        this.f3878M.m4686n(false);
        m4407T(0);
    }

    /* renamed from: A0 */
    public InterfaceC0799a0 m4439A0() {
        InterfaceC0799a0 interfaceC0799a0 = this.f3903x;
        if (interfaceC0799a0 != null) {
            return interfaceC0799a0;
        }
        Fragment fragment = this.f3899t;
        if (fragment != null) {
            return fragment.f3787F.m4439A0();
        }
        return this.f3904y;
    }

    /* renamed from: B */
    public void m4440B(Configuration configuration) {
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null) {
                fragment.m4337c1(configuration);
            }
        }
    }

    /* renamed from: C */
    public boolean m4441C(MenuItem menuItem) {
        if (this.f3896q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null && fragment.m4338d1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public C0858y m4442C0(Fragment fragment) {
        return this.f3878M.m4683k(fragment);
    }

    /* renamed from: D */
    public void m4443D() {
        this.f3870E = false;
        this.f3871F = false;
        this.f3878M.m4686n(false);
        m4407T(1);
    }

    /* renamed from: D0 */
    void m4444D0() {
        m4482b0(true);
        if (this.f3887h.m602c()) {
            m4479Y0();
        } else {
            this.f3886g.m599c();
        }
    }

    /* renamed from: E */
    public boolean m4445E(Menu menu, MenuInflater menuInflater) {
        if (this.f3896q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null && m4454J0(fragment) && fragment.m4341f1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f3884e != null) {
            for (int i10 = 0; i10 < this.f3884e.size(); i10++) {
                Fragment fragment2 = this.f3884e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m4277F0();
                }
            }
        }
        this.f3884e = arrayList;
        return z10;
    }

    /* renamed from: E0 */
    public void m4446E0(Fragment fragment) {
        if (m4403H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f3794M) {
            return;
        }
        fragment.f3794M = true;
        fragment.f3808a0 = true ^ fragment.f3808a0;
        m4429q1(fragment);
    }

    /* renamed from: F */
    public void m4447F() {
        this.f3872G = true;
        m4482b0(true);
        m4409Y();
        m4407T(-1);
        this.f3897r = null;
        this.f3898s = null;
        this.f3899t = null;
        if (this.f3886g != null) {
            this.f3887h.m603d();
            this.f3886g = null;
        }
        AbstractC0141b<Intent> abstractC0141b = this.f3905z;
        if (abstractC0141b != null) {
            abstractC0141b.mo623c();
            this.f3866A.mo623c();
            this.f3867B.mo623c();
        }
    }

    /* renamed from: F0 */
    public void m4448F0(Fragment fragment) {
        if (fragment.f3832y && m4404I0(fragment)) {
            this.f3869D = true;
        }
    }

    /* renamed from: G */
    public void m4449G() {
        m4407T(1);
    }

    /* renamed from: G0 */
    public boolean m4450G0() {
        return this.f3872G;
    }

    /* renamed from: H */
    public void m4451H() {
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null) {
                fragment.m4355l1();
            }
        }
    }

    /* renamed from: I */
    public void m4452I(boolean z10) {
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null) {
                fragment.m4357m1(z10);
            }
        }
    }

    /* renamed from: J */
    public void m4453J(Fragment fragment) {
        Iterator<InterfaceC0814o> it = this.f3895p.iterator();
        while (it.hasNext()) {
            it.next().mo4535a(this, fragment);
        }
    }

    /* renamed from: J0 */
    public boolean m4454J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.m4354l0();
    }

    /* renamed from: K */
    public boolean m4455K(MenuItem menuItem) {
        if (this.f3896q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null && fragment.m4359n1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    public boolean m4456K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f3787F;
        return fragment.equals(fragmentManager.m4526z0()) && m4456K0(fragmentManager.f3899t);
    }

    /* renamed from: L */
    public void m4457L(Menu menu) {
        if (this.f3896q < 1) {
            return;
        }
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null) {
                fragment.m4362o1(menu);
            }
        }
    }

    /* renamed from: L0 */
    public boolean m4458L0(int i10) {
        return this.f3896q >= i10;
    }

    /* renamed from: M0 */
    public boolean m4459M0() {
        return this.f3870E || this.f3871F;
    }

    /* renamed from: N */
    public void m4460N() {
        m4407T(5);
    }

    /* renamed from: N0 */
    public void m4461N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f3905z != null) {
            this.f3868C.addLast(new LaunchedFragmentInfo(fragment.f3826s, i10));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3905z.m636a(intent);
            return;
        }
        this.f3897r.m4661o(fragment, intent, i10, bundle);
    }

    /* renamed from: O */
    public void m4462O(boolean z10) {
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null) {
                fragment.m4368q1(z10);
            }
        }
    }

    /* renamed from: P */
    public boolean m4463P(Menu menu) {
        boolean z10 = false;
        if (this.f3896q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null && m4454J0(fragment) && fragment.m4371r1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: P0 */
    public void m4464P0(Fragment fragment) {
        if (!this.f3882c.m4724c(fragment.f3826s)) {
            if (m4403H0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3896q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m4468R0(fragment);
        View view = fragment.f3802U;
        if (view != null && fragment.f3807Z && fragment.f3801T != null) {
            float f10 = fragment.f3809b0;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.f3809b0 = 0.0f;
            fragment.f3807Z = false;
            C0804e.d m4627c = C0804e.m4627c(this.f3897r.m4659g(), fragment, true, fragment.m4292L());
            if (m4627c != null) {
                Animation animation = m4627c.f4040a;
                if (animation != null) {
                    fragment.f3802U.startAnimation(animation);
                } else {
                    m4627c.f4041b.setTarget(fragment.f3802U);
                    m4627c.f4041b.start();
                }
            }
        }
        if (fragment.f3808a0) {
            m4436v(fragment);
        }
    }

    /* renamed from: Q */
    public void m4465Q() {
        m4435u1();
        m4405M(this.f3900u);
    }

    /* renamed from: Q0 */
    public void m4466Q0(int i10, boolean z10) {
        AbstractC0809j<?> abstractC0809j;
        if (this.f3897r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f3896q) {
            this.f3896q = i10;
            if (f3865P) {
                this.f3882c.m4739r();
            } else {
                Iterator<Fragment> it = this.f3882c.m4735n().iterator();
                while (it.hasNext()) {
                    m4464P0(it.next());
                }
                for (C0816q c0816q : this.f3882c.m4732k()) {
                    Fragment m4702k = c0816q.m4702k();
                    if (!m4702k.f3807Z) {
                        m4464P0(m4702k);
                    }
                    if (m4702k.f3833z && !m4702k.m4352k0()) {
                        this.f3882c.m4738q(c0816q);
                    }
                }
            }
            m4432s1();
            if (this.f3869D && (abstractC0809j = this.f3897r) != null && this.f3896q == 7) {
                abstractC0809j.mo4623p();
                this.f3869D = false;
            }
        }
    }

    /* renamed from: R */
    public void m4467R() {
        this.f3870E = false;
        this.f3871F = false;
        this.f3878M.m4686n(false);
        m4407T(7);
    }

    /* renamed from: R0 */
    public void m4468R0(Fragment fragment) {
        m4470S0(fragment, this.f3896q);
    }

    /* renamed from: S */
    public void m4469S() {
        this.f3870E = false;
        this.f3871F = false;
        this.f3878M.m4686n(false);
        m4407T(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2 != 5) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m4470S0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m4470S0(androidx.fragment.app.Fragment, int):void");
    }

    /* renamed from: T0 */
    public void m4471T0() {
        if (this.f3897r == null) {
            return;
        }
        this.f3870E = false;
        this.f3871F = false;
        this.f3878M.m4686n(false);
        for (Fragment fragment : this.f3882c.m4735n()) {
            if (fragment != null) {
                fragment.m4373s0();
            }
        }
    }

    /* renamed from: U */
    public void m4472U() {
        this.f3871F = true;
        this.f3878M.m4686n(true);
        m4407T(4);
    }

    /* renamed from: U0 */
    public void m4473U0(C0806g c0806g) {
        View view;
        for (C0816q c0816q : this.f3882c.m4732k()) {
            Fragment m4702k = c0816q.m4702k();
            if (m4702k.f3792K == c0806g.getId() && (view = m4702k.f3802U) != null && view.getParent() == null) {
                m4702k.f3801T = c0806g;
                c0816q.m4693b();
            }
        }
    }

    /* renamed from: V */
    public void m4474V() {
        m4407T(2);
    }

    /* renamed from: V0 */
    public void m4475V0(C0816q c0816q) {
        Fragment m4702k = c0816q.m4702k();
        if (m4702k.f3803V) {
            if (this.f3881b) {
                this.f3873H = true;
                return;
            }
            m4702k.f3803V = false;
            if (f3865P) {
                c0816q.m4703m();
            } else {
                m4468R0(m4702k);
            }
        }
    }

    /* renamed from: W0 */
    public void m4476W0() {
        m4480Z(new C0794n(null, -1, 0), false);
    }

    /* renamed from: X */
    public void m4477X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3882c.m4726e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3884e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f3884e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0798a> arrayList2 = this.f3883d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C0798a c0798a = this.f3883d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0798a.toString());
                c0798a.m4569w(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3888i.get());
        synchronized (this.f3880a) {
            int size3 = this.f3880a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    InterfaceC0793m interfaceC0793m = this.f3880a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0793m);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3897r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3898s);
        if (this.f3899t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3899t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3896q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3870E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3871F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3872G);
        if (this.f3869D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3869D);
        }
    }

    /* renamed from: X0 */
    public void m4478X0(int i10, int i11) {
        if (i10 >= 0) {
            m4480Z(new C0794n(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* renamed from: Y0 */
    public boolean m4479Y0() {
        return m4410Z0(null, -1, 0);
    }

    /* renamed from: Z */
    public void m4480Z(InterfaceC0793m interfaceC0793m, boolean z10) {
        if (!z10) {
            if (this.f3897r == null) {
                if (this.f3872G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m4427p();
        }
        synchronized (this.f3880a) {
            if (this.f3897r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3880a.add(interfaceC0793m);
                m4505m1();
            }
        }
    }

    /* renamed from: a1 */
    boolean m4481a1(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<C0798a> arrayList3 = this.f3883d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3883d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0798a c0798a = this.f3883d.get(size2);
                    if ((str != null && str.equals(c0798a.m4552B())) || (i10 >= 0 && i10 == c0798a.f3956v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0798a c0798a2 = this.f3883d.get(size2);
                        if (str == null || !str.equals(c0798a2.m4552B())) {
                            if (i10 < 0 || i10 != c0798a2.f3956v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f3883d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3883d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f3883d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: b0 */
    public boolean m4482b0(boolean z10) {
        m4412a0(z10);
        boolean z11 = false;
        while (m4424m0(this.f3874I, this.f3875J)) {
            this.f3881b = true;
            try {
                m4419f1(this.f3874I, this.f3875J);
                m4428q();
                z11 = true;
            } catch (Throwable th) {
                m4428q();
                throw th;
            }
        }
        m4435u1();
        m4408W();
        this.f3882c.m4723b();
        return z11;
    }

    /* renamed from: c0 */
    public void m4483c0(InterfaceC0793m interfaceC0793m, boolean z10) {
        if (z10 && (this.f3897r == null || this.f3872G)) {
            return;
        }
        m4412a0(z10);
        if (interfaceC0793m.mo4542a(this.f3874I, this.f3875J)) {
            this.f3881b = true;
            try {
                m4419f1(this.f3874I, this.f3875J);
            } finally {
                m4428q();
            }
        }
        m4435u1();
        m4408W();
        this.f3882c.m4723b();
    }

    /* renamed from: c1 */
    public void m4484c1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f3787F != this) {
            m4434t1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f3826s);
    }

    /* renamed from: d1 */
    void m4485d1(Fragment fragment, C0623b c0623b) {
        HashSet<C0623b> hashSet = this.f3892m.get(fragment);
        if (hashSet != null && hashSet.remove(c0623b) && hashSet.isEmpty()) {
            this.f3892m.remove(fragment);
            if (fragment.f3821n < 5) {
                m4437x(fragment);
                m4468R0(fragment);
            }
        }
    }

    /* renamed from: e */
    public void m4486e(C0798a c0798a) {
        if (this.f3883d == null) {
            this.f3883d = new ArrayList<>();
        }
        this.f3883d.add(c0798a);
    }

    /* renamed from: e1 */
    public void m4487e1(Fragment fragment) {
        if (m4403H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3786E);
        }
        boolean z10 = !fragment.m4352k0();
        if (!fragment.f3795N || z10) {
            this.f3882c.m4740s(fragment);
            if (m4404I0(fragment)) {
                this.f3869D = true;
            }
            fragment.f3833z = true;
            m4429q1(fragment);
        }
    }

    /* renamed from: f */
    void m4488f(Fragment fragment, C0623b c0623b) {
        if (this.f3892m.get(fragment) == null) {
            this.f3892m.put(fragment, new HashSet<>());
        }
        this.f3892m.get(fragment).add(c0623b);
    }

    /* renamed from: f0 */
    public boolean m4489f0() {
        boolean m4482b0 = m4482b0(true);
        m4423l0();
        return m4482b0;
    }

    /* renamed from: g */
    public C0816q m4490g(Fragment fragment) {
        if (m4403H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0816q m4520w = m4520w(fragment);
        fragment.f3787F = this;
        this.f3882c.m4737p(m4520w);
        if (!fragment.f3795N) {
            this.f3882c.m4722a(fragment);
            fragment.f3833z = false;
            if (fragment.f3802U == null) {
                fragment.f3808a0 = false;
            }
            if (m4404I0(fragment)) {
                this.f3869D = true;
            }
        }
        return m4520w;
    }

    /* renamed from: g1 */
    public void m4491g1(Fragment fragment) {
        this.f3878M.m4685m(fragment);
    }

    /* renamed from: h */
    public void m4492h(InterfaceC0814o interfaceC0814o) {
        this.f3895p.add(interfaceC0814o);
    }

    /* renamed from: h0 */
    public Fragment m4493h0(String str) {
        return this.f3882c.m4727f(str);
    }

    /* renamed from: i */
    public void m4494i(Fragment fragment) {
        this.f3878M.m4678e(fragment);
    }

    /* renamed from: i0 */
    public Fragment m4495i0(int i10) {
        return this.f3882c.m4728g(i10);
    }

    /* renamed from: i1 */
    public void m4496i1(Parcelable parcelable) {
        C0816q c0816q;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3933n == null) {
            return;
        }
        this.f3882c.m4741t();
        Iterator<FragmentState> it = fragmentManagerState.f3933n.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment m4680g = this.f3878M.m4680g(next.f3942o);
                if (m4680g != null) {
                    if (m4403H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m4680g);
                    }
                    c0816q = new C0816q(this.f3894o, this.f3882c, m4680g, next);
                } else {
                    c0816q = new C0816q(this.f3894o, this.f3882c, this.f3897r.m4659g().getClassLoader(), m4515s0(), next);
                }
                Fragment m4702k = c0816q.m4702k();
                m4702k.f3787F = this;
                if (m4403H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m4702k.f3826s + "): " + m4702k);
                }
                c0816q.m4705o(this.f3897r.m4659g().getClassLoader());
                this.f3882c.m4737p(c0816q);
                c0816q.m4710u(this.f3896q);
            }
        }
        for (Fragment fragment : this.f3878M.m4682j()) {
            if (!this.f3882c.m4724c(fragment.f3826s)) {
                if (m4403H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3933n);
                }
                this.f3878M.m4685m(fragment);
                fragment.f3787F = this;
                C0816q c0816q2 = new C0816q(this.f3894o, this.f3882c, fragment);
                c0816q2.m4710u(1);
                c0816q2.m4703m();
                fragment.f3833z = true;
                c0816q2.m4703m();
            }
        }
        this.f3882c.m4742u(fragmentManagerState.f3934o);
        if (fragmentManagerState.f3935p != null) {
            this.f3883d = new ArrayList<>(fragmentManagerState.f3935p.length);
            int i10 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3935p;
                if (i10 >= backStackStateArr.length) {
                    break;
                }
                C0798a m4255a = backStackStateArr[i10].m4255a(this);
                if (m4403H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + m4255a.f3956v + "): " + m4255a);
                    PrintWriter printWriter = new PrintWriter(new C0824y("FragmentManager"));
                    m4255a.m4570x("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3883d.add(m4255a);
                i10++;
            }
        } else {
            this.f3883d = null;
        }
        this.f3888i.set(fragmentManagerState.f3936q);
        String str = fragmentManagerState.f3937r;
        if (str != null) {
            Fragment m4493h0 = m4493h0(str);
            this.f3900u = m4493h0;
            m4405M(m4493h0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3938s;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = fragmentManagerState.f3939t.get(i11);
                bundle.setClassLoader(this.f3897r.m4659g().getClassLoader());
                this.f3889j.put(arrayList.get(i11), bundle);
            }
        }
        this.f3868C = new ArrayDeque<>(fragmentManagerState.f3940u);
    }

    /* renamed from: j */
    public int m4497j() {
        return this.f3888i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m4498j0(String str) {
        return this.f3882c.m4729h(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    public void m4499k(AbstractC0809j<?> abstractC0809j, AbstractC0805f abstractC0805f, Fragment fragment) {
        String str;
        if (this.f3897r == null) {
            this.f3897r = abstractC0809j;
            this.f3898s = abstractC0805f;
            this.f3899t = fragment;
            if (fragment != null) {
                m4492h(new C0789i(fragment));
            } else if (abstractC0809j instanceof InterfaceC0814o) {
                m4492h((InterfaceC0814o) abstractC0809j);
            }
            if (this.f3899t != null) {
                m4435u1();
            }
            if (abstractC0809j instanceof InterfaceC0131c) {
                InterfaceC0131c interfaceC0131c = (InterfaceC0131c) abstractC0809j;
                OnBackPressedDispatcher mo585k = interfaceC0131c.mo585k();
                this.f3886g = mo585k;
                InterfaceC0845l interfaceC0845l = interfaceC0131c;
                if (fragment != null) {
                    interfaceC0845l = fragment;
                }
                mo585k.m597a(interfaceC0845l, this.f3887h);
            }
            if (fragment != null) {
                this.f3878M = fragment.f3787F.m4426o0(fragment);
            } else if (abstractC0809j instanceof InterfaceC0859z) {
                this.f3878M = C0813n.m4676i(((InterfaceC0859z) abstractC0809j).mo584i0());
            } else {
                this.f3878M = new C0813n(false);
            }
            this.f3878M.m4686n(m4459M0());
            this.f3882c.m4745x(this.f3878M);
            Object obj = this.f3897r;
            if (obj instanceof InterfaceC0142c) {
                ActivityResultRegistry mo582Y = ((InterfaceC0142c) obj).mo582Y();
                if (fragment != null) {
                    str = fragment.f3826s + ":";
                } else {
                    str = BuildConfig.FLAVOR;
                }
                String str2 = "FragmentManager:" + str;
                this.f3905z = mo582Y.m620j(str2 + "StartActivityForResult", new C1114c(), new C0790j());
                this.f3866A = mo582Y.m620j(str2 + "StartIntentSenderForResult", new C0791k(), new C0781a());
                this.f3867B = mo582Y.m620j(str2 + "RequestPermissions", new C1113b(), new C0782b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: k0 */
    public Fragment m4500k0(String str) {
        return this.f3882c.m4730i(str);
    }

    /* renamed from: k1 */
    public Parcelable m4501k1() {
        int size;
        m4423l0();
        m4409Y();
        m4482b0(true);
        this.f3870E = true;
        this.f3878M.m4686n(true);
        ArrayList<FragmentState> m4743v = this.f3882c.m4743v();
        BackStackState[] backStackStateArr = null;
        if (m4743v.isEmpty()) {
            if (m4403H0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m4744w = this.f3882c.m4744w();
        ArrayList<C0798a> arrayList = this.f3883d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackStateArr[i10] = new BackStackState(this.f3883d.get(i10));
                if (m4403H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f3883d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3933n = m4743v;
        fragmentManagerState.f3934o = m4744w;
        fragmentManagerState.f3935p = backStackStateArr;
        fragmentManagerState.f3936q = this.f3888i.get();
        Fragment fragment = this.f3900u;
        if (fragment != null) {
            fragmentManagerState.f3937r = fragment.f3826s;
        }
        fragmentManagerState.f3938s.addAll(this.f3889j.keySet());
        fragmentManagerState.f3939t.addAll(this.f3889j.values());
        fragmentManagerState.f3940u = new ArrayList<>(this.f3868C);
        return fragmentManagerState;
    }

    /* renamed from: l */
    public void m4502l(Fragment fragment) {
        if (m4403H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3795N) {
            fragment.f3795N = false;
            if (fragment.f3832y) {
                return;
            }
            this.f3882c.m4722a(fragment);
            if (m4403H0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m4404I0(fragment)) {
                this.f3869D = true;
            }
        }
    }

    /* renamed from: l1 */
    public Fragment.SavedState m4503l1(Fragment fragment) {
        C0816q m4734m = this.f3882c.m4734m(fragment.f3826s);
        if (m4734m == null || !m4734m.m4702k().equals(fragment)) {
            m4434t1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m4734m.m4707r();
    }

    /* renamed from: m */
    public AbstractC0819t m4504m() {
        return new C0798a(this);
    }

    /* renamed from: m1 */
    void m4505m1() {
        synchronized (this.f3880a) {
            ArrayList<C0795o> arrayList = this.f3877L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f3880a.size() == 1;
            if (z10 || z11) {
                this.f3897r.m4660h().removeCallbacks(this.f3879N);
                this.f3897r.m4660h().post(this.f3879N);
                m4435u1();
            }
        }
    }

    /* renamed from: n0 */
    public int m4506n0() {
        ArrayList<C0798a> arrayList = this.f3883d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n1 */
    public void m4507n1(Fragment fragment, boolean z10) {
        ViewGroup m4430r0 = m4430r0(fragment);
        if (m4430r0 == null || !(m4430r0 instanceof C0806g)) {
            return;
        }
        ((C0806g) m4430r0).setDrawDisappearingViewsLast(!z10);
    }

    /* renamed from: o */
    boolean m4508o() {
        boolean z10 = false;
        for (Fragment fragment : this.f3882c.m4733l()) {
            if (fragment != null) {
                z10 = m4404I0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    public void m4509o1(Fragment fragment, AbstractC0839f.c cVar) {
        if (fragment.equals(m4493h0(fragment.f3826s)) && (fragment.f3788G == null || fragment.f3787F == this)) {
            fragment.f3812e0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: p0 */
    public AbstractC0805f m4510p0() {
        return this.f3898s;
    }

    /* renamed from: p1 */
    public void m4511p1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m4493h0(fragment.f3826s)) || (fragment.f3788G != null && fragment.f3787F != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f3900u;
        this.f3900u = fragment;
        m4405M(fragment2);
        m4405M(this.f3900u);
    }

    /* renamed from: q0 */
    public Fragment m4512q0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m4493h0 = m4493h0(string);
        if (m4493h0 == null) {
            m4434t1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m4493h0;
    }

    /* renamed from: r */
    public final void m4513r(String str) {
        this.f3889j.remove(str);
    }

    /* renamed from: r1 */
    public void m4514r1(Fragment fragment) {
        if (m4403H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3794M) {
            fragment.f3794M = false;
            fragment.f3808a0 = !fragment.f3808a0;
        }
    }

    /* renamed from: s0 */
    public C0808i m4515s0() {
        C0808i c0808i = this.f3901v;
        if (c0808i != null) {
            return c0808i;
        }
        Fragment fragment = this.f3899t;
        if (fragment != null) {
            return fragment.f3787F.m4515s0();
        }
        return this.f3902w;
    }

    /* renamed from: t0 */
    public C0818s m4516t0() {
        return this.f3882c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f3899t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3899t)));
            sb2.append("}");
        } else {
            AbstractC0809j<?> abstractC0809j = this.f3897r;
            if (abstractC0809j != null) {
                sb2.append(abstractC0809j.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3897r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u */
    void m4517u(C0798a c0798a, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            c0798a.m4572z(z12);
        } else {
            c0798a.m4571y();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0798a);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f3896q >= 1) {
            C0820u.m4758B(this.f3897r.m4659g(), this.f3898s, arrayList, arrayList2, 0, 1, true, this.f3893n);
        }
        if (z12) {
            m4466Q0(this.f3896q, true);
        }
        for (Fragment fragment : this.f3882c.m4733l()) {
            if (fragment != null && fragment.f3802U != null && fragment.f3807Z && c0798a.m4553C(fragment.f3792K)) {
                float f10 = fragment.f3809b0;
                if (f10 > 0.0f) {
                    fragment.f3802U.setAlpha(f10);
                }
                if (z12) {
                    fragment.f3809b0 = 0.0f;
                } else {
                    fragment.f3809b0 = -1.0f;
                    fragment.f3807Z = false;
                }
            }
        }
    }

    /* renamed from: u0 */
    public List<Fragment> m4518u0() {
        return this.f3882c.m4735n();
    }

    /* renamed from: v0 */
    public AbstractC0809j<?> m4519v0() {
        return this.f3897r;
    }

    /* renamed from: w */
    public C0816q m4520w(Fragment fragment) {
        C0816q m4734m = this.f3882c.m4734m(fragment.f3826s);
        if (m4734m != null) {
            return m4734m;
        }
        C0816q c0816q = new C0816q(this.f3894o, this.f3882c, fragment);
        c0816q.m4705o(this.f3897r.m4659g().getClassLoader());
        c0816q.m4710u(this.f3896q);
        return c0816q;
    }

    /* renamed from: w0 */
    public LayoutInflater.Factory2 m4521w0() {
        return this.f3885f;
    }

    /* renamed from: x0 */
    public C0811l m4522x0() {
        return this.f3894o;
    }

    /* renamed from: y */
    public void m4523y(Fragment fragment) {
        if (m4403H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f3795N) {
            return;
        }
        fragment.f3795N = true;
        if (fragment.f3832y) {
            if (m4403H0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3882c.m4740s(fragment);
            if (m4404I0(fragment)) {
                this.f3869D = true;
            }
            m4429q1(fragment);
        }
    }

    /* renamed from: y0 */
    public Fragment m4524y0() {
        return this.f3899t;
    }

    /* renamed from: z */
    public void m4525z() {
        this.f3870E = false;
        this.f3871F = false;
        this.f3878M.m4686n(false);
        m4407T(4);
    }

    /* renamed from: z0 */
    public Fragment m4526z0() {
        return this.f3900u;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0780a();

        /* renamed from: n */
        String f3910n;

        /* renamed from: o */
        int f3911o;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        /* loaded from: classes.dex */
        class C0780a implements Parcelable.Creator<LaunchedFragmentInfo> {
            C0780a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(String str, int i10) {
            this.f3910n = str;
            this.f3911o = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3910n);
            parcel.writeInt(this.f3911o);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3910n = parcel.readString();
            this.f3911o = parcel.readInt();
        }
    }
}
