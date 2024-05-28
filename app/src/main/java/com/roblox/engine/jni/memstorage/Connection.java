package com.roblox.engine.jni.memstorage;

/* loaded from: classes.dex */
public class Connection {
    private long ref;

    Connection(long j10) {
        this.ref = j10;
    }

    private static native void disconnect(Connection connection);

    private static native void releaseConnection(Connection connection);

    public void disconnect() {
        disconnect(this);
    }

    public void finalize() {
        releaseConnection(this);
    }
}
