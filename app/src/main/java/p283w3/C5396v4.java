package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.v4 */
/* loaded from: classes.dex */
final class C5396v4 implements InterfaceC3877d<C5282m7> {

    /* renamed from: a */
    static final C5396v4 f20198a = new C5396v4();

    /* renamed from: b */
    private static final C3876c f20199b;

    /* renamed from: c */
    private static final C3876c f20200c;

    /* renamed from: d */
    private static final C3876c f20201d;

    /* renamed from: e */
    private static final C3876c f20202e;

    /* renamed from: f */
    private static final C3876c f20203f;

    /* renamed from: g */
    private static final C3876c f20204g;

    static {
        C3876c.b m16477a = C3876c.m16477a("maxMs");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f20199b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("minMs");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f20200c = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("avgMs");
        C5406w1 c5406w13 = new C5406w1();
        c5406w13.m19999a(3);
        f20201d = m16477a3.m16482b(c5406w13.m20000b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("firstQuartileMs");
        C5406w1 c5406w14 = new C5406w1();
        c5406w14.m19999a(4);
        f20202e = m16477a4.m16482b(c5406w14.m20000b()).m16481a();
        C3876c.b m16477a5 = C3876c.m16477a("medianMs");
        C5406w1 c5406w15 = new C5406w1();
        c5406w15.m19999a(5);
        f20203f = m16477a5.m16482b(c5406w15.m20000b()).m16481a();
        C3876c.b m16477a6 = C3876c.m16477a("thirdQuartileMs");
        C5406w1 c5406w16 = new C5406w1();
        c5406w16.m19999a(6);
        f20204g = m16477a6.m16482b(c5406w16.m20000b()).m16481a();
    }

    private C5396v4() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5282m7 c5282m7 = (C5282m7) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f20199b, c5282m7.m19867c());
        interfaceC3878e.mo16483a(f20200c, c5282m7.m19869e());
        interfaceC3878e.mo16483a(f20201d, c5282m7.m19865a());
        interfaceC3878e.mo16483a(f20202e, c5282m7.m19866b());
        interfaceC3878e.mo16483a(f20203f, c5282m7.m19868d());
        interfaceC3878e.mo16483a(f20204g, c5282m7.m19870f());
    }
}
