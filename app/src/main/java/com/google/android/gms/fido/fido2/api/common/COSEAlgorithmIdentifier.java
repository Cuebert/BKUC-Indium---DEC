package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p161m3.EnumC3932a;
import p161m3.EnumC3933b;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new C1472s();

    /* renamed from: n */
    private final InterfaceC1454a f6515n;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$a */
    /* loaded from: classes.dex */
    public static class C1448a extends Exception {
        public C1448a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    COSEAlgorithmIdentifier(InterfaceC1454a interfaceC1454a) {
        this.f6515n = (InterfaceC1454a) C5984j.m21286j(interfaceC1454a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static COSEAlgorithmIdentifier m7815a(int i10) throws C1448a {
        EnumC3933b enumC3933b;
        if (i10 == EnumC3933b.LEGACY_RS1.mo7873b()) {
            enumC3933b = EnumC3933b.RS1;
        } else {
            EnumC3933b[] values = EnumC3933b.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    EnumC3933b enumC3933b2 = values[i11];
                    if (enumC3933b2.mo7873b() == i10) {
                        enumC3933b = enumC3933b2;
                        break;
                    }
                    i11++;
                } else {
                    for (EnumC3933b enumC3933b3 : EnumC3932a.values()) {
                        if (enumC3933b3.mo7873b() == i10) {
                            enumC3933b = enumC3933b3;
                        }
                    }
                    throw new C1448a(i10);
                }
            }
        }
        return new COSEAlgorithmIdentifier(enumC3933b);
    }

    /* renamed from: b */
    public int m7816b() {
        return this.f6515n.mo7873b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f6515n.mo7873b() == ((COSEAlgorithmIdentifier) obj).f6515n.mo7873b();
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6515n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6515n.mo7873b());
    }
}
