package p191o9;

import java.net.CookiePolicy;

/* renamed from: o9.b */
/* loaded from: classes.dex */
public class C4154b implements InterfaceC4153a {

    /* renamed from: b */
    private static final Object f16919b = new Object();

    /* renamed from: a */
    private C4161i f16920a;

    @Override // p191o9.InterfaceC4153a
    /* renamed from: a */
    public C4161i mo15050a() {
        C4161i c4161i;
        synchronized (f16919b) {
            if (this.f16920a == null) {
                this.f16920a = new C4161i(CookiePolicy.ACCEPT_ALL);
            }
            c4161i = this.f16920a;
        }
        return c4161i;
    }
}
