package p118ib;

import java.util.Iterator;
import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ib.f */
/* loaded from: classes.dex */
public class C3554f extends C3553e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ib.f$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements InterfaceC3550b<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f15146a;

        public a(Iterator it) {
            this.f15146a = it;
        }

        @Override // p118ib.InterfaceC3550b
        public Iterator<T> iterator() {
            return this.f15146a;
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC3550b<T> m15363a(Iterator<? extends T> it) {
        C3844i.m16253f(it, "<this>");
        return m15364b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> InterfaceC3550b<T> m15364b(InterfaceC3550b<? extends T> interfaceC3550b) {
        C3844i.m16253f(interfaceC3550b, "<this>");
        return interfaceC3550b instanceof C3549a ? interfaceC3550b : new C3549a(interfaceC3550b);
    }
}
