package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C2104c();

    /* renamed from: n */
    public String f8826n;

    /* renamed from: o */
    public String f8827o;

    /* renamed from: p */
    public zzkv f8828p;

    /* renamed from: q */
    public long f8829q;

    /* renamed from: r */
    public boolean f8830r;

    /* renamed from: s */
    public String f8831s;

    /* renamed from: t */
    public final zzat f8832t;

    /* renamed from: u */
    public long f8833u;

    /* renamed from: v */
    public zzat f8834v;

    /* renamed from: w */
    public final long f8835w;

    /* renamed from: x */
    public final zzat f8836x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzab zzabVar) {
        C5984j.m21286j(zzabVar);
        this.f8826n = zzabVar.f8826n;
        this.f8827o = zzabVar.f8827o;
        this.f8828p = zzabVar.f8828p;
        this.f8829q = zzabVar.f8829q;
        this.f8830r = zzabVar.f8830r;
        this.f8831s = zzabVar.f8831s;
        this.f8832t = zzabVar.f8832t;
        this.f8833u = zzabVar.f8833u;
        this.f8834v = zzabVar.f8834v;
        this.f8835w = zzabVar.f8835w;
        this.f8836x = zzabVar.f8836x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f8826n, false);
        C0029b.m215s(parcel, 3, this.f8827o, false);
        C0029b.m213q(parcel, 4, this.f8828p, i10, false);
        C0029b.m211o(parcel, 5, this.f8829q);
        C0029b.m199c(parcel, 6, this.f8830r);
        C0029b.m215s(parcel, 7, this.f8831s, false);
        C0029b.m213q(parcel, 8, this.f8832t, i10, false);
        C0029b.m211o(parcel, 9, this.f8833u);
        C0029b.m213q(parcel, 10, this.f8834v, i10, false);
        C0029b.m211o(parcel, 11, this.f8835w);
        C0029b.m213q(parcel, 12, this.f8836x, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(String str, String str2, zzkv zzkvVar, long j10, boolean z10, String str3, zzat zzatVar, long j11, zzat zzatVar2, long j12, zzat zzatVar3) {
        this.f8826n = str;
        this.f8827o = str2;
        this.f8828p = zzkvVar;
        this.f8829q = j10;
        this.f8830r = z10;
        this.f8831s = str3;
        this.f8832t = zzatVar;
        this.f8833u = j11;
        this.f8834v = zzatVar2;
        this.f8835w = j12;
        this.f8836x = zzatVar3;
    }
}
