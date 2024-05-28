package p251t8;

import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import com.roblox.client.signup.C2897a;
import org.json.JSONObject;
import p035c9.C1151k;
import p100h7.C3409b;
import p100h7.C3417j;
import p300x7.C5563e;

/* renamed from: t8.a */
/* loaded from: classes.dex */
public class C4737a extends AbstractC4740d {
    public C4737a(C5563e c5563e, C2897a.d0 d0Var) {
        super(c5563e, d0Var);
    }

    /* renamed from: e */
    private String m18882e(int i10) {
        String str;
        String str2;
        if (i10 == 0) {
            m18894d();
            str = BuildConfig.FLAVOR;
            str2 = "Android-AppSignup-Validation-PasswordSuccess";
        } else if (i10 == 2) {
            m18893c(Integer.valueOf(C2748c0.f10608Y1));
            str = "PasswordLengthShort";
            str2 = "Android-AppSignup-Validation-PasswordLengthShort";
        } else if (i10 == 3) {
            m18893c(Integer.valueOf(C2748c0.f10568Q1));
            str = "PasswordMatchesUsername";
            str2 = "Android-AppSignup-Validation-PasswordMatchesUsername";
        } else if (i10 == 4) {
            m18893c(Integer.valueOf(C2748c0.f10558O1));
            str = "PasswordForbidden";
            str2 = "Android-AppSignup-Validation-PasswordForbidden";
        } else if (i10 != 5) {
            m18893c(Integer.valueOf(C2748c0.f10578S1));
            str = "UnknownError";
            str2 = "Android-AppSignup-Validation-PasswordError";
        } else {
            m18893c(Integer.valueOf(C2748c0.f10553N1));
            str = "PasswordDumb";
            str2 = "Android-AppSignup-Validation-PasswordDumb";
        }
        this.f18569a.m20388A(str2);
        C1151k.m6714h("rbx.signup", "handlePasswordApiErrorCode(int subCode): " + i10 + ", diagCounterName: " + str2);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = com.roblox.client.C2748c0.f10583T1;
        r1 = "Android-AppSignup-Validation-PasswordUsernameRequired";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r2 = "Username is required";
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m18883f(org.json.JSONObject r8) {
        /*
            r7 = this;
            int r0 = com.roblox.client.C2748c0.f10578S1
            java.lang.String r1 = "Android-AppSignup-Validation-PasswordError"
            java.lang.String r2 = "UnknownError"
            java.lang.String r3 = "errors"
            org.json.JSONArray r8 = r8.optJSONArray(r3)     // Catch: org.json.JSONException -> L30
            if (r8 == 0) goto L34
            r3 = 0
        Lf:
            int r4 = r8.length()     // Catch: org.json.JSONException -> L30
            if (r3 >= r4) goto L34
            org.json.JSONObject r4 = r8.getJSONObject(r3)     // Catch: org.json.JSONException -> L30
            if (r4 == 0) goto L2d
            java.lang.String r5 = "code"
            r6 = -1
            int r4 = r4.optInt(r5, r6)     // Catch: org.json.JSONException -> L30
            r5 = 1
            if (r4 != r5) goto L2d
            int r0 = com.roblox.client.C2748c0.f10583T1     // Catch: org.json.JSONException -> L30
            java.lang.String r1 = "Android-AppSignup-Validation-PasswordUsernameRequired"
            java.lang.String r8 = "Username is required"
            r2 = r8
            goto L34
        L2d:
            int r3 = r3 + 1
            goto Lf
        L30:
            r8 = move-exception
            r8.printStackTrace()
        L34:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7.m18893c(r8)
            x7.e r8 = r7.f18569a
            r8.m20388A(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p251t8.C4737a.m18883f(org.json.JSONObject):java.lang.String");
    }

    @Override // p251t8.AbstractC4740d
    /* renamed from: a */
    public C3417j mo18884a(String str, String str2) {
        return C3409b.m15021k(C2877p0.m12909b1(str, str2), null, null, null);
    }

    @Override // p251t8.AbstractC4740d
    /* renamed from: b */
    public String mo18885b(int i10, JSONObject jSONObject) {
        if (i10 == 200) {
            return m18882e(jSONObject.optInt("code", -1));
        }
        if (i10 == 400) {
            return m18883f(jSONObject);
        }
        m18893c(Integer.valueOf(C2748c0.f10578S1));
        this.f18569a.m20388A("Android-AppSignup-Validation-PasswordError");
        return "UnknownError";
    }
}
