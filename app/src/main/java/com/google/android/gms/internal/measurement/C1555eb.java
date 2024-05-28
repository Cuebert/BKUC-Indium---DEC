package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.eb */
/* loaded from: classes.dex */
final class C1555eb {

    /* renamed from: a */
    private static final Unsafe f6768a;

    /* renamed from: b */
    private static final Class<?> f6769b;

    /* renamed from: c */
    private static final boolean f6770c;

    /* renamed from: d */
    private static final boolean f6771d;

    /* renamed from: e */
    private static final AbstractC1538db f6772e;

    /* renamed from: f */
    private static final boolean f6773f;

    /* renamed from: g */
    private static final boolean f6774g;

    /* renamed from: h */
    static final long f6775h;

    /* renamed from: i */
    static final boolean f6776i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013b  */
    static {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1555eb.<clinit>():void");
    }

    private C1555eb() {
    }

    /* renamed from: A */
    static boolean m8095A(Class<?> cls) {
        int i10 = C1500b7.f6661a;
        try {
            Class<?> cls2 = f6769b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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
    public static boolean m8096B(Object obj, long j10) {
        return f6772e.mo7962g(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m8097C() {
        return f6774g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m8098D() {
        return f6773f;
    }

    /* renamed from: E */
    private static int m8099E(Class<?> cls) {
        if (f6774g) {
            return f6772e.m8060h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m8100a(Class<?> cls) {
        if (f6774g) {
            return f6772e.m8061i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m8101b() {
        int i10 = C1500b7.f6661a;
        Field m8102c = m8102c(Buffer.class, "effectiveDirectAddress");
        if (m8102c != null) {
            return m8102c;
        }
        Field m8102c2 = m8102c(Buffer.class, "address");
        if (m8102c2 == null || m8102c2.getType() != Long.TYPE) {
            return null;
        }
        return m8102c2;
    }

    /* renamed from: c */
    private static Field m8102c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m8103d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        AbstractC1538db abstractC1538db = f6772e;
        int m8062j = abstractC1538db.m8062j(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        abstractC1538db.m8066n(obj, j11, ((255 & b10) << i10) | (m8062j & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m8104e(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        AbstractC1538db abstractC1538db = f6772e;
        int i10 = (((int) j10) & 3) << 3;
        abstractC1538db.m8066n(obj, j11, ((255 & b10) << i10) | (abstractC1538db.m8062j(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m8105f(Object obj, long j10) {
        return f6772e.mo7956a(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m8106g(Object obj, long j10) {
        return f6772e.mo7957b(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m8107h(Object obj, long j10) {
        return f6772e.m8062j(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m8108i(Object obj, long j10) {
        return f6772e.m8063k(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static <T> T m8109j(Class<T> cls) {
        try {
            return (T) f6768a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m8110k(Object obj, long j10) {
        return f6772e.m8065m(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m8111l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1487ab());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m8112m(Throwable th) {
        Logger.getLogger(C1555eb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m8117r(Object obj, long j10, boolean z10) {
        f6772e.mo7958c(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m8118s(byte[] bArr, long j10, byte b10) {
        f6772e.mo7959d(bArr, f6775h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m8119t(Object obj, long j10, double d10) {
        f6772e.mo7960e(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m8120u(Object obj, long j10, float f10) {
        f6772e.mo7961f(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m8121v(Object obj, long j10, int i10) {
        f6772e.m8066n(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m8122w(Object obj, long j10, long j11) {
        f6772e.m8067o(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m8123x(Object obj, long j10, Object obj2) {
        f6772e.m8068p(obj, j10, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ boolean m8124y(Object obj, long j10) {
        return ((byte) ((f6772e.m8062j(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ boolean m8125z(Object obj, long j10) {
        return ((byte) ((f6772e.m8062j(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
