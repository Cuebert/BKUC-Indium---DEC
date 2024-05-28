package com.roblox.client.app;

import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0850q;
import androidx.lifecycle.InterfaceC0838e;
import androidx.lifecycle.InterfaceC0845l;

/* loaded from: classes.dex */
public class AppInputFocusLifecycleObserver_LifecycleAdapter implements InterfaceC0838e {

    /* renamed from: a */
    final AppInputFocusLifecycleObserver f10441a;

    AppInputFocusLifecycleObserver_LifecycleAdapter(AppInputFocusLifecycleObserver appInputFocusLifecycleObserver) {
        this.f10441a = appInputFocusLifecycleObserver;
    }

    @Override // androidx.lifecycle.InterfaceC0838e
    /* renamed from: a */
    public void mo4888a(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar, boolean z10, C0850q c0850q) {
        boolean z11 = c0850q != null;
        if (z10) {
            return;
        }
        if (bVar == AbstractC0839f.b.ON_CREATE) {
            if (!z11 || c0850q.m4924a("onMenuOptionActivated", 1)) {
                this.f10441a.onMenuOptionActivated();
                return;
            }
            return;
        }
        if (bVar == AbstractC0839f.b.ON_DESTROY) {
            if (!z11 || c0850q.m4924a("onMenuOptionClosed", 1)) {
                this.f10441a.onMenuOptionClosed();
            }
        }
    }
}
