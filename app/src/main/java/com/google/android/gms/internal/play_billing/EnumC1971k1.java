package com.google.android.gms.internal.play_billing;

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
/* renamed from: com.google.android.gms.internal.play_billing.k1 */
/* loaded from: classes.dex */
public final class EnumC1971k1 {

    /* renamed from: A */
    private static final /* synthetic */ EnumC1971k1[] f7710A;

    /* renamed from: q */
    public static final EnumC1971k1 f7711q;

    /* renamed from: r */
    public static final EnumC1971k1 f7712r;

    /* renamed from: s */
    public static final EnumC1971k1 f7713s;

    /* renamed from: t */
    public static final EnumC1971k1 f7714t;

    /* renamed from: u */
    public static final EnumC1971k1 f7715u;

    /* renamed from: v */
    public static final EnumC1971k1 f7716v;

    /* renamed from: w */
    public static final EnumC1971k1 f7717w;

    /* renamed from: x */
    public static final EnumC1971k1 f7718x;

    /* renamed from: y */
    public static final EnumC1971k1 f7719y;

    /* renamed from: z */
    public static final EnumC1971k1 f7720z;

    /* renamed from: n */
    private final Class f7721n;

    /* renamed from: o */
    private final Class f7722o;

    /* renamed from: p */
    private final Object f7723p;

    static {
        EnumC1971k1 enumC1971k1 = new EnumC1971k1("VOID", 0, Void.class, Void.class, null);
        f7711q = enumC1971k1;
        Class cls = Integer.TYPE;
        EnumC1971k1 enumC1971k12 = new EnumC1971k1("INT", 1, cls, Integer.class, 0);
        f7712r = enumC1971k12;
        EnumC1971k1 enumC1971k13 = new EnumC1971k1("LONG", 2, Long.TYPE, Long.class, 0L);
        f7713s = enumC1971k13;
        EnumC1971k1 enumC1971k14 = new EnumC1971k1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7714t = enumC1971k14;
        EnumC1971k1 enumC1971k15 = new EnumC1971k1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7715u = enumC1971k15;
        EnumC1971k1 enumC1971k16 = new EnumC1971k1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7716v = enumC1971k16;
        EnumC1971k1 enumC1971k17 = new EnumC1971k1("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f7717w = enumC1971k17;
        EnumC1971k1 enumC1971k18 = new EnumC1971k1("BYTE_STRING", 7, AbstractC1914c0.class, AbstractC1914c0.class, AbstractC1914c0.f7634o);
        f7718x = enumC1971k18;
        EnumC1971k1 enumC1971k19 = new EnumC1971k1("ENUM", 8, cls, Integer.class, null);
        f7719y = enumC1971k19;
        EnumC1971k1 enumC1971k110 = new EnumC1971k1("MESSAGE", 9, Object.class, Object.class, null);
        f7720z = enumC1971k110;
        f7710A = new EnumC1971k1[]{enumC1971k1, enumC1971k12, enumC1971k13, enumC1971k14, enumC1971k15, enumC1971k16, enumC1971k17, enumC1971k18, enumC1971k19, enumC1971k110};
    }

    private EnumC1971k1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f7721n = cls;
        this.f7722o = cls2;
        this.f7723p = obj;
    }

    public static EnumC1971k1[] values() {
        return (EnumC1971k1[]) f7710A.clone();
    }

    /* renamed from: b */
    public final Class m9485b() {
        return this.f7722o;
    }
}
