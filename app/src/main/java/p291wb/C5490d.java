package p291wb;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p193ob.EnumC4173e0;
import p205pb.C4286e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wb.d */
/* loaded from: classes.dex */
public class C5490d extends C5492f {

    /* renamed from: c */
    private final Method f20472c;

    /* renamed from: d */
    private final Method f20473d;

    /* renamed from: e */
    private final Method f20474e;

    /* renamed from: f */
    private final Class<?> f20475f;

    /* renamed from: g */
    private final Class<?> f20476g;

    /* renamed from: wb.d$a */
    /* loaded from: classes.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f20477a;

        /* renamed from: b */
        boolean f20478b;

        /* renamed from: c */
        String f20479c;

        a(List<String> list) {
            this.f20477a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C4286e.f17492b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f20478b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f20477a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                List list = (List) objArr[0];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = (String) list.get(i10);
                    if (this.f20477a.contains(str)) {
                        this.f20479c = str;
                        return str;
                    }
                }
                String str2 = this.f20477a.get(0);
                this.f20479c = str2;
                return str2;
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.f20479c = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    C5490d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f20472c = method;
        this.f20473d = method2;
        this.f20474e = method3;
        this.f20475f = cls;
        this.f20476g = cls2;
    }

    /* renamed from: v */
    public static C5492f m20207v() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            return new C5490d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: a */
    public void mo20208a(SSLSocket sSLSocket) {
        try {
            this.f20474e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: g */
    public void mo20185g(SSLSocket sSLSocket, String str, List<EnumC4173e0> list) {
        try {
            this.f20472c.invoke(null, sSLSocket, Proxy.newProxyInstance(C5492f.class.getClassLoader(), new Class[]{this.f20475f, this.f20476g}, new a(C5492f.m20210b(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: o */
    public String mo20186o(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f20473d.invoke(null, sSLSocket));
            boolean z10 = aVar.f20478b;
            if (!z10 && aVar.f20479c == null) {
                C5492f.m20215l().mo20197t(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f20479c;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
