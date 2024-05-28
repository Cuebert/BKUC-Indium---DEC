package ac;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: ac.j */
/* loaded from: classes.dex */
public final class C0080j implements InterfaceC0090t {

    /* renamed from: o */
    private final InterfaceC0075e f282o;

    /* renamed from: p */
    private final Inflater f283p;

    /* renamed from: q */
    private final C0081k f284q;

    /* renamed from: n */
    private int f281n = 0;

    /* renamed from: r */
    private final CRC32 f285r = new CRC32();

    public C0080j(InterfaceC0090t interfaceC0090t) {
        if (interfaceC0090t != null) {
            Inflater inflater = new Inflater(true);
            this.f283p = inflater;
            InterfaceC0075e m425d = C0082l.m425d(interfaceC0090t);
            this.f282o = m425d;
            this.f284q = new C0081k(m425d, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    private void m416b(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: c */
    private void m417c() throws IOException {
        this.f282o.mo349a0(10L);
        byte m362m0 = this.f282o.mo348a().m362m0(3L);
        boolean z10 = ((m362m0 >> 1) & 1) == 1;
        if (z10) {
            m419i(this.f282o.mo348a(), 0L, 10L);
        }
        m416b("ID1ID2", 8075, this.f282o.readShort());
        this.f282o.mo369r(8L);
        if (((m362m0 >> 2) & 1) == 1) {
            this.f282o.mo349a0(2L);
            if (z10) {
                m419i(this.f282o.mo348a(), 0L, 2L);
            }
            long mo343P = this.f282o.mo348a().mo343P();
            this.f282o.mo349a0(mo343P);
            if (z10) {
                m419i(this.f282o.mo348a(), 0L, mo343P);
            }
            this.f282o.mo369r(mo343P);
        }
        if (((m362m0 >> 3) & 1) == 1) {
            long mo353d0 = this.f282o.mo353d0((byte) 0);
            if (mo353d0 != -1) {
                if (z10) {
                    m419i(this.f282o.mo348a(), 0L, mo353d0 + 1);
                }
                this.f282o.mo369r(mo353d0 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m362m0 >> 4) & 1) == 1) {
            long mo353d02 = this.f282o.mo353d0((byte) 0);
            if (mo353d02 != -1) {
                if (z10) {
                    m419i(this.f282o.mo348a(), 0L, mo353d02 + 1);
                }
                this.f282o.mo369r(mo353d02 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            m416b("FHCRC", this.f282o.mo343P(), (short) this.f285r.getValue());
            this.f285r.reset();
        }
    }

    /* renamed from: e */
    private void m418e() throws IOException {
        m416b("CRC", this.f282o.mo324D(), (int) this.f285r.getValue());
        m416b("ISIZE", this.f282o.mo324D(), (int) this.f283p.getBytesWritten());
    }

    /* renamed from: i */
    private void m419i(C0073c c0073c, long j10, long j11) {
        C0086p c0086p = c0073c.f269n;
        while (true) {
            int i10 = c0086p.f307c;
            int i11 = c0086p.f306b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            c0086p = c0086p.f310f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(c0086p.f307c - r7, j11);
            this.f285r.update(c0086p.f305a, (int) (c0086p.f306b + j10), min);
            j11 -= min;
            c0086p = c0086p.f310f;
            j10 = 0;
        }
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: V */
    public long mo315V(C0073c c0073c, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f281n == 0) {
            m417c();
            this.f281n = 1;
        }
        if (this.f281n == 1) {
            long j11 = c0073c.f270o;
            long mo315V = this.f284q.mo315V(c0073c, j10);
            if (mo315V != -1) {
                m419i(c0073c, j11, mo315V);
                return mo315V;
            }
            this.f281n = 2;
        }
        if (this.f281n == 2) {
            m418e();
            this.f281n = 3;
            if (!this.f282o.mo328F()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f284q.close();
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: f */
    public C0091u mo316f() {
        return this.f282o.mo316f();
    }
}
