package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.C0587a;
import com.appsflyer.oaid.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p093h0.C3356a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.k */
/* loaded from: classes.dex */
public final class C2596k {

    /* renamed from: a */
    private final SharedPreferences f10203a;

    /* renamed from: b */
    private final Context f10204b;

    /* renamed from: c */
    private final C2589g0 f10205c;

    /* renamed from: d */
    private final Map<String, C2591h0> f10206d;

    public C2596k(Context context) {
        this(context, new C2589g0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m11972c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("|S|");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: h */
    private static String m11973h(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: j */
    private final synchronized boolean m11974j() {
        return this.f10203a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized C2594j m11975a(String str, String str2, String str3) {
        return C2594j.m11968a(this.f10203a.getString(m11973h(str, str2, str3), null));
    }

    /* renamed from: b */
    public final synchronized String m11976b() {
        return this.f10203a.getString("topic_operation_queue", BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public final synchronized void m11977d(String str) {
        this.f10203a.edit().putString("topic_operation_queue", str).apply();
    }

    /* renamed from: e */
    public final synchronized void m11978e(String str, String str2, String str3, String str4, String str5) {
        String m11969b = C2594j.m11969b(str4, str5, System.currentTimeMillis());
        if (m11969b == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f10203a.edit();
        edit.putString(m11973h(str, str2, str3), m11969b);
        edit.commit();
    }

    /* renamed from: f */
    public final synchronized C2591h0 m11979f(String str) {
        C2591h0 m11958m;
        C2591h0 c2591h0 = this.f10206d.get(str);
        if (c2591h0 != null) {
            return c2591h0;
        }
        try {
            m11958m = this.f10205c.m11957a(this.f10204b, str);
        } catch (C2593i0 unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.m11882a().m11904w();
            m11958m = this.f10205c.m11958m(this.f10204b, str);
        }
        this.f10206d.put(str, m11958m);
        return m11958m;
    }

    /* renamed from: g */
    public final synchronized void m11980g() {
        this.f10206d.clear();
        C2589g0.m11947g(this.f10204b);
        this.f10203a.edit().clear().commit();
    }

    /* renamed from: i */
    public final synchronized void m11981i(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f10203a.edit();
        for (String str2 : this.f10203a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    private C2596k(Context context, C2589g0 c2589g0) {
        this.f10206d = new C3356a();
        this.f10204b = context;
        this.f10203a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f10205c = c2589g0;
        File file = new File(C0587a.m3033g(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m11974j()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            m11980g();
            FirebaseInstanceId.m11882a().m11904w();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }
}
