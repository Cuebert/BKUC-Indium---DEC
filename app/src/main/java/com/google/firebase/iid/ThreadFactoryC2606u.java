package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.u */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2606u implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f10230a = new ThreadFactoryC2606u();

    private ThreadFactoryC2606u() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return C2576a.m11916a(runnable);
    }
}
