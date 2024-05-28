package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p282w2.C5111i;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C5111i();

    /* renamed from: n */
    private final String f6113n;

    /* renamed from: o */
    @Deprecated
    private final int f6114o;

    /* renamed from: p */
    private final long f6115p;

    public Feature(String str, int i10, long j10) {
        this.f6113n = str;
        this.f6114o = i10;
        this.f6115p = j10;
    }

    public Feature(String str, long j10) {
        this.f6113n = str;
        this.f6115p = j10;
        this.f6114o = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m7383x() != null && m7383x().equals(feature.m7383x())) || (m7383x() == null && feature.m7383x() == null)) && m7384y() == feature.m7384y()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C5980h.m21270c(m7383x(), Long.valueOf(m7384y()));
    }

    public final String toString() {
        C5980h.a m21271d = C5980h.m21271d(this);
        m21271d.m21272a("name", m7383x());
        m21271d.m21272a("version", Long.valueOf(m7384y()));
        return m21271d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7383x(), false);
        C0029b.m208l(parcel, 2, this.f6114o);
        C0029b.m211o(parcel, 3, m7384y());
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7383x() {
        return this.f6113n;
    }

    /* renamed from: y */
    public long m7384y() {
        long j10 = this.f6115p;
        return j10 == -1 ? this.f6114o : j10;
    }
}
