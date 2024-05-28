package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5127ac;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C5127ac();

    /* renamed from: n */
    public int f7410n;

    /* renamed from: o */
    public String f7411o;

    /* renamed from: p */
    public String f7412p;

    /* renamed from: q */
    public String f7413q;

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7410n);
        C0029b.m215s(parcel, 3, this.f7411o, false);
        C0029b.m215s(parcel, 4, this.f7412p, false);
        C0029b.m215s(parcel, 5, this.f7413q, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzj(int i10, String str, String str2, String str3) {
        this.f7410n = i10;
        this.f7411o = str;
        this.f7412p = str2;
        this.f7413q = str3;
    }
}
