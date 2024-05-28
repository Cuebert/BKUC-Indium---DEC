package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes.dex */
final class C2576a {

    /* renamed from: a */
    private static final Executor f10164a = ExecutorC2605t.f10229n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final /* synthetic */ Thread m11916a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m11917b() {
        return f10164a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Executor m11918c() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ThreadFactoryC2606u.f10230a);
    }
}
