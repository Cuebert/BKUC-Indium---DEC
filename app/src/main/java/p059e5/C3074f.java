package p059e5;

import java.util.logging.Logger;

/* renamed from: e5.f */
/* loaded from: classes.dex */
final class C3074f {

    /* renamed from: a */
    private static final Logger f12904a = Logger.getLogger(C3074f.class.getName());

    /* renamed from: b */
    private static final InterfaceC3073e f12905b = m13544b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5.f$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC3073e {
        private b() {
        }
    }

    private C3074f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13543a(String str) {
        if (m13545c(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    private static InterfaceC3073e m13544b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m13545c(String str) {
        return str == null || str.isEmpty();
    }
}
