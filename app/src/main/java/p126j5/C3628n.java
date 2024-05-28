package p126j5;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p126j5.C3628n;
import p139k5.InterfaceC3758a;
import p200p5.InterfaceC4271c;
import p200p5.InterfaceC4272d;
import p248t5.InterfaceC4733b;

/* renamed from: j5.n */
/* loaded from: classes.dex */
public class C3628n extends AbstractC3611a implements InterfaceC3758a {

    /* renamed from: g */
    private static final InterfaceC4733b<Set<Object>> f15285g = C3627m.f15284a;

    /* renamed from: a */
    private final Map<C3617d<?>, InterfaceC4733b<?>> f15286a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4733b<?>> f15287b;

    /* renamed from: c */
    private final Map<Class<?>, C3638x<?>> f15288c;

    /* renamed from: d */
    private final List<InterfaceC4733b<InterfaceC3623i>> f15289d;

    /* renamed from: e */
    private final C3635u f15290e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f15291f;

    /* renamed from: j5.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f15292a;

        /* renamed from: b */
        private final List<InterfaceC4733b<InterfaceC3623i>> f15293b = new ArrayList();

        /* renamed from: c */
        private final List<C3617d<?>> f15294c = new ArrayList();

        b(Executor executor) {
            this.f15292a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ InterfaceC3623i m15511f(InterfaceC3623i interfaceC3623i) {
            return interfaceC3623i;
        }

        /* renamed from: b */
        public b m15512b(C3617d<?> c3617d) {
            this.f15294c.add(c3617d);
            return this;
        }

        /* renamed from: c */
        public b m15513c(InterfaceC3623i interfaceC3623i) {
            this.f15293b.add(new InterfaceC4733b() { // from class: j5.o
                public /* synthetic */ C3629o() {
                }

                @Override // p248t5.InterfaceC4733b
                public final Object get() {
                    InterfaceC3623i m15511f;
                    m15511f = C3628n.b.m15511f(InterfaceC3623i.this);
                    return m15511f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public b m15514d(Collection<InterfaceC4733b<InterfaceC3623i>> collection) {
            this.f15293b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C3628n m15515e() {
            return new C3628n(this.f15292a, this.f15293b, this.f15294c);
        }
    }

    /* synthetic */ C3628n(Executor executor, Iterable iterable, Collection collection, a aVar) {
        this(executor, iterable, collection);
    }

    /* renamed from: h */
    public static b m15498h(Executor executor) {
        return new b(executor);
    }

    /* renamed from: i */
    private void m15499i(List<C3617d<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC4733b<InterfaceC3623i>> it = this.f15289d.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC3623i interfaceC3623i = it.next().get();
                    if (interfaceC3623i != null) {
                        list.addAll(interfaceC3623i.getComponents());
                        it.remove();
                    }
                } catch (C3636v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f15286a.isEmpty()) {
                C3630p.m15516a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f15286a.keySet());
                arrayList2.addAll(list);
                C3630p.m15516a(arrayList2);
            }
            for (C3617d<?> c3617d : list) {
                this.f15286a.put(c3617d, new C3637w(new InterfaceC4733b() { // from class: j5.l

                    /* renamed from: b */
                    public final /* synthetic */ C3617d f15283b;

                    public /* synthetic */ C3626l(C3617d c3617d2) {
                        r2 = c3617d2;
                    }

                    @Override // p248t5.InterfaceC4733b
                    public final Object get() {
                        Object m15502m;
                        m15502m = C3628n.this.m15502m(r2);
                        return m15502m;
                    }
                }));
            }
            arrayList.addAll(m15507r(list));
            arrayList.addAll(m15508s());
            m15506q();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        m15505p();
    }

    /* renamed from: j */
    private void m15500j(Map<C3617d<?>, InterfaceC4733b<?>> map, boolean z10) {
        for (Map.Entry<C3617d<?>, InterfaceC4733b<?>> entry : map.entrySet()) {
            C3617d<?> key = entry.getKey();
            InterfaceC4733b<?> value = entry.getValue();
            if (key.m15473k() || (key.m15474l() && z10)) {
                value.get();
            }
        }
        this.f15290e.m15542d();
    }

    /* renamed from: l */
    private static <T> List<T> m15501l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: m */
    public /* synthetic */ Object m15502m(C3617d c3617d) {
        return c3617d.m15470f().mo230a(new C3618d0(c3617d, this));
    }

    /* renamed from: p */
    private void m15505p() {
        Boolean bool = this.f15291f.get();
        if (bool != null) {
            m15500j(this.f15286a, bool.booleanValue());
        }
    }

    /* renamed from: q */
    private void m15506q() {
        for (C3617d<?> c3617d : this.f15286a.keySet()) {
            for (C3631q c3631q : c3617d.m15469e()) {
                if (c3631q.m15536f() && !this.f15288c.containsKey(c3631q.m15532b())) {
                    this.f15288c.put(c3631q.m15532b(), C3638x.m15544b(Collections.emptySet()));
                } else if (this.f15287b.containsKey(c3631q.m15532b())) {
                    continue;
                } else if (!c3631q.m15535e()) {
                    if (!c3631q.m15536f()) {
                        this.f15287b.put(c3631q.m15532b(), C3614b0.m15452c());
                    }
                } else {
                    throw new C3639y(String.format("Unsatisfied dependency for component %s: %s", c3617d, c3631q.m15532b()));
                }
            }
        }
    }

    /* renamed from: r */
    private List<Runnable> m15507r(List<C3617d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C3617d<?> c3617d : list) {
            if (c3617d.m15475m()) {
                InterfaceC4733b<?> interfaceC4733b = this.f15286a.get(c3617d);
                for (Class<? super Object> cls : c3617d.m15471g()) {
                    if (!this.f15287b.containsKey(cls)) {
                        this.f15287b.put(cls, interfaceC4733b);
                    } else {
                        arrayList.add(new Runnable() { // from class: j5.k

                            /* renamed from: o */
                            public final /* synthetic */ InterfaceC4733b f15281o;

                            public /* synthetic */ RunnableC3625k(InterfaceC4733b interfaceC4733b2) {
                                r2 = interfaceC4733b2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3614b0.this.m15455f(r2);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: j5.j.<init>(j5.x, t5.b):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: s */
    private java.util.List<java.lang.Runnable> m15508s() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map<j5.d<?>, t5.b<?>> r2 = r7.f15286a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            j5.d r4 = (p126j5.C3617d) r4
            boolean r5 = r4.m15475m()
            if (r5 == 0) goto L2d
            goto L14
        L2d:
            java.lang.Object r3 = r3.getValue()
            t5.b r3 = (p248t5.InterfaceC4733b) r3
            java.util.Set r4 = r4.m15471g()
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L14
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L55
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r1.put(r5, r6)
        L55:
            java.lang.Object r5 = r1.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            goto L3b
        L5f:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.Class<?>, j5.x<?>> r3 = r7.f15288c
            java.lang.Object r4 = r2.getKey()
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L95
            java.util.Map<java.lang.Class<?>, j5.x<?>> r3 = r7.f15288c
            java.lang.Object r4 = r2.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            j5.x r2 = p126j5.C3638x.m15544b(r2)
            r3.put(r4, r2)
            goto L67
        L95:
            java.util.Map<java.lang.Class<?>, j5.x<?>> r3 = r7.f15288c
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            j5.x r3 = (p126j5.C3638x) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        Lab:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r2.next()
            t5.b r4 = (p248t5.InterfaceC4733b) r4
            j5.j r5 = new j5.j
            r5.<init>()
            r0.add(r5)
            goto Lab
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p126j5.C3628n.m15508s():java.util.List");
    }

    @Override // p126j5.AbstractC3611a, p126j5.InterfaceC3619e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo15448a(Class cls) {
        return super.mo15448a(cls);
    }

    @Override // p126j5.AbstractC3611a, p126j5.InterfaceC3619e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Set mo15449b(Class cls) {
        return super.mo15449b(cls);
    }

    @Override // p126j5.InterfaceC3619e
    /* renamed from: c */
    public synchronized <T> InterfaceC4733b<T> mo15485c(Class<T> cls) {
        C3616c0.m15458c(cls, "Null interface requested.");
        return (InterfaceC4733b) this.f15287b.get(cls);
    }

    @Override // p126j5.InterfaceC3619e
    /* renamed from: d */
    public synchronized <T> InterfaceC4733b<Set<T>> mo15486d(Class<T> cls) {
        C3638x<?> c3638x = this.f15288c.get(cls);
        if (c3638x != null) {
            return c3638x;
        }
        return (InterfaceC4733b<Set<T>>) f15285g;
    }

    /* renamed from: k */
    public void m15509k(boolean z10) {
        HashMap hashMap;
        if (this.f15291f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f15286a);
            }
            m15500j(hashMap, z10);
        }
    }

    private C3628n(Executor executor, Iterable<InterfaceC4733b<InterfaceC3623i>> iterable, Collection<C3617d<?>> collection) {
        this.f15286a = new HashMap();
        this.f15287b = new HashMap();
        this.f15288c = new HashMap();
        this.f15291f = new AtomicReference<>();
        C3635u c3635u = new C3635u(executor);
        this.f15290e = c3635u;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3617d.m15468p(c3635u, C3635u.class, InterfaceC4272d.class, InterfaceC4271c.class));
        arrayList.add(C3617d.m15468p(this, InterfaceC3758a.class, new Class[0]));
        for (C3617d<?> c3617d : collection) {
            if (c3617d != null) {
                arrayList.add(c3617d);
            }
        }
        this.f15289d = m15501l(iterable);
        m15499i(arrayList);
    }
}
