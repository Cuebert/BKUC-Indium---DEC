package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5545v;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C5545v();

    /* renamed from: n */
    private final int f7573n;

    /* renamed from: o */
    private final String f7574o;

    /* renamed from: p */
    private final String f7575p;

    /* renamed from: q */
    private final String f7576q;

    public zzj(int i10, String str, String str2, String str3) {
        this.f7573n = i10;
        this.f7574o = str;
        this.f7575p = str2;
        this.f7576q = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7573n);
        C0029b.m215s(parcel, 2, this.f7574o, false);
        C0029b.m215s(parcel, 3, this.f7575p, false);
        C0029b.m215s(parcel, 4, this.f7576q, false);
        C0029b.m198b(parcel, m197a);
    }
}
