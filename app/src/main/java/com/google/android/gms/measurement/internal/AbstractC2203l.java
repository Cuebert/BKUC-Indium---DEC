package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC1477a1;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes.dex */
public abstract class AbstractC2203l {

    /* renamed from: d */
    private static volatile Handler f8253d;

    /* renamed from: a */
    private final InterfaceC2176i5 f8254a;

    /* renamed from: b */
    private final Runnable f8255b;

    /* renamed from: c */
    private volatile long f8256c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2203l(InterfaceC2176i5 interfaceC2176i5) {
        C5984j.m21286j(interfaceC2176i5);
        this.f8254a = interfaceC2176i5;
        this.f8255b = new RunnableC2192k(this, interfaceC2176i5);
    }

    /* renamed from: f */
    private final Handler m10083f() {
        Handler handler;
        if (f8253d != null) {
            return f8253d;
        }
        synchronized (AbstractC2203l.class) {
            if (f8253d == null) {
                f8253d = new HandlerC1477a1(this.f8254a.mo9763c().getMainLooper());
            }
            handler = f8253d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10084b() {
        this.f8256c = 0L;
        m10083f().removeCallbacks(this.f8255b);
    }

    /* renamed from: c */
    public abstract void mo9925c();

    /* renamed from: d */
    public final void m10085d(long j10) {
        m10084b();
        if (j10 >= 0) {
            this.f8256c = this.f8254a.mo9767e().mo13781a();
            if (m10083f().postDelayed(this.f8255b, j10)) {
                return;
            }
            this.f8254a.mo9765d().m10048r().m9894b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    /* renamed from: e */
    public final boolean m10086e() {
        return this.f8256c != 0;
    }
}
