package p244t1;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import p233s1.C4516a;

/* renamed from: t1.a */
/* loaded from: classes.dex */
class C4610a {

    /* renamed from: a */
    AbstractC4611b f18370a = null;

    /* renamed from: b */
    final C4612c f18371b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4610a(C4612c c4612c) {
        this.f18371b = c4612c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m18701a(AbstractC4611b abstractC4611b, long j10) {
        C4516a.m18533b("add delayed message %s at time %s", abstractC4611b, Long.valueOf(j10));
        abstractC4611b.f18374c = j10;
        AbstractC4611b abstractC4611b2 = this.f18370a;
        if (abstractC4611b2 == null) {
            this.f18370a = abstractC4611b;
            return;
        }
        AbstractC4611b abstractC4611b3 = null;
        while (abstractC4611b2 != null && abstractC4611b2.f18374c <= j10) {
            abstractC4611b3 = abstractC4611b2;
            abstractC4611b2 = abstractC4611b2.f18373b;
        }
        if (abstractC4611b3 == null) {
            abstractC4611b.f18373b = this.f18370a;
            this.f18370a = abstractC4611b;
        } else {
            abstractC4611b3.f18373b = abstractC4611b;
            abstractC4611b.f18373b = abstractC4611b2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Long m18702b(long j10, MessageQueue messageQueue) {
        AbstractC4611b abstractC4611b;
        C4516a.m18533b("flushing messages at time %s", Long.valueOf(j10));
        while (true) {
            abstractC4611b = this.f18370a;
            if (abstractC4611b == null || abstractC4611b.f18374c > j10) {
                break;
            }
            this.f18370a = abstractC4611b.f18373b;
            abstractC4611b.f18373b = null;
            messageQueue.post(abstractC4611b);
        }
        if (abstractC4611b == null) {
            return null;
        }
        C4516a.m18533b("returning next ready at %d ns", Long.valueOf(abstractC4611b.f18374c - j10));
        return Long.valueOf(this.f18370a.f18374c);
    }

    /* renamed from: c */
    public void m18703c(MessagePredicate messagePredicate) {
        AbstractC4611b abstractC4611b = this.f18370a;
        AbstractC4611b abstractC4611b2 = null;
        while (abstractC4611b != null) {
            boolean onMessage = messagePredicate.onMessage(abstractC4611b);
            AbstractC4611b abstractC4611b3 = abstractC4611b.f18373b;
            if (onMessage) {
                if (abstractC4611b2 == null) {
                    this.f18370a = abstractC4611b3;
                } else {
                    abstractC4611b2.f18373b = abstractC4611b3;
                }
                this.f18371b.m18707b(abstractC4611b);
            } else {
                abstractC4611b2 = abstractC4611b;
            }
            abstractC4611b = abstractC4611b3;
        }
    }
}
