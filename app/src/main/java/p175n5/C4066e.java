package p175n5;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p152l5.C3875b;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;
import p152l5.InterfaceC3879f;
import p152l5.InterfaceC3880g;

/* renamed from: n5.e */
/* loaded from: classes.dex */
final class C4066e implements InterfaceC3878e, InterfaceC3880g {

    /* renamed from: a */
    private C4066e f16482a = null;

    /* renamed from: b */
    private boolean f16483b = true;

    /* renamed from: c */
    private final JsonWriter f16484c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC3877d<?>> f16485d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC3879f<?>> f16486e;

    /* renamed from: f */
    private final InterfaceC3877d<Object> f16487f;

    /* renamed from: g */
    private final boolean f16488g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4066e(Writer writer, Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d, boolean z10) {
        this.f16484c = new JsonWriter(writer);
        this.f16485d = map;
        this.f16486e = map2;
        this.f16487f = interfaceC3877d;
        this.f16488g = z10;
    }

    /* renamed from: l */
    private boolean m16877l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: o */
    private C4066e m16878o(String str, Object obj) throws IOException, C3875b {
        m16880q();
        this.f16484c.name(str);
        if (obj == null) {
            this.f16484c.nullValue();
            return this;
        }
        return m16882f(obj, false);
    }

    /* renamed from: p */
    private C4066e m16879p(String str, Object obj) throws IOException, C3875b {
        if (obj == null) {
            return this;
        }
        m16880q();
        this.f16484c.name(str);
        return m16882f(obj, false);
    }

    /* renamed from: q */
    private void m16880q() throws IOException {
        if (this.f16483b) {
            C4066e c4066e = this.f16482a;
            if (c4066e != null) {
                c4066e.m16880q();
                this.f16482a.f16483b = false;
                this.f16482a = null;
                this.f16484c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: a */
    public InterfaceC3878e mo16483a(C3876c c3876c, Object obj) throws IOException {
        return m16885i(c3876c.m16479b(), obj);
    }

    @Override // p152l5.InterfaceC3878e
    /* renamed from: d */
    public InterfaceC3878e mo16484d(C3876c c3876c, long j10) throws IOException {
        return m16884h(c3876c.m16479b(), j10);
    }

    /* renamed from: e */
    public C4066e m16881e(long j10) throws IOException {
        m16880q();
        this.f16484c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C4066e m16882f(Object obj, boolean z10) throws IOException {
        int i10 = 0;
        if (z10 && m16877l(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C3875b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f16484c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f16484c.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m16887k((byte[]) obj);
            }
            this.f16484c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f16484c.value(r6[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    m16881e(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f16484c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f16484c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m16882f(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m16882f(obj2, false);
                }
            }
            this.f16484c.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.f16484c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m16882f(it.next(), false);
            }
            this.f16484c.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.f16484c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m16885i((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new C3875b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            this.f16484c.endObject();
            return this;
        }
        InterfaceC3877d<?> interfaceC3877d = this.f16485d.get(obj.getClass());
        if (interfaceC3877d != null) {
            return m16889n(interfaceC3877d, obj, z10);
        }
        InterfaceC3879f<?> interfaceC3879f = this.f16486e.get(obj.getClass());
        if (interfaceC3879f != null) {
            interfaceC3879f.mo16485a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            mo16486b(((Enum) obj).name());
            return this;
        }
        return m16889n(this.f16487f, obj, z10);
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4066e mo16486b(String str) throws IOException {
        m16880q();
        this.f16484c.value(str);
        return this;
    }

    /* renamed from: h */
    public C4066e m16884h(String str, long j10) throws IOException {
        m16880q();
        this.f16484c.name(str);
        return m16881e(j10);
    }

    /* renamed from: i */
    public C4066e m16885i(String str, Object obj) throws IOException {
        if (this.f16488g) {
            return m16879p(str, obj);
        }
        return m16878o(str, obj);
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4066e mo16487c(boolean z10) throws IOException {
        m16880q();
        this.f16484c.value(z10);
        return this;
    }

    /* renamed from: k */
    public C4066e m16887k(byte[] bArr) throws IOException {
        m16880q();
        if (bArr == null) {
            this.f16484c.nullValue();
        } else {
            this.f16484c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m16888m() throws IOException {
        m16880q();
        this.f16484c.flush();
    }

    /* renamed from: n */
    C4066e m16889n(InterfaceC3877d<Object> interfaceC3877d, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f16484c.beginObject();
        }
        interfaceC3877d.mo79a(obj, this);
        if (!z10) {
            this.f16484c.endObject();
        }
        return this;
    }
}
