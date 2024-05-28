package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p070f3.C3133g;
import p070f3.InterfaceC3130d;
import p245t2.C4620c;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: n */
    final int f6050n;

    /* renamed from: o */
    private String f6051o;

    /* renamed from: p */
    private String f6052p;

    /* renamed from: q */
    private String f6053q;

    /* renamed from: r */
    private String f6054r;

    /* renamed from: s */
    private Uri f6055s;

    /* renamed from: t */
    private String f6056t;

    /* renamed from: u */
    private long f6057u;

    /* renamed from: v */
    private String f6058v;

    /* renamed from: w */
    List<Scope> f6059w;

    /* renamed from: x */
    private String f6060x;

    /* renamed from: y */
    private String f6061y;

    /* renamed from: z */
    private Set<Scope> f6062z = new HashSet();
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1335c();

    /* renamed from: A */
    public static InterfaceC3130d f6049A = C3133g.m13786c();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List<Scope> list, String str7, String str8) {
        this.f6050n = i10;
        this.f6051o = str;
        this.f6052p = str2;
        this.f6053q = str3;
        this.f6054r = str4;
        this.f6055s = uri;
        this.f6056t = str5;
        this.f6057u = j10;
        this.f6058v = str6;
        this.f6059w = list;
        this.f6060x = str7;
        this.f6061y = str8;
    }

    /* renamed from: G */
    public static GoogleSignInAccount m7324G(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), C5984j.m21282f(str7), new ArrayList((Collection) C5984j.m21286j(set)), str5, str6);
    }

    /* renamed from: H */
    public static GoogleSignInAccount m7325H(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount m7324G = m7324G(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m7324G.f6056t = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return m7324G;
    }

    /* renamed from: A */
    public String m7326A() {
        return this.f6060x;
    }

    /* renamed from: B */
    public String m7327B() {
        return this.f6051o;
    }

    /* renamed from: C */
    public String m7328C() {
        return this.f6052p;
    }

    /* renamed from: D */
    public Uri m7329D() {
        return this.f6055s;
    }

    /* renamed from: E */
    public Set<Scope> m7330E() {
        HashSet hashSet = new HashSet(this.f6059w);
        hashSet.addAll(this.f6062z);
        return hashSet;
    }

    /* renamed from: F */
    public String m7331F() {
        return this.f6056t;
    }

    /* renamed from: I */
    public final String m7332I() {
        return this.f6058v;
    }

    /* renamed from: J */
    public final String m7333J() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m7327B() != null) {
                jSONObject.put("id", m7327B());
            }
            if (m7328C() != null) {
                jSONObject.put("tokenId", m7328C());
            }
            if (m7336y() != null) {
                jSONObject.put("email", m7336y());
            }
            if (m7335x() != null) {
                jSONObject.put("displayName", m7335x());
            }
            if (m7326A() != null) {
                jSONObject.put("givenName", m7326A());
            }
            if (m7337z() != null) {
                jSONObject.put("familyName", m7337z());
            }
            Uri m7329D = m7329D();
            if (m7329D != null) {
                jSONObject.put("photoUrl", m7329D.toString());
            }
            if (m7331F() != null) {
                jSONObject.put("serverAuthCode", m7331F());
            }
            jSONObject.put("expirationTime", this.f6057u);
            jSONObject.put("obfuscatedIdentifier", this.f6058v);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f6059w;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C4620c.f18413n);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m7408x());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: e */
    public Account m7334e() {
        String str = this.f6053q;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f6058v.equals(this.f6058v) && googleSignInAccount.m7330E().equals(m7330E());
    }

    public int hashCode() {
        return ((this.f6058v.hashCode() + 527) * 31) + m7330E().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6050n);
        C0029b.m215s(parcel, 2, m7327B(), false);
        C0029b.m215s(parcel, 3, m7328C(), false);
        C0029b.m215s(parcel, 4, m7336y(), false);
        C0029b.m215s(parcel, 5, m7335x(), false);
        C0029b.m213q(parcel, 6, m7329D(), i10, false);
        C0029b.m215s(parcel, 7, m7331F(), false);
        C0029b.m211o(parcel, 8, this.f6057u);
        C0029b.m215s(parcel, 9, this.f6058v, false);
        C0029b.m219w(parcel, 10, this.f6059w, false);
        C0029b.m215s(parcel, 11, m7326A(), false);
        C0029b.m215s(parcel, 12, m7337z(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7335x() {
        return this.f6054r;
    }

    /* renamed from: y */
    public String m7336y() {
        return this.f6053q;
    }

    /* renamed from: z */
    public String m7337z() {
        return this.f6061y;
    }
}
