package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public class C0818s {

    /* renamed from: a */
    private final ArrayList<Fragment> f4087a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0816q> f4088b = new HashMap<>();

    /* renamed from: c */
    private C0813n f4089c;

    /* renamed from: a */
    public void m4722a(Fragment fragment) {
        if (!this.f4087a.contains(fragment)) {
            synchronized (this.f4087a) {
                this.f4087a.add(fragment);
            }
            fragment.f3832y = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void m4723b() {
        this.f4088b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m4724c(String str) {
        return this.f4088b.get(str) != null;
    }

    /* renamed from: d */
    public void m4725d(int i10) {
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null) {
                c0816q.m4710u(i10);
            }
        }
    }

    /* renamed from: e */
    public void m4726e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4088b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0816q c0816q : this.f4088b.values()) {
                printWriter.print(str);
                if (c0816q != null) {
                    Fragment m4702k = c0816q.m4702k();
                    printWriter.println(m4702k);
                    m4702k.mo4349j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4087a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f4087a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m4727f(String str) {
        C0816q c0816q = this.f4088b.get(str);
        if (c0816q != null) {
            return c0816q.m4702k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m4728g(int i10) {
        for (int size = this.f4087a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4087a.get(size);
            if (fragment != null && fragment.f3791J == i10) {
                return fragment;
            }
        }
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null) {
                Fragment m4702k = c0816q.m4702k();
                if (m4702k.f3791J == i10) {
                    return m4702k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m4729h(String str) {
        if (str != null) {
            for (int size = this.f4087a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4087a.get(size);
                if (fragment != null && str.equals(fragment.f3793L)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null) {
                Fragment m4702k = c0816q.m4702k();
                if (str.equals(m4702k.f3793L)) {
                    return m4702k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m4730i(String str) {
        Fragment m4360o;
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null && (m4360o = c0816q.m4702k().m4360o(str)) != null) {
                return m4360o;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m4731j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f3801T;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4087a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f4087a.get(i10);
            if (fragment2.f3801T == viewGroup && (view2 = fragment2.f3802U) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4087a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4087a.get(indexOf);
            if (fragment3.f3801T == viewGroup && (view = fragment3.f3802U) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List<C0816q> m4732k() {
        ArrayList arrayList = new ArrayList();
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null) {
                arrayList.add(c0816q);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<Fragment> m4733l() {
        ArrayList arrayList = new ArrayList();
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null) {
                arrayList.add(c0816q.m4702k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public C0816q m4734m(String str) {
        return this.f4088b.get(str);
    }

    /* renamed from: n */
    public List<Fragment> m4735n() {
        ArrayList arrayList;
        if (this.f4087a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4087a) {
            arrayList = new ArrayList(this.f4087a);
        }
        return arrayList;
    }

    /* renamed from: o */
    public C0813n m4736o() {
        return this.f4089c;
    }

    /* renamed from: p */
    public void m4737p(C0816q c0816q) {
        Fragment m4702k = c0816q.m4702k();
        if (m4724c(m4702k.f3826s)) {
            return;
        }
        this.f4088b.put(m4702k.f3826s, c0816q);
        if (m4702k.f3797P) {
            if (m4702k.f3796O) {
                this.f4089c.m4678e(m4702k);
            } else {
                this.f4089c.m4685m(m4702k);
            }
            m4702k.f3797P = false;
        }
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m4702k);
        }
    }

    /* renamed from: q */
    public void m4738q(C0816q c0816q) {
        Fragment m4702k = c0816q.m4702k();
        if (m4702k.f3796O) {
            this.f4089c.m4685m(m4702k);
        }
        if (this.f4088b.put(m4702k.f3826s, null) != null && FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m4702k);
        }
    }

    /* renamed from: r */
    public void m4739r() {
        Iterator<Fragment> it = this.f4087a.iterator();
        while (it.hasNext()) {
            C0816q c0816q = this.f4088b.get(it.next().f3826s);
            if (c0816q != null) {
                c0816q.m4703m();
            }
        }
        for (C0816q c0816q2 : this.f4088b.values()) {
            if (c0816q2 != null) {
                c0816q2.m4703m();
                Fragment m4702k = c0816q2.m4702k();
                if (m4702k.f3833z && !m4702k.m4352k0()) {
                    m4738q(c0816q2);
                }
            }
        }
    }

    /* renamed from: s */
    public void m4740s(Fragment fragment) {
        synchronized (this.f4087a) {
            this.f4087a.remove(fragment);
        }
        fragment.f3832y = false;
    }

    /* renamed from: t */
    public void m4741t() {
        this.f4088b.clear();
    }

    /* renamed from: u */
    public void m4742u(List<String> list) {
        this.f4087a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m4727f = m4727f(str);
                if (m4727f != null) {
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m4727f);
                    }
                    m4722a(m4727f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* renamed from: v */
    public ArrayList<FragmentState> m4743v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f4088b.size());
        for (C0816q c0816q : this.f4088b.values()) {
            if (c0816q != null) {
                Fragment m4702k = c0816q.m4702k();
                FragmentState m4708s = c0816q.m4708s();
                arrayList.add(m4708s);
                if (FragmentManager.m4403H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m4702k + ": " + m4708s.f3953z);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public ArrayList<String> m4744w() {
        synchronized (this.f4087a) {
            if (this.f4087a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4087a.size());
            Iterator<Fragment> it = this.f4087a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f3826s);
                if (FragmentManager.m4403H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f3826s + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: x */
    public void m4745x(C0813n c0813n) {
        this.f4089c = c0813n;
    }
}
