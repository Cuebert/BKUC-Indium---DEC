package p279w;

import android.util.Size;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0401e1;
import androidx.camera.core.C0469s;
import androidx.camera.core.InterfaceC0447m1;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.InterfaceC5061o0;
import p318z.C5940h;
import p318z.C5944l;
import p318z.InterfaceC5939g;

/* renamed from: w.a1 */
/* loaded from: classes.dex */
public final class C5006a1 implements InterfaceC5063o2<C0401e1>, InterfaceC5026f1, InterfaceC5939g {

    /* renamed from: A */
    public static final InterfaceC5061o0.a<Integer> f19106A;

    /* renamed from: B */
    public static final InterfaceC5061o0.a<Integer> f19107B;

    /* renamed from: C */
    public static final InterfaceC5061o0.a<InterfaceC5041j0> f19108C;

    /* renamed from: D */
    public static final InterfaceC5061o0.a<InterfaceC5049l0> f19109D;

    /* renamed from: E */
    public static final InterfaceC5061o0.a<Integer> f19110E;

    /* renamed from: F */
    public static final InterfaceC5061o0.a<Integer> f19111F;

    /* renamed from: G */
    public static final InterfaceC5061o0.a<InterfaceC0447m1> f19112G;

    /* renamed from: H */
    public static final InterfaceC5061o0.a<Boolean> f19113H;

    /* renamed from: I */
    public static final InterfaceC5061o0.a<Integer> f19114I;

    /* renamed from: J */
    public static final InterfaceC5061o0.a<Integer> f19115J;

    /* renamed from: K */
    public static final InterfaceC5061o0.a<Boolean> f19116K;

    /* renamed from: z */
    private final C5083u1 f19117z;

