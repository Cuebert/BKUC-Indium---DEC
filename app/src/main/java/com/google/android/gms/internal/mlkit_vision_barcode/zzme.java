package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5195fb;

/* loaded from: classes.dex */
public final class zzme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzme> CREATOR = new C5195fb();

    /* renamed from: n */
    private final int f7427n;

    /* renamed from: o */
    private final int f7428o;

    /* renamed from: p */
    private final int f7429p;

    /* renamed from: q */
    private final int f7430q;

    /* renamed from: r */
    private final int f7431r;

    /* renamed from: s */
    private final int f7432s;

    /* renamed from: t */
    private final boolean f7433t;

    /* renamed from: u */
    private final String f7434u;

    public zzme(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f7427n = i10;
        this.f7428o = i11;
        this.f7429p = i12;
        this.f7430q = i13;
        this.f7431r = i14;
        this.f7432s = i15;
        this.f7433t = z10;
        this.f7434u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7427n);
        C0029b.m208l(parcel, 2, this.f7428o);
        C0029b.m208l(parcel, 3, this.f7429p);
        C0029b.m208l(parcel, 4, this.f7430q);
        C0029b.m208l(parcel, 5, this.f7431r);
        C0029b.m208l(parcel, 6, this.f7432s);
        C0029b.m199c(parcel, 7, this.f7433t);
        C0029b.m215s(parcel, 8, this.f7434u, false);
        C0029b.m198b(parcel, m197a);
    }
}
