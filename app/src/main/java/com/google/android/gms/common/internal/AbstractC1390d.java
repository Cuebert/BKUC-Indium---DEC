package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
import p321z2.C5993n0;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC1390d {

    /* renamed from: a */
    private static final Object f6345a = new Object();

    /* renamed from: b */
    private static C1408v f6346b;

    /* renamed from: c */
    static HandlerThread f6347c;

    /* renamed from: d */
    private static Executor f6348d;

    /* renamed from: e */
    private static boolean f6349e;

    /* renamed from: a */
    public static int m7688a() {
        return 4225;
    }

    /* renamed from: b */
    public static AbstractC1390d m7689b(Context context) {
        Looper mainLooper;
        synchronized (f6345a) {
            if (f6346b == null) {
                Context applicationContext = context.getApplicationContext();
                if (f6349e) {
                    mainLooper = m7690c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f6346b = new C1408v(applicationContext, mainLooper, f6348d);
            }
        }
        return f6346b;
    }

    /* renamed from: c */
    public static HandlerThread m7690c() {
        synchronized (f6345a) {
            HandlerThread handlerThread = f6347c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f6347c = handlerThread2;
            handlerThread2.start();
            return f6347c;
        }
    }

    /* renamed from: d */
    protected abstract void mo7691d(C5993n0 c5993n0, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m7692e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        mo7691d(new C5993n0(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* renamed from: f */
    public abstract boolean mo7693f(C5993n0 c5993n0, ServiceConnection serviceConnection, String str, Executor executor);
}
