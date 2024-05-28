package bb;

import java.io.Closeable;
import p253ta.C4745b;

/* renamed from: bb.a */
/* loaded from: classes.dex */
public final class C1097a {
    /* renamed from: a */
    public static final void m6452a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C4745b.m18896a(th, th2);
            }
        }
    }
}
