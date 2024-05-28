package p003a2;

import java.util.concurrent.Executor;
import p028c2.C1126d;
import p028c2.InterfaceC1124b;

/* renamed from: a2.k */
/* loaded from: classes.dex */
public final class C0016k implements InterfaceC1124b<Executor> {

    /* renamed from: a2.k$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C0016k f163a = new C0016k();
    }

    /* renamed from: a */
    public static C0016k m140a() {
        return a.f163a;
    }

    /* renamed from: b */
    public static Executor m141b() {
        return (Executor) C1126d.m6514c(AbstractC0015j.m139a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m141b();
    }
}
