package p303xa;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C3844i;

/* renamed from: xa.f */
/* loaded from: classes.dex */
public final class C5577f {
    /* renamed from: a */
    private static final void m20485a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC5576e m20486b(AbstractC5572a abstractC5572a) {
        return (InterfaceC5576e) abstractC5572a.getClass().getAnnotation(InterfaceC5576e.class);
    }

    /* renamed from: c */
    private static final int m20487c(AbstractC5572a abstractC5572a) {
        try {
            Field declaredField = abstractC5572a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC5572a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m20488d(AbstractC5572a abstractC5572a) {
        String str;
        C3844i.m16253f(abstractC5572a, "<this>");
        InterfaceC5576e m20486b = m20486b(abstractC5572a);
        if (m20486b == null) {
            return null;
        }
        m20485a(1, m20486b.m20484v());
        int m20487c = m20487c(abstractC5572a);
        int i10 = m20487c < 0 ? -1 : m20486b.m20482l()[m20487c];
        String m20492b = C5579h.f20684a.m20492b(abstractC5572a);
        if (m20492b == null) {
            str = m20486b.m20480c();
        } else {
            str = m20492b + '/' + m20486b.m20480c();
        }
        return new StackTraceElement(str, m20486b.m20483m(), m20486b.m20481f(), i10);
    }
}
