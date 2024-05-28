package p286w6;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: w6.b */
/* loaded from: classes.dex */
public abstract class AbstractC5463b {

    /* renamed from: c */
    private Handler f20378c;

    /* renamed from: b */
    private c f20377b = c.IDLE;

    /* renamed from: d */
    private InterfaceC5462a f20379d = new a();

    /* renamed from: e */
    private Runnable f20380e = new b();

    /* renamed from: a */
    Queue<InterfaceC5464c> f20376a = new ArrayBlockingQueue(20);

    /* renamed from: w6.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5462a {
        a() {
        }

        @Override // p286w6.InterfaceC5462a
        /* renamed from: a */
        public void mo20089a() {
            AbstractC5463b.this.f20377b = c.IDLE;
            AbstractC5463b.this.m20092c();
        }
    }

    /* renamed from: w6.b$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5463b.this.m20092c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6.b$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        PROCESSING
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5463b() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f20378c = new Handler();
    }

    /* renamed from: b */
    public void m20091b(InterfaceC5464c interfaceC5464c) {
        try {
            this.f20376a.add(interfaceC5464c);
        } catch (IllegalStateException unused) {
            Log.e("RbxBlockingQueue", "Queue full! Cannot add more reports.");
        }
        m20092c();
    }

    /* renamed from: c */
    protected void m20092c() {
        c cVar = this.f20377b;
        c cVar2 = c.IDLE;
        if (cVar == cVar2) {
            this.f20377b = c.PROCESSING;
            InterfaceC5464c peek = this.f20376a.peek();
            if (peek != null && peek.mo16944a()) {
                InterfaceC5464c poll = this.f20376a.poll();
                if (poll != null) {
                    poll.mo16945b(this.f20379d);
                    return;
                } else {
                    this.f20377b = cVar2;
                    return;
                }
            }
            this.f20377b = cVar2;
            this.f20378c.removeCallbacks(this.f20380e);
            if (this.f20376a.size() > 0) {
                this.f20378c.postDelayed(this.f20380e, 10000L);
            }
        }
    }
}
