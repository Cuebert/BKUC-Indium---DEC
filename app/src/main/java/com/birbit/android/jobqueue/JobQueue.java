package com.birbit.android.jobqueue;

import java.util.Set;

/* loaded from: classes.dex */
public interface JobQueue {
    void clear();

    int count();

    int countReadyJobs(C1290c c1290c);

    C1293f findJobById(String str);

    Set<C1293f> findJobs(C1290c c1290c);

    Long getNextJobDelayUntilNs(C1290c c1290c);

    boolean insert(C1293f c1293f);

    boolean insertOrReplace(C1293f c1293f);

    C1293f nextJobAndIncRunCount(C1290c c1290c);

    void onJobCancelled(C1293f c1293f);

    void remove(C1293f c1293f);

    void substitute(C1293f c1293f, C1293f c1293f2);
}
