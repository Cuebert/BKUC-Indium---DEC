package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* loaded from: classes.dex */
public final class BinderC1494b1 extends AbstractBinderC1596h1 {

    /* renamed from: c */
    private final AtomicReference<Bundle> f6653c = new AtomicReference<>();

    /* renamed from: d */
    private boolean f6654d;

    /* renamed from: J0 */
    public static final <T> T m7939J0(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    /* renamed from: l */
    public final Bundle m7940l(long j10) {
        Bundle bundle;
        synchronized (this.f6653c) {
            if (!this.f6654d) {
                try {
                    this.f6653c.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f6653c.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1613i1
    /* renamed from: m */
    public final void mo7941m(Bundle bundle) {
        synchronized (this.f6653c) {
            try {
                this.f6653c.set(bundle);
                this.f6654d = true;
            } finally {
                this.f6653c.notify();
            }
        }
    }

    /* renamed from: n */
    public final String m7942n(long j10) {
        return (String) m7939J0(m7940l(j10), String.class);
    }
}
