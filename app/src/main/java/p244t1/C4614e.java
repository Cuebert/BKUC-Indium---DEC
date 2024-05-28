package p244t1;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import p233s1.C4516a;

/* renamed from: t1.e */
/* loaded from: classes.dex */
public class C4614e implements MessageQueue {

    /* renamed from: c */
    private final C4610a f18379c;

    /* renamed from: d */
    private final Timer f18380d;

    /* renamed from: g */
    private final C4612c f18383g;

    /* renamed from: a */
    private final Object f18377a = new Object();

    /* renamed from: e */
    private final AtomicBoolean f18381e = new AtomicBoolean(false);

    /* renamed from: f */
    private boolean f18382f = false;

    /* renamed from: b */
    private final C4617h[] f18378b = new C4617h[EnumC4616g.f18391B + 1];

    public C4614e(Timer timer, C4612c c4612c) {
        this.f18379c = new C4610a(c4612c);
        this.f18383g = c4612c;
        this.f18380d = timer;
    }

    /* renamed from: a */
    public AbstractC4611b m18708a(AbstractC4613d abstractC4613d) {
        long nanoTime;
        Long m18702b;
        AbstractC4611b m18711a;
        boolean z10 = false;
        while (this.f18381e.get()) {
            synchronized (this.f18377a) {
                nanoTime = this.f18380d.nanoTime();
                C4516a.m18533b("[%s] looking for next message at time %s", "priority_mq", Long.valueOf(nanoTime));
                m18702b = this.f18379c.m18702b(nanoTime, this);
                C4516a.m18533b("[%s] next delayed job %s", "priority_mq", m18702b);
                for (int i10 = EnumC4616g.f18391B; i10 >= 0; i10--) {
                    C4617h c4617h = this.f18378b[i10];
                    if (c4617h != null && (m18711a = c4617h.m18711a()) != null) {
                        return m18711a;
                    }
                }
                this.f18382f = false;
            }
            if (!z10) {
                abstractC4613d.mo6990b();
                z10 = true;
            }
            synchronized (this.f18377a) {
                C4516a.m18533b("[%s] did on idle post a message? %s", "priority_mq", Boolean.valueOf(this.f18382f));
                if (!this.f18382f) {
                    if (m18702b == null || m18702b.longValue() > nanoTime) {
                        if (this.f18381e.get()) {
                            if (m18702b == null) {
                                try {
                                    this.f18380d.waitOnObject(this.f18377a);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                this.f18380d.waitOnObjectUntilNs(this.f18377a, m18702b.longValue());
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void cancelMessages(MessagePredicate messagePredicate) {
        synchronized (this.f18377a) {
            for (int i10 = 0; i10 <= EnumC4616g.f18391B; i10++) {
                C4617h c4617h = this.f18378b[i10];
                if (c4617h != null) {
                    c4617h.m18712c(messagePredicate);
                }
            }
            this.f18379c.m18703c(messagePredicate);
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void clear() {
        synchronized (this.f18377a) {
            for (int i10 = EnumC4616g.f18391B; i10 >= 0; i10--) {
                C4617h c4617h = this.f18378b[i10];
                if (c4617h != null) {
                    c4617h.clear();
                }
            }
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void consume(AbstractC4613d abstractC4613d) {
        if (!this.f18381e.getAndSet(true)) {
            while (this.f18381e.get()) {
                AbstractC4611b m18708a = m18708a(abstractC4613d);
                if (m18708a != null) {
                    C4516a.m18533b("[%s] consuming message of type %s", "priority_mq", m18708a.f18372a);
                    abstractC4613d.mo6989a(m18708a);
                    this.f18383g.m18707b(m18708a);
                }
            }
            return;
        }
        throw new IllegalStateException("only 1 consumer per MQ");
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void post(AbstractC4611b abstractC4611b) {
        synchronized (this.f18377a) {
            this.f18382f = true;
            int i10 = abstractC4611b.f18372a.f18405o;
            C4617h[] c4617hArr = this.f18378b;
            if (c4617hArr[i10] == null) {
                c4617hArr[i10] = new C4617h(this.f18383g, "queue_" + abstractC4611b.f18372a.name());
            }
            this.f18378b[i10].post(abstractC4611b);
            this.f18380d.notifyObject(this.f18377a);
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void postAt(AbstractC4611b abstractC4611b, long j10) {
        synchronized (this.f18377a) {
            this.f18382f = true;
            this.f18379c.m18701a(abstractC4611b, j10);
            this.f18380d.notifyObject(this.f18377a);
        }
    }

    @Override // com.birbit.android.jobqueue.messaging.MessageQueue
    public void stop() {
        this.f18381e.set(false);
        synchronized (this.f18377a) {
            this.f18380d.notifyObject(this.f18377a);
        }
    }
}
