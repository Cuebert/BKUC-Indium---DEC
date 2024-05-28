package p279w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p279w.InterfaceC5061o0;

/* renamed from: w.k0 */
/* loaded from: classes.dex */
public final class C5045k0 {

    /* renamed from: h */
    public static final InterfaceC5061o0.a<Integer> f19211h = InterfaceC5061o0.a.m19653a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: i */
    public static final InterfaceC5061o0.a<Integer> f19212i = InterfaceC5061o0.a.m19653a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    final List<AbstractC5073r0> f19213a;

    /* renamed from: b */
    final InterfaceC5061o0 f19214b;

    /* renamed from: c */
    final int f19215c;

    /* renamed from: d */
    final List<AbstractC5032h> f19216d;

    /* renamed from: e */
    private final boolean f19217e;

    /* renamed from: f */
    private final C5043j2 f19218f;

    /* renamed from: g */
    private final InterfaceC5068q f19219g;

    /* renamed from: w.k0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo1337a(InterfaceC5063o2<?> interfaceC5063o2, a aVar);
    }

    C5045k0(List<AbstractC5073r0> list, InterfaceC5061o0 interfaceC5061o0, int i10, List<AbstractC5032h> list2, boolean z10, C5043j2 c5043j2, InterfaceC5068q interfaceC5068q) {
        this.f19213a = list;
        this.f19214b = interfaceC5061o0;
        this.f19215c = i10;
        this.f19216d = Collections.unmodifiableList(list2);
        this.f19217e = z10;
        this.f19218f = c5043j2;
        this.f19219g = interfaceC5068q;
    }

    /* renamed from: a */
    public static C5045k0 m19580a() {
        return new a().m19597h();
    }

    /* renamed from: b */
    public List<AbstractC5032h> m19581b() {
        return this.f19216d;
    }

    /* renamed from: c */
    public InterfaceC5068q m19582c() {
        return this.f19219g;
    }

    /* renamed from: d */
    public InterfaceC5061o0 m19583d() {
        return this.f19214b;
    }

    /* renamed from: e */
    public List<AbstractC5073r0> m19584e() {
        return Collections.unmodifiableList(this.f19213a);
    }

    /* renamed from: f */
    public C5043j2 m19585f() {
        return this.f19218f;
    }

    /* renamed from: g */
    public int m19586g() {
        return this.f19215c;
    }

    /* renamed from: h */
    public boolean m19587h() {
        return this.f19217e;
    }

    /* renamed from: w.k0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Set<AbstractC5073r0> f19220a;

        /* renamed from: b */
        private InterfaceC5066p1 f19221b;

        /* renamed from: c */
        private int f19222c;

        /* renamed from: d */
        private List<AbstractC5032h> f19223d;

        /* renamed from: e */
        private boolean f19224e;

        /* renamed from: f */
        private C5074r1 f19225f;

        /* renamed from: g */
        private InterfaceC5068q f19226g;

        public a() {
            this.f19220a = new HashSet();
            this.f19221b = C5070q1.m19660L();
            this.f19222c = -1;
            this.f19223d = new ArrayList();
            this.f19224e = false;
            this.f19225f = C5074r1.m19686f();
        }

        /* renamed from: j */
        public static a m19588j(InterfaceC5063o2<?> interfaceC5063o2) {
            b mo1371j = interfaceC5063o2.mo1371j(null);
            if (mo1371j != null) {
                a aVar = new a();
                mo1371j.mo1337a(interfaceC5063o2, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC5063o2.mo1363B(interfaceC5063o2.toString()));
        }

        /* renamed from: k */
        public static a m19589k(C5045k0 c5045k0) {
            return new a(c5045k0);
        }

        /* renamed from: a */
        public void m19590a(Collection<AbstractC5032h> collection) {
            Iterator<AbstractC5032h> it = collection.iterator();
            while (it.hasNext()) {
                m19592c(it.next());
            }
        }

        /* renamed from: b */
        public void m19591b(C5043j2 c5043j2) {
            this.f19225f.m19688e(c5043j2);
        }

        /* renamed from: c */
        public void m19592c(AbstractC5032h abstractC5032h) {
            if (this.f19223d.contains(abstractC5032h)) {
                return;
            }
            this.f19223d.add(abstractC5032h);
        }

        /* renamed from: d */
        public <T> void m19593d(InterfaceC5061o0.a<T> aVar, T t10) {
            this.f19221b.mo19659g(aVar, t10);
        }

        /* renamed from: e */
        public void m19594e(InterfaceC5061o0 interfaceC5061o0) {
            for (InterfaceC5061o0.a<?> aVar : interfaceC5061o0.mo1367c()) {
                Object mo1365a = this.f19221b.mo1365a(aVar, null);
                Object mo1366b = interfaceC5061o0.mo1366b(aVar);
                if (mo1365a instanceof AbstractC5062o1) {
                    ((AbstractC5062o1) mo1365a).m19655a(((AbstractC5062o1) mo1366b).m19656c());
                } else {
                    if (mo1366b instanceof AbstractC5062o1) {
                        mo1366b = ((AbstractC5062o1) mo1366b).clone();
                    }
                    this.f19221b.mo19658G(aVar, interfaceC5061o0.mo1368d(aVar), mo1366b);
                }
            }
        }

        /* renamed from: f */
        public void m19595f(AbstractC5073r0 abstractC5073r0) {
            this.f19220a.add(abstractC5073r0);
        }

        /* renamed from: g */
        public void m19596g(String str, Object obj) {
            this.f19225f.m19689h(str, obj);
        }

        /* renamed from: h */
        public C5045k0 m19597h() {
            return new C5045k0(new ArrayList(this.f19220a), C5083u1.m19702J(this.f19221b), this.f19222c, this.f19223d, this.f19224e, C5043j2.m19577b(this.f19225f), this.f19226g);
        }

        /* renamed from: i */
        public void m19598i() {
            this.f19220a.clear();
        }

        /* renamed from: l */
        public Set<AbstractC5073r0> m19599l() {
            return this.f19220a;
        }

        /* renamed from: m */
        public int m19600m() {
            return this.f19222c;
        }

        /* renamed from: n */
        public void m19601n(InterfaceC5068q interfaceC5068q) {
            this.f19226g = interfaceC5068q;
        }

        /* renamed from: o */
        public void m19602o(InterfaceC5061o0 interfaceC5061o0) {
            this.f19221b = C5070q1.m19661M(interfaceC5061o0);
        }

        /* renamed from: p */
        public void m19603p(int i10) {
            this.f19222c = i10;
        }

        /* renamed from: q */
        public void m19604q(boolean z10) {
            this.f19224e = z10;
        }

        private a(C5045k0 c5045k0) {
            HashSet hashSet = new HashSet();
            this.f19220a = hashSet;
            this.f19221b = C5070q1.m19660L();
            this.f19222c = -1;
            this.f19223d = new ArrayList();
            this.f19224e = false;
            this.f19225f = C5074r1.m19686f();
            hashSet.addAll(c5045k0.f19213a);
            this.f19221b = C5070q1.m19661M(c5045k0.f19214b);
            this.f19222c = c5045k0.f19215c;
            this.f19223d.addAll(c5045k0.m19581b());
            this.f19224e = c5045k0.m19587h();
            this.f19225f = C5074r1.m19687g(c5045k0.m19585f());
        }
    }
}
