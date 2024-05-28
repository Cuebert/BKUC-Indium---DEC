package p191o9;

import java.util.concurrent.TimeUnit;
import p035c9.C1151k;
import p179n9.C4083g;
import p193ob.C4171d0;
import p193ob.InterfaceC4191p;
import p216q9.C4331a;
import p216q9.C4332b;
import p329zb.C6029a;

/* renamed from: o9.c */
/* loaded from: classes.dex */
public class C4155c implements InterfaceC4157e {

    /* renamed from: a */
    private InterfaceC4191p f16921a;

    /* renamed from: b */
    private int f16922b;

    /* renamed from: c */
    private int f16923c;

    /* renamed from: d */
    private String f16924d;

    /* renamed from: o9.c$a */
    /* loaded from: classes.dex */
    class a implements C6029a.b {
        a() {
        }

        @Override // p329zb.C6029a.b
        /* renamed from: a */
        public void mo17231a(String str) {
            C1151k.m6707a("rbx.http", str);
        }
    }

    public C4155c() {
        this(null);
    }

    @Override // p191o9.InterfaceC4157e
    /* renamed from: a */
    public C4171d0 mo17230a() {
        C6029a c6029a = new C6029a(new a());
        c6029a.m21356d(C6029a.a.BODY);
        C4171d0.b bVar = new C4171d0.b();
        bVar.m17327a(c6029a);
        String str = this.f16924d;
        if (str != null) {
            bVar.m17328b(new C4331a(str));
        }
        bVar.m17328b(new C4332b());
        long j10 = this.f16922b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.m17331e(j10, timeUnit);
        bVar.m17335i(this.f16923c, timeUnit);
        InterfaceC4191p interfaceC4191p = this.f16921a;
        if (interfaceC4191p == null) {
            interfaceC4191p = C4161i.m17249e();
        }
        bVar.m17332f(interfaceC4191p);
        bVar.m17334h(false);
        return bVar.m17329c();
    }

    public C4155c(InterfaceC4191p interfaceC4191p) {
        this(interfaceC4191p, 30, 30, C4083g.m16980e());
    }

    public C4155c(InterfaceC4191p interfaceC4191p, int i10, int i11, String str) {
        this.f16921a = interfaceC4191p;
        this.f16922b = i10;
        this.f16923c = i11;
        this.f16924d = str;
    }
}
