package p035c9;

import android.util.Log;

/* renamed from: c9.k */
/* loaded from: classes.dex */
public class C1151k {

    /* renamed from: a */
    public static a f5495a = new a("rbx");

    /* renamed from: c9.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f5496a;

        /* renamed from: b */
        private final int f5497b = 6;

        public a(String str) {
            this.f5496a = str;
        }

        /* renamed from: e */
        private String m6717e(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            int lastIndexOf = className.lastIndexOf(46);
            return lastIndexOf == -1 ? className : className.substring(lastIndexOf + 1);
        }

        /* renamed from: f */
        private String m6718f(String str) {
            return m6719g(6) + str;
        }

        /* renamed from: g */
        private String m6719g(int i10) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            return (stackTrace == null || stackTrace.length <= i10) ? "[STACKTRACE MISMATCH]: " : String.format("[%s.%s()-%d]: ", m6717e(stackTrace[i10]), stackTrace[i10].getMethodName(), Integer.valueOf(stackTrace[i10].getLineNumber()));
        }

        /* renamed from: a */
        public int m6720a(String str, String str2) {
            return 0;
        }

        /* renamed from: b */
        public int m6721b(String str) {
            return Log.e(this.f5496a, m6718f(str));
        }

        /* renamed from: c */
        public int m6722c(String str, String str2) {
            return Log.e(str, m6718f(str2));
        }

        /* renamed from: d */
        public int m6723d(String str, String str2, Throwable th) {
            return Log.e(str, m6718f(str2), th);
        }

        /* renamed from: h */
        public int m6724h(String str) {
            return Log.i(this.f5496a, m6718f(str));
        }

        /* renamed from: i */
        public int m6725i(String str, String str2) {
            return Log.i(str, m6718f(str2));
        }

        /* renamed from: j */
        public int m6726j(String str) {
            return Log.v(this.f5496a, m6718f(str));
        }

        /* renamed from: k */
        public int m6727k(String str, String str2) {
            return Log.v(str, m6718f(str2));
        }

        /* renamed from: l */
        public int m6728l(String str) {
            return Log.w(this.f5496a, m6718f(str));
        }

        /* renamed from: m */
        public int m6729m(String str, String str2) {
            return Log.w(str, m6718f(str2));
        }
    }

    /* renamed from: a */
    public static int m6707a(String str, String str2) {
        return f5495a.m6720a(str, str2);
    }

    /* renamed from: b */
    public static int m6708b(String str) {
        return f5495a.m6721b(str);
    }

    /* renamed from: c */
    public static int m6709c(String str, String str2) {
        return f5495a.m6722c(str, str2);
    }

    /* renamed from: d */
    public static int m6710d(String str, String str2, Throwable th) {
        return f5495a.m6723d(str, str2, th);
    }

    /* renamed from: e */
    public static int m6711e(String str) {
        return f5495a.m6724h(str);
    }

    /* renamed from: f */
    public static int m6712f(String str, String str2) {
        return f5495a.m6725i(str, str2);
    }

    /* renamed from: g */
    public static int m6713g(String str) {
        return f5495a.m6726j(str);
    }

    /* renamed from: h */
    public static int m6714h(String str, String str2) {
        return f5495a.m6727k(str, str2);
    }

    /* renamed from: i */
    public static int m6715i(String str) {
        return f5495a.m6728l(str);
    }

    /* renamed from: j */
    public static int m6716j(String str, String str2) {
        return f5495a.m6729m(str, str2);
    }
}
