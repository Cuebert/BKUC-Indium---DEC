package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5325pb;

/* loaded from: classes.dex */
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new C5325pb();

    /* renamed from: n */
    private final String f7469n;

    /* renamed from: o */
    private final String f7470o;

    /* renamed from: p */
    private final String f7471p;

    /* renamed from: q */
    private final String f7472q;

    /* renamed from: r */
    private final String f7473r;

    /* renamed from: s */
    private final String f7474s;

    /* renamed from: t */
    private final String f7475t;

    public zzmk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7469n = str;
        this.f7470o = str2;
        this.f7471p = str3;
        this.f7472q = str4;
        this.f7473r = str5;
        this.f7474s = str6;
        this.f7475t = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7469n, false);
        C0029b.m215s(parcel, 2, this.f7470o, false);
        C0029b.m215s(parcel, 3, this.f7471p, false);
        C0029b.m215s(parcel, 4, this.f7472q, false);
        C0029b.m215s(parcel, 5, this.f7473r, false);
        C0029b.m215s(parcel, 6, this.f7474s, false);
        C0029b.m215s(parcel, 7, this.f7475t, false);
        C0029b.m198b(parcel, m197a);
    }
}
