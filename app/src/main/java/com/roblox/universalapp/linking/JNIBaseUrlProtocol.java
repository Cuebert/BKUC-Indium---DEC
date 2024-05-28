package com.roblox.universalapp.linking;

import android.content.Context;

/* loaded from: classes.dex */
public class JNIBaseUrlProtocol {
    public static native void init(Context context);

    public static native void maybeHandleColdStartProtocolLaunch(String str);
}
