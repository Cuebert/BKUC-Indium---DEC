package com.birbit.android.jobqueue;

import p208q1.C4292a;

/* loaded from: classes.dex */
public interface QueueFactory {
    JobQueue createNonPersistent(C4292a c4292a, long j10);

    JobQueue createPersistentQueue(C4292a c4292a, long j10);
}
