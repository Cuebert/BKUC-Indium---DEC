package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5117a2;

/* loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C5117a2();

    /* renamed from: n */
    public int f7372n;

    /* renamed from: o */
    public String[] f7373o;

    public zze() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7372n);
        C0029b.m216t(parcel, 3, this.f7373o, false);
        C0029b.m198b(parcel, m197a);
    }

    public zze(int i10, String[] strArr) {
        this.f7372n = i10;
        this.f7373o = strArr;
    }
}
