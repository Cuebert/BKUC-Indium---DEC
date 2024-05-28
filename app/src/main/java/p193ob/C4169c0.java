package p193ob;

import ac.C0073c;
import ac.C0076f;
import ac.InterfaceC0074d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p205pb.C4286e;

/* renamed from: ob.c0 */
/* loaded from: classes.dex */
public final class C4169c0 extends AbstractC4179h0 {

    /* renamed from: f */
    public static final C4167b0 f16971f = C4167b0.m17278c("multipart/mixed");

    /* renamed from: g */
    public static final C4167b0 f16972g = C4167b0.m17278c("multipart/alternative");

    /* renamed from: h */
    public static final C4167b0 f16973h = C4167b0.m17278c("multipart/digest");

    /* renamed from: i */
    public static final C4167b0 f16974i = C4167b0.m17278c("multipart/parallel");

    /* renamed from: j */
    public static final C4167b0 f16975j = C4167b0.m17278c("multipart/form-data");

    /* renamed from: k */
    private static final byte[] f16976k = {58, 32};

    /* renamed from: l */
    private static final byte[] f16977l = {13, 10};

    /* renamed from: m */
    private static final byte[] f16978m = {45, 45};

    /* renamed from: a */
    private final C0076f f16979a;

    /* renamed from: b */
    private final C4167b0 f16980b;

    /* renamed from: c */
    private final C4167b0 f16981c;

    /* renamed from: d */
    private final List<b> f16982d;

    /* renamed from: e */
    private long f16983e = -1;

    /* renamed from: ob.c0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C0076f f16984a;

        /* renamed from: b */
        private C4167b0 f16985b;

        /* renamed from: c */
        private final List<b> f16986c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public a m17285a(C4200y c4200y, AbstractC4179h0 abstractC4179h0) {
            return m17286b(b.m17289a(c4200y, abstractC4179h0));
        }

        /* renamed from: b */
        public a m17286b(b bVar) {
            Objects.requireNonNull(bVar, "part == null");
            this.f16986c.add(bVar);
            return this;
        }

        /* renamed from: c */
        public C4169c0 m17287c() {
            if (!this.f16986c.isEmpty()) {
                return new C4169c0(this.f16984a, this.f16985b, this.f16986c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        /* renamed from: d */
        public a m17288d(C4167b0 c4167b0) {
            Objects.requireNonNull(c4167b0, "type == null");
            if (c4167b0.m17282e().equals("multipart")) {
                this.f16985b = c4167b0;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + c4167b0);
        }

        public a(String str) {
            this.f16985b = C4169c0.f16971f;
            this.f16986c = new ArrayList();
            this.f16984a = C0076f.m388i(str);
        }
    }

    /* renamed from: ob.c0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final C4200y f16987a;

        /* renamed from: b */
        final AbstractC4179h0 f16988b;

        private b(C4200y c4200y, AbstractC4179h0 abstractC4179h0) {
            this.f16987a = c4200y;
            this.f16988b = abstractC4179h0;
        }

        /* renamed from: a */
        public static b m17289a(C4200y c4200y, AbstractC4179h0 abstractC4179h0) {
            Objects.requireNonNull(abstractC4179h0, "body == null");
            if (c4200y != null && c4200y.m17555c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (c4200y != null && c4200y.m17555c("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new b(c4200y, abstractC4179h0);
        }
    }

    C4169c0(C0076f c0076f, C4167b0 c4167b0, List<b> list) {
        this.f16979a = c0076f;
        this.f16980b = c4167b0;
        this.f16981c = C4167b0.m17278c(c4167b0 + "; boundary=" + c0076f.mo404w());
        this.f16982d = C4286e.m17756t(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    private long m17284j(InterfaceC0074d interfaceC0074d, boolean z10) throws IOException {
        C0073c c0073c;
        if (z10) {
            interfaceC0074d = new C0073c();
            c0073c = interfaceC0074d;
        } else {
            c0073c = 0;
        }
        int size = this.f16982d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f16982d.get(i10);
            C4200y c4200y = bVar.f16987a;
            AbstractC4179h0 abstractC4179h0 = bVar.f16988b;
            interfaceC0074d.mo339M(f16978m);
            interfaceC0074d.mo326E(this.f16979a);
            interfaceC0074d.mo339M(f16977l);
            if (c4200y != null) {
                int m17558h = c4200y.m17558h();
                for (int i11 = 0; i11 < m17558h; i11++) {
                    interfaceC0074d.mo350b0(c4200y.m17556e(i11)).mo339M(f16976k).mo350b0(c4200y.m17559i(i11)).mo339M(f16977l);
                }
            }
            C4167b0 mo14715b = abstractC4179h0.mo14715b();
            if (mo14715b != null) {
                interfaceC0074d.mo350b0("Content-Type: ").mo350b0(mo14715b.toString()).mo339M(f16977l);
            }
            long mo14714a = abstractC4179h0.mo14714a();
            if (mo14714a != -1) {
                interfaceC0074d.mo350b0("Content-Length: ").mo351c0(mo14714a).mo339M(f16977l);
            } else if (z10) {
                c0073c.m347Y();
                return -1L;
            }
            byte[] bArr = f16977l;
            interfaceC0074d.mo339M(bArr);
            if (z10) {
                j10 += mo14714a;
            } else {
                abstractC4179h0.mo14716i(interfaceC0074d);
            }
            interfaceC0074d.mo339M(bArr);
        }
        byte[] bArr2 = f16978m;
        interfaceC0074d.mo339M(bArr2);
        interfaceC0074d.mo326E(this.f16979a);
        interfaceC0074d.mo339M(bArr2);
        interfaceC0074d.mo339M(f16977l);
        if (!z10) {
            return j10;
        }
        long m381y0 = j10 + c0073c.m381y0();
        c0073c.m347Y();
        return m381y0;
    }

    @Override // p193ob.AbstractC4179h0
    /* renamed from: a */
    public long mo14714a() throws IOException {
        long j10 = this.f16983e;
        if (j10 != -1) {
            return j10;
        }
        long m17284j = m17284j(null, true);
        this.f16983e = m17284j;
        return m17284j;
    }

    @Override // p193ob.AbstractC4179h0
    /* renamed from: b */
    public C4167b0 mo14715b() {
        return this.f16981c;
    }

    @Override // p193ob.AbstractC4179h0
    /* renamed from: i */
    public void mo14716i(InterfaceC0074d interfaceC0074d) throws IOException {
        m17284j(interfaceC0074d, false);
    }
}
