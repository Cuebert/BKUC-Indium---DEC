package p257u1;

import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;

/* renamed from: u1.e */
/* loaded from: classes.dex */
public class C4812e extends AbstractC4611b {

    /* renamed from: d */
    private int f18678d;

    public C4812e() {
        super(EnumC4616g.COMMAND);
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
        this.f18678d = -1;
    }

    /* renamed from: c */
    public int m18982c() {
        return this.f18678d;
    }

    /* renamed from: d */
    public void m18983d(int i10) {
        this.f18678d = i10;
    }

    public String toString() {
        return "Command[" + this.f18678d + "]";
    }
}
