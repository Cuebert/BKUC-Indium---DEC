package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.C0623b;
import androidx.core.util.C0654h;
import androidx.core.view.C0690v;
import androidx.core.view.C0693y;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0687s;
import androidx.fragment.app.AbstractC0825z;
import androidx.fragment.app.C0804e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p093h0.C3356a;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
class C0800b extends AbstractC0825z {

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3957a;

        static {
            int[] iArr = new int[AbstractC0825z.e.c.values().length];
            f3957a = iArr;
            try {
                iArr[AbstractC0825z.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3957a[AbstractC0825z.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3957a[AbstractC0825z.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3957a[AbstractC0825z.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ List f3958n;

        /* renamed from: o */
        final /* synthetic */ AbstractC0825z.e f3959o;

        b(List list, AbstractC0825z.e eVar) {
            this.f3958n = list;
            this.f3959o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3958n.contains(this.f3959o)) {
                this.f3958n.remove(this.f3959o);
                C0800b.this.m4576s(this.f3959o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3961a;

        /* renamed from: b */
        final /* synthetic */ View f3962b;

        /* renamed from: c */
        final /* synthetic */ boolean f3963c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0825z.e f3964d;

        /* renamed from: e */
        final /* synthetic */ k f3965e;

        c(ViewGroup viewGroup, View view, boolean z10, AbstractC0825z.e eVar, k kVar) {
            this.f3961a = viewGroup;
            this.f3962b = view;
            this.f3963c = z10;
            this.f3964d = eVar;
            this.f3965e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3961a.endViewTransition(this.f3962b);
            if (this.f3963c) {
                this.f3964d.m4843e().m4852b(this.f3962b);
            }
            this.f3965e.m4581a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$d */
    /* loaded from: classes.dex */
    public class d implements C0623b.b {

        /* renamed from: a */
        final /* synthetic */ Animator f3967a;

        d(Animator animator) {
            this.f3967a = animator;
        }

        @Override // androidx.core.os.C0623b.b
        /* renamed from: a */
        public void mo3342a() {
            this.f3967a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3969a;

        /* renamed from: b */
        final /* synthetic */ View f3970b;

        /* renamed from: c */
        final /* synthetic */ k f3971c;

        /* renamed from: androidx.fragment.app.b$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3969a.endViewTransition(eVar.f3970b);
                e.this.f3971c.m4581a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3969a = viewGroup;
            this.f3970b = view;
            this.f3971c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3969a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$f */
    /* loaded from: classes.dex */
    public class f implements C0623b.b {

        /* renamed from: a */
        final /* synthetic */ View f3974a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3975b;

        /* renamed from: c */
        final /* synthetic */ k f3976c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3974a = view;
            this.f3975b = viewGroup;
            this.f3976c = kVar;
        }

        @Override // androidx.core.os.C0623b.b
        /* renamed from: a */
        public void mo3342a() {
            this.f3974a.clearAnimation();
            this.f3975b.endViewTransition(this.f3974a);
            this.f3976c.m4581a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: n */
        final /* synthetic */ AbstractC0825z.e f3978n;

        /* renamed from: o */
        final /* synthetic */ AbstractC0825z.e f3979o;

        /* renamed from: p */
        final /* synthetic */ boolean f3980p;

        /* renamed from: q */
        final /* synthetic */ C3356a f3981q;

        g(AbstractC0825z.e eVar, AbstractC0825z.e eVar2, boolean z10, C3356a c3356a) {
            this.f3978n = eVar;
            this.f3979o = eVar2;
            this.f3980p = z10;
            this.f3981q = c3356a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0820u.m4764f(this.f3978n.m4844f(), this.f3979o.m4844f(), this.f3980p, this.f3981q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: n */
        final /* synthetic */ AbstractC0822w f3983n;

        /* renamed from: o */
        final /* synthetic */ View f3984o;

        /* renamed from: p */
        final /* synthetic */ Rect f3985p;

        h(AbstractC0822w abstractC0822w, View view, Rect rect) {
            this.f3983n = abstractC0822w;
            this.f3984o = view;
            this.f3985p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3983n.m4809k(this.f3984o, this.f3985p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f3987n;

        i(ArrayList arrayList) {
            this.f3987n = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0820u.m4757A(this.f3987n, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: n */
        final /* synthetic */ m f3989n;

        j(m mVar) {
            this.f3989n = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3989n.m4581a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.b$k */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c */
        private boolean f3991c;

        /* renamed from: d */
        private boolean f3992d;

        /* renamed from: e */
        private C0804e.d f3993e;

        k(AbstractC0825z.e eVar, C0623b c0623b, boolean z10) {
            super(eVar, c0623b);
            this.f3992d = false;
            this.f3991c = z10;
        }

        /* renamed from: e */
        C0804e.d m4580e(Context context) {
            if (this.f3992d) {
                return this.f3993e;
            }
            C0804e.d m4627c = C0804e.m4627c(context, m4582b().m4844f(), m4582b().m4843e() == AbstractC0825z.e.c.VISIBLE, this.f3991c);
            this.f3993e = m4627c;
            this.f3992d = true;
            return m4627c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.b$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        private final AbstractC0825z.e f3994a;

        /* renamed from: b */
        private final C0623b f3995b;

        l(AbstractC0825z.e eVar, C0623b c0623b) {
            this.f3994a = eVar;
            this.f3995b = c0623b;
        }

        /* renamed from: a */
        void m4581a() {
            this.f3994a.m4842d(this.f3995b);
        }

        /* renamed from: b */
        AbstractC0825z.e m4582b() {
            return this.f3994a;
        }

        /* renamed from: c */
        C0623b m4583c() {
            return this.f3995b;
        }

        /* renamed from: d */
        boolean m4584d() {
            AbstractC0825z.e.c cVar;
            AbstractC0825z.e.c m4851d = AbstractC0825z.e.c.m4851d(this.f3994a.m4844f().f3802U);
            AbstractC0825z.e.c m4843e = this.f3994a.m4843e();
            return m4851d == m4843e || !(m4851d == (cVar = AbstractC0825z.e.c.VISIBLE) || m4843e == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.b$m */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c */
        private final Object f3996c;

        /* renamed from: d */
        private final boolean f3997d;

        /* renamed from: e */
        private final Object f3998e;

        m(AbstractC0825z.e eVar, C0623b c0623b, boolean z10, boolean z11) {
            super(eVar, c0623b);
            Object m4266B;
            Object m4389y;
            boolean m4366q;
            if (eVar.m4843e() == AbstractC0825z.e.c.VISIBLE) {
                if (z10) {
                    m4389y = eVar.m4844f().m4304P();
                } else {
                    m4389y = eVar.m4844f().m4389y();
                }
                this.f3996c = m4389y;
                if (z10) {
                    m4366q = eVar.m4844f().m4369r();
                } else {
                    m4366q = eVar.m4844f().m4366q();
                }
                this.f3997d = m4366q;
            } else {
                if (z10) {
                    m4266B = eVar.m4844f().m4313S();
                } else {
                    m4266B = eVar.m4844f().m4266B();
                }
                this.f3996c = m4266B;
                this.f3997d = true;
            }
            if (!z11) {
                this.f3998e = null;
            } else if (z10) {
                this.f3998e = eVar.m4844f().m4321V();
            } else {
                this.f3998e = eVar.m4844f().m4316T();
            }
        }

        /* renamed from: f */
        private AbstractC0822w m4585f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0822w abstractC0822w = C0820u.f4118b;
            if (abstractC0822w != null && abstractC0822w.mo4791e(obj)) {
                return abstractC0822w;
            }
            AbstractC0822w abstractC0822w2 = C0820u.f4119c;
            if (abstractC0822w2 != null && abstractC0822w2.mo4791e(obj)) {
                return abstractC0822w2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m4582b().m4844f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC0822w m4586e() {
            AbstractC0822w m4585f = m4585f(this.f3996c);
            AbstractC0822w m4585f2 = m4585f(this.f3998e);
            if (m4585f == null || m4585f2 == null || m4585f == m4585f2) {
                return m4585f != null ? m4585f : m4585f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m4582b().m4844f() + " returned Transition " + this.f3996c + " which uses a different Transition  type than its shared element transition " + this.f3998e);
        }

        /* renamed from: g */
        public Object m4587g() {
            return this.f3998e;
        }

        /* renamed from: h */
        Object m4588h() {
            return this.f3996c;
        }

        /* renamed from: i */
        public boolean m4589i() {
            return this.f3998e != null;
        }

        /* renamed from: j */
        boolean m4590j() {
            return this.f3997d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0800b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m4573w(List<k> list, List<AbstractC0825z.e> list2, boolean z10, Map<AbstractC0825z.e, Boolean> map) {
        ViewGroup m4835m = m4835m();
        Context context = m4835m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.m4584d()) {
                kVar.m4581a();
            } else {
                C0804e.d m4580e = kVar.m4580e(context);
                if (m4580e == null) {
                    kVar.m4581a();
                } else {
                    Animator animator = m4580e.f4041b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        AbstractC0825z.e m4582b = kVar.m4582b();
                        Fragment m4844f = m4582b.m4844f();
                        if (Boolean.TRUE.equals(map.get(m4582b))) {
                            if (FragmentManager.m4403H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m4844f + " as this Fragment was involved in a Transition.");
                            }
                            kVar.m4581a();
                        } else {
                            boolean z12 = m4582b.m4843e() == AbstractC0825z.e.c.GONE;
                            if (z12) {
                                list2.remove(m4582b);
                            }
                            View view = m4844f.f3802U;
                            m4835m.startViewTransition(view);
                            animator.addListener(new c(m4835m, view, z12, m4582b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m4583c().m3339c(new d(animator));
                            z11 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            AbstractC0825z.e m4582b2 = kVar2.m4582b();
            Fragment m4844f2 = m4582b2.m4844f();
            if (z10) {
                if (FragmentManager.m4403H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m4844f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.m4581a();
            } else if (z11) {
                if (FragmentManager.m4403H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m4844f2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.m4581a();
            } else {
                View view2 = m4844f2.f3802U;
                Animation animation = (Animation) C0654h.m3467f(((C0804e.d) C0654h.m3467f(kVar2.m4580e(context))).f4040a);
                if (m4582b2.m4843e() != AbstractC0825z.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m4581a();
                } else {
                    m4835m.startViewTransition(view2);
                    C0804e.e eVar = new C0804e.e(animation, m4835m, view2);
                    eVar.setAnimationListener(new e(m4835m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m4583c().m3339c(new f(view2, m4835m, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private Map<AbstractC0825z.e, Boolean> m4574x(List<m> list, List<AbstractC0825z.e> list2, boolean z10, AbstractC0825z.e eVar, AbstractC0825z.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC0825z.e eVar3;
        AbstractC0825z.e eVar4;
        View view2;
        Object mo4794n;
        C3356a c3356a;
        ArrayList<View> arrayList3;
        AbstractC0825z.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        AbstractC0822w abstractC0822w;
        AbstractC0825z.e eVar6;
        View view4;
        boolean z11 = z10;
        AbstractC0825z.e eVar7 = eVar;
        AbstractC0825z.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        AbstractC0822w abstractC0822w2 = null;
        for (m mVar : list) {
            if (!mVar.m4584d()) {
                AbstractC0822w m4586e = mVar.m4586e();
                if (abstractC0822w2 == null) {
                    abstractC0822w2 = m4586e;
                } else if (m4586e != null && abstractC0822w2 != m4586e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m4582b().m4844f() + " returned Transition " + mVar.m4588h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC0822w2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.m4582b(), Boolean.FALSE);
                mVar2.m4581a();
            }
            return hashMap;
        }
        View view5 = new View(m4835m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C3356a c3356a2 = new C3356a();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        for (m mVar3 : list) {
            if (!mVar3.m4589i() || eVar7 == null || eVar8 == null) {
                c3356a = c3356a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                abstractC0822w = abstractC0822w2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object mo4787B = abstractC0822w2.mo4787B(abstractC0822w2.mo4792g(mVar3.m4587g()));
                ArrayList<String> m4324W = eVar2.m4844f().m4324W();
                ArrayList<String> m4324W2 = eVar.m4844f().m4324W();
                ArrayList<String> m4326X = eVar.m4844f().m4326X();
                View view7 = view6;
                int i10 = 0;
                while (i10 < m4326X.size()) {
                    int indexOf = m4324W.indexOf(m4326X.get(i10));
                    ArrayList<String> arrayList7 = m4326X;
                    if (indexOf != -1) {
                        m4324W.set(indexOf, m4324W2.get(i10));
                    }
                    i10++;
                    m4326X = arrayList7;
                }
                ArrayList<String> m4326X2 = eVar2.m4844f().m4326X();
                if (!z11) {
                    eVar.m4844f().m4269C();
                    eVar2.m4844f().m4392z();
                } else {
                    eVar.m4844f().m4392z();
                    eVar2.m4844f().m4269C();
                }
                int i11 = 0;
                for (int size = m4324W.size(); i11 < size; size = size) {
                    c3356a2.put(m4324W.get(i11), m4326X2.get(i11));
                    i11++;
                }
                C3356a<String, View> c3356a3 = new C3356a<>();
                m4578u(c3356a3, eVar.m4844f().f3802U);
                c3356a3.m14777o(m4324W);
                c3356a2.m14777o(c3356a3.keySet());
                C3356a<String, View> c3356a4 = new C3356a<>();
                m4578u(c3356a4, eVar2.m4844f().f3802U);
                c3356a4.m14777o(m4326X2);
                c3356a4.m14777o(c3356a2.values());
                C0820u.m4782x(c3356a2, c3356a4);
                m4579v(c3356a3, c3356a2.keySet());
                m4579v(c3356a4, c3356a2.values());
                if (c3356a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c3356a = c3356a2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC0822w = abstractC0822w2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    C0820u.m4764f(eVar2.m4844f(), eVar.m4844f(), z11, c3356a3, true);
                    c3356a = c3356a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC0687s.m3776a(m4835m(), new g(eVar2, eVar, z10, c3356a4));
                    arrayList5.addAll(c3356a3.values());
                    if (m4324W.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) c3356a3.get(m4324W.get(0));
                        abstractC0822w2.mo4800v(mo4787B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c3356a4.values());
                    if (!m4326X2.isEmpty() && (view4 = (View) c3356a4.get(m4326X2.get(0))) != null) {
                        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(m4835m(), new h(abstractC0822w2, view4, rect2));
                        z12 = true;
                    }
                    abstractC0822w2.mo4802z(mo4787B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC0822w = abstractC0822w2;
                    abstractC0822w2.mo4798t(mo4787B, null, null, null, null, mo4787B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = mo4787B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            c3356a2 = c3356a;
            z11 = z10;
            arrayList6 = arrayList3;
            abstractC0822w2 = abstractC0822w;
        }
        View view9 = view6;
        C3356a c3356a5 = c3356a2;
        ArrayList<View> arrayList9 = arrayList6;
        AbstractC0825z.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        AbstractC0822w abstractC0822w3 = abstractC0822w2;
        AbstractC0825z.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.m4584d()) {
                hashMap.put(mVar4.m4582b(), Boolean.FALSE);
                mVar4.m4581a();
            } else {
                Object mo4792g = abstractC0822w3.mo4792g(mVar4.m4588h());
                AbstractC0825z.e m4582b = mVar4.m4582b();
                boolean z13 = obj3 != null && (m4582b == eVar9 || m4582b == eVar10);
                if (mo4792g == null) {
                    if (!z13) {
                        hashMap.put(m4582b, Boolean.FALSE);
                        mVar4.m4581a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    mo4794n = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    m4577t(arrayList12, m4582b.m4844f().f3802U);
                    if (z13) {
                        if (m4582b == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC0822w3.mo4788a(mo4792g, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = m4582b;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        abstractC0822w3.mo4789b(mo4792g, arrayList12);
                        view = view10;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        abstractC0822w3.mo4798t(mo4792g, mo4792g, arrayList12, null, null, null, null);
                        if (m4582b.m4843e() == AbstractC0825z.e.c.GONE) {
                            eVar4 = m4582b;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.m4844f().f3802U);
                            abstractC0822w3.mo4797r(mo4792g, eVar4.m4844f().f3802U, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC0687s.m3776a(m4835m(), new i(arrayList12));
                        } else {
                            eVar4 = m4582b;
                        }
                    }
                    if (eVar4.m4843e() == AbstractC0825z.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            abstractC0822w3.mo4799u(mo4792g, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        abstractC0822w3.mo4800v(mo4792g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.m4590j()) {
                        obj5 = abstractC0822w3.mo4794n(obj2, mo4792g, null);
                        mo4794n = obj;
                    } else {
                        mo4794n = abstractC0822w3.mo4794n(obj, mo4792g, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = mo4794n;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList<View> arrayList15 = arrayList10;
        AbstractC0825z.e eVar11 = eVar10;
        Object mo4793m = abstractC0822w3.mo4793m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.m4584d()) {
                Object m4588h = mVar5.m4588h();
                AbstractC0825z.e m4582b2 = mVar5.m4582b();
                boolean z14 = obj3 != null && (m4582b2 == eVar9 || m4582b2 == eVar11);
                if (m4588h != null || z14) {
                    if (!C0690v.m3814U(m4835m())) {
                        if (FragmentManager.m4403H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m4835m() + " has not been laid out. Completing operation " + m4582b2);
                        }
                        mVar5.m4581a();
                    } else {
                        abstractC0822w3.mo4801w(mVar5.m4582b().m4844f(), mo4793m, mVar5.m4583c(), new j(mVar5));
                    }
                }
            }
        }
        if (!C0690v.m3814U(m4835m())) {
            return hashMap;
        }
        C0820u.m4757A(arrayList11, 4);
        ArrayList<String> m4810o = abstractC0822w3.m4810o(arrayList14);
        abstractC0822w3.mo4790c(m4835m(), mo4793m);
        abstractC0822w3.m4813y(m4835m(), arrayList15, arrayList14, m4810o, c3356a5);
        C0820u.m4757A(arrayList11, 0);
        abstractC0822w3.mo4786A(obj3, arrayList15, arrayList14);
        return hashMap;
    }

    @Override // androidx.fragment.app.AbstractC0825z
    /* renamed from: f */
    void mo4575f(List<AbstractC0825z.e> list, boolean z10) {
        AbstractC0825z.e eVar = null;
        AbstractC0825z.e eVar2 = null;
        for (AbstractC0825z.e eVar3 : list) {
            AbstractC0825z.e.c m4851d = AbstractC0825z.e.c.m4851d(eVar3.m4844f().f3802U);
            int i10 = a.f3957a[eVar3.m4843e().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4 && m4851d != AbstractC0825z.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (m4851d == AbstractC0825z.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (AbstractC0825z.e eVar4 : list) {
            C0623b c0623b = new C0623b();
            eVar4.m4848j(c0623b);
            arrayList.add(new k(eVar4, c0623b, z10));
            C0623b c0623b2 = new C0623b();
            eVar4.m4848j(c0623b2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, c0623b2, z10, z11));
                    eVar4.m4840a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c0623b2, z10, z11));
                eVar4.m4840a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, c0623b2, z10, z11));
                    eVar4.m4840a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c0623b2, z10, z11));
                eVar4.m4840a(new b(arrayList3, eVar4));
            }
        }
        Map<AbstractC0825z.e, Boolean> m4574x = m4574x(arrayList2, arrayList3, z10, eVar, eVar2);
        m4573w(arrayList, arrayList3, m4574x.containsValue(Boolean.TRUE), m4574x);
        Iterator<AbstractC0825z.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            m4576s(it.next());
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    void m4576s(AbstractC0825z.e eVar) {
        eVar.m4843e().m4852b(eVar.m4844f().f3802U);
    }

    /* renamed from: t */
    void m4577t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0693y.m4023a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m4577t(arrayList, childAt);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: u */
    void m4578u(Map<String, View> map, View view) {
        String m3806M = C0690v.m3806M(view);
        if (m3806M != null) {
            map.put(m3806M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m4578u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m4579v(C3356a<String, View> c3356a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c3356a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0690v.m3806M(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
