package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5540q;

/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C5540q();

    /* renamed from: n */
    private final int f7610n;

    public zzs(int i10) {
        this.f7610n = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7610n);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final int m9198x() {
        return this.f7610n;
    }
}
