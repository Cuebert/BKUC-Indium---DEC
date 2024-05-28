package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3937f;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new C3937f();

    /* renamed from: n */
    private final boolean f6531n;

    public GoogleThirdPartyPaymentExtension(boolean z10) {
        this.f6531n = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f6531n == ((GoogleThirdPartyPaymentExtension) obj).m7820x();
    }

    public int hashCode() {
        return C5980h.m21270c(Boolean.valueOf(this.f6531n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, m7820x());
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public boolean m7820x() {
        return this.f6531n;
    }
}
