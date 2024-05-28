package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5221hb;

/* loaded from: classes.dex */
public final class zzmg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmg> CREATOR = new C5221hb();

    /* renamed from: n */
    private final zzmk f7442n;

    /* renamed from: o */
    private final String f7443o;

    /* renamed from: p */
    private final String f7444p;

    /* renamed from: q */
    private final zzml[] f7445q;

    /* renamed from: r */
    private final zzmi[] f7446r;

    /* renamed from: s */
    private final String[] f7447s;

    /* renamed from: t */
    private final zzmd[] f7448t;

    public zzmg(zzmk zzmkVar, String str, String str2, zzml[] zzmlVarArr, zzmi[] zzmiVarArr, String[] strArr, zzmd[] zzmdVarArr) {
        this.f7442n = zzmkVar;
        this.f7443o = str;
        this.f7444p = str2;
        this.f7445q = zzmlVarArr;
        this.f7446r = zzmiVarArr;
        this.f7447s = strArr;
        this.f7448t = zzmdVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, this.f7442n, i10, false);
        C0029b.m215s(parcel, 2, this.f7443o, false);
        C0029b.m215s(parcel, 3, this.f7444p, false);
        C0029b.m218v(parcel, 4, this.f7445q, i10, false);
        C0029b.m218v(parcel, 5, this.f7446r, i10, false);
        C0029b.m216t(parcel, 6, this.f7447s, false);
        C0029b.m218v(parcel, 7, this.f7448t, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
