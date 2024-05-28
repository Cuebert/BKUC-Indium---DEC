package p214q7;

import org.json.JSONObject;
import p033c7.C1134c;
import p035c9.C1151k;
import p179n9.C4083g;
import p214q7.AbstractC4329f;
import p238s6.C4529a;
import p241s9.C4549a;
import p265u9.C4871a;

/* renamed from: q7.a */
/* loaded from: classes.dex */
public class C4324a extends AbstractC4329f {

    /* renamed from: F */
    private String f17558F;

    /* renamed from: G */
    private long f17559G;

    /* renamed from: H */
    private b f17560H;

    /* renamed from: q7.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ boolean f17561n;

        a(boolean z10) {
            this.f17561n = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4324a.this.f17560H.m17842a(this.f17561n);
        }
    }

    /* renamed from: q7.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m17842a(boolean z10);
    }

    public C4324a(long j10, String str, b bVar) {
        this.f17559G = j10;
        this.f17558F = str;
        this.f17560H = bVar;
    }

    /* renamed from: y */
    private void m17840y(boolean z10) {
        if (this.f17560H != null) {
            AbstractC4329f.m17858v().post(new a(z10));
        }
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: n */
    public void mo7050n() throws Throwable {
        if (C1134c.m6537a().mo6620j1()) {
            String m17462T = C4083g.m16979d().mo16975h().m18300a(new C4871a(new long[]{this.f17559G})).mo14637c().m14731a().m17462T();
            C1151k.m6714h(C4529a.f18274a, "payload:" + m17462T);
            m17840y("success".equals(new JSONObject(m17462T).optString("status")));
            return;
        }
        String m17462T2 = C4083g.m16979d().mo16971d().m18287a(new C4549a(this.f17559G, this.f17558F)).mo14637c().m14731a().m17462T();
        C1151k.m6714h(C4529a.f18274a, "payload:" + m17462T2);
        m17840y("Success".equals(new JSONObject(m17462T2).optString("resultType")));
    }

    @Override // p214q7.AbstractC4329f
    /* renamed from: w */
    protected void mo17841w(AbstractC4329f.a aVar) {
        m17840y(false);
    }
}
