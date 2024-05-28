package p193ob;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: ob.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C4194s {
    static {
        InterfaceC4195t interfaceC4195t = InterfaceC4195t.f17351a;
    }

    /* renamed from: a */
    public static /* synthetic */ List m17513a(String str) throws UnknownHostException {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e10) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e10);
                throw unknownHostException;
            }
        }
        throw new UnknownHostException("hostname == null");
    }
}
