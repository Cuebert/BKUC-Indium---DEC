package com.roblox.client.login.mvp;

import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0850q;
import androidx.lifecycle.InterfaceC0838e;
import androidx.lifecycle.InterfaceC0845l;

/* loaded from: classes.dex */
public class LoginPresenter_LifecycleAdapter implements InterfaceC0838e {

    /* renamed from: a */
    final LoginPresenter f11362a;

    LoginPresenter_LifecycleAdapter(LoginPresenter loginPresenter) {
        this.f11362a = loginPresenter;
    }

    @Override // androidx.lifecycle.InterfaceC0838e
    /* renamed from: a */
    public void mo4888a(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar, boolean z10, C0850q c0850q) {
        boolean z11 = c0850q != null;
        if (z10) {
            return;
        }
        if (bVar == AbstractC0839f.b.ON_RESUME) {
            if (!z11 || c0850q.m4924a("setStoreCredentialValue", 1)) {
                this.f11362a.setStoreCredentialValue();
                return;
            }
            return;
        }
        if (bVar == AbstractC0839f.b.ON_DESTROY) {
            if (!z11 || c0850q.m4924a("cleanup", 1)) {
                this.f11362a.cleanup();
            }
        }
    }
}
