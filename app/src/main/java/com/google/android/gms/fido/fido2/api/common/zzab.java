package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3935d;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C3935d();

    /* renamed from: n */
    private final long f6597n;

    public zzab(long j10) {
        this.f6597n = ((Long) C5984j.m21286j(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f6597n == ((zzab) obj).f6597n;
    }

    public final int hashCode() {
        return C5980h.m21270c(Long.valueOf(this.f6597n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m211o(parcel, 1, this.f6597n);
        C0029b.m198b(parcel, m197a);
    }
}
