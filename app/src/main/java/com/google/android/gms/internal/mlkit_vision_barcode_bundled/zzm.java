package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5531h;

/* loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C5531h();

    /* renamed from: n */
    private final int f7586n;

    /* renamed from: o */
    private final String f7587o;

    public zzm(int i10, String str) {
        this.f7586n = i10;
        this.f7587o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7586n);
        C0029b.m215s(parcel, 2, this.f7587o, false);
        C0029b.m198b(parcel, m197a);
    }
}
