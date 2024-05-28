package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes.dex */
public abstract class AbstractC2165h5 extends C2154g5 {

    /* renamed from: b */
    private boolean f8136b;

    public AbstractC2165h5(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8118a.m10121i();
    }

    /* renamed from: i */
    protected void mo9919i() {
    }

    /* renamed from: j */
    protected abstract boolean mo9920j();

    /* renamed from: k */
    public final void m9921k() {
        if (!m9924n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void m9922l() {
        if (!this.f8136b) {
            if (mo9920j()) {
                return;
            }
            this.f8118a.m10119g();
            this.f8136b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: m */
    public final void m9923m() {
        if (!this.f8136b) {
            mo9919i();
            this.f8118a.m10119g();
            this.f8136b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: n */
    public final boolean m9924n() {
        return this.f8136b;
    }
}
