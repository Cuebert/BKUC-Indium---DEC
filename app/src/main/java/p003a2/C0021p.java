package p003a2;

import java.util.Set;
import p307y1.C5593b;
import p307y1.InterfaceC5596e;
import p307y1.InterfaceC5597f;
import p307y1.InterfaceC5598g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a2.p */
/* loaded from: classes.dex */
public final class C0021p implements InterfaceC5598g {

    /* renamed from: a */
    private final Set<C5593b> f167a;

    /* renamed from: b */
    private final AbstractC0020o f168b;

    /* renamed from: c */
    private final InterfaceC0024s f169c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0021p(Set<C5593b> set, AbstractC0020o abstractC0020o, InterfaceC0024s interfaceC0024s) {
        this.f167a = set;
        this.f168b = abstractC0020o;
        this.f169c = interfaceC0024s;
    }

    @Override // p307y1.InterfaceC5598g
    /* renamed from: a */
    public <T> InterfaceC5597f<T> mo151a(String str, Class<T> cls, C5593b c5593b, InterfaceC5596e<T, byte[]> interfaceC5596e) {
        if (this.f167a.contains(c5593b)) {
            return new C0023r(this.f168b, str, c5593b, interfaceC5596e, this.f169c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c5593b, this.f167a));
    }
}
