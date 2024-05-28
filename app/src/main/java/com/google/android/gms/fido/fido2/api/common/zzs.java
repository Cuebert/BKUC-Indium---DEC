package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import p004a3.C0029b;
import p161m3.C3949r;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C3949r();

    /* renamed from: n */
    private final List f6614n;

    public zzs(List list) {
        this.f6614n = (List) C5984j.m21286j(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f6614n.containsAll(zzsVar.f6614n) && zzsVar.f6614n.containsAll(this.f6614n);
    }

    public final int hashCode() {
        return C5980h.m21270c(new HashSet(this.f6614n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m219w(parcel, 1, this.f6614n, false);
        C0029b.m198b(parcel, m197a);
    }
}
