package kotlin.jvm.internal;

import p104hb.InterfaceC3453b;
import p104hb.InterfaceC3458g;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes.dex */
public abstract class AbstractC3849n extends AbstractC3836a implements InterfaceC3458g {

    /* renamed from: n */
    private final boolean f15903n;

    public AbstractC3849n() {
        this.f15903n = false;
    }

    @Override // kotlin.jvm.internal.AbstractC3836a
    /* renamed from: a */
    public InterfaceC3458g getReflected() {
        if (!this.f15903n) {
            return (InterfaceC3458g) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // kotlin.jvm.internal.AbstractC3836a
    public InterfaceC3453b compute() {
        return this.f15903n ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3849n) {
            AbstractC3849n abstractC3849n = (AbstractC3849n) obj;
            return getOwner().equals(abstractC3849n.getOwner()) && getName().equals(abstractC3849n.getName()) && getSignature().equals(abstractC3849n.getSignature()) && C3844i.m16248a(getBoundReceiver(), abstractC3849n.getBoundReceiver());
        }
        if (obj instanceof InterfaceC3458g) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC3453b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC3849n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f15903n = (i10 & 2) == 2;
    }
}
