package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3938g;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C3938g();

    /* renamed from: n */
    private final String f6599n;

    public zzag(String str) {
        this.f6599n = (String) C5984j.m21286j(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f6599n.equals(((zzag) obj).f6599n);
        }
        return false;
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f6599n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f6599n, false);
        C0029b.m198b(parcel, m197a);
    }
}
