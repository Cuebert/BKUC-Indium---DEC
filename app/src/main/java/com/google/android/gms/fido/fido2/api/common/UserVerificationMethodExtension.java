package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3944m;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new C3944m();

    /* renamed from: n */
    private final boolean f6592n;

    public UserVerificationMethodExtension(boolean z10) {
        this.f6592n = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.f6592n == ((UserVerificationMethodExtension) obj).f6592n;
    }

    public int hashCode() {
        return C5980h.m21270c(Boolean.valueOf(this.f6592n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, m7867x());
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public boolean m7867x() {
        return this.f6592n;
    }
}
