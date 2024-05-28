package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5442yb;

/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C5442yb();

    /* renamed from: n */
    public zzl f7389n;

    /* renamed from: o */
    public String f7390o;

    /* renamed from: p */
    public String f7391p;

    /* renamed from: q */
    public zzm[] f7392q;

    /* renamed from: r */
    public zzj[] f7393r;

    /* renamed from: s */
    public String[] f7394s;

    /* renamed from: t */
    public zze[] f7395t;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 2, this.f7389n, i10, false);
        C0029b.m215s(parcel, 3, this.f7390o, false);
        C0029b.m215s(parcel, 4, this.f7391p, false);
        C0029b.m218v(parcel, 5, this.f7392q, i10, false);
        C0029b.m218v(parcel, 6, this.f7393r, i10, false);
        C0029b.m216t(parcel, 7, this.f7394s, false);
        C0029b.m218v(parcel, 8, this.f7395t, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzh(zzl zzlVar, String str, String str2, zzm[] zzmVarArr, zzj[] zzjVarArr, String[] strArr, zze[] zzeVarArr) {
        this.f7389n = zzlVar;
        this.f7390o = str;
        this.f7391p = str2;
        this.f7392q = zzmVarArr;
        this.f7393r = zzjVarArr;
        this.f7394s = strArr;
        this.f7395t = zzeVarArr;
    }
}
