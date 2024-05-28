package p246t3;

/* renamed from: t3.t */
/* loaded from: classes.dex */
final class C4703t {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18825a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
