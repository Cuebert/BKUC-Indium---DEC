package p003a2;

import java.io.IOException;
import p042d2.C2960a;
import p042d2.C2961b;
import p042d2.C2962c;
import p042d2.C2963d;
import p042d2.C2964e;
import p042d2.C2965f;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;
import p163m5.InterfaceC3956a;
import p163m5.InterfaceC3957b;
import p187o5.C4134a;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public final class C0006a implements InterfaceC3956a {

    /* renamed from: a */
    public static final InterfaceC3956a f97a = new C0006a();

    /* renamed from: a2.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC3877d<C2960a> {

        /* renamed from: a */
        static final a f98a = new a();

        /* renamed from: b */
        private static final C3876c f99b = C3876c.m16477a("window").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

        /* renamed from: c */
        private static final C3876c f100c = C3876c.m16477a("logSourceMetrics").m16482b(C4134a.m17135b().m17137c(2).m17136a()).m16481a();

        /* renamed from: d */
        private static final C3876c f101d = C3876c.m16477a("globalMetrics").m16482b(C4134a.m17135b().m17137c(3).m17136a()).m16481a();

        /* renamed from: e */
        private static final C3876c f102e = C3876c.m16477a("appNamespace").m16482b(C4134a.m17135b().m17137c(4).m17136a()).m16481a();

        private a() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(C2960a c2960a, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f99b, c2960a.m13392d());
            interfaceC3878e.mo16483a(f100c, c2960a.m13391c());
            interfaceC3878e.mo16483a(f101d, c2960a.m13390b());
            interfaceC3878e.mo16483a(f102e, c2960a.m13389a());
        }
    }

    /* renamed from: a2.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC3877d<C2961b> {

        /* renamed from: a */
        static final b f103a = new b();

        /* renamed from: b */
        private static final C3876c f104b = C3876c.m16477a("storageMetrics").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

        private b() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(C2961b c2961b, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f104b, c2961b.m13400a());
        }
    }

    /* renamed from: a2.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC3877d<C2962c> {

        /* renamed from: a */
        static final c f105a = new c();

        /* renamed from: b */
        private static final C3876c f106b = C3876c.m16477a("eventsDroppedCount").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

        /* renamed from: c */
        private static final C3876c f107c = C3876c.m16477a("reason").m16482b(C4134a.m17135b().m17137c(3).m17136a()).m16481a();

        private c() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(C2962c c2962c, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16484d(f106b, c2962c.m13404a());
            interfaceC3878e.mo16483a(f107c, c2962c.m13405b());
        }
    }

    /* renamed from: a2.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC3877d<C2963d> {

        /* renamed from: a */
        static final d f108a = new d();

        /* renamed from: b */
        private static final C3876c f109b = C3876c.m16477a("logSource").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

        /* renamed from: c */
        private static final C3876c f110c = C3876c.m16477a("logEventDropped").m16482b(C4134a.m17135b().m17137c(2).m17136a()).m16481a();

        private d() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(C2963d c2963d, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f109b, c2963d.m13412b());
            interfaceC3878e.mo16483a(f110c, c2963d.m13411a());
        }
    }

    /* renamed from: a2.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC3877d<AbstractC0017l> {

        /* renamed from: a */
        static final e f111a = new e();

        /* renamed from: b */
        private static final C3876c f112b = C3876c.m16478d("clientMetrics");

        private e() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(AbstractC0017l abstractC0017l, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16483a(f112b, abstractC0017l.m145b());
        }
    }

    /* renamed from: a2.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC3877d<C2964e> {

        /* renamed from: a */
        static final f f113a = new f();

        /* renamed from: b */
        private static final C3876c f114b = C3876c.m16477a("currentCacheSizeBytes").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

        /* renamed from: c */
        private static final C3876c f115c = C3876c.m16477a("maxCacheSizeBytes").m16482b(C4134a.m17135b().m17137c(2).m17136a()).m16481a();

        private f() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(C2964e c2964e, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16484d(f114b, c2964e.m13417a());
            interfaceC3878e.mo16484d(f115c, c2964e.m13418b());
        }
    }

    /* renamed from: a2.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC3877d<C2965f> {

        /* renamed from: a */
        static final g f116a = new g();

        /* renamed from: b */
        private static final C3876c f117b = C3876c.m16477a("startMs").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

        /* renamed from: c */
        private static final C3876c f118c = C3876c.m16477a("endMs").m16482b(C4134a.m17135b().m17137c(2).m17136a()).m16481a();

        private g() {
        }

        @Override // p152l5.InterfaceC3877d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo79a(C2965f c2965f, InterfaceC3878e interfaceC3878e) throws IOException {
            interfaceC3878e.mo16484d(f117b, c2965f.m13424b());
            interfaceC3878e.mo16484d(f118c, c2965f.m13423a());
        }
    }

    private C0006a() {
    }

    @Override // p163m5.InterfaceC3956a
    /* renamed from: a */
    public void mo78a(InterfaceC3957b<?> interfaceC3957b) {
        interfaceC3957b.mo16689a(AbstractC0017l.class, e.f111a);
        interfaceC3957b.mo16689a(C2960a.class, a.f98a);
        interfaceC3957b.mo16689a(C2965f.class, g.f116a);
        interfaceC3957b.mo16689a(C2963d.class, d.f108a);
        interfaceC3957b.mo16689a(C2962c.class, c.f105a);
        interfaceC3957b.mo16689a(C2961b.class, b.f103a);
        interfaceC3957b.mo16689a(C2964e.class, f.f113a);
    }
}
