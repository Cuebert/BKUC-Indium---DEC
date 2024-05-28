package com.birbit.android.jobqueue.callback;

import com.birbit.android.jobqueue.AbstractC1292e;

/* loaded from: classes.dex */
public interface JobManagerCallback {
    public static final int RESULT_CANCEL_CANCELLED_VIA_SHOULD_RE_RUN = 5;
    public static final int RESULT_CANCEL_CANCELLED_WHILE_RUNNING = 3;
    public static final int RESULT_CANCEL_REACHED_RETRY_LIMIT = 2;
    public static final int RESULT_CANCEL_SINGLE_INSTANCE_WHILE_RUNNING = 6;
    public static final int RESULT_FAIL_WILL_RETRY = 4;
    public static final int RESULT_SUCCEED = 1;

    void onAfterJobRun(AbstractC1292e abstractC1292e, int i10);

    void onDone(AbstractC1292e abstractC1292e);

    void onJobAdded(AbstractC1292e abstractC1292e);

    void onJobCancelled(AbstractC1292e abstractC1292e, boolean z10);

    void onJobRun(AbstractC1292e abstractC1292e, int i10);
}
