package p175n5;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p152l5.C3875b;
import p152l5.InterfaceC3874a;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;
import p152l5.InterfaceC3879f;
import p152l5.InterfaceC3880g;
import p163m5.InterfaceC3956a;
import p163m5.InterfaceC3957b;

/* renamed from: n5.d */
/* loaded from: classes.dex */
public final class C4065d implements InterfaceC3957b<C4065d> {

    /* renamed from: e */
    private static final InterfaceC3877d<Object> f16472e = C4062a.f16469a;

    /* renamed from: f */
    private static final InterfaceC3879f<String> f16473f = C4064c.f16471a;

    /* renamed from: g */
    private static final InterfaceC3879f<Boolean> f16474g = C4063b.f16470a;

    /* renamed from: h */
    private static final b f16475h = new b(null);

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3877d<?>> f16476a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3879f<?>> f16477b = new HashMap();

    /* renamed from: c */
    private InterfaceC3877d<Object> f16478c = f16472e;

    /* renamed from: d */
    private boolean f16479d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n5.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3874a {
        a() {
        }

        @Override // p152l5.InterfaceC3874a
        /* renamed from: a */
        public String mo16475a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo16476b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // p152l5.InterfaceC3874a
        /* renamed from: b */
        public void mo16476b(Object obj, Writer writer) throws IOException {
            C4066e c4066e = new C4066e(writer, C4065d.this.f16476a, C4065d.this.f16477b, C4065d.this.f16478c, C4065d.this.f16479d);
            c4066e.m16882f(obj, false);
            c4066e.m16888m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n5.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC3879f<Date> {

        /* renamed from: a */
        private static final DateFormat f16481a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f16481a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p152l5.InterfaceC3879f
        /* renamed from: b */
        public void mo16485a(Date date, InterfaceC3880g interfaceC3880g) throws IOException {
            interfaceC3880g.mo16486b(f16481a.format(date));
        }
    }

    public C4065d() {
        m16875p(String.class, f16473f);
        m16875p(Boolean.class, f16474g);
        m16875p(Date.class, f16475h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m16868l(Object obj, InterfaceC3878e interfaceC3878e) throws IOException {
        throw new C3875b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m16870n(Boolean bool, InterfaceC3880g interfaceC3880g) throws IOException {
        interfaceC3880g.mo16487c(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC3874a m16871i() {
        return new a();
    }

    /* renamed from: j */
    public C4065d m16872j(InterfaceC3956a interfaceC3956a) {
        interfaceC3956a.mo78a(this);
        return this;
    }

    /* renamed from: k */
    public C4065d m16873k(boolean z10) {
        this.f16479d = z10;
        return this;
    }

    @Override // p163m5.InterfaceC3957b
    /* renamed from: o */
    public <T> C4065d mo16689a(Class<T> cls, InterfaceC3877d<? super T> interfaceC3877d) {
        this.f16476a.put(cls, interfaceC3877d);
        this.f16477b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C4065d m16875p(Class<T> cls, InterfaceC3879f<? super T> interfaceC3879f) {
        this.f16477b.put(cls, interfaceC3879f);
        this.f16476a.remove(cls);
        return this;
    }
}
