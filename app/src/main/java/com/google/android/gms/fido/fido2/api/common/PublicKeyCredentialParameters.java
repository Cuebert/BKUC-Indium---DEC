package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import p004a3.C0029b;
import p161m3.C3941j;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new C3941j();

    /* renamed from: n */
    private final PublicKeyCredentialType f6566n;

    /* renamed from: o */
    private final COSEAlgorithmIdentifier f6567o;

    public PublicKeyCredentialParameters(String str, int i10) {
        C5984j.m21286j(str);
        try {
            this.f6566n = PublicKeyCredentialType.m7858b(str);
            C5984j.m21286j(Integer.valueOf(i10));
            try {
                this.f6567o = COSEAlgorithmIdentifier.m7815a(i10);
            } catch (COSEAlgorithmIdentifier.C1448a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (PublicKeyCredentialType.C1451a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f6566n.equals(publicKeyCredentialParameters.f6566n) && this.f6567o.equals(publicKeyCredentialParameters.f6567o);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6566n, this.f6567o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, m7854y(), false);
        C0029b.m210n(parcel, 3, Integer.valueOf(m7853x()), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public int m7853x() {
        return this.f6567o.m7816b();
    }

    /* renamed from: y */
    public String m7854y() {
        return this.f6566n.toString();
    }
}
