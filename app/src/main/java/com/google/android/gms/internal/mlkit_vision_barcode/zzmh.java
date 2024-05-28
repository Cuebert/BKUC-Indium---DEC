package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5234ib;

/* loaded from: classes.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new C5234ib();

    /* renamed from: A */
    private final String f7449A;

    /* renamed from: n */
    private final String f7450n;

    /* renamed from: o */
    private final String f7451o;

    /* renamed from: p */
    private final String f7452p;

    /* renamed from: q */
    private final String f7453q;

    /* renamed from: r */
    private final String f7454r;

    /* renamed from: s */
    private final String f7455s;

    /* renamed from: t */
    private final String f7456t;

    /* renamed from: u */
    private final String f7457u;

    /* renamed from: v */
    private final String f7458v;

    /* renamed from: w */
    private final String f7459w;

    /* renamed from: x */
    private final String f7460x;

    /* renamed from: y */
    private final String f7461y;

    /* renamed from: z */
    private final String f7462z;

    public zzmh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7450n = str;
        this.f7451o = str2;
        this.f7452p = str3;
        this.f7453q = str4;
        this.f7454r = str5;
        this.f7455s = str6;
        this.f7456t = str7;
        this.f7457u = str8;
        this.f7458v = str9;
        this.f7459w = str10;
        this.f7460x = str11;
        this.f7461y = str12;
        this.f7462z = str13;
        this.f7449A = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7450n, false);
        C0029b.m215s(parcel, 2, this.f7451o, false);
        C0029b.m215s(parcel, 3, this.f7452p, false);
        C0029b.m215s(parcel, 4, this.f7453q, false);
        C0029b.m215s(parcel, 5, this.f7454r, false);
        C0029b.m215s(parcel, 6, this.f7455s, false);
        C0029b.m215s(parcel, 7, this.f7456t, false);
        C0029b.m215s(parcel, 8, this.f7457u, false);
        C0029b.m215s(parcel, 9, this.f7458v, false);
        C0029b.m215s(parcel, 10, this.f7459w, false);
        C0029b.m215s(parcel, 11, this.f7460x, false);
        C0029b.m215s(parcel, 12, this.f7461y, false);
        C0029b.m215s(parcel, 13, this.f7462z, false);
        C0029b.m215s(parcel, 14, this.f7449A, false);
        C0029b.m198b(parcel, m197a);
    }
}
