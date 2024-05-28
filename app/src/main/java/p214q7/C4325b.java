package p214q7;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import p033c7.C1134c;
import p179n9.C4083g;
import p214q7.AbstractC4329f;
import p238s6.C4529a;
import p241s9.C4550b;
import p265u9.C4872b;

/* renamed from: q7.b */
/* loaded from: classes.dex */
public class C4325b extends AbstractC4329f {

    /* renamed from: F */
    private String f17563F;

    /* renamed from: G */
    private long f17564G;

    /* renamed from: H */
    private c f17565H;

    /* renamed from: q7.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f17566n;

        a(String str) {
            this.f17566n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4325b.this.f17565H.mo12976b(this.f17566n);
        }
    }

    /* renamed from: q7.b$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f17568n;

        /* renamed from: o */
        final /* synthetic */ String f17569o;

        b(String str, String str2) {
            this.f17568n = str;
            this.f17569o = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4325b.this.f17565H.mo12975a(this.f17568n, this.f17569o);
        }
    }

    /* renamed from: q7.b$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo12975a(String str, String str2);

        /* renamed from: b */
        void mo12976b(String str);
    }

    public C4325b(long j10, String str, c cVar) {
        super(AbstractC4329f.m17857u().m17109i(Long.toString(j10)));
        this.f17564G = j10;
        this.f17563F = str;
        this.f17565H = cVar;
    }

    /* renamed from: A */
    private void m17843A(String str, String str2) {
        String str3 = str2 != null ? str2 : "Send Failed";
        if (str2 == null) {
            str = C1134c.m6537a().mo6620j1() ? "failed" : "Failure";
        }
        m17845y(str, str3);
    }

    /* renamed from: y */
    private void m17845y(String str, String str2) {
        if (this.f17565H != null) {
            AbstractC4329f.m17858v().post(new b(str, str2));
        }
    }

    /* renamed from: z */
    private void m17846z(String str) {
        if (this.f17565H != null) {
            AbstractC4329f.m17858v().post(new a(str));
        }
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: n */
    public void mo7050n() throws Throwable {
        if (C1134c.m6537a().mo6620j1()) {
            String m17462T = C4083g.m16979d().mo16975h().m18301b(new C4872b(this.f17564G, new String[]{this.f17563F})).mo14637c().m14731a().m17462T();
            Log.v(C4529a.f18274a, "CPMJ.onRun() payload:" + m17462T);
            JSONArray jSONArray = new JSONObject(m17462T).getJSONArray("messages");
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                String string = jSONObject.getString("status");
                if ("success".equals(string)) {
                    m17846z(jSONObject.getString("id"));
                    return;
                } else {
                    m17843A(string, "Send Failed");
                    return;
                }
            }
            m17843A("failed", "No messages in the response");
            return;
        }
        String m17462T2 = C4083g.m16979d().mo16971d().m18288b(new C4550b(this.f17564G, this.f17563F)).mo14637c().m14731a().m17462T();
        Log.v(C4529a.f18274a, "CPMJ.onRun() payload:" + m17462T2);
        JSONObject jSONObject2 = new JSONObject(m17462T2);
        String string2 = jSONObject2.getString("resultType");
        if (!"Success".equals(string2)) {
            m17843A(string2, jSONObject2.optString("statusMessage"));
        } else {
            m17846z(jSONObject2.getString("messageId"));
        }
    }

    @Override // p214q7.AbstractC4329f
    /* renamed from: w */
    protected void mo17841w(AbstractC4329f.a aVar) {
        m17843A(null, null);
    }
}
