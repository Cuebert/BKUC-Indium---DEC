package p132jb;

import gb.C3323a;
import gb.C3325c;
import gb.C3328f;
import kotlin.jvm.internal.C3844i;
import ua.AbstractC4908z;
import ua.C4889i;

/* renamed from: jb.m */
/* loaded from: classes.dex */
public class C3696m extends C3695l {
    /* renamed from: A */
    public static /* synthetic */ String m15675A(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m15696y(str, str2, str3);
    }

    /* renamed from: B */
    public static CharSequence m15676B(CharSequence charSequence) {
        C3844i.m16253f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean m15660c = C3684a.m15660c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!m15660c) {
                    break;
                }
                length--;
            } else if (m15660c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* renamed from: f */
    public static final boolean m15677f(CharSequence charSequence, CharSequence other, boolean z10) {
        C3844i.m16253f(charSequence, "<this>");
        C3844i.m16253f(other, "other");
        if (other instanceof String) {
            if (m15685n(charSequence, (String) other, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (m15683l(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m15678g(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m15677f(charSequence, charSequence2, z10);
    }

    /* renamed from: h */
    public static final int m15679h(CharSequence charSequence) {
        C3844i.m16253f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: i */
    public static final int m15680i(CharSequence charSequence, char c10, int i10, boolean z10) {
        C3844i.m16253f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return m15686o(charSequence, new char[]{c10}, i10, z10);
    }

    /* renamed from: j */
    public static final int m15681j(CharSequence charSequence, String string, int i10, boolean z10) {
        C3844i.m16253f(charSequence, "<this>");
        C3844i.m16253f(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        return m15683l(charSequence, string, i10, charSequence.length(), z10, false, 16, null);
    }

    /* renamed from: k */
    private static final int m15682k(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int m14624c;
        int m14622a;
        C3323a m14626e;
        int m14622a2;
        int m14624c2;
        if (!z11) {
            m14622a2 = C3328f.m14622a(i10, 0);
            m14624c2 = C3328f.m14624c(i11, charSequence.length());
            m14626e = new C3325c(m14622a2, m14624c2);
        } else {
            m14624c = C3328f.m14624c(i10, m15679h(charSequence));
            m14622a = C3328f.m14622a(i11, 0);
            m14626e = C3328f.m14626e(m14624c, m14622a);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m14610c = m14626e.m14610c();
            int m14611e = m14626e.m14611e();
            int m14612i = m14626e.m14612i();
            if ((m14612i <= 0 || m14610c > m14611e) && (m14612i >= 0 || m14611e > m14610c)) {
                return -1;
            }
            while (!C3695l.m15672c((String) charSequence2, 0, (String) charSequence, m14610c, charSequence2.length(), z10)) {
                if (m14610c == m14611e) {
                    return -1;
                }
                m14610c += m14612i;
            }
            return m14610c;
        }
        int m14610c2 = m14626e.m14610c();
        int m14611e2 = m14626e.m14611e();
        int m14612i2 = m14626e.m14612i();
        if ((m14612i2 <= 0 || m14610c2 > m14611e2) && (m14612i2 >= 0 || m14611e2 > m14610c2)) {
            return -1;
        }
        while (!m15690s(charSequence2, 0, charSequence, m14610c2, charSequence2.length(), z10)) {
            if (m14610c2 == m14611e2) {
                return -1;
            }
            m14610c2 += m14612i2;
        }
        return m14610c2;
    }

    /* renamed from: l */
    static /* synthetic */ int m15683l(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return m15682k(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    /* renamed from: m */
    public static /* synthetic */ int m15684m(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m15680i(charSequence, c10, i10, z10);
    }

    /* renamed from: n */
    public static /* synthetic */ int m15685n(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m15681j(charSequence, str, i10, z10);
    }

    /* renamed from: o */
    public static final int m15686o(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int m14622a;
        boolean z11;
        char m19123g;
        C3844i.m16253f(charSequence, "<this>");
        C3844i.m16253f(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            m19123g = C4889i.m19123g(chars);
            return ((String) charSequence).indexOf(m19123g, i10);
        }
        m14622a = C3328f.m14622a(i10, 0);
        AbstractC4908z it = new C3325c(m14622a, m15679h(charSequence)).iterator();
        while (it.hasNext()) {
            int mo14615a = it.mo14615a();
            char charAt = charSequence.charAt(mo14615a);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (C3685b.m15661d(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return mo14615a;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public static final int m15687p(CharSequence charSequence, char c10, int i10, boolean z10) {
        C3844i.m16253f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return m15689r(charSequence, new char[]{c10}, i10, z10);
    }

    /* renamed from: q */
    public static /* synthetic */ int m15688q(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m15679h(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m15687p(charSequence, c10, i10, z10);
    }

    /* renamed from: r */
    public static final int m15689r(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int m14624c;
        char m19123g;
        C3844i.m16253f(charSequence, "<this>");
        C3844i.m16253f(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            m19123g = C4889i.m19123g(chars);
            return ((String) charSequence).lastIndexOf(m19123g, i10);
        }
        for (m14624c = C3328f.m14624c(i10, m15679h(charSequence)); -1 < m14624c; m14624c--) {
            char charAt = charSequence.charAt(m14624c);
            int length = chars.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (C3685b.m15661d(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return m14624c;
            }
        }
        return -1;
    }

    /* renamed from: s */
    public static final boolean m15690s(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        C3844i.m16253f(charSequence, "<this>");
        C3844i.m16253f(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C3685b.m15661d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public static final String m15691t(String str, String delimiter, String missingDelimiterValue) {
        C3844i.m16253f(str, "<this>");
        C3844i.m16253f(delimiter, "delimiter");
        C3844i.m16253f(missingDelimiterValue, "missingDelimiterValue");
        int m15685n = m15685n(str, delimiter, 0, false, 6, null);
        if (m15685n == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m15685n + delimiter.length(), str.length());
        C3844i.m16252e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: u */
    public static /* synthetic */ String m15692u(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m15691t(str, str2, str3);
    }

    /* renamed from: v */
    public static final String m15693v(String str, char c10, String missingDelimiterValue) {
        C3844i.m16253f(str, "<this>");
        C3844i.m16253f(missingDelimiterValue, "missingDelimiterValue");
        int m15688q = m15688q(str, c10, 0, false, 6, null);
        if (m15688q == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m15688q + 1, str.length());
        C3844i.m16252e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: w */
    public static /* synthetic */ String m15694w(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m15693v(str, c10, str2);
    }

    /* renamed from: x */
    public static final String m15695x(String str, char c10, String missingDelimiterValue) {
        C3844i.m16253f(str, "<this>");
        C3844i.m16253f(missingDelimiterValue, "missingDelimiterValue");
        int m15684m = m15684m(str, c10, 0, false, 6, null);
        if (m15684m == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m15684m);
        C3844i.m16252e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: y */
    public static final String m15696y(String str, String delimiter, String missingDelimiterValue) {
        C3844i.m16253f(str, "<this>");
        C3844i.m16253f(delimiter, "delimiter");
        C3844i.m16253f(missingDelimiterValue, "missingDelimiterValue");
        int m15685n = m15685n(str, delimiter, 0, false, 6, null);
        if (m15685n == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m15685n);
        C3844i.m16252e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: z */
    public static /* synthetic */ String m15697z(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m15695x(str, c10, str2);
    }
}
