package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5377tb;

/* loaded from: classes.dex */
public final class zzmo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmo> CREATOR = new C5377tb();

    /* renamed from: n */
    private final String f7482n;

    /* renamed from: o */
    private final String f7483o;

    /* renamed from: p */
    private final int f7484p;

    public zzmo(String str, String str2, int i10) {
        this.f7482n = str;
        this.f7483o = str2;
        this.f7484p = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7482n, false);
        C0029b.m215s(parcel, 2, this.f7483o, false);
        C0029b.m208l(parcel, 3, this.f7484p);
        C0029b.m198b(parcel, m197a);
    }
}
