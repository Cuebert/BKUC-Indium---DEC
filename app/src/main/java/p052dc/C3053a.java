package p052dc;

import android.os.SystemClock;

/* renamed from: dc.a */
/* loaded from: classes.dex */
public class C3053a {

    /* renamed from: dc.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private Thread f12893a = Thread.currentThread();

        /* renamed from: a */
        public void m13504a() {
            if (this.f12893a == null) {
                this.f12893a = Thread.currentThread();
            }
            if (Thread.currentThread() != this.f12893a) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    /* renamed from: a */
    public static boolean m13503a(Thread thread, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j11 = j10;
        while (j11 > 0) {
            try {
                thread.join(j11);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }
}
