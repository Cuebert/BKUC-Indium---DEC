package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;

/* loaded from: classes.dex */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.b
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Attachment.m7779b(parcel.readString());
            } catch (Attachment.C1444a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new Attachment[i10];
        }
    };

    /* renamed from: n */
    private final String f6465n;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.Attachment$a */
    /* loaded from: classes.dex */
    public static class C1444a extends Exception {
        public C1444a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    Attachment(String str) {
        this.f6465n = str;
    }

    /* renamed from: b */
    public static Attachment m7779b(String str) throws C1444a {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.f6465n)) {
                return attachment;
            }
        }
        throw new C1444a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6465n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6465n);
    }
}
