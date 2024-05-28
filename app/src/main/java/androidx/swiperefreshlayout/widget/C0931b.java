package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C0654h;
import p027c1.C1120b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes.dex */
public class C0931b extends Drawable implements Animatable {

    /* renamed from: t */
    private static final Interpolator f4838t = new LinearInterpolator();

    /* renamed from: u */
    private static final Interpolator f4839u = new C1120b();

    /* renamed from: v */
    private static final int[] f4840v = {-16777216};

    /* renamed from: n */
    private final c f4841n;

    /* renamed from: o */
    private float f4842o;

    /* renamed from: p */
    private Resources f4843p;

    /* renamed from: q */
    private Animator f4844q;

    /* renamed from: r */
    float f4845r;

    /* renamed from: s */
    boolean f4846s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ c f4847a;

        a(c cVar) {
            this.f4847a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0931b.this.m5918n(floatValue, this.f4847a);
            C0931b.this.m5910b(floatValue, this.f4847a, false);
            C0931b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ c f4849a;

        b(c cVar) {
            this.f4849a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C0931b.this.m5910b(1.0f, this.f4849a, true);
            this.f4849a.m5919A();
            this.f4849a.m5931l();
            C0931b c0931b = C0931b.this;
            if (c0931b.f4846s) {
                c0931b.f4846s = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f4849a.m5943x(false);
                return;
            }
            c0931b.f4845r += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0931b.this.f4845r = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final RectF f4851a = new RectF();

        /* renamed from: b */
        final Paint f4852b;

        /* renamed from: c */
        final Paint f4853c;

        /* renamed from: d */
        final Paint f4854d;

        /* renamed from: e */
        float f4855e;

        /* renamed from: f */
        float f4856f;

        /* renamed from: g */
        float f4857g;

        /* renamed from: h */
        float f4858h;

        /* renamed from: i */
        int[] f4859i;

        /* renamed from: j */
        int f4860j;

        /* renamed from: k */
        float f4861k;

        /* renamed from: l */
        float f4862l;

        /* renamed from: m */
        float f4863m;

        /* renamed from: n */
        boolean f4864n;

        /* renamed from: o */
        Path f4865o;

        /* renamed from: p */
        float f4866p;

        /* renamed from: q */
        float f4867q;

        /* renamed from: r */
        int f4868r;

        /* renamed from: s */
        int f4869s;

        /* renamed from: t */
        int f4870t;

        /* renamed from: u */
        int f4871u;

        c() {
            Paint paint = new Paint();
            this.f4852b = paint;
            Paint paint2 = new Paint();
            this.f4853c = paint2;
            Paint paint3 = new Paint();
            this.f4854d = paint3;
            this.f4855e = 0.0f;
            this.f4856f = 0.0f;
            this.f4857g = 0.0f;
            this.f4858h = 5.0f;
            this.f4866p = 1.0f;
            this.f4870t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m5919A() {
            this.f4861k = this.f4855e;
            this.f4862l = this.f4856f;
            this.f4863m = this.f4857g;
        }

        /* renamed from: a */
        void m5920a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4851a;
            float f10 = this.f4867q;
            float f11 = (this.f4858h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f4868r * this.f4866p) / 2.0f, this.f4858h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f4855e;
            float f13 = this.f4857g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f4856f + f13) * 360.0f) - f14;
            this.f4852b.setColor(this.f4871u);
            this.f4852b.setAlpha(this.f4870t);
            float f16 = this.f4858h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4854d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f4852b);
            m5921b(canvas, f14, f15, rectF);
        }

        /* renamed from: b */
        void m5921b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f4864n) {
                Path path = this.f4865o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4865o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f4868r * this.f4866p) / 2.0f;
                this.f4865o.moveTo(0.0f, 0.0f);
                this.f4865o.lineTo(this.f4868r * this.f4866p, 0.0f);
                Path path3 = this.f4865o;
                float f13 = this.f4868r;
                float f14 = this.f4866p;
                path3.lineTo((f13 * f14) / 2.0f, this.f4869s * f14);
                this.f4865o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f4858h / 2.0f));
                this.f4865o.close();
                this.f4853c.setColor(this.f4871u);
                this.f4853c.setAlpha(this.f4870t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4865o, this.f4853c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m5922c() {
            return this.f4870t;
        }

        /* renamed from: d */
        float m5923d() {
            return this.f4856f;
        }

        /* renamed from: e */
        int m5924e() {
            return this.f4859i[m5925f()];
        }

        /* renamed from: f */
        int m5925f() {
            return (this.f4860j + 1) % this.f4859i.length;
        }

        /* renamed from: g */
        float m5926g() {
            return this.f4855e;
        }

        /* renamed from: h */
        int m5927h() {
            return this.f4859i[this.f4860j];
        }

        /* renamed from: i */
        float m5928i() {
            return this.f4862l;
        }

        /* renamed from: j */
        float m5929j() {
            return this.f4863m;
        }

        /* renamed from: k */
        float m5930k() {
            return this.f4861k;
        }

        /* renamed from: l */
        void m5931l() {
            m5939t(m5925f());
        }

        /* renamed from: m */
        void m5932m() {
            this.f4861k = 0.0f;
            this.f4862l = 0.0f;
            this.f4863m = 0.0f;
            m5944y(0.0f);
            m5941v(0.0f);
            m5942w(0.0f);
        }

        /* renamed from: n */
        void m5933n(int i10) {
            this.f4870t = i10;
        }

        /* renamed from: o */
        void m5934o(float f10, float f11) {
            this.f4868r = (int) f10;
            this.f4869s = (int) f11;
        }

        /* renamed from: p */
        void m5935p(float f10) {
            if (f10 != this.f4866p) {
                this.f4866p = f10;
            }
        }

        /* renamed from: q */
        void m5936q(float f10) {
            this.f4867q = f10;
        }

        /* renamed from: r */
        void m5937r(int i10) {
            this.f4871u = i10;
        }

        /* renamed from: s */
        void m5938s(ColorFilter colorFilter) {
            this.f4852b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m5939t(int i10) {
            this.f4860j = i10;
            this.f4871u = this.f4859i[i10];
        }

        /* renamed from: u */
        void m5940u(int[] iArr) {
            this.f4859i = iArr;
            m5939t(0);
        }

        /* renamed from: v */
        void m5941v(float f10) {
            this.f4856f = f10;
        }

        /* renamed from: w */
        void m5942w(float f10) {
            this.f4857g = f10;
        }

        /* renamed from: x */
        void m5943x(boolean z10) {
            if (this.f4864n != z10) {
                this.f4864n = z10;
            }
        }

        /* renamed from: y */
        void m5944y(float f10) {
            this.f4855e = f10;
        }

        /* renamed from: z */
        void m5945z(float f10) {
            this.f4858h = f10;
            this.f4852b.setStrokeWidth(f10);
        }
    }

    public C0931b(Context context) {
        this.f4843p = ((Context) C0654h.m3467f(context)).getResources();
        c cVar = new c();
        this.f4841n = cVar;
        cVar.m5940u(f4840v);
        m5916k(2.5f);
        m5909m();
    }

    /* renamed from: a */
    private void m5905a(float f10, c cVar) {
        m5918n(f10, cVar);
        float floor = (float) (Math.floor(cVar.m5929j() / 0.8f) + 1.0d);
        cVar.m5944y(cVar.m5930k() + (((cVar.m5928i() - 0.01f) - cVar.m5930k()) * f10));
        cVar.m5941v(cVar.m5928i());
        cVar.m5942w(cVar.m5929j() + ((floor - cVar.m5929j()) * f10));
    }

    /* renamed from: c */
    private int m5906c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    /* renamed from: h */
    private void m5907h(float f10) {
        this.f4842o = f10;
    }

    /* renamed from: i */
    private void m5908i(float f10, float f11, float f12, float f13) {
        c cVar = this.f4841n;
        float f14 = this.f4843p.getDisplayMetrics().density;
        cVar.m5945z(f11 * f14);
        cVar.m5936q(f10 * f14);
        cVar.m5939t(0);
        cVar.m5934o(f12 * f14, f13 * f14);
    }

    /* renamed from: m */
    private void m5909m() {
        c cVar = this.f4841n;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4838t);
        ofFloat.addListener(new b(cVar));
        this.f4844q = ofFloat;
    }

    /* renamed from: b */
    void m5910b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f4846s) {
            m5905a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float m5929j = cVar.m5929j();
            if (f10 < 0.5f) {
                interpolation = cVar.m5930k();
                f11 = (f4839u.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m5930k = cVar.m5930k() + 0.79f;
                interpolation = m5930k - (((1.0f - f4839u.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = m5930k;
            }
            float f12 = m5929j + (0.20999998f * f10);
            float f13 = (f10 + this.f4845r) * 216.0f;
            cVar.m5944y(interpolation);
            cVar.m5941v(f11);
            cVar.m5942w(f12);
            m5907h(f13);
        }
    }

    /* renamed from: d */
    public void m5911d(boolean z10) {
        this.f4841n.m5943x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4842o, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4841n.m5920a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m5912e(float f10) {
        this.f4841n.m5935p(f10);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m5913f(int... iArr) {
        this.f4841n.m5940u(iArr);
        this.f4841n.m5939t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m5914g(float f10) {
        this.f4841n.m5942w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4841n.m5922c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4844q.isRunning();
    }

    /* renamed from: j */
    public void m5915j(float f10, float f11) {
        this.f4841n.m5944y(f10);
        this.f4841n.m5941v(f11);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m5916k(float f10) {
        this.f4841n.m5945z(f10);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m5917l(int i10) {
        if (i10 == 0) {
            m5908i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m5908i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    void m5918n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.m5937r(m5906c((f10 - 0.75f) / 0.25f, cVar.m5927h(), cVar.m5924e()));
        } else {
            cVar.m5937r(cVar.m5927h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f4841n.m5933n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4841n.m5938s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4844q.cancel();
        this.f4841n.m5919A();
        if (this.f4841n.m5923d() != this.f4841n.m5926g()) {
            this.f4846s = true;
            this.f4844q.setDuration(666L);
            this.f4844q.start();
        } else {
            this.f4841n.m5939t(0);
            this.f4841n.m5932m();
            this.f4844q.setDuration(1332L);
            this.f4844q.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4844q.cancel();
        m5907h(0.0f);
        this.f4841n.m5943x(false);
        this.f4841n.m5939t(0);
        this.f4841n.m5932m();
        invalidateSelf();
    }
}
