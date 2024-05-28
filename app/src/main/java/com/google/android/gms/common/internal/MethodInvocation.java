package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C6008y;

/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C6008y();

    /* renamed from: n */
    private final int f6294n;

    /* renamed from: o */
    private final int f6295o;

    /* renamed from: p */
    private final int f6296p;

    /* renamed from: q */
    private final long f6297q;

    /* renamed from: r */
    private final long f6298r;

    /* renamed from: s */
    private final String f6299s;

    /* renamed from: t */
    private final String f6300t;

    /* renamed from: u */
    private final int f6301u;

    /* renamed from: v */
    private final int f6302v;

    @Deprecated
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6294n);
        C0029b.m208l(parcel, 2, this.f6295o);
        C0029b.m208l(parcel, 3, this.f6296p);
        C0029b.m211o(parcel, 4, this.f6297q);
        C0029b.m211o(parcel, 5, this.f6298r);
        C0029b.m215s(parcel, 6, this.f6299s, false);
        C0029b.m215s(parcel, 7, this.f6300t, false);
        C0029b.m208l(parcel, 8, this.f6301u);
        C0029b.m208l(parcel, 9, this.f6302v);
        C0029b.m198b(parcel, m197a);
    }

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f6294n = i10;
        this.f6295o = i11;
        this.f6296p = i12;
        this.f6297q = j10;
        this.f6298r = j11;
        this.f6299s = str;
        this.f6300t = str2;
        this.f6301u = i13;
        this.f6302v = i14;
    }
}
