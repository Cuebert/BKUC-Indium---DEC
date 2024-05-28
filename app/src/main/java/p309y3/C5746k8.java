package p309y3;

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
/* renamed from: y3.k8 */
/* loaded from: classes.dex */
public final class C5746k8 implements InterfaceC3878e {

    /* renamed from: f */
    private static final Charset f21127f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C3876c f21128g;

    /* renamed from: h */
    private static final C3876c f21129h;

    /* renamed from: i */
    private static final InterfaceC3877d<Map.Entry<Object, Object>> f21130i;

    /* renamed from: a */
    private OutputStream f21131a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3877d<?>> f21132b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC3879f<?>> f21133c;

    /* renamed from: d */
    private final InterfaceC3877d<Object> f21134d;

    /* renamed from: e */
    private final C5677e f21135e = new C5677e(this);

    static {
        C3876c.b m16477a = C3876c.m16477a("key");
        C5686e8 c5686e8 = new C5686e8();
        c5686e8.m20673a(1);
        f21128g = m16477a.m16482b(c5686e8.m20674b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("value");
        C5686e8 c5686e82 = new C5686e8();
        c5686e82.m20673a(2);
        f21129h = m16477a2.m16482b(c5686e82.m20674b()).m16481a();
        f21130i = C5736j8.f21108a;
    }

    public C5746k8(OutputStream outputStream, Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d) {
        this.f21131a = outputStream;
        this.f21132b = map;
        this.f21133c = map2;
        this.f21134d = interfaceC3877d;
    }

    /* renamed from: i */
    public static /* synthetic */ void m20693i(Map.Entry entry, InterfaceC3878e interfaceC3878e) throws IOException {
        interfaceC3878e.mo16483a(f21128g, entry.getKey());
        interfaceC3878e.mo16483a(f21129h, entry.getValue());
    }

    /* renamed from: j */
    private static int m20694j(C3876c c3876c) {
        InterfaceC5726i8 interfaceC5726i8 = (InterfaceC5726i8) c3876c.m16480c(InterfaceC5726i8.class);
        if (interfaceC5726i8 != null) {
            return interfaceC5726i8.zza();
        }
        throw new C3875b("Field has no @Protobuf config");
    }

    /* renamed from: k */
    private final <T> long m20695k(InterfaceC3877d<T> interfaceC3877d, T t10) throws IOException {
        C5696f8 c5696f8 = new C5696f8();
        try {
            OutputStream outputStream = this.f21131a;
            this.f21131a = c5696f8;
            try {
                interfaceC3877d.mo79a(t10, this);
                this.f21131a = outputStream;
                long m20682b = c5696f8.m20682b();
                c5696f8.close();
                return m20682b;
            } catch (Throwable th) {
                this.f21131a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c5696f8.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: l */
    private static InterfaceC5726i8 m20696l(C3876c c3876c) {
        InterfaceC5726i8 interfaceC5726i8 = (InterfaceC5726i8) c3876c.m16480c(InterfaceC5726i8.class);
        if (interfaceC5726i8 != null) {
            return interfaceC5726i8;
        }
        throw new C3875b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> C5746k8 m20697m(InterfaceC3877d<T> interfaceC3877d, C3876c c3876c, T t10, boolean z10) throws IOException {
        long m20695k = m20695k(interfaceC3877d, t10);
        if (z10 && m20695k == 0) {
            return this;
        }
        m20700p((m20694j(c3876c) << 3) | 2);
        m20701q(m20695k);
        interfaceC3877d.mo79a(t10, this);
        return this;
    }

    /* renamed from: n */
    private final <T> C5746k8 m20698n(InterfaceC3879f<T> interfaceC3879f, C3876c c3876c, T t10, boolean z10) throws IOException {
        this.f21135e.m20671a(c3876c, z10);
        interfaceC3879f.mo16485a(t10, this.f21135e);
        return this;
    }

    /* renamed from: o */
    private static ByteBuffer m20699o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private final void m20700p(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f21131a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f21131a.write(i10 & 127);
    }

    /* renamed from: q */
    private final void m20701q(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f21131a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f21131a.write(((int) j10) & 127);
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: a */
    public final InterfaceC3878e mo16483a(C3876c c3876c, Object obj) throws IOException {
        m20704e(c3876c, obj, true);
        return this;
    }

    /* renamed from: b */
    final InterfaceC3878e m20702b(C3876c c3876c, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m20700p((m20694j(c3876c) << 3) | 1);
        this.f21131a.write(m20699o(8).putDouble(d10).array());
        return this;
    }

    /* renamed from: c */
    final InterfaceC3878e m20703c(C3876c c3876c, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m20700p((m20694j(c3876c) << 3) | 5);
        this.f21131a.write(m20699o(4).putFloat(f10).array());
        return this;
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC3878e mo16484d(C3876c c3876c, long j10) throws IOException {
        m20706g(c3876c, j10, true);
        return this;
    }

    /* renamed from: e */
    public final InterfaceC3878e m20704e(C3876c c3876c, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m20700p((m20694j(c3876c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f21127f);
            m20700p(bytes.length);
            this.f21131a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m20704e(c3876c, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m20697m(f21130i, c3876c, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            m20702b(c3876c, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            m20703c(c3876c, ((Float) obj).floatValue(), z10);
            return this;
        }
        if (obj instanceof Number) {
            m20706g(c3876c, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            m20705f(c3876c, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            m20700p((m20694j(c3876c) << 3) | 2);
            m20700p(bArr.length);
            this.f21131a.write(bArr);
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f21132b.get(obj.getClass());
        if (interfaceC3877d != null) {
            m20697m(interfaceC3877d, c3876c, obj, z10);
            return this;
        }
        InterfaceC3879f<?> interfaceC3879f = this.f21133c.get(obj.getClass());
        if (interfaceC3879f != null) {
            m20698n(interfaceC3879f, c3876c, obj, z10);
            return this;
        }
        if (obj instanceof InterfaceC5706g8) {
            m20705f(c3876c, ((InterfaceC5706g8) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m20705f(c3876c, ((Enum) obj).ordinal(), true);
            return this;
        }
        m20697m(this.f21134d, c3876c, obj, z10);
        return this;
    }

    /* renamed from: f */
    public final C5746k8 m20705f(C3876c c3876c, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC5726i8 m20696l = m20696l(c3876c);
        EnumC5716h8 enumC5716h8 = EnumC5716h8.DEFAULT;
        int ordinal = m20696l.zzb().ordinal();
        if (ordinal == 0) {
            m20700p(m20696l.zza() << 3);
            m20700p(i10);
        } else if (ordinal == 1) {
            m20700p(m20696l.zza() << 3);
            m20700p((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            m20700p((m20696l.zza() << 3) | 5);
            this.f21131a.write(m20699o(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: g */
    final C5746k8 m20706g(C3876c c3876c, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC5726i8 m20696l = m20696l(c3876c);
        EnumC5716h8 enumC5716h8 = EnumC5716h8.DEFAULT;
        int ordinal = m20696l.zzb().ordinal();
        if (ordinal == 0) {
            m20700p(m20696l.zza() << 3);
            m20701q(j10);
        } else if (ordinal == 1) {
            m20700p(m20696l.zza() << 3);
            m20701q((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            m20700p((m20696l.zza() << 3) | 1);
            this.f21131a.write(m20699o(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: h */
    public final C5746k8 m20707h(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f21132b.get(obj.getClass());
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
