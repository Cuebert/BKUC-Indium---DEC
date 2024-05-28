package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p004a3.C0029b;
import p004a3.C0030c;
import p321z2.C5980h;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new C1457d();

    /* renamed from: n */
    private final String f6532n;

    /* renamed from: o */
    private final String f6533o;

    /* renamed from: p */
    private final byte[] f6534p;

    /* renamed from: q */
    private final AuthenticatorAttestationResponse f6535q;

    /* renamed from: r */
    private final AuthenticatorAssertionResponse f6536r;

    /* renamed from: s */
    private final AuthenticatorErrorResponse f6537s;

    /* renamed from: t */
    private final AuthenticationExtensionsClientOutputs f6538t;

    /* renamed from: u */
    private final String f6539u;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z10 = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z10 = false;
        }
        C5984j.m21277a(z10);
        this.f6532n = str;
        this.f6533o = str2;
        this.f6534p = bArr;
        this.f6535q = authenticatorAttestationResponse;
        this.f6536r = authenticatorAssertionResponse;
        this.f6537s = authenticatorErrorResponse;
        this.f6538t = authenticationExtensionsClientOutputs;
        this.f6539u = str3;
    }

    /* renamed from: x */
    public static PublicKeyCredential m7821x(byte[] bArr) {
        return (PublicKeyCredential) C0030c.m223a(bArr, CREATOR);
    }

    /* renamed from: A */
    public String m7822A() {
        return this.f6532n;
    }

    /* renamed from: B */
    public byte[] m7823B() {
        return this.f6534p;
    }

    /* renamed from: C */
    public AuthenticatorResponse m7824C() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6535q;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6536r;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f6537s;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    /* renamed from: D */
    public String m7825D() {
        return this.f6533o;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: JSONException -> 0x0079, TryCatch #0 {JSONException -> 0x0079, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000c, B:7:0x0015, B:9:0x0019, B:10:0x001e, B:12:0x0022, B:14:0x0026, B:15:0x002b, B:17:0x002f, B:18:0x0034, B:20:0x003c, B:23:0x0059, B:24:0x005c, B:27:0x0062, B:32:0x006c, B:33:0x0042, B:35:0x0046, B:36:0x004b, B:38:0x004f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: JSONException -> 0x0079, TRY_ENTER, TryCatch #0 {JSONException -> 0x0079, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000c, B:7:0x0015, B:9:0x0019, B:10:0x001e, B:12:0x0022, B:14:0x0026, B:15:0x002b, B:17:0x002f, B:18:0x0034, B:20:0x003c, B:23:0x0059, B:24:0x005c, B:27:0x0062, B:32:0x006c, B:33:0x0042, B:35:0x0046, B:36:0x004b, B:38:0x004f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m7826E() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L79
            r0.<init>()     // Catch: org.json.JSONException -> L79
            byte[] r1 = r5.f6534p     // Catch: org.json.JSONException -> L79
            if (r1 == 0) goto L15
            int r2 = r1.length     // Catch: org.json.JSONException -> L79
            if (r2 <= 0) goto L15
            java.lang.String r2 = "rawId"
            java.lang.String r1 = p070f3.C3129c.m13780a(r1)     // Catch: org.json.JSONException -> L79
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L79
        L15:
            java.lang.String r1 = r5.f6539u     // Catch: org.json.JSONException -> L79
            if (r1 == 0) goto L1e
            java.lang.String r2 = "authenticatorAttachment"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L79
        L1e:
            java.lang.String r1 = r5.f6533o     // Catch: org.json.JSONException -> L79
            if (r1 == 0) goto L2b
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r2 = r5.f6537s     // Catch: org.json.JSONException -> L79
            if (r2 != 0) goto L2b
            java.lang.String r2 = "type"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L79
        L2b:
            java.lang.String r1 = r5.f6532n     // Catch: org.json.JSONException -> L79
            if (r1 == 0) goto L34
            java.lang.String r2 = "id"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L79
        L34:
            java.lang.String r1 = "response"
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r2 = r5.f6536r     // Catch: org.json.JSONException -> L79
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            org.json.JSONObject r2 = r2.m7794C()     // Catch: org.json.JSONException -> L79
        L40:
            r3 = 1
            goto L57
        L42:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r2 = r5.f6535q     // Catch: org.json.JSONException -> L79
            if (r2 == 0) goto L4b
            org.json.JSONObject r2 = r2.m7799B()     // Catch: org.json.JSONException -> L79
            goto L40
        L4b:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r2 = r5.f6537s     // Catch: org.json.JSONException -> L79
            if (r2 == 0) goto L56
            org.json.JSONObject r2 = r2.m7803A()     // Catch: org.json.JSONException -> L79
            java.lang.String r1 = "error"
            goto L57
        L56:
            r2 = 0
        L57:
            if (r2 == 0) goto L5c
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L79
        L5c:
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r1 = r5.f6538t     // Catch: org.json.JSONException -> L79
            java.lang.String r2 = "clientExtensionResults"
            if (r1 == 0) goto L6a
            org.json.JSONObject r1 = r1.m7789z()     // Catch: org.json.JSONException -> L79
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L79
            goto L74
        L6a:
            if (r3 == 0) goto L74
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L79
            r1.<init>()     // Catch: org.json.JSONException -> L79
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L79
        L74:
            java.lang.String r0 = r0.toString()
            return r0
        L79:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error encoding PublicKeyCredential to JSON object"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.m7826E():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return C5980h.m21269b(this.f6532n, publicKeyCredential.f6532n) && C5980h.m21269b(this.f6533o, publicKeyCredential.f6533o) && Arrays.equals(this.f6534p, publicKeyCredential.f6534p) && C5980h.m21269b(this.f6535q, publicKeyCredential.f6535q) && C5980h.m21269b(this.f6536r, publicKeyCredential.f6536r) && C5980h.m21269b(this.f6537s, publicKeyCredential.f6537s) && C5980h.m21269b(this.f6538t, publicKeyCredential.f6538t) && C5980h.m21269b(this.f6539u, publicKeyCredential.f6539u);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6532n, this.f6533o, this.f6534p, this.f6536r, this.f6535q, this.f6537s, this.f6538t, this.f6539u);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, m7822A(), false);
        C0029b.m215s(parcel, 2, m7825D(), false);
        C0029b.m202f(parcel, 3, m7823B(), false);
        C0029b.m213q(parcel, 4, this.f6535q, i10, false);
        C0029b.m213q(parcel, 5, this.f6536r, i10, false);
        C0029b.m213q(parcel, 6, this.f6537s, i10, false);
        C0029b.m213q(parcel, 7, m7828z(), i10, false);
        C0029b.m215s(parcel, 8, m7827y(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: y */
    public String m7827y() {
        return this.f6539u;
    }

    /* renamed from: z */
    public AuthenticationExtensionsClientOutputs m7828z() {
        return this.f6538t;
    }
}
