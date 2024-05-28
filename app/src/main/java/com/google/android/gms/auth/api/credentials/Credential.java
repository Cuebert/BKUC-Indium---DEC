package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

@Deprecated
/* loaded from: classes.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C1312a();

    /* renamed from: n */
    private final String f5936n;

    /* renamed from: o */
    private final String f5937o;

    /* renamed from: p */
    private final Uri f5938p;

    /* renamed from: q */
    private final List f5939q;

    /* renamed from: r */
    private final String f5940r;

    /* renamed from: s */
    private final String f5941s;

    /* renamed from: t */
    private final String f5942t;

    /* renamed from: u */
    private final String f5943u;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    /* loaded from: classes.dex */
    public static class C1309a {

        /* renamed from: a */
        private final String f5944a;

        /* renamed from: b */
        private String f5945b;

        /* renamed from: c */
        private Uri f5946c;

        /* renamed from: d */
        private List f5947d;

        /* renamed from: e */
        private String f5948e;

        /* renamed from: f */
        private String f5949f;

        /* renamed from: g */
        private String f5950g;

        /* renamed from: h */
        private String f5951h;

        public C1309a(String str) {
            this.f5944a = str;
        }

        /* renamed from: a */
        public Credential m7223a() {
            return new Credential(this.f5944a, this.f5945b, this.f5946c, this.f5947d, this.f5948e, this.f5949f, this.f5950g, this.f5951h);
        }

        /* renamed from: b */
        public C1309a m7224b(String str) {
            this.f5945b = str;
            return this;
        }

        /* renamed from: c */
        public C1309a m7225c(String str) {
            this.f5948e = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        Boolean bool;
        String trim = ((String) C5984j.m21287k(str, "credential identifier cannot be null")).trim();
        C5984j.m21283g(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = Boolean.FALSE;
            } else {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                    boolean z10 = true;
                    if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                        z10 = false;
                    }
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f5937o = str2;
        this.f5938p = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f5939q = unmodifiableList;
        this.f5936n = trim;
        this.f5940r = str3;
        this.f5941s = str4;
        this.f5942t = str5;
        this.f5943u = str6;
    }

    /* renamed from: A */
    public String m7215A() {
        return this.f5936n;
    }

    /* renamed from: B */
    public List<IdToken> m7216B() {
        return this.f5939q;
    }

    /* renamed from: C */
    public String m7217C() {
        return this.f5937o;
    }

    /* renamed from: D */
    public String m7218D() {
        return this.f5940r;
    }

    /* renamed from: E */
    public Uri m7219E() {
        return this.f5938p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f5936n, credential.f5936n) && TextUtils.equals(this.f5937o, credential.f5937o) && C5980h.m21269b(this.f5938p, credential.f5938p) && TextUtils.equals(this.f5940r, credential.f5940r) && TextUtils.equals(this.f5941s, credential.f5941s);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f5936n, this.f5937o, this.f5938p, this.f5940r, this.f5941s);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7215A(), false);
        C0029b.m215s(parcel, 2, m7217C(), false);
        C0029b.m213q(parcel, 3, m7219E(), i10, false);
        C0029b.m219w(parcel, 4, m7216B(), false);
        C0029b.m215s(parcel, 5, m7218D(), false);
        C0029b.m215s(parcel, 6, m7220x(), false);
        C0029b.m215s(parcel, 9, m7222z(), false);
        C0029b.m215s(parcel, 10, m7221y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7220x() {
        return this.f5941s;
    }

    /* renamed from: y */
    public String m7221y() {
        return this.f5943u;
    }

    /* renamed from: z */
    public String m7222z() {
        return this.f5942t;
    }
}
