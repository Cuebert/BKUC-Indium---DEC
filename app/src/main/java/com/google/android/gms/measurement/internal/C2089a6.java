package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes.dex */
public final class C2089a6 implements InterfaceC2158g9 {

    /* renamed from: a */
    final /* synthetic */ C2221m6 f7962a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2089a6(C2221m6 c2221m6) {
        this.f7962a = c2221m6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2158g9
    /* renamed from: a */
    public final void mo9727a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f7962a.m10174t("auto", "_err", bundle, str);
        } else {
            this.f7962a.m10172r("auto", "_err", bundle);
        }
    }
}
