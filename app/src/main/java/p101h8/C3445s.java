package p101h8;

import android.content.Context;
import com.roblox.client.C2822f0;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p035c9.C1153m;
import p100h7.C3409b;
import p115i8.C3546a;
import p129j8.C3667j;
import p300x7.C5560b;

/* renamed from: h8.s */
/* loaded from: classes.dex */
public class C3445s {

    /* renamed from: a */
    b f14332a = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.s$a */
    /* loaded from: classes.dex */
    public class a implements b {
        a() {
        }

        @Override // p101h8.C3445s.b
        /* renamed from: a */
        public void mo15166a(C3667j c3667j, Context context, String str, String str2, C3436j c3436j) {
            if (c3667j != null) {
                JSONObject m15608a = c3667j.m15608a();
                try {
                    c3436j.m15117d(m15608a, context);
                    C2822f0.m12497s("onMetadataRetrieved", str, m15608a.getString("type"), m15608a.getString("notificationId"), str2, "0", new ArrayList());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* renamed from: h8.s$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo15166a(C3667j c3667j, Context context, String str, String str2, C3436j c3436j);
    }

    /* renamed from: b */
    private String m15161b(Context context) {
        return C1153m.m6738a(context);
    }

    /* renamed from: c */
    private C3444r m15162c() {
        return new C3444r();
    }

    /* renamed from: a */
    String m15163a(Context context, String str, C3444r c3444r) {
        return c3444r.m15156a(context, str);
    }

    /* renamed from: d */
    void m15164d(Context context, C3546a c3546a, String str, String str2, String str3, String str4, b bVar) {
        C1151k.m6714h("rbx.push", str + " " + str2 + " " + context);
        if (str == null || str2 == null || context == null) {
            return;
        }
        c3546a.m15344b(context, str, str2, str3, str4, bVar);
    }

    /* renamed from: e */
    public void m15165e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        C3444r m15162c = m15162c();
        String m15163a = m15163a(context, C3439m.m15122c().m15126e(context), m15162c);
        String m15163a2 = m15163a(context, C3439m.m15122c().m15129i(context), m15162c);
        String m15161b = m15161b(context);
        C5560b.m20357e().m20366k(context, C5560b.d.APP_INIT_TYPE_SHELL);
        C3409b.m15015e(context);
        m15164d(context, new C3546a(), m15163a, m15163a2, str, m15161b, this.f14332a);
    }
}
