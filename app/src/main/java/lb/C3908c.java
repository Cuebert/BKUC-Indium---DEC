package lb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p145kb.C3789g0;
import p145kb.C3833y0;
import va.InterfaceC5001e;

/* renamed from: lb.c */
/* loaded from: classes.dex */
public final class C3908c extends AbstractC3909d {
    private volatile C3908c _immediate;

    /* renamed from: p */
    private final Handler f16201p;

    /* renamed from: q */
    private final String f16202q;

    /* renamed from: r */
    private final boolean f16203r;

    /* renamed from: s */
    private final C3908c f16204s;

    private C3908c(Handler handler, String str, boolean z10) {
        super(null);
        this.f16201p = handler;
        this.f16202q = str;
        this.f16203r = z10;
        this._immediate = z10 ? this : null;
        C3908c c3908c = this._immediate;
        if (c3908c == null) {
            c3908c = new C3908c(handler, str, true);
            this._immediate = c3908c;
        }
        this.f16204s = c3908c;
    }

    /* renamed from: o0 */
    private final void m16576o0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        C3833y0.m16237a(interfaceC5001e, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3789g0.m16138b().mo16197j0(interfaceC5001e, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3908c) && ((C3908c) obj).f16201p == this.f16201p;
    }

    public int hashCode() {
        return System.identityHashCode(this.f16201p);
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: j0 */
    public void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        if (this.f16201p.post(runnable)) {
            return;
        }
        m16576o0(interfaceC5001e, runnable);
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: k0 */
    public boolean mo16205k0(InterfaceC5001e interfaceC5001e) {
        return (this.f16203r && C3844i.m16248a(Looper.myLooper(), this.f16201p.getLooper())) ? false : true;
    }

    @Override // p145kb.AbstractC3781d1
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C3908c mo16122m0() {
        return this.f16204s;
    }

    @Override // p145kb.AbstractC3781d1, p145kb.AbstractC3826v
    public String toString() {
        String m16123n0 = m16123n0();
        if (m16123n0 != null) {
            return m16123n0;
        }
        String str = this.f16202q;
        if (str == null) {
            str = this.f16201p.toString();
        }
        if (!this.f16203r) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ C3908c(Handler handler, String str, int i10, C3840e c3840e) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C3908c(Handler handler, String str) {
        this(handler, str, false);
    }
}
