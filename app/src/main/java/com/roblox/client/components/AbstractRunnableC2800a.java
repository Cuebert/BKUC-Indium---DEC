package com.roblox.client.components;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p035c9.C1151k;

/* renamed from: com.roblox.client.components.a */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2800a<T> implements Runnable {

    /* renamed from: n */
    private AtomicBoolean f10950n = new AtomicBoolean(false);

    /* renamed from: o */
    private AtomicInteger f10951o = new AtomicInteger(0);

    /* renamed from: p */
    private T f10952p;

    /* renamed from: q */
    private ScheduledExecutorService f10953q;

    /* renamed from: r */
    private ScheduledFuture<?> f10954r;

    /* renamed from: s */
    protected String f10955s;

    public AbstractRunnableC2800a(String str) {
        this.f10955s = str;
    }

    /* renamed from: b */
    private ScheduledExecutorService m12403b() {
        if (this.f10953q == null) {
            this.f10953q = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f10953q;
    }

    /* renamed from: c */
    private synchronized T m12404c() {
        return this.f10952p;
    }

    /* renamed from: d */
    private void m12405d(long j10) {
        this.f10954r = m12403b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    protected abstract void mo12406a(T t10);

    /* renamed from: e */
    public synchronized void m12407e(T t10) {
        if (!this.f10950n.get() && (mo12409g() <= 0 || this.f10951o.incrementAndGet() < mo12409g())) {
            long mo12408f = mo12408f();
            if (mo12408f <= 0) {
                mo12406a(t10);
                return;
            }
            C1151k.m6712f(this.f10955s, "queue value: " + t10);
            this.f10952p = t10;
            if (this.f10954r == null) {
                m12405d(mo12408f);
            }
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f10954r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10952p = t10;
        C1151k.m6712f(this.f10955s, "set immediately: " + t10);
        mo12406a(t10);
        this.f10950n.set(true);
    }

    /* renamed from: f */
    protected abstract long mo12408f();

    /* renamed from: g */
    protected abstract int mo12409g();

    @Override // java.lang.Runnable
    public synchronized void run() {
        mo12406a(m12404c());
        this.f10950n.set(true);
    }
}
