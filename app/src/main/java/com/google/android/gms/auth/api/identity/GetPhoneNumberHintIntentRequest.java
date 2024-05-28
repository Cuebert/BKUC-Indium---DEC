package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p209q2.C4298f;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new C1324b();

    /* renamed from: n */
    private final int f6018n;

    /* renamed from: com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$a */
    /* loaded from: classes.dex */
    public static final class C1320a {
        /* synthetic */ C1320a(C4298f c4298f) {
        }

        /* renamed from: a */
        public GetPhoneNumberHintIntentRequest m7291a() {
            return new GetPhoneNumberHintIntentRequest(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetPhoneNumberHintIntentRequest(int i10) {
        this.f6018n = i10;
    }

    /* renamed from: x */
    public static C1320a m7290x() {
        return new C1320a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return C5980h.m21269b(Integer.valueOf(this.f6018n), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f6018n));
        }
        return false;
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(this.f6018n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f6018n);
        C0029b.m198b(parcel, m197a);
    }
}
