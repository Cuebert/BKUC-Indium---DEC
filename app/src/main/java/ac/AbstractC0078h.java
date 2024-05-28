package ac;

import java.io.IOException;

/* renamed from: ac.h */
/* loaded from: classes.dex */
public abstract class AbstractC0078h implements InterfaceC0090t {

    /* renamed from: n */
    private final InterfaceC0090t f279n;

    public AbstractC0078h(InterfaceC0090t interfaceC0090t) {
        if (interfaceC0090t != null) {
            this.f279n = interfaceC0090t;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: V */
    public long mo315V(C0073c c0073c, long j10) throws IOException {
        return this.f279n.mo315V(c0073c, j10);
    }

    /* renamed from: b */
    public final InterfaceC0090t m406b() {
        return this.f279n;
    }

    @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f279n.close();
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: f */
    public C0091u mo316f() {
        return this.f279n.mo316f();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f279n.toString() + ")";
    }
}
