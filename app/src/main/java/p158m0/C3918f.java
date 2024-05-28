package p158m0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: m0.f */
/* loaded from: classes.dex */
public class C3918f implements InterfaceC3916d {

    /* renamed from: d */
    AbstractC3928p f16250d;

    /* renamed from: f */
    int f16252f;

    /* renamed from: g */
    public int f16253g;

    /* renamed from: a */
    public InterfaceC3916d f16247a = null;

    /* renamed from: b */
    public boolean f16248b = false;

    /* renamed from: c */
    public boolean f16249c = false;

    /* renamed from: e */
    a f16251e = a.UNKNOWN;

    /* renamed from: h */
    int f16254h = 1;

    /* renamed from: i */
    C3919g f16255i = null;

    /* renamed from: j */
    public boolean f16256j = false;

    /* renamed from: k */
    List<InterfaceC3916d> f16257k = new ArrayList();

    /* renamed from: l */
    List<C3918f> f16258l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0.f$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C3918f(AbstractC3928p abstractC3928p) {
        this.f16250d = abstractC3928p;
    }

    @Override // p158m0.InterfaceC3916d
    /* renamed from: a */
    public void mo16601a(InterfaceC3916d interfaceC3916d) {
        Iterator<C3918f> it = this.f16258l.iterator();
        while (it.hasNext()) {
            if (!it.next().f16256j) {
                return;
            }
        }
        this.f16249c = true;
        InterfaceC3916d interfaceC3916d2 = this.f16247a;
        if (interfaceC3916d2 != null) {
            interfaceC3916d2.mo16601a(this);
        }
        if (this.f16248b) {
            this.f16250d.mo16601a(this);
            return;
        }
        C3918f c3918f = null;
        int i10 = 0;
        for (C3918f c3918f2 : this.f16258l) {
            if (!(c3918f2 instanceof C3919g)) {
                i10++;
                c3918f = c3918f2;
            }
        }
        if (c3918f != null && i10 == 1 && c3918f.f16256j) {
            C3919g c3919g = this.f16255i;
            if (c3919g != null) {
                if (!c3919g.f16256j) {
                    return;
                } else {
                    this.f16252f = this.f16254h * c3919g.f16253g;
                }
            }
            mo16623d(c3918f.f16253g + this.f16252f);
        }
        InterfaceC3916d interfaceC3916d3 = this.f16247a;
        if (interfaceC3916d3 != null) {
            interfaceC3916d3.mo16601a(this);
        }
    }

    /* renamed from: b */
    public void m16621b(InterfaceC3916d interfaceC3916d) {
        this.f16257k.add(interfaceC3916d);
        if (this.f16256j) {
            interfaceC3916d.mo16601a(interfaceC3916d);
        }
    }

    /* renamed from: c */
    public void m16622c() {
        this.f16258l.clear();
        this.f16257k.clear();
        this.f16256j = false;
        this.f16253g = 0;
        this.f16249c = false;
        this.f16248b = false;
    }

    /* renamed from: d */
    public void mo16623d(int i10) {
        if (this.f16256j) {
            return;
        }
        this.f16256j = true;
        this.f16253g = i10;
        for (InterfaceC3916d interfaceC3916d : this.f16257k) {
            interfaceC3916d.mo16601a(interfaceC3916d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16250d.f16299b.m16399r());
        sb2.append(":");
        sb2.append(this.f16251e);
        sb2.append("(");
        sb2.append(this.f16256j ? Integer.valueOf(this.f16253g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f16258l.size());
        sb2.append(":d=");
        sb2.append(this.f16257k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
