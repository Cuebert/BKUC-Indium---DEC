package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5989l0;

/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C5989l0();

    /* renamed from: n */
    private final int f6303n;

    /* renamed from: o */
    private final boolean f6304o;

    /* renamed from: p */
    private final boolean f6305p;

    /* renamed from: q */
    private final int f6306q;

    /* renamed from: r */
    private final int f6307r;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f6303n = i10;
        this.f6304o = z10;
        this.f6305p = z11;
        this.f6306q = i11;
        this.f6307r = i12;
    }

    /* renamed from: A */
    public boolean m7621A() {
        return this.f6305p;
    }

    /* renamed from: B */
    public int m7622B() {
        return this.f6303n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, m7622B());
        C0029b.m199c(parcel, 2, m7625z());
        C0029b.m199c(parcel, 3, m7621A());
        C0029b.m208l(parcel, 4, m7623x());
        C0029b.m208l(parcel, 5, m7624y());
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public int m7623x() {
        return this.f6306q;
    }

    /* renamed from: y */
    public int m7624y() {
        return this.f6307r;
    }

    /* renamed from: z */
    public boolean m7625z() {
        return this.f6304o;
    }
}
