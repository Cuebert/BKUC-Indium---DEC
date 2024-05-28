package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.s3 */
/* loaded from: classes.dex */
final class C2029s3 {

    /* renamed from: a */
    private static final Unsafe f7789a;

    /* renamed from: b */
    private static final Class f7790b;

    /* renamed from: c */
    private static final boolean f7791c;

    /* renamed from: d */
    private static final AbstractC2022r3 f7792d;

    /* renamed from: e */
    private static final boolean f7793e;

    /* renamed from: f */
    private static final boolean f7794f;

    /* renamed from: g */
    static final long f7795g;

    /* renamed from: h */
    static final boolean f7796h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    static {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2029s3.<clinit>():void");
    }

    private C2029s3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    static boolean m9612A(Class cls) {
        int i10 = C1990n.f7749a;
        try {
            Class cls2 = f7790b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m9613B(Object obj, long j10) {
        return f7792d.mo9549g(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m9614C() {
        return f7794f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m9615D() {
        return f7793e;
    }

    /* renamed from: E */
    private static int m9616E(Class cls) {
        if (f7794f) {
            return f7792d.f7777a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m9617a(Class cls) {
        if (f7794f) {
            return f7792d.f7777a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m9618b() {
        int i10 = C1990n.f7749a;
        Field m9619c = m9619c(Buffer.class, "effectiveDirectAddress");
        if (m9619c != null) {
            return m9619c;
        }
        Field m9619c2 = m9619c(Buffer.class, "address");
        if (m9619c2 == null || m9619c2.getType() != Long.TYPE) {
            return null;
        }
        return m9619c2;
    }

    /* renamed from: c */
    private static Field m9619c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m9620d(Object obj, long j10, byte b10) {
        AbstractC2022r3 abstractC2022r3 = f7792d;
        long j11 = (-4) & j10;
        int i10 = abstractC2022r3.f7777a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC2022r3.f7777a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m9621e(Object obj, long j10, byte b10) {
        AbstractC2022r3 abstractC2022r3 = f7792d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC2022r3.f7777a.putInt(obj, j11, ((255 & b10) << i10) | (abstractC2022r3.f7777a.getInt(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m9622f(Object obj, long j10) {
        return f7792d.mo9543a(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m9623g(Object obj, long j10) {
        return f7792d.mo9544b(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m9624h(Object obj, long j10) {
        return f7792d.f7777a.getInt(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m9625i(Object obj, long j10) {
        return f7792d.f7777a.getLong(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Object m9626j(Class cls) {
        try {
            return f7789a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m9627k(Object obj, long j10) {
        return f7792d.f7777a.getObject(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m9628l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2001o3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m9629m(Throwable th) {
        Logger.getLogger(C2029s3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m9634r(Object obj, long j10, boolean z10) {
        f7792d.mo9545c(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m9635s(byte[] bArr, long j10, byte b10) {
        f7792d.mo9546d(bArr, f7795g + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m9636t(Object obj, long j10, double d10) {
        f7792d.mo9547e(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m9637u(Object obj, long j10, float f10) {
        f7792d.mo9548f(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m9638v(Object obj, long j10, int i10) {
        f7792d.f7777a.putInt(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m9639w(Object obj, long j10, long j11) {
        f7792d.f7777a.putLong(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m9640x(Object obj, long j10, Object obj2) {
        f7792d.f7777a.putObject(obj, j10, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m9641y(Object obj, long j10) {
        return ((byte) ((f7792d.f7777a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m9642z(Object obj, long j10) {
        return ((byte) ((f7792d.f7777a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
