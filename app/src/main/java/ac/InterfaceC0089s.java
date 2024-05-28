package ac;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: ac.s */
/* loaded from: classes.dex */
public interface InterfaceC0089s extends Closeable, Flushable {
    /* renamed from: C */
    void mo313C(C0073c c0073c, long j10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    /* renamed from: f */
    C0091u mo314f();

    void flush() throws IOException;
}
