package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5156d;

/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C5156d();

    /* renamed from: n */
    public String f7510n;

    /* renamed from: o */
    public String f7511o;

    /* renamed from: p */
    public int f7512p;

    public zzp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f7510n, false);
        C0029b.m215s(parcel, 3, this.f7511o, false);
        C0029b.m208l(parcel, 4, this.f7512p);
        C0029b.m198b(parcel, m197a);
    }

    public zzp(String str, String str2, int i10) {
        this.f7510n = str;
        this.f7511o = str2;
        this.f7512p = i10;
    }
}
