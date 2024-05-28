package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0856w;
import androidx.lifecycle.C0857x;
import androidx.lifecycle.C0858y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public final class C0813n extends AbstractC0856w {

    /* renamed from: j */
    private static final C0857x.a f4064j = new a();

    /* renamed from: f */
    private final boolean f4068f;

    /* renamed from: c */
    private final HashMap<String, Fragment> f4065c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0813n> f4066d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0858y> f4067e = new HashMap<>();

    /* renamed from: g */
    private boolean f4069g = false;

    /* renamed from: h */
    private boolean f4070h = false;

    /* renamed from: i */
    private boolean f4071i = false;

    /* renamed from: androidx.fragment.app.n$a */
    /* loaded from: classes.dex */
    class a implements C0857x.a {
        a() {
        }

        @Override // androidx.lifecycle.C0857x.a
        /* renamed from: a */
        public <T extends AbstractC0856w> T mo4688a(Class<T> cls) {
            return new C0813n(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0813n(boolean z10) {
        this.f4068f = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C0813n m4676i(C0858y c0858y) {
        return (C0813n) new C0857x(c0858y, f4064j).m4947a(C0813n.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0856w
    /* renamed from: d */
    public void mo4677d() {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4069g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4678e(Fragment fragment) {
        if (this.f4071i) {
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4065c.containsKey(fragment.f3826s)) {
                return;
            }
            this.f4065c.put(fragment.f3826s, fragment);
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0813n.class != obj.getClass()) {
            return false;
        }
        C0813n c0813n = (C0813n) obj;
        return this.f4065c.equals(c0813n.f4065c) && this.f4066d.equals(c0813n.f4066d) && this.f4067e.equals(c0813n.f4067e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m4679f(Fragment fragment) {
        if (FragmentManager.m4403H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0813n c0813n = this.f4066d.get(fragment.f3826s);
        if (c0813n != null) {
            c0813n.mo4677d();
            this.f4066d.remove(fragment.f3826s);
        }
        C0858y c0858y = this.f4067e.get(fragment.f3826s);
        if (c0858y != null) {
            c0858y.m4951a();
            this.f4067e.remove(fragment.f3826s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m4680g(String str) {
        return this.f4065c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C0813n m4681h(Fragment fragment) {
        C0813n c0813n = this.f4066d.get(fragment.f3826s);
        if (c0813n != null) {
            return c0813n;
        }
        C0813n c0813n2 = new C0813n(this.f4068f);
        this.f4066d.put(fragment.f3826s, c0813n2);
        return c0813n2;
    }

    public int hashCode() {
        return (((this.f4065c.hashCode() * 31) + this.f4066d.hashCode()) * 31) + this.f4067e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<Fragment> m4682j() {
        return new ArrayList(this.f4065c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C0858y m4683k(Fragment fragment) {
        C0858y c0858y = this.f4067e.get(fragment.f3826s);
        if (c0858y != null) {
            return c0858y;
        }
        C0858y c0858y2 = new C0858y();
        this.f4067e.put(fragment.f3826s, c0858y2);
        return c0858y2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m4684l() {
        return this.f4069g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m4685m(Fragment fragment) {
        if (this.f4071i) {
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4065c.remove(fragment.f3826s) != null) && FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m4686n(boolean z10) {
        this.f4071i = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m4687o(Fragment fragment) {
        if (!this.f4065c.containsKey(fragment.f3826s)) {
            return true;
        }
        if (this.f4068f) {
            return this.f4069g;
        }
        return !this.f4070h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4065c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4066d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4067e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
