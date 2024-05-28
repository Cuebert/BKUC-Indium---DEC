package p179n9;

import p091gc.InterfaceC3331c;
import p193ob.C4171d0;
import p228r9.C4466k;
import p228r9.InterfaceC4456a;
import p228r9.InterfaceC4457b;
import p228r9.InterfaceC4458c;
import p228r9.InterfaceC4459d;
import p228r9.InterfaceC4460e;
import p228r9.InterfaceC4461f;
import p228r9.InterfaceC4462g;
import p228r9.InterfaceC4463h;
import p228r9.InterfaceC4464i;
import p228r9.InterfaceC4465j;
import p228r9.InterfaceC4467l;
import p228r9.InterfaceC4468m;

/* renamed from: n9.h */
/* loaded from: classes.dex */
public class C4084h implements InterfaceC4080d {

    /* renamed from: a */
    protected InterfaceC4465j f16572a;

    /* renamed from: b */
    protected InterfaceC4459d f16573b;

    /* renamed from: c */
    protected InterfaceC4460e f16574c;

    /* renamed from: d */
    protected InterfaceC4463h f16575d;

    /* renamed from: e */
    protected InterfaceC4464i f16576e;

    /* renamed from: f */
    protected InterfaceC4462g f16577f;

    /* renamed from: g */
    protected InterfaceC4461f f16578g;

    /* renamed from: h */
    protected InterfaceC4468m f16579h;

    /* renamed from: i */
    protected InterfaceC4457b f16580i;

    /* renamed from: j */
    protected InterfaceC4458c f16581j;

    /* renamed from: k */
    protected InterfaceC4456a f16582k;

    /* renamed from: l */
    protected InterfaceC4467l f16583l;

    /* renamed from: m */
    protected C4171d0 f16584m;

    /* renamed from: n */
    protected InterfaceC3331c.a f16585n;

    public C4084h(C4171d0 c4171d0, InterfaceC3331c.a aVar) {
        this.f16584m = c4171d0;
        this.f16585n = aVar;
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: a */
    public InterfaceC4463h mo16968a() {
        InterfaceC4463h interfaceC4463h = this.f16575d;
        if (interfaceC4463h != null) {
            return interfaceC4463h;
        }
        throw new RuntimeException("Metrics interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: b */
    public InterfaceC4461f mo16969b() {
        InterfaceC4461f interfaceC4461f = this.f16578g;
        if (interfaceC4461f != null) {
            return interfaceC4461f;
        }
        throw new RuntimeException("Friends interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: c */
    public InterfaceC4464i mo16970c() {
        InterfaceC4464i interfaceC4464i = this.f16576e;
        if (interfaceC4464i != null) {
            return interfaceC4464i;
        }
        throw new RuntimeException("Notifications interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: d */
    public InterfaceC4459d mo16971d() {
        InterfaceC4459d interfaceC4459d = this.f16573b;
        if (interfaceC4459d != null) {
            return interfaceC4459d;
        }
        throw new RuntimeException("CHAT interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: e */
    public InterfaceC4462g mo16972e(C4171d0 c4171d0) {
        InterfaceC4462g interfaceC4462g = (InterfaceC4462g) new C4466k("locale", C4083g.m16978c().f16560a).m18307f(c4171d0).m18306e(this.f16585n).m18302a(InterfaceC4462g.class);
        if (interfaceC4462g != null) {
            return interfaceC4462g;
        }
        throw new RuntimeException("Locale interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: f */
    public InterfaceC4457b mo16973f() {
        InterfaceC4457b interfaceC4457b = this.f16580i;
        if (interfaceC4457b != null) {
            return interfaceC4457b;
        }
        throw new RuntimeException("AccountSettings interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: g */
    public InterfaceC4467l mo16974g() {
        InterfaceC4467l interfaceC4467l = this.f16583l;
        if (interfaceC4467l != null) {
            return interfaceC4467l;
        }
        throw new RuntimeException("Thumbnails interface not initialized");
    }

    @Override // p179n9.InterfaceC4080d
    /* renamed from: h */
    public InterfaceC4465j mo16975h() {
        InterfaceC4465j interfaceC4465j = this.f16572a;
        if (interfaceC4465j != null) {
            return interfaceC4465j;
        }
        throw new RuntimeException("PlatformChat interface not initialized");
    }

    /* renamed from: i */
    public InterfaceC4080d m16986i(C4078b c4078b) {
        if (this.f16572a == null) {
            this.f16572a = (InterfaceC4465j) new C4466k("apis", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4465j.class);
        }
        if (this.f16573b == null) {
            this.f16573b = (InterfaceC4459d) new C4466k("chat", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4459d.class);
        }
        if (this.f16574c == null) {
            this.f16574c = (InterfaceC4460e) new C4466k("clientsettings.api", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4460e.class);
        }
        if (this.f16575d == null) {
            this.f16575d = (InterfaceC4463h) new C4466k("metrics", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4463h.class);
        }
        if (this.f16576e == null) {
            this.f16576e = (InterfaceC4464i) new C4466k("notifications", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4464i.class);
        }
        if (this.f16577f == null) {
            this.f16577f = (InterfaceC4462g) new C4466k("locale", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4462g.class);
        }
        if (this.f16578g == null) {
            this.f16578g = (InterfaceC4461f) new C4466k("friends", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4461f.class);
        }
        if (this.f16579h == null) {
            this.f16579h = (InterfaceC4468m) new C4466k("translations", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4468m.class);
        }
        if (this.f16580i == null) {
            this.f16580i = (InterfaceC4457b) new C4466k("accountsettings", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4457b.class);
        }
        if (this.f16581j == null) {
            this.f16581j = (InterfaceC4458c) new C4466k("auth", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4458c.class);
        }
        if (this.f16582k == null) {
            this.f16582k = (InterfaceC4456a) new C4466k("accountinformation", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4456a.class);
        }
        if (this.f16583l == null) {
            this.f16583l = (InterfaceC4467l) new C4466k("thumbnails", c4078b.f16560a).m18307f(this.f16584m).m18306e(this.f16585n).m18302a(InterfaceC4467l.class);
        }
        return this;
    }
}
