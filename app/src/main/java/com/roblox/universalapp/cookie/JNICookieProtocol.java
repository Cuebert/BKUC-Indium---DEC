package com.roblox.universalapp.cookie;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class JNICookieProtocol {

    /* renamed from: a */
    private static AtomicInteger f12119a = new AtomicInteger();

    /* renamed from: b */
    private static JNICookieProtocol f12120b;

    /* loaded from: classes.dex */
    public interface OnSetCookieHandler {
    }

    /* renamed from: a */
    public static JNICookieProtocol m13357a() {
        if (f12119a.getAndIncrement() == 0) {
            f12120b = new JNICookieProtocol();
        }
        return f12120b;
    }

    public native void updateOnSetCookieHandler(OnSetCookieHandler onSetCookieHandler);
}
