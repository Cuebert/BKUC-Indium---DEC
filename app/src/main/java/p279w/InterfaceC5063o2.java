package p279w;

import android.util.Range;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0469s;
import androidx.camera.core.InterfaceC0414h0;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.InterfaceC5061o0;
import p318z.InterfaceC5941i;
import p318z.InterfaceC5945m;

/* renamed from: w.o2 */
/* loaded from: classes.dex */
public interface InterfaceC5063o2<T extends AbstractC0496y2> extends InterfaceC5941i<T>, InterfaceC5945m, InterfaceC5018d1 {

    /* renamed from: n */
    public static final InterfaceC5061o0.a<C5015c2> f19278n = InterfaceC5061o0.a.m19653a("camerax.core.useCase.defaultSessionConfig", C5015c2.class);

    /* renamed from: o */
    public static final InterfaceC5061o0.a<C5045k0> f19279o = InterfaceC5061o0.a.m19653a("camerax.core.useCase.defaultCaptureConfig", C5045k0.class);

    /* renamed from: p */
    public static final InterfaceC5061o0.a<C5015c2.d> f19280p = InterfaceC5061o0.a.m19653a("camerax.core.useCase.sessionConfigUnpacker", C5015c2.d.class);

    /* renamed from: q */
    public static final InterfaceC5061o0.a<C5045k0.b> f19281q = InterfaceC5061o0.a.m19653a("camerax.core.useCase.captureConfigUnpacker", C5045k0.b.class);

    /* renamed from: r */
    public static final InterfaceC5061o0.a<Integer> f19282r = InterfaceC5061o0.a.m19653a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: s */
    public static final InterfaceC5061o0.a<C0469s> f19283s = InterfaceC5061o0.a.m19653a("camerax.core.useCase.cameraSelector", C0469s.class);

    /* renamed from: t */
    public static final InterfaceC5061o0.a<Range<Integer>> f19284t = InterfaceC5061o0.a.m19653a("camerax.core.useCase.targetFrameRate", C0469s.class);

    /* renamed from: w.o2$a */
    /* loaded from: classes.dex */
    public interface a<T extends AbstractC0496y2, C extends InterfaceC5063o2<T>, B> extends InterfaceC0414h0<T> {
        /* renamed from: b */
        C mo1927b();
    }

    /* renamed from: i */
    C5045k0 mo1370i(C5045k0 c5045k0);

    /* renamed from: j */
    C5045k0.b mo1371j(C5045k0.b bVar);

    /* renamed from: m */
    int mo1372m(int i10);

    /* renamed from: r */
    C5015c2.d mo1375r(C5015c2.d dVar);

    /* renamed from: w */
    C5015c2 mo1378w(C5015c2 c5015c2);

    /* renamed from: y */
    C0469s mo1380y(C0469s c0469s);
}
