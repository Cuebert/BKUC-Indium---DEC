package p283w3;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.d2 */
/* loaded from: classes.dex */
public final class C5159d2 implements InterfaceC3878e {

    /* renamed from: f */
    private static final Charset f19490f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C3876c f19491g;

    /* renamed from: h */
    private static final C3876c f19492h;

    /* renamed from: i */
    private static final InterfaceC3877d<Map.Entry<Object, Object>> f19493i;

    /* renamed from: a */
    private OutputStream f19494a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3877d<?>> f19495b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC3879f<?>> f19496c;

    /* renamed from: d */
    private final InterfaceC3877d<Object> f19497d;

    /* renamed from: e */
    private final C5212h2 f19498e = new C5212h2(this);

    static {
        C3876c.b m16477a = C3876c.m16477a("key");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f19491g = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("value");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f19492h = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        f19493i = C5145c2.f19425a;
    }

    public C5159d2(OutputStream outputStream, Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d) {
        this.f19494a = outputStream;
        this.f19495b = map;
        this.f19496c = map2;
        this.f19497d = interfaceC3877d;
    }

    /* renamed from: i */
    public static /* synthetic */ void m19772i(Map.Entry entry, InterfaceC3878e interfaceC3878e) throws IOException {
        interfaceC3878e.mo16483a(f19491g, entry.getKey());
        interfaceC3878e.mo16483a(f19492h, entry.getValue());
    }

    /* renamed from: j */
    private static int m19773j(C3876c c3876c) {
        InterfaceC5131b2 interfaceC5131b2 = (InterfaceC5131b2) c3876c.m16480c(InterfaceC5131b2.class);
        if (interfaceC5131b2 != null) {
            return interfaceC5131b2.zza();
        }
        throw new C3875b("Field has no @Protobuf config");
    }

    /* renamed from: k */
    private final <T> long m19774k(InterfaceC3877d<T> interfaceC3877d, T t10) throws IOException {
        C5419x1 c5419x1 = new C5419x1();
        try {
            OutputStream outputStream = this.f19494a;
            this.f19494a = c5419x1;
            try {
                interfaceC3877d.mo79a(t10, this);
                this.f19494a = outputStream;
                long m20027b = c5419x1.m20027b();
                c5419x1.close();
                return m20027b;
            } catch (Throwable th) {
                this.f19494a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c5419x1.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: l */
    private static InterfaceC5131b2 m19775l(C3876c c3876c) {
        InterfaceC5131b2 interfaceC5131b2 = (InterfaceC5131b2) c3876c.m16480c(InterfaceC5131b2.class);
        if (interfaceC5131b2 != null) {
            return interfaceC5131b2;
        }
        throw new C3875b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> C5159d2 m19776m(InterfaceC3877d<T> interfaceC3877d, C3876c c3876c, T t10, boolean z10) throws IOException {
        long m19774k = m19774k(interfaceC3877d, t10);
        if (z10 && m19774k == 0) {
            return this;
        }
        m19779p((m19773j(c3876c) << 3) | 2);
        m19780q(m19774k);
        interfaceC3877d.mo79a(t10, this);
        return this;
    }

    /* renamed from: n */
    private final <T> C5159d2 m19777n(InterfaceC3879f<T> interfaceC3879f, C3876c c3876c, T t10, boolean z10) throws IOException {
        this.f19498e.m19841a(c3876c, z10);
        interfaceC3879f.mo16485a(t10, this.f19498e);
        return this;
    }

    /* renamed from: o */
    private static ByteBuffer m19778o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private final void m19779p(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f19494a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f19494a.write(i10 & 127);
    }

    /* renamed from: q */
    private final void m19780q(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f19494a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f19494a.write(((int) j10) & 127);
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: a */
    public final InterfaceC3878e mo16483a(C3876c c3876c, Object obj) throws IOException {
        m19783e(c3876c, obj, true);
        return this;
    }

    /* renamed from: b */
    final InterfaceC3878e m19781b(C3876c c3876c, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m19779p((m19773j(c3876c) << 3) | 1);
        this.f19494a.write(m19778o(8).putDouble(d10).array());
        return this;
    }

    /* renamed from: c */
    final InterfaceC3878e m19782c(C3876c c3876c, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m19779p((m19773j(c3876c) << 3) | 5);
        this.f19494a.write(m19778o(4).putFloat(f10).array());
        return this;
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC3878e mo16484d(C3876c c3876c, long j10) throws IOException {
        m19785g(c3876c, j10, true);
        return this;
    }

    /* renamed from: e */
    public final InterfaceC3878e m19783e(C3876c c3876c, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m19779p((m19773j(c3876c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f19490f);
            m19779p(bytes.length);
            this.f19494a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m19783e(c3876c, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m19776m(f19493i, c3876c, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            m19781b(c3876c, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            m19782c(c3876c, ((Float) obj).floatValue(), z10);
            return this;
        }
        if (obj instanceof Number) {
            m19785g(c3876c, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            m19784f(c3876c, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            m19779p((m19773j(c3876c) << 3) | 2);
            m19779p(bArr.length);
            this.f19494a.write(bArr);
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f19495b.get(obj.getClass());
        if (interfaceC3877d != null) {
            m19776m(interfaceC3877d, c3876c, obj, z10);
            return this;
        }
        InterfaceC3879f<?> interfaceC3879f = this.f19496c.get(obj.getClass());
        if (interfaceC3879f != null) {
            m19777n(interfaceC3879f, c3876c, obj, z10);
            return this;
        }
        if (obj instanceof InterfaceC5432y1) {
            m19784f(c3876c, ((InterfaceC5432y1) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m19784f(c3876c, ((Enum) obj).ordinal(), true);
            return this;
        }
        m19776m(this.f19497d, c3876c, obj, z10);
        return this;
    }

    /* renamed from: f */
    public final C5159d2 m19784f(C3876c c3876c, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC5131b2 m19775l = m19775l(c3876c);
        EnumC5445z1 enumC5445z1 = EnumC5445z1.DEFAULT;
        int ordinal = m19775l.zzb().ordinal();
        if (ordinal == 0) {
            m19779p(m19775l.zza() << 3);
            m19779p(i10);
        } else if (ordinal == 1) {
            m19779p(m19775l.zza() << 3);
            m19779p((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            m19779p((m19775l.zza() << 3) | 5);
            this.f19494a.write(m19778o(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: g */
    final C5159d2 m19785g(C3876c c3876c, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC5131b2 m19775l = m19775l(c3876c);
        EnumC5445z1 enumC5445z1 = EnumC5445z1.DEFAULT;
        int ordinal = m19775l.zzb().ordinal();
        if (ordinal == 0) {
            m19779p(m19775l.zza() << 3);
            m19780q(j10);
        } else if (ordinal == 1) {
            m19779p(m19775l.zza() << 3);
            m19780q((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            m19779p((m19775l.zza() << 3) | 1);
            this.f19494a.write(m19778o(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: h */
    public final C5159d2 m19786h(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f19495b.get(obj.getClass());
        if (interfaceC3877d != null) {
            interfaceC3877d.mo79a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
        sb2.append("No encoder for ");
        sb2.append(valueOf);
        throw new C3875b(sb2.toString());
    }
}
