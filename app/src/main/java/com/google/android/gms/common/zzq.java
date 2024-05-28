package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C1421t();

    /* renamed from: n */
    private final boolean f6423n;

    /* renamed from: o */
    private final String f6424o;

    /* renamed from: p */
    private final int f6425p;

    /* renamed from: q */
    private final int f6426q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(boolean z10, String str, int i10, int i11) {
        this.f6423n = z10;
        this.f6424o = str;
        this.f6425p = C1425x.m7749a(i10) - 1;
        this.f6426q = C1385h.m7613a(i11) - 1;
    }

    /* renamed from: A */
    public final int m7750A() {
        return C1425x.m7749a(this.f6425p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, this.f6423n);
        C0029b.m215s(parcel, 2, this.f6424o, false);
        C0029b.m208l(parcel, 3, this.f6425p);
        C0029b.m208l(parcel, 4, this.f6426q);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final String m7751x() {
        return this.f6424o;
    }

    /* renamed from: y */
    public final boolean m7752y() {
        return this.f6423n;
    }

    /* renamed from: z */
    public final int m7753z() {
        return C1385h.m7613a(this.f6426q);
    }
}
