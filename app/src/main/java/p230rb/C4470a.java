package p230rb;

import java.io.IOException;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.InterfaceC4165a0;
import sb.C4558g;

/* renamed from: rb.a */
/* loaded from: classes.dex */
public final class C4470a implements InterfaceC4165a0 {

    /* renamed from: a */
    public final C4171d0 f18082a;

    public C4470a(C4171d0 c4171d0) {
        this.f18082a = c4171d0;
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        C4558g c4558g = (C4558g) aVar;
        C4177g0 mo17275e = c4558g.mo17275e();
        C4480k m18635i = c4558g.m18635i();
        return c4558g.m18634h(mo17275e, m18635i, m18635i.m18423k(aVar, !mo17275e.m17397g().equals("GET")));
    }
}
