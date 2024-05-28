package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import qa.C4359t;

/* renamed from: qa.u */
/* loaded from: classes.dex */
public final class C4360u extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f17776h = new Paint();

    /* renamed from: a */
    private final boolean f17777a;

    /* renamed from: b */
    private final float f17778b;

    /* renamed from: c */
    private final C4359t.e f17779c;

    /* renamed from: d */
    Drawable f17780d;

    /* renamed from: e */
    long f17781e;

    /* renamed from: f */
    boolean f17782f;

    /* renamed from: g */
    int f17783g;

    C4360u(Context context, Bitmap bitmap, Drawable drawable, C4359t.e eVar, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f17783g = 255;
        this.f17777a = z11;
        this.f17778b = context.getResources().getDisplayMetrics().density;
        this.f17779c = eVar;
        if ((eVar == C4359t.e.MEMORY || z10) ? false : true) {
            this.f17780d = drawable;
            this.f17782f = true;
            this.f17781e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    private void m18021a(Canvas canvas) {
        Paint paint = f17776h;
        paint.setColor(-1);
        canvas.drawPath(m18022b(new Point(0, 0), (int) (this.f17778b * 16.0f)), paint);
        paint.setColor(this.f17779c.f17770n);
        canvas.drawPath(m18022b(new Point(0, 0), (int) (this.f17778b * 15.0f)), paint);
    }

    /* renamed from: b */
    private static Path m18022b(Point point, int i10) {
        Point point2 = new Point(point.x + i10, point.y);
        Point point3 = new Point(point.x, point.y + i10);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    /* renamed from: c */
    public static void m18023c(ImageView imageView, Context context, Bitmap bitmap, C4359t.e eVar, boolean z10, boolean z11) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C4360u(context, bitmap, drawable, eVar, z10, z11));
    }

    /* renamed from: d */
    public static void m18024d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f17782f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f17781e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f17782f = false;
                this.f17780d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f17780d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f17783g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f17783g);
            }
        }
        if (this.f17777a) {
            m18021a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17780d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f17783g = i10;
        Drawable drawable = this.f17780d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17780d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
