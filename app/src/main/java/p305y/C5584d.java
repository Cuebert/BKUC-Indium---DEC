package p305y;

import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p169n.InterfaceC4005a;

/* renamed from: y.d */
/* loaded from: classes.dex */
public class C5584d<V> implements InterfaceFutureC2565m<V> {

    /* renamed from: n */
    private final InterfaceFutureC2565m<V> f20697n;

    /* renamed from: o */
    C0541c.a<V> f20698o;

    /* renamed from: y.d$a */
    /* loaded from: classes.dex */
    class a implements C0541c.c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.C0541c.c
        /* renamed from: a */
        public Object mo1498a(C0541c.a<V> aVar) {
            C0654h.m3470i(C5584d.this.f20698o == null, "The result can only set once!");
            C5584d.this.f20698o = aVar;
            return "FutureChain[" + C5584d.this + "]";
        }
    }

    C5584d(InterfaceFutureC2565m<V> interfaceFutureC2565m) {
        this.f20697n = (InterfaceFutureC2565m) C0654h.m3467f(interfaceFutureC2565m);
    }

    /* renamed from: a */
    public static <V> C5584d<V> m20496a(InterfaceFutureC2565m<V> interfaceFutureC2565m) {
        return interfaceFutureC2565m instanceof C5584d ? (C5584d) interfaceFutureC2565m : new C5584d<>(interfaceFutureC2565m);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC2565m
    /* renamed from: b */
    public void mo2501b(Runnable runnable, Executor executor) {
        this.f20697n.mo2501b(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m20497c(V v10) {
        C0541c.a<V> aVar = this.f20698o;
        if (aVar != null) {
            return aVar.m2519c(v10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f20697n.cancel(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m20498d(Throwable th) {
        C0541c.a<V> aVar = this.f20698o;
        if (aVar != null) {
            return aVar.m2521f(th);
        }
        return false;
    }

    /* renamed from: e */
    public final <T> C5584d<T> m20499e(InterfaceC4005a<? super V, T> interfaceC4005a, Executor executor) {
        return (C5584d) C5586f.m20515o(this, interfaceC4005a, executor);
    }

    /* renamed from: f */
    public final <T> C5584d<T> m20500f(InterfaceC5581a<? super V, T> interfaceC5581a, Executor executor) {
        return (C5584d) C5586f.m20516p(this, interfaceC5581a, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f20697n.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f20697n.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f20697n.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f20697n.get(j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5584d() {
        this.f20697n = C0541c.m2515a(new a());
    }
}
