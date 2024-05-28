package p193ob;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ob.b0 */
/* loaded from: classes.dex */
public final class C4167b0 {

    /* renamed from: e */
    private static final Pattern f16965e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    private static final Pattern f16966f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f16967a;

    /* renamed from: b */
    private final String f16968b;

    /* renamed from: c */
    private final String f16969c;

    /* renamed from: d */
    private final String f16970d;

    private C4167b0(String str, String str2, String str3, String str4) {
        this.f16967a = str;
        this.f16968b = str2;
        this.f16969c = str3;
        this.f16970d = str4;
    }

    /* renamed from: c */
    public static C4167b0 m17278c(String str) {
        Matcher matcher = f16965e.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f16966f.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 != null) {
                            if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                        } else {
                            group3 = matcher2.group(3);
                        }
                        if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                        str2 = group3;
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C4167b0(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    /* renamed from: d */
    public static C4167b0 m17279d(String str) {
        try {
            return m17278c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Charset m17280a() {
        return m17281b(null);
    }

    /* renamed from: b */
    public Charset m17281b(Charset charset) {
        try {
            String str = this.f16970d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: e */
    public String m17282e() {
        return this.f16968b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4167b0) && ((C4167b0) obj).f16967a.equals(this.f16967a);
    }

    public int hashCode() {
        return this.f16967a.hashCode();
    }

    public String toString() {
        return this.f16967a;
    }
}
