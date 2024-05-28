package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0492x2;
import androidx.camera.view.PreviewView;
import androidx.core.util.C0654h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.f */
/* loaded from: classes.dex */
public final class C0519f {

    /* renamed from: g */
    private static final PreviewView.EnumC0512f f2314g = PreviewView.EnumC0512f.FILL_CENTER;

    /* renamed from: a */
    private Size f2315a;

    /* renamed from: b */
    private Rect f2316b;

    /* renamed from: c */
    private int f2317c;

    /* renamed from: d */
    private int f2318d;

    /* renamed from: e */
    private boolean f2319e;

    /* renamed from: f */
    private PreviewView.EnumC0512f f2320f = f2314g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2321a;

        static {
            int[] iArr = new int[PreviewView.EnumC0512f.values().length];
            f2321a = iArr;
            try {
                iArr[PreviewView.EnumC0512f.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2321a[PreviewView.EnumC0512f.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2321a[PreviewView.EnumC0512f.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2321a[PreviewView.EnumC0512f.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2321a[PreviewView.EnumC0512f.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2321a[PreviewView.EnumC0512f.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: b */
    private static RectF m2427b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    /* renamed from: e */
    private Size m2428e() {
        if (C0538y.m2486d(this.f2317c)) {
            return new Size(this.f2316b.height(), this.f2316b.width());
        }
        return new Size(this.f2316b.width(), this.f2316b.height());
    }

    /* renamed from: j */
    private RectF m2429j(Size size, int i10) {
        C0654h.m3469h(m2430k());
        Matrix m2437h = m2437h(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f2315a.getWidth(), this.f2315a.getHeight());
        m2437h.mapRect(rectF);
        return rectF;
    }

    /* renamed from: k */
    private boolean m2430k() {
        return (this.f2316b == null || this.f2315a == null || this.f2318d == -1) ? false : true;
    }

    /* renamed from: n */
    private static void m2431n(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.EnumC0512f enumC0512f) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f2321a[enumC0512f.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C0463q1.m2204c("PreviewTransform", "Unexpected crop rect: " + enumC0512f);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (enumC0512f == PreviewView.EnumC0512f.FIT_CENTER || enumC0512f == PreviewView.EnumC0512f.FIT_START || enumC0512f == PreviewView.EnumC0512f.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m2432a(Bitmap bitmap, Size size, int i10) {
        if (!m2430k()) {
            return bitmap;
        }
        Matrix m2438i = m2438i();
        RectF m2429j = m2429j(size, i10);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(m2438i);
        matrix.postScale(m2429j.width() / this.f2315a.getWidth(), m2429j.height() / this.f2315a.getHeight());
        matrix.postTranslate(m2429j.left, m2429j.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Matrix m2433c(Size size, int i10) {
        if (!m2430k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m2437h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f2315a.getWidth(), this.f2315a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: d */
    RectF m2434d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size m2428e = m2428e();
        RectF rectF2 = new RectF(0.0f, 0.0f, m2428e.getWidth(), m2428e.getHeight());
        Matrix matrix = new Matrix();
        m2431n(matrix, rectF2, rectF, this.f2320f);
        matrix.mapRect(rectF2);
        return i10 == 1 ? m2427b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public PreviewView.EnumC0512f m2435f() {
        return this.f2320f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Rect m2436g() {
        return this.f2316b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Matrix m2437h(Size size, int i10) {
        RectF m2434d;
        C0654h.m3469h(m2430k());
        if (m2439l(size)) {
            m2434d = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            m2434d = m2434d(size, i10);
        }
        Matrix m2485c = C0538y.m2485c(new RectF(this.f2316b), m2434d, this.f2317c);
        if (this.f2319e) {
            if (C0538y.m2486d(this.f2317c)) {
                m2485c.preScale(1.0f, -1.0f, this.f2316b.centerX(), this.f2316b.centerY());
            } else {
                m2485c.preScale(-1.0f, 1.0f, this.f2316b.centerX(), this.f2316b.centerY());
            }
        }
        return m2485c;
    }

    /* renamed from: i */
    Matrix m2438i() {
        C0654h.m3469h(m2430k());
        RectF rectF = new RectF(0.0f, 0.0f, this.f2315a.getWidth(), this.f2315a.getHeight());
        return C0538y.m2485c(rectF, rectF, -C0538y.m2488f(this.f2318d));
    }

    /* renamed from: l */
    boolean m2439l(Size size) {
        return C0538y.m2487e(size, true, m2428e(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m2440m(int i10, int i11) {
        this.f2317c = i10;
        this.f2318d = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2441o(PreviewView.EnumC0512f enumC0512f) {
        this.f2320f = enumC0512f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m2442p(C0492x2.g gVar, Size size, boolean z10) {
        C0463q1.m2202a("PreviewTransform", "Transformation info set: " + gVar + " " + size + " " + z10);
        this.f2316b = gVar.mo2121a();
        this.f2317c = gVar.mo2122b();
        this.f2318d = gVar.mo2123c();
        this.f2315a = size;
        this.f2319e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m2443q(Size size, int i10, View view) {
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (m2430k()) {
                if (view instanceof TextureView) {
                    ((TextureView) view).setTransform(m2438i());
                } else {
                    Display display = view.getDisplay();
                    if (display != null && display.getRotation() != this.f2318d) {
                        C0463q1.m2204c("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                    }
                }
                RectF m2429j = m2429j(size, i10);
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                view.setScaleX(m2429j.width() / this.f2315a.getWidth());
                view.setScaleY(m2429j.height() / this.f2315a.getHeight());
                view.setTranslationX(m2429j.left - view.getLeft());
                view.setTranslationY(m2429j.top - view.getTop());
                return;
            }
            return;
        }
        C0463q1.m2212k("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}
