package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.Map;
import p085g4.C3265m;
import p093h0.C3356a;

/* renamed from: com.google.firebase.iid.n */
/* loaded from: classes.dex */
public final class C2599n {

    /* renamed from: a */
    private int f10212a = 0;

    /* renamed from: b */
    private final Map<Integer, C3265m<Void>> f10213b = new C3356a();

    /* renamed from: c */
    private final C2596k f10214c;

    public C2599n(C2596k c2596k) {
        this.f10214c = c2596k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r4 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r7.m11903t(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (com.google.firebase.iid.FirebaseInstanceId.m11890v() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m11986c(com.google.firebase.iid.FirebaseInstanceId r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "!"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            r2 = 1
            r3 = 2
            if (r1 != r3) goto La5
            r1 = 0
            r3 = r8[r1]
            r8 = r8[r2]
            r4 = -1
            int r5 = r3.hashCode()     // Catch: java.io.IOException -> L56
            r6 = 83
            if (r5 == r6) goto L2a
            r6 = 85
            if (r5 == r6) goto L20
            goto L33
        L20:
            java.lang.String r5 = "U"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L56
            if (r3 == 0) goto L33
            r4 = 1
            goto L33
        L2a:
            java.lang.String r5 = "S"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L56
            if (r3 == 0) goto L33
            r4 = 0
        L33:
            if (r4 == 0) goto L47
            if (r4 == r2) goto L38
            goto La5
        L38:
            r7.m11903t(r8)     // Catch: java.io.IOException -> L56
            boolean r7 = com.google.firebase.iid.FirebaseInstanceId.m11890v()     // Catch: java.io.IOException -> L56
            if (r7 == 0) goto La5
            java.lang.String r7 = "unsubscribe operation succeeded"
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L56
            goto La5
        L47:
            r7.m11901r(r8)     // Catch: java.io.IOException -> L56
            boolean r7 = com.google.firebase.iid.FirebaseInstanceId.m11890v()     // Catch: java.io.IOException -> L56
            if (r7 == 0) goto La5
            java.lang.String r7 = "subscribe operation succeeded"
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L56
            goto La5
        L56:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L7d
            java.lang.String r8 = r7.getMessage()
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L70
            goto L7d
        L70:
            java.lang.String r8 = r7.getMessage()
            if (r8 != 0) goto L7c
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        L7c:
            throw r7
        L7d:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            int r8 = r8 + 53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            java.lang.String r8 = "Topic operation failed: "
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2599n.m11986c(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
    }

    /* renamed from: d */
    private final String m11987d() {
        String m11976b;
        synchronized (this.f10214c) {
            m11976b = this.f10214c.m11976b();
        }
        if (TextUtils.isEmpty(m11976b)) {
            return null;
        }
        String[] split = m11976b.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    /* renamed from: e */
    private final synchronized boolean m11988e(String str) {
        synchronized (this.f10214c) {
            String m11976b = this.f10214c.m11976b();
            String valueOf = String.valueOf(str);
            if (!m11976b.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                return false;
            }
            String valueOf2 = String.valueOf(str);
            this.f10214c.m11977d(m11976b.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m11989a() {
        return m11987d() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x000c, code lost:
    
        if (com.google.firebase.iid.FirebaseInstanceId.m11890v() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x000e, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0016, code lost:
    
        return true;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11990b(com.google.firebase.iid.FirebaseInstanceId r5) throws java.io.IOException {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            java.lang.String r0 = r4.m11987d()     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r0 != 0) goto L17
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.m11890v()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L15
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L42
        L15:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            return r1
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            boolean r2 = m11986c(r5, r0)
            if (r2 != 0) goto L20
            r5 = 0
            return r5
        L20:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, g4.m<java.lang.Void>> r2 = r4.f10213b     // Catch: java.lang.Throwable -> L3f
            int r3 = r4.f10212a     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L3f
            g4.m r2 = (p085g4.C3265m) r2     // Catch: java.lang.Throwable -> L3f
            r4.m11988e(r0)     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.f10212a     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + r1
            r4.f10212a = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L0
            r0 = 0
            r2.m14514c(r0)
            goto L0
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L42:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2599n.m11990b(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }
}
