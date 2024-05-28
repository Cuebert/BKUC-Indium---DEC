package com.roblox.client.app;

import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0853t;
import com.roblox.engine.jni.NativeGLInterface;
import p035c9.C1151k;
import p102h9.C3447a;

/* loaded from: classes.dex */
public class AppInputFocusLifecycleObserver implements InterfaceC0844k {

    /* renamed from: n */
    private final String f10440n = "rbx.datamodel";

    @InterfaceC0853t(AbstractC0839f.b.ON_CREATE)
    public void onMenuOptionActivated() {
        C1151k.m6707a("rbx.datamodel", "onMenuOptionActivated");
        C3447a c3447a = new C3447a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(c3447a.f14340a, c3447a.f14341b, c3447a.f14342c);
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
    public void onMenuOptionClosed() {
        C1151k.m6707a("rbx.datamodel", "onMenuOptionClosed");
        C3447a c3447a = new C3447a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(c3447a.f14340a, c3447a.f14341b, c3447a.f14342c);
    }
}
