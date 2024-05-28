package p091gc;

import ac.C0073c;
import ac.InterfaceC0074d;
import java.io.IOException;
import java.util.regex.Pattern;
import p193ob.AbstractC4179h0;
import p193ob.C4167b0;
import p193ob.C4169c0;
import p193ob.C4177g0;
import p193ob.C4198w;
import p193ob.C4200y;
import p193ob.C4201z;

/* renamed from: gc.r */
/* loaded from: classes.dex */
final class C3346r {

    /* renamed from: l */
    private static final char[] f13954l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f13955m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f13956a;

    /* renamed from: b */
    private final C4201z f13957b;

    /* renamed from: c */
    private String f13958c;

    /* renamed from: d */
    private C4201z.a f13959d;

    /* renamed from: e */
    private final C4177g0.a f13960e = new C4177g0.a();

    /* renamed from: f */
    private final C4200y.a f13961f;

    /* renamed from: g */
    private C4167b0 f13962g;

    /* renamed from: h */
    private final boolean f13963h;

    /* renamed from: i */
    private C4169c0.a f13964i;

    /* renamed from: j */
    private C4198w.a f13965j;

    /* renamed from: k */
    private AbstractC4179h0 f13966k;

    /* renamed from: gc.r$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC4179h0 {

        /* renamed from: a */
        private final AbstractC4179h0 f13967a;

        /* renamed from: b */
        private final C4167b0 f13968b;

        a(AbstractC4179h0 abstractC4179h0, C4167b0 c4167b0) {
            this.f13967a = abstractC4179h0;
            this.f13968b = c4167b0;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: a */
        public long mo14714a() throws IOException {
            return this.f13967a.mo14714a();
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: b */
        public C4167b0 mo14715b() {
            return this.f13968b;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: i */
        public void mo14716i(InterfaceC0074d interfaceC0074d) throws IOException {
            this.f13967a.mo14716i(interfaceC0074d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3346r(String str, C4201z c4201z, String str2, C4200y c4200y, C4167b0 c4167b0, boolean z10, boolean z11, boolean z12) {
        this.f13956a = str;
        this.f13957b = c4201z;
        this.f13958c = str2;
        this.f13962g = c4167b0;
        this.f13963h = z10;
        if (c4200y != null) {
            this.f13961f = c4200y.m17557f();
        } else {
            this.f13961f = new C4200y.a();
        }
        if (z11) {
            this.f13965j = new C4198w.a();
        } else if (z12) {
            C4169c0.a aVar = new C4169c0.a();
            this.f13964i = aVar;
            aVar.m17288d(C4169c0.f16975j);
        }
    }

    /* renamed from: i */
    private static String m14701i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                i10 += Character.charCount(codePointAt);
            } else {
                C0073c c0073c = new C0073c();
                c0073c.m341N0(str, 0, i10);
                m14702j(c0073c, str, i10, length, z10);
                return c0073c.m374t0();
            }
        }
        return str;
    }

    /* renamed from: j */
    private static void m14702j(C0073c c0073c, String str, int i10, int i11, boolean z10) {
        C0073c c0073c2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                    c0073c.m342O0(codePointAt);
                } else {
                    if (c0073c2 == null) {
                        c0073c2 = new C0073c();
                    }
                    c0073c2.m342O0(codePointAt);
                    while (!c0073c2.mo328F()) {
                        int readByte = c0073c2.readByte() & 255;
                        c0073c.mo330G(37);
                        char[] cArr = f13954l;
                        c0073c.mo330G(cArr[(readByte >> 4) & 15]);
                        c0073c.mo330G(cArr[readByte & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14703a(String str, String str2, boolean z10) {
        if (z10) {
            this.f13965j.m17542b(str, str2);
        } else {
            this.f13965j.m17541a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m14704b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f13962g = C4167b0.m17278c(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        }
        this.f13961f.m17561a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m14705c(C4200y c4200y) {
        this.f13961f.m17562b(c4200y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m14706d(C4200y c4200y, AbstractC4179h0 abstractC4179h0) {
        this.f13964i.m17285a(c4200y, abstractC4179h0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m14707e(C4169c0.b bVar) {
        this.f13964i.m17286b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m14708f(String str, String str2, boolean z10) {
        if (this.f13958c != null) {
            String m14701i = m14701i(str2, z10);
            String replace = this.f13958c.replace("{" + str + "}", m14701i);
            if (!f13955m.matcher(replace).matches()) {
                this.f13958c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m14709g(String str, String str2, boolean z10) {
        String str3 = this.f13958c;
        if (str3 != null) {
            C4201z.a m17596q = this.f13957b.m17596q(str3);
            this.f13959d = m17596q;
            if (m17596q != null) {
                this.f13958c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f13957b + ", Relative: " + this.f13958c);
            }
        }
        if (z10) {
            this.f13959d.m17610a(str, str2);
        } else {
            this.f13959d.m17611b(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public <T> void m14710h(Class<T> cls, T t10) {
        this.f13960e.m17407g(cls, t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C4177g0.a m14711k() {
        C4201z m17584C;
        C4201z.a aVar = this.f13959d;
        if (aVar != null) {
            m17584C = aVar.m17612c();
        } else {
            m17584C = this.f13957b.m17584C(this.f13958c);
            if (m17584C == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f13957b + ", Relative: " + this.f13958c);
            }
        }
        AbstractC4179h0 abstractC4179h0 = this.f13966k;
        if (abstractC4179h0 == null) {
            C4198w.a aVar2 = this.f13965j;
            if (aVar2 != null) {
                abstractC4179h0 = aVar2.m17543c();
            } else {
                C4169c0.a aVar3 = this.f13964i;
                if (aVar3 != null) {
                    abstractC4179h0 = aVar3.m17287c();
                } else if (this.f13963h) {
                    abstractC4179h0 = AbstractC4179h0.m17412e(null, new byte[0]);
                }
            }
        }
        C4167b0 c4167b0 = this.f13962g;
        if (c4167b0 != null) {
            if (abstractC4179h0 != null) {
                abstractC4179h0 = new a(abstractC4179h0, c4167b0);
            } else {
                this.f13961f.m17561a("Content-Type", c4167b0.toString());
            }
        }
        return this.f13960e.m17409i(m17584C).m17403c(this.f13961f.m17565e()).m17404d(this.f13956a, abstractC4179h0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m14712l(AbstractC4179h0 abstractC4179h0) {
        this.f13966k = abstractC4179h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m14713m(Object obj) {
        this.f13958c = obj.toString();
    }
}
