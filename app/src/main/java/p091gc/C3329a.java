package p091gc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p091gc.InterfaceC3334f;
import p119ic.InterfaceC3579w;
import p193ob.AbstractC4179h0;
import p193ob.AbstractC4183j0;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.a */
/* loaded from: classes.dex */
public final class C3329a extends InterfaceC3334f.a {

    /* renamed from: a */
    private boolean f13835a = true;

    /* renamed from: gc.a$a */
    /* loaded from: classes.dex */
    static final class a implements InterfaceC3334f<AbstractC4183j0, AbstractC4183j0> {

        /* renamed from: a */
        static final a f13836a = new a();

        a() {
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b */
        public AbstractC4183j0 mo14629a(AbstractC4183j0 abstractC4183j0) throws IOException {
            try {
                return C3353y.m14756a(abstractC4183j0);
            } finally {
                abstractC4183j0.close();
            }
        }
    }

    /* renamed from: gc.a$b */
    /* loaded from: classes.dex */
    static final class b implements InterfaceC3334f<AbstractC4179h0, AbstractC4179h0> {

        /* renamed from: a */
        static final b f13837a = new b();

        b() {
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b */
        public AbstractC4179h0 mo14629a(AbstractC4179h0 abstractC4179h0) {
            return abstractC4179h0;
        }
    }

    /* renamed from: gc.a$c */
    /* loaded from: classes.dex */
    static final class c implements InterfaceC3334f<AbstractC4183j0, AbstractC4183j0> {

        /* renamed from: a */
        static final c f13838a = new c();

        c() {
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b */
        public AbstractC4183j0 mo14629a(AbstractC4183j0 abstractC4183j0) {
            return abstractC4183j0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.a$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC3334f<Object, String> {

        /* renamed from: a */
        static final d f13839a = new d();

        d() {
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b */
        public String mo14629a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: gc.a$e */
    /* loaded from: classes.dex */
    static final class e implements InterfaceC3334f<AbstractC4183j0, C4755l> {

        /* renamed from: a */
        static final e f13840a = new e();

        e() {
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b */
        public C4755l mo14629a(AbstractC4183j0 abstractC4183j0) {
            abstractC4183j0.close();
            return C4755l.f18582a;
        }
    }

    /* renamed from: gc.a$f */
    /* loaded from: classes.dex */
    static final class f implements InterfaceC3334f<AbstractC4183j0, Void> {

        /* renamed from: a */
        static final f f13841a = new f();

        f() {
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b */
        public Void mo14629a(AbstractC4183j0 abstractC4183j0) {
            abstractC4183j0.close();
            return null;
        }
    }

    @Override // p091gc.InterfaceC3334f.a
    /* renamed from: c */
    public InterfaceC3334f<?, AbstractC4179h0> mo14627c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3349u c3349u) {
        if (AbstractC4179h0.class.isAssignableFrom(C3353y.m14763h(type))) {
            return b.f13837a;
        }
        return null;
    }

    @Override // p091gc.InterfaceC3334f.a
    /* renamed from: d */
    public InterfaceC3334f<AbstractC4183j0, ?> mo14628d(Type type, Annotation[] annotationArr, C3349u c3349u) {
        if (type == AbstractC4183j0.class) {
            if (C3353y.m14767l(annotationArr, InterfaceC3579w.class)) {
                return c.f13838a;
            }
            return a.f13836a;
        }
        if (type == Void.class) {
            return f.f13841a;
        }
        if (!this.f13835a || type != C4755l.class) {
            return null;
        }
        try {
            return e.f13840a;
        } catch (NoClassDefFoundError unused) {
            this.f13835a = false;
            return null;
        }
    }
}
