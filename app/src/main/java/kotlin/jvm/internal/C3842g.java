package kotlin.jvm.internal;

import p104hb.InterfaceC3453b;
import p104hb.InterfaceC3456e;

/* renamed from: kotlin.jvm.internal.g */
/* loaded from: classes.dex */
public class C3842g extends AbstractC3836a implements InterfaceC3841f, InterfaceC3456e {
    private final int arity;
    private final int flags;

    public C3842g(int i10) {
        this(i10, AbstractC3836a.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC3836a
    protected InterfaceC3453b computeReflected() {
        return C3851p.m16267a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3842g) {
            C3842g c3842g = (C3842g) obj;
            return getName().equals(c3842g.getName()) && getSignature().equals(c3842g.getSignature()) && this.flags == c3842g.flags && this.arity == c3842g.arity && C3844i.m16248a(getBoundReceiver(), c3842g.getBoundReceiver()) && C3844i.m16248a(getOwner(), c3842g.getOwner());
        }
        if (obj instanceof InterfaceC3456e) {
            return obj.equals(compute());
        }
        return false;
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p104hb.InterfaceC3456e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p104hb.InterfaceC3456e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p104hb.InterfaceC3456e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p104hb.InterfaceC3456e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3836a, p104hb.InterfaceC3453b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC3453b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C3842g(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3836a
    public InterfaceC3456e getReflected() {
        return (InterfaceC3456e) super.getReflected();
    }

    public C3842g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
