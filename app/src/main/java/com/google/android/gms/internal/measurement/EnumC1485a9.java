package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.a9 */
/* loaded from: classes.dex */
public final class EnumC1485a9 {

    /* renamed from: A */
    private static final /* synthetic */ EnumC1485a9[] f6625A;

    /* renamed from: q */
    public static final EnumC1485a9 f6626q;

    /* renamed from: r */
    public static final EnumC1485a9 f6627r;

    /* renamed from: s */
    public static final EnumC1485a9 f6628s;

    /* renamed from: t */
    public static final EnumC1485a9 f6629t;

    /* renamed from: u */
    public static final EnumC1485a9 f6630u;

    /* renamed from: v */
    public static final EnumC1485a9 f6631v;

    /* renamed from: w */
    public static final EnumC1485a9 f6632w;

    /* renamed from: x */
    public static final EnumC1485a9 f6633x;

    /* renamed from: y */
    public static final EnumC1485a9 f6634y;

    /* renamed from: z */
    public static final EnumC1485a9 f6635z;

    /* renamed from: n */
    private final Class<?> f6636n;

    /* renamed from: o */
    private final Class<?> f6637o;

    /* renamed from: p */
    private final Object f6638p;

    static {
        EnumC1485a9 enumC1485a9 = new EnumC1485a9("VOID", 0, Void.class, Void.class, null);
        f6626q = enumC1485a9;
        Class cls = Integer.TYPE;
        EnumC1485a9 enumC1485a92 = new EnumC1485a9("INT", 1, cls, Integer.class, 0);
        f6627r = enumC1485a92;
        EnumC1485a9 enumC1485a93 = new EnumC1485a9("LONG", 2, Long.TYPE, Long.class, 0L);
        f6628s = enumC1485a93;
        EnumC1485a9 enumC1485a94 = new EnumC1485a9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6629t = enumC1485a94;
        EnumC1485a9 enumC1485a95 = new EnumC1485a9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6630u = enumC1485a95;
        EnumC1485a9 enumC1485a96 = new EnumC1485a9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6631v = enumC1485a96;
        EnumC1485a9 enumC1485a97 = new EnumC1485a9("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f6632w = enumC1485a97;
        EnumC1485a9 enumC1485a98 = new EnumC1485a9("BYTE_STRING", 7, AbstractC1731p7.class, AbstractC1731p7.class, AbstractC1731p7.f7144o);
        f6633x = enumC1485a98;
        EnumC1485a9 enumC1485a99 = new EnumC1485a9("ENUM", 8, cls, Integer.class, null);
        f6634y = enumC1485a99;
        EnumC1485a9 enumC1485a910 = new EnumC1485a9("MESSAGE", 9, Object.class, Object.class, null);
        f6635z = enumC1485a910;
        f6625A = new EnumC1485a9[]{enumC1485a9, enumC1485a92, enumC1485a93, enumC1485a94, enumC1485a95, enumC1485a96, enumC1485a97, enumC1485a98, enumC1485a99, enumC1485a910};
    }

    private EnumC1485a9(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f6636n = cls;
        this.f6637o = cls2;
        this.f6638p = obj;
    }

    public static EnumC1485a9[] values() {
        return (EnumC1485a9[]) f6625A.clone();
    }

    /* renamed from: b */
    public final Class<?> m7890b() {
        return this.f6637o;
    }
}
