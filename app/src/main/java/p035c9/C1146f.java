package p035c9;

import com.appsflyer.oaid.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c9.f */
/* loaded from: classes.dex */
public class C1146f {
    /* renamed from: a */
    public static long m6696a(String str) {
        try {
            return m6697b(str).getTime();
        } catch (ParseException unused) {
            C1151k.m6716j("rbx.utils", "Exception caught when converting string to date: " + str);
            long m6699d = m6699d(str);
            C1151k.m6716j("rbx.utils", "Parsing as alternate format: " + m6699d);
            return m6699d;
        }
    }

    /* renamed from: b */
    public static Date m6697b(String str) throws ParseException {
        String str2;
        boolean contains = str.contains("+00:00");
        String str3 = BuildConfig.FLAVOR;
        if (contains) {
            str = str.replace("+00:00", BuildConfig.FLAVOR);
        }
        if (str.length() == 19) {
            str2 = str + ".+00:00";
        } else if (str.contains(".Z")) {
            str2 = str.replace(".Z", ".+00:00");
        } else if (str.endsWith("Z")) {
            str2 = str.replace("Z", ".+00:00");
        } else {
            str2 = str + ".+00:00";
        }
        try {
            if (str2.length() > 29) {
                str2 = str2.substring(0, 23) + str2.substring(str2.length() - 6);
            } else if (str2.length() < 29) {
                int length = 29 - str2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    str3 = str3 + "0";
                }
                str2 = str2.substring(0, (3 - length) + 20) + str3 + str2.substring(str2.length() - 6);
            }
            String str4 = str2.substring(0, 26) + str2.substring(27);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ");
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.parse(str4);
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid length for: " + str2, 0);
        }
    }

    /* renamed from: c */
    public static int m6698c(int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(i12, i11, i10);
        int i13 = calendar2.get(1) - calendar.get(1);
        return calendar2.get(6) < calendar.get(6) ? i13 - 1 : i13;
    }

    /* renamed from: d */
    public static long m6699d(String str) {
        Matcher matcher = Pattern.compile("\\/Date\\((\\-?\\d*?)([\\+\\-]\\d*)?\\)\\/").matcher(str);
        if (matcher.matches()) {
            return Long.valueOf(matcher.group(1)).longValue();
        }
        return 0L;
    }
}
