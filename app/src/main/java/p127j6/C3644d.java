package p127j6;

import android.content.Context;
import com.google.android.gms.common.C1379b;
import p087g6.AbstractC3292e;
import p087g6.C3298i;
import p113i6.C3537c;
import p283w3.C5126ab;
import p283w3.C5324pa;

/* renamed from: j6.d */
/* loaded from: classes.dex */
public final class C3644d extends AbstractC3292e<C3537c, C3647g> {

    /* renamed from: b */
    private final C3298i f15322b;

    public C3644d(C3298i c3298i) {
        this.f15322b = c3298i;
    }

    @Override // p087g6.AbstractC3292e
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ C3647g mo14550a(C3537c c3537c) {
        InterfaceC3648h c3651k;
        C3537c c3537c2 = c3537c;
        Context m14562b = this.f15322b.m14562b();
        C5324pa m19754b = C5126ab.m19754b(C3642b.m15552d());
        if (!C3651k.m15561c(m14562b) && C1379b.m7589f().m7590a(m14562b) < 204500000) {
            c3651k = new C3653m(m14562b, c3537c2, m19754b);
        } else {
            c3651k = new C3651k(m14562b, c3537c2, m19754b);
        }
        return new C3647g(this.f15322b, c3537c2, c3651k, m19754b);
    }
}
