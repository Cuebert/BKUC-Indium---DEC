package p024bc;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bc.b */
/* loaded from: classes.dex */
public final class RunnableC1099b implements Runnable {

    /* renamed from: n */
    private final C1106i f5361n = new C1106i();

    /* renamed from: o */
    private final C1100c f5362o;

    /* renamed from: p */
    private volatile boolean f5363p;

    public RunnableC1099b(C1100c c1100c) {
        this.f5362o = c1100c;
    }

    /* renamed from: a */
    public void m6454a(C1111n c1111n, Object obj) {
        C1105h m6475a = C1105h.m6475a(c1111n, obj);
        synchronized (this) {
            this.f5361n.m6477a(m6475a);
            if (!this.f5363p) {
                this.f5363p = true;
                this.f5362o.m6466e().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                C1105h m6479c = this.f5361n.m6479c(1000);
                if (m6479c == null) {
                    synchronized (this) {
                        m6479c = this.f5361n.m6478b();
                        if (m6479c == null) {
                            return;
                        }
                    }
                }
                this.f5362o.m6467g(m6479c);
            } catch (InterruptedException e10) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                return;
            } finally {
                this.f5363p = false;
            }
        }
    }
}
