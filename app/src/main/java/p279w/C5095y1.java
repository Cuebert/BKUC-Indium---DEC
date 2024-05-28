package p279w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w.y1 */
/* loaded from: classes.dex */
public class C5095y1 {

    /* renamed from: a */
    private final List<InterfaceC5092x1> f19353a;

    public C5095y1(List<InterfaceC5092x1> list) {
        this.f19353a = new ArrayList(list);
    }

    /* renamed from: a */
    public boolean m19724a(Class<? extends InterfaceC5092x1> cls) {
        Iterator<InterfaceC5092x1> it = this.f19353a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public <T extends InterfaceC5092x1> T m19725b(Class<T> cls) {
        Iterator<InterfaceC5092x1> it = this.f19353a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
