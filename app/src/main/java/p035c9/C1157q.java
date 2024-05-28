package p035c9;

import com.appsflyer.oaid.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* renamed from: c9.q */
/* loaded from: classes.dex */
public class C1157q {
    /* renamed from: a */
    public static String m6751a(String str) {
        char charAt;
        char upperCase;
        if (str == null || str.length() == 0 || charAt == (upperCase = Character.toUpperCase((charAt = str.charAt(0))))) {
            return str;
        }
        return upperCase + str.substring(1);
    }

    /* renamed from: b */
    public static int m6752b(String str, char c10) {
        if (str == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: c */
    public static String m6753c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: d */
    public static String m6754d(CharSequence charSequence, Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(objArr[0]);
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(charSequence);
            sb2.append(objArr[i10]);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m6755e(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C1151k.m6709c("StringUtils", "Invalid character in stringToEncode. Error: " + e10.getMessage());
            return null;
        }
    }
}
