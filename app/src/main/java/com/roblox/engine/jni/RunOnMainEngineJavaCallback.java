package com.roblox.engine.jni;

import android.os.Handler;
import com.roblox.engine.jni.model.NativeTextBoxInfo;

/* loaded from: classes.dex */
public class RunOnMainEngineJavaCallback extends EngineJavaCallbackWrapper {

    /* renamed from: b */
    private Handler f11966b;

    public RunOnMainEngineJavaCallback(Handler handler, EngineJavaCallback2 engineJavaCallback2) {
        super(engineJavaCallback2);
        this.f11966b = handler;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: a */
    public void mo13258a(final int i10) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.6
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13258a(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: b */
    public void mo12557b(final long j10) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.11
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12557b(j10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: c */
    public void mo13259c(final int i10) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.15
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13259c(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: d */
    public void mo13260d() {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.2
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13260d();
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: e */
    public void mo12558e(final String str) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.7
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12558e(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: f */
    public void mo12559f(final String str, final String str2) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.10
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12559f(str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: g */
    public void mo13261g(final String str) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.12
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13261g(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: h */
    public void mo13262h() {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.13
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13262h();
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: i */
    public void mo12560i(final String str, final String str2) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.9
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12560i(str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: j */
    public void mo12561j(final long j10, final String str) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.4
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12561j(j10, str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: k */
    public void mo12562k(final long j10, final String str, final String str2) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.3
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12562k(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: l */
    public void mo12563l(final long j10, final String str, final String str2) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.5
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo12563l(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: m */
    public void mo13263m(final String str) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.14
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13263m(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: n */
    public void mo13264n(final int i10) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.8
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13264n(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: o */
    public void mo13265o(final long j10, final boolean z10, final byte[] bArr, final NativeTextBoxInfo nativeTextBoxInfo) {
        this.f11966b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.1
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo13265o(j10, z10, bArr, nativeTextBoxInfo);
            }
        });
    }
}
