package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0839f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p146l.C3853a;
import p157m.C3911a;
import p157m.C3912b;

/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public class C0846m extends AbstractC0839f {

    /* renamed from: b */
    private C3911a<InterfaceC0844k, a> f4273b;

    /* renamed from: c */
    private AbstractC0839f.c f4274c;

    /* renamed from: d */
    private final WeakReference<InterfaceC0845l> f4275d;

    /* renamed from: e */
    private int f4276e;

    /* renamed from: f */
    private boolean f4277f;

    /* renamed from: g */
    private boolean f4278g;

    /* renamed from: h */
    private ArrayList<AbstractC0839f.c> f4279h;

    /* renamed from: i */
    private final boolean f4280i;

    /* renamed from: androidx.lifecycle.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        AbstractC0839f.c f4281a;

        /* renamed from: b */
        InterfaceC0843j f4282b;

        a(InterfaceC0844k interfaceC0844k, AbstractC0839f.c cVar) {
            this.f4282b = C0848o.m4918f(interfaceC0844k);
            this.f4281a = cVar;
        }

        /* renamed from: a */
        void m4912a(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            AbstractC0839f.c m4894c = bVar.m4894c();
            this.f4281a = C0846m.m4904k(this.f4281a, m4894c);
            this.f4282b.mo592e(interfaceC0845l, bVar);
            this.f4281a = m4894c;
        }
    }

    public C0846m(InterfaceC0845l interfaceC0845l) {
        this(interfaceC0845l, true);
    }

    /* renamed from: d */
    private void m4899d(InterfaceC0845l interfaceC0845l) {
        Iterator<Map.Entry<InterfaceC0844k, a>> descendingIterator = this.f4273b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f4278g) {
            Map.Entry<InterfaceC0844k, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f4281a.compareTo(this.f4274c) > 0 && !this.f4278g && this.f4273b.contains(next.getKey())) {
                AbstractC0839f.b m4892b = AbstractC0839f.b.m4892b(value.f4281a);
                if (m4892b != null) {
                    m4907n(m4892b.m4894c());
                    value.m4912a(interfaceC0845l, m4892b);
                    m4906m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f4281a);
                }
            }
        }
    }

    /* renamed from: e */
    private AbstractC0839f.c m4900e(InterfaceC0844k interfaceC0844k) {
        Map.Entry<InterfaceC0844k, a> m16582p = this.f4273b.m16582p(interfaceC0844k);
        AbstractC0839f.c cVar = null;
        AbstractC0839f.c cVar2 = m16582p != null ? m16582p.getValue().f4281a : null;
        if (!this.f4279h.isEmpty()) {
            cVar = this.f4279h.get(r0.size() - 1);
        }
        return m4904k(m4904k(this.f4274c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m4901f(String str) {
        if (!this.f4280i || C3853a.m16278d().mo16280b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private void m4902g(InterfaceC0845l interfaceC0845l) {
        C3912b<InterfaceC0844k, a>.d m16584i = this.f4273b.m16584i();
        while (m16584i.hasNext() && !this.f4278g) {
            Map.Entry next = m16584i.next();
            a aVar = (a) next.getValue();
            while (aVar.f4281a.compareTo(this.f4274c) < 0 && !this.f4278g && this.f4273b.contains(next.getKey())) {
                m4907n(aVar.f4281a);
                AbstractC0839f.b m4893d = AbstractC0839f.b.m4893d(aVar.f4281a);
                if (m4893d != null) {
                    aVar.m4912a(interfaceC0845l, m4893d);
                    m4906m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4281a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m4903i() {
        if (this.f4273b.size() == 0) {
            return true;
        }
        AbstractC0839f.c cVar = this.f4273b.m16583c().getValue().f4281a;
        AbstractC0839f.c cVar2 = this.f4273b.m16585k().getValue().f4281a;
        return cVar == cVar2 && this.f4274c == cVar2;
    }

    /* renamed from: k */
    static AbstractC0839f.c m4904k(AbstractC0839f.c cVar, AbstractC0839f.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m4905l(AbstractC0839f.c cVar) {
        if (this.f4274c == cVar) {
            return;
        }
        this.f4274c = cVar;
        if (!this.f4277f && this.f4276e == 0) {
            this.f4277f = true;
            m4908p();
            this.f4277f = false;
            return;
        }
        this.f4278g = true;
    }

    /* renamed from: m */
    private void m4906m() {
        this.f4279h.remove(r0.size() - 1);
    }

    /* renamed from: n */
    private void m4907n(AbstractC0839f.c cVar) {
        this.f4279h.add(cVar);
    }

    /* renamed from: p */
    private void m4908p() {
        InterfaceC0845l interfaceC0845l = this.f4275d.get();
        if (interfaceC0845l != null) {
            while (!m4903i()) {
                this.f4278g = false;
                if (this.f4274c.compareTo(this.f4273b.m16583c().getValue().f4281a) < 0) {
                    m4899d(interfaceC0845l);
                }
                Map.Entry<InterfaceC0844k, a> m16585k = this.f4273b.m16585k();
                if (!this.f4278g && m16585k != null && this.f4274c.compareTo(m16585k.getValue().f4281a) > 0) {
                    m4902g(interfaceC0845l);
                }
            }
            this.f4278g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.AbstractC0839f
    /* renamed from: a */
    public void mo4889a(InterfaceC0844k interfaceC0844k) {
        InterfaceC0845l interfaceC0845l;
        m4901f("addObserver");
        AbstractC0839f.c cVar = this.f4274c;
        AbstractC0839f.c cVar2 = AbstractC0839f.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC0839f.c.INITIALIZED;
        }
        a aVar = new a(interfaceC0844k, cVar2);
        if (this.f4273b.mo16580m(interfaceC0844k, aVar) == null && (interfaceC0845l = this.f4275d.get()) != null) {
            boolean z10 = this.f4276e != 0 || this.f4277f;
            AbstractC0839f.c m4900e = m4900e(interfaceC0844k);
            this.f4276e++;
            while (aVar.f4281a.compareTo(m4900e) < 0 && this.f4273b.contains(interfaceC0844k)) {
                m4907n(aVar.f4281a);
                AbstractC0839f.b m4893d = AbstractC0839f.b.m4893d(aVar.f4281a);
                if (m4893d != null) {
                    aVar.m4912a(interfaceC0845l, m4893d);
                    m4906m();
                    m4900e = m4900e(interfaceC0844k);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4281a);
                }
            }
            if (!z10) {
                m4908p();
            }
            this.f4276e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0839f
    /* renamed from: b */
    public AbstractC0839f.c mo4890b() {
        return this.f4274c;
    }

    @Override // androidx.lifecycle.AbstractC0839f
    /* renamed from: c */
    public void mo4891c(InterfaceC0844k interfaceC0844k) {
        m4901f("removeObserver");
        this.f4273b.mo16581o(interfaceC0844k);
    }

    /* renamed from: h */
    public void m4909h(AbstractC0839f.b bVar) {
        m4901f("handleLifecycleEvent");
        m4905l(bVar.m4894c());
    }

    @Deprecated
    /* renamed from: j */
    public void m4910j(AbstractC0839f.c cVar) {
        m4901f("markState");
        m4911o(cVar);
    }

    /* renamed from: o */
    public void m4911o(AbstractC0839f.c cVar) {
        m4901f("setCurrentState");
        m4905l(cVar);
    }

    private C0846m(InterfaceC0845l interfaceC0845l, boolean z10) {
        this.f4273b = new C3911a<>();
        this.f4276e = 0;
        this.f4277f = false;
        this.f4278g = false;
        this.f4279h = new ArrayList<>();
        this.f4275d = new WeakReference<>(interfaceC0845l);
        this.f4274c = AbstractC0839f.c.INITIALIZED;
        this.f4280i = z10;
    }
}
