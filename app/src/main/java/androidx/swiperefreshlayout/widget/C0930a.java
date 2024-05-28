package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C0690v;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes.dex */
public class C0930a extends ImageView {

    /* renamed from: n */
    private Animation.AnimationListener f4833n;

    /* renamed from: o */
    int f4834o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* loaded from: classes.dex */
    public class a extends OvalShape {

        /* renamed from: n */
        private RadialGradient f4835n;

        /* renamed from: o */
        private Paint f4836o = new Paint();

        a(int i10) {
            C0930a.this.f4834o = i10;
            m5904a((int) rect().width());
        }

        /* renamed from: a */
        private void m5904a(int i10) {
            float f10 = i10 / 2;
            RadialGradient radialGradient = new RadialGradient(f10, f10, C0930a.this.f4834o, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f4835n = radialGradient;
            this.f4836o.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C0930a.this.getWidth() / 2;
            float height = C0930a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f4836o);
            canvas.drawCircle(width, height, r0 - C0930a.this.f4834o, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            m5904a((int) f10);
        }
    }

    public C0930a(Context context, int i10) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f10);
        int i12 = (int) (0.0f * f10);
        this.f4834o = (int) (3.5f * f10);
        if (m5902a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0690v.m3867x0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f4834o));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f4834o, i12, i11, 503316480);
            int i13 = this.f4834o;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i10);
        C0690v.m3859t0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m5902a() {
        return true;
    }

    /* renamed from: b */
    public void m5903b(Animation.AnimationListener animationListener) {
        this.f4833n = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4833n;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4833n;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (m5902a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f4834o * 2), getMeasuredHeight() + (this.f4834o * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }
}
