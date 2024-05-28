package ac;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: ac.d */
/* loaded from: classes.dex */
public interface InterfaceC0074d extends InterfaceC0089s, WritableByteChannel {
    /* renamed from: E */
    InterfaceC0074d mo326E(C0076f c0076f) throws IOException;

    /* renamed from: G */
    InterfaceC0074d mo330G(int i10) throws IOException;

    /* renamed from: M */
    InterfaceC0074d mo339M(byte[] bArr) throws IOException;

    /* renamed from: R */
    InterfaceC0074d mo344R() throws IOException;

    /* renamed from: a */
    C0073c mo348a();

    /* renamed from: b0 */
    InterfaceC0074d mo350b0(String str) throws IOException;

    /* renamed from: c0 */
    InterfaceC0074d mo351c0(long j10) throws IOException;

    @Override // ac.InterfaceC0089s, java.io.Flushable
    void flush() throws IOException;

    /* renamed from: h */
    InterfaceC0074d mo357h(byte[] bArr, int i10, int i11) throws IOException;

    /* renamed from: n */
    InterfaceC0074d mo363n(long j10) throws IOException;

    /* renamed from: t */
    InterfaceC0074d mo373t(int i10) throws IOException;

    /* renamed from: x */
    InterfaceC0074d mo379x(int i10) throws IOException;
}
