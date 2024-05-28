package p007a6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a6.d */
/* loaded from: classes.dex */
public class C0037d {

    /* renamed from: b */
    private static volatile C0037d f192b;

    /* renamed from: a */
    private final Set<AbstractC0039f> f193a = new HashSet();

    C0037d() {
    }

    /* renamed from: a */
    public static C0037d m236a() {
        C0037d c0037d = f192b;
        if (c0037d == null) {
            synchronized (C0037d.class) {
                c0037d = f192b;
                if (c0037d == null) {
                    c0037d = new C0037d();
                    f192b = c0037d;
                }
            }
        }
        return c0037d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<AbstractC0039f> m237b() {
        Set<AbstractC0039f> unmodifiableSet;
        synchronized (this.f193a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f193a);
        }
        return unmodifiableSet;
    }
}
