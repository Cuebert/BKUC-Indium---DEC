package p279w;

import java.util.Iterator;
import java.util.List;

/* renamed from: w.i */
/* loaded from: classes.dex */
public final class C5036i extends AbstractC5032h {

    /* renamed from: a */
    private final List<AbstractC5032h> f19196a;

    @Override // p279w.AbstractC5032h
    /* renamed from: a */
    public void mo1638a() {
        Iterator<AbstractC5032h> it = this.f19196a.iterator();
        while (it.hasNext()) {
            it.next().mo1638a();
        }
    }

    @Override // p279w.AbstractC5032h
    /* renamed from: b */
    public void mo1399b(InterfaceC5068q interfaceC5068q) {
        Iterator<AbstractC5032h> it = this.f19196a.iterator();
        while (it.hasNext()) {
            it.next().mo1399b(interfaceC5068q);
        }
    }

    @Override // p279w.AbstractC5032h
    /* renamed from: c */
    public void mo1639c(C5040j c5040j) {
        Iterator<AbstractC5032h> it = this.f19196a.iterator();
        while (it.hasNext()) {
            it.next().mo1639c(c5040j);
        }
    }

    /* renamed from: d */
    public List<AbstractC5032h> m19571d() {
        return this.f19196a;
    }
}
