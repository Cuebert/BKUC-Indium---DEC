package p007a6;

import java.util.Iterator;
import java.util.Set;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;

/* renamed from: a6.c */
/* loaded from: classes.dex */
public class C0036c implements InterfaceC0042i {

    /* renamed from: a */
    private final String f190a;

    /* renamed from: b */
    private final C0037d f191b;

    C0036c(Set<AbstractC0039f> set, C0037d c0037d) {
        this.f190a = m234e(set);
        this.f191b = c0037d;
    }

    /* renamed from: c */
    public static C3617d<InterfaceC0042i> m232c() {
        return C3617d.m15462c(InterfaceC0042i.class).m15480b(C3631q.m15531j(AbstractC0039f.class)).m15484f(new InterfaceC3622h() { // from class: a6.b
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                InterfaceC0042i m233d;
                m233d = C0036c.m233d(interfaceC3619e);
                return m233d;
            }
        }).m15482d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC0042i m233d(InterfaceC3619e interfaceC3619e) {
        return new C0036c(interfaceC3619e.mo15449b(AbstractC0039f.class), C0037d.m236a());
    }

    /* renamed from: e */
    private static String m234e(Set<AbstractC0039f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC0039f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC0039f next = it.next();
            sb2.append(next.mo228b());
            sb2.append('/');
            sb2.append(next.mo229c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p007a6.InterfaceC0042i
    /* renamed from: a */
    public String mo235a() {
        if (this.f191b.m237b().isEmpty()) {
            return this.f190a;
        }
        return this.f190a + ' ' + m234e(this.f191b.m237b());
    }
}
