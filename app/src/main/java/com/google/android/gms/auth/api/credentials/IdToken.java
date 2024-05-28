package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p197p2.C4221h;
import p321z2.C5980h;
import p321z2.C5984j;

@Deprecated
/* loaded from: classes.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C4221h();

    /* renamed from: n */
    private final String f5975n;

    /* renamed from: o */
    private final String f5976o;

    public IdToken(String str, String str2) {
        C5984j.m21278b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C5984j.m21278b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f5975n = str;
        this.f5976o = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C5980h.m21269b(this.f5975n, idToken.f5975n) && C5980h.m21269b(this.f5976o, idToken.f5976o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7239x(), false);
        C0029b.m215s(parcel, 2, m7240y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7239x() {
        return this.f5975n;
    }

    /* renamed from: y */
    public String m7240y() {
        return this.f5976o;
    }
}
