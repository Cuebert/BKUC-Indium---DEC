package p327z8;

import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p035c9.C1155o;
import p091gc.C3348t;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3332d;
import p179n9.C4083g;
import p193ob.AbstractC4183j0;
import p314y8.InterfaceC5907a;

/* renamed from: z8.a */
/* loaded from: classes.dex */
public class C6022a {

    /* renamed from: z8.a$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3332d<AbstractC4183j0> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5907a f22100a;

        a(InterfaceC5907a interfaceC5907a) {
            this.f22100a = interfaceC5907a;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            C6022a.this.m21338c(C1155o.m6742a(c3348t), c3348t.m14732b(), this.f22100a);
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            C6022a.this.m21337b(this.f22100a);
        }
    }

    /* renamed from: a */
    void m21336a(InterfaceC5907a interfaceC5907a, String str) {
        if (interfaceC5907a != null) {
            interfaceC5907a.mo21036a(str);
        }
    }

    /* renamed from: b */
    void m21337b(InterfaceC5907a interfaceC5907a) {
        C1151k.m6712f("rbx.accountsettings", " api failure");
        m21336a(interfaceC5907a, null);
    }

    /* renamed from: c */
    void m21338c(String str, int i10, InterfaceC5907a interfaceC5907a) {
        String str2 = null;
        if (i10 == 200) {
            try {
                str2 = new C6023b(new JSONObject(str)).m21340a();
            } catch (JSONException e10) {
                e10.printStackTrace();
                C1151k.m6708b("JSONException thrown while parsing response to fetch user theme from server. Exception message: " + e10.getMessage());
            }
        } else {
            C1151k.m6712f("rbx.accountsettings", "response code != 200, response code = " + i10);
        }
        m21336a(interfaceC5907a, str2);
    }

    /* renamed from: d */
    public void m21339d(long j10, InterfaceC5907a interfaceC5907a) {
        C4083g.m16979d().mo16973f().m18286a(j10).mo14636W(new a(interfaceC5907a));
    }
}
