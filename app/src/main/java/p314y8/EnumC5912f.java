package p314y8;

/* renamed from: y8.f */
/* loaded from: classes.dex */
public enum EnumC5912f {
    LIGHT("Light"),
    DARK("Dark"),
    CLASSIC("Classic");


    /* renamed from: n */
    private String f21785n;

    EnumC5912f(String str) {
        this.f21785n = str;
    }

    /* renamed from: b */
    public static EnumC5912f m21043b(String str) {
        String lowerCase = str != null ? str.toLowerCase() : "default";
        char c10 = 65535;
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3075958) {
            if (hashCode != 102970646) {
                if (hashCode == 853620882 && lowerCase.equals("classic")) {
                    c10 = 2;
                }
            } else if (lowerCase.equals("light")) {
                c10 = 0;
            }
        } else if (lowerCase.equals("dark")) {
            c10 = 1;
        }
        if (c10 == 0) {
            return LIGHT;
        }
        if (c10 != 1) {
            return CLASSIC;
        }
        return DARK;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21785n;
    }
}
