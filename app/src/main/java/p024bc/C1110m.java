package p024bc;

import cc.InterfaceC1165a;
import cc.InterfaceC1166b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bc.m */
/* loaded from: classes.dex */
class C1110m {

    /* renamed from: d */
    private static final Map<Class<?>, List<C1109l>> f5425d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final a[] f5426e = new a[4];

    /* renamed from: a */
    private List<InterfaceC1166b> f5427a;

    /* renamed from: b */
    private final boolean f5428b;

    /* renamed from: c */
    private final boolean f5429c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final List<C1109l> f5430a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f5431b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f5432c = new HashMap();

        /* renamed from: d */
        final StringBuilder f5433d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f5434e;

        /* renamed from: f */
        Class<?> f5435f;

        /* renamed from: g */
        boolean f5436g;

        /* renamed from: h */
        InterfaceC1165a f5437h;

        a() {
        }

        /* renamed from: b */
        private boolean m6488b(Method method, Class<?> cls) {
            this.f5433d.setLength(0);
            this.f5433d.append(method.getName());
            StringBuilder sb2 = this.f5433d;
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = this.f5433d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f5432c.put(sb3, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f5432c.put(sb3, put);
            return false;
        }

        /* renamed from: a */
        boolean m6489a(Method method, Class<?> cls) {
            Object put = this.f5431b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m6488b((Method) put, cls)) {
                    this.f5431b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m6488b(method, cls);
        }

        /* renamed from: c */
        void m6490c(Class<?> cls) {
            this.f5435f = cls;
            this.f5434e = cls;
            this.f5436g = false;
            this.f5437h = null;
        }

        /* renamed from: d */
        void m6491d() {
            if (this.f5436g) {
                this.f5435f = null;
                return;
            }
            Class<? super Object> superclass = this.f5435f.getSuperclass();
            this.f5435f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f5435f = null;
            }
        }

        /* renamed from: e */
        void m6492e() {
            this.f5430a.clear();
            this.f5431b.clear();
            this.f5432c.clear();
            this.f5433d.setLength(0);
            this.f5434e = null;
            this.f5435f = null;
            this.f5436g = false;
            this.f5437h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1110m(List<InterfaceC1166b> list, boolean z10, boolean z11) {
        this.f5427a = list;
        this.f5428b = z10;
        this.f5429c = z11;
    }

    /* renamed from: b */
    private List<C1109l> m6481b(Class<?> cls) {
        a m6486g = m6486g();
        m6486g.m6490c(cls);
        while (m6486g.f5435f != null) {
            InterfaceC1165a m6485f = m6485f(m6486g);
            m6486g.f5437h = m6485f;
            if (m6485f != null) {
                for (C1109l c1109l : m6485f.m6769a()) {
                    if (m6486g.m6489a(c1109l.f5419a, c1109l.f5421c)) {
                        m6486g.f5430a.add(c1109l);
                    }
                }
            } else {
                m6483d(m6486g);
            }
            m6486g.m6491d();
        }
        return m6484e(m6486g);
    }

    /* renamed from: c */
    private List<C1109l> m6482c(Class<?> cls) {
        a m6486g = m6486g();
        m6486g.m6490c(cls);
        while (m6486g.f5435f != null) {
            m6483d(m6486g);
            m6486g.m6491d();
        }
        return m6484e(m6486g);
    }

    /* renamed from: d */
    private void m6483d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f5435f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f5435f.getMethods();
            aVar.f5436g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    InterfaceC1107j interfaceC1107j = (InterfaceC1107j) method.getAnnotation(InterfaceC1107j.class);
                    if (interfaceC1107j != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.m6489a(method, cls)) {
                            aVar.f5430a.add(new C1109l(method, cls, interfaceC1107j.threadMode(), interfaceC1107j.priority(), interfaceC1107j.sticky()));
                        }
                    }
                } else if (this.f5428b && method.isAnnotationPresent(InterfaceC1107j.class)) {
                    throw new C1102e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f5428b && method.isAnnotationPresent(InterfaceC1107j.class)) {
                throw new C1102e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    /* renamed from: e */
    private List<C1109l> m6484e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f5430a);
        aVar.m6492e();
        synchronized (f5426e) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                a[] aVarArr = f5426e;
                if (aVarArr[i10] == null) {
                    aVarArr[i10] = aVar;
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private InterfaceC1165a m6485f(a aVar) {
        InterfaceC1165a interfaceC1165a = aVar.f5437h;
        if (interfaceC1165a != null && interfaceC1165a.m6771c() != null) {
            InterfaceC1165a m6771c = aVar.f5437h.m6771c();
            if (aVar.f5435f == m6771c.m6770b()) {
                return m6771c;
            }
        }
        List<InterfaceC1166b> list = this.f5427a;
        if (list == null) {
            return null;
        }
        Iterator<InterfaceC1166b> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1165a m6772a = it.next().m6772a(aVar.f5435f);
            if (m6772a != null) {
                return m6772a;
            }
        }
        return null;
    }

    /* renamed from: g */
    private a m6486g() {
        synchronized (f5426e) {
            for (int i10 = 0; i10 < 4; i10++) {
                a[] aVarArr = f5426e;
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    aVarArr[i10] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C1109l> m6487a(Class<?> cls) {
        List<C1109l> m6481b;
        Map<Class<?>, List<C1109l>> map = f5425d;
        List<C1109l> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.f5429c) {
            m6481b = m6482c(cls);
        } else {
            m6481b = m6481b(cls);
        }
        if (!m6481b.isEmpty()) {
            map.put(cls, m6481b);
            return m6481b;
        }
        throw new C1102e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
