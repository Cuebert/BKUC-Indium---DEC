package p232s0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;

/* renamed from: s0.p */
/* loaded from: classes.dex */
public interface InterfaceC4505p {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, AbstractC4490b abstractC4490b, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<AbstractC4492c, AbstractC4596e> interfaceC4501l);

    void onGetCredential(Context context, C4509t c4509t, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<C4510u, AbstractC4604m> interfaceC4501l);
}
