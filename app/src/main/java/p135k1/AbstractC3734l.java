package p135k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.C0690v;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p093h0.C3356a;
import p093h0.C3359d;

/* renamed from: k1.l */
/* loaded from: classes.dex */
public abstract class AbstractC3734l implements Cloneable {

    /* renamed from: T */
    private static final int[] f15657T = {2, 1, 3, 4};

    /* renamed from: U */
    private static final AbstractC3727g f15658U = new a();

    /* renamed from: V */
    private static ThreadLocal<C3356a<Animator, d>> f15659V = new ThreadLocal<>();

    /* renamed from: G */
    private ArrayList<C3740r> f15666G;

    /* renamed from: H */
    private ArrayList<C3740r> f15667H;

    /* renamed from: Q */
    private e f15676Q;

    /* renamed from: R */
    private C3356a<String, String> f15677R;

    /* renamed from: n */
    private String f15679n = getClass().getName();

    /* renamed from: o */
    private long f15680o = -1;

    /* renamed from: p */
    long f15681p = -1;

    /* renamed from: q */
    private TimeInterpolator f15682q = null;

    /* renamed from: r */
    ArrayList<Integer> f15683r = new ArrayList<>();

    /* renamed from: s */
    ArrayList<View> f15684s = new ArrayList<>();

    /* renamed from: t */
    private ArrayList<String> f15685t = null;

    /* renamed from: u */
    private ArrayList<Class<?>> f15686u = null;

    /* renamed from: v */
    private ArrayList<Integer> f15687v = null;

    /* renamed from: w */
    private ArrayList<View> f15688w = null;

    /* renamed from: x */
    private ArrayList<Class<?>> f15689x = null;

    /* renamed from: y */
    private ArrayList<String> f15690y = null;

    /* renamed from: z */
    private ArrayList<Integer> f15691z = null;

    /* renamed from: A */
    private ArrayList<View> f15660A = null;

    /* renamed from: B */
    private ArrayList<Class<?>> f15661B = null;

    /* renamed from: C */
    private C3741s f15662C = new C3741s();

    /* renamed from: D */
    private C3741s f15663D = new C3741s();

    /* renamed from: E */
    C3738p f15664E = null;

    /* renamed from: F */
    private int[] f15665F = f15657T;

    /* renamed from: I */
    private ViewGroup f15668I = null;

    /* renamed from: J */
    boolean f15669J = false;

    /* renamed from: K */
    ArrayList<Animator> f15670K = new ArrayList<>();

    /* renamed from: L */
    private int f15671L = 0;

    /* renamed from: M */
    private boolean f15672M = false;

    /* renamed from: N */
    private boolean f15673N = false;

    /* renamed from: O */
    private ArrayList<f> f15674O = null;

    /* renamed from: P */
    private ArrayList<Animator> f15675P = new ArrayList<>();

    /* renamed from: S */
    private AbstractC3727g f15678S = f15658U;

    /* renamed from: k1.l$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC3727g {
        a() {
        }

        @Override // p135k1.AbstractC3727g
        /* renamed from: a */
        public Path mo15859a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: k1.l$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3356a f15692a;

