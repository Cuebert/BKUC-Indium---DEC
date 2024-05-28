package qa;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* renamed from: qa.m */
/* loaded from: classes.dex */
public class C4352m implements InterfaceC4339d {

    /* renamed from: a */
    final LinkedHashMap<String, Bitmap> f17703a;

    /* renamed from: b */
    private final int f17704b;

    /* renamed from: c */
    private int f17705c;

    /* renamed from: d */
    private int f17706d;

    /* renamed from: e */
    private int f17707e;

    /* renamed from: f */
    private int f17708f;

    /* renamed from: g */
    private int f17709g;

    public C4352m(Context context) {
        this(C4346g0.m17931b(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m17986d(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f17705c     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f17703a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r3.f17705c     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r3.f17705c     // Catch: java.lang.Throwable -> L71
            if (r0 <= r4) goto L50
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f17703a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f17703a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f17703a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r1 = r3.f17705c     // Catch: java.lang.Throwable -> L71
            int r0 = qa.C4346g0.m17940k(r0)     // Catch: java.lang.Throwable -> L71
            int r1 = r1 - r0
            r3.f17705c = r1     // Catch: java.lang.Throwable -> L71
            int r0 = r3.f17707e     // Catch: java.lang.Throwable -> L71
            int r0 = r0 + 1
            r3.f17707e = r0     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L0
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r4     // Catch: java.lang.Throwable -> L71
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.C4352m.m17986d(int):void");
    }

    @Override // qa.InterfaceC4339d
    /* renamed from: a */
    public Bitmap mo17919a(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            Bitmap bitmap = this.f17703a.get(str);
            if (bitmap != null) {
                this.f17708f++;
                return bitmap;
            }
            this.f17709g++;
            return null;
        }
    }

    @Override // qa.InterfaceC4339d
    /* renamed from: b */
    public final synchronized int mo17920b() {
        return this.f17704b;
    }

    @Override // qa.InterfaceC4339d
    /* renamed from: c */
    public void mo17921c(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            synchronized (this) {
                this.f17706d++;
                this.f17705c += C4346g0.m17940k(bitmap);
                Bitmap put = this.f17703a.put(str, bitmap);
                if (put != null) {
                    this.f17705c -= C4346g0.m17940k(put);
                }
            }
            m17986d(this.f17704b);
            return;
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // qa.InterfaceC4339d
    public final synchronized int size() {
        return this.f17705c;
    }

    public C4352m(int i10) {
        if (i10 > 0) {
            this.f17704b = i10;
            this.f17703a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }
}
