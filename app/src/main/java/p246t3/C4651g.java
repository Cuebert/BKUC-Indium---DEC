package p246t3;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t3.g */
/* loaded from: classes.dex */
public final class C4651g {
    /* renamed from: a */
    public static final Appendable m18760a(Appendable appendable, Iterator it, C4655h c4655h, String str) throws IOException {
        String str2;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(C4655h.m18763d(entry.getKey()));
            appendable.append(" : ");
            appendable.append(C4655h.m18763d(entry.getValue()));
            while (it.hasNext()) {
                str2 = c4655h.f18449a;
                appendable.append(str2);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(C4655h.m18763d(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(C4655h.m18763d(entry2.getValue()));
            }
        }
        return appendable;
    }
}
