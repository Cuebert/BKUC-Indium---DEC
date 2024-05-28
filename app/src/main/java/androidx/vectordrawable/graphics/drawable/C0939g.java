package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.C0592d;
import androidx.core.content.res.C0596h;
import androidx.core.content.res.C0599k;
import androidx.core.graphics.C0603c;
import androidx.core.graphics.drawable.C0609a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p093h0.C3356a;

/* renamed from: androidx.vectordrawable.graphics.drawable.g */
/* loaded from: classes.dex */
public class C0939g extends AbstractC0938f {

    /* renamed from: x */
    static final PorterDuff.Mode f4952x = PorterDuff.Mode.SRC_IN;

    /* renamed from: o */
    private h f4953o;

    /* renamed from: p */
    private PorterDuffColorFilter f4954p;

    /* renamed from: q */
    private ColorFilter f4955q;

    /* renamed from: r */
    private boolean f4956r;

    /* renamed from: s */
    private boolean f4957s;

    /* renamed from: t */
    private Drawable.ConstantState f4958t;

    /* renamed from: u */
    private final float[] f4959u;

    /* renamed from: v */
    private final Matrix f4960v;

    /* renamed from: w */
    private final Rect f4961w;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$b */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        /* renamed from: f */
        private void m6002f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4988b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4987a = C0603c.m3190d(string2);
            }
            this.f4989c = C0599k.m3158g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0939g.f
        /* renamed from: c */
        public boolean mo6003c() {
            return true;
        }

        /* renamed from: e */
        public void m6004e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0599k.m3161j(xmlPullParser, "pathData")) {
                TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4927d);
                m6002f(m3162k, xmlPullParser);
                m3162k.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        /* renamed from: a */
        public boolean mo6008a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo6009b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$h */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5008a;

        /* renamed from: b */
        g f5009b;

        /* renamed from: c */
        ColorStateList f5010c;

        /* renamed from: d */
        PorterDuff.Mode f5011d;

        /* renamed from: e */
        boolean f5012e;

        /* renamed from: f */
        Bitmap f5013f;

        /* renamed from: g */
        ColorStateList f5014g;

        /* renamed from: h */
        PorterDuff.Mode f5015h;

        /* renamed from: i */
        int f5016i;

        /* renamed from: j */
        boolean f5017j;

        /* renamed from: k */
        boolean f5018k;

        /* renamed from: l */
        Paint f5019l;

        public h(h hVar) {
            this.f5010c = null;
            this.f5011d = C0939g.f4952x;
            if (hVar != null) {
                this.f5008a = hVar.f5008a;
                g gVar = new g(hVar.f5009b);
                this.f5009b = gVar;
                if (hVar.f5009b.f4996e != null) {
                    gVar.f4996e = new Paint(hVar.f5009b.f4996e);
                }
                if (hVar.f5009b.f4995d != null) {
                    this.f5009b.f4995d = new Paint(hVar.f5009b.f4995d);
                }
                this.f5010c = hVar.f5010c;
                this.f5011d = hVar.f5011d;
                this.f5012e = hVar.f5012e;
            }
        }

        /* renamed from: a */
        public boolean m6022a(int i10, int i11) {
            return i10 == this.f5013f.getWidth() && i11 == this.f5013f.getHeight();
        }

        /* renamed from: b */
        public boolean m6023b() {
            return !this.f5018k && this.f5014g == this.f5010c && this.f5015h == this.f5011d && this.f5017j == this.f5012e && this.f5016i == this.f5009b.getRootAlpha();
        }

        /* renamed from: c */
        public void m6024c(int i10, int i11) {
            if (this.f5013f == null || !m6022a(i10, i11)) {
                this.f5013f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f5018k = true;
            }
        }

        /* renamed from: d */
        public void m6025d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5013f, (Rect) null, rect, m6026e(colorFilter));
        }

        /* renamed from: e */
        public Paint m6026e(ColorFilter colorFilter) {
            if (!m6027f() && colorFilter == null) {
                return null;
            }
            if (this.f5019l == null) {
                Paint paint = new Paint();
                this.f5019l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5019l.setAlpha(this.f5009b.getRootAlpha());
            this.f5019l.setColorFilter(colorFilter);
            return this.f5019l;
        }

        /* renamed from: f */
        public boolean m6027f() {
            return this.f5009b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m6028g() {
            return this.f5009b.m6020f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5008a;
        }

        /* renamed from: h */
        public boolean m6029h(int[] iArr) {
            boolean m6021g = this.f5009b.m6021g(iArr);
            this.f5018k |= m6021g;
            return m6021g;
        }

        /* renamed from: i */
        public void m6030i() {
            this.f5014g = this.f5010c;
            this.f5015h = this.f5011d;
            this.f5016i = this.f5009b.getRootAlpha();
            this.f5017j = this.f5012e;
            this.f5018k = false;
        }

        /* renamed from: j */
        public void m6031j(int i10, int i11) {
            this.f5013f.eraseColor(0);
            this.f5009b.m6019b(new Canvas(this.f5013f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0939g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0939g(this);
        }

        public h() {
            this.f5010c = null;
            this.f5011d = C0939g.f4952x;
            this.f5009b = new g();
        }
    }

    C0939g() {
        this.f4957s = true;
        this.f4959u = new float[9];
        this.f4960v = new Matrix();
        this.f4961w = new Rect();
        this.f4953o = new h();
    }

    /* renamed from: a */
    static int m5992a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    /* renamed from: b */
    public static C0939g m5993b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0939g c0939g = new C0939g();
            c0939g.f4951n = C0596h.m3129e(resources, i10, theme);
            c0939g.f4958t = new i(c0939g.f4951n.getConstantState());
            return c0939g;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m5994c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    /* renamed from: c */
    public static C0939g m5994c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0939g c0939g = new C0939g();
        c0939g.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0939g;
    }

    /* renamed from: e */
    private void m5995e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f4953o;
        g gVar = hVar.f5009b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4999h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m6010g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4975b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5007p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f5008a = cVar.f4990d | hVar.f5008a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m6004e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4975b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f5007p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f5008a = bVar.f4990d | hVar.f5008a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m6013c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4975b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5007p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f5008a = dVar2.f4984k | hVar.f5008a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m5996f() {
        return isAutoMirrored() && C0609a.m3251f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m5997g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 != 9) {
            switch (i10) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_ATOP;
    }

    /* renamed from: i */
    private void m5998i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f4953o;
        g gVar = hVar.f5009b;
        hVar.f5011d = m5997g(C0599k.m3158g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m3154c = C0599k.m3154c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m3154c != null) {
            hVar.f5010c = m3154c;
        }
        hVar.f5012e = C0599k.m3152a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5012e);
        gVar.f5002k = C0599k.m3157f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5002k);
        float m3157f = C0599k.m3157f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5003l);
        gVar.f5003l = m3157f;
        if (gVar.f5002k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (m3157f > 0.0f) {
            gVar.f5000i = typedArray.getDimension(3, gVar.f5000i);
            float dimension = typedArray.getDimension(2, gVar.f5001j);
            gVar.f5001j = dimension;
            if (gVar.f5000i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                gVar.setAlpha(C0599k.m3157f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5005n = string;
                    gVar.f5007p.put(string, gVar);
                    return;
                }
                return;
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4951n;
        if (drawable == null) {
            return false;
        }
        C0609a.m3247b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m5999d(String str) {
        return this.f4953o.f5009b.f5007p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4961w);
        if (this.f4961w.width() <= 0 || this.f4961w.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4955q;
        if (colorFilter == null) {
            colorFilter = this.f4954p;
        }
        canvas.getMatrix(this.f4960v);
        this.f4960v.getValues(this.f4959u);
        float abs = Math.abs(this.f4959u[0]);
        float abs2 = Math.abs(this.f4959u[4]);
        float abs3 = Math.abs(this.f4959u[1]);
        float abs4 = Math.abs(this.f4959u[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f4961w.width() * abs));
        int min2 = Math.min(2048, (int) (this.f4961w.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f4961w;
        canvas.translate(rect.left, rect.top);
        if (m5996f()) {
            canvas.translate(this.f4961w.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f4961w.offsetTo(0, 0);
        this.f4953o.m6024c(min, min2);
        if (!this.f4957s) {
            this.f4953o.m6031j(min, min2);
        } else if (!this.f4953o.m6023b()) {
            this.f4953o.m6031j(min, min2);
            this.f4953o.m6030i();
        }
        this.f4953o.m6025d(canvas, colorFilter, this.f4961w);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3249d(drawable);
        }
        return this.f4953o.f5009b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4953o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3250e(drawable);
        }
        return this.f4955q;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4951n != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4951n.getConstantState());
        }
        this.f4953o.f5008a = getChangingConfigurations();
        return this.f4953o;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4953o.f5009b.f5001j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4953o.f5009b.f5000i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6000h(boolean z10) {
        this.f4957s = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3253h(drawable);
        }
        return this.f4953o.f5012e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f4953o) != null && (hVar.m6028g() || ((colorStateList = this.f4953o.f5010c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    PorterDuffColorFilter m6001j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4956r && super.mutate() == this) {
            this.f4953o = new h(this.f4953o);
            this.f4956r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f4953o;
        ColorStateList colorStateList = hVar.f5010c;
        if (colorStateList != null && (mode = hVar.f5011d) != null) {
            this.f4954p = m6001j(this.f4954p, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.m6028g() || !hVar.m6029h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4953o.f5009b.getRootAlpha() != i10) {
            this.f4953o.f5009b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3255j(drawable, z10);
        } else {
            this.f4953o.f5012e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3259n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3260o(drawable, colorStateList);
            return;
        }
        h hVar = this.f4953o;
        if (hVar.f5010c != colorStateList) {
            hVar.f5010c = colorStateList;
            this.f4954p = m6001j(this.f4954p, colorStateList, hVar.f5011d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3261p(drawable, mode);
            return;
        }
        h hVar = this.f4953o;
        if (hVar.f5011d != mode) {
            hVar.f5011d = mode;
            this.f4954p = m6001j(this.f4954p, hVar.f5010c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.g$i */
    /* loaded from: classes.dex */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5020a;

        public i(Drawable.ConstantState constantState) {
            this.f5020a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5020a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5020a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0939g c0939g = new C0939g();
            c0939g.f4951n = (VectorDrawable) this.f5020a.newDrawable();
            return c0939g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0939g c0939g = new C0939g();
            c0939g.f4951n = (VectorDrawable) this.f5020a.newDrawable(resources);
            return c0939g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0939g c0939g = new C0939g();
            c0939g.f4951n = (VectorDrawable) this.f5020a.newDrawable(resources, theme);
            return c0939g;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4955q = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$f */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        protected C0603c.b[] f4987a;

        /* renamed from: b */
        String f4988b;

        /* renamed from: c */
        int f4989c;

        /* renamed from: d */
        int f4990d;

        public f() {
            super();
            this.f4987a = null;
            this.f4989c = 0;
        }

        /* renamed from: c */
        public boolean mo6003c() {
            return false;
        }

        /* renamed from: d */
        public void m6014d(Path path) {
            path.reset();
            C0603c.b[] bVarArr = this.f4987a;
            if (bVarArr != null) {
                C0603c.b.m3200e(bVarArr, path);
            }
        }

        public C0603c.b[] getPathData() {
            return this.f4987a;
        }

        public String getPathName() {
            return this.f4988b;
        }

        public void setPathData(C0603c.b[] bVarArr) {
            if (!C0603c.m3188b(this.f4987a, bVarArr)) {
                this.f4987a = C0603c.m3192f(bVarArr);
            } else {
                C0603c.m3196j(this.f4987a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4987a = null;
            this.f4989c = 0;
            this.f4988b = fVar.f4988b;
            this.f4990d = fVar.f4990d;
            this.f4987a = C0603c.m3192f(fVar.f4987a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3252g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f4953o;
        hVar.f5009b = new g();
        TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4924a);
        m5998i(m3162k, xmlPullParser, theme);
        m3162k.recycle();
        hVar.f5008a = getChangingConfigurations();
        hVar.f5018k = true;
        m5995e(resources, xmlPullParser, attributeSet, theme);
        this.f4954p = m6001j(this.f4954p, hVar.f5010c, hVar.f5011d);
    }

    C0939g(h hVar) {
        this.f4957s = true;
        this.f4959u = new float[9];
        this.f4960v = new Matrix();
        this.f4961w = new Rect();
        this.f4953o = hVar;
        this.f4954p = m6001j(this.f4954p, hVar.f5010c, hVar.f5011d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private int[] f4962e;

        /* renamed from: f */
        C0592d f4963f;

        /* renamed from: g */
        float f4964g;

        /* renamed from: h */
        C0592d f4965h;

        /* renamed from: i */
        float f4966i;

        /* renamed from: j */
        float f4967j;

        /* renamed from: k */
        float f4968k;

        /* renamed from: l */
        float f4969l;

        /* renamed from: m */
        float f4970m;

        /* renamed from: n */
        Paint.Cap f4971n;

        /* renamed from: o */
        Paint.Join f4972o;

        /* renamed from: p */
        float f4973p;

        c() {
            this.f4964g = 0.0f;
            this.f4966i = 1.0f;
            this.f4967j = 1.0f;
            this.f4968k = 0.0f;
            this.f4969l = 1.0f;
            this.f4970m = 0.0f;
            this.f4971n = Paint.Cap.BUTT;
            this.f4972o = Paint.Join.MITER;
            this.f4973p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m6005e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* renamed from: f */
        private Paint.Join m6006f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* renamed from: h */
        private void m6007h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4962e = null;
            if (C0599k.m3161j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4988b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4987a = C0603c.m3190d(string2);
                }
                this.f4965h = C0599k.m3156e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4967j = C0599k.m3157f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4967j);
                this.f4971n = m6005e(C0599k.m3158g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4971n);
                this.f4972o = m6006f(C0599k.m3158g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4972o);
                this.f4973p = C0599k.m3157f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4973p);
                this.f4963f = C0599k.m3156e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4966i = C0599k.m3157f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4966i);
                this.f4964g = C0599k.m3157f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4964g);
                this.f4969l = C0599k.m3157f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4969l);
                this.f4970m = C0599k.m3157f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4970m);
                this.f4968k = C0599k.m3157f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4968k);
                this.f4989c = C0599k.m3158g(typedArray, xmlPullParser, "fillType", 13, this.f4989c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0939g.e
        /* renamed from: a */
        public boolean mo6008a() {
            return this.f4965h.m3094i() || this.f4963f.m3094i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0939g.e
        /* renamed from: b */
        public boolean mo6009b(int[] iArr) {
            return this.f4963f.m3095j(iArr) | this.f4965h.m3095j(iArr);
        }

        /* renamed from: g */
        public void m6010g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4926c);
            m6007h(m3162k, xmlPullParser, theme);
            m3162k.recycle();
        }

        float getFillAlpha() {
            return this.f4967j;
        }

        int getFillColor() {
            return this.f4965h.m3091e();
        }

        float getStrokeAlpha() {
            return this.f4966i;
        }

        int getStrokeColor() {
            return this.f4963f.m3091e();
        }

        float getStrokeWidth() {
            return this.f4964g;
        }

        float getTrimPathEnd() {
            return this.f4969l;
        }

        float getTrimPathOffset() {
            return this.f4970m;
        }

        float getTrimPathStart() {
            return this.f4968k;
        }

        void setFillAlpha(float f10) {
            this.f4967j = f10;
        }

        void setFillColor(int i10) {
            this.f4965h.m3096k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f4966i = f10;
        }

        void setStrokeColor(int i10) {
            this.f4963f.m3096k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f4964g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f4969l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f4970m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f4968k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f4964g = 0.0f;
            this.f4966i = 1.0f;
            this.f4967j = 1.0f;
            this.f4968k = 0.0f;
            this.f4969l = 1.0f;
            this.f4970m = 0.0f;
            this.f4971n = Paint.Cap.BUTT;
            this.f4972o = Paint.Join.MITER;
            this.f4973p = 4.0f;
            this.f4962e = cVar.f4962e;
            this.f4963f = cVar.f4963f;
            this.f4964g = cVar.f4964g;
            this.f4966i = cVar.f4966i;
            this.f4965h = cVar.f4965h;
            this.f4989c = cVar.f4989c;
            this.f4967j = cVar.f4967j;
            this.f4968k = cVar.f4968k;
            this.f4969l = cVar.f4969l;
            this.f4970m = cVar.f4970m;
            this.f4971n = cVar.f4971n;
            this.f4972o = cVar.f4972o;
            this.f4973p = cVar.f4973p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q */
        private static final Matrix f4991q = new Matrix();

        /* renamed from: a */
        private final Path f4992a;

        /* renamed from: b */
        private final Path f4993b;

        /* renamed from: c */
        private final Matrix f4994c;

        /* renamed from: d */
        Paint f4995d;

        /* renamed from: e */
        Paint f4996e;

        /* renamed from: f */
        private PathMeasure f4997f;

        /* renamed from: g */
        private int f4998g;

        /* renamed from: h */
        final d f4999h;

        /* renamed from: i */
        float f5000i;

        /* renamed from: j */
        float f5001j;

        /* renamed from: k */
        float f5002k;

        /* renamed from: l */
        float f5003l;

        /* renamed from: m */
        int f5004m;

        /* renamed from: n */
        String f5005n;

        /* renamed from: o */
        Boolean f5006o;

        /* renamed from: p */
        final C3356a<String, Object> f5007p;

        public g() {
            this.f4994c = new Matrix();
            this.f5000i = 0.0f;
            this.f5001j = 0.0f;
            this.f5002k = 0.0f;
            this.f5003l = 0.0f;
            this.f5004m = 255;
            this.f5005n = null;
            this.f5006o = null;
            this.f5007p = new C3356a<>();
            this.f4999h = new d();
            this.f4992a = new Path();
            this.f4993b = new Path();
        }

        /* renamed from: a */
        private static float m6015a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* renamed from: c */
        private void m6016c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f4974a.set(matrix);
            dVar.f4974a.preConcat(dVar.f4983j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f4975b.size(); i12++) {
                e eVar = dVar.f4975b.get(i12);
                if (eVar instanceof d) {
                    m6016c((d) eVar, dVar.f4974a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    m6017d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m6017d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f5002k;
            float f11 = i11 / this.f5003l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f4974a;
            this.f4994c.set(matrix);
            this.f4994c.postScale(f10, f11);
            float m6018e = m6018e(matrix);
            if (m6018e == 0.0f) {
                return;
            }
            fVar.m6014d(this.f4992a);
            Path path = this.f4992a;
            this.f4993b.reset();
            if (fVar.mo6003c()) {
                this.f4993b.setFillType(fVar.f4989c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f4993b.addPath(path, this.f4994c);
                canvas.clipPath(this.f4993b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f4968k;
            if (f12 != 0.0f || cVar.f4969l != 1.0f) {
                float f13 = cVar.f4970m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f4969l + f13) % 1.0f;
                if (this.f4997f == null) {
                    this.f4997f = new PathMeasure();
                }
                this.f4997f.setPath(this.f4992a, false);
                float length = this.f4997f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f4997f.getSegment(f16, length, path, true);
                    this.f4997f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f4997f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f4993b.addPath(path, this.f4994c);
            if (cVar.f4965h.m3097l()) {
                C0592d c0592d = cVar.f4965h;
                if (this.f4996e == null) {
                    Paint paint = new Paint(1);
                    this.f4996e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f4996e;
                if (c0592d.m3093h()) {
                    Shader m3092f = c0592d.m3092f();
                    m3092f.setLocalMatrix(this.f4994c);
                    paint2.setShader(m3092f);
                    paint2.setAlpha(Math.round(cVar.f4967j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C0939g.m5992a(c0592d.m3091e(), cVar.f4967j));
                }
                paint2.setColorFilter(colorFilter);
                this.f4993b.setFillType(cVar.f4989c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f4993b, paint2);
            }
            if (cVar.f4963f.m3097l()) {
                C0592d c0592d2 = cVar.f4963f;
                if (this.f4995d == null) {
                    Paint paint3 = new Paint(1);
                    this.f4995d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f4995d;
                Paint.Join join = cVar.f4972o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f4971n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f4973p);
                if (c0592d2.m3093h()) {
                    Shader m3092f2 = c0592d2.m3092f();
                    m3092f2.setLocalMatrix(this.f4994c);
                    paint4.setShader(m3092f2);
                    paint4.setAlpha(Math.round(cVar.f4966i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C0939g.m5992a(c0592d2.m3091e(), cVar.f4966i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f4964g * min * m6018e);
                canvas.drawPath(this.f4993b, paint4);
            }
        }

        /* renamed from: e */
        private float m6018e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m6015a = m6015a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(m6015a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void m6019b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            m6016c(this.f4999h, f4991q, canvas, i10, i11, colorFilter);
        }

        /* renamed from: f */
        public boolean m6020f() {
            if (this.f5006o == null) {
                this.f5006o = Boolean.valueOf(this.f4999h.mo6008a());
            }
            return this.f5006o.booleanValue();
        }

        /* renamed from: g */
        public boolean m6021g(int[] iArr) {
            return this.f4999h.mo6009b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5004m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f5004m = i10;
        }

        public g(g gVar) {
            this.f4994c = new Matrix();
            this.f5000i = 0.0f;
            this.f5001j = 0.0f;
            this.f5002k = 0.0f;
            this.f5003l = 0.0f;
            this.f5004m = 255;
            this.f5005n = null;
            this.f5006o = null;
            C3356a<String, Object> c3356a = new C3356a<>();
            this.f5007p = c3356a;
            this.f4999h = new d(gVar.f4999h, c3356a);
            this.f4992a = new Path(gVar.f4992a);
            this.f4993b = new Path(gVar.f4993b);
            this.f5000i = gVar.f5000i;
            this.f5001j = gVar.f5001j;
            this.f5002k = gVar.f5002k;
            this.f5003l = gVar.f5003l;
            this.f4998g = gVar.f4998g;
            this.f5004m = gVar.f5004m;
            this.f5005n = gVar.f5005n;
            String str = gVar.f5005n;
            if (str != null) {
                c3356a.put(str, this);
            }
            this.f5006o = gVar.f5006o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f4974a;

        /* renamed from: b */
        final ArrayList<e> f4975b;

        /* renamed from: c */
        float f4976c;

        /* renamed from: d */
        private float f4977d;

        /* renamed from: e */
        private float f4978e;

        /* renamed from: f */
        private float f4979f;

        /* renamed from: g */
        private float f4980g;

        /* renamed from: h */
        private float f4981h;

        /* renamed from: i */
        private float f4982i;

        /* renamed from: j */
        final Matrix f4983j;

        /* renamed from: k */
        int f4984k;

        /* renamed from: l */
        private int[] f4985l;

        /* renamed from: m */
        private String f4986m;

        public d(d dVar, C3356a<String, Object> c3356a) {
            super();
            f bVar;
            this.f4974a = new Matrix();
            this.f4975b = new ArrayList<>();
            this.f4976c = 0.0f;
            this.f4977d = 0.0f;
            this.f4978e = 0.0f;
            this.f4979f = 1.0f;
            this.f4980g = 1.0f;
            this.f4981h = 0.0f;
            this.f4982i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4983j = matrix;
            this.f4986m = null;
            this.f4976c = dVar.f4976c;
            this.f4977d = dVar.f4977d;
            this.f4978e = dVar.f4978e;
            this.f4979f = dVar.f4979f;
            this.f4980g = dVar.f4980g;
            this.f4981h = dVar.f4981h;
            this.f4982i = dVar.f4982i;
            this.f4985l = dVar.f4985l;
            String str = dVar.f4986m;
            this.f4986m = str;
            this.f4984k = dVar.f4984k;
            if (str != null) {
                c3356a.put(str, this);
            }
            matrix.set(dVar.f4983j);
            ArrayList<e> arrayList = dVar.f4975b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4975b.add(new d((d) eVar, c3356a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4975b.add(bVar);
                    String str2 = bVar.f4988b;
                    if (str2 != null) {
                        c3356a.put(str2, bVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6011d() {
            this.f4983j.reset();
            this.f4983j.postTranslate(-this.f4977d, -this.f4978e);
            this.f4983j.postScale(this.f4979f, this.f4980g);
            this.f4983j.postRotate(this.f4976c, 0.0f, 0.0f);
            this.f4983j.postTranslate(this.f4981h + this.f4977d, this.f4982i + this.f4978e);
        }

        /* renamed from: e */
        private void m6012e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4985l = null;
            this.f4976c = C0599k.m3157f(typedArray, xmlPullParser, "rotation", 5, this.f4976c);
            this.f4977d = typedArray.getFloat(1, this.f4977d);
            this.f4978e = typedArray.getFloat(2, this.f4978e);
            this.f4979f = C0599k.m3157f(typedArray, xmlPullParser, "scaleX", 3, this.f4979f);
            this.f4980g = C0599k.m3157f(typedArray, xmlPullParser, "scaleY", 4, this.f4980g);
            this.f4981h = C0599k.m3157f(typedArray, xmlPullParser, "translateX", 6, this.f4981h);
            this.f4982i = C0599k.m3157f(typedArray, xmlPullParser, "translateY", 7, this.f4982i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4986m = string;
            }
            m6011d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0939g.e
        /* renamed from: a */
        public boolean mo6008a() {
            for (int i10 = 0; i10 < this.f4975b.size(); i10++) {
                if (this.f4975b.get(i10).mo6008a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C0939g.e
        /* renamed from: b */
        public boolean mo6009b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4975b.size(); i10++) {
                z10 |= this.f4975b.get(i10).mo6009b(iArr);
            }
            return z10;
        }

        /* renamed from: c */
        public void m6013c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4925b);
            m6012e(m3162k, xmlPullParser);
            m3162k.recycle();
        }

        public String getGroupName() {
            return this.f4986m;
        }

        public Matrix getLocalMatrix() {
            return this.f4983j;
        }

        public float getPivotX() {
            return this.f4977d;
        }

        public float getPivotY() {
            return this.f4978e;
        }

        public float getRotation() {
            return this.f4976c;
        }

        public float getScaleX() {
            return this.f4979f;
        }

        public float getScaleY() {
            return this.f4980g;
        }

        public float getTranslateX() {
            return this.f4981h;
        }

        public float getTranslateY() {
            return this.f4982i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4977d) {
                this.f4977d = f10;
                m6011d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4978e) {
                this.f4978e = f10;
                m6011d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4976c) {
                this.f4976c = f10;
                m6011d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4979f) {
                this.f4979f = f10;
                m6011d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4980g) {
                this.f4980g = f10;
                m6011d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4981h) {
                this.f4981h = f10;
                m6011d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4982i) {
                this.f4982i = f10;
                m6011d();
            }
        }

        public d() {
            super();
            this.f4974a = new Matrix();
            this.f4975b = new ArrayList<>();
            this.f4976c = 0.0f;
            this.f4977d = 0.0f;
            this.f4978e = 0.0f;
            this.f4979f = 1.0f;
            this.f4980g = 1.0f;
            this.f4981h = 0.0f;
            this.f4982i = 0.0f;
            this.f4983j = new Matrix();
            this.f4986m = null;
        }
    }
}
