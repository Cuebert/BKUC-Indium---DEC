package p291wb;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p193ob.EnumC4173e0;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"NewApi"})
/* renamed from: wb.a */
/* loaded from: classes.dex */
public class C5487a extends C5488b {
    C5487a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    /* renamed from: x */
    public static C5492f m20183x() {
        if (!C5492f.m20216q()) {
            return null;
        }
        try {
            if (C5488b.m20190y() >= 29) {
                return new C5487a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    /* renamed from: z */
    private void m20184z(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // p291wb.C5488b, p291wb.C5492f
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* renamed from: g */
    public void mo20185g(SSLSocket sSLSocket, String str, List<EnumC4173e0> list) throws IOException {
        try {
            m20184z(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C5492f.m20210b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // p291wb.C5488b, p291wb.C5492f
    @IgnoreJRERequirement
    /* renamed from: o */
    public String mo20186o(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
