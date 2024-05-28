package androidx.coordinatorlayout.widget;

import androidx.core.util.C0652f;
import androidx.core.util.InterfaceC0651e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p093h0.C3362g;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0565a<T> {

    /* renamed from: a */
    private final InterfaceC0651e<ArrayList<T>> f3042a = new C0652f(10);

    /* renamed from: b */
    private final C3362g<T, ArrayList<T>> f3043b = new C3362g<>();

    /* renamed from: c */
    private final ArrayList<T> f3044c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3045d = new HashSet<>();

    /* renamed from: e */
    private void m2709e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (!hashSet.contains(t10)) {
            hashSet.add(t10);
            ArrayList<T> arrayList2 = this.f3043b.get(t10);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m2709e(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(t10);
            arrayList.add(t10);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    private ArrayList<T> m2710f() {
        ArrayList<T> mo3460b = this.f3042a.mo3460b();
        return mo3460b == null ? new ArrayList<>() : mo3460b;
    }

    /* renamed from: k */
    private void m2711k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3042a.mo3459a(arrayList);
    }

    /* renamed from: a */
    public void m2712a(T t10, T t11) {
        if (this.f3043b.containsKey(t10) && this.f3043b.containsKey(t11)) {
            ArrayList<T> arrayList = this.f3043b.get(t10);
            if (arrayList == null) {
                arrayList = m2710f();
                this.f3043b.put(t10, arrayList);
            }
            arrayList.add(t11);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m2713b(T t10) {
        if (this.f3043b.containsKey(t10)) {
            return;
        }
        this.f3043b.put(t10, null);
    }

    /* renamed from: c */
    public void m2714c() {
        int size = this.f3043b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m14844m = this.f3043b.m14844m(i10);
            if (m14844m != null) {
                m2711k(m14844m);
            }
        }
        this.f3043b.clear();
    }

    /* renamed from: d */
    public boolean m2715d(T t10) {
        return this.f3043b.containsKey(t10);
    }

    /* renamed from: g */
    public List m2716g(T t10) {
        return this.f3043b.get(t10);
    }

    /* renamed from: h */
    public List<T> m2717h(T t10) {
        int size = this.f3043b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m14844m = this.f3043b.m14844m(i10);
            if (m14844m != null && m14844m.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3043b.m14840i(i10));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m2718i() {
        this.f3044c.clear();
        this.f3045d.clear();
        int size = this.f3043b.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2709e(this.f3043b.m14840i(i10), this.f3044c, this.f3045d);
        }
        return this.f3044c;
    }

    /* renamed from: j */
    public boolean m2719j(T t10) {
        int size = this.f3043b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m14844m = this.f3043b.m14844m(i10);
            if (m14844m != null && m14844m.contains(t10)) {
                return true;
            }
        }
        return false;
    }
}
