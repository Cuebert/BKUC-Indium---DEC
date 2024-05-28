package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p222r3.HandlerC4427f;
import p308y2.InterfaceC5612g;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC1355e0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: o */
    protected volatile boolean f6198o;

    /* renamed from: p */
    protected final AtomicReference<C1349b0> f6199p;

    /* renamed from: q */
    private final Handler f6200q;

    /* renamed from: r */
    protected final C1342a f6201r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDialogInterfaceOnCancelListenerC1355e0(InterfaceC5612g interfaceC5612g, C1342a c1342a) {
        super(interfaceC5612g);
        this.f6199p = new AtomicReference<>(null);
        this.f6200q = new HandlerC4427f(Looper.getMainLooper());
        this.f6201r = c1342a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m7509l(ConnectionResult connectionResult, int i10) {
        this.f6199p.set(null);
        mo7514m(connectionResult, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m7510o() {
        this.f6199p.set(null);
        mo7515n();
    }

    /* renamed from: p */
    private static final int m7511p(C1349b0 c1349b0) {
        if (c1349b0 == null) {
            return -1;
        }
        return c1349b0.m7458a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo7433e(int i10, int i11, Intent intent) {
        C1349b0 c1349b0 = this.f6199p.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int mo7390g = this.f6201r.mo7390g(m7432b());
                if (mo7390g == 0) {
                    m7510o();
                    return;
                } else {
                    if (c1349b0 == null) {
                        return;
                    }
                    if (c1349b0.m7459b().m7380x() == 18 && mo7390g == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            m7510o();
            return;
        } else if (i11 == 0) {
            if (c1349b0 == null) {
                return;
            }
            m7509l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c1349b0.m7459b().toString()), m7511p(c1349b0));
            return;
        }
        if (c1349b0 != null) {
            m7509l(c1349b0.m7459b(), c1349b0.m7458a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo7434f(Bundle bundle) {
        super.mo7434f(bundle);
        if (bundle != null) {
            this.f6199p.set(bundle.getBoolean("resolving_error", false) ? new C1349b0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo7437i(Bundle bundle) {
        super.mo7437i(bundle);
        C1349b0 c1349b0 = this.f6199p.get();
        if (c1349b0 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c1349b0.m7458a());
        bundle.putInt("failed_status", c1349b0.m7459b().m7380x());
        bundle.putParcelable("failed_resolution", c1349b0.m7459b().m7382z());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo7438j() {
        super.mo7438j();
        this.f6198o = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo7439k() {
        super.mo7439k();
        this.f6198o = false;
    }

    /* renamed from: m */
    protected abstract void mo7514m(ConnectionResult connectionResult, int i10);

    /* renamed from: n */
    protected abstract void mo7515n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m7509l(new ConnectionResult(13, null), m7511p(this.f6199p.get()));
    }

    /* renamed from: s */
    public final void m7516s(ConnectionResult connectionResult, int i10) {
        C1349b0 c1349b0 = new C1349b0(connectionResult, i10);
        if (this.f6199p.compareAndSet(null, c1349b0)) {
            this.f6200q.post(new RunnableC1353d0(this, c1349b0));
        }
    }
}
