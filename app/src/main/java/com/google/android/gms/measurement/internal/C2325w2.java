package com.google.android.gms.measurement.internal;

import p018b4.C0988b;

/* renamed from: com.google.android.gms.measurement.internal.w2 */
/* loaded from: classes.dex */
public final class C2325w2<V> {

    /* renamed from: h */
    private static final Object f8621h = new Object();

    /* renamed from: a */
    private final String f8622a;

    /* renamed from: b */
    private final InterfaceC2305u2<V> f8623b;

    /* renamed from: c */
    private final V f8624c;

    /* renamed from: d */
    private final V f8625d;

    /* renamed from: e */
    private final Object f8626e = new Object();

    /* renamed from: f */
    private volatile V f8627f = null;

    /* renamed from: g */
    private volatile V f8628g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C2325w2(String str, Object obj, Object obj2, InterfaceC2305u2 interfaceC2305u2, C0988b c0988b) {
        this.f8622a = str;
        this.f8624c = obj;
        this.f8625d = obj2;
        this.f8623b = interfaceC2305u2;
    }

    /* renamed from: a */
    public final V m10317a(V v10) {
        synchronized (this.f8626e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (C2315v2.f8607a != null) {
            synchronized (f8621h) {
                if (C2093b.m9730a()) {
                    return this.f8628g == null ? this.f8624c : this.f8628g;
                }
                try {
                    for (C2325w2 c2325w2 : C2335x2.m10329b()) {
                        if (!C2093b.m9730a()) {
                            V v11 = null;
                            try {
                                InterfaceC2305u2<V> interfaceC2305u2 = c2325w2.f8623b;
                                if (interfaceC2305u2 != null) {
                                    v11 = interfaceC2305u2.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f8621h) {
                                c2325w2.f8628g = v11;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC2305u2<V> interfaceC2305u22 = this.f8623b;
                if (interfaceC2305u22 == null) {
                    return this.f8624c;
                }
                try {
                    return interfaceC2305u22.zza();
                } catch (IllegalStateException unused3) {
                    return this.f8624c;
                } catch (SecurityException unused4) {
                    return this.f8624c;
                }
            }
        }
        return this.f8624c;
    }

    /* renamed from: b */
    public final String m10318b() {
        return this.f8622a;
    }
}
