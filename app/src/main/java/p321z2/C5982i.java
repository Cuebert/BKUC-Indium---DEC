package p321z2;

import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p295x2.AbstractC5513h;
import p295x2.C5517l;
import p295x2.InterfaceC5518m;

/* renamed from: z2.i */
/* loaded from: classes.dex */
public class C5982i {

    /* renamed from: a */
    private static final InterfaceC5973d0 f22048a = new C6009z();

    /* renamed from: z2.i$a */
    /* loaded from: classes.dex */
    public interface a<R extends InterfaceC5518m, T> {
        /* renamed from: a */
        T mo7369a(R r10);
    }

    /* renamed from: a */
    public static <R extends InterfaceC5518m, T extends C5517l<R>> AbstractC3263l<T> m21274a(AbstractC5513h<R> abstractC5513h, T t10) {
        return m21275b(abstractC5513h, new C5969b0(t10));
    }

    /* renamed from: b */
    public static <R extends InterfaceC5518m, T> AbstractC3263l<T> m21275b(AbstractC5513h<R> abstractC5513h, a<R, T> aVar) {
        InterfaceC5973d0 interfaceC5973d0 = f22048a;
        C3265m c3265m = new C3265m();
        abstractC5513h.mo7421b(new C5967a0(abstractC5513h, c3265m, aVar, interfaceC5973d0));
        return c3265m.m14512a();
    }

    /* renamed from: c */
    public static <R extends InterfaceC5518m> AbstractC3263l<Void> m21276c(AbstractC5513h<R> abstractC5513h) {
        return m21275b(abstractC5513h, new C5971c0());
    }
}
