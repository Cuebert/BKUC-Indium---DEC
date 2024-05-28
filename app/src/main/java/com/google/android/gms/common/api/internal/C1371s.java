package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1388b;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p070f3.C3128b;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3251f;
import p295x2.C5507b;
import p308y2.C5602b;
import p321z2.C5986k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes.dex */
public final class C1371s<T> implements InterfaceC3251f<T> {

    /* renamed from: a */
    private final C1350c f6240a;

    /* renamed from: b */
    private final int f6241b;

    /* renamed from: c */
    private final C5602b<?> f6242c;

    /* renamed from: d */
    private final long f6243d;

    /* renamed from: e */
    private final long f6244e;

    C1371s(C1350c c1350c, int i10, C5602b<?> c5602b, long j10, long j11, String str, String str2) {
        this.f6240a = c1350c;
        this.f6241b = i10;
        this.f6242c = c5602b;
        this.f6243d = j10;
        this.f6244e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> C1371s<T> m7584b(C1350c c1350c, int i10, C5602b<?> c5602b) {
        boolean z10;
        if (!c1350c.m7492g()) {
            return null;
        }
        RootTelemetryConfiguration m21294a = C5986k.m21293b().m21294a();
        if (m21294a == null) {
            z10 = true;
        } else {
            if (!m21294a.m7625z()) {
                return null;
            }
            z10 = m21294a.m7621A();
            C1367o m7495x = c1350c.m7495x(c5602b);
            if (m7495x != null) {
                if (!(m7495x.m7572v() instanceof AbstractC1388b)) {
                    return null;
                }
                AbstractC1388b abstractC1388b = (AbstractC1388b) m7495x.m7572v();
                if (abstractC1388b.m7649J() && !abstractC1388b.m7666i()) {
                    ConnectionTelemetryConfiguration m7585c = m7585c(m7495x, abstractC1388b, i10);
                    if (m7585c == null) {
                        return null;
                    }
                    m7495x.m7556G();
                    z10 = m7585c.m7615B();
                }
            }
        }
        return new C1371s<>(c1350c, i10, c5602b, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* renamed from: c */
    private static ConnectionTelemetryConfiguration m7585c(C1367o<?> c1367o, AbstractC1388b<?> abstractC1388b, int i10) {
        int[] m7618y;
        int[] m7619z;
        ConnectionTelemetryConfiguration m7648H = abstractC1388b.m7648H();
        if (m7648H == null || !m7648H.m7614A() || ((m7618y = m7648H.m7618y()) != null ? !C3128b.m13778b(m7618y, i10) : !((m7619z = m7648H.m7619z()) == null || !C3128b.m13778b(m7619z, i10))) || c1367o.m7570s() >= m7648H.m7617x()) {
            return null;
        }
        return m7648H;
    }

    @Override // p085g4.InterfaceC3251f
    /* renamed from: a */
    public final void mo7517a(AbstractC3263l<T> abstractC3263l) {
        C1367o m7495x;
        int i10;
        int i11;
        int i12;
        int i13;
        int m7380x;
        long j10;
        long j11;
        int i14;
        if (this.f6240a.m7492g()) {
            RootTelemetryConfiguration m21294a = C5986k.m21293b().m21294a();
            if ((m21294a == null || m21294a.m7625z()) && (m7495x = this.f6240a.m7495x(this.f6242c)) != null && (m7495x.m7572v() instanceof AbstractC1388b)) {
                AbstractC1388b abstractC1388b = (AbstractC1388b) m7495x.m7572v();
                boolean z10 = this.f6243d > 0;
                int m7680z = abstractC1388b.m7680z();
                if (m21294a != null) {
                    z10 &= m21294a.m7621A();
                    int m7623x = m21294a.m7623x();
                    int m7624y = m21294a.m7624y();
                    i10 = m21294a.m7622B();
                    if (abstractC1388b.m7649J() && !abstractC1388b.m7666i()) {
                        ConnectionTelemetryConfiguration m7585c = m7585c(m7495x, abstractC1388b, this.f6241b);
                        if (m7585c == null) {
                            return;
                        }
                        boolean z11 = m7585c.m7615B() && this.f6243d > 0;
                        m7624y = m7585c.m7617x();
                        z10 = z11;
                    }
                    i11 = m7623x;
                    i12 = m7624y;
                } else {
                    i10 = 0;
                    i11 = 5000;
                    i12 = 100;
                }
                C1350c c1350c = this.f6240a;
                if (abstractC3263l.mo14508o()) {
                    i13 = 0;
                    m7380x = 0;
                } else {
                    if (abstractC3263l.mo14506m()) {
                        i13 = 100;
                    } else {
                        Exception mo14503j = abstractC3263l.mo14503j();
                        if (mo14503j instanceof C5507b) {
                            Status m20259a = ((C5507b) mo14503j).m20259a();
                            int m7415y = m20259a.m7415y();
                            ConnectionResult m7414x = m20259a.m7414x();
                            m7380x = m7414x == null ? -1 : m7414x.m7380x();
                            i13 = m7415y;
                        } else {
                            i13 = 101;
                        }
                    }
                    m7380x = -1;
                }
                if (z10) {
                    long j12 = this.f6243d;
                    j11 = System.currentTimeMillis();
                    j10 = j12;
                    i14 = (int) (SystemClock.elapsedRealtime() - this.f6244e);
                } else {
                    j10 = 0;
                    j11 = 0;
                    i14 = -1;
                }
                c1350c.m7486I(new MethodInvocation(this.f6241b, i13, m7380x, j10, j11, null, null, m7680z, i14), i10, i11, i12);
            }
        }
    }
}
