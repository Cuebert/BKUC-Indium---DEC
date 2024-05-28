package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3951t;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new C3951t();

    /* renamed from: n */
    private final String f6530n;

    public FidoAppIdExtension(String str) {
        this.f6530n = (String) C5984j.m21286j(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f6530n.equals(((FidoAppIdExtension) obj).f6530n);
        }
        return false;
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6530n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, m7819x(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7819x() {
        return this.f6530n;
    }
}
