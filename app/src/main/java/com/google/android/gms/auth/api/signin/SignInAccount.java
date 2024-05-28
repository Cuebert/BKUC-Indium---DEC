package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C1339g();

    /* renamed from: n */
    @Deprecated
    final String f6091n;

    /* renamed from: o */
    private final GoogleSignInAccount f6092o;

    /* renamed from: p */
    @Deprecated
    final String f6093p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f6092o = googleSignInAccount;
        this.f6091n = C5984j.m21283g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f6093p = C5984j.m21283g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 4, this.f6091n, false);
        C0029b.m213q(parcel, 7, this.f6092o, i10, false);
        C0029b.m215s(parcel, 8, this.f6093p, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final GoogleSignInAccount m7364x() {
        return this.f6092o;
    }
}
