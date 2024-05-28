package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;

/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C1420s();

    /* renamed from: n */
    private final String f6417n;

    /* renamed from: o */
    private final boolean f6418o;

    /* renamed from: p */
    private final boolean f6419p;

    /* renamed from: q */
    private final Context f6420q;

    /* renamed from: r */
    private final boolean f6421r;

    /* renamed from: s */
    private final boolean f6422s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f6417n = str;
        this.f6418o = z10;
        this.f6419p = z11;
        this.f6420q = (Context) BinderC3517b.m15329n(InterfaceC3516a.a.m15327l(iBinder));
        this.f6421r = z12;
        this.f6422s = z13;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [i3.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f6417n, false);
        C0029b.m199c(parcel, 2, this.f6418o);
        C0029b.m199c(parcel, 3, this.f6419p);
        C0029b.m207k(parcel, 4, BinderC3517b.m15328J0(this.f6420q), false);
        C0029b.m199c(parcel, 5, this.f6421r);
        C0029b.m199c(parcel, 6, this.f6422s);
        C0029b.m198b(parcel, m197a);
    }
}
