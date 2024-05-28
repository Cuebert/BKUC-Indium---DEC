package p279w;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0399e;
import java.util.List;
import p279w.InterfaceC5061o0;

/* renamed from: w.f1 */
/* loaded from: classes.dex */
public interface InterfaceC5026f1 extends InterfaceC5007a2 {

    /* renamed from: g */
    public static final InterfaceC5061o0.a<Integer> f19166g = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.targetAspectRatio", C0399e.class);

    /* renamed from: h */
    public static final InterfaceC5061o0.a<Integer> f19167h;

    /* renamed from: i */
    public static final InterfaceC5061o0.a<Integer> f19168i;

    /* renamed from: j */
    public static final InterfaceC5061o0.a<Size> f19169j;

    /* renamed from: k */
    public static final InterfaceC5061o0.a<Size> f19170k;

    /* renamed from: l */
    public static final InterfaceC5061o0.a<Size> f19171l;

    /* renamed from: m */
    public static final InterfaceC5061o0.a<List<Pair<Integer, Size[]>>> f19172m;

    static {
        Class cls = Integer.TYPE;
        f19167h = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.targetRotation", cls);
        f19168i = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.appTargetRotation", cls);
        f19169j = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.targetResolution", Size.class);
        f19170k = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.defaultResolution", Size.class);
        f19171l = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.maxResolution", Size.class);
        f19172m = InterfaceC5061o0.a.m19653a("camerax.core.imageOutput.supportedResolutions", List.class);
    }

    /* renamed from: A */
    int mo19463A(int i10);

    /* renamed from: E */
    int mo19464E(int i10);

    /* renamed from: f */
    Size mo19477f(Size size);

    /* renamed from: k */
    List<Pair<Integer, Size[]>> mo19478k(List<Pair<Integer, Size[]>> list);

    /* renamed from: l */
    boolean mo19479l();

    /* renamed from: n */
    int mo19480n();

    /* renamed from: u */
    Size mo19481u(Size size);

    /* renamed from: z */
    Size mo19482z(Size size);
}
