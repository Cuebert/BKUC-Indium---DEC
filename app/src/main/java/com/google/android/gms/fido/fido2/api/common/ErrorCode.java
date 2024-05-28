package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.Locale;

/* loaded from: classes.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.u
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ErrorCode.m7817c(parcel.readInt());
            } catch (ErrorCode.C1449a e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ErrorCode[i10];
        }
    };

    /* renamed from: n */
    private final int f6529n;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.ErrorCode$a */
    /* loaded from: classes.dex */
    public static class C1449a extends Exception {
        public C1449a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
        }
    }

    ErrorCode(int i10) {
        this.f6529n = i10;
    }

    /* renamed from: c */
    public static ErrorCode m7817c(int i10) throws C1449a {
        for (ErrorCode errorCode : values()) {
            if (i10 == errorCode.f6529n) {
                return errorCode;
            }
        }
        throw new C1449a(i10);
    }

    /* renamed from: b */
    public int m7818b() {
        return this.f6529n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6529n);
    }
}
