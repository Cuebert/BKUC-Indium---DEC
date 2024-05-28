package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p161m3.C3946o;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new C3946o();

    /* renamed from: n */
    private final boolean f6495n;

    public AuthenticationExtensionsCredPropsOutputs(boolean z10) {
        this.f6495n = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f6495n == ((AuthenticationExtensionsCredPropsOutputs) obj).f6495n;
    }

    public int hashCode() {
        return C5980h.m21270c(Boolean.valueOf(this.f6495n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, m7790x());
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public boolean m7790x() {
        return this.f6495n;
    }

    /* renamed from: y */
    public final JSONObject m7791y() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f6495n);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
        }
    }
}
