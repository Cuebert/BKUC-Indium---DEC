package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1391e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    /* renamed from: A */
    private final String f6280A;

    /* renamed from: n */
    final int f6281n;

    /* renamed from: o */
    final int f6282o;

    /* renamed from: p */
    final int f6283p;

    /* renamed from: q */
    String f6284q;

    /* renamed from: r */
    IBinder f6285r;

    /* renamed from: s */
    Scope[] f6286s;

    /* renamed from: t */
    Bundle f6287t;

    /* renamed from: u */
    Account f6288u;

    /* renamed from: v */
    Feature[] f6289v;

    /* renamed from: w */
    Feature[] f6290w;

    /* renamed from: x */
    final boolean f6291x;

    /* renamed from: y */
    final int f6292y;

    /* renamed from: z */
    boolean f6293z;
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C1405s();

    /* renamed from: B */
    static final Scope[] f6278B = new Scope[0];

    /* renamed from: C */
    static final Feature[] f6279C = new Feature[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f6278B : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f6279C : featureArr;
        featureArr2 = featureArr2 == null ? f6279C : featureArr2;
        this.f6281n = i10;
        this.f6282o = i11;
        this.f6283p = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f6284q = "com.google.android.gms";
        } else {
            this.f6284q = str;
        }
        if (i10 < 2) {
            this.f6288u = iBinder != null ? BinderC1387a.m7629n(InterfaceC1391e.a.m7694l(iBinder)) : null;
        } else {
            this.f6285r = iBinder;
            this.f6288u = account;
        }
        this.f6286s = scopeArr;
        this.f6287t = bundle;
        this.f6289v = featureArr;
        this.f6290w = featureArr2;
        this.f6291x = z10;
        this.f6292y = i13;
        this.f6293z = z11;
        this.f6280A = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C1405s.m7708a(this, parcel, i10);
    }

    /* renamed from: x */
    public final String m7620x() {
        return this.f6280A;
    }
}
