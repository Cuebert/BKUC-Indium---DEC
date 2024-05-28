package com.birbit.android.jobqueue;

/* loaded from: classes.dex */
public interface IntCallback {

    /* loaded from: classes.dex */
    public interface MessageWithCallback {
        void setCallback(IntCallback intCallback);
    }

    void onResult(int i10);
}
