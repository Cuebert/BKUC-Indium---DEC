package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d2 */
/* loaded from: classes.dex */
public final class ThreadFactoryC1529d2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f6743a = Executors.defaultThreadFactory();

    public ThreadFactoryC1529d2(C1774s2 c1774s2) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6743a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
