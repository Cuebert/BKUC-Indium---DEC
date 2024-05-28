package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5538o;

/* loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C5538o();

    /* renamed from: n */
    private final int f7535n;

    /* renamed from: o */
    private final String[] f7536o;

    public zze(int i10, String[] strArr) {
        this.f7535n = i10;
        this.f7536o = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7535n);
        C0029b.m216t(parcel, 2, this.f7536o, false);
        C0029b.m198b(parcel, m197a);
    }
}
