package p232s0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3844i;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: s0.k */
/* loaded from: classes.dex */
public interface InterfaceC4500k {

    /* renamed from: a */
    public static final a f18225a = a.f18226a;

    /* renamed from: s0.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f18226a = new a();

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC4500k m18491a(Context context) {
            C3844i.m16253f(context, "context");
            return new C4502m(context);
        }
    }

    /* renamed from: a */
    void mo18489a(Context context, AbstractC4490b abstractC4490b, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<AbstractC4492c, AbstractC4596e> interfaceC4501l);

    /* renamed from: b */
    void mo18490b(Context context, C4509t c4509t, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<C4510u, AbstractC4604m> interfaceC4501l);
}
