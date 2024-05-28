package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0623b;
import androidx.core.view.C0690v;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p015b1.C0967b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public abstract class AbstractC0825z {

    /* renamed from: a */
    private final ViewGroup f4194a;

    /* renamed from: b */
    final ArrayList<e> f4195b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<e> f4196c = new ArrayList<>();

    /* renamed from: d */
    boolean f4197d = false;

    /* renamed from: e */
    boolean f4198e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.z$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ d f4199n;

        a(d dVar) {
            this.f4199n = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0825z.this.f4195b.contains(this.f4199n)) {
                this.f4199n.m4843e().m4852b(this.f4199n.m4844f().f3802U);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.z$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ d f4201n;

        b(d dVar) {
            this.f4201n = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0825z.this.f4195b.remove(this.f4201n);
            AbstractC0825z.this.f4196c.remove(this.f4201n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.z$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4203a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4204b;

        static {
            int[] iArr = new int[e.b.values().length];
            f4204b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4204b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4204b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f4203a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4203a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4203a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4203a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.z$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h */
        private final C0816q f4205h;

        d(e.c cVar, e.b bVar, C0816q c0816q, C0623b c0623b) {
            super(cVar, bVar, c0816q.m4702k(), c0623b);
            this.f4205h = c0816q;
        }

        @Override // androidx.fragment.app.AbstractC0825z.e
        /* renamed from: c */
        public void mo4838c() {
            super.mo4838c();
            this.f4205h.m4703m();
        }

        @Override // androidx.fragment.app.AbstractC0825z.e
        /* renamed from: l */
        void mo4839l() {
            if (m4845g() == e.b.ADDING) {
                Fragment m4702k = this.f4205h.m4702k();
                View findFocus = m4702k.f3802U.findFocus();
                if (findFocus != null) {
                    m4702k.m4285I1(findFocus);
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m4702k);
                    }
                }
                View m4265A1 = m4844f().m4265A1();
                if (m4265A1.getParent() == null) {
                    this.f4205h.m4693b();
                    m4265A1.setAlpha(0.0f);
                }
                if (m4265A1.getAlpha() == 0.0f && m4265A1.getVisibility() == 0) {
                    m4265A1.setVisibility(4);
                }
                m4265A1.setAlpha(m4702k.m4301O());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.z$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private c f4206a;

        /* renamed from: b */
        private b f4207b;

        /* renamed from: c */
        private final Fragment f4208c;

        /* renamed from: d */
        private final List<Runnable> f4209d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0623b> f4210e = new HashSet<>();

        /* renamed from: f */
        private boolean f4211f = false;

        /* renamed from: g */
        private boolean f4212g = false;

        /* renamed from: androidx.fragment.app.z$e$a */
        /* loaded from: classes.dex */
        class a implements C0623b.b {
            a() {
            }

            @Override // androidx.core.os.C0623b.b
            /* renamed from: a */
            public void mo3342a() {
                e.this.m4841b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.z$e$b */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.z$e$c */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: c */
            public static c m4850c(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: d */
            public static c m4851d(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m4850c(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: b */
            public void m4852b(View view) {
                int i10 = c.f4203a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m4403H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.m4403H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, C0623b c0623b) {
            this.f4206a = cVar;
            this.f4207b = bVar;
            this.f4208c = fragment;
            c0623b.m3339c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m4840a(Runnable runnable) {
            this.f4209d.add(runnable);
        }

        /* renamed from: b */
        final void m4841b() {
            if (m4846h()) {
                return;
            }
            this.f4211f = true;
            if (this.f4210e.isEmpty()) {
                mo4838c();
                return;
            }
            Iterator it = new ArrayList(this.f4210e).iterator();
            while (it.hasNext()) {
                ((C0623b) it.next()).m3337a();
            }
        }

        /* renamed from: c */
        public void mo4838c() {
            if (this.f4212g) {
                return;
            }
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4212g = true;
            Iterator<Runnable> it = this.f4209d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: d */
        public final void m4842d(C0623b c0623b) {
            if (this.f4210e.remove(c0623b) && this.f4210e.isEmpty()) {
                mo4838c();
            }
        }

        /* renamed from: e */
        public c m4843e() {
            return this.f4206a;
        }

        /* renamed from: f */
        public final Fragment m4844f() {
            return this.f4208c;
        }

        /* renamed from: g */
        b m4845g() {
            return this.f4207b;
        }

        /* renamed from: h */
        final boolean m4846h() {
            return this.f4211f;
        }

        /* renamed from: i */
        final boolean m4847i() {
            return this.f4212g;
        }

        /* renamed from: j */
        public final void m4848j(C0623b c0623b) {
            mo4839l();
            this.f4210e.add(c0623b);
        }

        /* renamed from: k */
        final void m4849k(c cVar, b bVar) {
            int i10 = c.f4204b[bVar.ordinal()];
            if (i10 == 1) {
                if (this.f4206a == c.REMOVED) {
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4208c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4207b + " to ADDING.");
                    }
                    this.f4206a = c.VISIBLE;
                    this.f4207b = b.ADDING;
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 == 3 && this.f4206a != c.REMOVED) {
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4208c + " mFinalState = " + this.f4206a + " -> " + cVar + ". ");
                    }
                    this.f4206a = cVar;
                    return;
                }
                return;
            }
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4208c + " mFinalState = " + this.f4206a + " -> REMOVED. mLifecycleImpact  = " + this.f4207b + " to REMOVING.");
            }
            this.f4206a = c.REMOVED;
            this.f4207b = b.REMOVING;
        }

        /* renamed from: l */
        void mo4839l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4206a + "} {mLifecycleImpact = " + this.f4207b + "} {mFragment = " + this.f4208c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0825z(ViewGroup viewGroup) {
        this.f4194a = viewGroup;
    }

    /* renamed from: a */
    private void m4821a(e.c cVar, e.b bVar, C0816q c0816q) {
        synchronized (this.f4195b) {
            C0623b c0623b = new C0623b();
            e m4822h = m4822h(c0816q.m4702k());
            if (m4822h != null) {
                m4822h.m4849k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0816q, c0623b);
            this.f4195b.add(dVar);
            dVar.m4840a(new a(dVar));
            dVar.m4840a(new b(dVar));
        }
    }

    /* renamed from: h */
    private e m4822h(Fragment fragment) {
        Iterator<e> it = this.f4195b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m4844f().equals(fragment) && !next.m4846h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private e m4823i(Fragment fragment) {
        Iterator<e> it = this.f4196c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m4844f().equals(fragment) && !next.m4846h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC0825z m4824n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m4825o(viewGroup, fragmentManager.m4439A0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static AbstractC0825z m4825o(ViewGroup viewGroup, InterfaceC0799a0 interfaceC0799a0) {
        int i10 = C0967b.f5126b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof AbstractC0825z) {
            return (AbstractC0825z) tag;
        }
        AbstractC0825z mo4534a = interfaceC0799a0.mo4534a(viewGroup);
        viewGroup.setTag(i10, mo4534a);
        return mo4534a;
    }

    /* renamed from: q */
    private void m4826q() {
        Iterator<e> it = this.f4195b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m4845g() == e.b.ADDING) {
                next.m4849k(e.c.m4850c(next.m4844f().m4265A1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4827b(e.c cVar, C0816q c0816q) {
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0816q.m4702k());
        }
        m4821a(cVar, e.b.ADDING, c0816q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4828c(C0816q c0816q) {
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0816q.m4702k());
        }
        m4821a(e.c.GONE, e.b.NONE, c0816q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m4829d(C0816q c0816q) {
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0816q.m4702k());
        }
        m4821a(e.c.REMOVED, e.b.REMOVING, c0816q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4830e(C0816q c0816q) {
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0816q.m4702k());
        }
        m4821a(e.c.VISIBLE, e.b.NONE, c0816q);
    }

    /* renamed from: f */
    abstract void mo4575f(List<e> list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m4831g() {
        if (this.f4198e) {
            return;
        }
        if (!C0690v.m3813T(this.f4194a)) {
            m4832j();
            this.f4197d = false;
            return;
        }
        synchronized (this.f4195b) {
            if (!this.f4195b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4196c);
                this.f4196c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m4841b();
                    if (!eVar.m4847i()) {
                        this.f4196c.add(eVar);
                    }
                }
                m4826q();
                ArrayList arrayList2 = new ArrayList(this.f4195b);
                this.f4195b.clear();
                this.f4196c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo4839l();
                }
                mo4575f(arrayList2, this.f4197d);
                this.f4197d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4832j() {
        String str;
        String str2;
        boolean m3813T = C0690v.m3813T(this.f4194a);
        synchronized (this.f4195b) {
            m4826q();
            Iterator<e> it = this.f4195b.iterator();
            while (it.hasNext()) {
                it.next().mo4839l();
            }
            Iterator it2 = new ArrayList(this.f4196c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.m4403H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m3813T) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f4194a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.m4841b();
            }
            Iterator it3 = new ArrayList(this.f4195b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.m4403H0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m3813T) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f4194a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.m4841b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m4833k() {
        if (this.f4198e) {
            this.f4198e = false;
            m4831g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public e.b m4834l(C0816q c0816q) {
        e m4822h = m4822h(c0816q.m4702k());
        e.b m4845g = m4822h != null ? m4822h.m4845g() : null;
        e m4823i = m4823i(c0816q.m4702k());
        return (m4823i == null || !(m4845g == null || m4845g == e.b.NONE)) ? m4845g : m4823i.m4845g();
    }

    /* renamed from: m */
    public ViewGroup m4835m() {
        return this.f4194a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m4836p() {
        synchronized (this.f4195b) {
            m4826q();
            this.f4198e = false;
            int size = this.f4195b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f4195b.get(size);
                e.c m4851d = e.c.m4851d(eVar.m4844f().f3802U);
                e.c m4843e = eVar.m4843e();
                e.c cVar = e.c.VISIBLE;
                if (m4843e == cVar && m4851d != cVar) {
                    this.f4198e = eVar.m4844f().m4356m0();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m4837r(boolean z10) {
        this.f4197d = z10;
    }
}
