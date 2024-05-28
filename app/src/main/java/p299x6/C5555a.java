package p299x6;

import android.content.Context;
import org.json.JSONObject;
import p262u6.C4867c;
import p262u6.C4868d;

/* renamed from: x6.a */
/* loaded from: classes.dex */
public class C5555a {

    /* renamed from: a */
    private final String f20607a = "configure_dev_settings";

    /* renamed from: b */
    private final String f20608b = "config_json";

    /* renamed from: c */
    private C4868d f20609c;

    /* renamed from: d */
    private JSONObject f20610d;

    /* renamed from: e */
    private Context f20611e;

    public C5555a(Context context) {
        this.f20611e = context;
        C4868d c4868d = new C4868d(context);
        this.f20609c = c4868d;
        C4867c m19064a = c4868d.m19064a(context);
        this.f20610d = m19064a != null ? m19064a.m19055g() : new JSONObject();
    }

    /* renamed from: b */
    public static JSONObject m20346b(Context context) {
        if (context != null) {
            return new C5555a(context).m20347a();
        }
        return null;
    }

    /* renamed from: a */
    public JSONObject m20347a() {
        return this.f20610d;
    }
}
