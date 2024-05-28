package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;

/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C1340a();

    /* renamed from: n */
    final int f6096n;

    /* renamed from: o */
    private int f6097o;

    /* renamed from: p */
    private Bundle f6098p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f6096n = i10;
        this.f6097o = i11;
        this.f6098p = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6096n);
        C0029b.m208l(parcel, 2, m7370x());
        C0029b.m201e(parcel, 3, this.f6098p, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public int m7370x() {
        return this.f6097o;
    }
}
