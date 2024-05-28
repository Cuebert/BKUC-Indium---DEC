package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5416wb;

/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C5416wb();

    /* renamed from: n */
    public int f7374n;

    /* renamed from: o */
    public int f7375o;

    /* renamed from: p */
    public int f7376p;

    /* renamed from: q */
    public int f7377q;

    /* renamed from: r */
    public int f7378r;

    /* renamed from: s */
    public int f7379s;

    /* renamed from: t */
    public boolean f7380t;

    /* renamed from: u */
    public String f7381u;

    public zzf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7374n);
        C0029b.m208l(parcel, 3, this.f7375o);
        C0029b.m208l(parcel, 4, this.f7376p);
        C0029b.m208l(parcel, 5, this.f7377q);
        C0029b.m208l(parcel, 6, this.f7378r);
        C0029b.m208l(parcel, 7, this.f7379s);
        C0029b.m199c(parcel, 8, this.f7380t);
        C0029b.m215s(parcel, 9, this.f7381u, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzf(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f7374n = i10;
        this.f7375o = i11;
        this.f7376p = i12;
        this.f7377q = i13;
        this.f7378r = i14;
        this.f7379s = i15;
        this.f7380t = z10;
        this.f7381u = str;
    }
}
