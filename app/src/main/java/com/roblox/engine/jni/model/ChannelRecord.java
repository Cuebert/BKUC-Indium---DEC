package com.roblox.engine.jni.model;

/* loaded from: classes.dex */
public class ChannelRecord {

    /* renamed from: a */
    private String f12085a;

    /* renamed from: b */
    private long f12086b;

    public ChannelRecord(String str, long j10) {
        this.f12085a = str;
        this.f12086b = j10;
    }

    /* renamed from: a */
    public String m13325a() {
        return this.f12085a;
    }

    /* renamed from: b */
    public boolean m13326b(long j10) {
        return this.f12086b < j10;
    }

    /* renamed from: c */
    public boolean m13327c() {
        return 0 == this.f12086b;
    }
}
