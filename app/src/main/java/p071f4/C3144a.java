package p071f4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p043d3.C2966a;
import p070f3.C3139m;
import p070f3.C3141o;
import p321z2.C5984j;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public class C3144a {

    /* renamed from: n */
    private static ScheduledExecutorService f13162n;

    /* renamed from: o */
    private static volatile a f13163o = new C3145b();

    /* renamed from: a */
    private final Object f13164a;

    /* renamed from: b */
    private final PowerManager.WakeLock f13165b;

    /* renamed from: c */
    private WorkSource f13166c;

    /* renamed from: d */
    private final int f13167d;

    /* renamed from: e */
    private final String f13168e;

    /* renamed from: f */
    private final String f13169f;

    /* renamed from: g */
    private final String f13170g;

    /* renamed from: h */
    private final Context f13171h;

    /* renamed from: i */
    private boolean f13172i;

    /* renamed from: j */
    private final Map<String, Integer[]> f13173j;

    /* renamed from: k */
    private final Set<Future<?>> f13174k;

    /* renamed from: l */
    private int f13175l;

    /* renamed from: m */
    private AtomicInteger f13176m;

    /* renamed from: f4.a$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    public C3144a(Context context, int i10, String str) {
        this(context, i10, str, null, context == null ? null : context.getPackageName());
    }

    /* renamed from: d */
    private final String m13821d(String str) {
        return (!this.f13172i || TextUtils.isEmpty(str)) ? this.f13169f : str;
    }

    /* renamed from: e */
    private final List<String> m13822e() {
        return C3141o.m13816d(this.f13166c);
    }

    /* renamed from: f */
    public final void m13823f(int i10) {
        if (this.f13165b.isHeld()) {
            try {
                this.f13165b.release();
            } catch (RuntimeException e10) {
                if (e10.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f13168e).concat(" was already released!"), e10);
                } else {
                    throw e10;
                }
            }
            this.f13165b.isHeld();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r2 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        p057e3.C3064c.m13531a().m13533c(r13.f13171h, p057e3.C3063b.m13530a(r13.f13165b, r6), 7, r13.f13168e, r6, null, r13.f13167d, m13822e(), r14);
        r13.f13175l++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r13.f13175l == 0) goto L56;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13825a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f13176m
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m13821d(r0)
            java.lang.Object r0 = r13.f13164a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f13173j     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.f13175l     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f13165b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f13173j     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.f13175l = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.f13172i     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f13173j     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f13173j     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.f13172i     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.f13175l     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            e3.c r1 = p057e3.C3064c.m13531a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.f13171h     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f13165b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = p057e3.C3063b.m13530a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.f13168e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f13167d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.m13822e()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.m13533c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.f13175l     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.f13175l = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f13165b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = p071f4.C3144a.f13162n
            f4.c r1 = new f4.c
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f4.C3144a.m13825a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        p057e3.C3064c.m13531a().m13532b(r12.f13171h, p057e3.C3063b.m13530a(r12.f13165b, r6), 8, r12.f13168e, r6, null, r12.f13167d, m13822e());
        r12.f13175l--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r12.f13175l == 1) goto L51;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13826b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f13176m
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f13168e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            r0 = 0
            java.lang.String r6 = r12.m13821d(r0)
            java.lang.Object r0 = r12.f13164a
            monitor-enter(r0)
            boolean r1 = r12.f13172i     // Catch: java.lang.Throwable -> L7e
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f13173j     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L33
        L31:
            r1 = 0
            goto L50
        L33:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r10) goto L42
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f13173j     // Catch: java.lang.Throwable -> L7e
            r1.remove(r6)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            goto L50
        L42:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            r1[r11] = r2     // Catch: java.lang.Throwable -> L7e
            goto L31
        L50:
            if (r1 != 0) goto L5a
        L52:
            boolean r1 = r12.f13172i     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L79
            int r1 = r12.f13175l     // Catch: java.lang.Throwable -> L7e
            if (r1 != r10) goto L79
        L5a:
            e3.c r1 = p057e3.C3064c.m13531a()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r12.f13171h     // Catch: java.lang.Throwable -> L7e
            android.os.PowerManager$WakeLock r3 = r12.f13165b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = p057e3.C3063b.m13530a(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r4 = 8
            java.lang.String r5 = r12.f13168e     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r8 = r12.f13167d     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r12.m13822e()     // Catch: java.lang.Throwable -> L7e
            r1.m13532b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            int r1 = r12.f13175l     // Catch: java.lang.Throwable -> L7e
            int r1 = r1 - r10
            r12.f13175l = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r12.m13823f(r11)
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f4.C3144a.m13826b():void");
    }

    /* renamed from: c */
    public void m13827c(boolean z10) {
        this.f13165b.setReferenceCounted(z10);
        this.f13172i = z10;
    }

    private C3144a(Context context, int i10, String str, String str2, String str3) {
        this(context, i10, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C3144a(Context context, int i10, String str, String str2, String str3, String str4) {
        this.f13164a = this;
        this.f13172i = true;
        this.f13173j = new HashMap();
        this.f13174k = Collections.synchronizedSet(new HashSet());
        this.f13176m = new AtomicInteger(0);
        C5984j.m21287k(context, "WakeLock: context must not be null");
        C5984j.m21283g(str, "WakeLock: wakeLockName must not be empty");
        this.f13167d = i10;
        this.f13169f = null;
        this.f13170g = null;
        Context applicationContext = context.getApplicationContext();
        this.f13171h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f13168e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f13168e = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i10, str);
        this.f13165b = newWakeLock;
        if (C3141o.m13817e(context)) {
            WorkSource m13814b = C3141o.m13814b(context, C3139m.m13810a(str3) ? context.getPackageName() : str3);
            this.f13166c = m13814b;
            if (m13814b != null && C3141o.m13817e(applicationContext)) {
                WorkSource workSource = this.f13166c;
                if (workSource != null) {
                    workSource.add(m13814b);
                } else {
                    this.f13166c = m13814b;
                }
                try {
                    newWakeLock.setWorkSource(this.f13166c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        if (f13162n == null) {
            f13162n = C2966a.m13428a().mo13429a();
        }
    }
}
