package p126j5;

import java.util.Set;
import p248t5.InterfaceC4733b;

/* renamed from: j5.a */
/* loaded from: classes.dex */
abstract class AbstractC3611a implements InterfaceC3619e {
    @Override // p126j5.InterfaceC3619e
    /* renamed from: a */
    public <T> T mo15448a(Class<T> cls) {
        InterfaceC4733b<T> mo15485c = mo15485c(cls);
        if (mo15485c == null) {
            return null;
        }
        return mo15485c.get();
    }

    @Override // p126j5.InterfaceC3619e
    /* renamed from: b */
    public <T> Set<T> mo15449b(Class<T> cls) {
        return mo15486d(cls).get();
    }
}
