package p154l7;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p008a7.C0050h;
import p024bc.C1100c;
import p035c9.C1151k;
import p156l9.AbstractC3900a;
import p156l9.C3901b;

/* renamed from: l7.b */
/* loaded from: classes.dex */
public class C3888b extends C3901b {

    /* renamed from: l7.b$b */
    /* loaded from: classes.dex */
    private class b implements C3901b.b {
        private b() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            String optString = abstractC3900a.m16542f().optString("placeID");
            if (optString != null) {
                C1151k.m6714h("rbx.hybrid", "ShareGameToChat.execute() " + optString);
                abstractC3900a.mo16537a(true, null);
                return;
            }
            abstractC3900a.mo16537a(false, null);
        }
    }

    /* renamed from: l7.b$c */
    /* loaded from: classes.dex */
    private class c implements C3901b.b {
        private c() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            JSONObject optJSONObject;
            ArrayList arrayList = new ArrayList();
            JSONObject m16542f = abstractC3900a.m16542f();
            if (m16542f != null && (optJSONObject = m16542f.optJSONObject("params")) != null) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("userIds");
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    long optLong = optJSONArray.optLong(i10, -1L);
                    if (optLong != -1) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                }
            }
            if (arrayList.size() > 0) {
                C1100c.m6458d().m6469j(new C0050h(-1L, ((Long) arrayList.get(0)).longValue()));
                abstractC3900a.mo16537a(true, null);
            } else {
                abstractC3900a.mo16537a(false, null);
            }
        }
    }

    public C3888b() {
        super("Chat");
        m16549d("startChatConversation", new c());
        m16549d("shareGameToChat", new b());
    }
}
