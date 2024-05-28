package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p245t2.C4621d;
import p258u2.C4819a;
import p295x2.C5506a;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C5506a.d, ReflectedParcelable {

    /* renamed from: A */
    public static final Scope f6063A = new Scope("profile");

    /* renamed from: B */
    public static final Scope f6064B = new Scope("email");

    /* renamed from: C */
    public static final Scope f6065C = new Scope("openid");
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: D */
    public static final Scope f6066D;

    /* renamed from: E */
    public static final Scope f6067E;

    /* renamed from: F */
    private static Comparator<Scope> f6068F;

    /* renamed from: y */
    public static final GoogleSignInOptions f6069y;

    /* renamed from: z */
    public static final GoogleSignInOptions f6070z;

    /* renamed from: n */
    final int f6071n;

    /* renamed from: o */
    private final ArrayList<Scope> f6072o;

    /* renamed from: p */
    private Account f6073p;

    /* renamed from: q */
    private boolean f6074q;

    /* renamed from: r */
    private final boolean f6075r;

    /* renamed from: s */
    private final boolean f6076s;

    /* renamed from: t */
    private String f6077t;

    /* renamed from: u */
    private String f6078u;

    /* renamed from: v */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f6079v;

    /* renamed from: w */
    private String f6080w;

    /* renamed from: x */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f6081x;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f6066D = scope;
        f6067E = new Scope("https://www.googleapis.com/auth/games");
        C1332a c1332a = new C1332a();
        c1332a.m7360b();
        c1332a.m7361c();
        f6069y = c1332a.m7359a();
        C1332a c1332a2 = new C1332a();
        c1332a2.m7362d(scope, new Scope[0]);
        f6070z = c1332a2.m7359a();
        CREATOR = new C1337e();
        f6068F = new C1336d();
    }

    public GoogleSignInOptions(int i10, ArrayList<Scope> arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, m7349Q(arrayList2), str3);
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, C4621d c4621d) {
        this(3, (ArrayList<Scope>) arrayList, account, z10, z11, z12, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    /* renamed from: F */
    public static GoogleSignInOptions m7339F(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* renamed from: Q */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m7349Q(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.m7370x()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* renamed from: A */
    public String m7350A() {
        return this.f6077t;
    }

    /* renamed from: B */
    public boolean m7351B() {
        return this.f6076s;
    }

    /* renamed from: C */
    public boolean m7352C() {
        return this.f6074q;
    }

    /* renamed from: D */
    public boolean m7353D() {
        return this.f6075r;
    }

    /* renamed from: J */
    public final String m7354J() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f6072o, f6068F);
            Iterator<Scope> it = this.f6072o.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m7408x());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f6073p;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f6074q);
            jSONObject.put("forceCodeForRefreshToken", this.f6076s);
            jSONObject.put("serverAuthRequested", this.f6075r);
            if (!TextUtils.isEmpty(this.f6077t)) {
                jSONObject.put("serverClientId", this.f6077t);
            }
            if (!TextUtils.isEmpty(this.f6078u)) {
                jSONObject.put("hostedDomain", this.f6078u);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: e */
    public Account m7355e() {
        return this.f6073p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.m7355e()) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f6079v     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f6079v     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f6072o     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m7358z()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f6072o     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m7358z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f6073p     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m7355e()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.m7355e()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f6077t     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.m7350A()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f6077t     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.m7350A()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f6076s     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m7351B()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f6074q     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m7352C()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f6075r     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m7353D()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f6080w     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.m7357y()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f6072o;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(arrayList2.get(i10).m7408x());
        }
        Collections.sort(arrayList);
        C4819a c4819a = new C4819a();
        c4819a.m19002a(arrayList);
        c4819a.m19002a(this.f6073p);
        c4819a.m19002a(this.f6077t);
        c4819a.m19004c(this.f6076s);
        c4819a.m19004c(this.f6074q);
        c4819a.m19004c(this.f6075r);
        c4819a.m19002a(this.f6080w);
        return c4819a.m19003b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6071n);
        C0029b.m219w(parcel, 2, m7358z(), false);
        C0029b.m213q(parcel, 3, m7355e(), i10, false);
        C0029b.m199c(parcel, 4, m7352C());
        C0029b.m199c(parcel, 5, m7353D());
        C0029b.m199c(parcel, 6, m7351B());
        C0029b.m215s(parcel, 7, m7350A(), false);
        C0029b.m215s(parcel, 8, this.f6078u, false);
        C0029b.m219w(parcel, 9, m7356x(), false);
        C0029b.m215s(parcel, 10, m7357y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m7356x() {
        return this.f6079v;
    }

    /* renamed from: y */
    public String m7357y() {
        return this.f6080w;
    }

    /* renamed from: z */
    public ArrayList<Scope> m7358z() {
        return new ArrayList<>(this.f6072o);
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes.dex */
    public static final class C1332a {

        /* renamed from: a */
        private Set<Scope> f6082a;

        /* renamed from: b */
        private boolean f6083b;

        /* renamed from: c */
        private boolean f6084c;

        /* renamed from: d */
        private boolean f6085d;

        /* renamed from: e */
        private String f6086e;

        /* renamed from: f */
        private Account f6087f;

        /* renamed from: g */
        private String f6088g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f6089h;

        /* renamed from: i */
        private String f6090i;

        public C1332a() {
            this.f6082a = new HashSet();
            this.f6089h = new HashMap();
        }

        /* renamed from: a */
        public GoogleSignInOptions m7359a() {
            if (this.f6082a.contains(GoogleSignInOptions.f6067E)) {
                Set<Scope> set = this.f6082a;
                Scope scope = GoogleSignInOptions.f6066D;
                if (set.contains(scope)) {
                    this.f6082a.remove(scope);
                }
            }
            if (this.f6085d && (this.f6087f == null || !this.f6082a.isEmpty())) {
                m7360b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f6082a), this.f6087f, this.f6085d, this.f6083b, this.f6084c, this.f6086e, this.f6088g, this.f6089h, this.f6090i);
        }

        /* renamed from: b */
        public C1332a m7360b() {
            this.f6082a.add(GoogleSignInOptions.f6065C);
            return this;
        }

        /* renamed from: c */
        public C1332a m7361c() {
            this.f6082a.add(GoogleSignInOptions.f6063A);
            return this;
        }

        /* renamed from: d */
        public C1332a m7362d(Scope scope, Scope... scopeArr) {
            this.f6082a.add(scope);
            this.f6082a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C1332a m7363e(String str) {
            this.f6090i = str;
            return this;
        }

        public C1332a(GoogleSignInOptions googleSignInOptions) {
            this.f6082a = new HashSet();
            this.f6089h = new HashMap();
            C5984j.m21286j(googleSignInOptions);
            this.f6082a = new HashSet(googleSignInOptions.f6072o);
            this.f6083b = googleSignInOptions.f6075r;
            this.f6084c = googleSignInOptions.f6076s;
            this.f6085d = googleSignInOptions.f6074q;
            this.f6086e = googleSignInOptions.f6077t;
            this.f6087f = googleSignInOptions.f6073p;
            this.f6088g = googleSignInOptions.f6078u;
            this.f6089h = GoogleSignInOptions.m7349Q(googleSignInOptions.f6079v);
            this.f6090i = googleSignInOptions.f6080w;
        }
    }

    private GoogleSignInOptions(int i10, ArrayList<Scope> arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f6071n = i10;
        this.f6072o = arrayList;
        this.f6073p = account;
        this.f6074q = z10;
        this.f6075r = z11;
        this.f6076s = z12;
        this.f6077t = str;
        this.f6078u = str2;
        this.f6079v = new ArrayList<>(map.values());
        this.f6081x = map;
        this.f6080w = str3;
    }
}
