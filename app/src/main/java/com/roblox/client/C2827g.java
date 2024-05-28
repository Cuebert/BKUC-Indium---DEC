package com.roblox.client;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.roblox.engine.jni.NativeGLInterface;
import ma.C3969a;
import org.json.JSONObject;
import p033c7.C1134c;
import p035c9.C1145e;
import p035c9.C1151k;
import p074f7.C3197z;
import p300x7.C5563e;

/* renamed from: com.roblox.client.g */
/* loaded from: classes.dex */
public class C2827g {
    /* renamed from: a */
    public static Intent m12518a(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        Intent intent = new Intent(activity, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", C1145e.m6691c(str));
        intent.putExtra("TITLE_EXTRA", str2);
        intent.putExtra("USE_GENERIC_WEB_FRAG_EXTRA", z10);
        intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", z11);
        intent.putExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", z12);
        return intent;
    }

    /* renamed from: b */
    public static void m12519b(JSONObject jSONObject, Activity activity) {
        if (jSONObject != null) {
            long optLong = jSONObject.optLong("placeId");
            long optLong2 = jSONObject.optLong("userId");
            long optLong3 = jSONObject.optLong("conversationId");
            String optString = jSONObject.optString("gameInstanceId");
            String optString2 = jSONObject.optString("reservedServerAccessCode");
            String optString3 = jSONObject.optString("callId");
            String optString4 = jSONObject.optString("referralPage");
            String optString5 = jSONObject.optString("accessCode");
            String optString6 = jSONObject.optString("linkCode");
            String optString7 = jSONObject.optString("launchData");
            String optString8 = jSONObject.optString("joinAttemptId");
            String optString9 = jSONObject.optString("joinAttemptOrigin");
            String optString10 = jSONObject.optString("isoContext");
            C3197z c3197z = null;
            if (optLong > 0 && optLong3 > 0) {
                c3197z = C3197z.m14029b(Long.valueOf(optLong), Long.valueOf(optLong3), optString4, optString8, optString9);
            } else if (optLong > 0 || optLong2 > 0) {
                Long valueOf = optLong == 0 ? null : Long.valueOf(optLong);
                Long valueOf2 = optLong2 == 0 ? null : Long.valueOf(optLong2);
                String str = TextUtils.isEmpty(optString5) ? null : optString5;
                String str2 = TextUtils.isEmpty(optString6) ? null : optString6;
                if (TextUtils.isEmpty(optString)) {
                    optString = null;
                }
                c3197z = C3197z.m14028a(valueOf, valueOf2, str, str2, optString, TextUtils.isEmpty(optString2) ? null : optString2, TextUtils.isEmpty(optString3) ? null : optString3, null, optString4, optString7, optString8, optString9, optString10);
            }
            C3197z c3197z2 = c3197z;
            if (c3197z2 != null) {
                if (!C1134c.m6537a().mo6622k0()) {
                    if (C1134c.m6537a().mo6631n0()) {
                        C3969a.m16695e().m16697b("experience_launch_begin");
                    } else {
                        C3969a.m16695e().m16697b("gamejoin_begin");
                    }
                }
                m12527j(c3197z2, activity);
                C5563e.m20379h().m20434t(activity);
            }
        }
    }

    /* renamed from: c */
    private static void m12520c(C3197z c3197z, Activity activity) {
        int myPid = Process.myPid();
        boolean isDebuggerConnected = Debug.isDebuggerConnected();
        if (c3197z != null) {
            long m14045m = c3197z.m14045m();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Launching PlaceId:");
            sb2.append(m14045m);
            sb2.append(" Pid:");
            sb2.append(myPid);
            sb2.append(" Debugger:");
            sb2.append(isDebuggerConnected ? "attached" : "none");
            C1151k.m6712f("ActivityUtils", sb2.toString());
        }
        C2872n.m12830h().m12836f().m13874q(activity, c3197z, 20104);
    }

    /* renamed from: d */
    public static void m12521d(Activity activity, String str, boolean z10) {
        activity.startActivity(m12518a(activity, str, activity.getString(C2748c0.f10529I2), true, z10, true));
        activity.overridePendingTransition(C2905t.f11658b, R.anim.fade_out);
    }

    /* renamed from: e */
    public static void m12522e(Activity activity, String str, int i10, boolean z10, boolean z11) {
        m12525h(activity, str, activity.getString(i10), z10, z11);
    }

    /* renamed from: f */
    public static void m12523f(Activity activity, String str, String str2) {
        m12526i(activity, str, str2, false, false, false);
    }

    /* renamed from: g */
    public static void m12524g(Activity activity, String str, String str2, String str3) {
        Intent m12518a = m12518a(activity, str, str2, true, true, true);
        if (str3 != null) {
            m12518a.putExtra("SEARCH_PARAMS", str3);
        }
        m12528k(activity, m12518a, true);
    }

    /* renamed from: h */
    public static void m12525h(Activity activity, String str, String str2, boolean z10, boolean z11) {
        m12526i(activity, str, str2, z10, z11, false);
    }

    /* renamed from: i */
    public static void m12526i(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        m12528k(activity, m12518a(activity, str, str2, z10, z11, z12), z10);
    }

    /* renamed from: j */
    public static void m12527j(C3197z c3197z, Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        C2877p0.f11447r = true;
        C1151k.m6707a("GameLaunch", "startLaunchGame: activity=" + activity);
        m12520c(c3197z, activity);
    }

    /* renamed from: k */
    public static void m12528k(Activity activity, Intent intent, boolean z10) {
        activity.startActivityForResult(intent, 20110);
        if (!z10 && !NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            activity.overridePendingTransition(C2905t.f11658b, R.anim.fade_out);
        } else {
            activity.overridePendingTransition(0, 0);
        }
    }
}
