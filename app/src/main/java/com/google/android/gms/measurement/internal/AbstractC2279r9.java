package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1547e3;
import com.google.android.gms.internal.measurement.C1663l3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes.dex */
public abstract class AbstractC2279r9 {

    /* renamed from: a */
    final String f8518a;

    /* renamed from: b */
    final int f8519b;

    /* renamed from: c */
    Boolean f8520c;

    /* renamed from: d */
    Boolean f8521d;

    /* renamed from: e */
    Long f8522e;

    /* renamed from: f */
    Long f8523f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2279r9(String str, int i10) {
        this.f8518a = str;
        this.f8519b = i10;
    }

    /* renamed from: d */
    private static Boolean m10291d(String str, int i10, boolean z10, String str2, List<String> list, String str3, C2174i3 c2174i3) {
        if (i10 == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c2174i3 != null) {
                        c2174i3.m10053w().m9894b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m10292e(BigDecimal bigDecimal, C1547e3 c1547e3, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C5984j.m21286j(c1547e3);
        if (c1547e3.m8075C()) {
            if (c1547e3.m8080H() != 1) {
                if (c1547e3.m8080H() == 5) {
                    if (!c1547e3.m8079G() || !c1547e3.m8078F()) {
                        return null;
                    }
                } else if (!c1547e3.m8076D()) {
                    return null;
                }
                int m8080H = c1547e3.m8080H();
                if (c1547e3.m8080H() == 5) {
                    if (C2125d9.m9828P(c1547e3.m8073A()) && C2125d9.m9828P(c1547e3.m8082z())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c1547e3.m8073A());
                            bigDecimal4 = new BigDecimal(c1547e3.m8082z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C2125d9.m9828P(c1547e3.m8081y())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c1547e3.m8081y());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (m8080H == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = m8080H - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d10 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Boolean m10293f(String str, C1663l3 c1663l3, C2174i3 c2174i3) {
        String m8369z;
        List<String> list;
        C5984j.m21286j(c1663l3);
        if (str == null || !c1663l3.m8366E() || c1663l3.m8367F() == 1) {
            return null;
        }
        if (c1663l3.m8367F() == 7) {
            if (c1663l3.m8368w() == 0) {
                return null;
            }
        } else if (!c1663l3.m8365D()) {
            return null;
        }
        int m8367F = c1663l3.m8367F();
        boolean m8363B = c1663l3.m8363B();
        if (!m8363B && m8367F != 2 && m8367F != 7) {
            m8369z = c1663l3.m8369z().toUpperCase(Locale.ENGLISH);
        } else {
            m8369z = c1663l3.m8369z();
        }
        String str2 = m8369z;
        if (c1663l3.m8368w() == 0) {
            list = null;
        } else {
            List<String> m8362A = c1663l3.m8362A();
            if (!m8363B) {
                ArrayList arrayList = new ArrayList(m8362A.size());
                Iterator<String> it = m8362A.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                m8362A = Collections.unmodifiableList(arrayList);
            }
            list = m8362A;
        }
        return m10291d(str, m8367F, m8363B, str2, list, m8367F == 2 ? str2 : null, c2174i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Boolean m10294g(double d10, C1547e3 c1547e3) {
        try {
            return m10292e(new BigDecimal(d10), c1547e3, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Boolean m10295h(long j10, C1547e3 c1547e3) {
        try {
            return m10292e(new BigDecimal(j10), c1547e3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Boolean m10296i(String str, C1547e3 c1547e3) {
        if (!C2125d9.m9828P(str)) {
            return null;
        }
        try {
            return m10292e(new BigDecimal(str), c1547e3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Boolean m10297j(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo10221a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo10222b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo10223c();
}
