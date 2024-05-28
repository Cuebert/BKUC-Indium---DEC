package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.n3 */
/* loaded from: classes.dex */
final class C5291n3 implements InterfaceC3877d<C5329q2> {

    /* renamed from: a */
    static final C5291n3 f19919a = new C5291n3();

    /* renamed from: b */
    private static final C3876c f19920b;

    /* renamed from: c */
    private static final C3876c f19921c;

    /* renamed from: d */
    private static final C3876c f19922d;

    /* renamed from: e */
    private static final C3876c f19923e;

    /* renamed from: f */
    private static final C3876c f19924f;

    /* renamed from: g */
    private static final C3876c f19925g;

    /* renamed from: h */
    private static final C3876c f19926h;

    static {
        C3876c.b m16477a = C3876c.m16477a("errorCode");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f19920b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("hasResult");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f19921c = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("isColdCall");
        C5406w1 c5406w13 = new C5406w1();
        c5406w13.m19999a(3);
        f19922d = m16477a3.m16482b(c5406w13.m20000b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("imageInfo");
        C5406w1 c5406w14 = new C5406w1();
        c5406w14.m19999a(4);
        f19923e = m16477a4.m16482b(c5406w14.m20000b()).m16481a();
        C3876c.b m16477a5 = C3876c.m16477a("options");
        C5406w1 c5406w15 = new C5406w1();
        c5406w15.m19999a(5);
        f19924f = m16477a5.m16482b(c5406w15.m20000b()).m16481a();
        C3876c.b m16477a6 = C3876c.m16477a("detectedBarcodeFormats");
        C5406w1 c5406w16 = new C5406w1();
        c5406w16.m19999a(6);
        f19925g = m16477a6.m16482b(c5406w16.m20000b()).m16481a();
        C3876c.b m16477a7 = C3876c.m16477a("detectedBarcodeValueTypes");
        C5406w1 c5406w17 = new C5406w1();
        c5406w17.m19999a(7);
        f19926h = m16477a7.m16482b(c5406w17.m20000b()).m16481a();
    }

    private C5291n3() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5329q2 c5329q2 = (C5329q2) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f19920b, c5329q2.m19914c());
        interfaceC3878e.mo16483a(f19921c, null);
        interfaceC3878e.mo16483a(f19922d, c5329q2.m19916e());
        interfaceC3878e.mo16483a(f19923e, null);
        interfaceC3878e.mo16483a(f19924f, c5329q2.m19915d());
        interfaceC3878e.mo16483a(f19925g, c5329q2.m19912a());
        interfaceC3878e.mo16483a(f19926h, c5329q2.m19913b());
    }
}
