package ac;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: ac.e */
/* loaded from: classes.dex */
public interface InterfaceC0075e extends InterfaceC0090t, ReadableByteChannel {
    /* renamed from: B */
    String mo321B() throws IOException;

    /* renamed from: D */
    int mo324D() throws IOException;

    /* renamed from: F */
    boolean mo328F() throws IOException;

    /* renamed from: I */
    byte[] mo333I(long j10) throws IOException;

    /* renamed from: K */
    int mo336K(C0083m c0083m) throws IOException;

    /* renamed from: P */
    short mo343P() throws IOException;

    /* renamed from: S */
    long mo345S() throws IOException;

    /* renamed from: U */
    String mo346U(long j10) throws IOException;

    @Deprecated
    /* renamed from: a */
    C0073c mo348a();

    /* renamed from: a0 */
    void mo349a0(long j10) throws IOException;

    /* renamed from: d */
    C0073c mo352d();

    /* renamed from: d0 */
    long mo353d0(byte b10) throws IOException;

    /* renamed from: f0 */
    long mo355f0() throws IOException;

    /* renamed from: g0 */
    String mo356g0(Charset charset) throws IOException;

    /* renamed from: i0 */
    InputStream mo358i0();

    /* renamed from: p */
    C0076f mo366p(long j10) throws IOException;

    /* renamed from: r */
    void mo369r(long j10) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    long mo371s(InterfaceC0089s interfaceC0089s) throws IOException;

    /* renamed from: u */
    boolean mo375u(long j10) throws IOException;
}
