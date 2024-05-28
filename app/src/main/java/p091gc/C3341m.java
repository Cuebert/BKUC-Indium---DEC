package p091gc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p145kb.C3794i;
import p145kb.InterfaceC3791h;
import p253ta.C4747d;
import p253ta.C4751h;
import p253ta.C4752i;
import p253ta.C4755l;
import p290wa.C5485c;
import p290wa.C5486d;
import p303xa.AbstractC5574c;
import p303xa.C5578g;
import p303xa.InterfaceC5576e;
import va.InterfaceC4999c;

/* renamed from: gc.m */
/* loaded from: classes.dex */
public final class C3341m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.m$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3845j implements InterfaceC3041l<Throwable, C4755l> {

        /* renamed from: n */
        final /* synthetic */ InterfaceC3330b f13876n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3330b interfaceC3330b) {
            super(1);
            this.f13876n = interfaceC3330b;
        }

        /* renamed from: a */
        public final void m14667a(Throwable th) {
            this.f13876n.cancel();
        }

        @Override // p051db.InterfaceC3041l
        public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
            m14667a(th);
            return C4755l.f18582a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3845j implements InterfaceC3041l<Throwable, C4755l> {

        /* renamed from: n */
        final /* synthetic */ InterfaceC3330b f13877n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3330b interfaceC3330b) {
            super(1);
            this.f13877n = interfaceC3330b;
        }

        /* renamed from: a */
        public final void m14668a(Throwable th) {
            this.f13877n.cancel();
        }

        @Override // p051db.InterfaceC3041l
        public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
            m14668a(th);
            return C4755l.f18582a;
        }
    }

    /* renamed from: gc.m$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements InterfaceC3332d<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3791h f13878a;

        c(InterfaceC3791h interfaceC3791h) {
            this.f13878a = interfaceC3791h;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<T> call, C3348t<T> response) {
            C3844i.m16254g(call, "call");
            C3844i.m16254g(response, "response");
            if (response.m14735f()) {
                T m14731a = response.m14731a();
                if (m14731a == null) {
                    Object m17399i = call.mo14638e().m17399i(C3340l.class);
                    if (m17399i == null) {
                        C3844i.m16261n();
                    }
                    C3844i.m16249b(m17399i, "call.request().tag(Invocation::class.java)!!");
                    Method method = ((C3340l) m17399i).m14662a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    C3844i.m16249b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    C3844i.m16249b(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    C4747d c4747d = new C4747d(sb2.toString());
                    InterfaceC3791h interfaceC3791h = this.f13878a;
                    C4751h.a aVar = C4751h.f18580n;
                    interfaceC3791h.mo16028d(C4751h.m18904a(C4752i.m18908a(c4747d)));
                    return;
                }
                InterfaceC3791h interfaceC3791h2 = this.f13878a;
                C4751h.a aVar2 = C4751h.f18580n;
                interfaceC3791h2.mo16028d(C4751h.m18904a(m14731a));
                return;
            }
            InterfaceC3791h interfaceC3791h3 = this.f13878a;
            C3338j c3338j = new C3338j(response);
            C4751h.a aVar3 = C4751h.f18580n;
            interfaceC3791h3.mo16028d(C4751h.m18904a(C4752i.m18908a(c3338j)));
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<T> call, Throwable t10) {
            C3844i.m16254g(call, "call");
            C3844i.m16254g(t10, "t");
            InterfaceC3791h interfaceC3791h = this.f13878a;
            C4751h.a aVar = C4751h.f18580n;
            interfaceC3791h.mo16028d(C4751h.m18904a(C4752i.m18908a(t10)));
        }
    }

    /* renamed from: gc.m$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements InterfaceC3332d<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3791h f13879a;

        d(InterfaceC3791h interfaceC3791h) {
            this.f13879a = interfaceC3791h;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<T> call, C3348t<T> response) {
            C3844i.m16254g(call, "call");
            C3844i.m16254g(response, "response");
            if (response.m14735f()) {
                InterfaceC3791h interfaceC3791h = this.f13879a;
                T m14731a = response.m14731a();
                C4751h.a aVar = C4751h.f18580n;
                interfaceC3791h.mo16028d(C4751h.m18904a(m14731a));
                return;
            }
            InterfaceC3791h interfaceC3791h2 = this.f13879a;
            C3338j c3338j = new C3338j(response);
            C4751h.a aVar2 = C4751h.f18580n;
            interfaceC3791h2.mo16028d(C4751h.m18904a(C4752i.m18908a(c3338j)));
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<T> call, Throwable t10) {
            C3844i.m16254g(call, "call");
            C3844i.m16254g(t10, "t");
            InterfaceC3791h interfaceC3791h = this.f13879a;
            C4751h.a aVar = C4751h.f18580n;
            interfaceC3791h.mo16028d(C4751h.m18904a(C4752i.m18908a(t10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.m$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC3845j implements InterfaceC3041l<Throwable, C4755l> {

        /* renamed from: n */
        final /* synthetic */ InterfaceC3330b f13880n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC3330b interfaceC3330b) {
            super(1);
            this.f13880n = interfaceC3330b;
        }

        /* renamed from: a */
        public final void m14669a(Throwable th) {
            this.f13880n.cancel();
        }

        @Override // p051db.InterfaceC3041l
        public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
            m14669a(th);
            return C4755l.f18582a;
        }
    }

    /* renamed from: gc.m$f */
    /* loaded from: classes.dex */
    public static final class f<T> implements InterfaceC3332d<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3791h f13881a;

        f(InterfaceC3791h interfaceC3791h) {
            this.f13881a = interfaceC3791h;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<T> call, C3348t<T> response) {
            C3844i.m16254g(call, "call");
            C3844i.m16254g(response, "response");
            InterfaceC3791h interfaceC3791h = this.f13881a;
            C4751h.a aVar = C4751h.f18580n;
            interfaceC3791h.mo16028d(C4751h.m18904a(response));
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<T> call, Throwable t10) {
            C3844i.m16254g(call, "call");
            C3844i.m16254g(t10, "t");
            InterfaceC3791h interfaceC3791h = this.f13881a;
            C4751h.a aVar = C4751h.f18580n;
            interfaceC3791h.mo16028d(C4751h.m18904a(C4752i.m18908a(t10)));
        }
    }

    /* renamed from: gc.m$g */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: n */
        final /* synthetic */ InterfaceC4999c f13882n;

        /* renamed from: o */
        final /* synthetic */ Exception f13883o;

        g(InterfaceC4999c interfaceC4999c, Exception exc) {
            this.f13882n = interfaceC4999c;
            this.f13883o = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC4999c m20181a;
            m20181a = C5485c.m20181a(this.f13882n);
            Exception exc = this.f13883o;
            C4751h.a aVar = C4751h.f18580n;
            m20181a.mo16028d(C4751h.m18904a(C4752i.m18908a(exc)));
        }
    }

    @InterfaceC5576e(m20480c = "retrofit2.KotlinExtensions", m20481f = "KotlinExtensions.kt", m20482l = {113}, m20483m = "suspendAndThrow")
    /* renamed from: gc.m$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC5574c {

        /* renamed from: q */
        /* synthetic */ Object f13884q;

        /* renamed from: r */
        int f13885r;

        /* renamed from: s */
        Object f13886s;

        h(InterfaceC4999c interfaceC4999c) {
            super(interfaceC4999c);
        }

        @Override // p303xa.AbstractC5572a
        /* renamed from: c */
        public final Object mo14670c(Object obj) {
            this.f13884q = obj;
            this.f13885r |= Integer.MIN_VALUE;
            return C3341m.m14666d(null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m14663a(InterfaceC3330b<T> interfaceC3330b, InterfaceC4999c<? super T> interfaceC4999c) {
        InterfaceC4999c m20181a;
        Object m20182b;
        m20181a = C5485c.m20181a(interfaceC4999c);
        C3794i c3794i = new C3794i(m20181a, 1);
        c3794i.mo16140f(new a(interfaceC3330b));
        interfaceC3330b.mo14636W(new c(c3794i));
        Object m16167u = c3794i.m16167u();
        m20182b = C5486d.m20182b();
        if (m16167u == m20182b) {
            C5578g.m20490b(interfaceC4999c);
        }
        return m16167u;
    }

    /* renamed from: b */
    public static final <T> Object m14664b(InterfaceC3330b<T> interfaceC3330b, InterfaceC4999c<? super T> interfaceC4999c) {
        InterfaceC4999c m20181a;
        Object m20182b;
        m20181a = C5485c.m20181a(interfaceC4999c);
        C3794i c3794i = new C3794i(m20181a, 1);
        c3794i.mo16140f(new b(interfaceC3330b));
        interfaceC3330b.mo14636W(new d(c3794i));
        Object m16167u = c3794i.m16167u();
        m20182b = C5486d.m20182b();
        if (m16167u == m20182b) {
            C5578g.m20490b(interfaceC4999c);
        }
        return m16167u;
    }

    /* renamed from: c */
    public static final <T> Object m14665c(InterfaceC3330b<T> interfaceC3330b, InterfaceC4999c<? super C3348t<T>> interfaceC4999c) {
        InterfaceC4999c m20181a;
        Object m20182b;
        m20181a = C5485c.m20181a(interfaceC4999c);
        C3794i c3794i = new C3794i(m20181a, 1);
        c3794i.mo16140f(new e(interfaceC3330b));
        interfaceC3330b.mo14636W(new f(c3794i));
        Object m16167u = c3794i.m16167u();
        m20182b = C5486d.m20182b();
        if (m16167u == m20182b) {
            C5578g.m20490b(interfaceC4999c);
        }
        return m16167u;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m14666d(java.lang.Exception r4, va.InterfaceC4999c<?> r5) {
        /*
            boolean r0 = r5 instanceof p091gc.C3341m.h
            if (r0 == 0) goto L13
            r0 = r5
            gc.m$h r0 = (p091gc.C3341m.h) r0
            int r1 = r0.f13885r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13885r = r1
            goto L18
        L13:
            gc.m$h r0 = new gc.m$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13884q
            java.lang.Object r1 = p290wa.C5484b.m20180b()
            int r2 = r0.f13885r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f13886s
            java.lang.Exception r4 = (java.lang.Exception) r4
            p253ta.C4752i.m18909b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p253ta.C4752i.m18909b(r5)
            r0.f13886s = r4
            r0.f13885r = r3
            kb.v r5 = p145kb.C3789g0.m16137a()
            va.e r2 = r0.getContext()
            gc.m$g r3 = new gc.m$g
            r3.<init>(r0, r4)
            r5.mo16197j0(r2, r3)
            java.lang.Object r4 = p290wa.C5484b.m20180b()
            java.lang.Object r5 = p290wa.C5484b.m20180b()
            if (r4 != r5) goto L59
            p303xa.C5578g.m20490b(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            ta.l r4 = p253ta.C4755l.f18582a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p091gc.C3341m.m14666d(java.lang.Exception, va.c):java.lang.Object");
    }
}
