package p035c9;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.C2877p0;
import p033c7.C1134c;
import p299x6.C5556b;

/* renamed from: c9.p */
/* loaded from: classes.dex */
public class C1156p {

    /* renamed from: b */
    private static C1156p f5498b;

    /* renamed from: a */
    private Context f5499a;

    public C1156p(Context context) {
        this.f5499a = context;
    }

    @Deprecated
    /* renamed from: a */
    public static SharedPreferences m6743a(Context context, String str) {
        return m6744b(context, str, false);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m6744b(Context context, String str, boolean z10) {
        if (!z10 && C5556b.m20348a() && C2877p0.m12941p0()) {
            str = C2877p0.m12872K() + "_" + str;
            C1151k.m6707a("rbx.prefs", "Using SharedPreference file:" + str);
        }
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: e */
    public static C1156p m6745e(Context context) {
        if (f5498b == null) {
            synchronized (C1156p.class) {
                if (f5498b == null) {
                    f5498b = new C1156p(context);
                }
            }
        }
        return f5498b;
    }

    /* renamed from: c */
    public SharedPreferences m6746c(String str) {
        return m6747d(str, false);
    }

    /* renamed from: d */
    public SharedPreferences m6747d(String str, boolean z10) {
        if (C1134c.m6537a().mo6588Y0()) {
            str = m6750h(str, z10);
            C1151k.m6707a("rbx.prefs", "Using SharedPreference file:" + str);
        } else if (!z10 && C5556b.m20348a() && C2877p0.m12941p0()) {
            str = C2877p0.m12872K() + "_" + str;
            C1151k.m6707a("rbx.prefs", "Using SharedPreference file:" + str);
        }
        return this.f5499a.getSharedPreferences(str, 0);
    }

    /* renamed from: f */
    public SharedPreferences m6748f() {
        return m6747d("prefs", false);
    }

    /* renamed from: g */
    public String m6749g() {
        return m6750h("prefs", false);
    }

    /* renamed from: h */
    public String m6750h(String str, boolean z10) {
        if (z10 || !C5556b.m20348a() || !C2877p0.m12941p0()) {
            return str;
        }
        return C2877p0.m12872K() + "_" + str;
    }
}
