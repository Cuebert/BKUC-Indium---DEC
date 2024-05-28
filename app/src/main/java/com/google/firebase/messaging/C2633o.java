package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.firebase.messaging.o */
/* loaded from: classes.dex */
public final class C2633o implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                bundle = C0028a.m170a(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
