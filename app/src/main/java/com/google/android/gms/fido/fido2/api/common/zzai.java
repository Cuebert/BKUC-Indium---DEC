package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p161m3.C3939h;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C3939h();

    /* renamed from: n */
    private final byte[][] f6600n;

    public zzai(byte[][] bArr) {
        C5984j.m21277a(bArr != null);
        C5984j.m21277a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            C5984j.m21277a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            C5984j.m21277a(bArr[i11] != null);
            int length = bArr[i11].length;
            C5984j.m21277a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f6600n = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.f6600n, ((zzai) obj).f6600n);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f6600n) {
            i10 ^= C5980h.m21270c(bArr);
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m203g(parcel, 1, this.f6600n, false);
        C0029b.m198b(parcel, m197a);
    }
}
