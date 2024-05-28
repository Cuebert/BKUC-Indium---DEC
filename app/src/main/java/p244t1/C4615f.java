package p244t1;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import p233s1.C4516a;

/* renamed from: t1.f */
/* loaded from: classes.dex */
public class C4615f extends C4617h implements MessageQueue {

    /* renamed from: f */
    private final Object f18384f;

    /* renamed from: g */
    private final AtomicBoolean f18385g;

    /* renamed from: h */
    private final Timer f18386h;

    /* renamed from: i */
    private final C4610a f18387i;

    /* renamed from: j */
    private boolean f18388j;

    /* renamed from: k */
    private final C4612c f18389k;

    public C4615f(Timer timer, C4612c c4612c, String str) {
        super(c4612c, str);
        this.f18384f = new Object();
        this.f18385g = new AtomicBoolean(false);
        this.f18388j = false;
        this.f18389k = c4612c;
        this.f18386h = timer;
        this.f18387i = new C4610a(c4612c);
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void cancelMessages(MessagePredicate messagePredicate) {
        synchronized (this.f18384f) {
            super.m18712c(messagePredicate);
            this.f18387i.m18703c(messagePredicate);
        }
    }

    @Override // p244t1.C4617h, com.birbit.android.jobqueue.messaging.MessageQueue
    public void clear() {
        synchronized (this.f18384f) {
            super.clear();
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void consume(AbstractC4613d abstractC4613d) {
        if (!this.f18385g.getAndSet(true)) {
            abstractC4613d.mo6991c();
            while (this.f18385g.get()) {
                AbstractC4611b m18709d = m18709d(abstractC4613d);
                if (m18709d != null) {
                    abstractC4613d.mo6989a(m18709d);
                    this.f18389k.m18707b(m18709d);
                }
            }
            C4516a.m18533b("[%s] finished queue", this.f18409c);
            return;
        }
        throw new IllegalStateException("only 1 consumer per MQ");
    }

    /* renamed from: d */
    AbstractC4611b m18709d(AbstractC4613d abstractC4613d) {
        long nanoTime;
        Long m18702b;
        boolean z10 = false;
        while (this.f18385g.get()) {
            synchronized (this.f18384f) {
                nanoTime = this.f18386h.nanoTime();
                m18702b = this.f18387i.m18702b(nanoTime, this);
                AbstractC4611b m18711a = super.m18711a();
                if (m18711a != null) {
                    return m18711a;
                }
                this.f18388j = false;
            }
            if (!z10) {
                abstractC4613d.mo6990b();
                z10 = true;
            }
            synchronized (this.f18384f) {
                if (!this.f18388j) {
                    if (m18702b != null && m18702b.longValue() <= nanoTime) {
                        C4516a.m18533b("[%s] next message is ready, requery", this.f18409c);
                    } else if (this.f18385g.get()) {
                        if (m18702b == null) {
                            try {
                                C4516a.m18533b("[%s] will wait on the lock forever", this.f18409c);
                                this.f18386h.waitOnObject(this.f18384f);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            C4516a.m18533b("[%s] will wait on the lock until %d", this.f18409c, m18702b);
                            this.f18386h.waitOnObjectUntilNs(this.f18384f, m18702b.longValue());
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // p244t1.C4617h, com.birbit.android.jobqueue.messaging.MessageQueue
    public void post(AbstractC4611b abstractC4611b) {
        synchronized (this.f18384f) {
            this.f18388j = true;
            super.post(abstractC4611b);
            this.f18386h.notifyObject(this.f18384f);
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void postAt(AbstractC4611b abstractC4611b, long j10) {
        synchronized (this.f18384f) {
            this.f18388j = true;
            this.f18387i.m18701a(abstractC4611b, j10);
            this.f18386h.notifyObject(this.f18384f);
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void stop() {
        this.f18385g.set(false);
        synchronized (this.f18384f) {
            this.f18386h.notifyObject(this.f18384f);
        }
    }
}
