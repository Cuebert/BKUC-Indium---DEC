package p303xa;

import java.io.Serializable;
import kotlin.jvm.internal.C3844i;
import p253ta.C4751h;
import p253ta.C4752i;
import p290wa.C5486d;
import va.InterfaceC4999c;

/* renamed from: xa.a */
/* loaded from: classes.dex */
public abstract class AbstractC5572a implements InterfaceC4999c<Object>, InterfaceC5575d, Serializable {

    /* renamed from: n */
    private final InterfaceC4999c<Object> f20680n;

    public AbstractC5572a(InterfaceC4999c<Object> interfaceC4999c) {
        this.f20680n = interfaceC4999c;
    }

    @Override // p303xa.InterfaceC5575d
    /* renamed from: a */
    public InterfaceC5575d mo16161a() {
        InterfaceC4999c<Object> interfaceC4999c = this.f20680n;
        if (interfaceC4999c instanceof InterfaceC5575d) {
            return (InterfaceC5575d) interfaceC4999c;
        }
        return null;
    }

    /* renamed from: b */
    public StackTraceElement m20477b() {
        return C5577f.m20488d(this);
    }

    /* renamed from: c */
    protected abstract Object mo14670c(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // va.InterfaceC4999c
    /* renamed from: d */
    public final void mo16028d(Object obj) {
        Object mo14670c;
        Object m20182b;
        InterfaceC4999c interfaceC4999c = this;
        while (true) {
            C5578g.m20489a(interfaceC4999c);
            AbstractC5572a abstractC5572a = (AbstractC5572a) interfaceC4999c;
            InterfaceC4999c interfaceC4999c2 = abstractC5572a.f20680n;
            C3844i.m16250c(interfaceC4999c2);
            try {
                mo14670c = abstractC5572a.mo14670c(obj);
                m20182b = C5486d.m20182b();
            } catch (Throwable th) {
                C4751h.a aVar = C4751h.f18580n;
                obj = C4751h.m18904a(C4752i.m18908a(th));
            }
            if (mo14670c == m20182b) {
                return;
            }
            C4751h.a aVar2 = C4751h.f18580n;
            obj = C4751h.m18904a(mo14670c);
            abstractC5572a.mo20478e();
            if (!(interfaceC4999c2 instanceof AbstractC5572a)) {
                interfaceC4999c2.mo16028d(obj);
                return;
            }
            interfaceC4999c = interfaceC4999c2;
        }
    }

    /* renamed from: e */
    protected void mo20478e() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object m20477b = m20477b();
        if (m20477b == null) {
            m20477b = getClass().getName();
        }
        sb2.append(m20477b);
        return sb2.toString();
    }
}
