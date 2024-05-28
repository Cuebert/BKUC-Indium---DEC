package p100h7;

import java.net.CookiePolicy;
import p191o9.C4161i;
import p191o9.InterfaceC4153a;

/* renamed from: h7.s */
/* loaded from: classes.dex */
public class C3426s implements InterfaceC4153a {

    /* renamed from: b */
    private static final Object f14313b = new Object();

    /* renamed from: a */
    private C3425r f14314a;

    @Override // p191o9.InterfaceC4153a
    /* renamed from: a */
    public C4161i mo15050a() {
        C3425r c3425r;
        synchronized (f14313b) {
            if (this.f14314a == null) {
                this.f14314a = new C3425r(CookiePolicy.ACCEPT_ALL);
            }
            c3425r = this.f14314a;
        }
        return c3425r;
    }
}
