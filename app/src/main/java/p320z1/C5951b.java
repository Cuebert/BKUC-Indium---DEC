package p320z1;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;
import p163m5.InterfaceC3956a;
import p163m5.InterfaceC3957b;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C5951b implements InterfaceC3956a {

    /* renamed from: a */
    public static final InterfaceC3956a f21862a = new C5951b();

    /* renamed from: z1.b$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC3877d<AbstractC5950a> {

        /* renamed from: a */
        static final a f21863a = new a();

        /* renamed from: b */
        private static final C3876c f21864b = C3876c.m16478d("sdkVersion");

        /* renamed from: c */
        private static final C3876c f21865c = C3876c.m16478d("model");

        /* renamed from: d */
        private static final C3876c f21866d = C3876c.m16478d("hardware");

        /* renamed from: e */
        private static final C3876c f21867e = C3876c.m16478d("device");

        /* renamed from: f */
        private static final C3876c f21868f = C3876c.m16478d("product");

        /* renamed from: g */
        private static final C3876c f21869g = C3876c.m16478d("osBuild");

        /* renamed from: h */
        private static final C3876c f21870h = C3876c.m16478d("manufacturer");

        /* renamed from: i */
        private static final C3876c f21871i = C3876c.m16478d("fingerprint");

        /* renamed from: j */
        private static final C3876c f21872j = C3876c.m16478d("locale");

        /* renamed from: k */
        private static final C3876c f21873k = C3876c.m16478d("country");

        /* renamed from: l */
        private static final C3876c f21874l = C3876c.m16478d("mccMnc");

        /* renamed from: m */
        private static final C3876c f21875m = C3876c.m16478d("applicationBuild");

        private a() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b */
        public void mo79a(AbstractC5950a abstractC5950a, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f21864b, abstractC5950a.mo21160m());
            interfaceC3878e.mo16483a(f21865c, abstractC5950a.mo21157j());
            interfaceC3878e.mo16483a(f21866d, abstractC5950a.mo21153f());
            interfaceC3878e.mo16483a(f21867e, abstractC5950a.mo21151d());
            interfaceC3878e.mo16483a(f21868f, abstractC5950a.mo21159l());
            interfaceC3878e.mo16483a(f21869g, abstractC5950a.mo21158k());
            interfaceC3878e.mo16483a(f21870h, abstractC5950a.mo21155h());
            interfaceC3878e.mo16483a(f21871i, abstractC5950a.mo21152e());
            interfaceC3878e.mo16483a(f21872j, abstractC5950a.mo21154g());
            interfaceC3878e.mo16483a(f21873k, abstractC5950a.mo21150c());
            interfaceC3878e.mo16483a(f21874l, abstractC5950a.mo21156i());
            interfaceC3878e.mo16483a(f21875m, abstractC5950a.mo21149b());
        }
    }

    /* renamed from: z1.b$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC3877d<AbstractC5959j> {

        /* renamed from: a */
        static final b f21876a = new b();

        /* renamed from: b */
        private static final C3876c f21877b = C3876c.m16478d("logRequest");

        private b() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b */
        public void mo79a(AbstractC5959j abstractC5959j, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f21877b, abstractC5959j.mo21180c());
        }
    }

    /* renamed from: z1.b$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC3877d<AbstractC5960k> {

        /* renamed from: a */
        static final c f21878a = new c();

        /* renamed from: b */
        private static final C3876c f21879b = C3876c.m16478d("clientType");

        /* renamed from: c */
        private static final C3876c f21880c = C3876c.m16478d("androidClientInfo");

        private c() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b */
        public void mo79a(AbstractC5960k abstractC5960k, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f21879b, abstractC5960k.mo21182c());
            interfaceC3878e.mo16483a(f21880c, abstractC5960k.mo21181b());
        }
    }

    /* renamed from: z1.b$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC3877d<AbstractC5961l> {

        /* renamed from: a */
        static final d f21881a = new d();

        /* renamed from: b */
        private static final C3876c f21882b = C3876c.m16478d("eventTimeMs");

        /* renamed from: c */
        private static final C3876c f21883c = C3876c.m16478d("eventCode");

        /* renamed from: d */
        private static final C3876c f21884d = C3876c.m16478d("eventUptimeMs");

        /* renamed from: e */
        private static final C3876c f21885e = C3876c.m16478d("sourceExtension");

        /* renamed from: f */
        private static final C3876c f21886f = C3876c.m16478d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C3876c f21887g = C3876c.m16478d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C3876c f21888h = C3876c.m16478d("networkConnectionInfo");

        private d() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b */
        public void mo79a(AbstractC5961l abstractC5961l, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16484d(f21882b, abstractC5961l.mo21187c());
            interfaceC3878e.mo16483a(f21883c, abstractC5961l.mo21186b());
            interfaceC3878e.mo16484d(f21884d, abstractC5961l.mo21188d());
            interfaceC3878e.mo16483a(f21885e, abstractC5961l.mo21190f());
            interfaceC3878e.mo16483a(f21886f, abstractC5961l.mo21191g());
            interfaceC3878e.mo16484d(f21887g, abstractC5961l.mo21192h());
            interfaceC3878e.mo16483a(f21888h, abstractC5961l.mo21189e());
        }
    }

    /* renamed from: z1.b$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC3877d<AbstractC5962m> {

        /* renamed from: a */
        static final e f21889a = new e();

        /* renamed from: b */
        private static final C3876c f21890b = C3876c.m16478d("requestTimeMs");

        /* renamed from: c */
        private static final C3876c f21891c = C3876c.m16478d("requestUptimeMs");

        /* renamed from: d */
        private static final C3876c f21892d = C3876c.m16478d("clientInfo");

        /* renamed from: e */
        private static final C3876c f21893e = C3876c.m16478d("logSource");

        /* renamed from: f */
        private static final C3876c f21894f = C3876c.m16478d("logSourceName");

        /* renamed from: g */
        private static final C3876c f21895g = C3876c.m16478d("logEvent");

        /* renamed from: h */
        private static final C3876c f21896h = C3876c.m16478d("qosTier");

        private e() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b */
        public void mo79a(AbstractC5962m abstractC5962m, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16484d(f21890b, abstractC5962m.mo21206g());
            interfaceC3878e.mo16484d(f21891c, abstractC5962m.mo21207h());
            interfaceC3878e.mo16483a(f21892d, abstractC5962m.mo21201b());
            interfaceC3878e.mo16483a(f21893e, abstractC5962m.mo21203d());
            interfaceC3878e.mo16483a(f21894f, abstractC5962m.mo21204e());
            interfaceC3878e.mo16483a(f21895g, abstractC5962m.mo21202c());
            interfaceC3878e.mo16483a(f21896h, abstractC5962m.mo21205f());
        }
    }

    /* renamed from: z1.b$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC3877d<AbstractC5964o> {

        /* renamed from: a */
        static final f f21897a = new f();

        /* renamed from: b */
        private static final C3876c f21898b = C3876c.m16478d("networkType");

        /* renamed from: c */
        private static final C3876c f21899c = C3876c.m16478d("mobileSubtype");

        private f() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b */
        public void mo79a(AbstractC5964o abstractC5964o, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f21898b, abstractC5964o.mo21218c());
            interfaceC3878e.mo16483a(f21899c, abstractC5964o.mo21217b());
        }
    }

    private C5951b() {
    }

    @Override // p163m5.InterfaceC3956a
    /* renamed from: a */
    public void mo78a(InterfaceC3957b<?> interfaceC3957b) {
        b bVar = b.f21876a;
        interfaceC3957b.mo16689a(AbstractC5959j.class, bVar);
        interfaceC3957b.mo16689a(C5953d.class, bVar);
        e eVar = e.f21889a;
        interfaceC3957b.mo16689a(AbstractC5962m.class, eVar);
        interfaceC3957b.mo16689a(C5956g.class, eVar);
        c cVar = c.f21878a;
        interfaceC3957b.mo16689a(AbstractC5960k.class, cVar);
        interfaceC3957b.mo16689a(C5954e.class, cVar);
        a aVar = a.f21863a;
        interfaceC3957b.mo16689a(AbstractC5950a.class, aVar);
        interfaceC3957b.mo16689a(C5952c.class, aVar);
        d dVar = d.f21881a;
        interfaceC3957b.mo16689a(AbstractC5961l.class, dVar);
        interfaceC3957b.mo16689a(C5955f.class, dVar);
        f fVar = f.f21897a;
        interfaceC3957b.mo16689a(AbstractC5964o.class, fVar);
        interfaceC3957b.mo16689a(C5958i.class, fVar);
    }
}
