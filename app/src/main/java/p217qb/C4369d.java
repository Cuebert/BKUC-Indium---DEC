package p217qb;

import ac.C0082l;
import ac.InterfaceC0074d;
import ac.InterfaceC0075e;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import com.appsflyer.oaid.BuildConfig;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p205pb.C4286e;
import p278vb.InterfaceC5003a;
import p291wb.C5492f;

/* renamed from: qb.d */
/* loaded from: classes.dex */
public final class C4369d implements Closeable, Flushable {

    /* renamed from: H */
    static final Pattern f17857H = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: A */
    boolean f17858A;

    /* renamed from: B */
    boolean f17859B;

    /* renamed from: C */
    boolean f17860C;

    /* renamed from: D */
    boolean f17861D;

    /* renamed from: F */
    private final Executor f17863F;

    /* renamed from: n */
    final InterfaceC5003a f17865n;

    /* renamed from: o */
    final File f17866o;

    /* renamed from: p */
    private final File f17867p;

    /* renamed from: q */
    private final File f17868q;

    /* renamed from: r */
    private final File f17869r;

    /* renamed from: s */
    private final int f17870s;

    /* renamed from: t */
    private long f17871t;

    /* renamed from: u */
    final int f17872u;

    /* renamed from: w */
    InterfaceC0074d f17874w;

    /* renamed from: y */
    int f17876y;

    /* renamed from: z */
    boolean f17877z;

    /* renamed from: v */
    private long f17873v = 0;

    /* renamed from: x */
    final LinkedHashMap<String, d> f17875x = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: E */
    private long f17862E = 0;

    /* renamed from: G */
    private final Runnable f17864G = new a();

    /* renamed from: qb.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C4369d.this) {
                C4369d c4369d = C4369d.this;
                if ((!c4369d.f17858A) || c4369d.f17859B) {
                    return;
                }
                try {
                    c4369d.m18086n0();
                } catch (IOException unused) {
                    C4369d.this.f17860C = true;
                }
                try {
                    if (C4369d.this.m18080W()) {
                        C4369d.this.m18082k0();
                        C4369d.this.f17876y = 0;
                    }
                } catch (IOException unused2) {
                    C4369d c4369d2 = C4369d.this;
                    c4369d2.f17861D = true;
                    c4369d2.f17874w = C0082l.m424c(C0082l.m423b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qb.d$b */
    /* loaded from: classes.dex */
    public class b extends C4370e {
        b(InterfaceC0089s interfaceC0089s) {
            super(interfaceC0089s);
        }

        @Override // p217qb.C4370e
        /* renamed from: b */
        protected void mo18088b(IOException iOException) {
            C4369d.this.f17877z = true;
        }
    }

    /* renamed from: qb.d$c */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        final d f17880a;

        /* renamed from: b */
        final boolean[] f17881b;

        /* renamed from: c */
        private boolean f17882c;

        /* renamed from: qb.d$c$a */
        /* loaded from: classes.dex */
        class a extends C4370e {
            a(InterfaceC0089s interfaceC0089s) {
                super(interfaceC0089s);
            }

            @Override // p217qb.C4370e
            /* renamed from: b */
            protected void mo18088b(IOException iOException) {
                synchronized (C4369d.this) {
                    c.this.m18091c();
                }
            }
        }

        c(d dVar) {
            this.f17880a = dVar;
            this.f17881b = dVar.f17889e ? null : new boolean[C4369d.this.f17872u];
        }

