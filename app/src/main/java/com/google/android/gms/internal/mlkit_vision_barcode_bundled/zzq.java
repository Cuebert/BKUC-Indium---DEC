package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5539p;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C5539p();

    /* renamed from: A */
    private final zzh f7595A;

    /* renamed from: B */
    private final zzi f7596B;

    /* renamed from: n */
    private final int f7597n;

    /* renamed from: o */
    private final String f7598o;

    /* renamed from: p */
    private final String f7599p;

    /* renamed from: q */
    private final byte[] f7600q;

    /* renamed from: r */
    private final Point[] f7601r;

    /* renamed from: s */
    private final int f7602s;

    /* renamed from: t */
    private final zzj f7603t;

    /* renamed from: u */
    private final zzm f7604u;

    /* renamed from: v */
    private final zzn f7605v;

    /* renamed from: w */
    private final zzp f7606w;

    /* renamed from: x */
    private final zzo f7607x;

    /* renamed from: y */
    private final zzk f7608y;

    /* renamed from: z */
    private final zzg f7609z;

    public zzq(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzj zzjVar, zzm zzmVar, zzn zznVar, zzp zzpVar, zzo zzoVar, zzk zzkVar, zzg zzgVar, zzh zzhVar, zzi zziVar) {
        this.f7597n = i10;
        this.f7598o = str;
        this.f7599p = str2;
        this.f7600q = bArr;
        this.f7601r = pointArr;
        this.f7602s = i11;
        this.f7603t = zzjVar;
        this.f7604u = zzmVar;
        this.f7605v = zznVar;
        this.f7606w = zzpVar;
        this.f7607x = zzoVar;
        this.f7608y = zzkVar;
        this.f7609z = zzgVar;
        this.f7595A = zzhVar;
        this.f7596B = zziVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7597n);
        C0029b.m215s(parcel, 2, this.f7598o, false);
        C0029b.m215s(parcel, 3, this.f7599p, false);
        C0029b.m202f(parcel, 4, this.f7600q, false);
        C0029b.m218v(parcel, 5, this.f7601r, i10, false);
        C0029b.m208l(parcel, 6, this.f7602s);
        C0029b.m213q(parcel, 7, this.f7603t, i10, false);
        C0029b.m213q(parcel, 8, this.f7604u, i10, false);
        C0029b.m213q(parcel, 9, this.f7605v, i10, false);
        C0029b.m213q(parcel, 10, this.f7606w, i10, false);
        C0029b.m213q(parcel, 11, this.f7607x, i10, false);
        C0029b.m213q(parcel, 12, this.f7608y, i10, false);
        C0029b.m213q(parcel, 13, this.f7609z, i10, false);
        C0029b.m213q(parcel, 14, this.f7595A, i10, false);
        C0029b.m213q(parcel, 15, this.f7596B, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
