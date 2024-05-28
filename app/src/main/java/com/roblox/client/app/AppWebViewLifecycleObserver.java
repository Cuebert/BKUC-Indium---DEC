package com.roblox.client.app;

import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0853t;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.memstorage.MemStorage;

/* loaded from: classes.dex */
public class AppWebViewLifecycleObserver implements InterfaceC0844k {
    @InterfaceC0853t(AbstractC0839f.b.ON_CREATE)
    public void onWebViewCreated() {
    }

    @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
    public void onWebViewDestroyed() {
        MemStorage.fire("BrowserService.BrowserWindowClosed", BuildConfig.FLAVOR);
    }
}
