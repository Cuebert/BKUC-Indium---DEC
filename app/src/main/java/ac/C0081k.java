package ac;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: ac.k */
/* loaded from: classes.dex */
public final class C0081k implements InterfaceC0090t {

    /* renamed from: n */
    private final InterfaceC0075e f286n;

    /* renamed from: o */
    private final Inflater f287o;

    /* renamed from: p */
    private int f288p;

    /* renamed from: q */
    private boolean f289q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0081k(InterfaceC0075e interfaceC0075e, Inflater inflater) {
        if (interfaceC0075e == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.f286n = interfaceC0075e;
            this.f287o = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }

    /* renamed from: c */
    private void m420c() throws IOException {
        int i10 = this.f288p;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f287o.getRemaining();
        this.f288p -= remaining;
        this.f286n.mo369r(remaining);
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: V */
    public long mo315V(C0073c c0073c, long j10) throws IOException {
        boolean m421b;
        if (j10 >= 0) {
            if (this.f289q) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return 0L;
            }
            do {
                m421b = m421b();
                try {
                    C0086p m322B0 = c0073c.m322B0(1);
                    int inflate = this.f287o.inflate(m322B0.f305a, m322B0.f307c, (int) Math.min(j10, 8192 - m322B0.f307c));
                    if (inflate > 0) {
                        m322B0.f307c += inflate;
                        long j11 = inflate;
                        c0073c.f270o += j11;
                        return j11;
                    }
                    if (!this.f287o.finished() && !this.f287o.needsDictionary()) {
                    }
                    m420c();
                    if (m322B0.f306b != m322B0.f307c) {
                        return -1L;
                    }
                    c0073c.f269n = m322B0.m442b();
                    C0087q.m447a(m322B0);
                    return -1L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            } while (!m421b);
            throw new EOFException("source exhausted prematurely");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    /* renamed from: b */
    public final boolean m421b() throws IOException {
        if (!this.f287o.needsInput()) {
            return false;
        }
        m420c();
        if (this.f287o.getRemaining() == 0) {
            if (this.f286n.mo328F()) {
                return true;
            }
            C0086p c0086p = this.f286n.mo348a().f269n;
            int i10 = c0086p.f307c;
            int i11 = c0086p.f306b;
            int i12 = i10 - i11;
            this.f288p = i12;
            this.f287o.setInput(c0086p.f305a, i11, i12);
            return false;
        }
        throw new IllegalStateException("?");
    }

    @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f289q) {
            return;
        }
        this.f287o.end();
        this.f289q = true;
        this.f286n.close();
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: f */
    public C0091u mo316f() {
        return this.f286n.mo316f();
    }
}
