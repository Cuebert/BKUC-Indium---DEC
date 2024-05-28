package p259u3;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: u3.j */
/* loaded from: classes.dex */
public final class C4850j {

    /* renamed from: a */
    private static final Logger f18715a = Logger.getLogger(C4850j.class.getName());

    private C4850j() {
    }

    /* renamed from: a */
    public static void m19038a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                try {
                    f18715a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e10);
                } catch (IOException e11) {
                    throw new AssertionError(e11);
                }
            }
        }
    }
}
