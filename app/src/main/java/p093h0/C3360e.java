package p093h0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: h0.e */
/* loaded from: classes.dex */
public class C3360e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f14078a;

    /* renamed from: b */
    private int f14079b;

    /* renamed from: c */
    private int f14080c;

    /* renamed from: d */
    private int f14081d;

    /* renamed from: e */
    private int f14082e;

    /* renamed from: f */
    private int f14083f;

    /* renamed from: g */
    private int f14084g;

    /* renamed from: h */
    private int f14085h;

    public C3360e(int i10) {
        if (i10 > 0) {
            this.f14080c = i10;
            this.f14078a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: f */
    private int m14814f(K k10, V v10) {
        int m14818g = m14818g(k10, v10);
        if (m14818g >= 0) {
            return m14818g;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    /* renamed from: a */
    protected V mo9812a(K k10) {
        return null;
    }

    /* renamed from: b */
    protected void mo7183b(boolean z10, K k10, V v10, V v11) {
    }

    /* renamed from: c */
    public final V m14815c(K k10) {
        V v10;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            V v11 = this.f14078a.get(k10);
            if (v11 != null) {
                this.f14084g++;
                return v11;
            }
            this.f14085h++;
            V mo9812a = mo9812a(k10);
            if (mo9812a == null) {
                return null;
            }
            synchronized (this) {
                this.f14082e++;
                v10 = (V) this.f14078a.put(k10, mo9812a);
                if (v10 != null) {
                    this.f14078a.put(k10, v10);
                } else {
                    this.f14079b += m14814f(k10, mo9812a);
                }
            }
            if (v10 != null) {
                mo7183b(false, k10, mo9812a, v10);
                return v10;
            }
            m14820i(this.f14080c);
            return mo9812a;
        }
    }

    /* renamed from: d */
    public final V m14816d(K k10, V v10) {
        V put;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                this.f14081d++;
                this.f14079b += m14814f(k10, v10);
                put = this.f14078a.put(k10, v10);
                if (put != null) {
                    this.f14079b -= m14814f(k10, put);
                }
            }
            if (put != null) {
                mo7183b(false, k10, put, v10);
            }
            m14820i(this.f14080c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: e */
    public final V m14817e(K k10) {
        V remove;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            remove = this.f14078a.remove(k10);
            if (remove != null) {
                this.f14079b -= m14814f(k10, remove);
            }
        }
        if (remove != null) {
            mo7183b(false, k10, remove, null);
        }
        return remove;
    }

    /* renamed from: g */
    protected int m14818g(K k10, V v10) {
        return 1;
    }

    /* renamed from: h */
    public final synchronized Map<K, V> m14819h() {
        return new LinkedHashMap(this.f14078a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m14820i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f14079b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f14078a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f14079b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f14079b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f14078a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f14078a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f14078a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f14079b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m14814f(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f14079b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f14083f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f14083f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.mo7183b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p093h0.C3360e.m14820i(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f14084g;
        i11 = this.f14085h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f14080c), Integer.valueOf(this.f14084g), Integer.valueOf(this.f14085h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
