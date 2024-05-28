package p216q9;

import java.io.IOException;
import p035c9.C1151k;
import p193ob.C4181i0;
import p193ob.InterfaceC4165a0;

/* renamed from: q9.a */
/* loaded from: classes.dex */
public class C4331a implements InterfaceC4165a0 {

    /* renamed from: a */
    private final String f17588a;

    public C4331a(String str) {
        this.f17588a = str;
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        C1151k.m6707a("rbx.platform", "UserAgentInterceptor.intercept()");
        return aVar.mo17272b(aVar.mo17275e().m17398h().m17402b("User-Agent", this.f17588a).m17401a());
    }
}
