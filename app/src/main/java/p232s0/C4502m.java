package p232s0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;
import p243t0.C4599h;
import p243t0.C4606o;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: s0.m */
/* loaded from: classes.dex */
public final class C4502m implements InterfaceC4500k {

    /* renamed from: c */
    public static final a f18227c = new a(null);

    /* renamed from: b */
    private final Context f18228b;

    /* renamed from: s0.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    public C4502m(Context context) {
        C3844i.m16253f(context, "context");
        this.f18228b = context;
    }

    @Override // p232s0.InterfaceC4500k
    /* renamed from: a */
    public void mo18489a(Context context, AbstractC4490b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback) {
        C3844i.m16253f(context, "context");
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        InterfaceC4505p m18503b = C4506q.f18236a.m18503b(this.f18228b);
        if (m18503b == null) {
            callback.mo13660a(new C4599h("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            m18503b.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // p232s0.InterfaceC4500k
    /* renamed from: b */
    public void mo18490b(Context context, C4509t request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<C4510u, AbstractC4604m> callback) {
        C3844i.m16253f(context, "context");
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        InterfaceC4505p m18503b = C4506q.f18236a.m18503b(this.f18228b);
        if (m18503b == null) {
            callback.mo13660a(new C4606o("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            m18503b.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }
}
