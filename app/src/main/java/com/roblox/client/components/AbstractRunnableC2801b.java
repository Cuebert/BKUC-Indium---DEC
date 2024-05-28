package com.roblox.client.components;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p035c9.C1151k;

/* renamed from: com.roblox.client.components.b */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2801b<T> implements Runnable {

    /* renamed from: n */
    private T f10956n;

    /* renamed from: o */
    private ScheduledExecutorService f10957o;

    /* renamed from: p */
    private ScheduledFuture<?> f10958p;

    /* renamed from: q */
    protected String f10959q;

    public AbstractRunnableC2801b(String str) {
        this.f10959q = str;
    }

    /* renamed from: b */
    private ScheduledExecutorService m12410b() {
        if (this.f10957o == null) {
            this.f10957o = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f10957o;
    }

    /* renamed from: c */
    private synchronized T m12411c() {
        return this.f10956n;
    }

    /* renamed from: d */
    private void m12412d(long j10) {
        this.f10958p = m12410b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    protected abstract void mo12413a(T t10);

    /* renamed from: e */
    public void m12414e(T t10, long j10) {
        ScheduledFuture<?> scheduledFuture = this.f10958p;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f10958p.cancel(true);
        }
        if (j10 <= 0) {
            mo12413a(t10);
            return;
        }
        C1151k.m6712f(this.f10959q, "queue value: " + t10);
        this.f10956n = t10;
        m12412d(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        mo12413a(m12411c());
    }
}
