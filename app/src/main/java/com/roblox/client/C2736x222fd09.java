package com.roblox.client;

import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0850q;
import androidx.lifecycle.InterfaceC0838e;
import androidx.lifecycle.InterfaceC0845l;
import com.roblox.client.RobloxWebActivity;

/* renamed from: com.roblox.client.RobloxWebActivity_DataModelFocusLifecycleObserver_LifecycleAdapter */
/* loaded from: classes.dex */
public class C2736x222fd09 implements InterfaceC0838e {

    /* renamed from: a */
    final RobloxWebActivity.DataModelFocusLifecycleObserver f10395a;

    C2736x222fd09(RobloxWebActivity.DataModelFocusLifecycleObserver dataModelFocusLifecycleObserver) {
        this.f10395a = dataModelFocusLifecycleObserver;
    }

    @Override // androidx.lifecycle.InterfaceC0838e
    /* renamed from: a */
    public void mo4888a(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar, boolean z10, C0850q c0850q) {
        boolean z11 = c0850q != null;
        if (z10) {
            return;
        }
        if (bVar == AbstractC0839f.b.ON_CREATE) {
            if (!z11 || c0850q.m4924a("onFragmentCreated", 1)) {
                this.f10395a.onFragmentCreated();
                return;
            }
            return;
        }
        if (bVar == AbstractC0839f.b.ON_DESTROY) {
            if (!z11 || c0850q.m4924a("onFragmentDestroyed", 1)) {
                this.f10395a.onFragmentDestroyed();
            }
        }
    }
}
