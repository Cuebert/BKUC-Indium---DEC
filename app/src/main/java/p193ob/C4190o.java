package p193ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p205pb.C4286e;
import sb.C4555d;

/* renamed from: ob.o */
/* loaded from: classes.dex */
public final class C4190o {

    /* renamed from: j */
    private static final Pattern f17329j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f17330k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f17331l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f17332m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f17333a;

    /* renamed from: b */
    private final String f17334b;

    /* renamed from: c */
    private final long f17335c;

    /* renamed from: d */
    private final String f17336d;

    /* renamed from: e */
    private final String f17337e;

    /* renamed from: f */
    private final boolean f17338f;

    /* renamed from: g */
    private final boolean f17339g;

    /* renamed from: h */
    private final boolean f17340h;

    /* renamed from: i */
    private final boolean f17341i;

    private C4190o(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f17333a = str;
        this.f17334b = str2;
        this.f17335c = j10;
        this.f17336d = str3;
        this.f17337e = str4;
        this.f17338f = z10;
        this.f17339g = z11;
        this.f17341i = z12;
        this.f17340h = z13;
    }

    /* renamed from: a */
    private static int m17492a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: b */
    private static boolean m17493b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C4286e.m17736M(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static p193ob.C4190o m17494d(long r23, p193ob.C4201z r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p193ob.C4190o.m17494d(long, ob.z, java.lang.String):ob.o");
    }

    /* renamed from: e */
    public static C4190o m17495e(C4201z c4201z, String str) {
        return m17494d(System.currentTimeMillis(), c4201z, str);
    }

    /* renamed from: f */
    public static List<C4190o> m17496f(C4201z c4201z, C4200y c4200y) {
        List<String> m17560j = c4200y.m17560j("Set-Cookie");
        int size = m17560j.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            C4190o m17495e = m17495e(c4201z, m17560j.get(i10));
            if (m17495e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m17495e);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    private static String m17497g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String m17740d = C4286e.m17740d(str);
            if (m17740d != null) {
                return m17740d;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static long m17498h(String str, int i10, int i11) {
        int m17492a = m17492a(str, i10, i11, false);
        Matcher matcher = f17332m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (m17492a < i11) {
            int m17492a2 = m17492a(str, m17492a + 1, i11, true);
            matcher.region(m17492a, m17492a2);
            if (i13 == -1 && matcher.usePattern(f17332m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i16 = Integer.parseInt(matcher.group(2));
                i17 = Integer.parseInt(matcher.group(3));
            } else if (i14 == -1 && matcher.usePattern(f17331l).matches()) {
                i14 = Integer.parseInt(matcher.group(1));
            } else {
                if (i15 == -1) {
                    Pattern pattern = f17330k;
                    if (matcher.usePattern(pattern).matches()) {
                        i15 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f17329j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            }
            m17492a = m17492a(str, m17492a2 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += 2000;
        }
        if (i12 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i15 == -1) {
            throw new IllegalArgumentException();
        }
        if (i14 < 1 || i14 > 31) {
            throw new IllegalArgumentException();
        }
        if (i13 < 0 || i13 > 23) {
            throw new IllegalArgumentException();
        }
        if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        }
        if (i17 >= 0 && i17 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C4286e.f17499i);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    private static long m17499i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    /* renamed from: c */
    public String m17500c() {
        return this.f17333a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4190o)) {
            return false;
        }
        C4190o c4190o = (C4190o) obj;
        return c4190o.f17333a.equals(this.f17333a) && c4190o.f17334b.equals(this.f17334b) && c4190o.f17336d.equals(this.f17336d) && c4190o.f17337e.equals(this.f17337e) && c4190o.f17335c == this.f17335c && c4190o.f17338f == this.f17338f && c4190o.f17339g == this.f17339g && c4190o.f17340h == this.f17340h && c4190o.f17341i == this.f17341i;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f17333a.hashCode()) * 31) + this.f17334b.hashCode()) * 31) + this.f17336d.hashCode()) * 31) + this.f17337e.hashCode()) * 31;
        long j10 = this.f17335c;
        return ((((((((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f17338f ? 1 : 0)) * 31) + (!this.f17339g ? 1 : 0)) * 31) + (!this.f17340h ? 1 : 0)) * 31) + (!this.f17341i ? 1 : 0);
    }

    /* renamed from: j */
    String m17501j(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17333a);
        sb2.append('=');
        sb2.append(this.f17334b);
        if (this.f17340h) {
            if (this.f17335c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C4555d.m18610a(new Date(this.f17335c)));
            }
        }
        if (!this.f17341i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f17336d);
        }
        sb2.append("; path=");
        sb2.append(this.f17337e);
        if (this.f17338f) {
            sb2.append("; secure");
        }
        if (this.f17339g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    /* renamed from: k */
    public String m17502k() {
        return this.f17334b;
    }

    public String toString() {
        return m17501j(false);
    }
}
