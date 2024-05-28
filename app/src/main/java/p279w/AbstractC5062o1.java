package p279w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: w.o1 */
/* loaded from: classes.dex */
public abstract class AbstractC5062o1<C> {

    /* renamed from: a */
    private Set<C> f19277a = new HashSet();

    /* renamed from: a */
    public void m19655a(List<C> list) {
        this.f19277a.addAll(list);
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5062o1<C> clone();

    /* renamed from: c */
    public List<C> m19656c() {
        return Collections.unmodifiableList(new ArrayList(this.f19277a));
    }
}
