package p070f3;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: f3.j */
/* loaded from: classes.dex */
public final class C3136j {
    /* renamed from: a */
    public static void m13796a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
