package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0623b;
import androidx.core.view.C0690v;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0687s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p093h0.C3356a;
import p135k1.C3723e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public class C0820u {

    /* renamed from: a */
    private static final int[] f4117a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC0822w f4118b = new C0821v();

    /* renamed from: c */
    static final AbstractC0822w f4119c = m4781w();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ g f4120n;

        /* renamed from: o */
        final /* synthetic */ Fragment f4121o;

        /* renamed from: p */
        final /* synthetic */ C0623b f4122p;

        a(g gVar, Fragment fragment, C0623b c0623b) {
            this.f4120n = gVar;
            this.f4121o = fragment;
            this.f4122p = c0623b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4120n.mo4531a(this.f4121o, this.f4122p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f4123n;

        b(ArrayList arrayList) {
            this.f4123n = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0820u.m4757A(this.f4123n, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ g f4124n;

        /* renamed from: o */
        final /* synthetic */ Fragment f4125o;

        /* renamed from: p */
        final /* synthetic */ C0623b f4126p;

        c(g gVar, Fragment fragment, C0623b c0623b) {
            this.f4124n = gVar;
            this.f4125o = fragment;
            this.f4126p = c0623b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4124n.mo4531a(this.f4125o, this.f4126p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Object f4127n;

        /* renamed from: o */
        final /* synthetic */ AbstractC0822w f4128o;

        /* renamed from: p */
        final /* synthetic */ View f4129p;

        /* renamed from: q */
        final /* synthetic */ Fragment f4130q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f4131r;

        /* renamed from: s */
        final /* synthetic */ ArrayList f4132s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f4133t;

        /* renamed from: u */
        final /* synthetic */ Object f4134u;

        d(Object obj, AbstractC0822w abstractC0822w, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4127n = obj;
            this.f4128o = abstractC0822w;
            this.f4129p = view;
            this.f4130q = fragment;
            this.f4131r = arrayList;
            this.f4132s = arrayList2;
            this.f4133t = arrayList3;
            this.f4134u = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4127n;
            if (obj != null) {
                this.f4128o.mo4795p(obj, this.f4129p);
                this.f4132s.addAll(C0820u.m4769k(this.f4128o, this.f4127n, this.f4130q, this.f4131r, this.f4129p));
            }
            if (this.f4133t != null) {
                if (this.f4134u != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4129p);
                    this.f4128o.mo4796q(this.f4134u, this.f4133t, arrayList);
                }
                this.f4133t.clear();
                this.f4133t.add(this.f4129p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Fragment f4135n;

        /* renamed from: o */
        final /* synthetic */ Fragment f4136o;

        /* renamed from: p */
        final /* synthetic */ boolean f4137p;

        /* renamed from: q */
        final /* synthetic */ C3356a f4138q;

        /* renamed from: r */
        final /* synthetic */ View f4139r;

        /* renamed from: s */
        final /* synthetic */ AbstractC0822w f4140s;

        /* renamed from: t */
        final /* synthetic */ Rect f4141t;

        e(Fragment fragment, Fragment fragment2, boolean z10, C3356a c3356a, View view, AbstractC0822w abstractC0822w, Rect rect) {
            this.f4135n = fragment;
            this.f4136o = fragment2;
            this.f4137p = z10;
            this.f4138q = c3356a;
            this.f4139r = view;
            this.f4140s = abstractC0822w;
            this.f4141t = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0820u.m4764f(this.f4135n, this.f4136o, this.f4137p, this.f4138q, false);
            View view = this.f4139r;
            if (view != null) {
                this.f4140s.m4809k(view, this.f4141t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: n */
        final /* synthetic */ AbstractC0822w f4142n;

        /* renamed from: o */
        final /* synthetic */ C3356a f4143o;

        /* renamed from: p */
        final /* synthetic */ Object f4144p;

        /* renamed from: q */
        final /* synthetic */ h f4145q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f4146r;

        /* renamed from: s */
        final /* synthetic */ View f4147s;

        /* renamed from: t */
        final /* synthetic */ Fragment f4148t;

        /* renamed from: u */
        final /* synthetic */ Fragment f4149u;

        /* renamed from: v */
        final /* synthetic */ boolean f4150v;

        /* renamed from: w */
        final /* synthetic */ ArrayList f4151w;

        /* renamed from: x */
        final /* synthetic */ Object f4152x;

        /* renamed from: y */
        final /* synthetic */ Rect f4153y;

        f(AbstractC0822w abstractC0822w, C3356a c3356a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4142n = abstractC0822w;
            this.f4143o = c3356a;
            this.f4144p = obj;
            this.f4145q = hVar;
            this.f4146r = arrayList;
            this.f4147s = view;
            this.f4148t = fragment;
            this.f4149u = fragment2;
            this.f4150v = z10;
            this.f4151w = arrayList2;
            this.f4152x = obj2;
            this.f4153y = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3356a<String, View> m4766h = C0820u.m4766h(this.f4142n, this.f4143o, this.f4144p, this.f4145q);
            if (m4766h != null) {
                this.f4146r.addAll(m4766h.values());
                this.f4146r.add(this.f4147s);
            }
            C0820u.m4764f(this.f4148t, this.f4149u, this.f4150v, m4766h, false);
            Object obj = this.f4144p;
            if (obj != null) {
                this.f4142n.mo4786A(obj, this.f4151w, this.f4146r);
                View m4777s = C0820u.m4777s(m4766h, this.f4145q, this.f4152x, this.f4150v);
                if (m4777s != null) {
                    this.f4142n.m4809k(m4777s, this.f4153y);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo4531a(Fragment fragment, C0623b c0623b);

        /* renamed from: b */
        void mo4532b(Fragment fragment, C0623b c0623b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public Fragment f4154a;

        /* renamed from: b */
        public boolean f4155b;

        /* renamed from: c */
        public C0798a f4156c;

        /* renamed from: d */
        public Fragment f4157d;

        /* renamed from: e */
        public boolean f4158e;

        /* renamed from: f */
        public C0798a f4159f;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static void m4757A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m4758B(Context context, AbstractC0805f abstractC0805f, ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            C0798a c0798a = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                m4763e(c0798a, sparseArray, z10);
            } else {
                m4761c(c0798a, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                C3356a<String, String> m4762d = m4762d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (abstractC0805f.mo4398d() && (viewGroup = (ViewGroup) abstractC0805f.mo4397c(keyAt)) != null) {
                    if (z10) {
                        m4773o(viewGroup, hVar, view, m4762d, gVar);
                    } else {
                        m4772n(viewGroup, hVar, view, m4762d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4759a(ArrayList<View> arrayList, C3356a<String, View> c3356a, Collection<String> collection) {
        for (int size = c3356a.size() - 1; size >= 0; size--) {
            View m14844m = c3356a.m14844m(size);
            if (collection.contains(C0690v.m3806M(m14844m))) {
                arrayList.add(m14844m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0039, code lost:
    
        if (r0.f3832y != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006e, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x008a, code lost:
    
        if (r0.f3794M == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m4760b(androidx.fragment.app.C0798a r8, androidx.fragment.app.AbstractC0819t.a r9, android.util.SparseArray<androidx.fragment.app.C0820u.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0820u.m4760b(androidx.fragment.app.a, androidx.fragment.app.t$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m4761c(C0798a c0798a, SparseArray<h> sparseArray, boolean z10) {
        int size = c0798a.f4092c.size();
        for (int i10 = 0; i10 < size; i10++) {
            m4760b(c0798a, c0798a.f4092c.get(i10), sparseArray, false, z10);
        }
    }

    /* renamed from: d */
    private static C3356a<String, String> m4762d(int i10, ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C3356a<String, String> c3356a = new C3356a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            C0798a c0798a = arrayList.get(i13);
            if (c0798a.m4553C(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = c0798a.f4105p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0798a.f4105p;
                        arrayList4 = c0798a.f4106q;
                    } else {
                        ArrayList<String> arrayList6 = c0798a.f4105p;
                        arrayList3 = c0798a.f4106q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = c3356a.remove(str2);
                        if (remove != null) {
                            c3356a.put(str, remove);
                        } else {
                            c3356a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c3356a;
    }

    /* renamed from: e */
    public static void m4763e(C0798a c0798a, SparseArray<h> sparseArray, boolean z10) {
        if (c0798a.f3954t.m4510p0().mo4398d()) {
            for (int size = c0798a.f4092c.size() - 1; size >= 0; size--) {
                m4760b(c0798a, c0798a.f4092c.get(size), sparseArray, true, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m4764f(Fragment fragment, Fragment fragment2, boolean z10, C3356a<String, View> c3356a, boolean z11) {
        if (z10) {
            fragment2.m4392z();
        } else {
            fragment.m4392z();
        }
    }

    /* renamed from: g */
    private static boolean m4765g(AbstractC0822w abstractC0822w, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!abstractC0822w.mo4791e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C3356a<String, View> m4766h(AbstractC0822w abstractC0822w, C3356a<String, String> c3356a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f4154a;
        View m4334b0 = fragment.m4334b0();
        if (!c3356a.isEmpty() && obj != null && m4334b0 != null) {
            C3356a<String, View> c3356a2 = new C3356a<>();
            abstractC0822w.m4808j(c3356a2, m4334b0);
            C0798a c0798a = hVar.f4156c;
            if (hVar.f4155b) {
                fragment.m4269C();
                arrayList = c0798a.f4105p;
            } else {
                fragment.m4392z();
                arrayList = c0798a.f4106q;
            }
            if (arrayList != null) {
                c3356a2.m14777o(arrayList);
                c3356a2.m14777o(c3356a.values());
            }
            m4782x(c3356a, c3356a2);
            return c3356a2;
        }
        c3356a.clear();
        return null;
    }

    /* renamed from: i */
    private static C3356a<String, View> m4767i(AbstractC0822w abstractC0822w, C3356a<String, String> c3356a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (!c3356a.isEmpty() && obj != null) {
            Fragment fragment = hVar.f4157d;
            C3356a<String, View> c3356a2 = new C3356a<>();
            abstractC0822w.m4808j(c3356a2, fragment.m4265A1());
            C0798a c0798a = hVar.f4159f;
            if (hVar.f4158e) {
                fragment.m4392z();
                arrayList = c0798a.f4106q;
            } else {
                fragment.m4269C();
                arrayList = c0798a.f4105p;
            }
            if (arrayList != null) {
                c3356a2.m14777o(arrayList);
            }
            c3356a.m14777o(c3356a2.keySet());
            return c3356a2;
        }
        c3356a.clear();
        return null;
    }

    /* renamed from: j */
    private static AbstractC0822w m4768j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m4266B = fragment.m4266B();
            if (m4266B != null) {
                arrayList.add(m4266B);
            }
            Object m4313S = fragment.m4313S();
            if (m4313S != null) {
                arrayList.add(m4313S);
            }
            Object m4321V = fragment.m4321V();
            if (m4321V != null) {
                arrayList.add(m4321V);
            }
        }
        if (fragment2 != null) {
            Object m4389y = fragment2.m4389y();
            if (m4389y != null) {
                arrayList.add(m4389y);
            }
            Object m4304P = fragment2.m4304P();
            if (m4304P != null) {
                arrayList.add(m4304P);
            }
            Object m4316T = fragment2.m4316T();
            if (m4316T != null) {
                arrayList.add(m4316T);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0822w abstractC0822w = f4118b;
        if (abstractC0822w != null && m4765g(abstractC0822w, arrayList)) {
            return abstractC0822w;
        }
        AbstractC0822w abstractC0822w2 = f4119c;
        if (abstractC0822w2 != null && m4765g(abstractC0822w2, arrayList)) {
            return abstractC0822w2;
        }
        if (abstractC0822w == null && abstractC0822w2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m4769k(AbstractC0822w abstractC0822w, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View m4334b0 = fragment.m4334b0();
        if (m4334b0 != null) {
            abstractC0822w.m4807f(arrayList2, m4334b0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0822w.mo4789b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m4770l(AbstractC0822w abstractC0822w, ViewGroup viewGroup, View view, C3356a<String, String> c3356a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m4778t;
        C3356a<String, String> c3356a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f4154a;
        Fragment fragment2 = hVar.f4157d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f4155b;
        if (c3356a.isEmpty()) {
            c3356a2 = c3356a;
            m4778t = null;
        } else {
            m4778t = m4778t(abstractC0822w, fragment, fragment2, z10);
            c3356a2 = c3356a;
        }
        C3356a<String, View> m4767i = m4767i(abstractC0822w, c3356a2, m4778t, hVar);
        if (c3356a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m4767i.values());
            obj3 = m4778t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4764f(fragment, fragment2, z10, m4767i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0822w.mo4802z(obj3, view, arrayList);
            m4784z(abstractC0822w, obj3, obj2, m4767i, hVar.f4158e, hVar.f4159f);
            if (obj != null) {
                abstractC0822w.mo4799u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(viewGroup, new f(abstractC0822w, c3356a, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m4771m(AbstractC0822w abstractC0822w, ViewGroup viewGroup, View view, C3356a<String, String> c3356a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f4154a;
        Fragment fragment2 = hVar.f4157d;
        if (fragment != null) {
            fragment.m4265A1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f4155b;
        Object m4778t = c3356a.isEmpty() ? null : m4778t(abstractC0822w, fragment, fragment2, z10);
        C3356a<String, View> m4767i = m4767i(abstractC0822w, c3356a, m4778t, hVar);
        C3356a<String, View> m4766h = m4766h(abstractC0822w, c3356a, m4778t, hVar);
        if (c3356a.isEmpty()) {
            if (m4767i != null) {
                m4767i.clear();
            }
            if (m4766h != null) {
                m4766h.clear();
            }
            obj3 = null;
        } else {
            m4759a(arrayList, m4767i, c3356a.keySet());
            m4759a(arrayList2, m4766h, c3356a.values());
            obj3 = m4778t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4764f(fragment, fragment2, z10, m4767i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0822w.mo4802z(obj3, view, arrayList);
            m4784z(abstractC0822w, obj3, obj2, m4767i, hVar.f4158e, hVar.f4159f);
            Rect rect2 = new Rect();
            View m4777s = m4777s(m4766h, hVar, obj, z10);
            if (m4777s != null) {
                abstractC0822w.mo4799u(obj, rect2);
            }
            rect = rect2;
            view2 = m4777s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(viewGroup, new e(fragment, fragment2, z10, m4766h, view2, abstractC0822w, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m4772n(ViewGroup viewGroup, h hVar, View view, C3356a<String, String> c3356a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f4154a;
        Fragment fragment2 = hVar.f4157d;
        AbstractC0822w m4768j = m4768j(fragment2, fragment);
        if (m4768j == null) {
            return;
        }
        boolean z10 = hVar.f4155b;
        boolean z11 = hVar.f4158e;
        Object m4775q = m4775q(m4768j, fragment, z10);
        Object m4776r = m4776r(m4768j, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m4770l = m4770l(m4768j, viewGroup, view, c3356a, hVar, arrayList, arrayList2, m4775q, m4776r);
        if (m4775q == null && m4770l == null) {
            obj = m4776r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m4776r;
        }
        ArrayList<View> m4769k = m4769k(m4768j, obj, fragment2, arrayList, view);
        if (m4769k == null || m4769k.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        m4768j.mo4788a(m4775q, view);
        Object m4779u = m4779u(m4768j, m4775q, obj2, m4770l, fragment, hVar.f4155b);
        if (fragment2 != null && m4769k != null && (m4769k.size() > 0 || arrayList.size() > 0)) {
            C0623b c0623b = new C0623b();
            gVar.mo4532b(fragment2, c0623b);
            m4768j.mo4801w(fragment2, m4779u, c0623b, new c(gVar, fragment2, c0623b));
        }
        if (m4779u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m4768j.mo4798t(m4779u, m4775q, arrayList3, obj2, m4769k, m4770l, arrayList2);
            m4783y(m4768j, viewGroup, fragment, view, arrayList2, m4775q, arrayList3, obj2, m4769k);
            m4768j.m4812x(viewGroup, arrayList2, c3356a);
            m4768j.mo4790c(viewGroup, m4779u);
            m4768j.m4811s(viewGroup, arrayList2, c3356a);
        }
    }

    /* renamed from: o */
    private static void m4773o(ViewGroup viewGroup, h hVar, View view, C3356a<String, String> c3356a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f4154a;
        Fragment fragment2 = hVar.f4157d;
        AbstractC0822w m4768j = m4768j(fragment2, fragment);
        if (m4768j == null) {
            return;
        }
        boolean z10 = hVar.f4155b;
        boolean z11 = hVar.f4158e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m4775q = m4775q(m4768j, fragment, z10);
        Object m4776r = m4776r(m4768j, fragment2, z11);
        Object m4771m = m4771m(m4768j, viewGroup, view, c3356a, hVar, arrayList2, arrayList, m4775q, m4776r);
        if (m4775q == null && m4771m == null) {
            obj = m4776r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m4776r;
        }
        ArrayList<View> m4769k = m4769k(m4768j, obj, fragment2, arrayList2, view);
        ArrayList<View> m4769k2 = m4769k(m4768j, m4775q, fragment, arrayList, view);
        m4757A(m4769k2, 4);
        Object m4779u = m4779u(m4768j, m4775q, obj, m4771m, fragment, z10);
        if (fragment2 != null && m4769k != null && (m4769k.size() > 0 || arrayList2.size() > 0)) {
            C0623b c0623b = new C0623b();
            gVar.mo4532b(fragment2, c0623b);
            m4768j.mo4801w(fragment2, m4779u, c0623b, new a(gVar, fragment2, c0623b));
        }
        if (m4779u != null) {
            m4780v(m4768j, obj, fragment2, m4769k);
            ArrayList<String> m4810o = m4768j.m4810o(arrayList);
            m4768j.mo4798t(m4779u, m4775q, m4769k2, obj, m4769k, m4771m, arrayList);
            m4768j.mo4790c(viewGroup, m4779u);
            m4768j.m4813y(viewGroup, arrayList2, arrayList, m4810o, c3356a);
            m4757A(m4769k2, 0);
            m4768j.mo4786A(m4771m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static h m4774p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m4775q(AbstractC0822w abstractC0822w, Fragment fragment, boolean z10) {
        Object m4389y;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            m4389y = fragment.m4304P();
        } else {
            m4389y = fragment.m4389y();
        }
        return abstractC0822w.mo4792g(m4389y);
    }

    /* renamed from: r */
    private static Object m4776r(AbstractC0822w abstractC0822w, Fragment fragment, boolean z10) {
        Object m4266B;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            m4266B = fragment.m4313S();
        } else {
            m4266B = fragment.m4266B();
        }
        return abstractC0822w.mo4792g(m4266B);
    }

    /* renamed from: s */
    static View m4777s(C3356a<String, View> c3356a, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        String str;
        C0798a c0798a = hVar.f4156c;
        if (obj == null || c3356a == null || (arrayList = c0798a.f4105p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            str = c0798a.f4105p.get(0);
        } else {
            str = c0798a.f4106q.get(0);
        }
        return c3356a.get(str);
    }

    /* renamed from: t */
    private static Object m4778t(AbstractC0822w abstractC0822w, Fragment fragment, Fragment fragment2, boolean z10) {
        Object m4316T;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z10) {
            m4316T = fragment2.m4321V();
        } else {
            m4316T = fragment.m4316T();
        }
        return abstractC0822w.mo4787B(abstractC0822w.mo4792g(m4316T));
    }

    /* renamed from: u */
    private static Object m4779u(AbstractC0822w abstractC0822w, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        boolean z11;
        if (obj == null || obj2 == null || fragment == null) {
            z11 = true;
        } else if (z10) {
            z11 = fragment.m4369r();
        } else {
            z11 = fragment.m4366q();
        }
        if (z11) {
            return abstractC0822w.mo4794n(obj2, obj, obj3);
        }
        return abstractC0822w.mo4793m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m4780v(AbstractC0822w abstractC0822w, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3832y && fragment.f3794M && fragment.f3808a0) {
            fragment.m4288J1(true);
            abstractC0822w.mo4797r(obj, fragment.m4334b0(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0687s.m3776a(fragment.f3801T, new b(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC0822w m4781w() {
        try {
            return (AbstractC0822w) C3723e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m4782x(C3356a<String, String> c3356a, C3356a<String, View> c3356a2) {
        for (int size = c3356a.size() - 1; size >= 0; size--) {
            if (!c3356a2.containsKey(c3356a.m14844m(size))) {
                c3356a.m14842k(size);
            }
        }
    }

    /* renamed from: y */
    private static void m4783y(AbstractC0822w abstractC0822w, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(viewGroup, new d(obj, abstractC0822w, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m4784z(AbstractC0822w abstractC0822w, Object obj, Object obj2, C3356a<String, View> c3356a, boolean z10, C0798a c0798a) {
        String str;
        ArrayList<String> arrayList = c0798a.f4105p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z10) {
            str = c0798a.f4106q.get(0);
        } else {
            str = c0798a.f4105p.get(0);
        }
        View view = c3356a.get(str);
        abstractC0822w.mo4800v(obj, view);
        if (obj2 != null) {
            abstractC0822w.mo4800v(obj2, view);
        }
    }
}
