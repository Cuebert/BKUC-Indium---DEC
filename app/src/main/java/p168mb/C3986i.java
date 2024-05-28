package p168mb;

import bb.C1097a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.jvm.internal.C3844i;
import p132jb.C3695l;
import p132jb.C3696m;
import p253ta.C4745b;
import ua.C4896n;
import ua.C4900r;
import ua.C4903u;

/* renamed from: mb.i */
/* loaded from: classes.dex */
public final class C3986i {

    /* renamed from: a */
    public static final C3986i f16380a = new C3986i();

    private C3986i() {
    }

    /* renamed from: a */
    private final <S> S m16751a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m16752b(Class<S> cls, ClassLoader classLoader) {
        List<S> m19147j;
        try {
            return m16756d(cls, classLoader);
        } catch (Throwable unused) {
            m19147j = C4903u.m19147j(ServiceLoader.load(cls, classLoader));
            return m19147j;
        }
    }

    /* renamed from: e */
    private final List<String> m16753e(URL url) {
        boolean m15674e;
        BufferedReader bufferedReader;
        String m15692u;
        String m15697z;
        String m15692u2;
        String url2 = url.toString();
        m15674e = C3695l.m15674e(url2, "jar", false, 2, null);
        if (m15674e) {
            m15692u = C3696m.m15692u(url2, "jar:file:", null, 2, null);
            m15697z = C3696m.m15697z(m15692u, '!', null, 2, null);
            m15692u2 = C3696m.m15692u(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m15697z, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m15692u2)), "UTF-8"));
                try {
                    List<String> m16754f = f16380a.m16754f(bufferedReader);
                    C1097a.m6452a(bufferedReader, null);
                    jarFile.close();
                    return m16754f;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        C4745b.m18896a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> m16754f2 = f16380a.m16754f(bufferedReader);
                C1097a.m6452a(bufferedReader, null);
                return m16754f2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    /* renamed from: f */
    private final List<String> m16754f(BufferedReader bufferedReader) {
        List<String> m19147j;
        String m15675A;
        CharSequence m15676B;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m19147j = C4903u.m19147j(linkedHashSet);
                return m19147j;
            }
            m15675A = C3696m.m15675A(readLine, "#", null, 2, null);
            m15676B = C3696m.m15676B(m15675A);
            String obj = m15676B.toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List<InterfaceC3996r> m16755c() {
        InterfaceC3996r interfaceC3996r;
        if (!C3988j.m16759a()) {
            return m16752b(InterfaceC3996r.class, InterfaceC3996r.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC3996r interfaceC3996r2 = null;
            try {
                interfaceC3996r = (InterfaceC3996r) InterfaceC3996r.class.cast(Class.forName("lb.a", true, InterfaceC3996r.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                interfaceC3996r = null;
            }
            if (interfaceC3996r != null) {
                arrayList.add(interfaceC3996r);
            }
            try {
                interfaceC3996r2 = (InterfaceC3996r) InterfaceC3996r.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC3996r.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC3996r2 == null) {
                return arrayList;
            }
            arrayList.add(interfaceC3996r2);
            return arrayList;
        } catch (Throwable unused3) {
            return m16752b(InterfaceC3996r.class, InterfaceC3996r.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m16756d(Class<S> cls, ClassLoader classLoader) {
        Set m19150m;
        int m19144g;
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C3844i.m16252e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4900r.m19145h(arrayList, f16380a.m16753e((URL) it.next()));
        }
        m19150m = C4903u.m19150m(arrayList);
        if (!m19150m.isEmpty()) {
            m19144g = C4896n.m19144g(m19150m, 10);
            ArrayList arrayList2 = new ArrayList(m19144g);
            Iterator it2 = m19150m.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f16380a.m16751a((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
