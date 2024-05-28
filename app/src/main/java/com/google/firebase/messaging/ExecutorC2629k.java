package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.k */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2629k implements Executor {

    /* renamed from: n */
    static final Executor f10292n = new ExecutorC2629k();

    private ExecutorC2629k() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
