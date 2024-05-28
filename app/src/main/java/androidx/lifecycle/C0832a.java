package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
final class C0832a {

    /* renamed from: c */
    static C0832a f4256c = new C0832a();

    /* renamed from: a */
    private final Map<Class<?>, a> f4257a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f4258b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map<AbstractC0839f.b, List<b>> f4259a = new HashMap();

        /* renamed from: b */
        final Map<b, AbstractC0839f.b> f4260b;

        a(Map<b, AbstractC0839f.b> map) {
            this.f4260b = map;
            for (Map.Entry<b, AbstractC0839f.b> entry : map.entrySet()) {
                AbstractC0839f.b value = entry.getValue();
                List<b> list = this.f4259a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4259a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m4882b(List<b> list, InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m4884a(interfaceC0845l, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m4883a(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar, Object obj) {
            m4882b(this.f4259a.get(bVar), interfaceC0845l, bVar, obj);
            m4882b(this.f4259a.get(AbstractC0839f.b.ON_ANY), interfaceC0845l, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f4261a;

        /* renamed from: b */
        final Method f4262b;

        b(int i10, Method method) {
            this.f4261a = i10;
            this.f4262b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m4884a(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar, Object obj) {
            try {
                int i10 = this.f4261a;
                if (i10 == 0) {
                    this.f4262b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f4262b.invoke(obj, interfaceC0845l);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f4262b.invoke(obj, interfaceC0845l, bVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4261a == bVar.f4261a && this.f4262b.getName().equals(bVar.f4262b.getName());
        }

        public int hashCode() {
            return (this.f4261a * 31) + this.f4262b.getName().hashCode();
        }
    }

    C0832a() {
    }

    /* renamed from: a */
    private a m4877a(Class<?> cls, Method[] methodArr) {
        int i10;
        a m4880c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m4880c = m4880c(superclass)) != null) {
            hashMap.putAll(m4880c.f4260b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0839f.b> entry : m4880c(cls2).f4260b.entrySet()) {
                m4879e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4878b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC0853t interfaceC0853t = (InterfaceC0853t) method.getAnnotation(InterfaceC0853t.class);
            if (interfaceC0853t != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0845l.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC0839f.b value = interfaceC0853t.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(AbstractC0839f.b.class)) {
                        if (value != AbstractC0839f.b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4879e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f4257a.put(cls, aVar);
        this.f4258b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m4878b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* renamed from: e */
    private void m4879e(Map<b, AbstractC0839f.b> map, b bVar, AbstractC0839f.b bVar2, Class<?> cls) {
        AbstractC0839f.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4262b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a m4880c(Class<?> cls) {
        a aVar = this.f4257a.get(cls);
        return aVar != null ? aVar : m4877a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m4881d(Class<?> cls) {
        Boolean bool = this.f4258b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m4878b = m4878b(cls);
        for (Method method : m4878b) {
            if (((InterfaceC0853t) method.getAnnotation(InterfaceC0853t.class)) != null) {
                m4877a(cls, m4878b);
                return true;
            }
        }
        this.f4258b.put(cls, Boolean.FALSE);
        return false;
    }
}
