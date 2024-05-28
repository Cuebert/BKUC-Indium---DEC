package p178n8;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n8.b */
/* loaded from: classes.dex */
public class C4076b {

    /* renamed from: a */
    private final boolean f16557a;

    /* renamed from: b */
    private Map<String, Long> f16558b;

    /* renamed from: n8.b$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        public static final C4076b f16559a = new C4076b();
    }

    /* renamed from: a */
    public static C4076b m16963a() {
        return b.f16559a;
    }

    /* renamed from: b */
    public synchronized JSONObject m16964b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (String str : this.f16558b.keySet()) {
            try {
                jSONObject.put(str, this.f16558b.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private C4076b() {
        this.f16557a = false;
        this.f16558b = new HashMap();
    }
}
