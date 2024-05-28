package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.j */
/* loaded from: classes.dex */
final class C2594j {

    /* renamed from: d */
    private static final long f10197d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f10198a;

    /* renamed from: b */
    private final String f10199b;

    /* renamed from: c */
    private final long f10200c;

    private C2594j(String str, String str2, long j10) {
        this.f10198a = str;
        this.f10199b = str2;
        this.f10200c = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2594j m11968a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C2594j(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }
        return new C2594j(str, null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m11969b(String str, String str2, long j10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("Failed to encode token: ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m11970c(String str) {
        return System.currentTimeMillis() > this.f10200c + f10197d || !str.equals(this.f10199b);
    }
}
