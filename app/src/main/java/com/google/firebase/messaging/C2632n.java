package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.n */
/* loaded from: classes.dex */
public final class C2632n {

    /* renamed from: a */
    private final Bundle f10297a;

    public C2632n(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f10297a = new Bundle(bundle);
    }

    /* renamed from: d */
    public static boolean m12059d(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m12063r("gcm.n.e"))) || bundle.getString("gcm.n.icon") != null || bundle.getString(m12063r("gcm.n.icon")) != null;
    }

    /* renamed from: f */
    private final String m12060f(Resources resources, String str, String str2) {
        String m12074m = m12074m(str2);
        if (TextUtils.isEmpty(m12074m)) {
            return null;
        }
        int identifier = resources.getIdentifier(m12074m, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String m12062q = m12062q("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
            StringBuilder sb2 = new StringBuilder(String.valueOf(m12062q).length() + 49 + String.valueOf(str2).length());
            sb2.append(m12062q);
            sb2.append(" resource not found: ");
            sb2.append(str2);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
        Object[] m12076o = m12076o(str2);
        if (m12076o == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m12076o);
        } catch (MissingFormatArgumentException e10) {
            String m12062q2 = m12062q(str2);
            String arrays = Arrays.toString(m12076o);
            StringBuilder sb3 = new StringBuilder(String.valueOf(m12062q2).length() + 58 + String.valueOf(arrays).length());
            sb3.append("Missing format argument for ");
            sb3.append(m12062q2);
            sb3.append(": ");
            sb3.append(arrays);
            sb3.append(" Default value will be used.");
            Log.w("NotificationParams", sb3.toString(), e10);
            return null;
        }
    }

    /* renamed from: p */
    private final JSONArray m12061p(String str) {
        String m12066c = m12066c(str);
        if (TextUtils.isEmpty(m12066c)) {
            return null;
        }
        try {
            return new JSONArray(m12066c);
        } catch (JSONException unused) {
            String m12062q = m12062q(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m12062q).length() + 50 + String.valueOf(m12066c).length());
            sb2.append("Malformed JSON for key ");
            sb2.append(m12062q);
            sb2.append(": ");
            sb2.append(m12066c);
            sb2.append(", falling back to default");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: q */
    private static String m12062q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: r */
    private static String m12063r(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: a */
    public final Uri m12064a() {
        String m12066c = m12066c("gcm.n.link_android");
        if (TextUtils.isEmpty(m12066c)) {
            m12066c = m12066c("gcm.n.link");
        }
        if (TextUtils.isEmpty(m12066c)) {
            return null;
        }
        return Uri.parse(m12066c);
    }

    /* renamed from: b */
    public final String m12065b(Resources resources, String str, String str2) {
        String m12066c = m12066c(str2);
        return !TextUtils.isEmpty(m12066c) ? m12066c : m12060f(resources, str, str2);
    }

    /* renamed from: c */
    public final String m12066c(String str) {
        Bundle bundle = this.f10297a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String m12063r = m12063r(str);
            if (this.f10297a.containsKey(m12063r)) {
                str = m12063r;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: e */
    public final String m12067e() {
        String m12066c = m12066c("gcm.n.sound2");
        return TextUtils.isEmpty(m12066c) ? m12066c("gcm.n.sound") : m12066c;
    }

    /* renamed from: g */
    public final boolean m12068g(String str) {
        String m12066c = m12066c(str);
        return "1".equals(m12066c) || Boolean.parseBoolean(m12066c);
    }

    /* renamed from: h */
    public final Integer m12069h(String str) {
        String m12066c = m12066c(str);
        if (TextUtils.isEmpty(m12066c)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m12066c));
        } catch (NumberFormatException unused) {
            String m12062q = m12062q(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m12062q).length() + 38 + String.valueOf(m12066c).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(m12062q);
            sb2.append("(");
            sb2.append(m12066c);
            sb2.append(") into an int");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: i */
    public final long[] m12070i() {
        JSONArray m12061p = m12061p("gcm.n.vibrate_timings");
        if (m12061p == null) {
            return null;
        }
        try {
            if (m12061p.length() > 1) {
                int length = m12061p.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = m12061p.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(m12061p);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 74);
            sb2.append("User defined vibrateTimings is invalid: ");
            sb2.append(valueOf);
            sb2.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: j */
    public final Long m12071j(String str) {
        String m12066c = m12066c(str);
        if (TextUtils.isEmpty(m12066c)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m12066c));
        } catch (NumberFormatException unused) {
            String m12062q = m12062q(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m12062q).length() + 38 + String.valueOf(m12066c).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(m12062q);
            sb2.append("(");
            sb2.append(m12066c);
            sb2.append(") into a long");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final int[] m12072k() {
        JSONArray m12061p = m12061p("gcm.n.light_settings");
        if (m12061p == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m12061p.length() == 3) {
                int parseColor = Color.parseColor(m12061p.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = m12061p.optInt(1);
                    iArr[2] = m12061p.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e10) {
            String valueOf = String.valueOf(m12061p);
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(m12061p);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 58);
            sb3.append("LightSettings is invalid: ");
            sb3.append(valueOf2);
            sb3.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb3.toString());
            return null;
        }
    }

    /* renamed from: l */
    public final Bundle m12073l() {
        Bundle bundle = new Bundle(this.f10297a);
        for (String str : this.f10297a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: m */
    public final String m12074m(String str) {
        String valueOf = String.valueOf(str);
        return m12066c("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    /* renamed from: n */
    public final Bundle m12075n() {
        Bundle bundle = new Bundle(this.f10297a);
        for (String str : this.f10297a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: o */
    public final Object[] m12076o(String str) {
        String valueOf = String.valueOf(str);
        JSONArray m12061p = m12061p("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (m12061p == null) {
            return null;
        }
        int length = m12061p.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = m12061p.optString(i10);
        }
        return strArr;
    }
}
