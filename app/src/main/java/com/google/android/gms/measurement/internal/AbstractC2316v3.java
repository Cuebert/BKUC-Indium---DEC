package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* loaded from: classes.dex */
public abstract class AbstractC2316v3 extends C2355z2 {

    /* renamed from: b */
    private boolean f8608b;

    public AbstractC2316v3(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8118a.m10121i();
    }

    /* renamed from: i */
    public final void m10313i() {
        if (!m10316m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m10314j() {
        if (this.f8608b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo9718n()) {
            return;
        }
        this.f8118a.m10119g();
        this.f8608b = true;
    }

    /* renamed from: k */
    public final void m10315k() {
        if (!this.f8608b) {
            mo9717l();
            this.f8118a.m10119g();
            this.f8608b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: l */
    protected void mo9717l() {
    }

    /* renamed from: m */
    public final boolean m10316m() {
        return this.f8608b;
    }

    /* renamed from: n */
    protected abstract boolean mo9718n();
}
