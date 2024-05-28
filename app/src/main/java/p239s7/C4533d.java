package p239s7;

import android.content.Context;
import android.content.SharedPreferences;
import p035c9.C1156p;

/* renamed from: s7.d */
/* loaded from: classes.dex */
public class C4533d implements InterfaceC4532c {

    /* renamed from: a */
    private final Context f18291a;

    public C4533d(Context context) {
        this.f18291a = context.getApplicationContext();
    }

    /* renamed from: g */
    private SharedPreferences m18578g() {
        return C1156p.m6743a(this.f18291a, "LocaleSettingsPreferences");
    }

    /* renamed from: i */
    private void m18579i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        SharedPreferences.Editor edit = m18578g().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    @Override // p239s7.InterfaceC4532c
    /* renamed from: a */
    public C4535f mo18572a() {
        return C4535f.m18584b(m18578g().getString("DEFAULT_LOCALE_VALUE", null));
    }

    @Override // p239s7.InterfaceC4532c
    /* renamed from: b */
    public void mo18573b(String str) {
        m18579i("PREF_NAME_UGC_LOCALE", str);
    }

    @Override // p239s7.InterfaceC4532c
    /* renamed from: c */
    public C4535f mo18574c() {
        return C4535f.m18584b(m18578g().getString("PREF_NAME_SELECTED_LOCALE", null));
    }

    @Override // p239s7.InterfaceC4532c
    /* renamed from: d */
    public void mo18575d(C4535f c4535f) {
        if (c4535f == null) {
            return;
        }
        m18581j(c4535f.m18586d());
    }

    @Override // p239s7.InterfaceC4532c
    /* renamed from: e */
    public void mo18576e(C4535f c4535f) {
        if (c4535f == null) {
            return;
        }
        m18580h(c4535f.m18586d());
    }

    @Override // p239s7.InterfaceC4532c
    /* renamed from: f */
    public C4535f mo18577f() {
        return C4535f.m18584b(m18578g().getString("PREF_NAME_UGC_LOCALE", null));
    }

    /* renamed from: h */
    public void m18580h(String str) {
        m18579i("DEFAULT_LOCALE_VALUE", str);
    }

    /* renamed from: j */
    public void m18581j(String str) {
        m18579i("PREF_NAME_SELECTED_LOCALE", str);
    }
}
