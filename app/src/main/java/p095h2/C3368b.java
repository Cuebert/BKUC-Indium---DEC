package p095h2;

import java.util.Map;
import java.util.Objects;
import p095h2.AbstractC3372f;
import p136k2.InterfaceC3749a;
import p307y1.EnumC5595d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h2.b */
/* loaded from: classes.dex */
public final class C3368b extends AbstractC3372f {

    /* renamed from: a */
    private final InterfaceC3749a f14126a;

    /* renamed from: b */
    private final Map<EnumC5595d, AbstractC3372f.b> f14127b;

    public C3368b(InterfaceC3749a interfaceC3749a, Map<EnumC5595d, AbstractC3372f.b> map) {
        Objects.requireNonNull(interfaceC3749a, "Null clock");
        this.f14126a = interfaceC3749a;
        Objects.requireNonNull(map, "Null values");
        this.f14127b = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p095h2.AbstractC3372f
    /* renamed from: e */
    public InterfaceC3749a mo14887e() {
        return this.f14126a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3372f)) {
            return false;
        }
        AbstractC3372f abstractC3372f = (AbstractC3372f) obj;
        return this.f14126a.equals(abstractC3372f.mo14887e()) && this.f14127b.equals(abstractC3372f.mo14888h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p095h2.AbstractC3372f
    /* renamed from: h */
    public Map<EnumC5595d, AbstractC3372f.b> mo14888h() {
        return this.f14127b;
    }

    public int hashCode() {
        return ((this.f14126a.hashCode() ^ 1000003) * 1000003) ^ this.f14127b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f14126a + ", values=" + this.f14127b + "}";
    }
}
