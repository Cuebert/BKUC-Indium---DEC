package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.z4 */
/* loaded from: classes.dex */
final class C5448z4 implements InterfaceC3877d<C5360s7> {

    /* renamed from: a */
    static final C5448z4 f20310a = new C5448z4();

    /* renamed from: b */
    private static final C3876c f20311b;

    /* renamed from: c */
    private static final C3876c f20312c;

    /* renamed from: d */
    private static final C3876c f20313d;

    /* renamed from: e */
    private static final C3876c f20314e;

    static {
        C3876c.b m16477a = C3876c.m16477a("imageFormat");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f20311b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("originalImageSize");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f20312c = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("compressedImageSize");
        C5406w1 c5406w13 = new C5406w1();
        c5406w13.m19999a(3);
        f20313d = m16477a3.m16482b(c5406w13.m20000b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("isOdmlImage");
        C5406w1 c5406w14 = new C5406w1();
        c5406w14.m19999a(4);
        f20314e = m16477a4.m16482b(c5406w14.m20000b()).m16481a();
    }

    private C5448z4() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5360s7 c5360s7 = (C5360s7) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f20311b, c5360s7.m19964a());
        interfaceC3878e.mo16483a(f20312c, c5360s7.m19965b());
        interfaceC3878e.mo16483a(f20313d, null);
        interfaceC3878e.mo16483a(f20314e, null);
    }
}
