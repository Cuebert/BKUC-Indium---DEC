package p101h8;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p129j8.C3666i;

/* renamed from: h8.j */
/* loaded from: classes.dex */
public class C3436j {
    /* renamed from: a */
    private String m15114a(C3666i c3666i) {
        if (c3666i != null) {
            return c3666i.m15607d();
        }
        return null;
    }

    /* renamed from: b */
    private C3666i m15115b(JSONObject jSONObject) {
        try {
            return new C3666i(jSONObject);
        } catch (C3433g e10) {
            C1151k.m6708b(e10.getMessage());
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    void m15116c(Context context, C3666i c3666i, C3434h c3434h, C3430d c3430d, C3429c c3429c) throws JSONException {
        String m15114a;
        if (c3666i == null || (m15114a = m15114a(c3666i)) == null) {
            return;
        }
        if (c3434h != null && ("FriendRequestAccepted".equals(m15114a) || "FriendRequestReceived".equals(m15114a) || "PrivateMessageReceived".equals(m15114a) || "ChatNewMessage".equals(m15114a))) {
            c3434h.m15112f(c3666i, context);
            return;
        }
        if ("PushExpiryMessage".equals(m15114a) && c3430d != null) {
            c3430d.m15096b(c3666i, context);
        } else {
            if (!"PushCategoryExpiryMessage".equals(m15114a) || c3429c == null) {
                return;
            }
            c3429c.m15089b(c3666i, context);
        }
    }

    /* renamed from: d */
    public void m15117d(JSONObject jSONObject, Context context) throws JSONException {
        m15116c(context, m15115b(jSONObject), new C3434h(), new C3430d(), new C3429c());
    }
}
