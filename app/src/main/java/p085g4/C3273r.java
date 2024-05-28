package p085g4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g4.r */
/* loaded from: classes.dex */
public final class C3273r<T> implements InterfaceC3274s<T> {

    /* renamed from: a */
    private final CountDownLatch f13719a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3273r(C3272q c3272q) {
    }

    @Override // p085g4.InterfaceC3249e
    /* renamed from: a */
    public final void mo14487a() {
        this.f13719a.countDown();
    }

    /* renamed from: b */
    public final void m14534b() throws InterruptedException {
        this.f13719a.await();
    }

    /* renamed from: c */
    public final boolean m14535c(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f13719a.await(j10, timeUnit);
    }

    @Override // p085g4.InterfaceC3253g
    public final void onFailure(Exception exc) {
        this.f13719a.countDown();
    }

    @Override // p085g4.InterfaceC3255h
    public final void onSuccess(T t10) {
        this.f13719a.countDown();
    }
}
