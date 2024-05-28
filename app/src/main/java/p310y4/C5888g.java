package p310y4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.InterfaceC0610b;
import androidx.core.util.C0649c;
import java.util.BitSet;
import p111i4.C3520b;
import p186o4.C4133a;
import p223r4.C4428a;
import p297x4.C5547a;
import p310y4.C5892k;
import p310y4.C5893l;
import p310y4.C5894m;

/* renamed from: y4.g */
/* loaded from: classes.dex */
public class C5888g extends Drawable implements InterfaceC0610b, InterfaceC5895n {

    /* renamed from: J */
    private static final String f21614J = C5888g.class.getSimpleName();

    /* renamed from: K */
    private static final Paint f21615K = new Paint(1);

    /* renamed from: A */
    private final Paint f21616A;

    /* renamed from: B */
    private final Paint f21617B;

    /* renamed from: C */
    private final C5547a f21618C;

    /* renamed from: D */
    private final C5893l.b f21619D;

    /* renamed from: E */
    private final C5893l f21620E;

    /* renamed from: F */
    private PorterDuffColorFilter f21621F;

    /* renamed from: G */
    private PorterDuffColorFilter f21622G;

    /* renamed from: H */
    private final RectF f21623H;

    /* renamed from: I */
    private boolean f21624I;

    /* renamed from: n */
    private c f21625n;

    /* renamed from: o */
    private final C5894m.g[] f21626o;

    /* renamed from: p */
    private final C5894m.g[] f21627p;

    /* renamed from: q */
    private final BitSet f21628q;

    /* renamed from: r */
    private boolean f21629r;

    /* renamed from: s */
    private final Matrix f21630s;

    /* renamed from: t */
    private final Path f21631t;

    /* renamed from: u */
    private final Path f21632u;

    /* renamed from: v */
    private final RectF f21633v;

    /* renamed from: w */
    private final RectF f21634w;

    /* renamed from: x */
    private final Region f21635x;

    /* renamed from: y */
    private final Region f21636y;

    /* renamed from: z */
    private C5892k f21637z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y4.g$a */
    /* loaded from: classes.dex */
    public class a implements C5893l.b {
        a() {
        }

        @Override // p310y4.C5893l.b
        /* renamed from: a */
        public void mo20853a(C5894m c5894m, Matrix matrix, int i10) {
            C5888g.this.f21628q.set(i10 + 4, c5894m.m20945e());
            C5888g.this.f21627p[i10] = c5894m.m20946f(matrix);
        }

        @Override // p310y4.C5893l.b
        /* renamed from: b */
        public void mo20854b(C5894m c5894m, Matrix matrix, int i10) {
            C5888g.this.f21628q.set(i10, c5894m.m20945e());
            C5888g.this.f21626o[i10] = c5894m.m20946f(matrix);
        }
    }

    /* renamed from: y4.g$b */
    /* loaded from: classes.dex */
    public class b implements C5892k.c {

        /* renamed from: a */
        final /* synthetic */ float f21639a;

        b(float f10) {
            this.f21639a = f10;
        }

        @Override // p310y4.C5892k.c
        /* renamed from: a */
        public InterfaceC5884c mo20855a(InterfaceC5884c interfaceC5884c) {
            return interfaceC5884c instanceof C5890i ? interfaceC5884c : new C5883b(this.f21639a, interfaceC5884c);
        }
    }

    /* synthetic */ C5888g(c cVar, a aVar) {
        this(cVar);
    }

