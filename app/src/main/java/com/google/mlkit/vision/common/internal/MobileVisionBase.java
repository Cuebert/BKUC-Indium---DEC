package com.google.mlkit.vision.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0853t;
import com.appsflyer.oaid.BuildConfig;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p032c6.C1131a;
import p085g4.AbstractC3263l;
import p085g4.C3243b;
import p085g4.C3269o;
import p085g4.InterfaceC3253g;
import p087g6.AbstractC3294f;
import p140k6.C3759a;
import p309y3.C5835u6;
import p321z2.C5970c;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC0844k {

    /* renamed from: r */
    private static final C5970c f10305r = new C5970c("MobileVisionBase", BuildConfig.FLAVOR);

    /* renamed from: s */
    public static final /* synthetic */ int f10306s = 0;

    /* renamed from: n */
    private final AtomicBoolean f10307n = new AtomicBoolean(false);

    /* renamed from: o */
    private final AbstractC3294f<DetectionResultT, C3759a> f10308o;

    /* renamed from: p */
    private final C3243b f10309p;

    /* renamed from: q */
    private final Executor f10310q;

    public MobileVisionBase(@RecentlyNonNull AbstractC3294f<DetectionResultT, C3759a> abstractC3294f, @RecentlyNonNull Executor executor) {
        this.f10308o = abstractC3294f;
        C3243b c3243b = new C3243b();
        this.f10309p = c3243b;
        this.f10310q = executor;
        abstractC3294f.m14570c();
        abstractC3294f.m14568a(executor, new Callable() { // from class: l6.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = MobileVisionBase.f10306s;
                return null;
            }
        }, c3243b.m14480b()).mo14497d(new InterfaceC3253g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                MobileVisionBase.f10305r.m21259d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @RecentlyNonNull
    /* renamed from: b */
    public synchronized AbstractC3263l<DetectionResultT> m12086b(@RecentlyNonNull final C3759a c3759a) {
        C5984j.m21287k(c3759a, "InputImage can not be null");
        if (this.f10307n.get()) {
            return C3269o.m14530e(new C1131a("This detector is already closed!", 14));
        }
        if (c3759a.m15977i() >= 32 && c3759a.m15973e() >= 32) {
            return this.f10308o.m14568a(this.f10310q, new Callable() { // from class: l6.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.m12087i(c3759a);
                }
            }, this.f10309p.m14480b());
        }
        return C3269o.m14530e(new C1131a("InputImage width and height should be at least 32!", 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
    public synchronized void close() {
        if (this.f10307n.getAndSet(true)) {
            return;
        }
        this.f10309p.m14479a();
        this.f10308o.m14572e(this.f10310q);
    }

    @RecentlyNonNull
    /* renamed from: i */
    public final /* synthetic */ Object m12087i(@RecentlyNonNull C3759a c3759a) throws Exception {
        C5835u6 m20775z = C5835u6.m20775z("detectorTaskWithResource#run");
        m20775z.mo20768c();
        try {
            DetectionResultT mo14552h = this.f10308o.mo14552h(c3759a);
            m20775z.close();
            return mo14552h;
        } catch (Throwable th) {
            try {
                m20775z.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
