package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p222r3.HandlerC4427f;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.f */
/* loaded from: classes.dex */
public final class HandlerC1383f extends HandlerC4427f {

    /* renamed from: a */
    private final Context f6267a;

    /* renamed from: b */
    final /* synthetic */ C1342a f6268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1383f(C1342a c1342a, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6268b = c1342a;
        this.f6267a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int mo7390g = this.f6268b.mo7390g(this.f6267a);
        if (this.f6268b.mo7392j(mo7390g)) {
            this.f6268b.m7397q(this.f6267a, mo7390g);
        }
    }
}
