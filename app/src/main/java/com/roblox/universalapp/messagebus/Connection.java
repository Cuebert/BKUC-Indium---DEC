package com.roblox.universalapp.messagebus;

/* loaded from: classes.dex */
public class Connection {

    /* renamed from: a */
    private long f12121a;

    Connection(long j10) {
        this.f12121a = j10;
    }

    private native void deleteSharedPtr(long j10);

    private native boolean isConnected(long j10);

    /* renamed from: a */
    public void m13359a() {
        deleteSharedPtr(this.f12121a);
    }

    public void finalize() {
        deleteSharedPtr(this.f12121a);
    }
}
