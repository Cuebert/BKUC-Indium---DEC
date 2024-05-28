package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* loaded from: classes.dex */
public final class C2164h4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f8134a;

    /* renamed from: b */
    final /* synthetic */ C2197k4 f8135b;

    public C2164h4(C2197k4 c2197k4, String str) {
        this.f8135b = c2197k4;
        C5984j.m21286j(str);
        this.f8134a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f8135b.f8118a.mo9765d().m10048r().m9894b(this.f8134a, th);
    }
}
