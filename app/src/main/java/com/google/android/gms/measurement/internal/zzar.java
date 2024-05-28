package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zzar extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzar> CREATOR = new C2258q();

    /* renamed from: n */
    private final Bundle f8837n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(Bundle bundle) {
        this.f8837n = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final Double m10405A(String str) {
        return Double.valueOf(this.f8837n.getDouble("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final Long m10406B(String str) {
        return Long.valueOf(this.f8837n.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final Object m10407C(String str) {
        return this.f8837n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final String m10408D(String str) {
        return this.f8837n.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C2247p(this);
    }

    public final String toString() {
        return this.f8837n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m201e(parcel, 2, m10410z(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final int m10409x() {
        return this.f8837n.size();
    }

    /* renamed from: z */
    public final Bundle m10410z() {
        return new Bundle(this.f8837n);
    }
}
