package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3950s;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new C3950s();

    /* renamed from: n */
    private final boolean f6615n;

    public zzu(boolean z10) {
        this.f6615n = ((Boolean) C5984j.m21286j(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzu) && this.f6615n == ((zzu) obj).f6615n;
    }

    public final int hashCode() {
        return C5980h.m21270c(Boolean.valueOf(this.f6615n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, this.f6615n);
        C0029b.m198b(parcel, m197a);
    }
}
