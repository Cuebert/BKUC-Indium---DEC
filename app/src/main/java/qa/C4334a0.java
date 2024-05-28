package qa;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.a0 */
/* loaded from: classes.dex */
public class C4334a0 {

    /* renamed from: a */
    final HandlerThread f17604a;

    /* renamed from: b */
    final InterfaceC4339d f17605b;

    /* renamed from: c */
    final Handler f17606c;

    /* renamed from: d */
    long f17607d;

    /* renamed from: e */
    long f17608e;

    /* renamed from: f */
    long f17609f;

    /* renamed from: g */
    long f17610g;

    /* renamed from: h */
    long f17611h;

    /* renamed from: i */
    long f17612i;

    /* renamed from: j */
    long f17613j;

    /* renamed from: k */
    long f17614k;

    /* renamed from: l */
    int f17615l;

    /* renamed from: m */
    int f17616m;

    /* renamed from: n */
    int f17617n;

    /* renamed from: qa.a0$a */
    /* loaded from: classes.dex */
    private static class a extends Handler {

        /* renamed from: a */
        private final C4334a0 f17618a;

        /* renamed from: qa.a0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC6058a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ Message f17619n;

            RunnableC6058a(Message message) {
                this.f17619n = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f17619n.what);
            }
        }

        public a(Looper looper, C4334a0 c4334a0) {
            super(looper);
            this.f17618a = c4334a0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f17618a.m17887j();
                return;
            }
            if (i10 == 1) {
                this.f17618a.m17888k();
                return;
            }
            if (i10 == 2) {
                this.f17618a.m17885h(message.arg1);
                return;
            }
            if (i10 == 3) {
                this.f17618a.m17886i(message.arg1);
            } else if (i10 != 4) {
                C4359t.f17735p.post(new RunnableC6058a(message));
            } else {
                this.f17618a.m17889l((Long) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4334a0(InterfaceC4339d interfaceC4339d) {
        this.f17605b = interfaceC4339d;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f17604a = handlerThread;
        handlerThread.start();
        C4346g0.m17939j(handlerThread.getLooper());
        this.f17606c = new a(handlerThread.getLooper(), this);
    }

    /* renamed from: g */
    private static long m17877g(int i10, long j10) {
        return j10 / i10;
    }

    /* renamed from: m */
    private void m17878m(Bitmap bitmap, int i10) {
        int m17940k = C4346g0.m17940k(bitmap);
        Handler handler = this.f17606c;
        handler.sendMessage(handler.obtainMessage(i10, m17940k, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4336b0 m17879a() {
        return new C4336b0(this.f17605b.mo17920b(), this.f17605b.size(), this.f17607d, this.f17608e, this.f17609f, this.f17610g, this.f17611h, this.f17612i, this.f17613j, this.f17614k, this.f17615l, this.f17616m, this.f17617n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m17880b(Bitmap bitmap) {
        m17878m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m17881c(Bitmap bitmap) {
        m17878m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m17882d() {
        this.f17606c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m17883e() {
        this.f17606c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m17884f(long j10) {
        Handler handler = this.f17606c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    /* renamed from: h */
    void m17885h(long j10) {
        int i10 = this.f17616m + 1;
        this.f17616m = i10;
        long j11 = this.f17610g + j10;
        this.f17610g = j11;
        this.f17613j = m17877g(i10, j11);
    }

    /* renamed from: i */
    void m17886i(long j10) {
        this.f17617n++;
        long j11 = this.f17611h + j10;
        this.f17611h = j11;
        this.f17614k = m17877g(this.f17616m, j11);
    }

    /* renamed from: j */
    void m17887j() {
        this.f17607d++;
    }

    /* renamed from: k */
    void m17888k() {
        this.f17608e++;
    }

    /* renamed from: l */
    void m17889l(Long l10) {
        this.f17615l++;
        long longValue = this.f17609f + l10.longValue();
        this.f17609f = longValue;
        this.f17612i = m17877g(this.f17615l, longValue);
    }
}
