package p257u1;

import com.birbit.android.jobqueue.CancelResult;
import p183o1.EnumC4121g;
import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public class C4810c extends AbstractC4611b {

    /* renamed from: d */
    private EnumC4121g f18673d;

    /* renamed from: e */
    private String[] f18674e;

    /* renamed from: f */
    private CancelResult.AsyncCancelCallback f18675f;

    public C4810c() {
        super(EnumC4616g.CANCEL);
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
    }

    /* renamed from: c */
    public CancelResult.AsyncCancelCallback m18976c() {
        return this.f18675f;
    }

    /* renamed from: d */
    public EnumC4121g m18977d() {
        return this.f18673d;
    }

    /* renamed from: e */
    public String[] m18978e() {
        return this.f18674e;
    }
}
