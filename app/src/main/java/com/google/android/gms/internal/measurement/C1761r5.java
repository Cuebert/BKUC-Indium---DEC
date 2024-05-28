package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p093h0.C3356a;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* loaded from: classes.dex */
public final class C1761r5 implements InterfaceC1825v5 {

    /* renamed from: g */
    private static final Map<Uri, C1761r5> f7194g = new C3356a();

    /* renamed from: h */
    public static final String[] f7195h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f7196a;

    /* renamed from: b */
    private final Uri f7197b;

    /* renamed from: c */
    private final ContentObserver f7198c;

    /* renamed from: d */
    private final Object f7199d;

    /* renamed from: e */
    private volatile Map<String, String> f7200e;

    /* renamed from: f */
    private final List<InterfaceC1777s5> f7201f;

    private C1761r5(ContentResolver contentResolver, Uri uri) {
        C1729p5 c1729p5 = new C1729p5(this, null);
        this.f7198c = c1729p5;
        this.f7199d = new Object();
        this.f7201f = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f7196a = contentResolver;
        this.f7197b = uri;
        contentResolver.registerContentObserver(uri, false, c1729p5);
    }

    /* renamed from: b */
    public static C1761r5 m8759b(ContentResolver contentResolver, Uri uri) {
        C1761r5 c1761r5;
        synchronized (C1761r5.class) {
            Map<Uri, C1761r5> map = f7194g;
            c1761r5 = map.get(uri);
            if (c1761r5 == null) {
                try {
                    C1761r5 c1761r52 = new C1761r5(contentResolver, uri);
                    try {
                        map.put(uri, c1761r52);
                    } catch (SecurityException unused) {
                    }
                    c1761r5 = c1761r52;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1761r5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static synchronized void m8760e() {
        synchronized (C1761r5.class) {
            for (C1761r5 c1761r5 : f7194g.values()) {
                c1761r5.f7196a.unregisterContentObserver(c1761r5.f7198c);
            }
            f7194g.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1825v5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8459a(String str) {
        return m8761c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final Map<String, String> m8761c() {
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3 = this.f7200e;
        Map<String, String> map4 = map3;
        if (map3 == null) {
            synchronized (this.f7199d) {
                Map<String, String> map5 = this.f7200e;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) C1793t5.m8845a(new InterfaceC1809u5() { // from class: com.google.android.gms.internal.measurement.o5
                                @Override // com.google.android.gms.internal.measurement.InterfaceC1809u5
                                public final Object zza() {
                                    return C1761r5.this.m8762d();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map2 = null;
                        }
                        this.f7200e = map2;
                        allowThreadDiskReads = map2;
                        map = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map;
        }
        return map4 != null ? map4 : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map m8762d() {
        Map hashMap;
        Cursor query = this.f7196a.query(this.f7197b, f7195h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C3356a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void m8763f() {
        synchronized (this.f7199d) {
            this.f7200e = null;
            AbstractC1666l6.m8379e();
        }
        synchronized (this) {
            Iterator<InterfaceC1777s5> it = this.f7201f.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
