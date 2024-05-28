package p187o5;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p152l5.C3875b;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;
import p152l5.InterfaceC3879f;
import p187o5.InterfaceC4137d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o5.f */
/* loaded from: classes.dex */
public final class C4139f implements InterfaceC3878e {

    /* renamed from: f */
    private static final Charset f16851f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C3876c f16852g = C3876c.m16477a("key").m16482b(C4134a.m17135b().m17137c(1).m17136a()).m16481a();

    /* renamed from: h */
    private static final C3876c f16853h = C3876c.m16477a("value").m16482b(C4134a.m17135b().m17137c(2).m17136a()).m16481a();

    /* renamed from: i */
    private static final InterfaceC3877d<Map.Entry<Object, Object>> f16854i = C4138e.f16850a;

    /* renamed from: a */
    private OutputStream f16855a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3877d<?>> f16856b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC3879f<?>> f16857c;

    /* renamed from: d */
    private final InterfaceC3877d<Object> f16858d;

    /* renamed from: e */
    private final C4142i f16859e = new C4142i(this);

    /* renamed from: o5.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16860a;

        static {
            int[] iArr = new int[InterfaceC4137d.a.values().length];
            f16860a = iArr;
            try {
                iArr[InterfaceC4137d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16860a[InterfaceC4137d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16860a[InterfaceC4137d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4139f(OutputStream outputStream, Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d) {
        this.f16855a = outputStream;
        this.f16856b = map;
        this.f16857c = map2;
        this.f16858d = interfaceC3877d;
    }

    /* renamed from: l */
    private static ByteBuffer m17140l(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: m */
    private <T> long m17141m(InterfaceC3877d<T> interfaceC3877d, T t10) throws IOException {
        C4135b c4135b = new C4135b();
        try {
            OutputStream outputStream = this.f16855a;
            this.f16855a = c4135b;
            try {
                interfaceC3877d.mo79a(t10, this);
                this.f16855a = outputStream;
                long m17138b = c4135b.m17138b();
                c4135b.close();
                return m17138b;
            } catch (Throwable th) {
                this.f16855a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4135b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: n */
    private <T> C4139f m17142n(InterfaceC3877d<T> interfaceC3877d, C3876c c3876c, T t10, boolean z10) throws IOException {
        long m17141m = m17141m(interfaceC3877d, t10);
        if (z10 && m17141m == 0) {
            return this;
        }
        m17147t((m17145r(c3876c) << 3) | 2);
        m17148u(m17141m);
        interfaceC3877d.mo79a(t10, this);
        return this;
    }

    /* renamed from: o */
    private <T> C4139f m17143o(InterfaceC3879f<T> interfaceC3879f, C3876c c3876c, T t10, boolean z10) throws IOException {
        this.f16859e.m17167d(c3876c, z10);
        interfaceC3879f.mo16485a(t10, this.f16859e);
        return this;
    }

    /* renamed from: q */
    private static InterfaceC4137d m17144q(C3876c c3876c) {
        InterfaceC4137d interfaceC4137d = (InterfaceC4137d) c3876c.m16480c(InterfaceC4137d.class);
        if (interfaceC4137d != null) {
            return interfaceC4137d;
        }
        throw new C3875b("Field has no @Protobuf config");
    }

    /* renamed from: r */
    private static int m17145r(C3876c c3876c) {
        InterfaceC4137d interfaceC4137d = (InterfaceC4137d) c3876c.m16480c(InterfaceC4137d.class);
        if (interfaceC4137d != null) {
            return interfaceC4137d.tag();
        }
        throw new C3875b("Field has no @Protobuf config");
    }

    /* renamed from: s */
    public static /* synthetic */ void m17146s(Map.Entry entry, InterfaceC3878e interfaceC3878e) throws IOException {
        interfaceC3878e.mo16483a(f16852g, entry.getKey());
        interfaceC3878e.mo16483a(f16853h, entry.getValue());
    }

    /* renamed from: t */
    private void m17147t(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f16855a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f16855a.write(i10 & 127);
    }

    /* renamed from: u */
    private void m17148u(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f16855a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f16855a.write(((int) j10) & 127);
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: a */
    public InterfaceC3878e mo16483a(C3876c c3876c, Object obj) throws IOException {
        return m17151f(c3876c, obj, true);
    }

    /* renamed from: c */
    InterfaceC3878e m17149c(C3876c c3876c, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m17147t((m17145r(c3876c) << 3) | 1);
        this.f16855a.write(m17140l(8).putDouble(d10).array());
        return this;
    }

    /* renamed from: e */
    InterfaceC3878e m17150e(C3876c c3876c, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m17147t((m17145r(c3876c) << 3) | 5);
        this.f16855a.write(m17140l(4).putFloat(f10).array());
        return this;
    }

    /* renamed from: f */
    public InterfaceC3878e m17151f(C3876c c3876c, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m17147t((m17145r(c3876c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f16851f);
            m17147t(bytes.length);
            this.f16855a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m17151f(c3876c, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m17142n(f16854i, c3876c, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m17149c(c3876c, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return m17150e(c3876c, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m17155j(c3876c, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return m17156k(c3876c, ((Boolean) obj).booleanValue(), z10);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            m17147t((m17145r(c3876c) << 3) | 2);
            m17147t(bArr.length);
            this.f16855a.write(bArr);
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f16856b.get(obj.getClass());
        if (interfaceC3877d != null) {
            return m17142n(interfaceC3877d, c3876c, obj, z10);
        }
        InterfaceC3879f<?> interfaceC3879f = this.f16857c.get(obj.getClass());
        if (interfaceC3879f != null) {
            return m17143o(interfaceC3879f, c3876c, obj, z10);
        }
        if (obj instanceof InterfaceC4136c) {
            return m17152g(c3876c, ((InterfaceC4136c) obj).mo13409b());
        }
        if (obj instanceof Enum) {
            return m17152g(c3876c, ((Enum) obj).ordinal());
        }
        return m17142n(this.f16858d, c3876c, obj, z10);
    }

    /* renamed from: g */
    public C4139f m17152g(C3876c c3876c, int i10) throws IOException {
        return m17153h(c3876c, i10, true);
    }

    /* renamed from: h */
    C4139f m17153h(C3876c c3876c, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC4137d m17144q = m17144q(c3876c);
        int i11 = a.f16860a[m17144q.intEncoding().ordinal()];
        if (i11 == 1) {
            m17147t(m17144q.tag() << 3);
            m17147t(i10);
        } else if (i11 == 2) {
            m17147t(m17144q.tag() << 3);
            m17147t((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            m17147t((m17144q.tag() << 3) | 5);
            this.f16855a.write(m17140l(4).putInt(i10).array());
        }
        return this;
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: i */
    public C4139f mo16484d(C3876c c3876c, long j10) throws IOException {
        return m17155j(c3876c, j10, true);
    }

    /* renamed from: j */
    C4139f m17155j(C3876c c3876c, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC4137d m17144q = m17144q(c3876c);
        int i10 = a.f16860a[m17144q.intEncoding().ordinal()];
        if (i10 == 1) {
            m17147t(m17144q.tag() << 3);
            m17148u(j10);
        } else if (i10 == 2) {
            m17147t(m17144q.tag() << 3);
            m17148u((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            m17147t((m17144q.tag() << 3) | 1);
            this.f16855a.write(m17140l(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: k */
    public C4139f m17156k(C3876c c3876c, boolean z10, boolean z11) throws IOException {
        return m17153h(c3876c, z10 ? 1 : 0, z11);
    }

    /* renamed from: p */
    public C4139f m17157p(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f16856b.get(obj.getClass());
        if (interfaceC3877d != null) {
            interfaceC3877d.mo79a(obj, this);
            return this;
        }
        throw new C3875b("No encoder for " + obj.getClass());
    }
}
