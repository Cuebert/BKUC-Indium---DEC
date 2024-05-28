package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p004a3.C0029b;
import p058e4.C3068d;
import p295x2.InterfaceC5518m;

/* loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC5518m {
    public static final Parcelable.Creator<zag> CREATOR = new C3068d();

    /* renamed from: n */
    private final List<String> f8879n;

    /* renamed from: o */
    private final String f8880o;

    public zag(List<String> list, String str) {
        this.f8879n = list;
        this.f8880o = str;
    }

    @Override // p295x2.InterfaceC5518m
    /* renamed from: q */
    public final Status mo7413q() {
        return this.f8880o != null ? Status.f6125t : Status.f6129x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m217u(parcel, 1, this.f8879n, false);
        C0029b.m215s(parcel, 2, this.f8880o, false);
        C0029b.m198b(parcel, m197a);
    }
}
