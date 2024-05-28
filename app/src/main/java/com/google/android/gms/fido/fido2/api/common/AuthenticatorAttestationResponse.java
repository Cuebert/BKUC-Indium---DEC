package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p246t3.AbstractC4661i1;
import p246t3.C4679n;
import p246t3.C4683o;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new C1469p();

    /* renamed from: n */
    private final byte[] f6501n;

    /* renamed from: o */
    private final byte[] f6502o;

    /* renamed from: p */
    private final byte[] f6503p;

    /* renamed from: q */
    private final String[] f6504q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f6501n = (byte[]) C5984j.m21286j(bArr);
        this.f6502o = (byte[]) C5984j.m21286j(bArr2);
        this.f6503p = (byte[]) C5984j.m21286j(bArr3);
        this.f6504q = (String[]) C5984j.m21286j(strArr);
    }

    /* renamed from: A */
    public String[] m7798A() {
        return this.f6504q;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1 A[Catch: JSONException -> 0x0248, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0248, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0014, B:8:0x0018, B:9:0x0021, B:10:0x0028, B:12:0x002d, B:14:0x003b, B:16:0x0048, B:17:0x0041, B:20:0x004b, B:22:0x0052, B:24:0x005a, B:26:0x006c, B:27:0x0074, B:29:0x0078, B:31:0x008a, B:33:0x00a8, B:34:0x00c0, B:39:0x00e6, B:45:0x01dd, B:47:0x01f1, B:50:0x0105, B:52:0x0117, B:57:0x012e, B:60:0x0150, B:62:0x0166, B:64:0x016c, B:65:0x0188, B:66:0x018d, B:67:0x018e, B:68:0x0193, B:73:0x019e, B:75:0x01ae, B:77:0x01bc, B:78:0x01d1, B:79:0x01d6, B:80:0x01d7, B:81:0x01dc, B:82:0x01fb, B:83:0x0200, B:85:0x0202, B:86:0x0209, B:87:0x020a, B:88:0x020f, B:92:0x0213, B:93:0x021a, B:95:0x021b, B:96:0x0222, B:98:0x0224, B:99:0x022b, B:100:0x022c, B:101:0x0233, B:103:0x0235, B:104:0x023c, B:108:0x0240, B:109:0x0247), top: B:2:0x0002, inners: #0, #1, #3 }] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject m7799B() {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.m7799B():org.json.JSONObject");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.f6501n, authenticatorAttestationResponse.f6501n) && Arrays.equals(this.f6502o, authenticatorAttestationResponse.f6502o) && Arrays.equals(this.f6503p, authenticatorAttestationResponse.f6503p);
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(Arrays.hashCode(this.f6501n)), Integer.valueOf(Arrays.hashCode(this.f6502o)), Integer.valueOf(Arrays.hashCode(this.f6503p)));
    }

    public String toString() {
        C4679n m18796a = C4683o.m18796a(this);
        AbstractC4661i1 m18777d = AbstractC4661i1.m18777d();
        byte[] bArr = this.f6501n;
        m18796a.m18793b("keyHandle", m18777d.m18778e(bArr, 0, bArr.length));
        AbstractC4661i1 m18777d2 = AbstractC4661i1.m18777d();
        byte[] bArr2 = this.f6502o;
        m18796a.m18793b("clientDataJSON", m18777d2.m18778e(bArr2, 0, bArr2.length));
        AbstractC4661i1 m18777d3 = AbstractC4661i1.m18777d();
        byte[] bArr3 = this.f6503p;
        m18796a.m18793b("attestationObject", m18777d3.m18778e(bArr3, 0, bArr3.length));
        m18796a.m18793b("transports", Arrays.toString(this.f6504q));
        return m18796a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m202f(parcel, 2, m7802z(), false);
        C0029b.m202f(parcel, 3, m7801y(), false);
        C0029b.m202f(parcel, 4, m7800x(), false);
        C0029b.m216t(parcel, 5, m7798A(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public byte[] m7800x() {
        return this.f6503p;
    }

    /* renamed from: y */
    public byte[] m7801y() {
        return this.f6502o;
    }

    @Deprecated
    /* renamed from: z */
    public byte[] m7802z() {
        return this.f6501n;
    }
}
