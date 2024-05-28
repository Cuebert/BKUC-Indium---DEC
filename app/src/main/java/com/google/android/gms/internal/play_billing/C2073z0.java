package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC1922d1;
import com.google.android.gms.internal.play_billing.C2073z0;

/* renamed from: com.google.android.gms.internal.play_billing.z0 */
/* loaded from: classes.dex */
public class C2073z0<MessageType extends AbstractC1922d1<MessageType, BuilderType>, BuilderType extends C2073z0<MessageType, BuilderType>> extends AbstractC1969k<MessageType, BuilderType> {

    /* renamed from: n */
    private final AbstractC1922d1 f7911n;

    /* renamed from: o */
    protected AbstractC1922d1 f7912o;

    public C2073z0(MessageType messagetype) {
        this.f7911n = messagetype;
        if (!messagetype.m9308s()) {
            this.f7912o = messagetype.m9303j();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: d */
    public final C2073z0 clone() {
        C2073z0 c2073z0 = (C2073z0) this.f7911n.mo9309t(5, null, null);
        c2073z0.f7912o = mo9344b();
        return c2073z0;
    }

    /* renamed from: h */
    public final MessageType m9695h() {
        MessageType mo9344b = mo9344b();
        if (mo9344b.m9307r()) {
            return mo9344b;
        }
        throw new C1952h3(mo9344b);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1937f2
    /* renamed from: j */
    public MessageType mo9344b() {
        if (!this.f7912o.m9308s()) {
            return (MessageType) this.f7912o;
        }
        this.f7912o.m9304n();
        return (MessageType) this.f7912o;
    }

    /* renamed from: k */
    public final void m9697k() {
        if (this.f7912o.m9308s()) {
            return;
        }
        m9698m();
    }

    /* renamed from: m */
    protected void m9698m() {
        AbstractC1922d1 m9303j = this.f7911n.m9303j();
        C2000o2.m9515a().m9516b(m9303j.getClass()).mo9449d(m9303j, this.f7912o);
        this.f7912o = m9303j;
    }
}
