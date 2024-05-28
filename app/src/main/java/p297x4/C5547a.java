package p297x4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0601a;

/* renamed from: x4.a */
/* loaded from: classes.dex */
public class C5547a {

    /* renamed from: i */
    private static final int[] f20561i = new int[3];

    /* renamed from: j */
    private static final float[] f20562j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f20563k = new int[4];

    /* renamed from: l */
    private static final float[] f20564l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f20565a;

    /* renamed from: b */
    private final Paint f20566b;

    /* renamed from: c */
    private final Paint f20567c;

    /* renamed from: d */
    private int f20568d;

    /* renamed from: e */
    private int f20569e;

    /* renamed from: f */
    private int f20570f;

    /* renamed from: g */
    private final Path f20571g;

    /* renamed from: h */
    private Paint f20572h;

    public C5547a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m20297a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f20571g;
        if (z10) {
            int[] iArr = f20563k;
            iArr[0] = 0;
            iArr[1] = this.f20570f;
            iArr[2] = this.f20569e;
            iArr[3] = this.f20568d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f20563k;
            iArr2[0] = 0;
            iArr2[1] = this.f20568d;
            iArr2[2] = this.f20569e;
            iArr2[3] = this.f20570f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f20564l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f20566b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f20563k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f20572h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f20566b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m20298b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f20561i;
        iArr[0] = this.f20570f;
        iArr[1] = this.f20569e;
        iArr[2] = this.f20568d;
        Paint paint = this.f20567c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f20562j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f20567c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m20299c() {
        return this.f20565a;
    }

    /* renamed from: d */
    public void m20300d(int i10) {
        this.f20568d = C0601a.m3180f(i10, 68);
        this.f20569e = C0601a.m3180f(i10, 20);
        this.f20570f = C0601a.m3180f(i10, 0);
        this.f20565a.setColor(this.f20568d);
    }

    public C5547a(int i10) {
        this.f20571g = new Path();
        this.f20572h = new Paint();
        this.f20565a = new Paint();
        m20300d(i10);
        this.f20572h.setColor(0);
        Paint paint = new Paint(4);
        this.f20566b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f20567c = new Paint(paint);
    }
}
