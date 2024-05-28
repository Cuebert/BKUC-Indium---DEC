package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.j */
/* loaded from: classes.dex */
public abstract class AbstractC3845j<R> implements InterfaceC3841f<R>, Serializable {
    private final int arity;

    public AbstractC3845j(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m16271e = C3851p.m16271e(this);
        C3844i.m16252e(m16271e, "renderLambdaToString(this)");
        return m16271e;
    }
}
