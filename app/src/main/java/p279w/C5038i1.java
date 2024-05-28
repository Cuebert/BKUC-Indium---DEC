package p279w;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import p305y.C5586f;

/* renamed from: w.i1 */
/* loaded from: classes.dex */
public final class C5038i1 extends AbstractC5073r0 {

    /* renamed from: m */
    private final Surface f19197m;

    public C5038i1(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f19197m = surface;
    }

    @Override // p279w.AbstractC5073r0
    /* renamed from: n */
    public InterfaceFutureC2565m<Surface> mo2042n() {
        return C5586f.m20508h(this.f19197m);
    }

    public C5038i1(Surface surface) {
        this.f19197m = surface;
    }
}
