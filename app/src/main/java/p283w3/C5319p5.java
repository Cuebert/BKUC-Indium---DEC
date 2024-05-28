package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.p5 */
/* loaded from: classes.dex */
final class C5319p5 implements InterfaceC3877d<C5361s8> {

    /* renamed from: a */
    static final C5319p5 f19984a = new C5319p5();

    /* renamed from: b */
    private static final C3876c f19985b;

    /* renamed from: c */
    private static final C3876c f19986c;

    /* renamed from: d */
    private static final C3876c f19987d;

    /* renamed from: e */
    private static final C3876c f19988e;

    /* renamed from: f */
    private static final C3876c f19989f;

    static {
        C3876c.b m16477a = C3876c.m16477a("inferenceCommonLogEvent");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f19985b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("options");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f19986c = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("detectedBarcodeFormats");
        C5406w1 c5406w13 = new C5406w1();
        c5406w13.m19999a(3);
        f19987d = m16477a3.m16482b(c5406w13.m20000b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("detectedBarcodeValueTypes");
        C5406w1 c5406w14 = new C5406w1();
        c5406w14.m19999a(4);
        f19988e = m16477a4.m16482b(c5406w14.m20000b()).m16481a();
        C3876c.b m16477a5 = C3876c.m16477a("imageInfo");
        C5406w1 c5406w15 = new C5406w1();
        c5406w15.m19999a(5);
        f19989f = m16477a5.m16482b(c5406w15.m20000b()).m16481a();
    }

    private C5319p5() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5361s8 c5361s8 = (C5361s8) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f19985b, c5361s8.m19969d());
        interfaceC3878e.mo16483a(f19986c, c5361s8.m19970e());
        interfaceC3878e.mo16483a(f19987d, c5361s8.m19966a());
        interfaceC3878e.mo16483a(f19988e, c5361s8.m19967b());
        interfaceC3878e.mo16483a(f19989f, c5361s8.m19968c());
    }
}
