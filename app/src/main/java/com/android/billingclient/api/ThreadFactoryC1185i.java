package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.i */
/* loaded from: classes.dex */
public final class ThreadFactoryC1185i implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f5648a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f5649b = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC1185i(C1175d c1175d) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5648a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + this.f5649b.getAndIncrement());
        return newThread;
    }
}
