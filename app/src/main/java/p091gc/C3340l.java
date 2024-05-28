package p091gc;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: gc.l */
/* loaded from: classes.dex */
public final class C3340l {

    /* renamed from: a */
    private final Method f13874a;

    /* renamed from: b */
    private final List<?> f13875b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3340l(Method method, List<?> list) {
        this.f13874a = method;
        this.f13875b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m14662a() {
        return this.f13874a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f13874a.getDeclaringClass().getName(), this.f13874a.getName(), this.f13875b);
    }
}
