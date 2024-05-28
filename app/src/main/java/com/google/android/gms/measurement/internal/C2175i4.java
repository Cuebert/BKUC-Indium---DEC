package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes.dex */
public final class C2175i4<V> extends FutureTask<V> implements Comparable<C2175i4<V>> {

    /* renamed from: n */
    private final long f8178n;

    /* renamed from: o */
    final boolean f8179o;

    /* renamed from: p */
    private final String f8180p;

    /* renamed from: q */
    final /* synthetic */ C2197k4 f8181q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175i4(C2197k4 c2197k4, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f8181q = c2197k4;
        C5984j.m21286j(str);
        atomicLong = C2197k4.f8228l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f8178n = andIncrement;
        this.f8180p = str;
        this.f8179o = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2197k4.f8118a.mo9765d().m10048r().m9893a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2175i4 c2175i4 = (C2175i4) obj;
        boolean z10 = this.f8179o;
        if (z10 != c2175i4.f8179o) {
            return !z10 ? 1 : -1;
        }
        long j10 = this.f8178n;
        long j11 = c2175i4.f8178n;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f8181q.f8118a.mo9765d().m10050t().m9894b("Two tasks share the same index. index", Long.valueOf(this.f8178n));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f8181q.f8118a.mo9765d().m10048r().m9894b(this.f8180p, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175i4(C2197k4 c2197k4, Callable<V> callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f8181q = c2197k4;
        C5984j.m21286j("Task exception on worker thread");
        atomicLong = C2197k4.f8228l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f8178n = andIncrement;
        this.f8180p = "Task exception on worker thread";
        this.f8179o = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2197k4.f8118a.mo9765d().m10048r().m9893a("Tasks index overflow");
        }
    }
}
