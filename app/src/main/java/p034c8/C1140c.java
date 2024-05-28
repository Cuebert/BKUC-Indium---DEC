package p034c8;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2877p0;
import p035c9.C1156p;
import p227r8.C4453a;
import p262u6.C4867c;

/* renamed from: c8.c */
/* loaded from: classes.dex */
public class C1140c implements C4867c.a {

    /* renamed from: a */
    private C4453a f5479a;

    /* renamed from: b */
    private SharedPreferences f5480b;

    /* renamed from: c */
    private String f5481c;

    public C1140c(Context context) {
        this.f5479a = new C4453a(context);
        this.f5480b = C1156p.m6745e(context.getApplicationContext()).m6747d("configure_dev_roblox", true);
        C2877p0.m12891T0(context);
        this.f5481c = C2877p0.m12938o(context);
    }

    @Override // p262u6.C4867c.a
    /* renamed from: a */
    public void mo6669a(String str) {
        if (str != null) {
            this.f5480b.edit().putString("user_agent", str).apply();
        } else {
            this.f5480b.edit().remove("user_agent").apply();
        }
    }

    @Override // p262u6.C4867c.a
    /* renamed from: b */
    public void mo6670b(String str) {
        if (str != null) {
            this.f5479a.m18281h(str);
        } else {
            this.f5479a.m18278a();
        }
    }

    @Override // p262u6.C4867c.a
    /* renamed from: c */
    public void mo6671c(String str) {
        if (str != null) {
            this.f5480b.edit().putString("dev_rpc_ip_port_override", str).apply();
        } else {
            this.f5480b.edit().remove("dev_rpc_ip_port_override").apply();
        }
    }

    @Override // p262u6.C4867c.a
    /* renamed from: d */
    public C4867c mo6672d() {
        String m18280g = this.f5479a.m18280g();
        return new C4867c(this.f5480b.getString("RobloxChannel", null), BuildConfig.FLAVOR, this.f5480b.getString("BaseUrl", null), "www.roblox.com", m18280g, this.f5480b.getString("user_agent", null), this.f5481c, this.f5480b.getString("dev_rpc_ip_port_override", null));
    }

    @Override // p262u6.C4867c.a
    /* renamed from: e */
    public void mo6673e(String str) {
        if (str != null) {
            this.f5480b.edit().putString("BaseUrl", str).apply();
        } else {
            this.f5480b.edit().remove("BaseUrl").apply();
        }
    }

    @Override // p262u6.C4867c.a
    /* renamed from: f */
    public void mo6674f(String str) {
        if (str != null) {
            this.f5480b.edit().putString("RobloxChannel", str).apply();
        } else {
            this.f5480b.edit().remove("RobloxChannel").apply();
        }
    }
}
