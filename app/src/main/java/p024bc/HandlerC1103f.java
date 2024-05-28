package p024bc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bc.f */
/* loaded from: classes.dex */
public final class HandlerC1103f extends Handler {

    /* renamed from: a */
    private final C1106i f5403a;

    /* renamed from: b */
    private final int f5404b;

    /* renamed from: c */
    private final C1100c f5405c;

    /* renamed from: d */
    private boolean f5406d;

    public HandlerC1103f(C1100c c1100c, Looper looper, int i10) {
        super(looper);
        this.f5405c = c1100c;
        this.f5404b = i10;
        this.f5403a = new C1106i();
    }

    /* renamed from: a */
    public void m6474a(C1111n c1111n, Object obj) {
        C1105h m6475a = C1105h.m6475a(c1111n, obj);
        synchronized (this) {
            this.f5403a.m6477a(m6475a);
            if (!this.f5406d) {
                this.f5406d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new C1102e("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C1105h m6478b = this.f5403a.m6478b();
                if (m6478b == null) {
                    synchronized (this) {
                        m6478b = this.f5403a.m6478b();
                        if (m6478b == null) {
                            return;
                        }
                    }
                }
                this.f5405c.m6467g(m6478b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f5404b);
            if (sendMessage(obtainMessage())) {
                this.f5406d = true;
                return;
            }
            throw new C1102e("Could not send handler message");
        } finally {
            this.f5406d = false;
        }
    }
}
