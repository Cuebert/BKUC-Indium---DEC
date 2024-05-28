package p279w;

import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.InterfaceC0437k;
import androidx.camera.core.InterfaceC0465r;
import java.util.Collection;

/* renamed from: w.d0 */
/* loaded from: classes.dex */
public interface InterfaceC5017d0 extends InterfaceC0437k, AbstractC0496y2.d {

    /* renamed from: w.d0$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);


        /* renamed from: n */
        private final boolean f19154n;

        a(boolean z10) {
            this.f19154n = z10;
        }

        /* renamed from: b */
        public boolean m19528b() {
            return this.f19154n;
        }
    }

    /* renamed from: a */
    void mo1449a(boolean z10);

    /* renamed from: b */
    InterfaceC0465r mo1450b();

    /* renamed from: d */
    void mo1454d(Collection<AbstractC0496y2> collection);

    /* renamed from: f */
    void mo1457f(Collection<AbstractC0496y2> collection);

    /* renamed from: g */
    void mo1459g(InterfaceC5078t interfaceC5078t);

    /* renamed from: h */
    InterfaceC5009b0 mo1461h();

    /* renamed from: k */
    InterfaceC5077s1<a> mo1467k();

    /* renamed from: l */
    InterfaceC5093y mo1468l();
}
