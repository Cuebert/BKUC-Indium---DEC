package p187o5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p152l5.C3875b;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;
import p152l5.InterfaceC3879f;
import p163m5.InterfaceC3956a;
import p163m5.InterfaceC3957b;
import p187o5.C4141h;

/* renamed from: o5.h */
/* loaded from: classes.dex */
public class C4141h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3877d<?>> f16862a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3879f<?>> f16863b;

    /* renamed from: c */
    private final InterfaceC3877d<Object> f16864c;

    /* renamed from: o5.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3957b<a> {

        /* renamed from: d */
        private static final InterfaceC3877d<Object> f16865d = new InterfaceC3877d() { // from class: o5.g
            @Override // p152l5.InterfaceC3877d
            /* renamed from: a */
            public final void mo79a(Object obj, Object obj2) {
                C4141h.a.m17162e(obj, (InterfaceC3878e) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, InterfaceC3877d<?>> f16866a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC3879f<?>> f16867b = new HashMap();

        /* renamed from: c */
        private InterfaceC3877d<Object> f16868c = f16865d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m17162e(Object obj, InterfaceC3878e interfaceC3878e) throws IOException {
            throw new C3875b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C4141h m17163c() {
            return new C4141h(new HashMap(this.f16866a), new HashMap(this.f16867b), this.f16868c);
        }

        /* renamed from: d */
        public a m17164d(InterfaceC3956a interfaceC3956a) {
            interfaceC3956a.mo78a(this);
            return this;
        }

        @Override // p163m5.InterfaceC3957b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a mo16689a(Class<U> cls, InterfaceC3877d<? super U> interfaceC3877d) {
            this.f16866a.put(cls, interfaceC3877d);
            this.f16867b.remove(cls);
            return this;
        }
    }

    C4141h(Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d) {
        this.f16862a = map;
        this.f16863b = map2;
        this.f16864c = interfaceC3877d;
    }

    /* renamed from: a */
    public static a m17158a() {
        return new a();
    }

    /* renamed from: b */
    public void m17159b(Object obj, OutputStream outputStream) throws IOException {
        new C4139f(outputStream, this.f16862a, this.f16863b, this.f16864c).m17157p(obj);
    }

    /* renamed from: c */
    public byte[] m17160c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m17159b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
