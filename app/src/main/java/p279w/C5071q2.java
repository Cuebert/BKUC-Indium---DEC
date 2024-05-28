package p279w;

import android.util.Size;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0398d3;
import androidx.camera.core.C0469s;
import java.util.List;
import java.util.Set;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.InterfaceC5061o0;
import p318z.C5940h;
import p318z.C5944l;
import p318z.InterfaceC5943k;

/* renamed from: w.q2 */
/* loaded from: classes.dex */
public final class C5071q2 implements InterfaceC5063o2<C0398d3>, InterfaceC5026f1, InterfaceC5943k {

    /* renamed from: A */
    public static final InterfaceC5061o0.a<Integer> f19295A;

    /* renamed from: B */
    public static final InterfaceC5061o0.a<Integer> f19296B;

    /* renamed from: C */
    public static final InterfaceC5061o0.a<Integer> f19297C;

    /* renamed from: D */
    public static final InterfaceC5061o0.a<Integer> f19298D;

    /* renamed from: E */
    public static final InterfaceC5061o0.a<Integer> f19299E;

    /* renamed from: F */
    public static final InterfaceC5061o0.a<Integer> f19300F;

    /* renamed from: G */
    public static final InterfaceC5061o0.a<Integer> f19301G;

    /* renamed from: z */
    private final C5083u1 f19302z;

    static {
        Class cls = Integer.TYPE;
        f19295A = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.recordingFrameRate", cls);
        f19296B = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.bitRate", cls);
        f19297C = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.intraFrameInterval", cls);
        f19298D = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.audioBitRate", cls);
        f19299E = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.audioSampleRate", cls);
        f19300F = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.audioChannelCount", cls);
        f19301G = InterfaceC5061o0.a.m19653a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public C5071q2(C5083u1 c5083u1) {
        this.f19302z = c5083u1;
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
    public int m19663H() {
        return ((Integer) mo1366b(f19298D)).intValue();
    }

    /* renamed from: I */
    public int m19664I() {
        return ((Integer) mo1366b(f19300F)).intValue();
    }

    /* renamed from: J */
    public int m19665J() {
        return ((Integer) mo1366b(f19301G)).intValue();
    }

    /* renamed from: K */
    public int m19666K() {
        return ((Integer) mo1366b(f19299E)).intValue();
    }

    /* renamed from: L */
    public int m19667L() {
        return ((Integer) mo1366b(f19296B)).intValue();
    }

    /* renamed from: M */
    public int m19668M() {
        return ((Integer) mo1366b(f19297C)).intValue();
    }

    /* renamed from: N */
    public int m19669N() {
        return ((Integer) mo1366b(f19295A)).intValue();
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
        return this.f19302z;
    }

    @Override // p279w.InterfaceC5018d1
    /* renamed from: q */
    public int mo1374q() {
        return 34;
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
