package ac;

import java.io.IOException;

/* renamed from: ac.g */
/* loaded from: classes.dex */
public abstract class AbstractC0077g implements InterfaceC0089s {

    /* renamed from: n */
    private final InterfaceC0089s f278n;

    public AbstractC0077g(InterfaceC0089s interfaceC0089s) {
        if (interfaceC0089s != null) {
            this.f278n = interfaceC0089s;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // ac.InterfaceC0089s
    /* renamed from: C */
    public void mo313C(C0073c c0073c, long j10) throws IOException {
        this.f278n.mo313C(c0073c, j10);
    }

    @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f278n.close();
    }

    @Override // ac.InterfaceC0089s
    /* renamed from: f */
    public C0091u mo314f() {
        return this.f278n.mo314f();
    }

    @Override // ac.InterfaceC0089s, java.io.Flushable
    public void flush() throws IOException {
        this.f278n.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f278n.toString() + ")";
    }
}
