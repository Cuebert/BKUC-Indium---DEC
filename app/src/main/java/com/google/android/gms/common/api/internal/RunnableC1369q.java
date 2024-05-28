package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import p295x2.C5506a;
import p308y2.C5602b;

/* renamed from: com.google.android.gms.common.api.internal.q */
/* loaded from: classes.dex */
final class RunnableC1369q implements Runnable {

    /* renamed from: n */
    final /* synthetic */ ConnectionResult f6232n;

    /* renamed from: o */
    final /* synthetic */ C1370r f6233o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1369q(C1370r c1370r, ConnectionResult connectionResult) {
        this.f6233o = c1370r;
        this.f6232n = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C5602b c5602b;
        C5506a.f fVar;
        C5506a.f fVar2;
        C5506a.f fVar3;
        C5506a.f fVar4;
        C1370r c1370r = this.f6233o;
        map = c1370r.f6239f.f6179l;
        c5602b = c1370r.f6235b;
        C1367o c1367o = (C1367o) map.get(c5602b);
        if (c1367o == null) {
            return;
        }
        if (this.f6232n.m7379B()) {
            this.f6233o.f6238e = true;
            fVar = this.f6233o.f6234a;
            if (fVar.mo7672o()) {
                this.f6233o.m7580h();
                return;
            }
            try {
                C1370r c1370r2 = this.f6233o;
                fVar3 = c1370r2.f6234a;
                fVar4 = c1370r2.f6234a;
                fVar3.mo20250e(null, fVar4.mo7685d());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                fVar2 = this.f6233o.f6234a;
                fVar2.mo20251f("Failed to get service from broker.");
                c1367o.m7557H(new ConnectionResult(10), null);
                return;
            }
        }
        c1367o.m7557H(this.f6232n, null);
    }
}
