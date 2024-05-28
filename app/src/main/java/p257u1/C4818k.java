package p257u1;

import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;
import p269v1.C4938a;

/* renamed from: u1.k */
/* loaded from: classes.dex */
public class C4818k extends AbstractC4611b {

    /* renamed from: d */
    private int f18688d;

    /* renamed from: e */
    private C4938a f18689e;

    public C4818k() {
        super(EnumC4616g.SCHEDULER);
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
        this.f18689e = null;
    }

    /* renamed from: c */
    public C4938a m18999c() {
        return this.f18689e;
    }

    /* renamed from: d */
    public int m19000d() {
        return this.f18688d;
    }

    /* renamed from: e */
    public void m19001e(int i10, C4938a c4938a) {
        this.f18688d = i10;
        this.f18689e = c4938a;
    }
}
