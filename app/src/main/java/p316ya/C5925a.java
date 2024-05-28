package p316ya;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C3844i;
import p065eb.AbstractC3108c;
import p065eb.C3107b;

/* renamed from: ya.a */
/* loaded from: classes.dex */
public class C5925a {

    /* renamed from: ya.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f21813a = new a();

        /* renamed from: b */
        public static final Method f21814b;

        /* renamed from: c */
        public static final Method f21815c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            /*
                ya.a$a r0 = new ya.a$a
                r0.<init>()
                p316ya.C5925a.a.f21813a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C3844i.m16252e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C3844i.m16248a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C3844i.m16252e(r7, r8)
                java.lang.Object r7 = ua.C4881e.m19113h(r7)
                boolean r7 = kotlin.jvm.internal.C3844i.m16248a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                p316ya.C5925a.a.f21814b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C3844i.m16248a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                p316ya.C5925a.a.f21815c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p316ya.C5925a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: a */
    public void mo21088a(Throwable cause, Throwable exception) {
        C3844i.m16253f(cause, "cause");
        C3844i.m16253f(exception, "exception");
        Method method = a.f21814b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* renamed from: b */
    public AbstractC3108c mo300b() {
        return new C3107b();
    }
}
