package lb;

import android.os.Looper;
import java.util.List;
import p145kb.AbstractC3781d1;
import p168mb.InterfaceC3996r;

/* renamed from: lb.a */
/* loaded from: classes.dex */
public final class C3906a implements InterfaceC3996r {
    @Override // p168mb.InterfaceC3996r
    /* renamed from: a */
    public String mo16572a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p168mb.InterfaceC3996r
    /* renamed from: b */
    public AbstractC3781d1 mo16573b(List<? extends InterfaceC3996r> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C3908c(C3910e.m16578a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p168mb.InterfaceC3996r
    /* renamed from: c */
    public int mo16574c() {
        return 1073741823;
    }
}
