package p154l7;

import android.os.Bundle;
import org.json.JSONObject;
import p035c9.C1151k;
import p074f7.C3197z;
import p156l9.AbstractC3900a;
import p156l9.C3901b;
import p300x7.C5562d;

/* renamed from: l7.d */
/* loaded from: classes.dex */
public class C3890d extends C3901b {

    /* renamed from: l7.d$b */
    /* loaded from: classes.dex */
    private class b implements C3901b.b {
        private b() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            JSONObject m16542f = abstractC3900a.m16542f();
            if (m16542f != null) {
                JSONObject optJSONObject = m16542f.optJSONObject("request");
                if ("RequestGame".equals(optJSONObject.optString("requestType"))) {
                    try {
                        C3197z m14028a = C3197z.m14028a(Long.valueOf(Long.parseLong(optJSONObject.optString("placeId"))), null, null, null, null, null, null, null, "WebView", null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", C3197z.m14027G(m14028a));
                        C5562d.m20371c().m20375f(101, bundle);
                        abstractC3900a.mo16537a(true, null);
                        return;
                    } catch (NumberFormatException unused) {
                        C1151k.m6716j("rbx.hybrid", "Unsupported launchGame request");
                    }
                }
            }
            C1151k.m6716j("rbx.hybrid", "launchGame request failed");
            abstractC3900a.mo16537a(false, null);
        }
    }

    public C3890d() {
        super("Game");
        m16549d("launchGame", new b());
    }
}
