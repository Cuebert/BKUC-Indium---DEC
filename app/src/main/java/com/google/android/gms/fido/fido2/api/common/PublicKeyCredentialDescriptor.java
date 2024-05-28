package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;
import java.util.List;
import p004a3.C0029b;
import p161m3.C3940i;
import p246t3.AbstractC4644e0;
import p246t3.C4722x2;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    /* renamed from: n */
    private final PublicKeyCredentialType f6563n;

    /* renamed from: o */
    private final byte[] f6564o;

    /* renamed from: p */
    private final List f6565p;

    /* renamed from: q */
    private static final AbstractC4644e0 f6562q = AbstractC4644e0.m18751s(C4722x2.f18528a, C4722x2.f18529b);
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new C3940i();

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List<Transport> list) {
        C5984j.m21286j(str);
        try {
            this.f6563n = PublicKeyCredentialType.m7858b(str);
            this.f6564o = (byte[]) C5984j.m21286j(bArr);
            this.f6565p = list;
        } catch (PublicKeyCredentialType.C1451a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f6563n.equals(publicKeyCredentialDescriptor.f6563n) || !Arrays.equals(this.f6564o, publicKeyCredentialDescriptor.f6564o)) {
            return false;
        }
        List list2 = this.f6565p;
        if (list2 == null && publicKeyCredentialDescriptor.f6565p == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.f6565p) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f6565p.containsAll(this.f6565p);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6563n, Integer.valueOf(Arrays.hashCode(this.f6564o)), this.f6565p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, m7852z(), false);
        C0029b.m202f(parcel, 3, m7850x(), false);
        C0029b.m219w(parcel, 4, m7851y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public byte[] m7850x() {
        return this.f6564o;
    }

    /* renamed from: y */
    public List<Transport> m7851y() {
        return this.f6565p;
    }

    /* renamed from: z */
    public String m7852z() {
        return this.f6563n.toString();
    }
}
