package com.roblox.client.signup;

import com.roblox.client.C2877p0;
import com.roblox.client.signup.AbstractAsyncTaskC2900d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p020b6.C1055f;
import p035c9.C1151k;
import p100h7.C3409b;
import p100h7.C3417j;
import p114i7.C3545f;

/* renamed from: com.roblox.client.signup.c */
/* loaded from: classes.dex */
public class AsyncTaskC2899c extends AbstractAsyncTaskC2900d {

    /* renamed from: v */
    private static HashMap<String, Integer> f11609v;

    /* renamed from: com.roblox.client.signup.c$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            Integer num = (Integer) AsyncTaskC2899c.f11609v.get(str);
            if (num == null) {
                num = r0;
            }
            Integer num2 = (Integer) AsyncTaskC2899c.f11609v.get(str2);
            return num.intValue() - (num2 != null ? num2 : 1000).intValue();
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f11609v = hashMap;
        hashMap.put("UsernameTaken", 1);
        f11609v.put("UsernameInvalid", 2);
        f11609v.put("PasswordInvalid", 3);
        f11609v.put("PasswordMatchesUsername", 4);
        f11609v.put("DumbPassword", 5);
        f11609v.put("GenderInvalid", 6);
        f11609v.put("BirthdayInvalid", 7);
        f11609v.put("StatusThrottled", 8);
        f11609v.put("Captcha", 10000);
    }

    public AsyncTaskC2899c(int i10, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, AbstractAsyncTaskC2900d.a aVar) {
        super(i10, i11, i12, i13, str, str2, str3, str4, str5, aVar);
    }

    /* renamed from: j */
    private void m13144j(ArrayList<String> arrayList, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("code", -1);
                        C1151k.m6712f("roblox.signup", "addToSignupStatus: (new updated API) errorCode = " + optInt);
                        if (optInt != -1) {
                            arrayList.add(m13145m(optInt));
                        } else {
                            arrayList.add("StatusJsonError");
                        }
                    } else {
                        arrayList.add("StatusJsonError");
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    arrayList.add("StatusJsonError");
                    C1151k.m6712f("roblox.signup", "JSONException thrown while parsing response: " + e10.getMessage());
                }
            }
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, new a());
            }
            C1151k.m6716j("roblox.signup", "SignUpApiTask.getErrorReason() errorList:" + arrayList);
        }
    }

    /* renamed from: m */
    private String m13145m(int i10) {
        switch (i10) {
            case 2:
                return "Captcha";
            case 3:
                return "StatusThrottled";
            case 4:
                return "BirthdayInvalid";
            case 5:
                return "UsernameInvalid";
            case 6:
                return "UsernameTaken";
            case 7:
                return "PasswordInvalid";
            case 8:
                return "PasswordMatchesUsername";
            case 9:
                return "DumbPassword";
            default:
                return "StatusServerError";
        }
    }

    @Override // com.roblox.client.signup.AbstractAsyncTaskC2900d
    /* renamed from: c */
    protected C2902f mo13146c(String str, String str2, String str3, String str4, String str5, C3409b.a[] aVarArr) {
        return m13147k(str, str2, m13154e(), AbstractAsyncTaskC2900d.m13151d(this.f11626p, this.f11627q, this.f11625o), str3, str4, str5, aVarArr);
    }

    /* renamed from: k */
    C2902f m13147k(String str, String str2, String str3, String str4, String str5, String str6, String str7, C3409b.a[] aVarArr) {
        String m12885Q0 = C2877p0.m12885Q0();
        C3417j m15020j = C3409b.m15020j(m12885Q0, m13148l(str, str2, str3, str4, str5, str6, str7), aVarArr, C2877p0.m12880O());
        int m15027b = m15020j.m15027b();
        String m15026a = m15020j.m15026a();
        C2902f c2902f = new C2902f();
        c2902f.f11636d = m15027b;
        c2902f.f11637e = m12885Q0;
        c2902f.f11638f = m15026a;
        try {
            C1151k.m6712f("roblox.signup", "SignUpApiTask.doSignupRequest() url: " + m12885Q0 + ", code:" + m15027b + ", body:" + m15026a);
            if (m15027b == 200) {
                JSONObject jSONObject = new JSONObject(m15026a);
                if (jSONObject.has("userId")) {
                    c2902f.f11639g = jSONObject.getLong("userId");
                    c2902f.f11640h = jSONObject.optLong("starterPlaceId", -1L);
                    C1151k.m6712f("roblox.signup", "SignUpApiTask.doSignupRequest() starterPlaceId: " + c2902f.f11640h);
                    c2902f.f11633a.add("OK");
                } else {
                    c2902f.f11633a.add("StatusUserIdInvalid");
                }
            } else if (m15027b == 403) {
                m13144j(c2902f.f11633a, new JSONObject(m15026a).optJSONArray("failureDetails"));
            } else if (m15027b == 429) {
                c2902f.f11633a.add("StatusThrottled");
            } else {
                c2902f.f11633a.add("StatusServerError");
            }
        } catch (JSONException unused) {
            c2902f.f11633a.add("StatusJsonError");
        }
        return c2902f;
    }

    /* renamed from: l */
    String m13148l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new C1055f().m6313s(new C3545f(str, str2, str3, str4, str5, str6, str7));
    }
}
