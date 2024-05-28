package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C2365d();

    /* renamed from: n */
    final int f8881n;

    /* renamed from: o */
    final zat f8882o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zai(int i10, zat zatVar) {
        this.f8881n = i10;
        this.f8882o = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f8881n);
        C0029b.m213q(parcel, 2, this.f8882o, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
