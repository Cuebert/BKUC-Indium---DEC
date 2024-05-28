package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C1473t();

    /* renamed from: n */
    private final long f6610n;

    /* renamed from: o */
    private final byte[] f6611o;

    /* renamed from: p */
    private final byte[] f6612p;

    /* renamed from: q */
    private final byte[] f6613q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f6610n = j10;
        this.f6611o = (byte[]) C5984j.m21286j(bArr);
        this.f6612p = (byte[]) C5984j.m21286j(bArr2);
        this.f6613q = (byte[]) C5984j.m21286j(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f6610n == zzqVar.f6610n && Arrays.equals(this.f6611o, zzqVar.f6611o) && Arrays.equals(this.f6612p, zzqVar.f6612p) && Arrays.equals(this.f6613q, zzqVar.f6613q);
    }

    public final int hashCode() {
        return C5980h.m21270c(Long.valueOf(this.f6610n), this.f6611o, this.f6612p, this.f6613q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m211o(parcel, 1, this.f6610n);
        C0029b.m202f(parcel, 2, this.f6611o, false);
        C0029b.m202f(parcel, 3, this.f6612p, false);
        C0029b.m202f(parcel, 4, this.f6613q, false);
        C0029b.m198b(parcel, m197a);
    }
}
