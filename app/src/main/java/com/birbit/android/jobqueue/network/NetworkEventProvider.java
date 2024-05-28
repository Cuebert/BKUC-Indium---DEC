package com.birbit.android.jobqueue.network;

/* loaded from: classes.dex */
public interface NetworkEventProvider {

    /* loaded from: classes.dex */
    public interface Listener {
        void onNetworkChange(int i10);
    }

    void setListener(Listener listener);
}
