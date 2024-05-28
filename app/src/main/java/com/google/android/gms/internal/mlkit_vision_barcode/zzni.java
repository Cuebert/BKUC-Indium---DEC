package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5390ub;

/* loaded from: classes.dex */
public final class zzni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzni> CREATOR = new C5390ub();

    /* renamed from: n */
    private final int f7503n;

    /* renamed from: o */
    private final int f7504o;

    /* renamed from: p */
    private final int f7505p;

    /* renamed from: q */
    private final int f7506q;

    /* renamed from: r */
    private final long f7507r;

    public zzni(int i10, int i11, int i12, int i13, long j10) {
        this.f7503n = i10;
        this.f7504o = i11;
        this.f7505p = i12;
        this.f7506q = i13;
        this.f7507r = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7503n);
        C0029b.m208l(parcel, 2, this.f7504o);
        C0029b.m208l(parcel, 3, this.f7505p);
        C0029b.m208l(parcel, 4, this.f7506q);
        C0029b.m211o(parcel, 5, this.f7507r);
        C0029b.m198b(parcel, m197a);
    }
}
