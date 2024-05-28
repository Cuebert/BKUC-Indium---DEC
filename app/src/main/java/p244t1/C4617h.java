package p244t1;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import java.util.concurrent.atomic.AtomicInteger;
import p233s1.C4516a;

/* renamed from: t1.h */
/* loaded from: classes.dex */
class C4617h {

    /* renamed from: e */
    private static final AtomicInteger f18406e = new AtomicInteger(0);

    /* renamed from: a */
    private AbstractC4611b f18407a = null;

    /* renamed from: b */
    private AbstractC4611b f18408b = null;

    /* renamed from: c */
    public final String f18409c;

    /* renamed from: d */
    private final C4612c f18410d;

    public C4617h(C4612c c4612c, String str) {
        this.f18410d = c4612c;
        this.f18409c = str + "_" + f18406e.incrementAndGet();
    }

    /* renamed from: b */
    private void m18710b(AbstractC4611b abstractC4611b, AbstractC4611b abstractC4611b2) {
        if (this.f18408b == abstractC4611b2) {
            this.f18408b = abstractC4611b;
        }
        if (abstractC4611b == null) {
            this.f18407a = abstractC4611b2.f18373b;
        } else {
            abstractC4611b.f18373b = abstractC4611b2.f18373b;
        }
        this.f18410d.m18707b(abstractC4611b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC4611b m18711a() {
        AbstractC4611b abstractC4611b = this.f18407a;
        C4516a.m18533b("[%s] remove message %s", this.f18409c, abstractC4611b);
        if (abstractC4611b != null) {
            this.f18407a = abstractC4611b.f18373b;
            if (this.f18408b == abstractC4611b) {
                this.f18408b = null;
            }
        }
        return abstractC4611b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m18712c(MessagePredicate messagePredicate) {
        AbstractC4611b abstractC4611b = this.f18407a;
        AbstractC4611b abstractC4611b2 = null;
        while (abstractC4611b != null) {
            if (messagePredicate.onMessage(abstractC4611b)) {
                AbstractC4611b abstractC4611b3 = abstractC4611b.f18373b;
                m18710b(abstractC4611b2, abstractC4611b);
                abstractC4611b = abstractC4611b3;
            } else {
                abstractC4611b2 = abstractC4611b;
                abstractC4611b = abstractC4611b.f18373b;
            }
        }
    }

    public void clear() {
        while (true) {
            AbstractC4611b abstractC4611b = this.f18407a;
            if (abstractC4611b != null) {
                this.f18407a = abstractC4611b.f18373b;
                this.f18410d.m18707b(abstractC4611b);
            } else {
                this.f18408b = null;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void post(AbstractC4611b abstractC4611b) {
        C4516a.m18533b("[%s] post message %s", this.f18409c, abstractC4611b);
        AbstractC4611b abstractC4611b2 = this.f18408b;
        if (abstractC4611b2 == null) {
            this.f18407a = abstractC4611b;
            this.f18408b = abstractC4611b;
        } else {
            abstractC4611b2.f18373b = abstractC4611b;
            this.f18408b = abstractC4611b;
        }
    }
}
