package p193ob;

import ac.C0073c;
import ac.InterfaceC0075e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import p205pb.C4286e;

/* renamed from: ob.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC4183j0 implements Closeable {

    /* renamed from: n */
    private Reader f17174n;

    /* renamed from: ob.j0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4183j0 {

        /* renamed from: o */
        final /* synthetic */ C4167b0 f17175o;

        /* renamed from: p */
        final /* synthetic */ long f17176p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC0075e f17177q;

        a(C4167b0 c4167b0, long j10, InterfaceC0075e interfaceC0075e) {
            this.f17175o = c4167b0;
            this.f17176p = j10;
            this.f17177q = interfaceC0075e;
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: Q */
        public InterfaceC0075e mo14678Q() {
            return this.f17177q;
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: i */
        public long mo14680i() {
            return this.f17176p;
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: l */
        public C4167b0 mo14681l() {
            return this.f17175o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ob.j0$b */
    /* loaded from: classes.dex */
    public static final class b extends Reader {

        /* renamed from: n */
        private final InterfaceC0075e f17178n;

        /* renamed from: o */
        private final Charset f17179o;

        /* renamed from: p */
        private boolean f17180p;

        /* renamed from: q */
        private Reader f17181q;

        b(InterfaceC0075e interfaceC0075e, Charset charset) {
            this.f17178n = interfaceC0075e;
            this.f17179o = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f17180p = true;
            Reader reader = this.f17181q;
            if (reader != null) {
                reader.close();
            } else {
                this.f17178n.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            if (!this.f17180p) {
                Reader reader = this.f17181q;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f17178n.mo358i0(), C4286e.m17739c(this.f17178n, this.f17179o));
                    this.f17181q = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: O */
    public static AbstractC4183j0 m17458O(C4167b0 c4167b0, byte[] bArr) {
        return m17461z(c4167b0, bArr.length, new C0073c().mo339M(bArr));
    }

    /* renamed from: b */
    private static /* synthetic */ void m17459b(Throwable th, AutoCloseable autoCloseable) {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: e */
    private Charset m17460e() {
        C4167b0 mo14681l = mo14681l();
        return mo14681l != null ? mo14681l.m17281b(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    /* renamed from: z */
    public static AbstractC4183j0 m17461z(C4167b0 c4167b0, long j10, InterfaceC0075e interfaceC0075e) {
        Objects.requireNonNull(interfaceC0075e, "source == null");
        return new a(c4167b0, j10, interfaceC0075e);
    }

    /* renamed from: Q */
    public abstract InterfaceC0075e mo14678Q();

    /* renamed from: T */
    public final String m17462T() throws IOException {
        InterfaceC0075e mo14678Q = mo14678Q();
        try {
            String mo356g0 = mo14678Q.mo356g0(C4286e.m17739c(mo14678Q, m17460e()));
            m17459b(null, mo14678Q);
            return mo356g0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (mo14678Q != null) {
                    m17459b(th, mo14678Q);
                }
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final Reader m17463c() {
        Reader reader = this.f17174n;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(mo14678Q(), m17460e());
        this.f17174n = bVar;
        return bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C4286e.m17743g(mo14678Q());
    }

    /* renamed from: i */
    public abstract long mo14680i();

    /* renamed from: l */
    public abstract C4167b0 mo14681l();
}
