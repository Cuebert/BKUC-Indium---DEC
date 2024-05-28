package p310y4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p297x4.C5547a;

/* renamed from: y4.m */
/* loaded from: classes.dex */
public class C5894m {

    /* renamed from: a */
    @Deprecated
    public float f21708a;

    /* renamed from: b */
    @Deprecated
    public float f21709b;

    /* renamed from: c */
    @Deprecated
    public float f21710c;

    /* renamed from: d */
    @Deprecated
    public float f21711d;

    /* renamed from: e */
    @Deprecated
    public float f21712e;

    /* renamed from: f */
    @Deprecated
    public float f21713f;

    /* renamed from: g */
    private final List<f> f21714g = new ArrayList();

    /* renamed from: h */
    private final List<g> f21715h = new ArrayList();

    /* renamed from: i */
    private boolean f21716i;

    /* renamed from: y4.m$a */
    /* loaded from: classes.dex */
    class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f21717b;

        /* renamed from: c */
        final /* synthetic */ Matrix f21718c;

        a(List list, Matrix matrix) {
            this.f21717b = list;
            this.f21718c = matrix;
        }

        @Override // p310y4.C5894m.g
        /* renamed from: a */
        public void mo20954a(Matrix matrix, C5547a c5547a, int i10, Canvas canvas) {
            Iterator it = this.f21717b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo20954a(this.f21718c, c5547a, i10, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y4.m$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b */
        private final d f21720b;

        public b(d dVar) {
            this.f21720b = dVar;
        }

        @Override // p310y4.C5894m.g
        /* renamed from: a */
        public void mo20954a(Matrix matrix, C5547a c5547a, int i10, Canvas canvas) {
            c5547a.m20297a(canvas, matrix, new RectF(this.f21720b.m20965k(), this.f21720b.m20969o(), this.f21720b.m20966l(), this.f21720b.m20964j()), i10, this.f21720b.m20967m(), this.f21720b.m20968n());
        }
    }

    /* renamed from: y4.m$c */
    /* loaded from: classes.dex */
    static class c extends g {

        /* renamed from: b */
        private final e f21721b;

        /* renamed from: c */
        private final float f21722c;

        /* renamed from: d */
        private final float f21723d;

        public c(e eVar, float f10, float f11) {
            this.f21721b = eVar;
            this.f21722c = f10;
            this.f21723d = f11;
        }

        @Override // p310y4.C5894m.g
        /* renamed from: a */
        public void mo20954a(Matrix matrix, C5547a c5547a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f21721b.f21732c - this.f21723d, this.f21721b.f21731b - this.f21722c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f21722c, this.f21723d);
            matrix2.preRotate(m20955c());
            c5547a.m20298b(canvas, matrix2, rectF, i10);
        }

        /* renamed from: c */
        float m20955c() {
            return (float) Math.toDegrees(Math.atan((this.f21721b.f21732c - this.f21723d) / (this.f21721b.f21731b - this.f21722c)));
        }
    }

    /* renamed from: y4.m$d */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h */
        private static final RectF f21724h = new RectF();

        /* renamed from: b */
        @Deprecated
        public float f21725b;

        /* renamed from: c */
        @Deprecated
        public float f21726c;

        /* renamed from: d */
        @Deprecated
        public float f21727d;

        /* renamed from: e */
        @Deprecated
        public float f21728e;

        /* renamed from: f */
        @Deprecated
        public float f21729f;

        /* renamed from: g */
        @Deprecated
        public float f21730g;

