package p246t3;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: t3.h */
/* loaded from: classes.dex */
public final class C4655h {

    /* renamed from: a */
    private final String f18449a = ",\n  ";

    private C4655h(String str) {
    }

    /* renamed from: a */
    public static C4655h m18761a(String str) {
        return new C4655h(",\n  ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static final CharSequence m18763d(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: b */
    public final Appendable m18764b(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(m18763d(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f18449a);
                appendable.append(m18763d(it.next()));
            }
        }
        return appendable;
    }
}
