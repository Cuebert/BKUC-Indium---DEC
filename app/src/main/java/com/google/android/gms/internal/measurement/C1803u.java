package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes.dex */
public final class C1803u implements Iterable<InterfaceC1739q>, InterfaceC1739q {

    /* renamed from: n */
    private final String f7249n;

    public C1803u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f7249n = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return new C1803u(this.f7249n);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        if (this.f7249n.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f7249n);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        return this.f7249n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1803u) {
            return this.f7249n.equals(((C1803u) obj).f7249n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7249n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return new C1771s(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1739q> iterator() {
        return new C1787t(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        return Boolean.valueOf(!this.f7249n.isEmpty());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0171. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79, types: [int] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c10;
        C1803u c1803u;
        int i10;
        InterfaceC1739q c1611i;
        String str6;
        double min;
        double min2;
        C1803u c1803u2;
        int i11;
        boolean z10;
        C1728p4 c1728p42;
        int i12;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                if (str.equals(str4)) {
                    str5 = "toString";
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                str5 = "toString";
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    c10 = 14;
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c10 = '\f';
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str4 = "hasOwnProperty";
                    c10 = 0;
                    str5 = "toString";
                    break;
                }
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    c10 = 1;
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c10 = '\r';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c10 = 7;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c10 = 11;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 4;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c10 = 15;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c10 = 16;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c10 = 5;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c10 = '\b';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c10 = '\t';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c10 = '\n';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c10 = 6;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 3;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c10 = 65535;
                str5 = "toString";
                break;
        }
        String str7 = BuildConfig.FLAVOR;
        String str8 = str3;
        switch (c10) {
            case 0:
                C1745q5.m8724j(str8, 1, list);
                int m8715a = list.size() > 0 ? (int) C1745q5.m8715a(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) : 0;
                String str9 = this.f7249n;
                if (m8715a >= 0 && m8715a < str9.length()) {
                    return new C1803u(String.valueOf(str9.charAt(m8715a)));
                }
                return InterfaceC1739q.f7172i;
            case 1:
                c1803u = this;
                if (list.size() != 0) {
                    StringBuilder sb2 = new StringBuilder(c1803u.f7249n);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        sb2.append(c1728p4.m8655b(list.get(i13)).mo8132e());
                    }
                    return new C1803u(sb2.toString());
                }
                return c1803u;
            case 2:
                C1745q5.m8722h(str4, 1, list);
                String str10 = this.f7249n;
                InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
                if ("length".equals(m8655b.mo8132e())) {
                    return InterfaceC1739q.f7170g;
                }
                double doubleValue = m8655b.mo8131d().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i10 = (int) doubleValue) < 0 || i10 >= str10.length()) ? InterfaceC1739q.f7171h : InterfaceC1739q.f7170g;
            case 3:
                C1745q5.m8724j("indexOf", 2, list);
                c1611i = new C1611i(Double.valueOf(this.f7249n.indexOf(list.size() > 0 ? c1728p4.m8655b(list.get(0)).mo8132e() : "undefined", (int) C1745q5.m8715a(list.size() < 2 ? 0.0d : c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()))));
                return c1611i;
            case 4:
                C1745q5.m8724j("lastIndexOf", 2, list);
                String str11 = this.f7249n;
                String mo8132e = list.size() > 0 ? c1728p4.m8655b(list.get(0)).mo8132e() : "undefined";
                return new C1611i(Double.valueOf(str11.lastIndexOf(mo8132e, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()) ? Double.POSITIVE_INFINITY : C1745q5.m8715a(r3)))));
            case 5:
                C1745q5.m8724j("match", 1, list);
                String str12 = this.f7249n;
                if (list.size() > 0) {
                    str7 = c1728p4.m8655b(list.get(0)).mo8132e();
                }
                Matcher matcher = Pattern.compile(str7).matcher(str12);
                return matcher.find() ? new C1560f(Arrays.asList(new C1803u(matcher.group()))) : InterfaceC1739q.f7166c;
            case 6:
                c1803u = this;
                C1745q5.m8724j("replace", 2, list);
                InterfaceC1739q interfaceC1739q = InterfaceC1739q.f7165b;
                if (list.size() > 0) {
                    str6 = c1728p4.m8655b(list.get(0)).mo8132e();
                    if (list.size() > 1) {
                        interfaceC1739q = c1728p4.m8655b(list.get(1));
                    }
                }
                String str13 = str6;
                String str14 = c1803u.f7249n;
                int indexOf = str14.indexOf(str13);
                if (indexOf >= 0) {
                    if (interfaceC1739q instanceof AbstractC1627j) {
                        interfaceC1739q = ((AbstractC1627j) interfaceC1739q).mo7931a(c1728p4, Arrays.asList(new C1803u(str13), new C1611i(Double.valueOf(indexOf)), c1803u));
                    }
                    String substring = str14.substring(0, indexOf);
                    String mo8132e2 = interfaceC1739q.mo8132e();
                    String substring2 = str14.substring(indexOf + str13.length());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(mo8132e2).length() + String.valueOf(substring2).length());
                    sb3.append(substring);
                    sb3.append(mo8132e2);
                    sb3.append(substring2);
                    c1611i = new C1803u(sb3.toString());
                    return c1611i;
                }
                return c1803u;
            case 7:
                C1745q5.m8724j("search", 1, list);
                if (Pattern.compile(list.size() > 0 ? c1728p4.m8655b(list.get(0)).mo8132e() : "undefined").matcher(this.f7249n).find()) {
                    return new C1611i(Double.valueOf(r0.start()));
                }
                return new C1611i(Double.valueOf(-1.0d));
            case '\b':
                C1745q5.m8724j("slice", 2, list);
                String str15 = this.f7249n;
                double m8715a2 = C1745q5.m8715a(list.size() > 0 ? c1728p4.m8655b(list.get(0)).mo8131d().doubleValue() : 0.0d);
                if (m8715a2 < 0.0d) {
                    min = Math.max(str15.length() + m8715a2, 0.0d);
                } else {
                    min = Math.min(m8715a2, str15.length());
                }
                int i14 = (int) min;
                double m8715a3 = C1745q5.m8715a(list.size() > 1 ? c1728p4.m8655b(list.get(1)).mo8131d().doubleValue() : str15.length());
                if (m8715a3 < 0.0d) {
                    min2 = Math.max(str15.length() + m8715a3, 0.0d);
                } else {
                    min2 = Math.min(m8715a3, str15.length());
                }
                c1803u2 = new C1803u(str15.substring(i14, Math.max(0, ((int) min2) - i14) + i14));
                return c1803u2;
            case '\t':
                C1745q5.m8724j("split", 2, list);
                String str16 = this.f7249n;
                if (str16.length() == 0) {
                    return new C1560f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String mo8132e3 = c1728p4.m8655b(list.get(0)).mo8132e();
                    long m8718d = list.size() > 1 ? C1745q5.m8718d(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()) : 2147483647L;
                    if (m8718d == 0) {
                        return new C1560f();
                    }
                    String[] split = str16.split(Pattern.quote(mo8132e3), ((int) m8718d) + 1);
                    int length2 = split.length;
                    if (!mo8132e3.equals(BuildConfig.FLAVOR) || length2 <= 0) {
                        i11 = length2;
                        z10 = false;
                    } else {
                        boolean equals = split[0].equals(BuildConfig.FLAVOR);
                        i11 = length2 - 1;
                        if (!split[i11].equals(BuildConfig.FLAVOR)) {
                            i11 = length2;
                        }
                        z10 = equals;
                    }
                    if (length2 > m8718d) {
                        i11--;
                    }
                    for (?? r02 = z10; r02 < i11; r02++) {
                        arrayList.add(new C1803u(split[r02]));
                    }
                }
                return new C1560f(arrayList);
            case '\n':
                C1745q5.m8724j("substring", 2, list);
                String str17 = this.f7249n;
                if (list.size() > 0) {
                    c1728p42 = c1728p4;
                    i12 = (int) C1745q5.m8715a(c1728p42.m8655b(list.get(0)).mo8131d().doubleValue());
                } else {
                    c1728p42 = c1728p4;
                    i12 = 0;
                }
                if (list.size() > 1) {
                    length = (int) C1745q5.m8715a(c1728p42.m8655b(list.get(1)).mo8131d().doubleValue());
                } else {
                    length = str17.length();
                }
                int min3 = Math.min(Math.max(i12, 0), str17.length());
                int min4 = Math.min(Math.max(length, 0), str17.length());
                c1803u2 = new C1803u(str17.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return c1803u2;
            case 11:
                C1745q5.m8722h(str2, 0, list);
                return new C1803u(this.f7249n.toUpperCase());
            case '\f':
                C1745q5.m8722h("toLocaleLowerCase", 0, list);
                return new C1803u(this.f7249n.toLowerCase());
            case '\r':
                C1745q5.m8722h("toLowerCase", 0, list);
                return new C1803u(this.f7249n.toLowerCase(Locale.ENGLISH));
            case 14:
                c1803u = this;
                C1745q5.m8722h(str5, 0, list);
                return c1803u;
            case 15:
                C1745q5.m8722h("toUpperCase", 0, list);
                return new C1803u(this.f7249n.toUpperCase(Locale.ENGLISH));
            case 16:
                C1745q5.m8722h("toUpperCase", 0, list);
                return new C1803u(this.f7249n.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.f7249n;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }
}
