package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p209q2.C4301i;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new C4301i();

    /* renamed from: n */
    private final String f6047n;

    /* renamed from: o */
    private final String f6048o;

    public SignInPassword(String str, String str2) {
        this.f6047n = C5984j.m21283g(((String) C5984j.m21287k(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f6048o = C5984j.m21282f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return C5980h.m21269b(this.f6047n, signInPassword.f6047n) && C5980h.m21269b(this.f6048o, signInPassword.f6048o);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6047n, this.f6048o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7322x(), false);
        C0029b.m215s(parcel, 2, m7323y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7322x() {
        return this.f6047n;
    }

    /* renamed from: y */
    public String m7323y() {
        return this.f6048o;
    }
}
