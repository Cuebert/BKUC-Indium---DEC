package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p070f3.C3127a;
import p070f3.C3135i;
import p110i3.BinderC3517b;
import p321z2.AbstractBinderC5981h0;
import p321z2.C5984j;
import p321z2.InterfaceC5983i0;

/* renamed from: com.google.android.gms.common.r */
/* loaded from: classes.dex */
public final class C1419r {

    /* renamed from: e */
    private static volatile InterfaceC5983i0 f6408e;

    /* renamed from: g */
    private static Context f6410g;

    /* renamed from: a */
    static final AbstractBinderC1417p f6404a = new BinderC1411j(AbstractBinderC1415n.m7730n("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC1417p f6405b = new BinderC1412k(AbstractBinderC1415n.m7730n("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC1417p f6406c = new BinderC1413l(AbstractBinderC1415n.m7730n("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC1417p f6407d = new BinderC1414m(AbstractBinderC1415n.m7730n("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f6409f = new Object();

    /* renamed from: a */
    public static C1424w m7734a(String str, AbstractBinderC1415n abstractBinderC1415n, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m7739f(str, abstractBinderC1415n, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C1424w m7735b(String str, boolean z10, boolean z11, boolean z12) {
        return m7740g(str, z10, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m7736c(boolean z10, String str, AbstractBinderC1415n abstractBinderC1415n) throws Exception {
        String str2 = true != (!z10 && m7739f(str, abstractBinderC1415n, true, false).f6413a) ? "not allowed" : "debug cert rejected";
        MessageDigest m13776b = C3127a.m13776b("SHA-256");
        C5984j.m21286j(m13776b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, C3135i.m13794a(m13776b.digest(abstractBinderC1415n.mo7731J0())), Boolean.valueOf(z10), "12451000.false");
    }

    /* renamed from: d */
    public static synchronized void m7737d(Context context) {
        synchronized (C1419r.class) {
            if (f6410g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f6410g = context.getApplicationContext();
            }
        }
    }

    /* renamed from: e */
    public static boolean m7738e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m7741h();
                return f6408e.mo21265e();
            } catch (RemoteException | DynamiteModule.C1426a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: f */
    private static C1424w m7739f(String str, AbstractBinderC1415n abstractBinderC1415n, boolean z10, boolean z11) {
        try {
            m7741h();
            C5984j.m21286j(f6410g);
            try {
                return f6408e.mo21264L(new zzs(str, abstractBinderC1415n, z10, z11), BinderC3517b.m15328J0(f6410g.getPackageManager())) ? C1424w.m7743b() : new C1423v(new Callable() { // from class: com.google.android.gms.common.i

                    /* renamed from: a */
                    public final /* synthetic */ boolean f6269a;

                    /* renamed from: b */
                    public final /* synthetic */ String f6270b;

                    /* renamed from: c */
                    public final /* synthetic */ AbstractBinderC1415n f6271c;

                    public /* synthetic */ CallableC1386i(boolean z102, String str2, AbstractBinderC1415n abstractBinderC1415n2) {
                        r1 = z102;
                        r2 = str2;
                        r3 = abstractBinderC1415n2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C1419r.m7736c(r1, r2, r3);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C1424w.m7745d("module call", e10);
            }
        } catch (DynamiteModule.C1426a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C1424w.m7745d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [i3.a, android.os.IBinder] */
    /* renamed from: g */
    private static C1424w m7740g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        C1424w m7745d;
        zzq mo21266s;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C5984j.m21286j(f6410g);
            try {
                m7741h();
                zzo zzoVar = new zzo(str, z10, false, BinderC3517b.m15328J0(f6410g), false, true);
                try {
                    if (z13) {
                        mo21266s = f6408e.mo21267w0(zzoVar);
                    } else {
                        mo21266s = f6408e.mo21266s(zzoVar);
                    }
                    if (mo21266s.m7752y()) {
                        m7745d = C1424w.m7746f(mo21266s.m7753z());
                    } else {
                        String m7751x = mo21266s.m7751x();
                        PackageManager.NameNotFoundException nameNotFoundException = mo21266s.m7750A() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (m7751x == null) {
                            m7751x = "error checking package certificate";
                        }
                        m7745d = C1424w.m7747g(mo21266s.m7753z(), mo21266s.m7750A(), m7751x, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    m7745d = C1424w.m7745d("module call", e10);
                }
            } catch (DynamiteModule.C1426a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                m7745d = C1424w.m7745d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            return m7745d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: h */
    private static void m7741h() throws DynamiteModule.C1426a {
        if (f6408e != null) {
            return;
        }
        C5984j.m21286j(f6410g);
        synchronized (f6409f) {
            if (f6408e == null) {
                f6408e = AbstractBinderC5981h0.m21273l(DynamiteModule.m7756e(f6410g, DynamiteModule.f6435f, "com.google.android.gms.googlecertificates").m7765d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
