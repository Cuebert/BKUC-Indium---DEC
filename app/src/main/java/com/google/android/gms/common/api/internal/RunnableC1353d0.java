package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* loaded from: classes.dex */
public final class RunnableC1353d0 implements Runnable {

    /* renamed from: n */
    private final C1349b0 f6194n;

    /* renamed from: o */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC1355e0 f6195o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1353d0(AbstractDialogInterfaceOnCancelListenerC1355e0 abstractDialogInterfaceOnCancelListenerC1355e0, C1349b0 c1349b0) {
        this.f6195o = abstractDialogInterfaceOnCancelListenerC1355e0;
        this.f6194n = c1349b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6195o.f6198o) {
            ConnectionResult m7459b = this.f6194n.m7459b();
            if (m7459b.m7378A()) {
                AbstractDialogInterfaceOnCancelListenerC1355e0 abstractDialogInterfaceOnCancelListenerC1355e0 = this.f6195o;
                abstractDialogInterfaceOnCancelListenerC1355e0.f6153n.startActivityForResult(GoogleApiActivity.m7406a(abstractDialogInterfaceOnCancelListenerC1355e0.m7432b(), (PendingIntent) C5984j.m21286j(m7459b.m7382z()), this.f6194n.m7458a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC1355e0 abstractDialogInterfaceOnCancelListenerC1355e02 = this.f6195o;
            if (abstractDialogInterfaceOnCancelListenerC1355e02.f6201r.mo7387b(abstractDialogInterfaceOnCancelListenerC1355e02.m7432b(), m7459b.m7380x(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC1355e0 abstractDialogInterfaceOnCancelListenerC1355e03 = this.f6195o;
                abstractDialogInterfaceOnCancelListenerC1355e03.f6201r.m7404x(abstractDialogInterfaceOnCancelListenerC1355e03.m7432b(), this.f6195o.f6153n, m7459b.m7380x(), 2, this.f6195o);
            } else {
                if (m7459b.m7380x() == 18) {
                    AbstractDialogInterfaceOnCancelListenerC1355e0 abstractDialogInterfaceOnCancelListenerC1355e04 = this.f6195o;
                    Dialog m7399s = abstractDialogInterfaceOnCancelListenerC1355e04.f6201r.m7399s(abstractDialogInterfaceOnCancelListenerC1355e04.m7432b(), this.f6195o);
                    AbstractDialogInterfaceOnCancelListenerC1355e0 abstractDialogInterfaceOnCancelListenerC1355e05 = this.f6195o;
                    abstractDialogInterfaceOnCancelListenerC1355e05.f6201r.m7400t(abstractDialogInterfaceOnCancelListenerC1355e05.m7432b().getApplicationContext(), new C1351c0(this, m7399s));
                    return;
                }
                this.f6195o.m7509l(m7459b, this.f6194n.m7458a());
            }
        }
    }
}
