package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p295x2.InterfaceC5518m;

/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC5518m {
    public static final Parcelable.Creator<zaa> CREATOR = new C2363b();

    /* renamed from: n */
    final int f8876n;

    /* renamed from: o */
    private int f8877o;

    /* renamed from: p */
    private Intent f8878p;

    public zaa() {
        this(2, 0, null);
    }

    @Override // p295x2.InterfaceC5518m
    /* renamed from: q */
    public final Status mo7413q() {
        return this.f8877o == 0 ? Status.f6125t : Status.f6129x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f8876n);
        C0029b.m208l(parcel, 2, this.f8877o);
        C0029b.m213q(parcel, 3, this.f8878p, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaa(int i10, int i11, Intent intent) {
        this.f8876n = i10;
        this.f8877o = i11;
        this.f8878p = intent;
    }
}
