package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p093h0.C3362g;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public class C0808i {

    /* renamed from: a */
    private static final C3362g<ClassLoader, C3362g<String, Class<?>>> f4052a = new C3362g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m4655b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4656c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m4656c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C3362g<ClassLoader, C3362g<String, Class<?>>> c3362g = f4052a;
        C3362g<String, Class<?>> c3362g2 = c3362g.get(classLoader);
        if (c3362g2 == null) {
            c3362g2 = new C3362g<>();
            c3362g.put(classLoader, c3362g2);
        }
        Class<?> cls = c3362g2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c3362g2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4657d(ClassLoader classLoader, String str) {
        try {
            return m4656c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.C0776f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.C0776f("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    /* renamed from: a */
    public Fragment mo4533a(ClassLoader classLoader, String str) {
        throw null;
    }
}
