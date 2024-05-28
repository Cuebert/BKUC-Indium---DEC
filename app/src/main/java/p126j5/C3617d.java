package p126j5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j5.d */
/* loaded from: classes.dex */
public final class C3617d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f15253a;

    /* renamed from: b */
    private final Set<C3631q> f15254b;

    /* renamed from: c */
    private final int f15255c;

    /* renamed from: d */
    private final int f15256d;

    /* renamed from: e */
    private final InterfaceC3622h<T> f15257e;

    /* renamed from: f */
    private final Set<Class<?>> f15258f;

    /* renamed from: j5.d$b */
    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f15259a;

        /* renamed from: b */
        private final Set<C3631q> f15260b;

        /* renamed from: c */
        private int f15261c;

        /* renamed from: d */
        private int f15262d;

        /* renamed from: e */
        private InterfaceC3622h<T> f15263e;

        /* renamed from: f */
        private Set<Class<?>> f15264f;

        /* synthetic */ b(Class cls, Class[] clsArr, a aVar) {
            this(cls, clsArr);
        }

        /* renamed from: g */
        public b<T> m15477g() {
            this.f15262d = 1;
            return this;
        }

        /* renamed from: h */
        private b<T> m15478h(int i10) {
            C3616c0.m15459d(this.f15261c == 0, "Instantiation type has already been set.");
            this.f15261c = i10;
            return this;
        }

        /* renamed from: i */
        private void m15479i(Class<?> cls) {
            C3616c0.m15456a(!this.f15259a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public b<T> m15480b(C3631q c3631q) {
            C3616c0.m15458c(c3631q, "Null dependency");
            m15479i(c3631q.m15532b());
            this.f15260b.add(c3631q);
            return this;
        }

        /* renamed from: c */
        public b<T> m15481c() {
            return m15478h(1);
        }

        /* renamed from: d */
        public C3617d<T> m15482d() {
            C3616c0.m15459d(this.f15263e != null, "Missing required property: factory.");
            return new C3617d<>(new HashSet(this.f15259a), new HashSet(this.f15260b), this.f15261c, this.f15262d, this.f15263e, this.f15264f);
        }

        /* renamed from: e */
        public b<T> m15483e() {
            return m15478h(2);
        }

        /* renamed from: f */
        public b<T> m15484f(InterfaceC3622h<T> interfaceC3622h) {
            this.f15263e = (InterfaceC3622h) C3616c0.m15458c(interfaceC3622h, "Null factory");
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f15259a = hashSet;
            this.f15260b = new HashSet();
            this.f15261c = 0;
            this.f15262d = 0;
            this.f15264f = new HashSet();
            C3616c0.m15458c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C3616c0.m15458c(cls2, "Null interface");
            }
            Collections.addAll(this.f15259a, clsArr);
        }
    }

    /* synthetic */ C3617d(Set set, Set set2, int i10, int i11, InterfaceC3622h interfaceC3622h, Set set3, a aVar) {
        this(set, set2, i10, i11, interfaceC3622h, set3);
    }

    /* renamed from: c */
    public static <T> b<T> m15462c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> b<T> m15463d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C3617d<T> m15464i(T t10, Class<T> cls) {
        return m15465j(cls).m15484f(new InterfaceC3622h() { // from class: j5.b

            /* renamed from: a */
            public final /* synthetic */ Object f15247a;

            public /* synthetic */ C3613b(Object t102) {
                r1 = t102;
            }

            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                Object m15466n;
                m15466n = C3617d.m15466n(r1, interfaceC3619e);
                return m15466n;
            }
        }).m15482d();
    }

    /* renamed from: j */
    public static <T> b<T> m15465j(Class<T> cls) {
        return m15462c(cls).m15477g();
    }

    /* renamed from: n */
    public static /* synthetic */ Object m15466n(Object obj, InterfaceC3619e interfaceC3619e) {
        return obj;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m15467o(Object obj, InterfaceC3619e interfaceC3619e) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C3617d<T> m15468p(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return m15463d(cls, clsArr).m15484f(new InterfaceC3622h() { // from class: j5.c

            /* renamed from: a */
            public final /* synthetic */ Object f15252a;

            public /* synthetic */ C3615c(Object t102) {
                r1 = t102;
            }

            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                Object m15467o;
                m15467o = C3617d.m15467o(r1, interfaceC3619e);
                return m15467o;
            }
        }).m15482d();
    }

    /* renamed from: e */
    public Set<C3631q> m15469e() {
        return this.f15254b;
    }

    /* renamed from: f */
    public InterfaceC3622h<T> m15470f() {
        return this.f15257e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> m15471g() {
        return this.f15253a;
    }

    /* renamed from: h */
    public Set<Class<?>> m15472h() {
        return this.f15258f;
    }

    /* renamed from: k */
    public boolean m15473k() {
        return this.f15255c == 1;
    }

    /* renamed from: l */
    public boolean m15474l() {
        return this.f15255c == 2;
    }

    /* renamed from: m */
    public boolean m15475m() {
        return this.f15256d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f15253a.toArray()) + ">{" + this.f15255c + ", type=" + this.f15256d + ", deps=" + Arrays.toString(this.f15254b.toArray()) + "}";
    }

    private C3617d(Set<Class<? super T>> set, Set<C3631q> set2, int i10, int i11, InterfaceC3622h<T> interfaceC3622h, Set<Class<?>> set3) {
        this.f15253a = Collections.unmodifiableSet(set);
        this.f15254b = Collections.unmodifiableSet(set2);
        this.f15255c = i10;
        this.f15256d = i11;
        this.f15257e = interfaceC3622h;
        this.f15258f = Collections.unmodifiableSet(set3);
    }
}
