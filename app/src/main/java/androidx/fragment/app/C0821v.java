package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0623b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
class C0821v extends AbstractC0822w {

    /* renamed from: androidx.fragment.app.v$a */
    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4160a;

        a(Rect rect) {
            this.f4160a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4160a;
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4162a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4163b;

        b(View view, ArrayList arrayList) {
            this.f4162a = view;
            this.f4163b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4162a.setVisibility(8);
            int size = this.f4163b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f4163b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.v$c */
    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4165a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4166b;

        /* renamed from: c */
        final /* synthetic */ Object f4167c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4168d;

        /* renamed from: e */
        final /* synthetic */ Object f4169e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4170f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4165a = obj;
            this.f4166b = arrayList;
            this.f4167c = obj2;
            this.f4168d = arrayList2;
            this.f4169e = obj3;
            this.f4170f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4165a;
            if (obj != null) {
                C0821v.this.mo4796q(obj, this.f4166b, null);
            }
            Object obj2 = this.f4167c;
            if (obj2 != null) {
                C0821v.this.mo4796q(obj2, this.f4168d, null);
            }
            Object obj3 = this.f4169e;
            if (obj3 != null) {
                C0821v.this.mo4796q(obj3, this.f4170f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$d */
    /* loaded from: classes.dex */
    class d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f4172a;

        d(Runnable runnable) {
            this.f4172a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4172a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.v$e */
    /* loaded from: classes.dex */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4174a;

        e(Rect rect) {
            this.f4174a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4174a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4174a;
        }
    }

    /* renamed from: C */
    private static boolean m4785C(Transition transition) {
        return (AbstractC0822w.m4806l(transition.getTargetIds()) && AbstractC0822w.m4806l(transition.getTargetNames()) && AbstractC0822w.m4806l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: A */
    public void mo4786A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4796q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: B */
    public Object mo4787B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: a */
    public void mo4788a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: b */
    public void mo4789b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo4789b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m4785C(transition) || !AbstractC0822w.m4806l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: c */
    public void mo4790c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: e */
    public boolean mo4791e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: g */
    public Object mo4792g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: m */
    public Object mo4793m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: n */
    public Object mo4794n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: p */
    public void mo4795p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: q */
    public void mo4796q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo4796q(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m4785C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: r */
    public void mo4797r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: t */
    public void mo4798t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: u */
    public void mo4799u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: v */
    public void mo4800v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m4809k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: w */
    public void mo4801w(Fragment fragment, Object obj, C0623b c0623b, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0822w
    /* renamed from: z */
    public void mo4802z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0822w.m4803d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        mo4789b(transitionSet, arrayList);
    }
}
