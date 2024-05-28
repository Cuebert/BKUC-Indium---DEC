package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3936e;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C3936e();

    /* renamed from: n */
    private final boolean f6598n;

    public zzad(boolean z10) {
        this.f6598n = ((Boolean) C5984j.m21286j(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzad) && this.f6598n == ((zzad) obj).f6598n;
    }

    public final int hashCode() {
        return C5980h.m21270c(Boolean.valueOf(this.f6598n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, this.f6598n);
        C0029b.m198b(parcel, m197a);
    }
}
