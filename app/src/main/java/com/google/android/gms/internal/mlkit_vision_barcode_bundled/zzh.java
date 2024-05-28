package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5543t;

/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C5543t();

    /* renamed from: n */
    private final zzl f7552n;

    /* renamed from: o */
    private final String f7553o;

    /* renamed from: p */
    private final String f7554p;

    /* renamed from: q */
    private final zzm[] f7555q;

    /* renamed from: r */
    private final zzj[] f7556r;

    /* renamed from: s */
    private final String[] f7557s;

    /* renamed from: t */
    private final zze[] f7558t;

    public zzh(zzl zzlVar, String str, String str2, zzm[] zzmVarArr, zzj[] zzjVarArr, String[] strArr, zze[] zzeVarArr) {
        this.f7552n = zzlVar;
        this.f7553o = str;
        this.f7554p = str2;
        this.f7555q = zzmVarArr;
        this.f7556r = zzjVarArr;
        this.f7557s = strArr;
        this.f7558t = zzeVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, this.f7552n, i10, false);
        C0029b.m215s(parcel, 2, this.f7553o, false);
        C0029b.m215s(parcel, 3, this.f7554p, false);
        C0029b.m218v(parcel, 4, this.f7555q, i10, false);
        C0029b.m218v(parcel, 5, this.f7556r, i10, false);
        C0029b.m216t(parcel, 6, this.f7557s, false);
        C0029b.m218v(parcel, 7, this.f7558t, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
