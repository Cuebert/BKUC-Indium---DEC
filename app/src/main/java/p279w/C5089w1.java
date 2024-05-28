package p279w;

import android.util.Size;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0469s;
import androidx.camera.core.C0499z1;
import java.util.List;
import java.util.Set;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.InterfaceC5061o0;
import p318z.C5940h;
import p318z.C5944l;
import p318z.InterfaceC5943k;

/* renamed from: w.w1 */
/* loaded from: classes.dex */
public final class C5089w1 implements InterfaceC5063o2<C0499z1>, InterfaceC5026f1, InterfaceC5943k {

    /* renamed from: A */
    public static final InterfaceC5061o0.a<InterfaceC5010b1> f19343A = InterfaceC5061o0.a.m19653a("camerax.core.preview.imageInfoProcessor", InterfaceC5010b1.class);

    /* renamed from: B */
    public static final InterfaceC5061o0.a<InterfaceC5049l0> f19344B = InterfaceC5061o0.a.m19653a("camerax.core.preview.captureProcessor", InterfaceC5049l0.class);

    /* renamed from: C */
    public static final InterfaceC5061o0.a<Boolean> f19345C = InterfaceC5061o0.a.m19653a("camerax.core.preview.isRgba8888SurfaceRequired", Boolean.class);

    /* renamed from: z */
    private final C5083u1 f19346z;

    public C5089w1(C5083u1 c5083u1) {
        this.f19346z = c5083u1;
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
    public InterfaceC5049l0 m19718H(InterfaceC5049l0 interfaceC5049l0) {
        return (InterfaceC5049l0) mo1365a(f19344B, interfaceC5049l0);
    }

    /* renamed from: I */
    public InterfaceC5010b1 m19719I(InterfaceC5010b1 interfaceC5010b1) {
        return (InterfaceC5010b1) mo1365a(f19343A, interfaceC5010b1);
    }

    /* renamed from: J */
    public boolean m19720J(boolean z10) {
        return ((Boolean) mo1365a(f19345C, Boolean.valueOf(z10))).booleanValue();
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
        return this.f19346z;
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
