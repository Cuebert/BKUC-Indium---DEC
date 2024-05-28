package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5247jb;

/* loaded from: classes.dex */
public final class zzmi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmi> CREATOR = new C5247jb();

    /* renamed from: n */
    private final int f7463n;

    /* renamed from: o */
    private final String f7464o;

    /* renamed from: p */
    private final String f7465p;

    /* renamed from: q */
    private final String f7466q;

    public zzmi(int i10, String str, String str2, String str3) {
        this.f7463n = i10;
        this.f7464o = str;
        this.f7465p = str2;
        this.f7466q = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7463n);
        C0029b.m215s(parcel, 2, this.f7464o, false);
        C0029b.m215s(parcel, 3, this.f7465p, false);
        C0029b.m215s(parcel, 4, this.f7466q, false);
        C0029b.m198b(parcel, m197a);
    }
}
