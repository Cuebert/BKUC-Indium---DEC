package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p246t3.C4679n;
import p246t3.C4683o;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new C1470q();

    /* renamed from: n */
    private final ErrorCode f6505n;

    /* renamed from: o */
    private final String f6506o;

    /* renamed from: p */
    private final int f6507p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticatorErrorResponse(int i10, String str, int i11) {
        try {
            this.f6505n = ErrorCode.m7817c(i10);
            this.f6506o = str;
            this.f6507p = i11;
        } catch (ErrorCode.C1449a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: A */
    public final JSONObject m7803A() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f6505n.m7818b());
            String str = this.f6506o;
            if (str != null) {
                jSONObject.put("message", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return C5980h.m21269b(this.f6505n, authenticatorErrorResponse.f6505n) && C5980h.m21269b(this.f6506o, authenticatorErrorResponse.f6506o) && C5980h.m21269b(Integer.valueOf(this.f6507p), Integer.valueOf(authenticatorErrorResponse.f6507p));
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6505n, this.f6506o, Integer.valueOf(this.f6507p));
    }

    public String toString() {
        C4679n m18796a = C4683o.m18796a(this);
        m18796a.m18792a("errorCode", this.f6505n.m7818b());
        String str = this.f6506o;
        if (str != null) {
            m18796a.m18793b("errorMessage", str);
        }
        return m18796a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, m7805y());
        C0029b.m215s(parcel, 3, m7806z(), false);
        C0029b.m208l(parcel, 4, this.f6507p);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public ErrorCode m7804x() {
        return this.f6505n;
    }

    /* renamed from: y */
    public int m7805y() {
        return this.f6505n.m7818b();
    }

    /* renamed from: z */
    public String m7806z() {
        return this.f6506o;
    }
}
