package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.C0029b;
import p161m3.C3948q;
import p321z2.C5980h;

/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C3948q();

    /* renamed from: n */
    private final boolean f6608n;

    /* renamed from: o */
    private final byte[] f6609o;

    public zzh(boolean z10, byte[] bArr) {
        this.f6608n = z10;
        this.f6609o = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f6608n == zzhVar.f6608n && Arrays.equals(this.f6609o, zzhVar.f6609o);
    }

    public final int hashCode() {
        return C5980h.m21270c(Boolean.valueOf(this.f6608n), this.f6609o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m199c(parcel, 1, this.f6608n);
        C0029b.m202f(parcel, 2, this.f6609o, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final JSONObject m7875x() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", this.f6608n);
            JSONObject jSONObject2 = new JSONObject();
            byte[] bArr = this.f6609o;
            if (bArr != null) {
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOfRange(bArr, 0, 31), 11));
                byte[] bArr2 = this.f6609o;
                if (bArr2.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr2, 32, 64), 11));
                }
            }
            jSONObject.put("results", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }
}
