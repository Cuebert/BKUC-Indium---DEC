package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC1391e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5980h;

/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C1395i();

    /* renamed from: n */
    final int f6390n;

    /* renamed from: o */
    final IBinder f6391o;

    /* renamed from: p */
    private final ConnectionResult f6392p;

    /* renamed from: q */
    private final boolean f6393q;

    /* renamed from: r */
    private final boolean f6394r;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f6390n = i10;
        this.f6391o = iBinder;
        this.f6392p = connectionResult;
        this.f6393q = z10;
        this.f6394r = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f6392p.equals(zavVar.f6392p) && C5980h.m21269b(m7728y(), zavVar.m7728y());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6390n);
        C0029b.m207k(parcel, 2, this.f6391o, false);
        C0029b.m213q(parcel, 3, this.f6392p, i10, false);
        C0029b.m199c(parcel, 4, this.f6393q);
        C0029b.m199c(parcel, 5, this.f6394r);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final ConnectionResult m7727x() {
        return this.f6392p;
    }

    /* renamed from: y */
    public final InterfaceC1391e m7728y() {
        IBinder iBinder = this.f6391o;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1391e.a.m7694l(iBinder);
    }
}
