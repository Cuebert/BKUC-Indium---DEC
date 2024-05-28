package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5532i;

/* loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C5532i();

    /* renamed from: n */
    private final String f7588n;

    /* renamed from: o */
    private final String f7589o;

    public zzn(String str, String str2) {
        this.f7588n = str;
        this.f7589o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7588n, false);
        C0029b.m215s(parcel, 2, this.f7589o, false);
        C0029b.m198b(parcel, m197a);
    }
}
