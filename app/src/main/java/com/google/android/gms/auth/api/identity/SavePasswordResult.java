package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p209q2.C4299g;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new C4299g();

    /* renamed from: n */
    private final PendingIntent f6037n;

    public SavePasswordResult(PendingIntent pendingIntent) {
        this.f6037n = (PendingIntent) C5984j.m21286j(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return C5980h.m21269b(this.f6037n, ((SavePasswordResult) obj).f6037n);
        }
        return false;
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6037n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, m7312x(), i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public PendingIntent m7312x() {
        return this.f6037n;
    }
}
