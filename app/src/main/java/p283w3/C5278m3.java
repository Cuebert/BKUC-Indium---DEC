package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.m3 */
/* loaded from: classes.dex */
final class C5278m3 implements InterfaceC3877d<C5342r2> {

    /* renamed from: a */
    static final C5278m3 f19891a = new C5278m3();

    /* renamed from: b */
    private static final C3876c f19892b;

    /* renamed from: c */
    private static final C3876c f19893c;

    /* renamed from: d */
    private static final C3876c f19894d;

    static {
        C3876c.b m16477a = C3876c.m16477a("logEventKey");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f19892b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("eventCount");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f19893c = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("inferenceDurationStats");
        C5406w1 c5406w13 = new C5406w1();
        c5406w13.m19999a(3);
        f19894d = m16477a3.m16482b(c5406w13.m20000b()).m16481a();
    }

    private C5278m3() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5342r2 c5342r2 = (C5342r2) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f19892b, c5342r2.m19942a());
        interfaceC3878e.mo16483a(f19893c, c5342r2.m19944c());
        interfaceC3878e.mo16483a(f19894d, c5342r2.m19943b());
    }
}
