package p087g6;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executor;
import p248t5.InterfaceC4733b;

/* renamed from: g6.d */
/* loaded from: classes.dex */
public class C3290d {

    /* renamed from: a */
    private final InterfaceC4733b<? extends Executor> f13746a;

    public C3290d(@RecentlyNonNull InterfaceC4733b<? extends Executor> interfaceC4733b) {
        this.f13746a = interfaceC4733b;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public Executor m14549a(Executor executor) {
        return executor != null ? executor : this.f13746a.get();
    }
}
