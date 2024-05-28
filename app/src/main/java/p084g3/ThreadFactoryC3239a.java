package p084g3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p321z2.C5984j;

/* renamed from: g3.a */
/* loaded from: classes.dex */
public class ThreadFactoryC3239a implements ThreadFactory {

    /* renamed from: a */
    private final String f13678a;

    /* renamed from: b */
    private final ThreadFactory f13679b = Executors.defaultThreadFactory();

    public ThreadFactoryC3239a(String str) {
        C5984j.m21287k(str, "Name must not be null");
        this.f13678a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f13679b.newThread(new RunnableC3240b(runnable, 0));
        newThread.setName(this.f13678a);
        return newThread;
    }
}
