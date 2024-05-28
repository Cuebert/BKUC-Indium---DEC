package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5534k;

/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C5534k();

    /* renamed from: n */
    private final String f7592n;

    /* renamed from: o */
    private final String f7593o;

    /* renamed from: p */
    private final int f7594p;

    public zzp(String str, String str2, int i10) {
        this.f7592n = str;
        this.f7593o = str2;
        this.f7594p = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7592n, false);
        C0029b.m215s(parcel, 2, this.f7593o, false);
        C0029b.m208l(parcel, 3, this.f7594p);
        C0029b.m198b(parcel, m197a);
    }
}
