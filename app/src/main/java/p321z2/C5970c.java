package p321z2;

import android.util.Log;

/* renamed from: z2.c */
/* loaded from: classes.dex */
public final class C5970c {

    /* renamed from: a */
    private final String f22041a;

    /* renamed from: b */
    private final String f22042b;

    public C5970c(String str) {
        this(str, null);
    }

    /* renamed from: g */
    private final String m21255g(String str) {
        String str2 = this.f22042b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public boolean m21256a(int i10) {
        return Log.isLoggable(this.f22041a, i10);
    }

    /* renamed from: b */
    public void m21257b(String str, String str2) {
        if (m21256a(3)) {
            Log.d(str, m21255g(str2));
        }
    }

    /* renamed from: c */
    public void m21258c(String str, String str2) {
        if (m21256a(6)) {
            Log.e(str, m21255g(str2));
        }
    }

    /* renamed from: d */
    public void m21259d(String str, String str2, Throwable th) {
        if (m21256a(6)) {
            Log.e(str, m21255g(str2), th);
        }
    }

    /* renamed from: e */
    public void m21260e(String str, String str2) {
        if (m21256a(2)) {
            Log.v(str, m21255g(str2));
        }
    }

    /* renamed from: f */
    public void m21261f(String str, String str2) {
        if (m21256a(5)) {
            Log.w(str, m21255g(str2));
        }
    }

    public C5970c(String str, String str2) {
        C5984j.m21287k(str, "log tag cannot be null");
        C5984j.m21279c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f22041a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f22042b = null;
        } else {
            this.f22042b = str2;
        }
    }
}
