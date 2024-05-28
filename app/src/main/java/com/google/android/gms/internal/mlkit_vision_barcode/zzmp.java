package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5168db;

/* loaded from: classes.dex */
public final class zzmp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmp> CREATOR = new C5168db();

    /* renamed from: A */
    private final zzmg f7485A;

    /* renamed from: B */
    private final zzmh f7486B;

    /* renamed from: n */
    private final int f7487n;

    /* renamed from: o */
    private final String f7488o;

    /* renamed from: p */
    private final String f7489p;

    /* renamed from: q */
    private final byte[] f7490q;

    /* renamed from: r */
    private final Point[] f7491r;

    /* renamed from: s */
    private final int f7492s;

    /* renamed from: t */
    private final zzmi f7493t;

    /* renamed from: u */
    private final zzml f7494u;

    /* renamed from: v */
    private final zzmm f7495v;

    /* renamed from: w */
    private final zzmo f7496w;

    /* renamed from: x */
    private final zzmn f7497x;

    /* renamed from: y */
    private final zzmj f7498y;

    /* renamed from: z */
    private final zzmf f7499z;

    public zzmp(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzmi zzmiVar, zzml zzmlVar, zzmm zzmmVar, zzmo zzmoVar, zzmn zzmnVar, zzmj zzmjVar, zzmf zzmfVar, zzmg zzmgVar, zzmh zzmhVar) {
        this.f7487n = i10;
        this.f7488o = str;
        this.f7489p = str2;
        this.f7490q = bArr;
        this.f7491r = pointArr;
        this.f7492s = i11;
        this.f7493t = zzmiVar;
        this.f7494u = zzmlVar;
        this.f7495v = zzmmVar;
        this.f7496w = zzmoVar;
        this.f7497x = zzmnVar;
        this.f7498y = zzmjVar;
        this.f7499z = zzmfVar;
        this.f7485A = zzmgVar;
        this.f7486B = zzmhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7487n);
        C0029b.m215s(parcel, 2, this.f7488o, false);
        C0029b.m215s(parcel, 3, this.f7489p, false);
        C0029b.m202f(parcel, 4, this.f7490q, false);
        C0029b.m218v(parcel, 5, this.f7491r, i10, false);
        C0029b.m208l(parcel, 6, this.f7492s);
        C0029b.m213q(parcel, 7, this.f7493t, i10, false);
        C0029b.m213q(parcel, 8, this.f7494u, i10, false);
        C0029b.m213q(parcel, 9, this.f7495v, i10, false);
        C0029b.m213q(parcel, 10, this.f7496w, i10, false);
        C0029b.m213q(parcel, 11, this.f7497x, i10, false);
        C0029b.m213q(parcel, 12, this.f7498y, i10, false);
        C0029b.m213q(parcel, 13, this.f7499z, i10, false);
        C0029b.m213q(parcel, 14, this.f7485A, i10, false);
        C0029b.m213q(parcel, 15, this.f7486B, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final int m9191x() {
        return this.f7487n;
    }

    /* renamed from: y */
    public final int m9192y() {
        return this.f7492s;
    }

    /* renamed from: z */
    public final String m9193z() {
        return this.f7489p;
    }
}
