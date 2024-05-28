package androidx.databinding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC0767d {

    /* renamed from: a */
    private Set<Class<? extends AbstractC0767d>> f3744a = new HashSet();

    /* renamed from: b */
    private List<AbstractC0767d> f3745b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<String> f3746c = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m4246b(AbstractC0767d abstractC0767d) {
        if (this.f3744a.add(abstractC0767d.getClass())) {
            this.f3745b.add(abstractC0767d);
            Iterator<AbstractC0767d> it = abstractC0767d.mo4254a().iterator();
            while (it.hasNext()) {
                m4246b(it.next());
            }
        }
    }
}
