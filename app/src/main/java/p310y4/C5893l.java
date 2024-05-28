package p310y4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: y4.l */
/* loaded from: classes.dex */
public class C5893l {

    /* renamed from: a */
    private final C5894m[] f21690a = new C5894m[4];

    /* renamed from: b */
    private final Matrix[] f21691b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f21692c = new Matrix[4];

    /* renamed from: d */
    private final PointF f21693d = new PointF();

    /* renamed from: e */
    private final Path f21694e = new Path();

    /* renamed from: f */
    private final Path f21695f = new Path();

    /* renamed from: g */
    private final C5894m f21696g = new C5894m();

    /* renamed from: h */
    private final float[] f21697h = new float[2];

    /* renamed from: i */
    private final float[] f21698i = new float[2];

    /* renamed from: j */
    private final Path f21699j = new Path();

    /* renamed from: k */
    private final Path f21700k = new Path();

    /* renamed from: l */
    private boolean f21701l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y4.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        static final C5893l f21702a = new C5893l();
    }

    /* renamed from: y4.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo20853a(C5894m c5894m, Matrix matrix, int i10);

        /* renamed from: b */
        void mo20854b(C5894m c5894m, Matrix matrix, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y4.l$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C5892k f21703a;

        /* renamed from: b */
        public final Path f21704b;

        /* renamed from: c */
        public final RectF f21705c;

        /* renamed from: d */
        public final b f21706d;

        /* renamed from: e */
        public final float f21707e;

        c(C5892k c5892k, float f10, RectF rectF, b bVar, Path path) {
            this.f21706d = bVar;
            this.f21703a = c5892k;
            this.f21707e = f10;
            this.f21705c = rectF;
            this.f21704b = path;
        }
    }

    public C5893l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21690a[i10] = new C5894m();
            this.f21691b[i10] = new Matrix();
            this.f21692c[i10] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m20919a(int i10) {
        return (i10 + 1) * 90;
    }

    /* renamed from: b */
    private void m20920b(c cVar, int i10) {
        this.f21697h[0] = this.f21690a[i10].m20949k();
        this.f21697h[1] = this.f21690a[i10].m20950l();
        this.f21691b[i10].mapPoints(this.f21697h);
        if (i10 == 0) {
            Path path = cVar.f21704b;
            float[] fArr = this.f21697h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f21704b;
            float[] fArr2 = this.f21697h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f21690a[i10].m20944d(this.f21691b[i10], cVar.f21704b);
        b bVar = cVar.f21706d;
        if (bVar != null) {
            bVar.mo20854b(this.f21690a[i10], this.f21691b[i10], i10);
        }
    }

    /* renamed from: c */
    private void m20921c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f21697h[0] = this.f21690a[i10].m20947i();
        this.f21697h[1] = this.f21690a[i10].m20948j();
        this.f21691b[i10].mapPoints(this.f21697h);
        this.f21698i[0] = this.f21690a[i11].m20949k();
        this.f21698i[1] = this.f21690a[i11].m20950l();
        this.f21691b[i11].mapPoints(this.f21698i);
        float f10 = this.f21697h[0];
        float[] fArr = this.f21698i;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float m20925i = m20925i(cVar.f21705c, i10);
        this.f21696g.m20952n(0.0f, 0.0f);
        C5887f m20926j = m20926j(i10, cVar.f21703a);
        m20926j.mo10643d(max, m20925i, cVar.f21707e, this.f21696g);
        this.f21699j.reset();
        this.f21696g.m20944d(this.f21692c[i10], this.f21699j);
        if (this.f21701l && (m20926j.m20793a() || m20928l(this.f21699j, i10) || m20928l(this.f21699j, i11))) {
            Path path = this.f21699j;
            path.op(path, this.f21695f, Path.Op.DIFFERENCE);
            this.f21697h[0] = this.f21696g.m20949k();
            this.f21697h[1] = this.f21696g.m20950l();
            this.f21692c[i10].mapPoints(this.f21697h);
            Path path2 = this.f21694e;
            float[] fArr2 = this.f21697h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f21696g.m20944d(this.f21692c[i10], this.f21694e);
        } else {
            this.f21696g.m20944d(this.f21692c[i10], cVar.f21704b);
        }
        b bVar = cVar.f21706d;
        if (bVar != null) {
            bVar.mo20853a(this.f21696g, this.f21692c[i10], i10);
        }
    }

    /* renamed from: f */
    private void m20922f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private InterfaceC5884c m20923g(int i10, C5892k c5892k) {
        if (i10 == 1) {
            return c5892k.m20874l();
        }
        if (i10 == 2) {
            return c5892k.m20872j();
        }
        if (i10 != 3) {
            return c5892k.m20881t();
        }
        return c5892k.m20879r();
    }

    /* renamed from: h */
    private C5885d m20924h(int i10, C5892k c5892k) {
        if (i10 == 1) {
            return c5892k.m20873k();
        }
        if (i10 == 2) {
            return c5892k.m20871i();
        }
        if (i10 != 3) {
            return c5892k.m20880s();
        }
        return c5892k.m20878q();
    }

    /* renamed from: i */
    private float m20925i(RectF rectF, int i10) {
        float[] fArr = this.f21697h;
        C5894m[] c5894mArr = this.f21690a;
        fArr[0] = c5894mArr[i10].f21710c;
        fArr[1] = c5894mArr[i10].f21711d;
        this.f21691b[i10].mapPoints(fArr);
        if (i10 != 1 && i10 != 3) {
            return Math.abs(rectF.centerY() - this.f21697h[1]);
        }
        return Math.abs(rectF.centerX() - this.f21697h[0]);
    }

    /* renamed from: j */
    private C5887f m20926j(int i10, C5892k c5892k) {
        if (i10 == 1) {
            return c5892k.m20870h();
        }
        if (i10 == 2) {
            return c5892k.m20875n();
        }
        if (i10 != 3) {
            return c5892k.m20876o();
        }
        return c5892k.m20877p();
    }

    /* renamed from: k */
    public static C5893l m20927k() {
        return a.f21702a;
    }

    /* renamed from: l */
    private boolean m20928l(Path path, int i10) {
        this.f21700k.reset();
        this.f21690a[i10].m20944d(this.f21691b[i10], this.f21700k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f21700k.computeBounds(rectF, true);
        path.op(this.f21700k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: m */
    private void m20929m(c cVar, int i10) {
        m20924h(i10, cVar.f21703a).m20792b(this.f21690a[i10], 90.0f, cVar.f21707e, cVar.f21705c, m20923g(i10, cVar.f21703a));
        float m20919a = m20919a(i10);
        this.f21691b[i10].reset();
        m20922f(i10, cVar.f21705c, this.f21693d);
        Matrix matrix = this.f21691b[i10];
        PointF pointF = this.f21693d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f21691b[i10].preRotate(m20919a);
    }

    /* renamed from: n */
    private void m20930n(int i10) {
        this.f21697h[0] = this.f21690a[i10].m20947i();
        this.f21697h[1] = this.f21690a[i10].m20948j();
        this.f21691b[i10].mapPoints(this.f21697h);
        float m20919a = m20919a(i10);
        this.f21692c[i10].reset();
        Matrix matrix = this.f21692c[i10];
        float[] fArr = this.f21697h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f21692c[i10].preRotate(m20919a);
    }

    /* renamed from: d */
    public void m20931d(C5892k c5892k, float f10, RectF rectF, Path path) {
        m20932e(c5892k, f10, rectF, null, path);
    }

    /* renamed from: e */
    public void m20932e(C5892k c5892k, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f21694e.rewind();
        this.f21695f.rewind();
        this.f21695f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c5892k, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m20929m(cVar, i10);
            m20930n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            m20920b(cVar, i11);
            m20921c(cVar, i11);
        }
        path.close();
        this.f21694e.close();
        if (this.f21694e.isEmpty()) {
            return;
        }
        path.op(this.f21694e, Path.Op.UNION);
    }
}
