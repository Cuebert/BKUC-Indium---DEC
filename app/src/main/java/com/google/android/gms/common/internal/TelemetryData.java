package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p004a3.C0029b;
import p321z2.C5996p;

/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C5996p();

    /* renamed from: n */
    private final int f6308n;

    /* renamed from: o */
    private List<MethodInvocation> f6309o;

    public TelemetryData(int i10, List<MethodInvocation> list) {
        this.f6308n = i10;
        this.f6309o = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6308n);
        C0029b.m219w(parcel, 2, this.f6309o, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final int m7626x() {
        return this.f6308n;
    }

    /* renamed from: y */
    public final List<MethodInvocation> m7627y() {
        return this.f6309o;
    }

    /* renamed from: z */
    public final void m7628z(MethodInvocation methodInvocation) {
        if (this.f6309o == null) {
            this.f6309o = new ArrayList();
        }
        this.f6309o.add(methodInvocation);
    }
}
