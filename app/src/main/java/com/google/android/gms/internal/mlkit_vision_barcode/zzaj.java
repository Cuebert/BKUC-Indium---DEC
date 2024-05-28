package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5235j;

/* loaded from: classes.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C5235j();

    /* renamed from: n */
    public int f7367n;

    /* renamed from: o */
    public int f7368o;

    /* renamed from: p */
    public int f7369p;

    /* renamed from: q */
    public long f7370q;

    /* renamed from: r */
    public int f7371r;

    public zzaj(int i10, int i11, int i12, long j10, int i13) {
        this.f7367n = i10;
        this.f7368o = i11;
        this.f7369p = i12;
        this.f7370q = j10;
        this.f7371r = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7367n);
        C0029b.m208l(parcel, 3, this.f7368o);
        C0029b.m208l(parcel, 4, this.f7369p);
        C0029b.m211o(parcel, 5, this.f7370q);
        C0029b.m208l(parcel, 6, this.f7371r);
        C0029b.m198b(parcel, m197a);
    }
}
