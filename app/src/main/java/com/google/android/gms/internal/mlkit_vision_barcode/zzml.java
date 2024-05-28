package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5338qb;

/* loaded from: classes.dex */
public final class zzml extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzml> CREATOR = new C5338qb();

    /* renamed from: n */
    private final int f7476n;

    /* renamed from: o */
    private final String f7477o;

    public zzml(int i10, String str) {
        this.f7476n = i10;
        this.f7477o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7476n);
        C0029b.m215s(parcel, 2, this.f7477o, false);
        C0029b.m198b(parcel, m197a);
    }
}
