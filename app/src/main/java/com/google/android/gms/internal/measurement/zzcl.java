package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C1693n1();

    /* renamed from: n */
    public final long f7357n;

    /* renamed from: o */
    public final long f7358o;

    /* renamed from: p */
    public final boolean f7359p;

    /* renamed from: q */
    public final String f7360q;

    /* renamed from: r */
    public final String f7361r;

    /* renamed from: s */
    public final String f7362s;

    /* renamed from: t */
    public final Bundle f7363t;

    /* renamed from: u */
    public final String f7364u;

    public zzcl(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f7357n = j10;
        this.f7358o = j11;
        this.f7359p = z10;
        this.f7360q = str;
        this.f7361r = str2;
        this.f7362s = str3;
        this.f7363t = bundle;
        this.f7364u = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m211o(parcel, 1, this.f7357n);
        C0029b.m211o(parcel, 2, this.f7358o);
        C0029b.m199c(parcel, 3, this.f7359p);
        C0029b.m215s(parcel, 4, this.f7360q, false);
        C0029b.m215s(parcel, 5, this.f7361r, false);
        C0029b.m215s(parcel, 6, this.f7362s, false);
        C0029b.m201e(parcel, 7, this.f7363t, false);
        C0029b.m215s(parcel, 8, this.f7364u, false);
        C0029b.m198b(parcel, m197a);
    }
}