    /* renamed from: D */
    private float m20794D() {
        if (m20797L()) {
            return this.f21617B.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    private boolean m20795J() {
        c cVar = this.f21625n;
        int i10 = cVar.f21657q;
        return i10 != 1 && cVar.f21658r > 0 && (i10 == 2 || m20831T());
    }

    /* renamed from: K */
    private boolean m20796K() {
        Paint.Style style = this.f21625n.f21662v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: L */
    private boolean m20797L() {
        Paint.Style style = this.f21625n.f21662v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f21617B.getStrokeWidth() > 0.0f;
    }

    /* renamed from: N */
    private void m20798N() {
        super.invalidateSelf();
    }

    /* renamed from: Q */
    private void m20799Q(Canvas canvas) {
        if (m20795J()) {
            canvas.save();
            m20801S(canvas);
            if (!this.f21624I) {
                m20815n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f21623H.width() - getBounds().width());
            int height = (int) (this.f21623H.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f21623H.width()) + (this.f21625n.f21658r * 2) + width, ((int) this.f21623H.height()) + (this.f21625n.f21658r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f10 = (getBounds().left - this.f21625n.f21658r) - width;
                float f11 = (getBounds().top - this.f21625n.f21658r) - height;
                canvas2.translate(-f10, -f11);
                m20815n(canvas2);
                canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    /* renamed from: R */
    private static int m20800R(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    /* renamed from: S */
    private void m20801S(Canvas canvas) {
        canvas.translate(m20852z(), m20820A());
    }

    /* renamed from: f */
    private PorterDuffColorFilter m20806f(Paint paint, boolean z10) {
        int color;
        int m20844l;
        if (!z10 || (m20844l = m20844l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(m20844l, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: f0 */
    private boolean m20807f0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f21625n.f21644d == null || color2 == (colorForState2 = this.f21625n.f21644d.getColorForState(iArr, (color2 = this.f21616A.getColor())))) {
            z10 = false;
        } else {
            this.f21616A.setColor(colorForState2);
            z10 = true;
        }
        if (this.f21625n.f21645e == null || color == (colorForState = this.f21625n.f21645e.getColorForState(iArr, (color = this.f21617B.getColor())))) {
            return z10;
        }
        this.f21617B.setColor(colorForState);
        return true;
    }

    /* renamed from: g */
    private void m20808g(RectF rectF, Path path) {
        m20843h(rectF, path);
        if (this.f21625n.f21650j != 1.0f) {
            this.f21630s.reset();
            Matrix matrix = this.f21630s;
            float f10 = this.f21625n.f21650j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f21630s);
        }
        path.computeBounds(this.f21623H, true);
    }

    /* renamed from: g0 */
    private boolean m20809g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f21621F;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f21622G;
        c cVar = this.f21625n;
        this.f21621F = m20813k(cVar.f21647g, cVar.f21648h, this.f21616A, true);
        c cVar2 = this.f21625n;
        this.f21622G = m20813k(cVar2.f21646f, cVar2.f21648h, this.f21617B, false);
        c cVar3 = this.f21625n;
        if (cVar3.f21661u) {
            this.f21618C.m20300d(cVar3.f21647g.getColorForState(getState(), 0));
        }
        return (C0649c.m3452a(porterDuffColorFilter, this.f21621F) && C0649c.m3452a(porterDuffColorFilter2, this.f21622G)) ? false : true;
    }

    /* renamed from: h0 */
    private void m20810h0() {
        float m20827I = m20827I();
        this.f21625n.f21658r = (int) Math.ceil(0.75f * m20827I);
        this.f21625n.f21659s = (int) Math.ceil(m20827I * 0.25f);
        m20809g0();
        m20798N();
    }

    /* renamed from: i */
    private void m20811i() {
        C5892k m20886y = m20822C().m20886y(new b(-m20794D()));
        this.f21637z = m20886y;
        this.f21620E.m20931d(m20886y, this.f21625n.f21651k, m20819v(), this.f21632u);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m20812j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = m20844l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m20813k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            return m20812j(colorStateList, mode, z10);
        }
        return m20806f(paint, z10);
    }

    /* renamed from: m */
    public static C5888g m20814m(Context context, float f10) {
        int m17129b = C4133a.m17129b(context, C3520b.f14526l, C5888g.class.getSimpleName());
        C5888g c5888g = new C5888g();
        c5888g.m20828M(context);
        c5888g.m20835X(ColorStateList.valueOf(m17129b));
        c5888g.m20834W(f10);
        return c5888g;
    }

    /* renamed from: n */
    private void m20815n(Canvas canvas) {
        if (this.f21628q.cardinality() > 0) {
            Log.w(f21614J, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f21625n.f21659s != 0) {
            canvas.drawPath(this.f21631t, this.f21618C.m20299c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21626o[i10].m20981b(this.f21618C, this.f21625n.f21658r, canvas);
            this.f21627p[i10].m20981b(this.f21618C, this.f21625n.f21658r, canvas);
        }
        if (this.f21624I) {
            int m20852z = m20852z();
            int m20820A = m20820A();
            canvas.translate(-m20852z, -m20820A);
            canvas.drawPath(this.f21631t, f21615K);
            canvas.translate(m20852z, m20820A);
        }
    }

    /* renamed from: o */
    private void m20816o(Canvas canvas) {
        m20817q(canvas, this.f21616A, this.f21631t, this.f21625n.f21641a, m20848u());
    }

    /* renamed from: q */
    private void m20817q(Canvas canvas, Paint paint, Path path, C5892k c5892k, RectF rectF) {
        if (c5892k.m20882u(rectF)) {
            float mo20790a = c5892k.m20881t().mo20790a(rectF) * this.f21625n.f21651k;
            canvas.drawRoundRect(rectF, mo20790a, mo20790a, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: r */
    private void m20818r(Canvas canvas) {
        m20817q(canvas, this.f21617B, this.f21632u, this.f21637z, m20819v());
    }

    /* renamed from: v */
    private RectF m20819v() {
        this.f21634w.set(m20848u());
        float m20794D = m20794D();
        this.f21634w.inset(m20794D, m20794D);
        return this.f21634w;
    }

    /* renamed from: A */
    public int m20820A() {
        c cVar = this.f21625n;
        return (int) (cVar.f21659s * Math.cos(Math.toRadians(cVar.f21660t)));
    }

    /* renamed from: B */
    public int m20821B() {
        return this.f21625n.f21658r;
    }

    /* renamed from: C */
    public C5892k m20822C() {
        return this.f21625n.f21641a;
    }

    /* renamed from: E */
    public ColorStateList m20823E() {
        return this.f21625n.f21647g;
    }

    /* renamed from: F */
    public float m20824F() {
        return this.f21625n.f21641a.m20879r().mo20790a(m20848u());
    }

    /* renamed from: G */
    public float m20825G() {
        return this.f21625n.f21641a.m20881t().mo20790a(m20848u());
    }

    /* renamed from: H */
    public float m20826H() {
        return this.f21625n.f21656p;
    }

    /* renamed from: I */
    public float m20827I() {
        return m20849w() + m20826H();
    }

    /* renamed from: M */
    public void m20828M(Context context) {
        this.f21625n.f21642b = new C4428a(context);
        m20810h0();
    }

    /* renamed from: O */
    public boolean m20829O() {
        C4428a c4428a = this.f21625n.f21642b;
        return c4428a != null && c4428a.m18233d();
    }

    /* renamed from: P */
    public boolean m20830P() {
        return this.f21625n.f21641a.m20882u(m20848u());
    }

    /* renamed from: T */
    public boolean m20831T() {
        return (m20830P() || this.f21631t.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    /* renamed from: U */
    public void m20832U(float f10) {
        setShapeAppearanceModel(this.f21625n.f21641a.m20884w(f10));
    }

    /* renamed from: V */
    public void m20833V(InterfaceC5884c interfaceC5884c) {
        setShapeAppearanceModel(this.f21625n.f21641a.m20885x(interfaceC5884c));
    }

    /* renamed from: W */
    public void m20834W(float f10) {
        c cVar = this.f21625n;
        if (cVar.f21655o != f10) {
            cVar.f21655o = f10;
            m20810h0();
        }
    }

    /* renamed from: X */
    public void m20835X(ColorStateList colorStateList) {
        c cVar = this.f21625n;
        if (cVar.f21644d != colorStateList) {
            cVar.f21644d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void m20836Y(float f10) {
        c cVar = this.f21625n;
        if (cVar.f21651k != f10) {
            cVar.f21651k = f10;
            this.f21629r = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void m20837Z(int i10, int i11, int i12, int i13) {
        c cVar = this.f21625n;
        if (cVar.f21649i == null) {
            cVar.f21649i = new Rect();
        }
        this.f21625n.f21649i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m20838a0(float f10) {
        c cVar = this.f21625n;
        if (cVar.f21654n != f10) {
            cVar.f21654n = f10;
            m20810h0();
        }
    }

    /* renamed from: b0 */
    public void m20839b0(float f10, int i10) {
        m20842e0(f10);
        m20841d0(ColorStateList.valueOf(i10));
    }

    /* renamed from: c0 */
    public void m20840c0(float f10, ColorStateList colorStateList) {
        m20842e0(f10);
        m20841d0(colorStateList);
    }

    /* renamed from: d0 */
    public void m20841d0(ColorStateList colorStateList) {
        c cVar = this.f21625n;
        if (cVar.f21645e != colorStateList) {
            cVar.f21645e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f21616A.setColorFilter(this.f21621F);
        int alpha = this.f21616A.getAlpha();
        this.f21616A.setAlpha(m20800R(alpha, this.f21625n.f21653m));
        this.f21617B.setColorFilter(this.f21622G);
        this.f21617B.setStrokeWidth(this.f21625n.f21652l);
        int alpha2 = this.f21617B.getAlpha();
        this.f21617B.setAlpha(m20800R(alpha2, this.f21625n.f21653m));
        if (this.f21629r) {
            m20811i();
            m20808g(m20848u(), this.f21631t);
            this.f21629r = false;
        }
        m20799Q(canvas);
        if (m20796K()) {
            m20816o(canvas);
        }
        if (m20797L()) {
            m20818r(canvas);
        }
        this.f21616A.setAlpha(alpha);
        this.f21617B.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m20842e0(float f10) {
        this.f21625n.f21652l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21625n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f21625n.f21657q == 2) {
            return;
        }
        if (m20830P()) {
            outline.setRoundRect(getBounds(), m20824F() * this.f21625n.f21651k);
            return;
        }
        m20808g(m20848u(), this.f21631t);
        if (this.f21631t.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f21631t);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f21625n.f21649i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f21635x.set(getBounds());
        m20808g(m20848u(), this.f21631t);
        this.f21636y.setPath(this.f21631t, this.f21635x);
        this.f21635x.op(this.f21636y, Region.Op.DIFFERENCE);
        return this.f21635x;
    }

    /* renamed from: h */
    public final void m20843h(RectF rectF, Path path) {
        C5893l c5893l = this.f21620E;
        c cVar = this.f21625n;
        c5893l.m20932e(cVar.f21641a, cVar.f21651k, rectF, this.f21619D, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f21629r = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f21625n.f21647g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f21625n.f21646f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f21625n.f21645e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f21625n.f21644d) != null && colorStateList4.isStateful())));
    }

    /* renamed from: l */
    public int m20844l(int i10) {
        float m20827I = m20827I() + m20851y();
        C4428a c4428a = this.f21625n.f21642b;
        return c4428a != null ? c4428a.m18232c(i10, m20827I) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f21625n = new c(this.f21625n);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f21629r = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C2485h.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = m20807f0(iArr) || m20809g0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* renamed from: p */
    public void m20845p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m20817q(canvas, paint, path, this.f21625n.f21641a, rectF);
    }

    /* renamed from: s */
    public float m20846s() {
        return this.f21625n.f21641a.m20872j().mo20790a(m20848u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f21625n;
        if (cVar.f21653m != i10) {
            cVar.f21653m = i10;
            m20798N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21625n.f21643c = colorFilter;
        m20798N();
    }

    @Override // p310y4.InterfaceC5895n
    public void setShapeAppearanceModel(C5892k c5892k) {
        this.f21625n.f21641a = c5892k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21625n.f21647g = colorStateList;
        m20809g0();
        m20798N();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f21625n;
        if (cVar.f21648h != mode) {
            cVar.f21648h = mode;
            m20809g0();
            m20798N();
        }
    }

    /* renamed from: t */
    public float m20847t() {
        return this.f21625n.f21641a.m20874l().mo20790a(m20848u());
    }

    /* renamed from: u */
    public RectF m20848u() {
        this.f21633v.set(getBounds());
        return this.f21633v;
    }

    /* renamed from: w */
    public float m20849w() {
        return this.f21625n.f21655o;
    }

    /* renamed from: x */
    public ColorStateList m20850x() {
        return this.f21625n.f21644d;
    }

    /* renamed from: y */
    public float m20851y() {
        return this.f21625n.f21654n;
    }

    /* renamed from: z */
    public int m20852z() {
        c cVar = this.f21625n;
        return (int) (cVar.f21659s * Math.sin(Math.toRadians(cVar.f21660t)));
    }

    public C5888g() {
        this(new C5892k());
    }

    public C5888g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C5892k.m20866e(context, attributeSet, i10, i11).m20906m());
    }

    public C5888g(C5892k c5892k) {
        this(new c(c5892k, null));
    }

    private C5888g(c cVar) {
        this.f21626o = new C5894m.g[4];
        this.f21627p = new C5894m.g[4];
        this.f21628q = new BitSet(8);
        this.f21630s = new Matrix();
        this.f21631t = new Path();
        this.f21632u = new Path();
        this.f21633v = new RectF();
        this.f21634w = new RectF();
        this.f21635x = new Region();
        this.f21636y = new Region();
        Paint paint = new Paint(1);
        this.f21616A = paint;
        Paint paint2 = new Paint(1);
        this.f21617B = paint2;
        this.f21618C = new C5547a();
        this.f21620E = Looper.getMainLooper().getThread() == Thread.currentThread() ? C5893l.m20927k() : new C5893l();
        this.f21623H = new RectF();
        this.f21624I = true;
        this.f21625n = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f21615K;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m20809g0();
        m20807f0(getState());
        this.f21619D = new a();
    }

    /* renamed from: y4.g$c */
    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public C5892k f21641a;

        /* renamed from: b */
        public C4428a f21642b;

        /* renamed from: c */
        public ColorFilter f21643c;

        /* renamed from: d */
        public ColorStateList f21644d;

        /* renamed from: e */
        public ColorStateList f21645e;

        /* renamed from: f */
        public ColorStateList f21646f;

        /* renamed from: g */
        public ColorStateList f21647g;

        /* renamed from: h */
        public PorterDuff.Mode f21648h;

        /* renamed from: i */
        public Rect f21649i;

        /* renamed from: j */
        public float f21650j;

        /* renamed from: k */
        public float f21651k;

        /* renamed from: l */
        public float f21652l;

        /* renamed from: m */
        public int f21653m;

        /* renamed from: n */
        public float f21654n;

        /* renamed from: o */
        public float f21655o;

        /* renamed from: p */
        public float f21656p;

        /* renamed from: q */
        public int f21657q;

        /* renamed from: r */
        public int f21658r;

        /* renamed from: s */
        public int f21659s;

        /* renamed from: t */
        public int f21660t;

        /* renamed from: u */
        public boolean f21661u;

        /* renamed from: v */
        public Paint.Style f21662v;

        public c(C5892k c5892k, C4428a c4428a) {
            this.f21644d = null;
            this.f21645e = null;
            this.f21646f = null;
            this.f21647g = null;
            this.f21648h = PorterDuff.Mode.SRC_IN;
            this.f21649i = null;
            this.f21650j = 1.0f;
            this.f21651k = 1.0f;
            this.f21653m = 255;
            this.f21654n = 0.0f;
            this.f21655o = 0.0f;
            this.f21656p = 0.0f;
            this.f21657q = 0;
            this.f21658r = 0;
            this.f21659s = 0;
            this.f21660t = 0;
            this.f21661u = false;
            this.f21662v = Paint.Style.FILL_AND_STROKE;
            this.f21641a = c5892k;
            this.f21642b = c4428a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C5888g c5888g = new C5888g(this, null);
            c5888g.f21629r = true;
            return c5888g;
        }

        public c(c cVar) {
            this.f21644d = null;
            this.f21645e = null;
            this.f21646f = null;
            this.f21647g = null;
            this.f21648h = PorterDuff.Mode.SRC_IN;
            this.f21649i = null;
            this.f21650j = 1.0f;
            this.f21651k = 1.0f;
            this.f21653m = 255;
            this.f21654n = 0.0f;
            this.f21655o = 0.0f;
            this.f21656p = 0.0f;
            this.f21657q = 0;
            this.f21658r = 0;
            this.f21659s = 0;
            this.f21660t = 0;
            this.f21661u = false;
            this.f21662v = Paint.Style.FILL_AND_STROKE;
            this.f21641a = cVar.f21641a;
            this.f21642b = cVar.f21642b;
            this.f21652l = cVar.f21652l;
            this.f21643c = cVar.f21643c;
            this.f21644d = cVar.f21644d;
            this.f21645e = cVar.f21645e;
            this.f21648h = cVar.f21648h;
            this.f21647g = cVar.f21647g;
            this.f21653m = cVar.f21653m;
            this.f21650j = cVar.f21650j;
            this.f21659s = cVar.f21659s;
            this.f21657q = cVar.f21657q;
            this.f21661u = cVar.f21661u;
            this.f21651k = cVar.f21651k;
            this.f21654n = cVar.f21654n;
            this.f21655o = cVar.f21655o;
            this.f21656p = cVar.f21656p;
            this.f21658r = cVar.f21658r;
            this.f21660t = cVar.f21660t;
            this.f21646f = cVar.f21646f;
            this.f21662v = cVar.f21662v;
            if (cVar.f21649i != null) {
                this.f21649i = new Rect(cVar.f21649i);
            }
        }
    }
}
