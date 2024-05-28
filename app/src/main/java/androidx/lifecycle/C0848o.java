package androidx.lifecycle;

import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class C0848o {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f4283a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC0838e>>> f4284b = new HashMap();

    /* renamed from: a */
    private static InterfaceC0838e m4913a(Constructor<? extends InterfaceC0838e> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC0838e> m4914b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : BuildConfig.FLAVOR;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m4915c = m4915c(canonicalName);
            if (!name.isEmpty()) {
                m4915c = name + "." + m4915c;
            }
            Constructor declaredConstructor = Class.forName(m4915c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public static String m4915c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m4916d(Class<?> cls) {
        Integer num = f4283a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m4919g = m4919g(cls);
        f4283a.put(cls, Integer.valueOf(m4919g));
        return m4919g;
    }

    /* renamed from: e */
    private static boolean m4917e(Class<?> cls) {
        return cls != null && InterfaceC0844k.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static InterfaceC0843j m4918f(Object obj) {
        boolean z10 = obj instanceof InterfaceC0843j;
        boolean z11 = obj instanceof InterfaceC0837d;
        if (z10 && z11) {
            return new FullLifecycleObserverAdapter((InterfaceC0837d) obj, (InterfaceC0843j) obj);
        }
        if (z11) {
            return new FullLifecycleObserverAdapter((InterfaceC0837d) obj, null);
        }
        if (z10) {
            return (InterfaceC0843j) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4916d(cls) == 2) {
            List<Constructor<? extends InterfaceC0838e>> list = f4284b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m4913a(list.get(0), obj));
            }
            InterfaceC0838e[] interfaceC0838eArr = new InterfaceC0838e[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                interfaceC0838eArr[i10] = m4913a(list.get(i10), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC0838eArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private static int m4919g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0838e> m4914b = m4914b(cls);
        if (m4914b != null) {
            f4284b.put(cls, Collections.singletonList(m4914b));
            return 2;
        }
        if (C0832a.f4256c.m4881d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m4917e(superclass)) {
            if (m4916d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f4284b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m4917e(cls2)) {
                if (m4916d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f4284b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4284b.put(cls, arrayList);
        return 2;
    }
}
