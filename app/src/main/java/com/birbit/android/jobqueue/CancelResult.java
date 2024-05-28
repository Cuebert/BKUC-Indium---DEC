package com.birbit.android.jobqueue;

import java.util.Collection;

/* loaded from: classes.dex */
public class CancelResult {

    /* renamed from: a */
    Collection<AbstractC1292e> f5730a;

    /* renamed from: b */
    Collection<AbstractC1292e> f5731b;

    /* loaded from: classes.dex */
    public interface AsyncCancelCallback {
        void onCancelled(CancelResult cancelResult);
    }

    public CancelResult(Collection<AbstractC1292e> collection, Collection<AbstractC1292e> collection2) {
        this.f5730a = collection;
        this.f5731b = collection2;
    }
}
