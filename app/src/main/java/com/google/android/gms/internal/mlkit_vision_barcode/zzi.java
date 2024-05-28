package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5455zb;

/* loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C5455zb();

    /* renamed from: A */
    public String f7396A;

    /* renamed from: n */
    public String f7397n;

    /* renamed from: o */
    public String f7398o;

    /* renamed from: p */
    public String f7399p;

    /* renamed from: q */
    public String f7400q;

    /* renamed from: r */
    public String f7401r;

    /* renamed from: s */
    public String f7402s;

    /* renamed from: t */
    public String f7403t;

    /* renamed from: u */
    public String f7404u;

    /* renamed from: v */
    public String f7405v;

    /* renamed from: w */
    public String f7406w;

    /* renamed from: x */
    public String f7407x;

    /* renamed from: y */
    public String f7408y;

    /* renamed from: z */
    public String f7409z;

    public zzi() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f7397n, false);
        C0029b.m215s(parcel, 3, this.f7398o, false);
        C0029b.m215s(parcel, 4, this.f7399p, false);
        C0029b.m215s(parcel, 5, this.f7400q, false);
        C0029b.m215s(parcel, 6, this.f7401r, false);
        C0029b.m215s(parcel, 7, this.f7402s, false);
        C0029b.m215s(parcel, 8, this.f7403t, false);
        C0029b.m215s(parcel, 9, this.f7404u, false);
        C0029b.m215s(parcel, 10, this.f7405v, false);
        C0029b.m215s(parcel, 11, this.f7406w, false);
        C0029b.m215s(parcel, 12, this.f7407x, false);
        C0029b.m215s(parcel, 13, this.f7408y, false);
        C0029b.m215s(parcel, 14, this.f7409z, false);
        C0029b.m215s(parcel, 15, this.f7396A, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7397n = str;
        this.f7398o = str2;
        this.f7399p = str3;
        this.f7400q = str4;
        this.f7401r = str5;
        this.f7402s = str6;
        this.f7403t = str7;
        this.f7404u = str8;
        this.f7405v = str9;
        this.f7406w = str10;
        this.f7407x = str11;
        this.f7408y = str12;
        this.f7409z = str13;
        this.f7396A = str14;
    }
}
