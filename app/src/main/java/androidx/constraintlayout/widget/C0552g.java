package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147l0.C3860e;

/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes.dex */
public class C0552g extends View {

    /* renamed from: n */
    private int f2668n;

    /* renamed from: o */
    private View f2669o;

    /* renamed from: p */
    private int f2670p;

    /* renamed from: a */
    public void m2608a(ConstraintLayout constraintLayout) {
        if (this.f2669o == null) {
            return;
        }
        ConstraintLayout.C0544b c0544b = (ConstraintLayout.C0544b) getLayoutParams();
        ConstraintLayout.C0544b c0544b2 = (ConstraintLayout.C0544b) this.f2669o.getLayoutParams();
        c0544b2.f2490n0.m16362T0(0);
        C3860e.b m16413y = c0544b.f2490n0.m16413y();
        C3860e.b bVar = C3860e.b.FIXED;
        if (m16413y != bVar) {
            c0544b.f2490n0.m16364U0(c0544b2.f2490n0.m16357R());
        }
        if (c0544b.f2490n0.m16351O() != bVar) {
            c0544b.f2490n0.m16408v0(c0544b2.f2490n0.m16407v());
        }
        c0544b2.f2490n0.m16362T0(8);
    }

    /* renamed from: b */
    public void m2609b(ConstraintLayout constraintLayout) {
        if (this.f2668n == -1 && !isInEditMode()) {
            setVisibility(this.f2670p);
        }
        View findViewById = constraintLayout.findViewById(this.f2668n);
        this.f2669o = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0544b) findViewById.getLayoutParams()).f2466b0 = true;
            this.f2669o.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2669o;
    }

    public int getEmptyVisibility() {
        return this.f2670p;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f2668n == i10) {
            return;
        }
        View view = this.f2669o;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0544b) this.f2669o.getLayoutParams()).f2466b0 = false;
            this.f2669o = null;
        }
        this.f2668n = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2670p = i10;
    }
}
