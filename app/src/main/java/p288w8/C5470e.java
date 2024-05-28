package p288w8;

import android.content.Context;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2877p0;
import java.io.IOException;
import ma.C3969a;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;
import p035c9.C1151k;
import p193ob.C4171d0;
import p193ob.C4172e;
import p193ob.C4177g0;

/* renamed from: w8.e */
/* loaded from: classes.dex */
public class C5470e {
    /* renamed from: a */
    public static String m20118a(Context context) {
        C4172e c4172e = new C4172e(context.getCacheDir(), 2097152L);
        C5471f c5471f = new C5471f();
        C4171d0 m17329c = new C4171d0.b().m17333g(c5471f).m17330d(c4172e).m17329c();
        String m20121d = m20121d(m17329c);
        JSONObject m20119b = m20119b(m20121d);
        C5469d.m20109m();
        c5471f.m20123z();
        if (C1134c.m6537a().mo6588Y0()) {
            if (!C2877p0.m12911c0()) {
                return m20121d;
            }
            m20120c(m20119b);
            if (C2877p0.m12911c0()) {
                return m20121d;
            }
            String m20121d2 = m20121d(m17329c);
            m20122e();
            return m20121d2;
        }
        m20120c(m20119b);
        if (C2877p0.m12911c0()) {
            return m20121d;
        }
        String m20121d3 = m20121d(m17329c);
        m20122e();
        return m20121d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static JSONObject m20119b(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            C1151k.m6716j("ClientSettingsRequest", "can't parse flag json.");
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("applicationSettings")) {
            return null;
        }
        return jSONObject.optJSONObject("applicationSettings");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m20120c(org.json.JSONObject r4) {
        /*
            boolean r0 = com.roblox.client.C2877p0.m12911c0()
            if (r0 == 0) goto L73
            if (r4 == 0) goto L73
            java.lang.String r0 = "FStringClientChannelProbabilityString"
            java.lang.String r4 = r4.optString(r0)
            com.roblox.engine.jni.model.ChannelRecord r4 = com.roblox.engine.jni.NativeSettingsInterface.nativeParseRandomChannelSelection(r4)
            boolean r0 = r4.m13327c()
            if (r0 != 0) goto L73
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            boolean r0 = r4.m13326b(r0)
            java.lang.String r1 = "Channel roll '"
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r4 = r4.m13325a()
            r0.append(r4)
            java.lang.String r4 = "' expired, using production"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            p035c9.C1151k.m6711e(r4)
            goto L73
        L43:
            java.lang.String r0 = r4.m13325a()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L53
            java.lang.String r4 = "Channel roll is production"
            p035c9.C1151k.m6711e(r4)
            goto L73
        L53:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = r4.m13325a()
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p035c9.C1151k.m6711e(r0)
            java.lang.String r4 = r4.m13325a()
            goto L75
        L73:
            java.lang.String r4 = ""
        L75:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L7e
            com.roblox.client.C2877p0.m12881O0(r4)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p288w8.C5470e.m20120c(org.json.JSONObject):void");
    }

    /* renamed from: d */
    private static String m20121d(C4171d0 c4171d0) {
        try {
            return c4171d0.mo17300a(new C4177g0.a().m17408h(C2877p0.m12919f()).m17401a()).mo17377c().m17430b().m17462T();
        } catch (IOException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: e */
    private static void m20122e() {
        if (C1134c.m6537a().mo6553H()) {
            C3969a.m16695e().m16697b("fastflag_load_channel");
        }
    }
}
