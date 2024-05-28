package p020b6;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b6.d */
/* loaded from: classes.dex */
public abstract class EnumC1053d implements InterfaceC1054e {

    /* renamed from: n */
    public static final EnumC1053d f5245n;

    /* renamed from: o */
    public static final EnumC1053d f5246o;

    /* renamed from: p */
    public static final EnumC1053d f5247p;

    /* renamed from: q */
    public static final EnumC1053d f5248q;

    /* renamed from: r */
    public static final EnumC1053d f5249r;

    /* renamed from: s */
    public static final EnumC1053d f5250s;

    /* renamed from: t */
    private static final /* synthetic */ EnumC1053d[] f5251t;

    /* renamed from: b6.d$a */
    /* loaded from: classes.dex */
    enum a extends EnumC1053d {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p020b6.InterfaceC1054e
        /* renamed from: b */
        public String mo6294b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f5245n = aVar;
        EnumC1053d enumC1053d = new EnumC1053d("UPPER_CAMEL_CASE", 1) { // from class: b6.d.b
            {
                a aVar2 = null;
            }

            @Override // p020b6.InterfaceC1054e
            /* renamed from: b */
            public String mo6294b(Field field) {
                return EnumC1053d.m6293e(field.getName());
            }
        };
        f5246o = enumC1053d;
        EnumC1053d enumC1053d2 = new EnumC1053d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: b6.d.c
            {
                a aVar2 = null;
            }

            @Override // p020b6.InterfaceC1054e
            /* renamed from: b */
            public String mo6294b(Field field) {
                return EnumC1053d.m6293e(EnumC1053d.m6292d(field.getName(), " "));
            }
        };
        f5247p = enumC1053d2;
        EnumC1053d enumC1053d3 = new EnumC1053d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: b6.d.d
            {
                a aVar2 = null;
            }

            @Override // p020b6.InterfaceC1054e
            /* renamed from: b */
            public String mo6294b(Field field) {
                return EnumC1053d.m6292d(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f5248q = enumC1053d3;
        EnumC1053d enumC1053d4 = new EnumC1053d("LOWER_CASE_WITH_DASHES", 4) { // from class: b6.d.e
            {
                a aVar2 = null;
            }

            @Override // p020b6.InterfaceC1054e
            /* renamed from: b */
            public String mo6294b(Field field) {
                return EnumC1053d.m6292d(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f5249r = enumC1053d4;
        EnumC1053d enumC1053d5 = new EnumC1053d("LOWER_CASE_WITH_DOTS", 5) { // from class: b6.d.f
            {
                a aVar2 = null;
            }

            @Override // p020b6.InterfaceC1054e
            /* renamed from: b */
            public String mo6294b(Field field) {
                return EnumC1053d.m6292d(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f5250s = enumC1053d5;
        f5251t = new EnumC1053d[]{aVar, enumC1053d, enumC1053d2, enumC1053d3, enumC1053d4, enumC1053d5};
    }

    private EnumC1053d(String str, int i10) {
    }

    /* renamed from: c */
    private static String m6291c(char c10, String str, int i10) {
        if (i10 < str.length()) {
            return c10 + str.substring(i10);
        }
        return String.valueOf(c10);
    }

    /* renamed from: d */
    static String m6292d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    static String m6293e(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb2.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb2.append(m6291c(Character.toUpperCase(charAt), str, i10 + 1));
        return sb2.toString();
    }

    public static EnumC1053d valueOf(String str) {
        return (EnumC1053d) Enum.valueOf(EnumC1053d.class, str);
    }

    public static EnumC1053d[] values() {
        return (EnumC1053d[]) f5251t.clone();
    }

    /* synthetic */ EnumC1053d(String str, int i10, a aVar) {
        this(str, i10);
    }
}
