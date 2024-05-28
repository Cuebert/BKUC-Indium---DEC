package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new C1466m();

    /* renamed from: n */
    private final UvmEntries f6491n;

    /* renamed from: o */
    private final zzf f6492o;

    /* renamed from: p */
    private final AuthenticationExtensionsCredPropsOutputs f6493p;

    /* renamed from: q */
    private final zzh f6494q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.f6491n = uvmEntries;
        this.f6492o = zzfVar;
        this.f6493p = authenticationExtensionsCredPropsOutputs;
        this.f6494q = zzhVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return C5980h.m21269b(this.f6491n, authenticationExtensionsClientOutputs.f6491n) && C5980h.m21269b(this.f6492o, authenticationExtensionsClientOutputs.f6492o) && C5980h.m21269b(this.f6493p, authenticationExtensionsClientOutputs.f6493p) && C5980h.m21269b(this.f6494q, authenticationExtensionsClientOutputs.f6494q);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f6491n, this.f6492o, this.f6493p, this.f6494q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, m7788y(), i10, false);
        C0029b.m213q(parcel, 2, this.f6492o, i10, false);
        C0029b.m213q(parcel, 3, m7787x(), i10, false);
        C0029b.m213q(parcel, 4, this.f6494q, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public AuthenticationExtensionsCredPropsOutputs m7787x() {
        return this.f6493p;
    }

    /* renamed from: y */
    public UvmEntries m7788y() {
        return this.f6491n;
    }

    /* renamed from: z */
    public final JSONObject m7789z() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f6493p;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.m7791y());
            }
            UvmEntries uvmEntries = this.f6491n;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.m7869y());
            }
            zzh zzhVar = this.f6494q;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.m7875x());
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }
}
