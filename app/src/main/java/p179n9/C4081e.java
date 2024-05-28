package p179n9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: n9.e */
/* loaded from: classes.dex */
public class C4081e implements InterfaceC4079c {

    /* renamed from: a */
    private final Executor f16563a;

    /* renamed from: b */
    private final Executor f16564b;

    /* renamed from: n9.e$a */
    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: n */
        private Handler f16565n = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f16565n.post(runnable);
        }
    }

    public C4081e(Executor executor, Executor executor2) {
        this.f16563a = executor;
        this.f16564b = executor2;
    }

    @Override // p179n9.InterfaceC4079c
    /* renamed from: a */
    public Executor mo16966a() {
        return this.f16564b;
    }

    @Override // p179n9.InterfaceC4079c
    /* renamed from: b */
    public Executor mo16967b() {
        return this.f16563a;
    }
}
