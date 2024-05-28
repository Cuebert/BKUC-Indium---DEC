package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p005a4.C0031a;
import p018b4.C0997k;
import p018b4.C1007u;
import p018b4.InterfaceC1004r;
import p070f3.C3133g;
import p070f3.InterfaceC3130d;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* loaded from: classes.dex */
public final class C1774s2 {

    /* renamed from: j */
    private static volatile C1774s2 f7220j;

    /* renamed from: a */
    private final String f7221a;

    /* renamed from: b */
    protected final InterfaceC3130d f7222b;

    /* renamed from: c */
    protected final ExecutorService f7223c;

    /* renamed from: d */
    private final C0031a f7224d;

    /* renamed from: e */
    private final List<Pair<InterfaceC1004r, Object>> f7225e;

    /* renamed from: f */
    private int f7226f;

    /* renamed from: g */
    private boolean f7227g;

    /* renamed from: h */
    private final String f7228h;

    /* renamed from: i */
    private volatile InterfaceC1562f1 f7229i;

    protected C1774s2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str != null && m8781l(str2, str3)) {
            this.f7221a = str;
        } else {
            this.f7221a = "FA";
        }
        this.f7222b = C3133g.m13786c();
        this.f7223c = C1884z0.m9116a().mo8931a(new ThreadFactoryC1529d2(this), 1);
        this.f7224d = new C0031a(this);
        this.f7225e = new ArrayList();
        try {
            if (C1007u.m6247b(context, "google_app_id", C0997k.m6226a(context)) != null && !m8777h()) {
                this.f7228h = null;
                this.f7227g = true;
                Log.w(this.f7221a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (m8781l(str2, str3)) {
            this.f7228h = str2;
        } else {
            this.f7228h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f7221a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f7221a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        m8780k(new C1773s1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f7221a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C1758r2(this));
        }
    }

    /* renamed from: h */
    protected static final boolean m8777h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m8778i(Exception exc, boolean z10, boolean z11) {
        this.f7227g |= z10;
        if (z10) {
            Log.w(this.f7221a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            m8790a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f7221a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: j */
    private final void m8779j(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        m8780k(new C1580g2(this, l10, str, str2, bundle, z10, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m8780k(AbstractRunnableC1614i2 abstractRunnableC1614i2) {
        this.f7223c.execute(abstractRunnableC1614i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m8781l(String str, String str2) {
        return (str2 == null || str == null || m8777h()) ? false : true;
    }

    /* renamed from: r */
    public static C1774s2 m8783r(Context context, String str, String str2, String str3, Bundle bundle) {
        C5984j.m21286j(context);
        if (f7220j == null) {
            synchronized (C1774s2.class) {
                if (f7220j == null) {
                    f7220j = new C1774s2(context, str, str2, str3, bundle);
                }
            }
        }
        return f7220j;
    }

    /* renamed from: C */
    public final void m8786C(String str) {
        m8780k(new C1789t1(this, str));
    }

    /* renamed from: D */
    public final void m8787D(String str, String str2, Bundle bundle) {
        m8780k(new C1725p1(this, str, str2, bundle));
    }

    /* renamed from: E */
    public final void m8788E(String str) {
        m8780k(new C1805u1(this, str));
    }

    /* renamed from: F */
    public final void m8789F(String str, String str2, Bundle bundle) {
        m8779j(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m8790a(int i10, String str, Object obj, Object obj2, Object obj3) {
        m8780k(new C1512c2(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m8791b(Bundle bundle) {
        m8780k(new C1709o1(this, bundle));
    }

    /* renamed from: c */
    public final void m8792c(Activity activity, String str, String str2) {
        m8780k(new C1757r1(this, activity, str, str2));
    }

    /* renamed from: d */
    public final void m8793d(boolean z10) {
        m8780k(new C1563f2(this, z10));
    }

    /* renamed from: e */
    public final void m8794e(String str, String str2, Object obj, boolean z10) {
        m8780k(new C1597h2(this, str, str2, obj, z10));
    }

    /* renamed from: m */
    public final int m8795m(String str) {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1546e2(this, str, binderC1494b1));
        Integer num = (Integer) BinderC1494b1.m7939J0(binderC1494b1.m7940l(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: n */
    public final long m8796n() {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1869y1(this, binderC1494b1));
        Long l10 = (Long) BinderC1494b1.m7939J0(binderC1494b1.m7940l(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f7222b.mo13781a()).nextLong();
            int i10 = this.f7226f + 1;
            this.f7226f = i10;
            return nextLong + i10;
        }
        return l10.longValue();
    }

    /* renamed from: o */
    public final C0031a m8797o() {
        return this.f7224d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final InterfaceC1562f1 m8798q(Context context, boolean z10) {
        try {
            return AbstractBinderC1545e1.asInterface(DynamiteModule.m7756e(context, DynamiteModule.f6434e, ModuleDescriptor.MODULE_ID).m7765d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C1426a e10) {
            m8778i(e10, true, false);
            return null;
        }
    }

    /* renamed from: t */
    public final String m8799t() {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1853x1(this, binderC1494b1));
        return binderC1494b1.m7942n(50L);
    }

    /* renamed from: u */
    public final String m8800u() {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1478a2(this, binderC1494b1));
        return binderC1494b1.m7942n(500L);
    }

    /* renamed from: v */
    public final String m8801v() {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1885z1(this, binderC1494b1));
        return binderC1494b1.m7942n(500L);
    }

    /* renamed from: w */
    public final String m8802w() {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1837w1(this, binderC1494b1));
        return binderC1494b1.m7942n(500L);
    }

    /* renamed from: x */
    public final List<Bundle> m8803x(String str, String str2) {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1741q1(this, str, str2, binderC1494b1));
        List<Bundle> list = (List) BinderC1494b1.m7939J0(binderC1494b1.m7940l(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: y */
    public final Map<String, Object> m8804y(String str, String str2, boolean z10) {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        m8780k(new C1495b2(this, str, str2, z10, binderC1494b1));
        Bundle m7940l = binderC1494b1.m7940l(5000L);
        if (m7940l != null && m7940l.size() != 0) {
            HashMap hashMap = new HashMap(m7940l.size());
            for (String str3 : m7940l.keySet()) {
                Object obj = m7940l.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
