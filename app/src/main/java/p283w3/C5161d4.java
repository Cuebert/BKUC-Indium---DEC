package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.d4 */
/* loaded from: classes.dex */
final class C5161d4 implements InterfaceC3877d<C5153ca> {

    /* renamed from: a */
    static final C5161d4 f19499a = new C5161d4();

    /* renamed from: b */
    private static final C3876c f19500b;

    static {
        C3876c.b m16477a = C3876c.m16477a("format");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f19500b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
    }

    private C5161d4() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        ((InterfaceC3878e) obj2).mo16483a(f19500b, ((C5153ca) obj).m19770a());
    }
}
