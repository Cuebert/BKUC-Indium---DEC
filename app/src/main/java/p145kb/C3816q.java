package p145kb;

import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p253ta.C4755l;

/* renamed from: kb.q */
/* loaded from: classes.dex */
public final class C3816q {

    /* renamed from: a */
    public final Object f15878a;

    /* renamed from: b */
    public final InterfaceC3041l<Throwable, C4755l> f15879b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3816q(Object obj, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        this.f15878a = obj;
        this.f15879b = interfaceC3041l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3816q)) {
            return false;
        }
        C3816q c3816q = (C3816q) obj;
        return C3844i.m16248a(this.f15878a, c3816q.f15878a) && C3844i.m16248a(this.f15879b, c3816q.f15879b);
    }

    public int hashCode() {
        Object obj = this.f15878a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f15879b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f15878a + ", onCancellation=" + this.f15879b + ')';
    }
}
