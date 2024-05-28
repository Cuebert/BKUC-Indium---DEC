package p214q7;

import com.roblox.client.C2877p0;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;
import p035c9.C1151k;
import p091gc.C3348t;
import p100h7.C3409b;
import p179n9.C4083g;
import p214q7.AbstractC4329f;
import p289w9.C5481a;
import p289w9.C5482b;

/* renamed from: q7.d */
/* loaded from: classes.dex */
public class C4327d extends AbstractC4329f {

    /* renamed from: F */
    private long f17572F;

    /* renamed from: G */
    private b f17573G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q7.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ boolean f17574n;

        /* renamed from: o */
        final /* synthetic */ c f17575o;

        a(boolean z10, c cVar) {
            this.f17574n = z10;
            this.f17575o = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4327d.this.f17573G.mo12618a(this.f17574n, this.f17575o);
        }
    }

    /* renamed from: q7.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12618a(boolean z10, c cVar);
    }

    /* renamed from: q7.d$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private long f17577a;

        /* renamed from: b */
        private String f17578b;

        /* renamed from: c */
        private String f17579c;

        /* renamed from: d */
        private String f17580d;

        public c(long j10, String str, String str2, String str3) {
            this.f17577a = j10;
            this.f17578b = str;
            this.f17579c = str2;
            this.f17580d = str3;
        }

        /* renamed from: a */
        public long m17851a() {
            return this.f17577a;
        }

        /* renamed from: b */
        public String m17852b() {
            return this.f17579c;
        }

        /* renamed from: c */
        public String m17853c() {
            return this.f17578b;
        }

        /* renamed from: d */
        public String m17854d() {
            return this.f17580d;
        }

        /* renamed from: e */
        public void m17855e(String str) {
            this.f17579c = str;
        }

        /* renamed from: f */
        public void m17856f(String str) {
            this.f17578b = str;
        }
    }

    public C4327d(long j10, b bVar) {
        this.f17572F = j10;
        this.f17573G = bVar;
    }

    /* renamed from: y */
    private String m17849y() throws IOException {
        C5482b m14731a;
        List<C5481a> list;
        C3348t<C5482b> mo14637c = C4083g.m16979d().mo16974g().m18308a(Long.toString(this.f17572F), null, "420x420", "Png", Boolean.FALSE).mo14637c();
        if (!mo14637c.m14735f() || (m14731a = mo14637c.m14731a()) == null || (list = m14731a.data) == null || list.get(0) == null) {
            return null;
        }
        return m14731a.data.get(0).imageUrl;
    }

    /* renamed from: z */
    private void m17850z(boolean z10, c cVar) {
        if (this.f17573G != null) {
            AbstractC4329f.m17858v().post(new a(z10, cVar));
        }
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: n */
    public void mo7050n() throws Throwable {
        String m15026a = C3409b.m15019i(C2877p0.m12953v0(this.f17572F), null, null).m15026a();
        C1151k.m6714h("rbx.catalog", "payload:" + m15026a);
        JSONObject jSONObject = new JSONObject(m15026a);
        m17850z(true, new c(this.f17572F, jSONObject.getString("Name"), jSONObject.getString("Description"), m17849y()));
    }

    @Override // p214q7.AbstractC4329f
    /* renamed from: w */
    protected void mo17841w(AbstractC4329f.a aVar) {
        m17850z(false, null);
    }
}