        b(C3356a c3356a) {
            this.f15692a = c3356a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15692a.remove(animator);
            AbstractC3734l.this.f15670K.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC3734l.this.f15670K.add(animator);
        }
    }

    /* renamed from: k1.l$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3734l.this.m15907t();
            animator.removeListener(this);
        }
    }

    /* renamed from: k1.l$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f15695a;

        /* renamed from: b */
        String f15696b;

        /* renamed from: c */
        C3740r f15697c;

        /* renamed from: d */
        InterfaceC3730h0 f15698d;

        /* renamed from: e */
        AbstractC3734l f15699e;

        d(View view, String str, AbstractC3734l abstractC3734l, InterfaceC3730h0 interfaceC3730h0, C3740r c3740r) {
            this.f15695a = view;
            this.f15696b = str;
            this.f15697c = c3740r;
            this.f15698d = interfaceC3730h0;
            this.f15699e = abstractC3734l;
        }
    }

    /* renamed from: k1.l$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* renamed from: k1.l$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo15831a(AbstractC3734l abstractC3734l);

        /* renamed from: b */
        void mo15832b(AbstractC3734l abstractC3734l);

        /* renamed from: c */
        void mo15846c(AbstractC3734l abstractC3734l);

        /* renamed from: d */
        void mo15833d(AbstractC3734l abstractC3734l);

        /* renamed from: e */
        void mo15834e(AbstractC3734l abstractC3734l);
    }

    /* renamed from: C */
    private static C3356a<Animator, d> m15865C() {
        C3356a<Animator, d> c3356a = f15659V.get();
        if (c3356a != null) {
            return c3356a;
        }
        C3356a<Animator, d> c3356a2 = new C3356a<>();
        f15659V.set(c3356a2);
        return c3356a2;
    }

    /* renamed from: M */
    private static boolean m15866M(C3740r c3740r, C3740r c3740r2, String str) {
        Object obj = c3740r.f15718a.get(str);
        Object obj2 = c3740r2.f15718a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: N */
    private void m15867N(C3356a<View, C3740r> c3356a, C3356a<View, C3740r> c3356a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && m15884L(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && m15884L(view)) {
                C3740r c3740r = c3356a.get(valueAt);
                C3740r c3740r2 = c3356a2.get(view);
                if (c3740r != null && c3740r2 != null) {
                    this.f15666G.add(c3740r);
                    this.f15667H.add(c3740r2);
                    c3356a.remove(valueAt);
                    c3356a2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    private void m15868P(C3356a<View, C3740r> c3356a, C3356a<View, C3740r> c3356a2) {
        C3740r remove;
        for (int size = c3356a.size() - 1; size >= 0; size--) {
            View m14840i = c3356a.m14840i(size);
            if (m14840i != null && m15884L(m14840i) && (remove = c3356a2.remove(m14840i)) != null && m15884L(remove.f15719b)) {
                this.f15666G.add(c3356a.m14842k(size));
                this.f15667H.add(remove);
            }
        }
    }

    /* renamed from: R */
    private void m15869R(C3356a<View, C3740r> c3356a, C3356a<View, C3740r> c3356a2, C3359d<View> c3359d, C3359d<View> c3359d2) {
        View m14805h;
        int m14812q = c3359d.m14812q();
        for (int i10 = 0; i10 < m14812q; i10++) {
            View m14813r = c3359d.m14813r(i10);
            if (m14813r != null && m15884L(m14813r) && (m14805h = c3359d2.m14805h(c3359d.m14808m(i10))) != null && m15884L(m14805h)) {
                C3740r c3740r = c3356a.get(m14813r);
                C3740r c3740r2 = c3356a2.get(m14805h);
                if (c3740r != null && c3740r2 != null) {
                    this.f15666G.add(c3740r);
                    this.f15667H.add(c3740r2);
                    c3356a.remove(m14813r);
                    c3356a2.remove(m14805h);
                }
            }
        }
    }

    /* renamed from: S */
    private void m15870S(C3356a<View, C3740r> c3356a, C3356a<View, C3740r> c3356a2, C3356a<String, View> c3356a3, C3356a<String, View> c3356a4) {
        View view;
        int size = c3356a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m14844m = c3356a3.m14844m(i10);
            if (m14844m != null && m15884L(m14844m) && (view = c3356a4.get(c3356a3.m14840i(i10))) != null && m15884L(view)) {
                C3740r c3740r = c3356a.get(m14844m);
                C3740r c3740r2 = c3356a2.get(view);
                if (c3740r != null && c3740r2 != null) {
                    this.f15666G.add(c3740r);
                    this.f15667H.add(c3740r2);
                    c3356a.remove(m14844m);
                    c3356a2.remove(view);
                }
            }
        }
    }

    /* renamed from: U */
    private void m15871U(C3741s c3741s, C3741s c3741s2) {
        C3356a<View, C3740r> c3356a = new C3356a<>(c3741s.f15721a);
        C3356a<View, C3740r> c3356a2 = new C3356a<>(c3741s2.f15721a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15665F;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    m15868P(c3356a, c3356a2);
                } else if (i11 == 2) {
                    m15870S(c3356a, c3356a2, c3741s.f15724d, c3741s2.f15724d);
                } else if (i11 == 3) {
                    m15867N(c3356a, c3356a2, c3741s.f15722b, c3741s2.f15722b);
                } else if (i11 == 4) {
                    m15869R(c3356a, c3356a2, c3741s.f15723c, c3741s2.f15723c);
                }
                i10++;
            } else {
                m15873f(c3356a, c3356a2);
                return;
            }
        }
    }

    /* renamed from: c0 */
    private void m15872c0(Animator animator, C3356a<Animator, d> c3356a) {
        if (animator != null) {
            animator.addListener(new b(c3356a));
            m15896h(animator);
        }
    }

    /* renamed from: f */
    private void m15873f(C3356a<View, C3740r> c3356a, C3356a<View, C3740r> c3356a2) {
        for (int i10 = 0; i10 < c3356a.size(); i10++) {
            C3740r m14844m = c3356a.m14844m(i10);
            if (m15884L(m14844m.f15719b)) {
                this.f15666G.add(m14844m);
                this.f15667H.add(null);
            }
        }
        for (int i11 = 0; i11 < c3356a2.size(); i11++) {
            C3740r m14844m2 = c3356a2.m14844m(i11);
            if (m15884L(m14844m2.f15719b)) {
                this.f15667H.add(m14844m2);
                this.f15666G.add(null);
            }
        }
    }

    /* renamed from: g */
    private static void m15874g(C3741s c3741s, View view, C3740r c3740r) {
        c3741s.f15721a.put(view, c3740r);
        int id = view.getId();
        if (id >= 0) {
            if (c3741s.f15722b.indexOfKey(id) >= 0) {
                c3741s.f15722b.put(id, null);
            } else {
                c3741s.f15722b.put(id, view);
            }
        }
        String m3806M = C0690v.m3806M(view);
        if (m3806M != null) {
            if (c3741s.f15724d.containsKey(m3806M)) {
                c3741s.f15724d.put(m3806M, null);
            } else {
                c3741s.f15724d.put(m3806M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c3741s.f15723c.m14807k(itemIdAtPosition) >= 0) {
                    View m14805h = c3741s.f15723c.m14805h(itemIdAtPosition);
                    if (m14805h != null) {
                        C0690v.m3869y0(m14805h, false);
                        c3741s.f15723c.m14809n(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0690v.m3869y0(view, true);
                c3741s.f15723c.m14809n(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: k */
    private void m15875k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f15687v;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f15688w;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f15689x;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f15689x.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C3740r c3740r = new C3740r(view);
                    if (z10) {
                        mo15817n(c3740r);
                    } else {
                        mo15816j(c3740r);
                    }
                    c3740r.f15720c.add(this);
                    mo15902m(c3740r);
                    if (z10) {
                        m15874g(this.f15662C, view, c3740r);
                    } else {
                        m15874g(this.f15663D, view, c3740r);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f15691z;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f15660A;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f15661B;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f15661B.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                m15875k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public AbstractC3727g m15876A() {
        return this.f15678S;
    }

    /* renamed from: B */
    public AbstractC3737o m15877B() {
        return null;
    }

    /* renamed from: D */
    public long m15878D() {
        return this.f15680o;
    }

    /* renamed from: E */
    public List<Integer> m15879E() {
        return this.f15683r;
    }

    /* renamed from: F */
    public List<String> m15880F() {
        return this.f15685t;
    }

    /* renamed from: G */
    public List<Class<?>> m15881G() {
        return this.f15686u;
    }

    /* renamed from: H */
    public List<View> m15882H() {
        return this.f15684s;
    }

    /* renamed from: I */
    public String[] mo15815I() {
        return null;
    }

    /* renamed from: J */
    public C3740r m15883J(View view, boolean z10) {
        C3738p c3738p = this.f15664E;
        if (c3738p != null) {
            return c3738p.m15883J(view, z10);
        }
        return (z10 ? this.f15662C : this.f15663D).f15721a.get(view);
    }

    /* renamed from: K */
    public boolean mo15853K(C3740r c3740r, C3740r c3740r2) {
        if (c3740r == null || c3740r2 == null) {
            return false;
        }
        String[] mo15815I = mo15815I();
        if (mo15815I != null) {
            for (String str : mo15815I) {
                if (!m15866M(c3740r, c3740r2, str)) {
                }
            }
            return false;
        }
        Iterator<String> it = c3740r.f15718a.keySet().iterator();
        while (it.hasNext()) {
            if (m15866M(c3740r, c3740r2, it.next())) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: L */
    public boolean m15884L(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f15687v;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f15688w;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f15689x;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15689x.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f15690y != null && C0690v.m3806M(view) != null && this.f15690y.contains(C0690v.m3806M(view))) {
            return false;
        }
        if ((this.f15683r.size() == 0 && this.f15684s.size() == 0 && (((arrayList = this.f15686u) == null || arrayList.isEmpty()) && ((arrayList2 = this.f15685t) == null || arrayList2.isEmpty()))) || this.f15683r.contains(Integer.valueOf(id)) || this.f15684s.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f15685t;
        if (arrayList6 != null && arrayList6.contains(C0690v.m3806M(view))) {
            return true;
        }
        if (this.f15686u != null) {
            for (int i11 = 0; i11 < this.f15686u.size(); i11++) {
                if (this.f15686u.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: V */
    public void mo15885V(View view) {
        if (this.f15673N) {
            return;
        }
        C3356a<Animator, d> m15865C = m15865C();
        int size = m15865C.size();
        InterfaceC3730h0 m15944d = C3747y.m15944d(view);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d m14844m = m15865C.m14844m(i10);
            if (m14844m.f15695a != null && m15944d.equals(m14844m.f15698d)) {
                C3715a.m15807b(m15865C.m14840i(i10));
            }
        }
        ArrayList<f> arrayList = this.f15674O;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f15674O.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).mo15834e(this);
            }
        }
        this.f15672M = true;
    }

    /* renamed from: Y */
    public void m15886Y(ViewGroup viewGroup) {
        d dVar;
        this.f15666G = new ArrayList<>();
        this.f15667H = new ArrayList<>();
        m15871U(this.f15662C, this.f15663D);
        C3356a<Animator, d> m15865C = m15865C();
        int size = m15865C.size();
        InterfaceC3730h0 m15944d = C3747y.m15944d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator m14840i = m15865C.m14840i(i10);
            if (m14840i != null && (dVar = m15865C.get(m14840i)) != null && dVar.f15695a != null && m15944d.equals(dVar.f15698d)) {
                C3740r c3740r = dVar.f15697c;
                View view = dVar.f15695a;
                C3740r m15883J = m15883J(view, true);
                C3740r m15911x = m15911x(view, true);
                if (m15883J == null && m15911x == null) {
                    m15911x = this.f15663D.f15721a.get(view);
                }
                if (!(m15883J == null && m15911x == null) && dVar.f15699e.mo15853K(c3740r, m15911x)) {
                    if (!m14840i.isRunning() && !m14840i.isStarted()) {
                        m15865C.remove(m14840i);
                    } else {
                        m14840i.cancel();
                    }
                }
            }
        }
        mo15906s(viewGroup, this.f15662C, this.f15663D, this.f15666G, this.f15667H);
        mo15892d0();
    }

    /* renamed from: Z */
    public AbstractC3734l mo15887Z(f fVar) {
        ArrayList<f> arrayList = this.f15674O;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f15674O.size() == 0) {
            this.f15674O = null;
        }
        return this;
    }

    /* renamed from: a */
    public AbstractC3734l mo15888a(f fVar) {
        if (this.f15674O == null) {
            this.f15674O = new ArrayList<>();
        }
        this.f15674O.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public AbstractC3734l mo15889a0(View view) {
        this.f15684s.remove(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo15890b0(View view) {
        if (this.f15672M) {
            if (!this.f15673N) {
                C3356a<Animator, d> m15865C = m15865C();
                int size = m15865C.size();
                InterfaceC3730h0 m15944d = C3747y.m15944d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d m14844m = m15865C.m14844m(i10);
                    if (m14844m.f15695a != null && m15944d.equals(m14844m.f15698d)) {
                        C3715a.m15808c(m15865C.m14840i(i10));
                    }
                }
                ArrayList<f> arrayList = this.f15674O;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f15674O.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).mo15833d(this);
                    }
                }
            }
            this.f15672M = false;
        }
    }

    public void cancel() {
        for (int size = this.f15670K.size() - 1; size >= 0; size--) {
            this.f15670K.get(size).cancel();
        }
        ArrayList<f> arrayList = this.f15674O;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f15674O.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).mo15831a(this);
        }
    }

    /* renamed from: d */
    public AbstractC3734l mo15891d(View view) {
        this.f15684s.add(view);
        return this;
    }

    /* renamed from: d0 */
    public void mo15892d0() {
        m15900k0();
        C3356a<Animator, d> m15865C = m15865C();
        Iterator<Animator> it = this.f15675P.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m15865C.containsKey(next)) {
                m15900k0();
                m15872c0(next, m15865C);
            }
        }
        this.f15675P.clear();
        m15907t();
    }

    /* renamed from: e0 */
    public AbstractC3734l mo15893e0(long j10) {
        this.f15681p = j10;
        return this;
    }

    /* renamed from: f0 */
    public void mo15894f0(e eVar) {
        this.f15676Q = eVar;
    }

    /* renamed from: g0 */
    public AbstractC3734l mo15895g0(TimeInterpolator timeInterpolator) {
        this.f15682q = timeInterpolator;
        return this;
    }

    /* renamed from: h */
    protected void m15896h(Animator animator) {
        if (animator == null) {
            m15907t();
            return;
        }
        if (m15908u() >= 0) {
            animator.setDuration(m15908u());
        }
        if (m15878D() >= 0) {
            animator.setStartDelay(m15878D() + animator.getStartDelay());
        }
        if (m15910w() != null) {
            animator.setInterpolator(m15910w());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* renamed from: h0 */
    public void mo15897h0(AbstractC3727g abstractC3727g) {
        if (abstractC3727g == null) {
            this.f15678S = f15658U;
        } else {
            this.f15678S = abstractC3727g;
        }
    }

    /* renamed from: i0 */
    public void mo15898i0(AbstractC3737o abstractC3737o) {
    }

    /* renamed from: j */
    public abstract void mo15816j(C3740r c3740r);

    /* renamed from: j0 */
    public AbstractC3734l mo15899j0(long j10) {
        this.f15680o = j10;
        return this;
    }

    /* renamed from: k0 */
    public void m15900k0() {
        if (this.f15671L == 0) {
            ArrayList<f> arrayList = this.f15674O;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f15674O.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).mo15846c(this);
                }
            }
            this.f15673N = false;
        }
        this.f15671L++;
    }

    /* renamed from: l0 */
    public String mo15901l0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f15681p != -1) {
            str2 = str2 + "dur(" + this.f15681p + ") ";
        }
        if (this.f15680o != -1) {
            str2 = str2 + "dly(" + this.f15680o + ") ";
        }
        if (this.f15682q != null) {
            str2 = str2 + "interp(" + this.f15682q + ") ";
        }
        if (this.f15683r.size() <= 0 && this.f15684s.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f15683r.size() > 0) {
            for (int i10 = 0; i10 < this.f15683r.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f15683r.get(i10);
            }
        }
        if (this.f15684s.size() > 0) {
            for (int i11 = 0; i11 < this.f15684s.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f15684s.get(i11);
            }
        }
        return str3 + ")";
    }

    /* renamed from: m */
    public void mo15902m(C3740r c3740r) {
    }

    /* renamed from: n */
    public abstract void mo15817n(C3740r c3740r);

    /* renamed from: o */
    public void m15903o(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C3356a<String, String> c3356a;
        m15904p(z10);
        if ((this.f15683r.size() <= 0 && this.f15684s.size() <= 0) || (((arrayList = this.f15685t) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f15686u) != null && !arrayList2.isEmpty()))) {
            m15875k(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f15683r.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f15683r.get(i10).intValue());
                if (findViewById != null) {
                    C3740r c3740r = new C3740r(findViewById);
                    if (z10) {
                        mo15817n(c3740r);
                    } else {
                        mo15816j(c3740r);
                    }
                    c3740r.f15720c.add(this);
                    mo15902m(c3740r);
                    if (z10) {
                        m15874g(this.f15662C, findViewById, c3740r);
                    } else {
                        m15874g(this.f15663D, findViewById, c3740r);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f15684s.size(); i11++) {
                View view = this.f15684s.get(i11);
                C3740r c3740r2 = new C3740r(view);
                if (z10) {
                    mo15817n(c3740r2);
                } else {
                    mo15816j(c3740r2);
                }
                c3740r2.f15720c.add(this);
                mo15902m(c3740r2);
                if (z10) {
                    m15874g(this.f15662C, view, c3740r2);
                } else {
                    m15874g(this.f15663D, view, c3740r2);
                }
            }
        }
        if (z10 || (c3356a = this.f15677R) == null) {
            return;
        }
        int size = c3356a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f15662C.f15724d.remove(this.f15677R.m14840i(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f15662C.f15724d.put(this.f15677R.m14844m(i13), view2);
            }
        }
    }

    /* renamed from: p */
    public void m15904p(boolean z10) {
        if (z10) {
            this.f15662C.f15721a.clear();
            this.f15662C.f15722b.clear();
            this.f15662C.f15723c.m14803d();
        } else {
            this.f15663D.f15721a.clear();
            this.f15663D.f15722b.clear();
            this.f15663D.f15723c.m14803d();
        }
    }

    @Override // 
    /* renamed from: q */
    public AbstractC3734l clone() {
        try {
            AbstractC3734l abstractC3734l = (AbstractC3734l) super.clone();
            abstractC3734l.f15675P = new ArrayList<>();
            abstractC3734l.f15662C = new C3741s();
            abstractC3734l.f15663D = new C3741s();
            abstractC3734l.f15666G = null;
            abstractC3734l.f15667H = null;
            return abstractC3734l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public Animator mo15818r(ViewGroup viewGroup, C3740r c3740r, C3740r c3740r2) {
        return null;
    }

    /* renamed from: s */
    public void mo15906s(ViewGroup viewGroup, C3741s c3741s, C3741s c3741s2, ArrayList<C3740r> arrayList, ArrayList<C3740r> arrayList2) {
        int i10;
        View view;
        Animator animator;
        C3740r c3740r;
        Animator animator2;
        C3740r c3740r2;
        C3356a<Animator, d> m15865C = m15865C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C3740r c3740r3 = arrayList.get(i11);
            C3740r c3740r4 = arrayList2.get(i11);
            if (c3740r3 != null && !c3740r3.f15720c.contains(this)) {
                c3740r3 = null;
            }
            if (c3740r4 != null && !c3740r4.f15720c.contains(this)) {
                c3740r4 = null;
            }
            if (c3740r3 != null || c3740r4 != null) {
                if (c3740r3 == null || c3740r4 == null || mo15853K(c3740r3, c3740r4)) {
                    Animator mo15818r = mo15818r(viewGroup, c3740r3, c3740r4);
                    if (mo15818r != null) {
                        if (c3740r4 != null) {
                            View view2 = c3740r4.f15719b;
                            String[] mo15815I = mo15815I();
                            if (mo15815I != null && mo15815I.length > 0) {
                                c3740r2 = new C3740r(view2);
                                C3740r c3740r5 = c3741s2.f15721a.get(view2);
                                if (c3740r5 != null) {
                                    int i12 = 0;
                                    while (i12 < mo15815I.length) {
                                        c3740r2.f15718a.put(mo15815I[i12], c3740r5.f15718a.get(mo15815I[i12]));
                                        i12++;
                                        mo15818r = mo15818r;
                                        size = size;
                                        c3740r5 = c3740r5;
                                    }
                                }
                                Animator animator3 = mo15818r;
                                i10 = size;
                                int size2 = m15865C.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = m15865C.get(m15865C.m14840i(i13));
                                    if (dVar.f15697c != null && dVar.f15695a == view2 && dVar.f15696b.equals(m15912y()) && dVar.f15697c.equals(c3740r2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i10 = size;
                                animator2 = mo15818r;
                                c3740r2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c3740r = c3740r2;
                        } else {
                            i10 = size;
                            view = c3740r3.f15719b;
                            animator = mo15818r;
                            c3740r = null;
                        }
                        if (animator != null) {
                            m15865C.put(animator, new d(view, m15912y(), this, C3747y.m15944d(viewGroup), c3740r));
                            this.f15675P.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.f15675P.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: t */
    public void m15907t() {
        int i10 = this.f15671L - 1;
        this.f15671L = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.f15674O;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f15674O.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).mo15832b(this);
                }
            }
            for (int i12 = 0; i12 < this.f15662C.f15723c.m14812q(); i12++) {
                View m14813r = this.f15662C.f15723c.m14813r(i12);
                if (m14813r != null) {
                    C0690v.m3869y0(m14813r, false);
                }
            }
            for (int i13 = 0; i13 < this.f15663D.f15723c.m14812q(); i13++) {
                View m14813r2 = this.f15663D.f15723c.m14813r(i13);
                if (m14813r2 != null) {
                    C0690v.m3869y0(m14813r2, false);
                }
            }
            this.f15673N = true;
        }
    }

    public String toString() {
        return mo15901l0(BuildConfig.FLAVOR);
    }

    /* renamed from: u */
    public long m15908u() {
        return this.f15681p;
    }

    /* renamed from: v */
    public e m15909v() {
        return this.f15676Q;
    }

    /* renamed from: w */
    public TimeInterpolator m15910w() {
        return this.f15682q;
    }

    /* renamed from: x */
    public C3740r m15911x(View view, boolean z10) {
        C3738p c3738p = this.f15664E;
        if (c3738p != null) {
            return c3738p.m15911x(view, z10);
        }
        ArrayList<C3740r> arrayList = z10 ? this.f15666G : this.f15667H;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            C3740r c3740r = arrayList.get(i11);
            if (c3740r == null) {
                return null;
            }
            if (c3740r.f15719b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f15667H : this.f15666G).get(i10);
        }
        return null;
    }

    /* renamed from: y */
    public String m15912y() {
        return this.f15679n;
    }
}
