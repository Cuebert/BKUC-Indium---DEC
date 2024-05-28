package p202p7;

import android.content.Context;
import android.os.Build;
import com.roblox.client.RobloxApplication;
import p035c9.C1151k;
import p116i9.C3547a;
import p239s7.C4531b;

/* renamed from: p7.a */
/* loaded from: classes.dex */
public class C4274a extends C3547a {
    /* renamed from: d */
    private static Context m17712d() {
        return RobloxApplication.m12215a();
    }

    @Override // p116i9.C3547a
    /* renamed from: a */
    public String mo15348a() {
        String m18559i = C4531b.m18550f().m18559i(m17712d());
        if (m18559i != null) {
            C1151k.m6714h("rbx.locale", "ugcLocaleCode : " + m18559i);
            return m18559i;
        }
        return mo15350c();
    }

    @Override // p116i9.C3547a
    /* renamed from: b */
    public String mo15349b() {
        if (Build.VERSION.SDK_INT >= 24) {
            return m17712d().getResources().getConfiguration().getLocales().get(0).toString();
        }
        return m17712d().getResources().getConfiguration().locale.toString();
    }

    @Override // p116i9.C3547a
    /* renamed from: c */
    public String mo15350c() {
        return C4531b.m18550f().m18560j().m18586d();
    }
}
