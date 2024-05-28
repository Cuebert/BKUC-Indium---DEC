package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new C1465l();

    /* renamed from: n */
    private final int f6594n;

    /* renamed from: o */
    private final short f6595o;

    /* renamed from: p */
    private final short f6596p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UvmEntry(int i10, short s10, short s11) {
        this.f6594n = i10;
        this.f6595o = s10;
        this.f6596p = s11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f6594n == uvmEntry.f6594n && this.f6595o == uvmEntry.f6595o && this.f6596p == uvmEntry.f6596p;
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(this.f6594n), Short.valueOf(this.f6595o), Short.valueOf(this.f6596p));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, m7872z());
        C0029b.m214r(parcel, 2, m7870x());
        C0029b.m214r(parcel, 3, m7871y());
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public short m7870x() {
        return this.f6595o;
    }

    /* renamed from: y */
    public short m7871y() {
        return this.f6596p;
    }

    /* renamed from: z */
    public int m7872z() {
        return this.f6594n;
    }
}
