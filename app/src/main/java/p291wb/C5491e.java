package p291wb;

import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p193ob.EnumC4173e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wb.e */
/* loaded from: classes.dex */
public final class C5491e extends C5492f {

    /* renamed from: c */
    final Method f20480c;

    /* renamed from: d */
    final Method f20481d;

    C5491e(Method method, Method method2) {
        this.f20480c = method;
        this.f20481d = method2;
    }

    /* renamed from: v */
    public static C5491e m20209v() {
        try {
            return new C5491e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: g */
    public void mo20185g(SSLSocket sSLSocket, String str, List<EnumC4173e0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> m20210b = C5492f.m20210b(list);
            this.f20480c.invoke(sSLParameters, m20210b.toArray(new String[m20210b.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set SSL parameters", e10);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: o */
    public String mo20186o(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f20481d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals(BuildConfig.FLAVOR)) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
