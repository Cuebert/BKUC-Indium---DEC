package p257u1;

import com.birbit.android.jobqueue.AbstractC1292e;
import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;

/* renamed from: u1.b */
/* loaded from: classes.dex */
public class C4809b extends AbstractC4611b {

    /* renamed from: d */
    private int f18669d;

    /* renamed from: e */
    private int f18670e;

    /* renamed from: f */
    private boolean f18671f;

    /* renamed from: g */
    private AbstractC1292e f18672g;

    public C4809b() {
        super(EnumC4616g.CALLBACK);
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
        this.f18672g = null;
    }

    /* renamed from: c */
    public AbstractC1292e m18969c() {
        return this.f18672g;
    }

    /* renamed from: d */
    public int m18970d() {
        return this.f18670e;
    }

    /* renamed from: e */
    public int m18971e() {
        return this.f18669d;
    }

    /* renamed from: f */
    public boolean m18972f() {
        return this.f18671f;
    }

    /* renamed from: g */
    public void m18973g(AbstractC1292e abstractC1292e, int i10) {
        this.f18669d = i10;
        this.f18672g = abstractC1292e;
    }

    /* renamed from: h */
    public void m18974h(AbstractC1292e abstractC1292e, int i10, int i11) {
        this.f18669d = i10;
        this.f18670e = i11;
        this.f18672g = abstractC1292e;
    }

    /* renamed from: i */
    public void m18975i(AbstractC1292e abstractC1292e, int i10, boolean z10) {
        this.f18669d = i10;
        this.f18671f = z10;
        this.f18672g = abstractC1292e;
    }
}
