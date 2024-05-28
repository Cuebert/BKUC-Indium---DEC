package p279w;

import p279w.InterfaceC5061o0;

/* renamed from: w.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C5057n0 {
    /* renamed from: a */
    public static boolean m19630a(InterfaceC5061o0.c cVar, InterfaceC5061o0.c cVar2) {
        InterfaceC5061o0.c cVar3 = InterfaceC5061o0.c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        InterfaceC5061o0.c cVar4 = InterfaceC5061o0.c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    /* renamed from: b */
    public static InterfaceC5061o0 m19631b(InterfaceC5061o0 interfaceC5061o0, InterfaceC5061o0 interfaceC5061o02) {
        C5070q1 m19660L;
        if (interfaceC5061o0 == null && interfaceC5061o02 == null) {
            return C5083u1.m19701I();
        }
        if (interfaceC5061o02 != null) {
            m19660L = C5070q1.m19661M(interfaceC5061o02);
        } else {
            m19660L = C5070q1.m19660L();
        }
        if (interfaceC5061o0 != null) {
            for (InterfaceC5061o0.a<?> aVar : interfaceC5061o0.mo1367c()) {
                m19660L.mo19658G(aVar, interfaceC5061o0.mo1368d(aVar), interfaceC5061o0.mo1366b(aVar));
            }
        }
        return C5083u1.m19702J(m19660L);
    }
}
