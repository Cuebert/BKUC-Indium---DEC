package p101h8;

import android.content.Context;
import android.content.SharedPreferences;
import p035c9.C1156p;

/* renamed from: h8.r */
/* loaded from: classes.dex */
public class C3444r {
    /* renamed from: c */
    private SharedPreferences m15154c(Context context) {
        return C1156p.m6743a(context, "NotificationPreferences");
    }

    /* renamed from: d */
    private SharedPreferences.Editor m15155d(Context context) {
        return m15154c(context).edit();
    }

    /* renamed from: a */
    public String m15156a(Context context, String str) {
        return m15154c(context).getString(str, null);
    }

    /* renamed from: b */
    public boolean m15157b(Context context, String str) {
        return m15154c(context).getBoolean(str, false);
    }

    /* renamed from: e */
    public boolean m15158e(Context context, String str) {
        return m15154c(context).contains(str);
    }

    /* renamed from: f */
    public void m15159f(Context context, String str, boolean z10) {
        SharedPreferences.Editor m15155d = m15155d(context);
        m15155d.putBoolean(str, z10);
        m15155d.commit();
    }

    /* renamed from: g */
    public void m15160g(Context context, String str, String str2) {
        SharedPreferences.Editor m15155d = m15155d(context);
        m15155d.putString(str, str2);
        m15155d.commit();
    }
}
