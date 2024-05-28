package p257u1;

import com.birbit.android.jobqueue.IntCallback;
import p244t1.AbstractC4611b;
import p244t1.EnumC4616g;

/* renamed from: u1.h */
/* loaded from: classes.dex */
public class C4815h extends AbstractC4611b implements IntCallback.MessageWithCallback {

    /* renamed from: d */
    private IntCallback f18681d;

    /* renamed from: e */
    private int f18682e;

    /* renamed from: f */
    private String f18683f;

    public C4815h() {
        super(EnumC4616g.PUBLIC_QUERY);
        this.f18682e = -1;
    }

    @Override // p244t1.AbstractC4611b
    /* renamed from: a */
    protected void mo18704a() {
        this.f18681d = null;
        this.f18682e = -1;
    }

    /* renamed from: c */
    public IntCallback m18988c() {
        return this.f18681d;
    }

    /* renamed from: d */
    public String m18989d() {
        return this.f18683f;
    }

    /* renamed from: e */
    public int m18990e() {
        return this.f18682e;
    }

    @Override // com.birbit.android.jobqueue.IntCallback.MessageWithCallback
    public void setCallback(IntCallback intCallback) {
        this.f18681d = intCallback;
    }

    public String toString() {
        return "PublicQuery[" + this.f18682e + "]";
    }
}
