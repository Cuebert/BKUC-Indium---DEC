package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* loaded from: classes.dex */
public final class C2361z8 implements InterfaceC2158g9 {

    /* renamed from: a */
    final /* synthetic */ C2103b9 f8825a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2361z8(C2103b9 c2103b9) {
        this.f8825a = c2103b9;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2158g9
    /* renamed from: a */
    public final void mo9727a(String str, String str2, Bundle bundle) {
        C2219m4 c2219m4;
        C2219m4 c2219m42;
        if (!TextUtils.isEmpty(str)) {
            this.f8825a.mo9761b().m10081z(new RunnableC2351y8(this, str, "_err", bundle));
            return;
        }
        c2219m4 = this.f8825a.f8006l;
        if (c2219m4 != null) {
            c2219m42 = this.f8825a.f8006l;
            c2219m42.mo9765d().m10048r().m9894b("AppId not known when logging event", "_err");
        }
    }
}
