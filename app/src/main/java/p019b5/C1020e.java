package p019b5;

import android.content.Context;
import p045d5.C2985f;

/* renamed from: b5.e */
/* loaded from: classes.dex */
final class C1020e {

    /* renamed from: a */
    private static C1035l0 f5194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C1035l0 m6266a(Context context) {
        C1035l0 c1035l0;
        synchronized (C1020e.class) {
            if (f5194a == null) {
                C1031j0 c1031j0 = new C1031j0(null);
                c1031j0.m6271b(C2985f.m13458a(context));
                f5194a = c1031j0.mo6265a();
            }
            c1035l0 = f5194a;
        }
        return c1035l0;
    }
}