    static {
        Class cls = Integer.TYPE;
        f19106A = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.captureMode", cls);
        f19107B = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.flashMode", cls);
        f19108C = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.captureBundle", InterfaceC5041j0.class);
        f19109D = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.captureProcessor", InterfaceC5049l0.class);
        f19110E = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f19111F = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f19112G = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC0447m1.class);
        Class cls2 = Boolean.TYPE;
        f19113H = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.useSoftwareJpegEncoder", cls2);
        f19114I = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.flashType", cls);
        f19115J = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f19116K = InterfaceC5061o0.a.m19653a("camerax.core.imageCapture.sessionProcessorEnabled", cls2);
    }

    public C5006a1(C5083u1 c5083u1) {
        this.f19117z = c5083u1;
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: A */
    public /* synthetic */ int mo19463A(int i10) {
        return C5022e1.m19540a(this, i10);
    }

    @Override // p318z.InterfaceC5941i
    /* renamed from: B */
    public /* synthetic */ String mo1363B(String str) {
        return C5940h.m21132a(this, str);
    }

    @Override // p318z.InterfaceC5945m
    /* renamed from: D */
    public /* synthetic */ AbstractC0496y2.b mo1364D(AbstractC0496y2.b bVar) {
        return C5944l.m21134a(this, bVar);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: E */
    public /* synthetic */ int mo19464E(int i10) {
        return C5022e1.m19546g(this, i10);
    }

    /* renamed from: H */
    public InterfaceC5041j0 m19465H(InterfaceC5041j0 interfaceC5041j0) {
        return (InterfaceC5041j0) mo1365a(f19108C, interfaceC5041j0);
    }

    /* renamed from: I */
    public int m19466I() {
        return ((Integer) mo1366b(f19106A)).intValue();
    }

    /* renamed from: J */
    public InterfaceC5049l0 m19467J(InterfaceC5049l0 interfaceC5049l0) {
        return (InterfaceC5049l0) mo1365a(f19109D, interfaceC5049l0);
    }

    /* renamed from: K */
    public int m19468K(int i10) {
        return ((Integer) mo1365a(f19107B, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: L */
    public int m19469L(int i10) {
        return ((Integer) mo1365a(f19114I, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: M */
    public InterfaceC0447m1 m19470M() {
        return (InterfaceC0447m1) mo1365a(f19112G, null);
    }

    /* renamed from: N */
    public Executor m19471N(Executor executor) {
        return (Executor) mo1365a(InterfaceC5939g.f21843u, executor);
    }

    /* renamed from: O */
    public int m19472O() {
        return ((Integer) mo1366b(f19115J)).intValue();
    }

    /* renamed from: P */
    public int m19473P(int i10) {
        return ((Integer) mo1365a(f19111F, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: Q */
    public boolean m19474Q() {
        return mo1369e(f19106A);
    }

    /* renamed from: R */
    public boolean m19475R() {
        return ((Boolean) mo1365a(f19116K, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: S */
    public boolean m19476S() {
        return ((Boolean) mo1365a(f19113H, Boolean.FALSE)).booleanValue();
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: a */
    public /* synthetic */ Object mo1365a(InterfaceC5061o0.a aVar, Object obj) {
        return C5098z1.m19739g(this, aVar, obj);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: b */
    public /* synthetic */ Object mo1366b(InterfaceC5061o0.a aVar) {
        return C5098z1.m19738f(this, aVar);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: c */
    public /* synthetic */ Set mo1367c() {
        return C5098z1.m19737e(this);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: d */
    public /* synthetic */ InterfaceC5061o0.c mo1368d(InterfaceC5061o0.a aVar) {
        return C5098z1.m19735c(this, aVar);
    }

    @Override // p279w.InterfaceC5007a2, p279w.InterfaceC5061o0
    /* renamed from: e */
    public /* synthetic */ boolean mo1369e(InterfaceC5061o0.a aVar) {
        return C5098z1.m19733a(this, aVar);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: f */
    public /* synthetic */ Size mo19477f(Size size) {
        return C5022e1.m19542c(this, size);
    }

    @Override // p279w.InterfaceC5063o2
    /* renamed from: i */
    public /* synthetic */ C5045k0 mo1370i(C5045k0 c5045k0) {
        return C5059n2.m19649c(this, c5045k0);
    }

    @Override // p279w.InterfaceC5063o2
    /* renamed from: j */
    public /* synthetic */ C5045k0.b mo1371j(C5045k0.b bVar) {
        return C5059n2.m19648b(this, bVar);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: k */
    public /* synthetic */ List mo19478k(List list) {
        return C5022e1.m19543d(this, list);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: l */
    public /* synthetic */ boolean mo19479l() {
        return C5022e1.m19547h(this);
    }

    @Override // p279w.InterfaceC5063o2
    /* renamed from: m */
    public /* synthetic */ int mo1372m(int i10) {
        return C5059n2.m19652f(this, i10);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: n */
    public /* synthetic */ int mo19480n() {
        return C5022e1.m19544e(this);
    }

    @Override // p279w.InterfaceC5007a2
    /* renamed from: o */
    public InterfaceC5061o0 mo1373o() {
        return this.f19117z;
    }

    @Override // p279w.InterfaceC5018d1
    /* renamed from: q */
    public int mo1374q() {
        return ((Integer) mo1366b(InterfaceC5018d1.f19155f)).intValue();
    }

    @Override // p279w.InterfaceC5063o2
    /* renamed from: r */
    public /* synthetic */ C5015c2.d mo1375r(C5015c2.d dVar) {
        return C5059n2.m19651e(this, dVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: t */
    public /* synthetic */ Object mo1376t(InterfaceC5061o0.a aVar, InterfaceC5061o0.c cVar) {
        return C5098z1.m19740h(this, aVar, cVar);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: u */
    public /* synthetic */ Size mo19481u(Size size) {
        return C5022e1.m19541b(this, size);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: v */
    public /* synthetic */ void mo1377v(String str, InterfaceC5061o0.b bVar) {
        C5098z1.m19734b(this, str, bVar);
    }

    @Override // p279w.InterfaceC5063o2
    /* renamed from: w */
    public /* synthetic */ C5015c2 mo1378w(C5015c2 c5015c2) {
        return C5059n2.m19650d(this, c5015c2);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: x */
    public /* synthetic */ Set mo1379x(InterfaceC5061o0.a aVar) {
        return C5098z1.m19736d(this, aVar);
    }

    @Override // p279w.InterfaceC5063o2
    /* renamed from: y */
    public /* synthetic */ C0469s mo1380y(C0469s c0469s) {
        return C5059n2.m19647a(this, c0469s);
    }

    @Override // p279w.InterfaceC5026f1
    /* renamed from: z */
    public /* synthetic */ Size mo19482z(Size size) {
        return C5022e1.m19545f(this, size);
    }
}
