package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5991m0;

/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C5991m0();

    /* renamed from: n */
    private final RootTelemetryConfiguration f6272n;

    /* renamed from: o */
    private final boolean f6273o;

    /* renamed from: p */
    private final boolean f6274p;

    /* renamed from: q */
    private final int[] f6275q;

    /* renamed from: r */
    private final int f6276r;

    /* renamed from: s */
    private final int[] f6277s;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f6272n = rootTelemetryConfiguration;
        this.f6273o = z10;
        this.f6274p = z11;
        this.f6275q = iArr;
        this.f6276r = i10;
        this.f6277s = iArr2;
    }

    /* renamed from: A */
    public boolean m7614A() {
        return this.f6273o;
    }

    /* renamed from: B */
    public boolean m7615B() {
        return this.f6274p;
    }

    /* renamed from: C */
    public final RootTelemetryConfiguration m7616C() {
        return this.f6272n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, this.f6272n, i10, false);
        C0029b.m199c(parcel, 2, m7614A());
        C0029b.m199c(parcel, 3, m7615B());
        C0029b.m209m(parcel, 4, m7618y(), false);
        C0029b.m208l(parcel, 5, m7617x());
        C0029b.m209m(parcel, 6, m7619z(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public int m7617x() {
        return this.f6276r;
    }

    /* renamed from: y */
    public int[] m7618y() {
        return this.f6275q;
    }

    /* renamed from: z */
    public int[] m7619z() {
        return this.f6277s;
    }
}
