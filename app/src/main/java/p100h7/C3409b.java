package p100h7;

import android.content.Context;
import android.webkit.CookieSyncManager;
import com.appsflyer.oaid.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import p033c7.C1134c;
import p035c9.C1151k;
import p100h7.C3417j;
import p179n9.C4083g;
import p191o9.C4158f;
import p191o9.C4161i;
import p193ob.C4171d0;
import p193ob.C4181i0;

/* renamed from: h7.b */
/* loaded from: classes.dex */
public class C3409b {

    /* renamed from: a */
    private static C4161i f14277a;

    /* renamed from: h7.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f14278a;

        /* renamed from: b */
        public String f14279b;
    }

    /* renamed from: a */
    public static void m15011a() {
        f14277a = null;
        CookieHandler.setDefault(null);
    }

    /* renamed from: b */
    private static C3417j m15012b(String str, String str2, a[] aVarArr, String str3) {
        return m15014d(C4083g.m16977b(), str, str2, aVarArr, str3);
    }

    /* renamed from: c */
    private static C3417j m15013c(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        C4171d0 m16977b = C4083g.m16977b();
        if (i10 >= 0 || i11 >= 0) {
            C4171d0.b m17317w = m16977b.m17317w();
            if (i10 >= 0) {
                m17317w.m17331e(i10, TimeUnit.MILLISECONDS);
            }
            if (i11 >= 0) {
                m17317w.m17335i(i11, TimeUnit.MILLISECONDS);
            }
            m16977b = m17317w.m17329c();
        }
        return m15014d(m16977b, str, str2, aVarArr, str3);
    }

    /* renamed from: d */
    private static C3417j m15014d(C4171d0 c4171d0, String str, String str2, a[] aVarArr, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String str5 = aVar.f14278a;
                if (str5 != null && (str4 = aVar.f14279b) != null) {
                    hashMap.put(str5, str4);
                }
            }
        }
        C3417j c3417j = new C3417j();
        c3417j.f14281a = str2 == null ? C3417j.a.GET : C3417j.a.POST;
        c3417j.f14283c = str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C4181i0 m17234a = new C4158f().m17234a(c4171d0, str, str2, hashMap, str3);
            c3417j.f14285e = m17234a.m17432e();
            c3417j.m15030e(m17234a.m17430b().m17462T());
            c3417j.m15029d(m17234a.m17439z("Last-Modified", BuildConfig.FLAVOR));
        } catch (NullPointerException unused) {
            C1151k.m6716j("rbx.httpagent", "null url in newCall()");
        } catch (SSLHandshakeException e10) {
            C1151k.m6716j("rbx.httpagent", "SSLHandshakeException initial newCall(): url = " + str + ", exception = " + e10);
            c3417j.f14287g = true;
        } catch (IOException e11) {
            C1151k.m6716j("rbx.httpagent", "IOException initial newCall(): url = " + str + ", exception = " + e11);
        }
        c3417j.f14286f = System.currentTimeMillis() - currentTimeMillis;
        return c3417j;
    }

    /* renamed from: e */
    public static void m15015e(Context context) {
        if (f14277a == null) {
            if (!C1134c.m6537a().mo6640q0()) {
                CookieSyncManager.createInstance(context);
                CookieSyncManager.getInstance().startSync();
            }
            C4161i m17249e = C4161i.m17249e();
            f14277a = m17249e;
            CookieHandler.setDefault(m17249e);
        }
    }

    /* renamed from: f */
    public static void m15016f(File file, String str) {
        if (C1134c.m6537a().mo6640q0()) {
            return;
        }
        CookieSyncManager.getInstance().stopSync();
    }

    /* renamed from: g */
    public static void m15017g() {
        if (C1134c.m6537a().mo6640q0()) {
            return;
        }
        CookieSyncManager.getInstance().startSync();
    }

    /* renamed from: h */
    public static void m15018h() {
        if (C1134c.m6537a().mo6640q0()) {
            return;
        }
        CookieSyncManager.getInstance().sync();
    }

    /* renamed from: i */
    public static C3417j m15019i(String str, String str2, a[] aVarArr) {
        return m15021k(str, str2, aVarArr, null);
    }

    /* renamed from: j */
    public static C3417j m15020j(String str, String str2, a[] aVarArr, String str3) {
        return m15021k(str, str2, aVarArr, str3);
    }

    /* renamed from: k */
    public static C3417j m15021k(String str, String str2, a[] aVarArr, String str3) {
        return m15012b(str, str2, aVarArr, str3);
    }

    /* renamed from: l */
    public static C3417j m15022l(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        return m15013c(str, str2, aVarArr, str3, i10, i11);
    }
}
