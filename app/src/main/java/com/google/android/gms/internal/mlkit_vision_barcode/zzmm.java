package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5351rb;

/* loaded from: classes.dex */
public final class zzmm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmm> CREATOR = new C5351rb();

    /* renamed from: n */
    private final String f7478n;

    /* renamed from: o */
    private final String f7479o;

    public zzmm(String str, String str2) {
        this.f7478n = str;
        this.f7479o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7478n, false);
        C0029b.m215s(parcel, 2, this.f7479o, false);
        C0029b.m198b(parcel, m197a);
    }
}
