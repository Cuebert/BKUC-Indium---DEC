package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.t */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2605t implements Executor {

    /* renamed from: n */
    static final Executor f10229n = new ExecutorC2605t();

    private ExecutorC2605t() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
