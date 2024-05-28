package p135k1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0690v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p093h0.C3356a;

/* renamed from: k1.n */
/* loaded from: classes.dex */
public class C3736n {

    /* renamed from: a */
    private static AbstractC3734l f15700a = new C3717b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C3356a<ViewGroup, ArrayList<AbstractC3734l>>>> f15701b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f15702c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.n$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: n */
        AbstractC3734l f15703n;

        /* renamed from: o */
        ViewGroup f15704o;

        /* renamed from: k1.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C6051a extends C3735m {

            /* renamed from: a */
            final /* synthetic */ C3356a f15705a;

            C6051a(C3356a c3356a) {
                this.f15705a = c3356a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p135k1.AbstractC3734l.f
            /* renamed from: b */
            public void mo15832b(AbstractC3734l abstractC3734l) {
                ((ArrayList) this.f15705a.get(a.this.f15704o)).remove(abstractC3734l);
                abstractC3734l.mo15887Z(this);
            }
        }

        a(AbstractC3734l abstractC3734l, ViewGroup viewGroup) {
            this.f15703n = abstractC3734l;
            this.f15704o = viewGroup;
        }

        /* renamed from: a */
        private void m15917a() {
            this.f15704o.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f15704o.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m15917a();
            if (!C3736n.f15702c.remove(this.f15704o)) {
                return true;
            }
            C3356a<ViewGroup, ArrayList<AbstractC3734l>> m15914b = C3736n.m15914b();
            ArrayList<AbstractC3734l> arrayList = m15914b.get(this.f15704o);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m15914b.put(this.f15704o, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f15703n);
            this.f15703n.mo15888a(new C6051a(m15914b));
            this.f15703n.m15903o(this.f15704o, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC3734l) it.next()).mo15890b0(this.f15704o);
                }
            }
            this.f15703n.m15886Y(this.f15704o);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m15917a();
            C3736n.f15702c.remove(this.f15704o);
            ArrayList<AbstractC3734l> arrayList = C3736n.m15914b().get(this.f15704o);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC3734l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo15890b0(this.f15704o);
                }
            }
            this.f15703n.m15904p(true);
        }
    }

    /* renamed from: a */
    public static void m15913a(ViewGroup viewGroup, AbstractC3734l abstractC3734l) {
        if (f15702c.contains(viewGroup) || !C0690v.m3814U(viewGroup)) {
            return;
        }
        f15702c.add(viewGroup);
        if (abstractC3734l == null) {
            abstractC3734l = f15700a;
        }
        AbstractC3734l clone = abstractC3734l.clone();
        m15916d(viewGroup, clone);
        C3733k.m15863c(viewGroup, null);
        m15915c(viewGroup, clone);
    }

    /* renamed from: b */
    static C3356a<ViewGroup, ArrayList<AbstractC3734l>> m15914b() {
        C3356a<ViewGroup, ArrayList<AbstractC3734l>> c3356a;
        WeakReference<C3356a<ViewGroup, ArrayList<AbstractC3734l>>> weakReference = f15701b.get();
        if (weakReference != null && (c3356a = weakReference.get()) != null) {
            return c3356a;
        }
        C3356a<ViewGroup, ArrayList<AbstractC3734l>> c3356a2 = new C3356a<>();
        f15701b.set(new WeakReference<>(c3356a2));
        return c3356a2;
    }

    /* renamed from: c */
    private static void m15915c(ViewGroup viewGroup, AbstractC3734l abstractC3734l) {
        if (abstractC3734l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC3734l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    private static void m15916d(ViewGroup viewGroup, AbstractC3734l abstractC3734l) {
        ArrayList<AbstractC3734l> arrayList = m15914b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC3734l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo15885V(viewGroup);
            }
        }
        if (abstractC3734l != null) {
            abstractC3734l.m15903o(viewGroup, true);
        }
        C3733k m15862b = C3733k.m15862b(viewGroup);
        if (m15862b != null) {
            m15862b.m15864a();
        }
    }
}
