package p091gc;

import com.appsflyer.oaid.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p091gc.C3329a;
import p091gc.InterfaceC3331c;
import p091gc.InterfaceC3334f;
import p193ob.AbstractC4179h0;
import p193ob.AbstractC4183j0;
import p193ob.C4171d0;
import p193ob.C4201z;
import p193ob.InterfaceC4176g;

/* renamed from: gc.u */
/* loaded from: classes.dex */
public final class C3349u {

    /* renamed from: a */
    private final Map<Method, AbstractC3350v<?>> f14008a = new ConcurrentHashMap();

    /* renamed from: b */
    final InterfaceC4176g.a f14009b;

    /* renamed from: c */
    final C4201z f14010c;

    /* renamed from: d */
    final List<InterfaceC3334f.a> f14011d;

    /* renamed from: e */
    final List<InterfaceC3331c.a> f14012e;

    /* renamed from: f */
    final Executor f14013f;

    /* renamed from: g */
    final boolean f14014g;

    /* renamed from: gc.u$a */
    /* loaded from: classes.dex */
    class a implements InvocationHandler {

        /* renamed from: a */
        private final C3345q f14015a = C3345q.m14694f();

        /* renamed from: b */
        private final Object[] f14016b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f14017c;

        a(Class cls) {
            this.f14017c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f14016b;
            }
            if (this.f14015a.m14700h(method)) {
                return this.f14015a.mo14699g(method, this.f14017c, obj, objArr);
            }
            return C3349u.this.m14740c(method).mo14660a(objArr);
        }
    }

    C3349u(InterfaceC4176g.a aVar, C4201z c4201z, List<InterfaceC3334f.a> list, List<InterfaceC3331c.a> list2, Executor executor, boolean z10) {
        this.f14009b = aVar;
        this.f14010c = c4201z;
        this.f14011d = list;
        this.f14012e = list2;
        this.f14013f = executor;
        this.f14014g = z10;
    }

    /* renamed from: j */
    private void m14737j(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f14014g) {
                C3345q m14694f = C3345q.m14694f();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!m14694f.m14700h(method) && !Modifier.isStatic(method.getModifiers())) {
                        m14740c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public InterfaceC3331c<?, ?> m14738a(Type type, Annotation[] annotationArr) {
        return m14741d(null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T m14739b(Class<T> cls) {
        m14737j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    AbstractC3350v<?> m14740c(Method method) {
        AbstractC3350v<?> abstractC3350v;
        AbstractC3350v<?> abstractC3350v2 = this.f14008a.get(method);
        if (abstractC3350v2 != null) {
            return abstractC3350v2;
        }
        synchronized (this.f14008a) {
            abstractC3350v = this.f14008a.get(method);
            if (abstractC3350v == null) {
                abstractC3350v = AbstractC3350v.m14754b(this, method);
                this.f14008a.put(method, abstractC3350v);
            }
        }
        return abstractC3350v;
    }

    /* renamed from: d */
    public InterfaceC3331c<?, ?> m14741d(InterfaceC3331c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f14012e.indexOf(aVar) + 1;
        int size = this.f14012e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC3331c<?, ?> mo14645a = this.f14012e.get(i10).mo14645a(type, annotationArr, this);
            if (mo14645a != null) {
                return mo14645a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f14012e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f14012e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f14012e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: e */
    public <T> InterfaceC3334f<T, AbstractC4179h0> m14742e(InterfaceC3334f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f14011d.indexOf(aVar) + 1;
        int size = this.f14011d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC3334f<T, AbstractC4179h0> interfaceC3334f = (InterfaceC3334f<T, AbstractC4179h0>) this.f14011d.get(i10).mo14627c(type, annotationArr, annotationArr2, this);
            if (interfaceC3334f != null) {
                return interfaceC3334f;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f14011d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f14011d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f14011d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: f */
    public <T> InterfaceC3334f<AbstractC4183j0, T> m14743f(InterfaceC3334f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f14011d.indexOf(aVar) + 1;
        int size = this.f14011d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC3334f<AbstractC4183j0, T> interfaceC3334f = (InterfaceC3334f<AbstractC4183j0, T>) this.f14011d.get(i10).mo14628d(type, annotationArr, this);
            if (interfaceC3334f != null) {
                return interfaceC3334f;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f14011d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f14011d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f14011d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public <T> InterfaceC3334f<T, AbstractC4179h0> m14744g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m14742e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public <T> InterfaceC3334f<AbstractC4183j0, T> m14745h(Type type, Annotation[] annotationArr) {
        return m14743f(null, type, annotationArr);
    }

    /* renamed from: i */
    public <T> InterfaceC3334f<T, String> m14746i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f14011d.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3334f<T, String> interfaceC3334f = (InterfaceC3334f<T, String>) this.f14011d.get(i10).m14650e(type, annotationArr, this);
            if (interfaceC3334f != null) {
                return interfaceC3334f;
            }
        }
        return C3329a.d.f13839a;
    }

    /* renamed from: gc.u$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final C3345q f14019a;

        /* renamed from: b */
        private InterfaceC4176g.a f14020b;

        /* renamed from: c */
        private C4201z f14021c;

        /* renamed from: d */
        private final List<InterfaceC3334f.a> f14022d;

        /* renamed from: e */
        private final List<InterfaceC3331c.a> f14023e;

        /* renamed from: f */
        private Executor f14024f;

        /* renamed from: g */
        private boolean f14025g;

        b(C3345q c3345q) {
            this.f14022d = new ArrayList();
            this.f14023e = new ArrayList();
            this.f14019a = c3345q;
        }

        /* renamed from: a */
        public b m14747a(InterfaceC3331c.a aVar) {
            List<InterfaceC3331c.a> list = this.f14023e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m14748b(InterfaceC3334f.a aVar) {
            List<InterfaceC3334f.a> list = this.f14022d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public b m14749c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m14750d(C4201z.m17575l(str));
        }

        /* renamed from: d */
        public b m14750d(C4201z c4201z) {
            Objects.requireNonNull(c4201z, "baseUrl == null");
            if (BuildConfig.FLAVOR.equals(c4201z.m17597r().get(r0.size() - 1))) {
                this.f14021c = c4201z;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c4201z);
        }

        /* renamed from: e */
        public C3349u m14751e() {
            if (this.f14021c != null) {
                InterfaceC4176g.a aVar = this.f14020b;
                if (aVar == null) {
                    aVar = new C4171d0();
                }
                InterfaceC4176g.a aVar2 = aVar;
                Executor executor = this.f14024f;
                if (executor == null) {
                    executor = this.f14019a.mo14696b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f14023e);
                arrayList.addAll(this.f14019a.m14695a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f14022d.size() + 1 + this.f14019a.m14698d());
                arrayList2.add(new C3329a());
                arrayList2.addAll(this.f14022d);
                arrayList2.addAll(this.f14019a.m14697c());
                return new C3349u(aVar2, this.f14021c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f14025g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public b m14752f(InterfaceC4176g.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f14020b = aVar;
            return this;
        }

        /* renamed from: g */
        public b m14753g(C4171d0 c4171d0) {
            Objects.requireNonNull(c4171d0, "client == null");
            return m14752f(c4171d0);
        }

        public b() {
            this(C3345q.m14694f());
        }
    }
}
