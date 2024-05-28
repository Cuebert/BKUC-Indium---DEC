package p064ea;

import android.app.Activity;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;
import p232s0.AbstractC4490b;
import p232s0.AbstractC4492c;
import p232s0.AbstractC4498i;
import p232s0.C4489a0;
import p232s0.C4494e;
import p232s0.C4495f;
import p232s0.C4496g;
import p232s0.C4497h;
import p232s0.C4499j;
import p232s0.C4509t;
import p232s0.C4510u;
import p232s0.C4512w;
import p232s0.C4513x;
import p232s0.C4514y;
import p232s0.InterfaceC4500k;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;
import p243t0.C4594c;
import p243t0.C4597f;
import p243t0.C4602k;
import p243t0.C4605n;
import p243t0.C4608q;
import p243t0.C4609r;
import p256u0.C4793l;
import p268v0.C4933a;

/* renamed from: ea.e */
/* loaded from: classes.dex */
public class C3105e {

    /* renamed from: c */
    private static final String f13039c = "e";

    /* renamed from: a */
    private WeakReference<InterfaceC4500k> f13040a;

    /* renamed from: b */
    private final ExecutorService f13041b = Executors.newSingleThreadExecutor();

    /* renamed from: ea.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4501l<C4510u, AbstractC4604m> {

        /* renamed from: a */
        final /* synthetic */ c f13042a;

        /* renamed from: b */
        final /* synthetic */ String f13043b;

        a(c cVar, String str) {
            this.f13042a = cVar;
            this.f13043b = str;
        }

        @Override // p232s0.InterfaceC4501l
        /* renamed from: b */
        public void mo13660a(AbstractC4604m abstractC4604m) {
            Log.e(C3105e.f13039c, "Error getting credentials: ", abstractC4604m);
            if (abstractC4604m instanceof C4605n) {
                this.f13042a.mo13648b(2, abstractC4604m.getMessage());
                return;
            }
            if (abstractC4604m instanceof C4602k) {
                this.f13042a.mo13648b(1, abstractC4604m.getMessage());
                return;
            }
            if (abstractC4604m instanceof C4609r) {
                this.f13042a.mo13648b(6, abstractC4604m.getMessage());
            } else if (abstractC4604m instanceof C4608q) {
                this.f13042a.mo13648b(7, abstractC4604m.getMessage());
            } else {
                this.f13042a.mo13648b(0, abstractC4604m.getMessage());
            }
        }

