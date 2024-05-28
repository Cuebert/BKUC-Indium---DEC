package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f3 */
/* loaded from: classes.dex */
public final class RunnableC2141f3 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ int f8076n;

    /* renamed from: o */
    final /* synthetic */ String f8077o;

    /* renamed from: p */
    final /* synthetic */ Object f8078p;

    /* renamed from: q */
    final /* synthetic */ Object f8079q;

    /* renamed from: r */
    final /* synthetic */ Object f8080r;

    /* renamed from: s */
    final /* synthetic */ C2174i3 f8081s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2141f3(C2174i3 c2174i3, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f8081s = c2174i3;
        this.f8076n = i10;
        this.f8077o = str;
        this.f8078p = obj;
        this.f8079q = obj2;
        this.f8080r = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        C2326w3 m10107F = this.f8081s.f8118a.m10107F();
        if (m10107F.m9924n()) {
            c10 = this.f8081s.f8166c;
            if (c10 == 0) {
                if (this.f8081s.f8118a.m10134z().m9867H()) {
                    C2174i3 c2174i3 = this.f8081s;
                    c2174i3.f8118a.mo9768f();
                    c2174i3.f8166c = 'C';
                } else {
                    C2174i3 c2174i32 = this.f8081s;
                    c2174i32.f8118a.mo9768f();
                    c2174i32.f8166c = 'c';
                }
            }
            j10 = this.f8081s.f8167d;
            if (j10 < 0) {
                C2174i3 c2174i33 = this.f8081s;
                c2174i33.f8118a.m10134z().m9874q();
                c2174i33.f8167d = 46000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f8076n);
            c11 = this.f8081s.f8166c;
            j11 = this.f8081s.f8167d;
            String m10037A = C2174i3.m10037A(true, this.f8077o, this.f8078p, this.f8079q, this.f8080r);
            StringBuilder sb2 = new StringBuilder(m10037A.length() + 24);
            sb2.append("2");
            sb2.append(charAt);
            sb2.append(c11);
            sb2.append(j11);
            sb2.append(":");
            sb2.append(m10037A);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = this.f8077o.substring(0, 1024);
            }
            C2295t3 c2295t3 = m10107F.f8631d;
            if (c2295t3 != null) {
                c2295t3.m10307b(sb3, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f8081s.m10045C(), "Persisted config not initialized. Not logging error/warn");
    }
}
