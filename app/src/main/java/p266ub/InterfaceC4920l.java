package p266ub;

import ac.InterfaceC0075e;
import java.io.IOException;
import java.util.List;

/* renamed from: ub.l */
/* loaded from: classes.dex */
public interface InterfaceC4920l {

    /* renamed from: a */
    public static final InterfaceC4920l f18955a = new a();

    /* renamed from: ub.l$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC4920l {
        a() {
        }

        @Override // p266ub.InterfaceC4920l
        /* renamed from: a */
        public boolean mo19312a(int i10, List<C4911c> list) {
            return true;
        }

        @Override // p266ub.InterfaceC4920l
        /* renamed from: b */
        public boolean mo19313b(int i10, List<C4911c> list, boolean z10) {
            return true;
        }

        @Override // p266ub.InterfaceC4920l
        /* renamed from: c */
        public void mo19314c(int i10, EnumC4910b enumC4910b) {
        }

        @Override // p266ub.InterfaceC4920l
        /* renamed from: d */
        public boolean mo19315d(int i10, InterfaceC0075e interfaceC0075e, int i11, boolean z10) throws IOException {
            interfaceC0075e.mo369r(i11);
            return true;
        }
    }

    /* renamed from: a */
    boolean mo19312a(int i10, List<C4911c> list);

    /* renamed from: b */
    boolean mo19313b(int i10, List<C4911c> list, boolean z10);

    /* renamed from: c */
    void mo19314c(int i10, EnumC4910b enumC4910b);

    /* renamed from: d */
    boolean mo19315d(int i10, InterfaceC0075e interfaceC0075e, int i11, boolean z10) throws IOException;
}
