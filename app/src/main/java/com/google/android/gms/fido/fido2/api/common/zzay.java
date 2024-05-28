package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p161m3.C3945n;

/* loaded from: classes.dex */
public enum zzay implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<zzay> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return zzay.m7874b(parcel.readString());
            } catch (C3945n e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new zzay[i10];
        }
    };

    /* renamed from: n */
    private final String f6605n;

    zzay(String str) {
        this.f6605n = str;
    }

    /* renamed from: b */
    public static zzay m7874b(String str) throws C3945n {
        for (zzay zzayVar : values()) {
            if (str.equals(zzayVar.f6605n)) {
                return zzayVar;
            }
        }
        throw new C3945n(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6605n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6605n);
    }
}
