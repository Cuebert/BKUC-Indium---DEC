package p233s1;

import com.birbit.android.jobqueue.log.CustomLogger;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public class C4516a {

    /* renamed from: a */
    private static CustomLogger f18266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$a */
    /* loaded from: classes.dex */
    public static class a implements CustomLogger {
        a() {
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        /* renamed from: d */
        public void mo7139d(String str, Object... objArr) {
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        /* renamed from: e */
        public void mo7140e(String str, Object... objArr) {
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        /* renamed from: e */
        public void mo7141e(Throwable th, String str, Object... objArr) {
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        public boolean isDebugEnabled() {
            return false;
        }
    }

    static {
        m18532a();
    }

    /* renamed from: a */
    public static void m18532a() {
        m18537f(new a());
    }

    /* renamed from: b */
    public static void m18533b(String str, Object... objArr) {
        f18266a.mo7139d(str, objArr);
    }

    /* renamed from: c */
    public static void m18534c(String str, Object... objArr) {
        f18266a.mo7140e(str, objArr);
    }

    /* renamed from: d */
    public static void m18535d(Throwable th, String str, Object... objArr) {
        f18266a.mo7141e(th, str, objArr);
    }

    /* renamed from: e */
    public static boolean m18536e() {
        return f18266a.isDebugEnabled();
    }

    /* renamed from: f */
    public static void m18537f(CustomLogger customLogger) {
        f18266a = customLogger;
    }
}
