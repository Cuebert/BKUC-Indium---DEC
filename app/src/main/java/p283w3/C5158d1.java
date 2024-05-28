package p283w3;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: w3.d1 */
/* loaded from: classes.dex */
public final class C5158d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19771a(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
