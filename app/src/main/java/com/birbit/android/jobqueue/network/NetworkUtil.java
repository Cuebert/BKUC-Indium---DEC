package com.birbit.android.jobqueue.network;

import android.content.Context;

/* loaded from: classes.dex */
public interface NetworkUtil {
    public static final int DISCONNECTED = 1;
    public static final int METERED = 2;
    public static final int UNMETERED = 3;

    int getNetworkStatus(Context context);
}
