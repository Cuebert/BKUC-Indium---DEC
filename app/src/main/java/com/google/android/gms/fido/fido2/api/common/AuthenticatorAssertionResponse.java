package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p070f3.C3129c;
import p246t3.AbstractC4661i1;
import p246t3.C4679n;
import p246t3.C4683o;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new C1468o();

    /* renamed from: n */
    private final byte[] f6496n;

    /* renamed from: o */
    private final byte[] f6497o;

    /* renamed from: p */
    private final byte[] f6498p;

    /* renamed from: q */
    private final byte[] f6499q;

    /* renamed from: r */
    private final byte[] f6500r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f6496n = (byte[]) C5984j.m21286j(bArr);
        this.f6497o = (byte[]) C5984j.m21286j(bArr2);
        this.f6498p = (byte[]) C5984j.m21286j(bArr3);
        this.f6499q = (byte[]) C5984j.m21286j(bArr4);
        this.f6500r = bArr5;
    }

    /* renamed from: A */
    public byte[] m7792A() {
        return this.f6499q;
    }

    /* renamed from: B */
    public byte[] m7793B() {
        return this.f6500r;
    }

    /* renamed from: C */
    public final JSONObject m7794C() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", C3129c.m13780a(this.f6497o));
            jSONObject.put("authenticatorData", C3129c.m13780a(this.f6498p));
            jSONObject.put("signature", C3129c.m13780a(this.f6499q));
            byte[] bArr = this.f6500r;
            if (bArr != null) {
                jSONObject.put("userHandle", C3129c.m13780a(bArr));
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.f6496n, authenticatorAssertionResponse.f6496n) && Arrays.equals(this.f6497o, authenticatorAssertionResponse.f6497o) && Arrays.equals(this.f6498p, authenticatorAssertionResponse.f6498p) && Arrays.equals(this.f6499q, authenticatorAssertionResponse.f6499q) && Arrays.equals(this.f6500r, authenticatorAssertionResponse.f6500r);
    }

    public int hashCode() {
        return C5980h.m21270c(Integer.valueOf(Arrays.hashCode(this.f6496n)), Integer.valueOf(Arrays.hashCode(this.f6497o)), Integer.valueOf(Arrays.hashCode(this.f6498p)), Integer.valueOf(Arrays.hashCode(this.f6499q)), Integer.valueOf(Arrays.hashCode(this.f6500r)));
    }

    public String toString() {
        C4679n m18796a = C4683o.m18796a(this);
        AbstractC4661i1 m18777d = AbstractC4661i1.m18777d();
        byte[] bArr = this.f6496n;
        m18796a.m18793b("keyHandle", m18777d.m18778e(bArr, 0, bArr.length));
        AbstractC4661i1 m18777d2 = AbstractC4661i1.m18777d();
        byte[] bArr2 = this.f6497o;
        m18796a.m18793b("clientDataJSON", m18777d2.m18778e(bArr2, 0, bArr2.length));
        AbstractC4661i1 m18777d3 = AbstractC4661i1.m18777d();
        byte[] bArr3 = this.f6498p;
        m18796a.m18793b("authenticatorData", m18777d3.m18778e(bArr3, 0, bArr3.length));
        AbstractC4661i1 m18777d4 = AbstractC4661i1.m18777d();
        byte[] bArr4 = this.f6499q;
        m18796a.m18793b("signature", m18777d4.m18778e(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f6500r;
        if (bArr5 != null) {
            m18796a.m18793b("userHandle", AbstractC4661i1.m18777d().m18778e(bArr5, 0, bArr5.length));
        }
        return m18796a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m202f(parcel, 2, m7797z(), false);
        C0029b.m202f(parcel, 3, m7796y(), false);
        C0029b.m202f(parcel, 4, m7795x(), false);
        C0029b.m202f(parcel, 5, m7792A(), false);
        C0029b.m202f(parcel, 6, m7793B(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public byte[] m7795x() {
        return this.f6498p;
    }

    /* renamed from: y */
    public byte[] m7796y() {
        return this.f6497o;
    }

    @Deprecated
    /* renamed from: z */
    public byte[] m7797z() {
        return this.f6496n;
    }
}
