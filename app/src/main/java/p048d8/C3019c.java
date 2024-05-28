package p048d8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.roblox.client.C2748c0;
import com.roblox.client.C2840k;
import com.roblox.client.C2877p0;
import com.roblox.client.provider.ShellConfigurationContentProvider;
import p034c8.C1139b;
import p035c9.C1151k;
import p048d8.InterfaceC3022f;
import p262u6.C4867c;
import p262u6.EnumC4865a;
import p288w8.C5476k;

/* renamed from: d8.c */
/* loaded from: classes.dex */
public class C3019c implements InterfaceC3022f {

    /* renamed from: a */
    private final String f12870a = "rbx.config";

    /* renamed from: b */
    private Context f12871b;

    /* renamed from: c */
    private ShellConfigurationContentProvider f12872c;

    public C3019c(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f12872c = shellConfigurationContentProvider;
        this.f12871b = context;
    }

    /* renamed from: e */
    private C4867c m13483e() {
        return this.f12872c.m12969d();
    }

    /* renamed from: f */
    private C4867c.a m13484f() {
        return this.f12872c.m12968c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m13485g() {
        Toast.makeText(this.f12871b.getApplicationContext(), C2748c0.f10686l3, 0).show();
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: a */
    public Cursor mo13486a(Uri uri) {
        return new C1139b(this.f12872c.m12969d());
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: b */
    public void mo13481b(Uri uri, ContentValues contentValues) {
        if (contentValues.containsKey("settings_param")) {
            String asString = contentValues.getAsString("settings_param");
            C1151k.m6707a("rbx.config", "new payload:" + asString);
            m13483e().m19058j(asString);
            m13484f().mo6670b(asString);
        }
        if (contentValues.containsKey("channel_param")) {
            String asString2 = contentValues.getAsString("channel_param");
            C1151k.m6707a("rbx.config", "new robloxChannel:" + asString2);
            m13483e().m19061m(asString2);
            m13484f().mo6674f(asString2);
        }
        if (contentValues.containsKey("base_url_param")) {
            String asString3 = contentValues.getAsString("base_url_param");
            C1151k.m6707a("rbx.config", "new baseUrl:" + asString3);
            m13483e().m19059k(asString3);
            m13484f().mo6673e(asString3);
        }
        if (contentValues.containsKey("user_agent_param")) {
            String asString4 = contentValues.getAsString("user_agent_param");
            C1151k.m6707a("rbx.config", "set user agent:" + asString4);
            m13483e().m19062n(asString4);
            m13484f().mo6669a(asString4);
        }
        if (contentValues.containsKey("dev_rpc_ip_port_override")) {
            String asString5 = contentValues.getAsString("dev_rpc_ip_port_override");
            C1151k.m6707a("rbx.config", "set dev rpc ip and port:" + asString5);
            m13483e().m19060l(asString5);
            m13484f().mo6671c(asString5);
            C2840k.m12664e(this.f12871b, asString5);
            new Handler(this.f12871b.getMainLooper()).post(new Runnable() { // from class: d8.b
                @Override // java.lang.Runnable
                public final void run() {
                    C3019c.this.m13485g();
                }
            });
            if (C5476k.m20155t(this.f12871b).m20172w()) {
                C2877p0.m12883P0(true);
            }
        }
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: c */
    public EnumC4865a mo13487c(InterfaceC3022f.a aVar) {
        if (aVar == InterfaceC3022f.a.GET) {
            return EnumC4865a.GetConfig;
        }
        if (aVar == InterfaceC3022f.a.POST) {
            return EnumC4865a.PostConfig;
        }
        return null;
    }
}
