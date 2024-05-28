package p303xa;

import kotlin.jvm.internal.C3844i;
import va.InterfaceC4999c;
import va.InterfaceC5000d;
import va.InterfaceC5001e;

/* renamed from: xa.c */
/* loaded from: classes.dex */
public abstract class AbstractC5574c extends AbstractC5572a {

    /* renamed from: o */
    private final InterfaceC5001e f20682o;

    /* renamed from: p */
    private transient InterfaceC4999c<Object> f20683p;

    public AbstractC5574c(InterfaceC4999c<Object> interfaceC4999c, InterfaceC5001e interfaceC5001e) {
        super(interfaceC4999c);
        this.f20682o = interfaceC5001e;
    }

    @Override // p303xa.AbstractC5572a
    /* renamed from: e */
    protected void mo20478e() {
        InterfaceC4999c<?> interfaceC4999c = this.f20683p;
        if (interfaceC4999c != null && interfaceC4999c != this) {
            InterfaceC5001e.a mo16094i = getContext().mo16094i(InterfaceC5000d.f19100l);
            C3844i.m16250c(mo16094i);
            ((InterfaceC5000d) mo16094i).mo16227W(interfaceC4999c);
        }
        this.f20683p = C5573b.f20681n;
    }

    /* renamed from: g */
    public final InterfaceC4999c<Object> m20479g() {
        InterfaceC4999c<Object> interfaceC4999c = this.f20683p;
        if (interfaceC4999c == null) {
            InterfaceC5000d interfaceC5000d = (InterfaceC5000d) getContext().mo16094i(InterfaceC5000d.f19100l);
            if (interfaceC5000d == null || (interfaceC4999c = interfaceC5000d.mo16226Q(this)) == null) {
                interfaceC4999c = this;
            }
            this.f20683p = interfaceC4999c;
        }
        return interfaceC4999c;
    }

    @Override // va.InterfaceC4999c
    public InterfaceC5001e getContext() {
        InterfaceC5001e interfaceC5001e = this.f20682o;
        C3844i.m16250c(interfaceC5001e);
        return interfaceC5001e;
    }

    public AbstractC5574c(InterfaceC4999c<Object> interfaceC4999c) {
        this(interfaceC4999c, interfaceC4999c != null ? interfaceC4999c.getContext() : null);
    }
}
