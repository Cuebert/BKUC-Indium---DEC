package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p161m3.C3942k;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new C3942k();

    /* renamed from: n */
    private final String f6568n;

    /* renamed from: o */
    private final String f6569o;

    /* renamed from: p */
    private final String f6570p;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        this.f6568n = (String) C5984j.m21286j(str);
        this.f6569o = (String) C5984j.m21286j(str2);
        this.f6570p = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return C5980h.m21269b(this.f6568n, publicKeyCredentialRpEntity.f6568n) && C5980h.m21269b(this.f6569o, publicKeyCredentialRpEntity.f6569o) && C5980h.m21269b(this.f6570p, publicKeyCredentialRpEntity.f6570p);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6568n, this.f6569o, this.f6570p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, m7856y(), false);
        C0029b.m215s(parcel, 3, m7857z(), false);
        C0029b.m215s(parcel, 4, m7855x(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7855x() {
        return this.f6570p;
    }

    /* renamed from: y */
    public String m7856y() {
        return this.f6568n;
    }

    /* renamed from: z */
    public String m7857z() {
        return this.f6569o;
    }
}
