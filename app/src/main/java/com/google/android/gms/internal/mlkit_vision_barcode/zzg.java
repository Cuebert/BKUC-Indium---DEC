package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5429xb;

/* loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C5429xb();

    /* renamed from: n */
    public String f7382n;

    /* renamed from: o */
    public String f7383o;

    /* renamed from: p */
    public String f7384p;

    /* renamed from: q */
    public String f7385q;

    /* renamed from: r */
    public String f7386r;

    /* renamed from: s */
    public zzf f7387s;

    /* renamed from: t */
    public zzf f7388t;

    public zzg() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f7382n, false);
        C0029b.m215s(parcel, 3, this.f7383o, false);
        C0029b.m215s(parcel, 4, this.f7384p, false);
        C0029b.m215s(parcel, 5, this.f7385q, false);
        C0029b.m215s(parcel, 6, this.f7386r, false);
        C0029b.m213q(parcel, 7, this.f7387s, i10, false);
        C0029b.m213q(parcel, 8, this.f7388t, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzg(String str, String str2, String str3, String str4, String str5, zzf zzfVar, zzf zzfVar2) {
        this.f7382n = str;
        this.f7383o = str2;
        this.f7384p = str3;
        this.f7385q = str4;
        this.f7386r = str5;
        this.f7387s = zzfVar;
        this.f7388t = zzfVar2;
    }
}
