package p309y3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: y3.y1 */
/* loaded from: classes.dex */
final class C5866y1 implements InterfaceC3877d<C5824t4> {

    /* renamed from: a */
    static final C5866y1 f21442a = new C5866y1();

    /* renamed from: b */
    private static final C3876c f21443b;

    /* renamed from: c */
    private static final C3876c f21444c;

    /* renamed from: d */
    private static final C3876c f21445d;

    /* renamed from: e */
    private static final C3876c f21446e;

    /* renamed from: f */
    private static final C3876c f21447f;

    /* renamed from: g */
    private static final C3876c f21448g;

    /* renamed from: h */
    private static final C3876c f21449h;

    static {
        C3876c.b m16477a = C3876c.m16477a("durationMs");
        C5686e8 c5686e8 = new C5686e8();
        c5686e8.m20673a(1);
        f21443b = m16477a.m16482b(c5686e8.m20674b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("imageSource");
        C5686e8 c5686e82 = new C5686e8();
        c5686e82.m20673a(2);
        f21444c = m16477a2.m16482b(c5686e82.m20674b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("imageFormat");
        C5686e8 c5686e83 = new C5686e8();
        c5686e83.m20673a(3);
        f21445d = m16477a3.m16482b(c5686e83.m20674b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("imageByteSize");
        C5686e8 c5686e84 = new C5686e8();
        c5686e84.m20673a(4);
        f21446e = m16477a4.m16482b(c5686e84.m20674b()).m16481a();
        C3876c.b m16477a5 = C3876c.m16477a("imageWidth");
        C5686e8 c5686e85 = new C5686e8();
        c5686e85.m20673a(5);
        f21447f = m16477a5.m16482b(c5686e85.m20674b()).m16481a();
        C3876c.b m16477a6 = C3876c.m16477a("imageHeight");
        C5686e8 c5686e86 = new C5686e8();
        c5686e86.m20673a(6);
        f21448g = m16477a6.m16482b(c5686e86.m20674b()).m16481a();
        C3876c.b m16477a7 = C3876c.m16477a("rotationDegrees");
        C5686e8 c5686e87 = new C5686e8();
        c5686e87.m20673a(7);
        f21449h = m16477a7.m16482b(c5686e87.m20674b()).m16481a();
    }

    private C5866y1() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5824t4 c5824t4 = (C5824t4) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f21443b, c5824t4.m20766g());
        interfaceC3878e.mo16483a(f21444c, c5824t4.m20761b());
        interfaceC3878e.mo16483a(f21445d, c5824t4.m20760a());
        interfaceC3878e.mo16483a(f21446e, c5824t4.m20762c());
        interfaceC3878e.mo16483a(f21447f, c5824t4.m20764e());
        interfaceC3878e.mo16483a(f21448g, c5824t4.m20763d());
        interfaceC3878e.mo16483a(f21449h, c5824t4.m20765f());
    }
}
