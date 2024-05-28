package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new C2269r();

    /* renamed from: n */
    public final String f8838n;

    /* renamed from: o */
    public final zzar f8839o;

    /* renamed from: p */
    public final String f8840p;

    /* renamed from: q */
    public final long f8841q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(zzat zzatVar, long j10) {
        C5984j.m21286j(zzatVar);
        this.f8838n = zzatVar.f8838n;
        this.f8839o = zzatVar.f8839o;
        this.f8840p = zzatVar.f8840p;
        this.f8841q = j10;
    }

    public final String toString() {
        String str = this.f8840p;
        String str2 = this.f8838n;
        String valueOf = String.valueOf(this.f8839o);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2269r.m10225a(this, parcel, i10);
    }

    public zzat(String str, zzar zzarVar, String str2, long j10) {
        this.f8838n = str;
        this.f8839o = zzarVar;
        this.f8840p = str2;
        this.f8841q = j10;
    }
}
