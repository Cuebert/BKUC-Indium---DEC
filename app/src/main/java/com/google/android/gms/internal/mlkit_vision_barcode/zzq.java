package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5403vb;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C5403vb();

    /* renamed from: A */
    public zzi f7513A;

    /* renamed from: B */
    public byte[] f7514B;

    /* renamed from: C */
    public boolean f7515C;

    /* renamed from: D */
    public double f7516D;

    /* renamed from: n */
    public int f7517n;

    /* renamed from: o */
    public String f7518o;

    /* renamed from: p */
    public String f7519p;

    /* renamed from: q */
    public int f7520q;

    /* renamed from: r */
    public Point[] f7521r;

    /* renamed from: s */
    public zzj f7522s;

    /* renamed from: t */
    public zzm f7523t;

    /* renamed from: u */
    public zzn f7524u;

    /* renamed from: v */
    public zzp f7525v;

    /* renamed from: w */
    public zzo f7526w;

    /* renamed from: x */
    public zzk f7527x;

    /* renamed from: y */
    public zzg f7528y;

    /* renamed from: z */
    public zzh f7529z;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7517n);
        C0029b.m215s(parcel, 3, this.f7518o, false);
        C0029b.m215s(parcel, 4, this.f7519p, false);
        C0029b.m208l(parcel, 5, this.f7520q);
        C0029b.m218v(parcel, 6, this.f7521r, i10, false);
        C0029b.m213q(parcel, 7, this.f7522s, i10, false);
        C0029b.m213q(parcel, 8, this.f7523t, i10, false);
        C0029b.m213q(parcel, 9, this.f7524u, i10, false);
        C0029b.m213q(parcel, 10, this.f7525v, i10, false);
        C0029b.m213q(parcel, 11, this.f7526w, i10, false);
        C0029b.m213q(parcel, 12, this.f7527x, i10, false);
        C0029b.m213q(parcel, 13, this.f7528y, i10, false);
        C0029b.m213q(parcel, 14, this.f7529z, i10, false);
        C0029b.m213q(parcel, 15, this.f7513A, i10, false);
        C0029b.m202f(parcel, 16, this.f7514B, false);
        C0029b.m199c(parcel, 17, this.f7515C);
        C0029b.m204h(parcel, 18, this.f7516D);
        C0029b.m198b(parcel, m197a);
    }

    public zzq(int i10, String str, String str2, int i11, Point[] pointArr, zzj zzjVar, zzm zzmVar, zzn zznVar, zzp zzpVar, zzo zzoVar, zzk zzkVar, zzg zzgVar, zzh zzhVar, zzi zziVar, byte[] bArr, boolean z10, double d10) {
        this.f7517n = i10;
        this.f7518o = str;
        this.f7514B = bArr;
        this.f7519p = str2;
        this.f7520q = i11;
        this.f7521r = pointArr;
        this.f7515C = z10;
        this.f7516D = d10;
        this.f7522s = zzjVar;
        this.f7523t = zzmVar;
        this.f7524u = zznVar;
        this.f7525v = zzpVar;
        this.f7526w = zzoVar;
        this.f7527x = zzkVar;
        this.f7528y = zzgVar;
        this.f7529z = zzhVar;
        this.f7513A = zziVar;
    }
}
