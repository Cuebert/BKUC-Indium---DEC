package p062e8;

import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p100h7.C3417j;
import p100h7.InterfaceC3413f;
import p100h7.InterfaceC3419l;
import p114i7.C3544e;
import p300x7.C5563e;
import p300x7.C5565g;

/* renamed from: e8.e */
/* loaded from: classes.dex */
public class C3094e {

    /* renamed from: a */
    private InterfaceC3413f f12992a;

    /* renamed from: b */
    private C5563e f12993b = C5563e.m20379h();

    /* renamed from: e8.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3419l {

        /* renamed from: a */
        final /* synthetic */ d f12994a;

        /* renamed from: b */
        final /* synthetic */ String f12995b;

        a(d dVar, String str) {
            this.f12994a = dVar;
            this.f12995b = str;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: a */
        public void mo12250a(C3417j c3417j) {
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            c cVar;
            String m15026a = c3417j.m15026a();
            if (m15026a != null) {
                C1151k.m6712f("rbx.purchaseflow", "response Str " + m15026a);
                C1151k.m6712f("rbx.purchaseflow", "response Code " + c3417j.m15027b());
            }
            int m15027b = c3417j.m15027b();
            if (m15027b == 200) {
                C1151k.m6712f("rbx.purchaseflow", "Validation successful");
                cVar = c.OK;
                C3094e.this.f12993b.m20393F();
            } else if (m15027b == 429) {
                C1151k.m6709c("rbx.purchaseflow", "Service has been rate limited to user.");
                C3094e.this.f12993b.m20398K();
                try {
                    int i10 = new JSONObject(m15026a).getJSONArray("errors").getJSONObject(0).getInt("code");
                    if (i10 == 7 || i10 == 6) {
                        cVar = c.LIMIT_UNDER_13;
                    }
                } catch (JSONException unused) {
                }
                cVar = c.LIMIT;
            } else if (m15027b == 500) {
                C1151k.m6709c("rbx.purchaseflow", "Server Error");
                cVar = c.UNKNOWN_ERROR;
                C3094e.this.f12993b.m20399L();
            } else if (m15027b == 503) {
                C1151k.m6709c("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
                cVar = c.RETRY;
                C3094e.this.f12993b.m20400M();
            } else if (m15027b == 400) {
                C1151k.m6709c("rbx.purchaseflow", "Service has thrown an uknown exception.");
                cVar = c.UNKNOWN_ERROR;
                C3094e.this.f12993b.m20394G();
            } else if (m15027b == 401) {
                C1151k.m6709c("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
                cVar = c.ERROR;
                C3094e.this.f12993b.m20395H();
            } else if (m15027b == 403) {
                C1151k.m6709c("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
                cVar = c.ERROR;
                C3094e.this.f12993b.m20396I();
            } else if (m15027b != 404) {
                C1151k.m6709c("rbx.purchaseflow", "Validation unknown error");
                cVar = c.UNKNOWN_ERROR;
                C3094e.this.f12993b.m20401N();
            } else {
                C1151k.m6709c("rbx.purchaseflow", "{validateModel} is invalid.");
                cVar = c.ERROR;
                C3094e.this.f12993b.m20397J();
            }
            d dVar = this.f12994a;
            if (dVar != null) {
                dVar.mo13616a(cVar, this.f12995b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e8.e$b */
    /* loaded from: classes.dex */
    public class b implements C5565g.d {

        /* renamed from: a */
        final /* synthetic */ String f12997a;

        /* renamed from: b */
        final /* synthetic */ String f12998b;

        /* renamed from: c */
        final /* synthetic */ String f12999c;

        /* renamed from: d */
        final /* synthetic */ d f13000d;

        b(String str, String str2, String str3, d dVar) {
            this.f12997a = str;
            this.f12998b = str2;
            this.f12999c = str3;
            this.f13000d = dVar;
        }

        @Override // p300x7.C5565g.d
        /* renamed from: a */
        public void mo13586a(boolean z10, int i10) {
            if (z10) {
                C3094e.this.m13614b(this.f12997a, this.f12998b, this.f12999c, this.f13000d);
                return;
            }
            d dVar = this.f13000d;
            if (dVar != null) {
                dVar.mo13616a(c.ERROR_CHECKING_BALANCE, this.f12998b);
            }
        }
    }

    /* renamed from: e8.e$c */
    /* loaded from: classes.dex */
    public enum c {
        OK,
        ERROR,
        RETRY,
        LIMIT,
        LIMIT_UNDER_13,
        ERROR_CHECKING_BALANCE,
        UNKNOWN_ERROR
    }

    /* renamed from: e8.e$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo13616a(c cVar, String str);
    }

    public C3094e(InterfaceC3413f interfaceC3413f) {
        this.f12992a = interfaceC3413f;
    }

    /* renamed from: b */
    public void m13614b(String str, String str2, String str3, d dVar) {
        this.f12992a.mo15023a(str, new C3544e(str2, str3), null, new a(dVar, str2)).mo15006c();
        this.f12993b.m20392E();
    }

    /* renamed from: c */
    public void m13615c(String str, String str2, String str3, d dVar) {
        C1151k.m6712f("rbx.purchaseflow", "Get balance.");
        C5565g.m20445e().m20462n(new b(str, str2, str3, dVar), this.f12992a);
    }
}
