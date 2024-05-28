package p251t8;

import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import com.roblox.client.signup.C2897a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p100h7.C3409b;
import p100h7.C3417j;
import p300x7.C5563e;

/* renamed from: t8.b */
/* loaded from: classes.dex */
public class C4738b extends AbstractC4739c {
    public C4738b(C5563e c5563e, C2897a.z zVar) {
        super(c5563e, zVar);
    }

    /* renamed from: f */
    private String m18886f(int i10) {
        String str;
        String str2;
        String str3 = "ContainsPII";
        if (i10 == 10) {
            m18891d(Integer.valueOf(C2748c0.f10673j2));
            str = "Android-AppSignup-Validation-UsernameContainsPII";
            str2 = "ContainsPII";
        } else if (i10 != 12) {
            switch (i10) {
                case 0:
                    m18892e(Integer.valueOf(C2748c0.f10548M1));
                    str3 = "Success";
                    str = "Android-AppSignup-Validation-UsernameSuccess";
                    str2 = BuildConfig.FLAVOR;
                    break;
                case 1:
                    m18890c();
                    str3 = "Taken";
                    str = "Android-AppSignup-Validation-UsernameTaken";
                    str2 = "UsernameTaken";
                    break;
                case 2:
                    m18891d(Integer.valueOf(C2748c0.f10643e2));
                    str3 = "Explicit";
                    str = "Android-AppSignup-Validation-UsernameExplicit";
                    str2 = "UsernameModerated";
                    break;
                case 3:
                    m18891d(Integer.valueOf(C2748c0.f10667i2));
                    str3 = "InvalidLength";
                    str = "Android-AppSignup-Validation-UsernameInvalidLength";
                    str2 = "UsernameInvalidLength";
                    break;
                case 4:
                    m18891d(Integer.valueOf(C2748c0.f10661h2));
                    str = "Android-AppSignup-Validation-UsernameStartingOrEndingWithUnderscore";
                    str2 = "StartingOrEndingWithUnderscore";
                    str3 = str2;
                    break;
                case 5:
                    m18891d(Integer.valueOf(C2748c0.f10685l2));
                    str = "Android-AppSignup-Validation-UsernameContainsMoreThanOneUnderscore";
                    str2 = "MoreThanOneUnderscore";
                    str3 = str2;
                    break;
                case 6:
                    m18891d(Integer.valueOf(C2748c0.f10631c2));
                    str = "Android-AppSignup-Validation-UsernameContainsSpaces";
                    str2 = "ContainSpaces";
                    str3 = str2;
                    break;
                case 7:
                    m18891d(Integer.valueOf(C2748c0.f10637d2));
                    str = "Android-AppSignup-Validation-UsernameContainsInvalidCharacters";
                    str2 = "ContainInvalidCharacters";
                    str3 = str2;
                    break;
                default:
                    m18891d(Integer.valueOf(C2748c0.f10691m2));
                    str = "Android-AppSignup-Validation-UsernameUnknownError";
                    str2 = "UnknownError";
                    str3 = str2;
                    break;
            }
        } else {
            m18891d(Integer.valueOf(C2748c0.f10643e2));
            str3 = "Reserved";
            str = "Android-AppSignup-Validation-UsernameReserved";
            str2 = "UsernameReserved";
        }
        this.f18567a.m20388A(str);
        C1151k.m6714h("rbx.signup", "analyticsLabel: " + str3 + ", diagCounterName: " + str);
        return str2;
    }

    /* renamed from: g */
    private String m18887g(JSONObject jSONObject) {
        int i10 = C2748c0.f10691m2;
        String str = "Android-AppSignup-Validation-UsernameUnknownError";
        String str2 = "UnknownError";
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("errors");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    if (jSONObject2 != null) {
                        int optInt = jSONObject2.optInt("code", -1);
                        if (optInt == 1) {
                            i10 = C2748c0.f10679k2;
                            str = "Android-AppSignup-Validation-UsernameRequiredError";
                            str2 = "Username is required";
                            break;
                        }
                        if (optInt == 2) {
                            i10 = C2748c0.f10528I1;
                            str = "Android-AppSignup-Validation-UsernameBirthDateRequired";
                            str2 = "Birthday is required";
                            break;
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        m18891d(Integer.valueOf(i10));
        this.f18567a.m20388A(str);
        return str2;
    }

    @Override // p251t8.AbstractC4739c
    /* renamed from: a */
    public C3417j mo18888a(String str, String str2, String str3) {
        return C3409b.m15021k(C2877p0.m12915d1(str, str2, str3), null, null, null);
    }

    @Override // p251t8.AbstractC4739c
    /* renamed from: b */
    public String mo18889b(int i10, JSONObject jSONObject) {
        if (i10 == 200) {
            return m18886f(jSONObject.optInt("code", -1));
        }
        if (i10 == 400) {
            return m18887g(jSONObject);
        }
        m18891d(Integer.valueOf(C2748c0.f10691m2));
        this.f18567a.m20388A("Android-AppSignup-Validation-UsernameUnknownError");
        return "UnknownError";
    }
}
