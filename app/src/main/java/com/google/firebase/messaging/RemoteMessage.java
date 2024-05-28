package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import p004a3.C0029b;
import p093h0.C3356a;

/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C2633o();

    /* renamed from: n */
    Bundle f10274n;

    /* renamed from: o */
    private Map<String, String> f10275o;

    public RemoteMessage(Bundle bundle) {
        this.f10274n = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m201e(parcel, 2, this.f10274n, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final Map<String, String> m12037x() {
        if (this.f10275o == null) {
            Bundle bundle = this.f10274n;
            C3356a c3356a = new C3356a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c3356a.put(str, str2);
                    }
                }
            }
            this.f10275o = c3356a;
        }
        return this.f10275o;
    }
}
