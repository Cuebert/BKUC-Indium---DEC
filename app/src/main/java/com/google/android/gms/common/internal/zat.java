package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C1394h();

    /* renamed from: n */
    final int f6386n;

    /* renamed from: o */
    private final Account f6387o;

    /* renamed from: p */
    private final int f6388p;

    /* renamed from: q */
    private final GoogleSignInAccount f6389q;

    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f6386n = i10;
        this.f6387o = account;
        this.f6388p = i11;
        this.f6389q = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6386n);
        C0029b.m213q(parcel, 2, this.f6387o, i10, false);
        C0029b.m208l(parcel, 3, this.f6388p);
        C0029b.m213q(parcel, 4, this.f6389q, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    public zat(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
