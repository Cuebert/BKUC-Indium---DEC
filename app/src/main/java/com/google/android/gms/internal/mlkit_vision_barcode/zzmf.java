package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5208gb;

/* loaded from: classes.dex */
public final class zzmf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmf> CREATOR = new C5208gb();

    /* renamed from: n */
    private final String f7435n;

    /* renamed from: o */
    private final String f7436o;

    /* renamed from: p */
    private final String f7437p;

    /* renamed from: q */
    private final String f7438q;

    /* renamed from: r */
    private final String f7439r;

    /* renamed from: s */
    private final zzme f7440s;

    /* renamed from: t */
    private final zzme f7441t;

    public zzmf(String str, String str2, String str3, String str4, String str5, zzme zzmeVar, zzme zzmeVar2) {
        this.f7435n = str;
        this.f7436o = str2;
        this.f7437p = str3;
        this.f7438q = str4;
        this.f7439r = str5;
        this.f7440s = zzmeVar;
        this.f7441t = zzmeVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7435n, false);
        C0029b.m215s(parcel, 2, this.f7436o, false);
        C0029b.m215s(parcel, 3, this.f7437p, false);
        C0029b.m215s(parcel, 4, this.f7438q, false);
        C0029b.m215s(parcel, 5, this.f7439r, false);
        C0029b.m213q(parcel, 6, this.f7440s, i10, false);
        C0029b.m213q(parcel, 7, this.f7441t, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
