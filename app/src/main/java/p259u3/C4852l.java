package p259u3;

/* renamed from: u3.l */
/* loaded from: classes.dex */
public final class C4852l {

    /* renamed from: a */
    private static final AbstractC4855o f18718a;

    /* renamed from: b */
    private static final int f18719b;

    /* renamed from: u3.l$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC4855o {
        a() {
        }

        @Override // p259u3.AbstractC4855o
        /* renamed from: a */
        public final void mo19041a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m19039a()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            u3.r r2 = new u3.r     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            u3.p r2 = new u3.p     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L24:
            u3.l$a r2 = new u3.l$a     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<u3.l$a> r4 = p259u3.C4852l.a.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            u3.l$a r2 = new u3.l$a
            r2.<init>()
        L5f:
            p259u3.C4852l.f18718a = r2
            if (r1 != 0) goto L64
            goto L68
        L64:
            int r0 = r1.intValue()
        L68:
            p259u3.C4852l.f18719b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p259u3.C4852l.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m19039a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e10) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e10.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: b */
    public static void m19040b(Throwable th, Throwable th2) {
        f18718a.mo19041a(th, th2);
    }
}
