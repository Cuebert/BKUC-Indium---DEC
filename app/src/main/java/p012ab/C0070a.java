package p012ab;

import p065eb.AbstractC3108c;
import p078fb.C3215a;
import za.C6028a;

/* renamed from: ab.a */
/* loaded from: classes.dex */
public class C0070a extends C6028a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ab.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f254a = new a();

        /* renamed from: b */
        public static final Integer f255b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                ab.a$a r0 = new ab.a$a
                r0.<init>()
                p012ab.C0070a.a.f254a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                p012ab.C0070a.a.f255b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p012ab.C0070a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m299c(int i10) {
        Integer num = a.f255b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p316ya.C5925a
    /* renamed from: b */
    public AbstractC3108c mo300b() {
        return m299c(34) ? new C3215a() : super.mo300b();
    }
}
