package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5535l;

/* loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new C5535l();

    /* renamed from: n */
    private final int f7530n;

    /* renamed from: o */
    private final int f7531o;

    /* renamed from: p */
    private final int f7532p;

    /* renamed from: q */
    private final int f7533q;

    /* renamed from: r */
    private final long f7534r;

    public zzak(int i10, int i11, int i12, int i13, long j10) {
        this.f7530n = i10;
        this.f7531o = i11;
        this.f7532p = i12;
        this.f7533q = i13;
        this.f7534r = j10;
    }

    /* renamed from: A */
    public final int m9194A() {
        return this.f7531o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7530n);
        C0029b.m208l(parcel, 2, this.f7531o);
        C0029b.m208l(parcel, 3, this.f7532p);
        C0029b.m208l(parcel, 4, this.f7533q);
        C0029b.m211o(parcel, 5, this.f7534r);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final int m9195x() {
        return this.f7532p;
    }

    /* renamed from: y */
    public final int m9196y() {
        return this.f7530n;
    }

    /* renamed from: z */
    public final int m9197z() {
        return this.f7533q;
    }
}
