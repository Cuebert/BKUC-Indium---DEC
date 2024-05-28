package p274v6;

import com.appsflyer.oaid.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;

/* renamed from: v6.d */
/* loaded from: classes.dex */
public class C4989d {

    /* renamed from: d */
    private static final C4989d f19078d = new C4989d(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* renamed from: a */
    public final String f19079a;

    /* renamed from: b */
    public final String f19080b;

    /* renamed from: c */
    public final String f19081c;

    public C4989d(String str, String str2) {
        this(str, str2, BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public String m19431a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cvalue", this.f19079a).put("password", this.f19080b);
        } catch (JSONException unused) {
            C1151k.m6709c("rbx.RbxCredential", "Failed to convert to JSON");
        }
        return jSONObject.toString();
    }

    public C4989d(String str, String str2, String str3) {
        this.f19079a = str;
        this.f19080b = str2;
        this.f19081c = str3;
    }
}
