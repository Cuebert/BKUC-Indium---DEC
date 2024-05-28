package p228r9;

import p091gc.C3349u;
import p091gc.InterfaceC3331c;
import p105hc.C3461a;
import p193ob.C4171d0;

/* renamed from: r9.k */
/* loaded from: classes.dex */
public class C4466k<T> {

    /* renamed from: a */
    protected String f18061a;

    /* renamed from: b */
    protected String f18062b;

    /* renamed from: c */
    protected C4171d0 f18063c;

    /* renamed from: d */
    protected InterfaceC3331c.a f18064d;

    public C4466k(String str, String str2) {
        this.f18062b = str;
        this.f18061a = str2 == null ? m18304c() : str2;
    }

    /* renamed from: a */
    public T m18302a(Class<T> cls) {
        try {
            return (T) m18303b(m18305d(this.f18062b, this.f18061a)).m14739b(cls);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return (T) m18303b(m18305d(this.f18062b, m18304c())).m14739b(cls);
        }
    }

    /* renamed from: b */
    protected C3349u m18303b(String str) {
        C3349u.b bVar = new C3349u.b();
        bVar.m14749c(str);
        bVar.m14753g(this.f18063c);
        InterfaceC3331c.a aVar = this.f18064d;
        if (aVar != null) {
            bVar.m14747a(aVar);
        }
        bVar.m14748b(C3461a.m15181f());
        return bVar.m14751e();
    }

    /* renamed from: c */
    protected String m18304c() {
        return "roblox.com";
    }

    /* renamed from: d */
    protected String m18305d(String str, String str2) {
        return "https://" + str + "." + str2;
    }

    /* renamed from: e */
    public C4466k<T> m18306e(InterfaceC3331c.a aVar) {
        this.f18064d = aVar;
        return this;
    }

    /* renamed from: f */
    public C4466k<T> m18307f(C4171d0 c4171d0) {
        this.f18063c = c4171d0;
        return this;
    }
}
