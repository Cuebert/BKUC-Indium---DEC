package p095h2;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p003a2.AbstractC0020o;
import p109i2.InterfaceC3475d;
import p123j2.InterfaceC3595b;

/* renamed from: h2.v */
/* loaded from: classes.dex */
public class C3388v {

    /* renamed from: a */
    private final Executor f14190a;

    /* renamed from: b */
    private final InterfaceC3475d f14191b;

    /* renamed from: c */
    private final InterfaceC3390x f14192c;

    /* renamed from: d */
    private final InterfaceC3595b f14193d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3388v(Executor executor, InterfaceC3475d interfaceC3475d, InterfaceC3390x interfaceC3390x, InterfaceC3595b interfaceC3595b) {
        this.f14190a = executor;
        this.f14191b = interfaceC3475d;
        this.f14192c = interfaceC3390x;
        this.f14193d = interfaceC3595b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m14939d() {
        Iterator<AbstractC0020o> it = this.f14191b.mo15206L().iterator();
        while (it.hasNext()) {
            this.f14192c.mo14897a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m14940e() {
        this.f14193d.mo15306e(new InterfaceC3595b.a() { // from class: h2.t
            @Override // p123j2.InterfaceC3595b.a
            /* renamed from: c */
            public final Object mo14460c() {
                Object m14939d;
                m14939d = C3388v.this.m14939d();
                return m14939d;
            }
        });
    }

    /* renamed from: c */
    public void m14941c() {
        this.f14190a.execute(new Runnable() { // from class: h2.u
            @Override // java.lang.Runnable
            public final void run() {
                C3388v.this.m14940e();
            }
        });
    }
}