        public d(float f10, float f11, float f12, float f13) {
            m20971q(f10);
            m20975u(f11);
            m20972r(f12);
            m20970p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m20964j() {
            return this.f21728e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m20965k() {
            return this.f21725b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m20966l() {
            return this.f21727d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m20967m() {
            return this.f21729f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m20968n() {
            return this.f21730g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m20969o() {
            return this.f21726c;
        }

        /* renamed from: p */
        private void m20970p(float f10) {
            this.f21728e = f10;
        }

        /* renamed from: q */
        private void m20971q(float f10) {
            this.f21725b = f10;
        }

        /* renamed from: r */
        private void m20972r(float f10) {
            this.f21727d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m20973s(float f10) {
            this.f21729f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m20974t(float f10) {
            this.f21730g = f10;
        }

        /* renamed from: u */
        private void m20975u(float f10) {
            this.f21726c = f10;
        }

        @Override // p310y4.C5894m.f
        /* renamed from: a */
        public void mo20976a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21733a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f21724h;
            rectF.set(m20965k(), m20969o(), m20966l(), m20964j());
            path.arcTo(rectF, m20967m(), m20968n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: y4.m$e */
    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b */
        private float f21731b;

        /* renamed from: c */
        private float f21732c;

        @Override // p310y4.C5894m.f
        /* renamed from: a */
        public void mo20976a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21733a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f21731b, this.f21732c);
            path.transform(matrix);
        }
    }

    /* renamed from: y4.m$f */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f21733a = new Matrix();

        /* renamed from: a */
        public abstract void mo20976a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y4.m$g */
    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        static final Matrix f21734a = new Matrix();

        g() {
        }

        /* renamed from: a */
        public abstract void mo20954a(Matrix matrix, C5547a c5547a, int i10, Canvas canvas);

        /* renamed from: b */
        public final void m20981b(C5547a c5547a, int i10, Canvas canvas) {
            mo20954a(f21734a, c5547a, i10, canvas);
        }
    }

    public C5894m() {
        m20952n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m20933b(float f10) {
        if (m20935g() == f10) {
            return;
        }
        float m20935g = ((f10 - m20935g()) + 360.0f) % 360.0f;
        if (m20935g > 180.0f) {
            return;
        }
        d dVar = new d(m20947i(), m20948j(), m20947i(), m20948j());
        dVar.m20973s(m20935g());
        dVar.m20974t(m20935g);
        this.f21715h.add(new b(dVar));
        m20937p(f10);
    }

    /* renamed from: c */
    private void m20934c(g gVar, float f10, float f11) {
        m20933b(f10);
        this.f21715h.add(gVar);
        m20937p(f11);
    }

    /* renamed from: g */
    private float m20935g() {
        return this.f21712e;
    }

    /* renamed from: h */
    private float m20936h() {
        return this.f21713f;
    }

    /* renamed from: p */
    private void m20937p(float f10) {
        this.f21712e = f10;
    }

    /* renamed from: q */
    private void m20938q(float f10) {
        this.f21713f = f10;
    }

    /* renamed from: r */
    private void m20939r(float f10) {
        this.f21710c = f10;
    }

    /* renamed from: s */
    private void m20940s(float f10) {
        this.f21711d = f10;
    }

    /* renamed from: t */
    private void m20941t(float f10) {
        this.f21708a = f10;
    }

    /* renamed from: u */
    private void m20942u(float f10) {
        this.f21709b = f10;
    }

    /* renamed from: a */
    public void m20943a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.m20973s(f14);
        dVar.m20974t(f15);
        this.f21714g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        m20934c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        m20939r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        m20940s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    /* renamed from: d */
    public void m20944d(Matrix matrix, Path path) {
        int size = this.f21714g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f21714g.get(i10).mo20976a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m20945e() {
        return this.f21716i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public g m20946f(Matrix matrix) {
        m20933b(m20936h());
        return new a(new ArrayList(this.f21715h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m20947i() {
        return this.f21710c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m20948j() {
        return this.f21711d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m20949k() {
        return this.f21708a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m20950l() {
        return this.f21709b;
    }

    /* renamed from: m */
    public void m20951m(float f10, float f11) {
        e eVar = new e();
        eVar.f21731b = f10;
        eVar.f21732c = f11;
        this.f21714g.add(eVar);
        c cVar = new c(eVar, m20947i(), m20948j());
        m20934c(cVar, cVar.m20955c() + 270.0f, cVar.m20955c() + 270.0f);
        m20939r(f10);
        m20940s(f11);
    }

    /* renamed from: n */
    public void m20952n(float f10, float f11) {
        m20953o(f10, f11, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m20953o(float f10, float f11, float f12, float f13) {
        m20941t(f10);
        m20942u(f11);
        m20939r(f10);
        m20940s(f11);
        m20937p(f12);
        m20938q((f12 + f13) % 360.0f);
        this.f21714g.clear();
        this.f21715h.clear();
        this.f21716i = false;
    }
}
