package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.ConnectionResult;
import p093h0.C3357b;
import p308y2.C5602b;
import p308y2.InterfaceC5612g;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public final class C1360h extends AbstractDialogInterfaceOnCancelListenerC1355e0 {

    /* renamed from: s */
    private final C3357b<C5602b<?>> f6207s;

    /* renamed from: t */
    private final C1350c f6208t;

    C1360h(InterfaceC5612g interfaceC5612g, C1350c c1350c, C1342a c1342a) {
        super(interfaceC5612g, c1342a);
        this.f6207s = new C3357b<>();
        this.f6208t = c1350c;
        this.f6153n.mo20634b("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m7526u(Activity activity, C1350c c1350c, C5602b<?> c5602b) {
        InterfaceC5612g m7429c = LifecycleCallback.m7429c(activity);
        C1360h c1360h = (C1360h) m7429c.mo20635e("ConnectionlessLifecycleHelper", C1360h.class);
        if (c1360h == null) {
            c1360h = new C1360h(m7429c, c1350c, C1342a.m7385o());
        }
        C5984j.m21287k(c5602b, "ApiKey cannot be null");
        c1360h.f6207s.add(c5602b);
        c1350c.m7490d(c1360h);
    }

    /* renamed from: v */
    private final void m7527v() {
        if (this.f6207s.isEmpty()) {
            return;
        }
        this.f6208t.m7490d(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo7436h() {
        super.mo7436h();
        m7527v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1355e0, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo7438j() {
        super.mo7438j();
        m7527v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1355e0, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo7439k() {
        super.mo7439k();
        this.f6208t.m7491e(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1355e0
    /* renamed from: m */
    protected final void mo7514m(ConnectionResult connectionResult, int i10) {
        this.f6208t.m7487J(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1355e0
    /* renamed from: n */
    protected final void mo7515n() {
        this.f6208t.m7488b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C3357b<C5602b<?>> m7528t() {
        return this.f6207s;
    }
}
