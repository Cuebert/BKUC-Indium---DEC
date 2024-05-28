package com.birbit.android.jobqueue.scheduling;

import android.content.Context;
import p269v1.C4938a;

/* loaded from: classes.dex */
public abstract class Scheduler {

    /* renamed from: a */
    private Callback f5911a;

    /* renamed from: b */
    private Context f5912b;

    /* loaded from: classes.dex */
    public interface Callback {
        boolean start(C4938a c4938a);

        boolean stop(C4938a c4938a);
    }

    /* renamed from: a */
    public abstract void mo7185a();

    /* renamed from: b */
    public void mo7186b(Context context, Callback callback) {
        this.f5912b = context.getApplicationContext();
        this.f5911a = callback;
    }

    /* renamed from: c */
    public abstract void mo7187c(C4938a c4938a, boolean z10);

    /* renamed from: d */
    public abstract void mo7188d(C4938a c4938a);

    /* renamed from: e */
    public final boolean m7189e(C4938a c4938a) {
        Callback callback = this.f5911a;
        if (callback != null) {
            return callback.start(c4938a);
        }
        throw new IllegalStateException("JobManager callback is not configured");
    }

    /* renamed from: f */
    public final boolean m7190f(C4938a c4938a) {
        Callback callback = this.f5911a;
        if (callback != null) {
            return callback.stop(c4938a);
        }
        throw new IllegalStateException("JobManager callback is not configured");
    }
}
