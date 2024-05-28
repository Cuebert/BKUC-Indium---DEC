package p020b6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b6.u */
/* loaded from: classes.dex */
public abstract class EnumC1070u {

    /* renamed from: n */
    public static final EnumC1070u f5300n;

    /* renamed from: o */
    public static final EnumC1070u f5301o;

    /* renamed from: p */
    private static final /* synthetic */ EnumC1070u[] f5302p;

    /* renamed from: b6.u$a */
    /* loaded from: classes.dex */
    enum a extends EnumC1070u {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f5300n = aVar;
        EnumC1070u enumC1070u = new EnumC1070u("STRING", 1) { // from class: b6.u.b
            {
                a aVar2 = null;
            }
        };
        f5301o = enumC1070u;
        f5302p = new EnumC1070u[]{aVar, enumC1070u};
    }

    private EnumC1070u(String str, int i10) {
    }

    public static EnumC1070u valueOf(String str) {
        return (EnumC1070u) Enum.valueOf(EnumC1070u.class, str);
    }

    public static EnumC1070u[] values() {
        return (EnumC1070u[]) f5302p.clone();
    }

    /* synthetic */ EnumC1070u(String str, int i10, a aVar) {
        this(str, i10);
    }
}
