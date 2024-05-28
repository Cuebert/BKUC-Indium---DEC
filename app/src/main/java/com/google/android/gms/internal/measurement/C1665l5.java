package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* loaded from: classes.dex */
public final class C1665l5 {

    /* renamed from: f */
    static HashMap<String, String> f6966f;

    /* renamed from: k */
    private static Object f6971k;

    /* renamed from: l */
    private static boolean f6972l;

    /* renamed from: a */
    public static final Uri f6961a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f6962b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f6963c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f6964d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f6965e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap<String, Boolean> f6967g = new HashMap<>();

    /* renamed from: h */
    static final HashMap<String, Integer> f6968h = new HashMap<>();

    /* renamed from: i */
    static final HashMap<String, Long> f6969i = new HashMap<>();

    /* renamed from: j */
    static final HashMap<String, Float> f6970j = new HashMap<>();

    /* renamed from: m */
    static final String[] f6973m = new String[0];

    /* renamed from: a */
    public static String m8375a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C1665l5.class) {
            if (f6966f == null) {
                f6965e.set(false);
                f6966f = new HashMap<>();
                f6971k = new Object();
                f6972l = false;
                contentResolver.registerContentObserver(f6961a, true, new C1649k5(null));
            } else if (f6965e.getAndSet(false)) {
                f6966f.clear();
                f6967g.clear();
                f6968h.clear();
                f6969i.clear();
                f6970j.clear();
                f6971k = new Object();
                f6972l = false;
            }
            Object obj = f6971k;
            if (f6966f.containsKey(str)) {
                String str3 = f6966f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f6973m.length;
            Cursor query = contentResolver.query(f6961a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m8377c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m8377c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    private static void m8377c(Object obj, String str, String str2) {
        synchronized (C1665l5.class) {
            if (obj == f6971k) {
                f6966f.put(str, str2);
            }
        }
    }
}
