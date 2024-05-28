package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* loaded from: classes.dex */
public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.f
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = BuildConfig.FLAVOR;
            }
            try {
                return ResidentKeyRequirement.m7863b(readString);
            } catch (ResidentKeyRequirement.C1452a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ResidentKeyRequirement[i10];
        }
    };

    /* renamed from: n */
    private final String f6582n;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$a */
    /* loaded from: classes.dex */
    public static class C1452a extends Exception {
        public C1452a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    ResidentKeyRequirement(String str) {
        this.f6582n = str;
    }

    /* renamed from: b */
    public static ResidentKeyRequirement m7863b(String str) throws C1452a {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.f6582n)) {
                return residentKeyRequirement;
            }
        }
        throw new C1452a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6582n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6582n);
    }
}
