package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5542s;

/* loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C5542s();

    /* renamed from: n */
    private final String f7545n;

    /* renamed from: o */
    private final String f7546o;

    /* renamed from: p */
    private final String f7547p;

    /* renamed from: q */
    private final String f7548q;

    /* renamed from: r */
    private final String f7549r;

    /* renamed from: s */
    private final zzf f7550s;

    /* renamed from: t */
    private final zzf f7551t;

    public zzg(String str, String str2, String str3, String str4, String str5, zzf zzfVar, zzf zzfVar2) {
        this.f7545n = str;
        this.f7546o = str2;
        this.f7547p = str3;
        this.f7548q = str4;
        this.f7549r = str5;
        this.f7550s = zzfVar;
        this.f7551t = zzfVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7545n, false);
        C0029b.m215s(parcel, 2, this.f7546o, false);
        C0029b.m215s(parcel, 3, this.f7547p, false);
        C0029b.m215s(parcel, 4, this.f7548q, false);
        C0029b.m215s(parcel, 5, this.f7549r, false);
        C0029b.m213q(parcel, 6, this.f7550s, i10, false);
        C0029b.m213q(parcel, 7, this.f7551t, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
