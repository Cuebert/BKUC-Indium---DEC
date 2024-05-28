package p035c9;

import com.roblox.client.C2877p0;

/* renamed from: c9.e */
/* loaded from: classes.dex */
public class C1145e {
    /* renamed from: c */
    public static String m6691c(String str) {
        if (str == null || str.startsWith("https://") || str.startsWith("http://")) {
            return str;
        }
        if (!str.contains(C2877p0.m12864G())) {
            return C2877p0.m12926i() + str;
        }
        return "https://" + str;
    }

    /* renamed from: a */
    public String m6692a(String str) {
        return str + "/";
    }

    /* renamed from: b */
    public String m6693b(String str) {
        return str.substring(0, str.indexOf("."));
    }

    /* renamed from: d */
    public String m6694d(String str) {
        if (str.endsWith("//")) {
            return m6695e(str);
        }
        return !str.endsWith("/") ? m6692a(str) : str;
    }

    /* renamed from: e */
    public String m6695e(String str) {
        return str.replaceAll("/+$", "/");
    }
}
