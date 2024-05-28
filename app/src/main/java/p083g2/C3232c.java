package p083g2;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p003a2.AbstractC0014i;
import p003a2.AbstractC0020o;
import p003a2.C0025t;
import p016b2.InterfaceC0973e;
import p016b2.InterfaceC0981m;
import p095h2.InterfaceC3390x;
import p109i2.InterfaceC3475d;
import p123j2.InterfaceC3595b;
import p307y1.InterfaceC5599h;

/* renamed from: g2.c */
/* loaded from: classes.dex */
public class C3232c implements InterfaceC3234e {

    /* renamed from: f */
    private static final Logger f13662f = Logger.getLogger(C0025t.class.getName());

    /* renamed from: a */
    private final InterfaceC3390x f13663a;

    /* renamed from: b */
    private final Executor f13664b;

    /* renamed from: c */
    private final InterfaceC0973e f13665c;

    /* renamed from: d */
    private final InterfaceC3475d f13666d;

    /* renamed from: e */
    private final InterfaceC3595b f13667e;

    public C3232c(Executor executor, InterfaceC0973e interfaceC0973e, InterfaceC3390x interfaceC3390x, InterfaceC3475d interfaceC3475d, InterfaceC3595b interfaceC3595b) {
        this.f13664b = executor;
        this.f13665c = interfaceC0973e;
        this.f13663a = interfaceC3390x;
        this.f13666d = interfaceC3475d;
        this.f13667e = interfaceC3595b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m14463d(AbstractC0020o abstractC0020o, AbstractC0014i abstractC0014i) {
        this.f13666d.mo15205H(abstractC0020o, abstractC0014i);
        this.f13663a.mo14897a(abstractC0020o, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m14464e(final AbstractC0020o abstractC0020o, InterfaceC5599h interfaceC5599h, AbstractC0014i abstractC0014i) {
        try {
            InterfaceC0981m mo6157a = this.f13665c.mo6157a(abstractC0020o.mo112b());
            if (mo6157a == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC0020o.mo112b());
                f13662f.warning(format);
                interfaceC5599h.mo152a(new IllegalArgumentException(format));
            } else {
                final AbstractC0014i mo6175a = mo6157a.mo6175a(abstractC0014i);
                this.f13667e.mo15306e(new InterfaceC3595b.a() { // from class: g2.a
                    @Override // p123j2.InterfaceC3595b.a
                    /* renamed from: c */
                    public final Object mo14460c() {
                        Object m14463d;
                        m14463d = C3232c.this.m14463d(abstractC0020o, mo6175a);
                        return m14463d;
                    }
                });
                interfaceC5599h.mo152a(null);
            }
        } catch (Exception e10) {
            f13662f.warning("Error scheduling event " + e10.getMessage());
            interfaceC5599h.mo152a(e10);
        }
    }

    @Override // p083g2.InterfaceC3234e
    /* renamed from: a */
    public void mo14465a(final AbstractC0020o abstractC0020o, final AbstractC0014i abstractC0014i, final InterfaceC5599h interfaceC5599h) {
        this.f13664b.execute(new Runnable() { // from class: g2.b
            @Override // java.lang.Runnable
            public final void run() {
                C3232c.this.m14464e(abstractC0020o, interfaceC5599h, abstractC0014i);
            }
        });
    }
}
