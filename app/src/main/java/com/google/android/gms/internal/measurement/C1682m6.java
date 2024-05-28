package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p093h0.C3356a;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
/* loaded from: classes.dex */
public final class C1682m6 implements InterfaceC1825v5 {

    /* renamed from: b */
    private static final Map<String, C1682m6> f7008b = new C3356a();

    /* renamed from: a */
    private final SharedPreferences f7009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1682m6 m8457b(Context context, String str) {
        C1682m6 c1682m6;
        if (!C1681m5.m8456a()) {
            synchronized (C1682m6.class) {
                c1682m6 = f7008b.get(null);
                if (c1682m6 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return c1682m6;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static synchronized void m8458c() {
        synchronized (C1682m6.class) {
            Map<String, C1682m6> map = f7008b;
            Iterator<C1682m6> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().f7009a;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1825v5
    /* renamed from: a */
    public final Object mo8459a(String str) {
        throw null;
    }
}
