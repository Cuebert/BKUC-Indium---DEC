package com.birbit.android.jobqueue.messaging;

import p244t1.AbstractC4611b;
import p244t1.AbstractC4613d;

/* loaded from: classes.dex */
public interface MessageQueue {
    void cancelMessages(MessagePredicate messagePredicate);

    void clear();

    void consume(AbstractC4613d abstractC4613d);

    void post(AbstractC4611b abstractC4611b);

    void postAt(AbstractC4611b abstractC4611b, long j10);

    void stop();
}
