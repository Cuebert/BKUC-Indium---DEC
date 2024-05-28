package p124j3;

import android.os.Process;

/* renamed from: j3.a */
/* loaded from: classes.dex */
final class C3596a extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3596a(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
