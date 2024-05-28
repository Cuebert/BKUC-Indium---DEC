package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p161m3.C3947p;
import p321z2.C5980h;

/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C3947p();

    /* renamed from: n */
    private final byte[] f6606n;

    /* renamed from: o */
    private final byte[] f6607o;

    public zzf(byte[] bArr, byte[] bArr2) {
        this.f6606n = bArr;
        this.f6607o = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Arrays.equals(this.f6606n, zzfVar.f6606n) && Arrays.equals(this.f6607o, zzfVar.f6607o);
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f6606n, this.f6607o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m202f(parcel, 1, this.f6606n, false);
        C0029b.m202f(parcel, 2, this.f6607o, false);
        C0029b.m198b(parcel, m197a);
    }
}
