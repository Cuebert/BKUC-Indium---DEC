package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

/* loaded from: classes.dex */
public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.e
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return PublicKeyCredentialType.m7858b(parcel.readString());
            } catch (PublicKeyCredentialType.C1451a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new PublicKeyCredentialType[i10];
        }
    };

    /* renamed from: n */
    private final String f6573n = "public-key";

    /* renamed from: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$a */
    /* loaded from: classes.dex */
    public static class C1451a extends Exception {
        public C1451a(String str) {
            super(str);
        }
    }

    PublicKeyCredentialType(String str) {
    }

    /* renamed from: b */
    public static PublicKeyCredentialType m7858b(String str) throws C1451a {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.f6573n)) {
                return publicKeyCredentialType;
            }
        }
        throw new C1451a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6573n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6573n);
    }
}
