package za;

import kotlin.jvm.internal.C3844i;
import p316ya.C5925a;

/* renamed from: za.a */
/* loaded from: classes.dex */
public class C6028a extends C5925a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: za.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f22114a = new a();

        /* renamed from: b */
        public static final Integer f22115b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                za.a$a r0 = new za.a$a
                r0.<init>()
                za.C6028a.a.f22114a = r0
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
                za.C6028a.a.f22115b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: za.C6028a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m21353c(int i10) {
        Integer num = a.f22115b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p316ya.C5925a
    /* renamed from: a */
    public void mo21088a(Throwable cause, Throwable exception) {
        C3844i.m16253f(cause, "cause");
        C3844i.m16253f(exception, "exception");
        if (m21353c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo21088a(cause, exception);
        }
    }
}
