package p018b4;

import android.os.Bundle;

/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C0987a {

    /* renamed from: c */
    public static final C0987a f5174c = new C0987a(null, null);

    /* renamed from: a */
    private final Boolean f5175a;

    /* renamed from: b */
    private final Boolean f5176b;

    public C0987a(Boolean bool, Boolean bool2) {
        this.f5175a = bool;
        this.f5176b = bool2;
    }

    /* renamed from: a */
    public static C0987a m6188a(Bundle bundle) {
        if (bundle == null) {
            return f5174c;
        }
        return new C0987a(m6194o(bundle.getString("ad_storage")), m6194o(bundle.getString("analytics_storage")));
    }

    /* renamed from: b */
    public static C0987a m6189b(String str) {
        Boolean bool;
        if (str != null) {
            Boolean m6195p = str.length() >= 3 ? m6195p(str.charAt(2)) : null;
            bool = str.length() >= 4 ? m6195p(str.charAt(3)) : null;
            r0 = m6195p;
        } else {
            bool = null;
        }
        return new C0987a(r0, bool);
    }

    /* renamed from: g */
    static Boolean m6190g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z10 = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* renamed from: h */
    public static String m6191h(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m6194o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m6194o(string2) != null) {
            return null;
        }
        return string2;
    }

    /* renamed from: l */
    public static boolean m6192l(int i10, int i11) {
        return i10 <= i11;
    }

    /* renamed from: n */
    static final int m6193n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: o */
    private static Boolean m6194o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: p */
    private static Boolean m6195p(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: q */
    private static final char m6196q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    /* renamed from: c */
    public final C0987a m6197c(C0987a c0987a) {
        return new C0987a(m6190g(this.f5175a, c0987a.f5175a), m6190g(this.f5176b, c0987a.f5176b));
    }

    /* renamed from: d */
    public final C0987a m6198d(C0987a c0987a) {
        Boolean bool = this.f5175a;
        if (bool == null) {
            bool = c0987a.f5175a;
        }
        Boolean bool2 = this.f5176b;
        if (bool2 == null) {
            bool2 = c0987a.f5176b;
        }
        return new C0987a(bool, bool2);
    }

    /* renamed from: e */
    public final Boolean m6199e() {
        return this.f5175a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0987a)) {
            return false;
        }
        C0987a c0987a = (C0987a) obj;
        return m6193n(this.f5175a) == m6193n(c0987a.f5175a) && m6193n(this.f5176b) == m6193n(c0987a.f5176b);
    }

    /* renamed from: f */
    public final Boolean m6200f() {
        return this.f5176b;
    }

    public final int hashCode() {
        return ((m6193n(this.f5175a) + 527) * 31) + m6193n(this.f5176b);
    }

    /* renamed from: i */
    public final String m6201i() {
        return "G1" + m6196q(this.f5175a) + m6196q(this.f5176b);
    }

    /* renamed from: j */
    public final boolean m6202j() {
        Boolean bool = this.f5175a;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean m6203k() {
        Boolean bool = this.f5176b;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: m */
    public final boolean m6204m(C0987a c0987a) {
        Boolean bool = this.f5175a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || c0987a.f5175a == bool2) {
            return this.f5176b == bool2 && c0987a.f5176b != bool2;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsentSettings: ");
        sb2.append("adStorage=");
        Boolean bool = this.f5175a;
        if (bool == null) {
            sb2.append("uninitialized");
        } else {
            sb2.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb2.append(", analyticsStorage=");
        Boolean bool2 = this.f5176b;
        if (bool2 == null) {
            sb2.append("uninitialized");
        } else {
            sb2.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb2.toString();
    }
}
