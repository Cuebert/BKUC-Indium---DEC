package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1388b;
import com.google.android.gms.common.internal.InterfaceC1391e;
import java.util.Map;
import java.util.Set;
import p295x2.C5506a;
import p308y2.C5602b;
import p308y2.InterfaceC5605c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.r */
/* loaded from: classes.dex */
public final class C1370r implements AbstractC1388b.c, InterfaceC5605c0 {

    /* renamed from: a */
    private final C5506a.f f6234a;

    /* renamed from: b */
    private final C5602b<?> f6235b;

    /* renamed from: c */
    private InterfaceC1391e f6236c = null;

    /* renamed from: d */
    private Set<Scope> f6237d = null;

    /* renamed from: e */
    private boolean f6238e = false;

    /* renamed from: f */
    final /* synthetic */ C1350c f6239f;

    public C1370r(C1350c c1350c, C5506a.f fVar, C5602b<?> c5602b) {
        this.f6239f = c1350c;
        this.f6234a = fVar;
        this.f6235b = c5602b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m7580h() {
        InterfaceC1391e interfaceC1391e;
        if (!this.f6238e || (interfaceC1391e = this.f6236c) == null) {
            return;
        }
        this.f6234a.mo20250e(interfaceC1391e, this.f6237d);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b.c
    /* renamed from: a */
    public final void mo7581a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f6239f.f6183p;
        handler.post(new RunnableC1369q(this, connectionResult));
    }

    @Override // p308y2.InterfaceC5605c0
    /* renamed from: b */
    public final void mo7582b(InterfaceC1391e interfaceC1391e, Set<Scope> set) {
        if (interfaceC1391e != null && set != null) {
            this.f6236c = interfaceC1391e;
            this.f6237d = set;
            m7580h();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo7583c(new ConnectionResult(4));
        }
    }

    @Override // p308y2.InterfaceC5605c0
    /* renamed from: c */
    public final void mo7583c(ConnectionResult connectionResult) {
        Map map;
        map = this.f6239f.f6179l;
        C1367o c1367o = (C1367o) map.get(this.f6235b);
        if (c1367o != null) {
            c1367o.m7558I(connectionResult);
        }
    }
}
