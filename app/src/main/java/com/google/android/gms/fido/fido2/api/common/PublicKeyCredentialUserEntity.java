package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p161m3.C3943l;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C3943l();

    /* renamed from: n */
    private final byte[] f6574n;

    /* renamed from: o */
    private final String f6575o;

    /* renamed from: p */
    private final String f6576p;

    /* renamed from: q */
    private final String f6577q;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this.f6574n = (byte[]) C5984j.m21286j(bArr);
        this.f6575o = (String) C5984j.m21286j(str);
        this.f6576p = str2;
        this.f6577q = (String) C5984j.m21286j(str3);
    }

    /* renamed from: A */
    public String m7859A() {
        return this.f6575o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.f6574n, publicKeyCredentialUserEntity.f6574n) && C5980h.m21269b(this.f6575o, publicKeyCredentialUserEntity.f6575o) && C5980h.m21269b(this.f6576p, publicKeyCredentialUserEntity.f6576p) && C5980h.m21269b(this.f6577q, publicKeyCredentialUserEntity.f6577q);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6574n, this.f6575o, this.f6576p, this.f6577q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m202f(parcel, 2, m7862z(), false);
        C0029b.m215s(parcel, 3, m7859A(), false);
        C0029b.m215s(parcel, 4, m7861y(), false);
        C0029b.m215s(parcel, 5, m7860x(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public String m7860x() {
        return this.f6577q;
    }

    /* renamed from: y */
    public String m7861y() {
        return this.f6576p;
    }

    /* renamed from: z */
    public byte[] m7862z() {
        return this.f6574n;
    }
}
