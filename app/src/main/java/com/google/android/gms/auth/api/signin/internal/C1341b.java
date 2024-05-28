package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.AbstractC0860a;
import p082g1.C3228b;
import p258u2.C4823e;
import p258u2.C4840v;
import p295x2.AbstractC5511f;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
/* loaded from: classes.dex */
final class C1341b implements AbstractC0860a.a {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f6107a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1341b(SignInHubActivity signInHubActivity, C4840v c4840v) {
        this.f6107a = signInHubActivity;
    }

    @Override // androidx.loader.app.AbstractC0860a.a
    /* renamed from: a */
    public final void mo4959a(C3228b c3228b) {
    }

    @Override // androidx.loader.app.AbstractC0860a.a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4960b(C3228b c3228b, Object obj) {
        SignInHubActivity signInHubActivity = this.f6107a;
        signInHubActivity.setResult(SignInHubActivity.m7372H0(signInHubActivity), SignInHubActivity.m7373I0(signInHubActivity));
        this.f6107a.finish();
    }

    @Override // androidx.loader.app.AbstractC0860a.a
    /* renamed from: c */
    public final C3228b mo4961c(int i10, Bundle bundle) {
        return new C4823e(this.f6107a, AbstractC5511f.m20281c());
    }
}
