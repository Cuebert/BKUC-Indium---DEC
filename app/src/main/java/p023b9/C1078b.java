package p023b9;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2877p0;

/* renamed from: b9.b */
/* loaded from: classes.dex */
public class C1078b {

    /* renamed from: a */
    private String f5310a;

    /* renamed from: b */
    private String f5311b;

    /* renamed from: b9.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final C1078b f5312a = new C1078b();
    }

    /* renamed from: c */
    public static C1078b m6375c() {
        return a.f5312a;
    }

    /* renamed from: a */
    public String m6376a() {
        if (TextUtils.isEmpty(this.f5311b)) {
            this.f5311b = C2877p0.m12882P().getString("credential_type_key", BuildConfig.FLAVOR);
        }
        return this.f5311b;
    }

    /* renamed from: b */
    public String m6377b() {
        if (TextUtils.isEmpty(this.f5310a)) {
            this.f5310a = C2877p0.m12882P().getString("credential_value_key", BuildConfig.FLAVOR);
        }
        return this.f5310a;
    }

    /* renamed from: d */
    public void m6378d(String str, String str2) {
        this.f5310a = str;
        this.f5311b = str2;
        SharedPreferences.Editor edit = C2877p0.m12882P().edit();
        edit.putString("credential_value_key", str);
        edit.putString("credential_type_key", str2);
        edit.apply();
    }

    /* renamed from: e */
    public void m6379e(String str, String str2) {
        this.f5310a = str;
        this.f5311b = str2;
    }
}
