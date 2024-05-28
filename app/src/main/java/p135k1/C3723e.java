package p135k1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0822w;
import java.util.ArrayList;
import java.util.List;
import p135k1.AbstractC3734l;

@SuppressLint({"RestrictedApi"})
/* renamed from: k1.e */
/* loaded from: classes.dex */
public class C3723e extends AbstractC0822w {

    /* renamed from: k1.e$a */
    /* loaded from: classes.dex */
    class a extends AbstractC3734l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f15615a;

        a(Rect rect) {
            this.f15615a = rect;
        }
    }

    /* renamed from: k1.e$b */
    /* loaded from: classes.dex */
    class b implements AbstractC3734l.f {

        /* renamed from: a */
        final /* synthetic */ View f15617a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f15618b;

        b(View view, ArrayList arrayList) {
            this.f15617a = view;
            this.f15618b = arrayList;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: a */
        public void mo15831a(AbstractC3734l abstractC3734l) {
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            abstractC3734l.mo15887Z(this);
            this.f15617a.setVisibility(8);
            int size = this.f15618b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f15618b.get(i10)).setVisibility(0);
            }
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: c */
        public void mo15846c(AbstractC3734l abstractC3734l) {
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: d */
        public void mo15833d(AbstractC3734l abstractC3734l) {
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: e */
        public void mo15834e(AbstractC3734l abstractC3734l) {
        }
    }

    /* renamed from: k1.e$c */
    /* loaded from: classes.dex */
    class c extends C3735m {

        /* renamed from: a */
        final /* synthetic */ Object f15620a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f15621b;

        /* renamed from: c */
        final /* synthetic */ Object f15622c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f15623d;

        /* renamed from: e */
        final /* synthetic */ Object f15624e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f15625f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f15620a = obj;
            this.f15621b = arrayList;
            this.f15622c = obj2;
            this.f15623d = arrayList2;
            this.f15624e = obj3;
            this.f15625f = arrayList3;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            abstractC3734l.mo15887Z(this);
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: c */
        public void mo15846c(AbstractC3734l abstractC3734l) {
            Object obj = this.f15620a;
            if (obj != null) {
                C3723e.this.mo4796q(obj, this.f15621b, null);
            }
            Object obj2 = this.f15622c;
            if (obj2 != null) {
                C3723e.this.mo4796q(obj2, this.f15623d, null);
            }
            Object obj3 = this.f15624e;
            if (obj3 != null) {
                C3723e.this.mo4796q(obj3, this.f15625f, null);
            }
        }
    }

    /* renamed from: k1.e$d */
    /* loaded from: classes.dex */
    class d extends AbstractC3734l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f15627a;

        d(Rect rect) {
            this.f15627a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m15845C(AbstractC3734l abstractC3734l) {
        return (AbstractC0822w.m4806l(abstractC3734l.m15879E()) && AbstractC0822w.m4806l(abstractC3734l.m15880F()) && AbstractC0822w.m4806l(abstractC3734l.m15881G())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: A */
    public void mo4786A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C3738p c3738p = (C3738p) obj;
        if (c3738p != null) {
            c3738p.m15882H().clear();
            c3738p.m15882H().addAll(arrayList2);
            mo4796q(c3738p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: B */
    public Object mo4787B(Object obj) {
        if (obj == null) {
            return null;
        }
        C3738p c3738p = new C3738p();
        c3738p.m15922o0((AbstractC3734l) obj);
        return c3738p;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: a */
    public void mo4788a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3734l) obj).mo15891d(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: b */
    public void mo4789b(Object obj, ArrayList<View> arrayList) {
        AbstractC3734l abstractC3734l = (AbstractC3734l) obj;
        if (abstractC3734l == null) {
            return;
        }
        int i10 = 0;
        if (abstractC3734l instanceof C3738p) {
            C3738p c3738p = (C3738p) abstractC3734l;
            int m15924r0 = c3738p.m15924r0();
            while (i10 < m15924r0) {
                mo4789b(c3738p.m15923q0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m15845C(abstractC3734l) || !AbstractC0822w.m4806l(abstractC3734l.m15882H())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC3734l.mo15891d(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: c */
    public void mo4790c(ViewGroup viewGroup, Object obj) {
        C3736n.m15913a(viewGroup, (AbstractC3734l) obj);
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: e */
    public boolean mo4791e(Object obj) {
        return obj instanceof AbstractC3734l;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: g */
    public Object mo4792g(Object obj) {
        if (obj != null) {
            return ((AbstractC3734l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: m */
    public Object mo4793m(Object obj, Object obj2, Object obj3) {
        AbstractC3734l abstractC3734l = (AbstractC3734l) obj;
        AbstractC3734l abstractC3734l2 = (AbstractC3734l) obj2;
        AbstractC3734l abstractC3734l3 = (AbstractC3734l) obj3;
        if (abstractC3734l != null && abstractC3734l2 != null) {
            abstractC3734l = new C3738p().m15922o0(abstractC3734l).m15922o0(abstractC3734l2).m15929w0(1);
        } else if (abstractC3734l == null) {
            abstractC3734l = abstractC3734l2 != null ? abstractC3734l2 : null;
        }
        if (abstractC3734l3 == null) {
            return abstractC3734l;
        }
        C3738p c3738p = new C3738p();
        if (abstractC3734l != null) {
            c3738p.m15922o0(abstractC3734l);
        }
        c3738p.m15922o0(abstractC3734l3);
        return c3738p;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: n */
    public Object mo4794n(Object obj, Object obj2, Object obj3) {
        C3738p c3738p = new C3738p();
        if (obj != null) {
            c3738p.m15922o0((AbstractC3734l) obj);
        }
        if (obj2 != null) {
            c3738p.m15922o0((AbstractC3734l) obj2);
        }
        if (obj3 != null) {
            c3738p.m15922o0((AbstractC3734l) obj3);
        }
        return c3738p;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: p */
    public void mo4795p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3734l) obj).mo15889a0(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: q */
    public void mo4796q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC3734l abstractC3734l = (AbstractC3734l) obj;
        int i10 = 0;
        if (abstractC3734l instanceof C3738p) {
            C3738p c3738p = (C3738p) abstractC3734l;
            int m15924r0 = c3738p.m15924r0();
            while (i10 < m15924r0) {
                mo4796q(c3738p.m15923q0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m15845C(abstractC3734l)) {
            return;
        }
        List<View> m15882H = abstractC3734l.m15882H();
        if (m15882H.size() == arrayList.size() && m15882H.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC3734l.mo15891d(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC3734l.mo15889a0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: r */
    public void mo4797r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC3734l) obj).mo15888a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: t */
    public void mo4798t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC3734l) obj).mo15888a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: u */
    public void mo4799u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC3734l) obj).mo15894f0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: v */
    public void mo4800v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m4809k(view, rect);
            ((AbstractC3734l) obj).mo15894f0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: z */
    public void mo4802z(Object obj, View view, ArrayList<View> arrayList) {
        C3738p c3738p = (C3738p) obj;
        List<View> m15882H = c3738p.m15882H();
        m15882H.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0822w.m4803d(m15882H, arrayList.get(i10));
        }
        m15882H.add(view);
        arrayList.add(view);
        mo4789b(c3738p, arrayList);
    }
}
