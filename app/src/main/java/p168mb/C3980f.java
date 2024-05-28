package p168mb;

import va.InterfaceC5001e;

/* renamed from: mb.f */
/* loaded from: classes.dex */
public final class C3980f extends RuntimeException {

    /* renamed from: n */
    private final transient InterfaceC5001e f16370n;

    public C3980f(InterfaceC5001e interfaceC5001e) {
        this.f16370n = interfaceC5001e;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f16370n.toString();
    }
}
