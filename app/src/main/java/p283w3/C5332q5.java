package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.q5 */
/* loaded from: classes.dex */
final class C5332q5 implements InterfaceC3877d<C5400v8> {

    /* renamed from: a */
    static final C5332q5 f20038a = new C5332q5();

    /* renamed from: b */
    private static final C3876c f20039b;

    static {
        C3876c.b m16477a = C3876c.m16477a("errorCode");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f20039b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
    }

    private C5332q5() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        ((InterfaceC3878e) obj2).mo16483a(f20039b, ((C5400v8) obj).m19998a());
    }
}
