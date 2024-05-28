package p062e8;

import p035c9.C1151k;
import p100h7.C3417j;
import p100h7.InterfaceC3413f;
import p100h7.InterfaceC3419l;
import p114i7.InterfaceC3542c;
import p300x7.C5563e;

/* renamed from: e8.j */
/* loaded from: classes.dex */
public class C3099j {

    /* renamed from: a */
    private InterfaceC3413f f13014a;

    /* renamed from: b */
    private C5563e f13015b = C5563e.m20379h();

    /* renamed from: e8.j$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3419l {

        /* renamed from: a */
        final /* synthetic */ c f13016a;

        a(c cVar) {
            this.f13016a = cVar;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: a */
        public void mo12250a(C3417j c3417j) {
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            b bVar;
            C1151k.m6712f("rbx.purchaseflow", "Verify Purchase callback. response code " + c3417j.m15027b() + " responseBody = " + c3417j.m15026a() + ".");
            int m15027b = c3417j.m15027b();
            if (m15027b == 200) {
                C1151k.m6712f("rbx.purchaseflow", "Verification success");
                bVar = b.OK;
                C3099j.this.f13015b.m20403P();
            } else if (m15027b == 500) {
                C1151k.m6709c("rbx.purchaseflow", "Server error");
                bVar = b.UNKNOWN;
                C3099j.this.f13015b.m20406S();
            } else if (m15027b == 400) {
                C1151k.m6709c("rbx.purchaseflow", "Service was unable to validate receiptId.");
                bVar = b.ERROR;
                C3099j.this.f13015b.m20404Q();
            } else if (m15027b != 401) {
                C1151k.m6709c("rbx.purchaseflow", "Unknown");
                bVar = b.UNKNOWN;
                C3099j.this.f13015b.m20407T();
            } else {
                C1151k.m6709c("rbx.purchaseflow", "Unauthorized to make request.");
                bVar = b.BOGUS;
                C3099j.this.f13015b.m20405R();
            }
            c cVar = this.f13016a;
            if (cVar != null) {
                cVar.mo13624a(bVar);
            }
        }
    }

    /* renamed from: e8.j$b */
    /* loaded from: classes.dex */
    public enum b {
        OK,
        ERROR,
        BOGUS,
        EMPTY_RESPONSE,
        UNKNOWN
    }

    /* renamed from: e8.j$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo13624a(b bVar);
    }

    public C3099j(InterfaceC3413f interfaceC3413f) {
        this.f13014a = interfaceC3413f;
    }

    /* renamed from: b */
    public void m13623b(String str, InterfaceC3542c interfaceC3542c, c cVar) {
        this.f13014a.mo15023a(str, interfaceC3542c, null, new a(cVar)).mo15006c();
        this.f13015b.m20402O();
    }
}
