package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p209q2.C4296d;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C4296d();

    /* renamed from: n */
    private final PendingIntent f6017n;

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f6017n = (PendingIntent) C5984j.m21286j(pendingIntent);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, m7289x(), i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public PendingIntent m7289x() {
        return this.f6017n;
    }
}
