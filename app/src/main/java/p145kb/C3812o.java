package p145kb;

import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p253ta.C4755l;

/* renamed from: kb.o */
/* loaded from: classes.dex */
final class C3812o {

    /* renamed from: a */
    public final Object f15868a;

    /* renamed from: b */
    public final AbstractC3785f f15869b;

    /* renamed from: c */
    public final InterfaceC3041l<Throwable, C4755l> f15870c;

    /* renamed from: d */
    public final Object f15871d;

    /* renamed from: e */
    public final Throwable f15872e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3812o(Object obj, AbstractC3785f abstractC3785f, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l, Object obj2, Throwable th) {
        this.f15868a = obj;
        this.f15869b = abstractC3785f;
        this.f15870c = interfaceC3041l;
        this.f15871d = obj2;
        this.f15872e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C3812o m16212b(C3812o c3812o, Object obj, AbstractC3785f abstractC3785f, InterfaceC3041l interfaceC3041l, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c3812o.f15868a;
        }
        if ((i10 & 2) != 0) {
            abstractC3785f = c3812o.f15869b;
        }
        AbstractC3785f abstractC3785f2 = abstractC3785f;
        if ((i10 & 4) != 0) {
            interfaceC3041l = c3812o.f15870c;
        }
        InterfaceC3041l interfaceC3041l2 = interfaceC3041l;
        if ((i10 & 8) != 0) {
            obj2 = c3812o.f15871d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = c3812o.f15872e;
        }
        return c3812o.m16213a(obj, abstractC3785f2, interfaceC3041l2, obj4, th);
    }

    /* renamed from: a */
    public final C3812o m16213a(Object obj, AbstractC3785f abstractC3785f, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l, Object obj2, Throwable th) {
        return new C3812o(obj, abstractC3785f, interfaceC3041l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m16214c() {
        return this.f15872e != null;
    }

    /* renamed from: d */
    public final void m16215d(C3794i<?> c3794i, Throwable th) {
        AbstractC3785f abstractC3785f = this.f15869b;
        if (abstractC3785f != null) {
            c3794i.m16162k(abstractC3785f, th);
        }
        InterfaceC3041l<Throwable, C4755l> interfaceC3041l = this.f15870c;
        if (interfaceC3041l != null) {
            c3794i.m16163l(interfaceC3041l, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3812o)) {
            return false;
        }
        C3812o c3812o = (C3812o) obj;
        return C3844i.m16248a(this.f15868a, c3812o.f15868a) && C3844i.m16248a(this.f15869b, c3812o.f15869b) && C3844i.m16248a(this.f15870c, c3812o.f15870c) && C3844i.m16248a(this.f15871d, c3812o.f15871d) && C3844i.m16248a(this.f15872e, c3812o.f15872e);
    }

    public int hashCode() {
        Object obj = this.f15868a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC3785f abstractC3785f = this.f15869b;
        int hashCode2 = (hashCode + (abstractC3785f == null ? 0 : abstractC3785f.hashCode())) * 31;
        InterfaceC3041l<Throwable, C4755l> interfaceC3041l = this.f15870c;
        int hashCode3 = (hashCode2 + (interfaceC3041l == null ? 0 : interfaceC3041l.hashCode())) * 31;
        Object obj2 = this.f15871d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15872e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f15868a + ", cancelHandler=" + this.f15869b + ", onCancellation=" + this.f15870c + ", idempotentResume=" + this.f15871d + ", cancelCause=" + this.f15872e + ')';
    }

    public /* synthetic */ C3812o(Object obj, AbstractC3785f abstractC3785f, InterfaceC3041l interfaceC3041l, Object obj2, Throwable th, int i10, C3840e c3840e) {
        this(obj, (i10 & 2) != 0 ? null : abstractC3785f, (i10 & 4) != 0 ? null : interfaceC3041l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