        /* renamed from: a */
        public void m18089a() throws IOException {
            synchronized (C4369d.this) {
                if (!this.f17882c) {
                    if (this.f17880a.f17890f == this) {
                        C4369d.this.m18081e(this, false);
                    }
                    this.f17882c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public void m18090b() throws IOException {
            synchronized (C4369d.this) {
                if (!this.f17882c) {
                    if (this.f17880a.f17890f == this) {
                        C4369d.this.m18081e(this, true);
                    }
                    this.f17882c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: c */
        void m18091c() {
            if (this.f17880a.f17890f != this) {
                return;
            }
            int i10 = 0;
            while (true) {
                C4369d c4369d = C4369d.this;
                if (i10 < c4369d.f17872u) {
                    try {
                        c4369d.f17865n.mo19453a(this.f17880a.f17888d[i10]);
                    } catch (IOException unused) {
                    }
                    i10++;
                } else {
                    this.f17880a.f17890f = null;
                    return;
                }
            }
        }

        /* renamed from: d */
        public InterfaceC0089s m18092d(int i10) {
            synchronized (C4369d.this) {
                if (!this.f17882c) {
                    d dVar = this.f17880a;
                    if (dVar.f17890f != this) {
                        return C0082l.m423b();
                    }
                    if (!dVar.f17889e) {
                        this.f17881b[i10] = true;
                    }
                    try {
                        return new a(C4369d.this.f17865n.mo19455c(dVar.f17888d[i10]));
                    } catch (FileNotFoundException unused) {
                        return C0082l.m423b();
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qb.d$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        final String f17885a;

        /* renamed from: b */
        final long[] f17886b;

        /* renamed from: c */
        final File[] f17887c;

        /* renamed from: d */
        final File[] f17888d;

        /* renamed from: e */
        boolean f17889e;

        /* renamed from: f */
        c f17890f;

        /* renamed from: g */
        long f17891g;

        d(String str) {
            this.f17885a = str;
            int i10 = C4369d.this.f17872u;
            this.f17886b = new long[i10];
            this.f17887c = new File[i10];
            this.f17888d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < C4369d.this.f17872u; i11++) {
                sb2.append(i11);
                this.f17887c[i11] = new File(C4369d.this.f17866o, sb2.toString());
                sb2.append(".tmp");
                this.f17888d[i11] = new File(C4369d.this.f17866o, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* renamed from: a */
        private IOException m18093a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: b */
        void m18094b(String[] strArr) throws IOException {
            if (strArr.length == C4369d.this.f17872u) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f17886b[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw m18093a(strArr);
                    }
                }
                return;
            }
            throw m18093a(strArr);
        }

        /* renamed from: c */
        e m18095c() {
            if (Thread.holdsLock(C4369d.this)) {
                InterfaceC0090t[] interfaceC0090tArr = new InterfaceC0090t[C4369d.this.f17872u];
                long[] jArr = (long[]) this.f17886b.clone();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    try {
                        C4369d c4369d = C4369d.this;
                        if (i11 < c4369d.f17872u) {
                            interfaceC0090tArr[i11] = c4369d.f17865n.mo19454b(this.f17887c[i11]);
                            i11++;
                        } else {
                            return new e(this.f17885a, this.f17891g, interfaceC0090tArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            C4369d c4369d2 = C4369d.this;
                            if (i10 < c4369d2.f17872u && interfaceC0090tArr[i10] != null) {
                                C4286e.m17743g(interfaceC0090tArr[i10]);
                                i10++;
                            } else {
                                try {
                                    c4369d2.m18085m0(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: d */
        void m18096d(InterfaceC0074d interfaceC0074d) throws IOException {
            for (long j10 : this.f17886b) {
                interfaceC0074d.mo330G(32).mo351c0(j10);
            }
        }
    }

    /* renamed from: qb.d$e */
    /* loaded from: classes.dex */
    public final class e implements Closeable {

        /* renamed from: n */
        private final String f17893n;

        /* renamed from: o */
        private final long f17894o;

        /* renamed from: p */
        private final InterfaceC0090t[] f17895p;

        /* renamed from: q */
        private final long[] f17896q;

        e(String str, long j10, InterfaceC0090t[] interfaceC0090tArr, long[] jArr) {
            this.f17893n = str;
            this.f17894o = j10;
            this.f17895p = interfaceC0090tArr;
            this.f17896q = jArr;
        }

        /* renamed from: b */
        public c m18097b() throws IOException {
            return C4369d.this.m18077O(this.f17893n, this.f17894o);
        }

        /* renamed from: c */
        public InterfaceC0090t m18098c(int i10) {
            return this.f17895p[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InterfaceC0090t interfaceC0090t : this.f17895p) {
                C4286e.m17743g(interfaceC0090t);
            }
        }
    }

    C4369d(InterfaceC5003a interfaceC5003a, File file, int i10, int i11, long j10, Executor executor) {
        this.f17865n = interfaceC5003a;
        this.f17866o = file;
        this.f17870s = i10;
        this.f17867p = new File(file, "journal");
        this.f17868q = new File(file, "journal.tmp");
        this.f17869r = new File(file, "journal.bkp");
        this.f17872u = i11;
        this.f17871t = j10;
        this.f17863F = executor;
    }

    /* renamed from: X */
    private InterfaceC0074d m18069X() throws FileNotFoundException {
        return C0082l.m424c(new b(this.f17865n.mo19457e(this.f17867p)));
    }

    /* renamed from: Y */
    private void m18070Y() throws IOException {
        this.f17865n.mo19453a(this.f17868q);
        Iterator<d> it = this.f17875x.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f17890f == null) {
                while (i10 < this.f17872u) {
                    this.f17873v += next.f17886b[i10];
                    i10++;
                }
            } else {
                next.f17890f = null;
                while (i10 < this.f17872u) {
                    this.f17865n.mo19453a(next.f17887c[i10]);
                    this.f17865n.mo19453a(next.f17888d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m18071b(Throwable th, AutoCloseable autoCloseable) {
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

    /* renamed from: c */
    private synchronized void m18072c() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: e0 */
    private void m18073e0() throws IOException {
        InterfaceC0075e m425d = C0082l.m425d(this.f17865n.mo19454b(this.f17867p));
        try {
            String mo321B = m425d.mo321B();
            String mo321B2 = m425d.mo321B();
            String mo321B3 = m425d.mo321B();
            String mo321B4 = m425d.mo321B();
            String mo321B5 = m425d.mo321B();
            if (!"libcore.io.DiskLruCache".equals(mo321B) || !"1".equals(mo321B2) || !Integer.toString(this.f17870s).equals(mo321B3) || !Integer.toString(this.f17872u).equals(mo321B4) || !BuildConfig.FLAVOR.equals(mo321B5)) {
                throw new IOException("unexpected journal header: [" + mo321B + ", " + mo321B2 + ", " + mo321B4 + ", " + mo321B5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m18075j0(m425d.mo321B());
                    i10++;
                } catch (EOFException unused) {
                    this.f17876y = i10 - this.f17875x.size();
                    if (!m425d.mo328F()) {
                        m18082k0();
                    } else {
                        this.f17874w = m18069X();
                    }
                    m18071b(null, m425d);
                    return;
                }
            }
        } finally {
        }
    }

    /* renamed from: i */
    public static C4369d m18074i(InterfaceC5003a interfaceC5003a, File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            return new C4369d(interfaceC5003a, file, i10, i11, j10, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4286e.m17732I("OkHttp DiskLruCache", true)));
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    /* renamed from: j0 */
    private void m18075j0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f17875x.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = this.f17875x.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                this.f17875x.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f17889e = true;
                dVar.f17890f = null;
                dVar.m18094b(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f17890f = new c(dVar);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: o0 */
    private void m18076o0(String str) {
        if (f17857H.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: O */
    synchronized c m18077O(String str, long j10) throws IOException {
        m18079T();
        m18072c();
        m18076o0(str);
        d dVar = this.f17875x.get(str);
        if (j10 != -1 && (dVar == null || dVar.f17891g != j10)) {
            return null;
        }
        if (dVar != null && dVar.f17890f != null) {
            return null;
        }
        if (!this.f17860C && !this.f17861D) {
            this.f17874w.mo350b0("DIRTY").mo330G(32).mo350b0(str).mo330G(10);
            this.f17874w.flush();
            if (this.f17877z) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(str);
                this.f17875x.put(str, dVar);
            }
            c cVar = new c(dVar);
            dVar.f17890f = cVar;
            return cVar;
        }
        this.f17863F.execute(this.f17864G);
        return null;
    }

    /* renamed from: Q */
    public synchronized e m18078Q(String str) throws IOException {
        m18079T();
        m18072c();
        m18076o0(str);
        d dVar = this.f17875x.get(str);
        if (dVar != null && dVar.f17889e) {
            e m18095c = dVar.m18095c();
            if (m18095c == null) {
                return null;
            }
            this.f17876y++;
            this.f17874w.mo350b0("READ").mo330G(32).mo350b0(str).mo330G(10);
            if (m18080W()) {
                this.f17863F.execute(this.f17864G);
            }
            return m18095c;
        }
        return null;
    }

    /* renamed from: T */
    public synchronized void m18079T() throws IOException {
        if (this.f17858A) {
            return;
        }
        if (this.f17865n.mo19458f(this.f17869r)) {
            if (this.f17865n.mo19458f(this.f17867p)) {
                this.f17865n.mo19453a(this.f17869r);
            } else {
                this.f17865n.mo19459g(this.f17869r, this.f17867p);
            }
        }
        if (this.f17865n.mo19458f(this.f17867p)) {
            try {
                m18073e0();
                m18070Y();
                this.f17858A = true;
                return;
            } catch (IOException e10) {
                C5492f.m20215l().mo20197t(5, "DiskLruCache " + this.f17866o + " is corrupt: " + e10.getMessage() + ", removing", e10);
                try {
                    m18083l();
                    this.f17859B = false;
                } catch (Throwable th) {
                    this.f17859B = false;
                    throw th;
                }
            }
        }
        m18082k0();
        this.f17858A = true;
    }

    /* renamed from: W */
    boolean m18080W() {
        int i10 = this.f17876y;
        return i10 >= 2000 && i10 >= this.f17875x.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f17858A && !this.f17859B) {
            for (d dVar : (d[]) this.f17875x.values().toArray(new d[this.f17875x.size()])) {
                c cVar = dVar.f17890f;
                if (cVar != null) {
                    cVar.m18089a();
                }
            }
            m18086n0();
            this.f17874w.close();
            this.f17874w = null;
            this.f17859B = true;
            return;
        }
        this.f17859B = true;
    }

    /* renamed from: e */
    synchronized void m18081e(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f17880a;
        if (dVar.f17890f == cVar) {
            if (z10 && !dVar.f17889e) {
                for (int i10 = 0; i10 < this.f17872u; i10++) {
                    if (cVar.f17881b[i10]) {
                        if (!this.f17865n.mo19458f(dVar.f17888d[i10])) {
                            cVar.m18089a();
                            return;
                        }
                    } else {
                        cVar.m18089a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f17872u; i11++) {
                File file = dVar.f17888d[i11];
                if (z10) {
                    if (this.f17865n.mo19458f(file)) {
                        File file2 = dVar.f17887c[i11];
                        this.f17865n.mo19459g(file, file2);
                        long j10 = dVar.f17886b[i11];
                        long mo19460h = this.f17865n.mo19460h(file2);
                        dVar.f17886b[i11] = mo19460h;
                        this.f17873v = (this.f17873v - j10) + mo19460h;
                    }
                } else {
                    this.f17865n.mo19453a(file);
                }
            }
            this.f17876y++;
            dVar.f17890f = null;
            if (dVar.f17889e | z10) {
                dVar.f17889e = true;
                this.f17874w.mo350b0("CLEAN").mo330G(32);
                this.f17874w.mo350b0(dVar.f17885a);
                dVar.m18096d(this.f17874w);
                this.f17874w.mo330G(10);
                if (z10) {
                    long j11 = this.f17862E;
                    this.f17862E = 1 + j11;
                    dVar.f17891g = j11;
                }
            } else {
                this.f17875x.remove(dVar.f17885a);
                this.f17874w.mo350b0("REMOVE").mo330G(32);
                this.f17874w.mo350b0(dVar.f17885a);
                this.f17874w.mo330G(10);
            }
            this.f17874w.flush();
            if (this.f17873v > this.f17871t || m18080W()) {
                this.f17863F.execute(this.f17864G);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f17858A) {
            m18072c();
            m18086n0();
            this.f17874w.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.f17859B;
    }

    /* renamed from: k0 */
    synchronized void m18082k0() throws IOException {
        InterfaceC0074d interfaceC0074d = this.f17874w;
        if (interfaceC0074d != null) {
            interfaceC0074d.close();
        }
        InterfaceC0074d m424c = C0082l.m424c(this.f17865n.mo19455c(this.f17868q));
        try {
            m424c.mo350b0("libcore.io.DiskLruCache").mo330G(10);
            m424c.mo350b0("1").mo330G(10);
            m424c.mo351c0(this.f17870s).mo330G(10);
            m424c.mo351c0(this.f17872u).mo330G(10);
            m424c.mo330G(10);
            for (d dVar : this.f17875x.values()) {
                if (dVar.f17890f != null) {
                    m424c.mo350b0("DIRTY").mo330G(32);
                    m424c.mo350b0(dVar.f17885a);
                    m424c.mo330G(10);
                } else {
                    m424c.mo350b0("CLEAN").mo330G(32);
                    m424c.mo350b0(dVar.f17885a);
                    dVar.m18096d(m424c);
                    m424c.mo330G(10);
                }
            }
            m18071b(null, m424c);
            if (this.f17865n.mo19458f(this.f17867p)) {
                this.f17865n.mo19459g(this.f17867p, this.f17869r);
            }
            this.f17865n.mo19459g(this.f17868q, this.f17867p);
            this.f17865n.mo19453a(this.f17869r);
            this.f17874w = m18069X();
            this.f17877z = false;
            this.f17861D = false;
        } finally {
        }
    }

    /* renamed from: l */
    public void m18083l() throws IOException {
        close();
        this.f17865n.mo19456d(this.f17866o);
    }

    /* renamed from: l0 */
    public synchronized boolean m18084l0(String str) throws IOException {
        m18079T();
        m18072c();
        m18076o0(str);
        d dVar = this.f17875x.get(str);
        if (dVar == null) {
            return false;
        }
        boolean m18085m0 = m18085m0(dVar);
        if (m18085m0 && this.f17873v <= this.f17871t) {
            this.f17860C = false;
        }
        return m18085m0;
    }

    /* renamed from: m0 */
    boolean m18085m0(d dVar) throws IOException {
        c cVar = dVar.f17890f;
        if (cVar != null) {
            cVar.m18091c();
        }
        for (int i10 = 0; i10 < this.f17872u; i10++) {
            this.f17865n.mo19453a(dVar.f17887c[i10]);
            long j10 = this.f17873v;
            long[] jArr = dVar.f17886b;
            this.f17873v = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f17876y++;
        this.f17874w.mo350b0("REMOVE").mo330G(32).mo350b0(dVar.f17885a).mo330G(10);
        this.f17875x.remove(dVar.f17885a);
        if (m18080W()) {
            this.f17863F.execute(this.f17864G);
        }
        return true;
    }

    /* renamed from: n0 */
    void m18086n0() throws IOException {
        while (this.f17873v > this.f17871t) {
            m18085m0(this.f17875x.values().iterator().next());
        }
        this.f17860C = false;
    }

    /* renamed from: z */
    public c m18087z(String str) throws IOException {
        return m18077O(str, -1L);
    }
}
