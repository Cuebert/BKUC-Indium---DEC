package p321z2;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: z2.k */
/* loaded from: classes.dex */
public final class C5986k {

    /* renamed from: b */
    private static C5986k f22053b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f22054c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    private RootTelemetryConfiguration f22055a;

    private C5986k() {
    }

    /* renamed from: b */
    public static synchronized C5986k m21293b() {
        C5986k c5986k;
        synchronized (C5986k.class) {
            if (f22053b == null) {
                f22053b = new C5986k();
            }
            c5986k = f22053b;
        }
        return c5986k;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration m21294a() {
        return this.f22055a;
    }

    /* renamed from: c */
    public final synchronized void m21295c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f22055a = f22054c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f22055a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.m7622B() < rootTelemetryConfiguration.m7622B()) {
            this.f22055a = rootTelemetryConfiguration;
        }
    }
}
