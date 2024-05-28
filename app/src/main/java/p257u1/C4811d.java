package p257u1;

import com.birbit.android.jobqueue.CancelResult;
import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;

/* renamed from: u1.d */
/* loaded from: classes.dex */
public class C4811d extends AbstractC4611b {

    /* renamed from: d */
    CancelResult.AsyncCancelCallback f18676d;

    /* renamed from: e */
    CancelResult f18677e;

    public C4811d() {
        super(EnumC4616g.CANCEL_RESULT_CALLBACK);
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
        this.f18677e = null;
        this.f18676d = null;
    }

    /* renamed from: c */
    public CancelResult.AsyncCancelCallback m18979c() {
        return this.f18676d;
    }

    /* renamed from: d */
    public CancelResult m18980d() {
        return this.f18677e;
    }

    /* renamed from: e */
    public void m18981e(CancelResult.AsyncCancelCallback asyncCancelCallback, CancelResult cancelResult) {
        this.f18676d = asyncCancelCallback;
        this.f18677e = cancelResult;
    }
}
