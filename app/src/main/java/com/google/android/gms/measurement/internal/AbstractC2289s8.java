package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* loaded from: classes.dex */
public abstract class AbstractC2289s8 extends C2278r8 {

    /* renamed from: c */
    private boolean f8553c;

    public AbstractC2289s8(C2103b9 c2103b9) {
        super(c2103b9);
        this.f8517b.m9784q();
    }

    /* renamed from: i */
    public final void m10300i() {
        if (!m10302k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m10301j() {
        if (!this.f8553c) {
            mo9853l();
            this.f8517b.m9779l();
            this.f8553c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    public final boolean m10302k() {
        return this.f8553c;
    }

    /* renamed from: l */
    protected abstract boolean mo9853l();
}
