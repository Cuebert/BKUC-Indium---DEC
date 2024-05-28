package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5544u;

/* loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C5544u();

    /* renamed from: A */
    private final String f7559A;

    /* renamed from: n */
    private final String f7560n;

    /* renamed from: o */
    private final String f7561o;

    /* renamed from: p */
    private final String f7562p;

    /* renamed from: q */
    private final String f7563q;

    /* renamed from: r */
    private final String f7564r;

    /* renamed from: s */
    private final String f7565s;

    /* renamed from: t */
    private final String f7566t;

    /* renamed from: u */
    private final String f7567u;

    /* renamed from: v */
    private final String f7568v;

    /* renamed from: w */
    private final String f7569w;

    /* renamed from: x */
    private final String f7570x;

    /* renamed from: y */
    private final String f7571y;

    /* renamed from: z */
    private final String f7572z;

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7560n = str;
        this.f7561o = str2;
        this.f7562p = str3;
        this.f7563q = str4;
        this.f7564r = str5;
        this.f7565s = str6;
        this.f7566t = str7;
        this.f7567u = str8;
        this.f7568v = str9;
        this.f7569w = str10;
        this.f7570x = str11;
        this.f7571y = str12;
        this.f7572z = str13;
        this.f7559A = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7560n, false);
        C0029b.m215s(parcel, 2, this.f7561o, false);
        C0029b.m215s(parcel, 3, this.f7562p, false);
        C0029b.m215s(parcel, 4, this.f7563q, false);
        C0029b.m215s(parcel, 5, this.f7564r, false);
        C0029b.m215s(parcel, 6, this.f7565s, false);
        C0029b.m215s(parcel, 7, this.f7566t, false);
        C0029b.m215s(parcel, 8, this.f7567u, false);
        C0029b.m215s(parcel, 9, this.f7568v, false);
        C0029b.m215s(parcel, 10, this.f7569w, false);
        C0029b.m215s(parcel, 11, this.f7570x, false);
        C0029b.m215s(parcel, 12, this.f7571y, false);
        C0029b.m215s(parcel, 13, this.f7572z, false);
        C0029b.m215s(parcel, 14, this.f7559A, false);
        C0029b.m198b(parcel, m197a);
    }
}
