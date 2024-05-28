package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0690v;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0908c extends AbstractC0918m {

    /* renamed from: s */
    private static TimeInterpolator f4673s;

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC0877d0> f4674h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC0877d0> f4675i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<j> f4676j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<i> f4677k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC0877d0>> f4678l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<j>> f4679m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<i>> f4680n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC0877d0> f4681o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC0877d0> f4682p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC0877d0> f4683q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC0877d0> f4684r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f4685n;

        a(ArrayList arrayList) {
            this.f4685n = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4685n.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C0908c.this.m5743S(jVar.f4719a, jVar.f4720b, jVar.f4721c, jVar.f4722d, jVar.f4723e);
            }
            this.f4685n.clear();
            C0908c.this.f4679m.remove(this.f4685n);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f4687n;

        b(ArrayList arrayList) {
            this.f4687n = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4687n.iterator();
            while (it.hasNext()) {
                C0908c.this.m5742R((i) it.next());
            }
            this.f4687n.clear();
            C0908c.this.f4680n.remove(this.f4687n);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f4689n;

        c(ArrayList arrayList) {
            this.f4689n = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4689n.iterator();
            while (it.hasNext()) {
                C0908c.this.m5741Q((RecyclerView.AbstractC0877d0) it.next());
            }
            this.f4689n.clear();
            C0908c.this.f4678l.remove(this.f4689n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0877d0 f4691a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4692b;

        /* renamed from: c */
        final /* synthetic */ View f4693c;

        d(RecyclerView.AbstractC0877d0 abstractC0877d0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4691a = abstractC0877d0;
            this.f4692b = viewPropertyAnimator;
            this.f4693c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4692b.setListener(null);
            this.f4693c.setAlpha(1.0f);
            C0908c.this.m5848G(this.f4691a);
            C0908c.this.f4683q.remove(this.f4691a);
            C0908c.this.m5745V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0908c.this.m5849H(this.f4691a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0877d0 f4695a;

        /* renamed from: b */
        final /* synthetic */ View f4696b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f4697c;

        e(RecyclerView.AbstractC0877d0 abstractC0877d0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4695a = abstractC0877d0;
            this.f4696b = view;
            this.f4697c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4696b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4697c.setListener(null);
            C0908c.this.m5842A(this.f4695a);
            C0908c.this.f4681o.remove(this.f4695a);
            C0908c.this.m5745V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0908c.this.m5843B(this.f4695a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0877d0 f4699a;

        /* renamed from: b */
        final /* synthetic */ int f4700b;

        /* renamed from: c */
        final /* synthetic */ View f4701c;

        /* renamed from: d */
        final /* synthetic */ int f4702d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4703e;

        f(RecyclerView.AbstractC0877d0 abstractC0877d0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4699a = abstractC0877d0;
            this.f4700b = i10;
            this.f4701c = view;
            this.f4702d = i11;
            this.f4703e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4700b != 0) {
                this.f4701c.setTranslationX(0.0f);
            }
            if (this.f4702d != 0) {
                this.f4701c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4703e.setListener(null);
            C0908c.this.m5846E(this.f4699a);
            C0908c.this.f4682p.remove(this.f4699a);
            C0908c.this.m5745V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0908c.this.m5847F(this.f4699a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f4705a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4706b;

        /* renamed from: c */
        final /* synthetic */ View f4707c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4705a = iVar;
            this.f4706b = viewPropertyAnimator;
            this.f4707c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4706b.setListener(null);
            this.f4707c.setAlpha(1.0f);
            this.f4707c.setTranslationX(0.0f);
            this.f4707c.setTranslationY(0.0f);
            C0908c.this.m5844C(this.f4705a.f4713a, true);
            C0908c.this.f4684r.remove(this.f4705a.f4713a);
            C0908c.this.m5745V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0908c.this.m5845D(this.f4705a.f4713a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f4709a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4710b;

        /* renamed from: c */
        final /* synthetic */ View f4711c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4709a = iVar;
            this.f4710b = viewPropertyAnimator;
            this.f4711c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4710b.setListener(null);
            this.f4711c.setAlpha(1.0f);
            this.f4711c.setTranslationX(0.0f);
            this.f4711c.setTranslationY(0.0f);
            C0908c.this.m5844C(this.f4709a.f4714b, false);
            C0908c.this.f4684r.remove(this.f4709a.f4714b);
            C0908c.this.m5745V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0908c.this.m5845D(this.f4709a.f4714b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC0877d0 f4719a;

        /* renamed from: b */
        public int f4720b;

        /* renamed from: c */
        public int f4721c;

        /* renamed from: d */
        public int f4722d;

        /* renamed from: e */
        public int f4723e;

        j(RecyclerView.AbstractC0877d0 abstractC0877d0, int i10, int i11, int i12, int i13) {
            this.f4719a = abstractC0877d0;
            this.f4720b = i10;
            this.f4721c = i11;
            this.f4722d = i12;
            this.f4723e = i13;
        }
    }

    /* renamed from: T */
    private void m5736T(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        View view = abstractC0877d0.f4502a;
        ViewPropertyAnimator animate = view.animate();
        this.f4683q.add(abstractC0877d0);
        animate.setDuration(m5365o()).alpha(0.0f).setListener(new d(abstractC0877d0, animate, view)).start();
    }

    /* renamed from: W */
    private void m5737W(List<i> list, RecyclerView.AbstractC0877d0 abstractC0877d0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m5739Y(iVar, abstractC0877d0) && iVar.f4713a == null && iVar.f4714b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m5738X(i iVar) {
        RecyclerView.AbstractC0877d0 abstractC0877d0 = iVar.f4713a;
        if (abstractC0877d0 != null) {
            m5739Y(iVar, abstractC0877d0);
        }
        RecyclerView.AbstractC0877d0 abstractC0877d02 = iVar.f4714b;
        if (abstractC0877d02 != null) {
            m5739Y(iVar, abstractC0877d02);
        }
    }

    /* renamed from: Y */
    private boolean m5739Y(i iVar, RecyclerView.AbstractC0877d0 abstractC0877d0) {
        boolean z10 = false;
        if (iVar.f4714b == abstractC0877d0) {
            iVar.f4714b = null;
        } else {
            if (iVar.f4713a != abstractC0877d0) {
                return false;
            }
            iVar.f4713a = null;
            z10 = true;
        }
        abstractC0877d0.f4502a.setAlpha(1.0f);
        abstractC0877d0.f4502a.setTranslationX(0.0f);
        abstractC0877d0.f4502a.setTranslationY(0.0f);
        m5844C(abstractC0877d0, z10);
        return true;
    }

    /* renamed from: Z */
    private void m5740Z(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        if (f4673s == null) {
            f4673s = new ValueAnimator().getInterpolator();
        }
        abstractC0877d0.f4502a.animate().setInterpolator(f4673s);
        mo5360j(abstractC0877d0);
    }

    /* renamed from: Q */
    void m5741Q(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        View view = abstractC0877d0.f4502a;
        ViewPropertyAnimator animate = view.animate();
        this.f4681o.add(abstractC0877d0);
        animate.alpha(1.0f).setDuration(m5362l()).setListener(new e(abstractC0877d0, view, animate)).start();
    }

    /* renamed from: R */
    void m5742R(i iVar) {
        RecyclerView.AbstractC0877d0 abstractC0877d0 = iVar.f4713a;
        View view = abstractC0877d0 == null ? null : abstractC0877d0.f4502a;
        RecyclerView.AbstractC0877d0 abstractC0877d02 = iVar.f4714b;
        View view2 = abstractC0877d02 != null ? abstractC0877d02.f4502a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m5363m());
            this.f4684r.add(iVar.f4713a);
            duration.translationX(iVar.f4717e - iVar.f4715c);
            duration.translationY(iVar.f4718f - iVar.f4716d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4684r.add(iVar.f4714b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m5363m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: S */
    void m5743S(RecyclerView.AbstractC0877d0 abstractC0877d0, int i10, int i11, int i12, int i13) {
        View view = abstractC0877d0.f4502a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4682p.add(abstractC0877d0);
        animate.setDuration(m5364n()).setListener(new f(abstractC0877d0, i14, view, i15, animate)).start();
    }

    /* renamed from: U */
    void m5744U(List<RecyclerView.AbstractC0877d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4502a.animate().cancel();
        }
    }

    /* renamed from: V */
    void m5745V() {
        if (mo5366p()) {
            return;
        }
        m5359i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: g */
    public boolean mo5357g(RecyclerView.AbstractC0877d0 abstractC0877d0, List<Object> list) {
        return !list.isEmpty() || super.mo5357g(abstractC0877d0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: j */
    public void mo5360j(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        View view = abstractC0877d0.f4502a;
        view.animate().cancel();
        int size = this.f4676j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f4676j.get(size).f4719a == abstractC0877d0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5846E(abstractC0877d0);
                this.f4676j.remove(size);
            }
        }
        m5737W(this.f4677k, abstractC0877d0);
        if (this.f4674h.remove(abstractC0877d0)) {
            view.setAlpha(1.0f);
            m5848G(abstractC0877d0);
        }
        if (this.f4675i.remove(abstractC0877d0)) {
            view.setAlpha(1.0f);
            m5842A(abstractC0877d0);
        }
        for (int size2 = this.f4680n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4680n.get(size2);
            m5737W(arrayList, abstractC0877d0);
            if (arrayList.isEmpty()) {
                this.f4680n.remove(size2);
            }
        }
        for (int size3 = this.f4679m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4679m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f4719a == abstractC0877d0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5846E(abstractC0877d0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4679m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4678l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0877d0> arrayList3 = this.f4678l.get(size5);
            if (arrayList3.remove(abstractC0877d0)) {
                view.setAlpha(1.0f);
                m5842A(abstractC0877d0);
                if (arrayList3.isEmpty()) {
                    this.f4678l.remove(size5);
                }
            }
        }
        this.f4683q.remove(abstractC0877d0);
        this.f4681o.remove(abstractC0877d0);
        this.f4684r.remove(abstractC0877d0);
        this.f4682p.remove(abstractC0877d0);
        m5745V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: k */
    public void mo5361k() {
        int size = this.f4676j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4676j.get(size);
            View view = jVar.f4719a.f4502a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5846E(jVar.f4719a);
            this.f4676j.remove(size);
        }
        for (int size2 = this.f4674h.size() - 1; size2 >= 0; size2--) {
            m5848G(this.f4674h.get(size2));
            this.f4674h.remove(size2);
        }
        int size3 = this.f4675i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0877d0 abstractC0877d0 = this.f4675i.get(size3);
            abstractC0877d0.f4502a.setAlpha(1.0f);
            m5842A(abstractC0877d0);
            this.f4675i.remove(size3);
        }
        for (int size4 = this.f4677k.size() - 1; size4 >= 0; size4--) {
            m5738X(this.f4677k.get(size4));
        }
        this.f4677k.clear();
        if (mo5366p()) {
            for (int size5 = this.f4679m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f4679m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f4719a.f4502a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5846E(jVar2.f4719a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4679m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4678l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0877d0> arrayList2 = this.f4678l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0877d0 abstractC0877d02 = arrayList2.get(size8);
                    abstractC0877d02.f4502a.setAlpha(1.0f);
                    m5842A(abstractC0877d02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4678l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4680n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f4680n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5738X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4680n.remove(arrayList3);
                    }
                }
            }
            m5744U(this.f4683q);
            m5744U(this.f4682p);
            m5744U(this.f4681o);
            m5744U(this.f4684r);
            m5359i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: p */
    public boolean mo5366p() {
        return (this.f4675i.isEmpty() && this.f4677k.isEmpty() && this.f4676j.isEmpty() && this.f4674h.isEmpty() && this.f4682p.isEmpty() && this.f4683q.isEmpty() && this.f4681o.isEmpty() && this.f4684r.isEmpty() && this.f4679m.isEmpty() && this.f4678l.isEmpty() && this.f4680n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: u */
    public void mo5371u() {
        boolean z10 = !this.f4674h.isEmpty();
        boolean z11 = !this.f4676j.isEmpty();
        boolean z12 = !this.f4677k.isEmpty();
        boolean z13 = !this.f4675i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.AbstractC0877d0> it = this.f4674h.iterator();
            while (it.hasNext()) {
                m5736T(it.next());
            }
            this.f4674h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4676j);
                this.f4679m.add(arrayList);
                this.f4676j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    C0690v.m3839j0(arrayList.get(0).f4719a.f4502a, aVar, m5365o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4677k);
                this.f4680n.add(arrayList2);
                this.f4677k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    C0690v.m3839j0(arrayList2.get(0).f4713a.f4502a, bVar, m5365o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.AbstractC0877d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4675i);
                this.f4678l.add(arrayList3);
                this.f4675i.clear();
                c cVar = new c(arrayList3);
                if (!z10 && !z11 && !z12) {
                    cVar.run();
                } else {
                    C0690v.m3839j0(arrayList3.get(0).f4502a, cVar, (z10 ? m5365o() : 0L) + Math.max(z11 ? m5364n() : 0L, z12 ? m5363m() : 0L));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0918m
    /* renamed from: w */
    public boolean mo5746w(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5740Z(abstractC0877d0);
        abstractC0877d0.f4502a.setAlpha(0.0f);
        this.f4675i.add(abstractC0877d0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0918m
    /* renamed from: x */
    public boolean mo5747x(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0877d0 abstractC0877d02, int i10, int i11, int i12, int i13) {
        if (abstractC0877d0 == abstractC0877d02) {
            return mo5748y(abstractC0877d0, i10, i11, i12, i13);
        }
        float translationX = abstractC0877d0.f4502a.getTranslationX();
        float translationY = abstractC0877d0.f4502a.getTranslationY();
        float alpha = abstractC0877d0.f4502a.getAlpha();
        m5740Z(abstractC0877d0);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        abstractC0877d0.f4502a.setTranslationX(translationX);
        abstractC0877d0.f4502a.setTranslationY(translationY);
        abstractC0877d0.f4502a.setAlpha(alpha);
        if (abstractC0877d02 != null) {
            m5740Z(abstractC0877d02);
            abstractC0877d02.f4502a.setTranslationX(-i14);
            abstractC0877d02.f4502a.setTranslationY(-i15);
            abstractC0877d02.f4502a.setAlpha(0.0f);
        }
        this.f4677k.add(new i(abstractC0877d0, abstractC0877d02, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0918m
    /* renamed from: y */
    public boolean mo5748y(RecyclerView.AbstractC0877d0 abstractC0877d0, int i10, int i11, int i12, int i13) {
        View view = abstractC0877d0.f4502a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) abstractC0877d0.f4502a.getTranslationY());
        m5740Z(abstractC0877d0);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m5846E(abstractC0877d0);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f4676j.add(new j(abstractC0877d0, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0918m
    /* renamed from: z */
    public boolean mo5749z(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5740Z(abstractC0877d0);
        this.f4674h.add(abstractC0877d0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC0877d0 f4713a;

        /* renamed from: b */
        public RecyclerView.AbstractC0877d0 f4714b;

        /* renamed from: c */
        public int f4715c;

        /* renamed from: d */
        public int f4716d;

        /* renamed from: e */
        public int f4717e;

        /* renamed from: f */
        public int f4718f;

        private i(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0877d0 abstractC0877d02) {
            this.f4713a = abstractC0877d0;
            this.f4714b = abstractC0877d02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4713a + ", newHolder=" + this.f4714b + ", fromX=" + this.f4715c + ", fromY=" + this.f4716d + ", toX=" + this.f4717e + ", toY=" + this.f4718f + '}';
        }

        i(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0877d0 abstractC0877d02, int i10, int i11, int i12, int i13) {
            this(abstractC0877d0, abstractC0877d02);
            this.f4715c = i10;
            this.f4716d = i11;
            this.f4717e = i12;
            this.f4718f = i13;
        }
    }
}
