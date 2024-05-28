package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5541r;

/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C5541r();

    /* renamed from: n */
    private final int f7537n;

    /* renamed from: o */
    private final int f7538o;

    /* renamed from: p */
    private final int f7539p;

    /* renamed from: q */
    private final int f7540q;

    /* renamed from: r */
    private final int f7541r;

    /* renamed from: s */
    private final int f7542s;

    /* renamed from: t */
    private final boolean f7543t;

    /* renamed from: u */
    private final String f7544u;

    public zzf(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f7537n = i10;
        this.f7538o = i11;
        this.f7539p = i12;
        this.f7540q = i13;
        this.f7541r = i14;
        this.f7542s = i15;
        this.f7543t = z10;
        this.f7544u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7537n);
        C0029b.m208l(parcel, 2, this.f7538o);
        C0029b.m208l(parcel, 3, this.f7539p);
        C0029b.m208l(parcel, 4, this.f7540q);
        C0029b.m208l(parcel, 5, this.f7541r);
        C0029b.m208l(parcel, 6, this.f7542s);
        C0029b.m199c(parcel, 7, this.f7543t);
        C0029b.m215s(parcel, 8, this.f7544u, false);
        C0029b.m198b(parcel, m197a);
    }
}