        @Override // p232s0.InterfaceC4501l
        /* renamed from: c */
        public void onResult(C4510u c4510u) {
            AbstractC4498i m18524a = c4510u.m18524a();
            if (m18524a instanceof C4489a0) {
                this.f13042a.mo13647a(((C4489a0) m18524a).m18463a(), this.f13043b);
                return;
            }
            if (m18524a instanceof C4514y) {
                C4514y c4514y = (C4514y) m18524a;
                String m18528a = c4514y.m18528a();
                String m18529b = c4514y.m18529b();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("username", m18528a);
                    jSONObject.put("password", m18529b);
                    this.f13042a.mo13647a(jSONObject.toString(), this.f13043b);
                    return;
                } catch (JSONException e10) {
                    this.f13042a.mo13648b(4, e10.getMessage());
                    return;
                }
            }
            this.f13042a.mo13648b(0, "Unexpected GetCredentialResponse");
        }
    }

    /* renamed from: ea.e$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC4501l<AbstractC4492c, AbstractC4596e> {

        /* renamed from: a */
        final /* synthetic */ c f13045a;

        b(c cVar) {
            this.f13045a = cVar;
        }

        @Override // p232s0.InterfaceC4501l
        /* renamed from: b */
        public void mo13660a(AbstractC4596e abstractC4596e) {
            Log.e(C3105e.f13039c, "Error registering credentials ", abstractC4596e);
            if (abstractC4596e instanceof C4933a) {
                if (((C4933a) abstractC4596e).m19354b() instanceof C4793l) {
                    this.f13045a.mo13648b(11, abstractC4596e.getMessage());
                    return;
                } else {
                    this.f13045a.mo13648b(0, abstractC4596e.getMessage());
                    return;
                }
            }
            if (abstractC4596e instanceof C4594c) {
                this.f13045a.mo13648b(1, abstractC4596e.getMessage());
                return;
            }
            if (abstractC4596e instanceof C4597f) {
                this.f13045a.mo13648b(2, abstractC4596e.getMessage());
                return;
            }
            Log.w(C3105e.f13039c, "Unexpected exception type " + abstractC4596e.getClass().getName());
            this.f13045a.mo13648b(0, abstractC4596e.getMessage());
        }

        @Override // p232s0.InterfaceC4501l
        /* renamed from: c */
        public void onResult(AbstractC4492c abstractC4492c) {
            if (abstractC4492c instanceof C4497h) {
                this.f13045a.mo13647a(((C4497h) abstractC4492c).m18484a(), "FIDO2");
            } else if (abstractC4492c instanceof C4495f) {
                this.f13045a.mo13647a(BuildConfig.FLAVOR, "password");
            } else {
                this.f13045a.mo13648b(0, "Unexpected CreateCredentialResponse");
            }
        }
    }

    /* renamed from: ea.e$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo13647a(String str, String str2);

        /* renamed from: b */
        void mo13648b(int i10, String str);
    }

    /* renamed from: h */
    private InterfaceC4500k m13651h(Activity activity) {
        WeakReference<InterfaceC4500k> weakReference = this.f13040a;
        if (weakReference == null || weakReference.get() == null) {
            this.f13040a = new WeakReference<>(C4499j.m18488a(activity));
        }
        return this.f13040a.get();
    }

    /* renamed from: b */
    public void m13652b(Activity activity, JSONObject jSONObject, String str, c cVar) {
        try {
            AbstractC4490b m13654d = m13654d(jSONObject, str);
            if (m13654d != null) {
                m13653c(activity, m13654d, cVar, m13651h(activity));
            } else {
                cVar.mo13648b(0, BuildConfig.FLAVOR);
            }
        } catch (IllegalArgumentException | JSONException e10) {
            cVar.mo13648b(3, e10.getMessage());
        }
    }

    /* renamed from: c */
    void m13653c(Activity activity, AbstractC4490b abstractC4490b, c cVar, InterfaceC4500k interfaceC4500k) {
        interfaceC4500k.mo18489a(activity, abstractC4490b, new CancellationSignal(), this.f13041b, new b(cVar));
    }

    /* renamed from: d */
    AbstractC4490b m13654d(JSONObject jSONObject, String str) throws IllegalArgumentException, JSONException {
        AbstractC4490b c4496g;
        if (C1134c.m6537a().mo6593a1()) {
            if (str != null && !str.isEmpty()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("parameters");
                if (str.equals("FIDO2") && m13659j()) {
                    c4496g = new C4496g(jSONObject2.getJSONObject("publicKey").toString());
                } else {
                    c4496g = str.equals("password") ? new C4494e(jSONObject2.getString("username"), jSONObject2.getString("password")) : null;
                }
            } else {
                throw new IllegalArgumentException("CredentialType not set!");
            }
        } else if (m13659j()) {
            c4496g = new C4496g(jSONObject.toString());
        } else {
            throw new IllegalArgumentException("Public Key Credential not supported!");
        }
        if (c4496g != null) {
            return c4496g;
        }
        throw new IllegalArgumentException("Invalid create credential request!");
    }

    /* renamed from: e */
    public void m13655e(Activity activity, JSONObject jSONObject, c cVar) {
        try {
            C4509t m13658i = m13658i(jSONObject);
            if (m13658i != null) {
                m13656f(activity, m13658i, m13657g(jSONObject), cVar, m13651h(activity));
            } else {
                cVar.mo13648b(0, BuildConfig.FLAVOR);
            }
        } catch (IllegalArgumentException | JSONException e10) {
            cVar.mo13648b(3, e10.getMessage());
        }
    }

    /* renamed from: f */
    void m13656f(Activity activity, C4509t c4509t, String str, c cVar, InterfaceC4500k interfaceC4500k) {
        interfaceC4500k.mo18490b(activity, c4509t, new CancellationSignal(), this.f13041b, new a(cVar, str));
    }

    /* renamed from: g */
    String m13657g(JSONObject jSONObject) {
        return (C1134c.m6537a().mo6593a1() && !jSONObject.has("credentialType") && (jSONObject.has("FIDO2") || jSONObject.has("password"))) ? "all" : "FIDO2";
    }

    /* renamed from: i */
    C4509t m13658i(JSONObject jSONObject) throws IllegalArgumentException, JSONException {
        if (m13657g(jSONObject).equalsIgnoreCase("FIDO2") && m13659j()) {
            return new C4509t.a().m18521a(new C4513x(jSONObject.getJSONObject("parameters").getJSONObject("publicKey").toString())).m18522b();
        }
        C4509t.a aVar = new C4509t.a();
        JSONObject optJSONObject = jSONObject.optJSONObject("FIDO2");
        if (optJSONObject != null && m13659j()) {
            aVar.m18521a(new C4513x(optJSONObject.getJSONObject("publicKey").toString()));
        }
        if (jSONObject.has("password")) {
            aVar.m18521a(new C4512w());
        }
        return aVar.m18522b();
    }

    /* renamed from: j */
    public boolean m13659j() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
