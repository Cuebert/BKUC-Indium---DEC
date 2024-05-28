package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C1331i();

    /* renamed from: n */
    private final String f6038n;

    /* renamed from: o */
    private final String f6039o;

    /* renamed from: p */
    private final String f6040p;

    /* renamed from: q */
    private final String f6041q;

    /* renamed from: r */
    private final Uri f6042r;

    /* renamed from: s */
    private final String f6043s;

    /* renamed from: t */
    private final String f6044t;

    /* renamed from: u */
    private final String f6045u;

    /* renamed from: v */
    private final PublicKeyCredential f6046v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f6038n = C5984j.m21282f(str);
        this.f6039o = str2;
        this.f6040p = str3;
        this.f6041q = str4;
        this.f6042r = uri;
        this.f6043s = str5;
        this.f6044t = str6;
        this.f6045u = str7;
        this.f6046v = publicKeyCredential;
    }

    /* renamed from: A */
    public String m7313A() {
        return this.f6044t;
    }

    /* renamed from: B */
    public String m7314B() {
        return this.f6038n;
    }

    /* renamed from: C */
    public String m7315C() {
        return this.f6043s;
    }

    @Deprecated
    /* renamed from: D */
    public String m7316D() {
        return this.f6045u;
    }

    /* renamed from: E */
    public Uri m7317E() {
        return this.f6042r;
    }

    /* renamed from: F */
    public PublicKeyCredential m7318F() {
        return this.f6046v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return C5980h.m21269b(this.f6038n, signInCredential.f6038n) && C5980h.m21269b(this.f6039o, signInCredential.f6039o) && C5980h.m21269b(this.f6040p, signInCredential.f6040p) && C5980h.m21269b(this.f6041q, signInCredential.f6041q) && C5980h.m21269b(this.f6042r, signInCredential.f6042r) && C5980h.m21269b(this.f6043s, signInCredential.f6043s) && C5980h.m21269b(this.f6044t, signInCredential.f6044t) && C5980h.m21269b(this.f6045u, signInCredential.f6045u) && C5980h.m21269b(this.f6046v, signInCredential.f6046v);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6038n, this.f6039o, this.f6040p, this.f6041q, this.f6042r, this.f6043s, this.f6044t, this.f6045u, this.f6046v);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7314B(), false);
        C0029b.m215s(parcel, 2, m7319x(), false);
        C0029b.m215s(parcel, 3, m7321z(), false);
        C0029b.m215s(parcel, 4, m7320y(), false);
        C0029b.m213q(parcel, 5, m7317E(), i10, false);
        C0029b.m215s(parcel, 6, m7315C(), false);
        C0029b.m215s(parcel, 7, m7313A(), false);
        C0029b.m215s(parcel, 8, m7316D(), false);
        C0029b.m213q(parcel, 9, m7318F(), i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7319x() {
        return this.f6039o;
    }

    /* renamed from: y */
    public String m7320y() {
        return this.f6041q;
    }

    /* renamed from: z */
    public String m7321z() {
        return this.f6040p;
    }
}
