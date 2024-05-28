package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes.dex */
public final class C1509c {

    /* renamed from: a */
    private C1492b f6708a;

    /* renamed from: b */
    private C1492b f6709b;

    /* renamed from: c */
    private final List<C1492b> f6710c;

    public C1509c() {
        this.f6708a = new C1492b(BuildConfig.FLAVOR, 0L, null);
        this.f6709b = new C1492b(BuildConfig.FLAVOR, 0L, null);
        this.f6710c = new ArrayList();
    }

    /* renamed from: a */
    public final C1492b m7967a() {
        return this.f6708a;
    }

    /* renamed from: b */
    public final C1492b m7968b() {
        return this.f6709b;
    }

    /* renamed from: c */
    public final List<C1492b> m7969c() {
        return this.f6710c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1509c c1509c = new C1509c(this.f6708a.clone());
        Iterator<C1492b> it = this.f6710c.iterator();
        while (it.hasNext()) {
            c1509c.f6710c.add(it.next().clone());
        }
        return c1509c;
    }

    /* renamed from: d */
    public final void m7970d(C1492b c1492b) {
        this.f6708a = c1492b;
        this.f6709b = c1492b.clone();
        this.f6710c.clear();
    }

    /* renamed from: e */
    public final void m7971e(String str, long j10, Map<String, Object> map) {
        this.f6710c.add(new C1492b(str, j10, map));
    }

    /* renamed from: f */
    public final void m7972f(C1492b c1492b) {
        this.f6709b = c1492b;
    }

    public C1509c(C1492b c1492b) {
        this.f6708a = c1492b;
        this.f6709b = c1492b.clone();
        this.f6710c = new ArrayList();
    }
}
