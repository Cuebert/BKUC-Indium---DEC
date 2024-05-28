package p145kb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kb.j */
/* loaded from: classes.dex */
public final class C3797j extends C3814p {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f15847c = AtomicIntegerFieldUpdater.newUpdater(C3797j.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3797j(va.InterfaceC4999c<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145kb.C3797j.<init>(va.c, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean m16171c() {
        return f15847c.compareAndSet(this, 0, 1);
    }
}
