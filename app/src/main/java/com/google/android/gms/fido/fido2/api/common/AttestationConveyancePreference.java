package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;

/* loaded from: classes.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.k
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.m7780b(parcel.readString());
            } catch (AttestationConveyancePreference.C1445a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new AttestationConveyancePreference[i10];
        }
    };

    /* renamed from: n */
    private final String f6470n;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$a */
    /* loaded from: classes.dex */
    public static class C1445a extends Exception {
        public C1445a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    AttestationConveyancePreference(String str) {
        this.f6470n = str;
    }

    /* renamed from: b */
    public static AttestationConveyancePreference m7780b(String str) throws C1445a {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.f6470n)) {
                return attestationConveyancePreference;
            }
        }
        throw new C1445a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6470n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6470n);
    }
}
