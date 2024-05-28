package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import p259u3.HandlerC4845e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.i */
/* loaded from: classes.dex */
public final class HandlerC2592i extends HandlerC4845e {

    /* renamed from: a */
    private final /* synthetic */ C2586f f10196a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2592i(C2586f c2586f, Looper looper) {
        super(looper);
        this.f10196a = c2586f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f10196a.m11936d(message);
    }
}
