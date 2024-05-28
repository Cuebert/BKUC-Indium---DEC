package p283w3;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.t0 */
/* loaded from: classes.dex */
final class C5366t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19978a(@NullableDecl Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
