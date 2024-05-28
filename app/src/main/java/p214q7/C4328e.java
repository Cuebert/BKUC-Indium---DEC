package p214q7;

import com.roblox.client.C2877p0;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.C0056n;
import p024bc.C1100c;
import p100h7.C3409b;
import p214q7.AbstractC4329f;
import p249t6.C4734a;
import p249t6.C4735b;
import p300x7.C5564f;

/* renamed from: q7.e */
/* loaded from: classes.dex */
public class C4328e extends AbstractC4329f {

    /* renamed from: F */
    private final long f17581F;

    public C4328e(long j10) {
        this.f17581F = j10;
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: n */
    public void mo7050n() throws Throwable {
        C4734a c4734a = null;
        try {
            JSONObject jSONObject = new JSONObject(C3409b.m15019i(C2877p0.m12896W(this.f17581F), null, null).m15026a());
            c4734a = new C4734a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (c4734a != null) {
            C4735b.m18874b().m18878e(c4734a);
            C5564f.m20442b().m7100c(new C4326c(this.f17581F));
            C1100c.m6458d().m6469j(new C0056n(c4734a.m18866b()));
        }
    }

    @Override // p214q7.AbstractC4329f
    /* renamed from: w */
    protected void mo17841w(AbstractC4329f.a aVar) {
    }
}
