package com.roblox.client.qrscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0587a;
import com.roblox.client.C2913x;

/* loaded from: classes.dex */
public class CustomViewfinderView extends View {

    /* renamed from: n */
    private final float f11488n;

    /* renamed from: o */
    private final float f11489o;

    /* renamed from: p */
    private final int f11490p;

    /* renamed from: q */
    private final int f11491q;

    /* renamed from: r */
    private final int f11492r;

    /* renamed from: s */
    private final int f11493s;

    /* renamed from: t */
    private int f11494t;

    /* renamed from: u */
    private int f11495u;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11488n = 16.0f;
        this.f11489o = 16.0f;
        this.f11490p = 400;
        this.f11491q = 80;
        this.f11492r = m13033a(16.0f, context);
        this.f11493s = m13033a(16.0f, context);
    }

    /* renamed from: a */
    private int m13033a(float f10, Context context) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    /* renamed from: b */
    private void m13034b(Canvas canvas, Context context) {
        Rect m13037e = m13037e(context);
        int i10 = m13037e.left;
        int i11 = m13037e.top;
        int width = m13037e.width();
        Paint paint = new Paint();
        paint.setColor(2130706432);
        float f10 = i11;
        canvas.drawRect(0.0f, 0.0f, this.f11494t, f10, paint);
        float f11 = i11 + width;
        canvas.drawRect(0.0f, f10, i10, f11, paint);
        canvas.drawRect(i10 + width, f10, this.f11494t, f11, paint);
        canvas.drawRect(0.0f, f11, this.f11494t, this.f11495u, paint);
    }

    /* renamed from: c */
    private void m13035c(Canvas canvas, Context context, int i10, Rect rect) {
        Drawable m3031e = C0587a.m3031e(context, i10);
        m3031e.setBounds(rect);
        m3031e.draw(canvas);
    }

    /* renamed from: d */
    private void m13036d(Canvas canvas, Context context) {
        Rect m13037e = m13037e(context);
        int i10 = m13037e.left;
        int i11 = m13037e.top;
        int width = m13037e.width();
        Rect rect = new Rect();
        rect.set(i10, i11, this.f11492r + i10, this.f11493s + i11);
        m13035c(canvas, context, C2913x.f11758g, rect);
        int i12 = i10 + width;
        rect.set(i12 - this.f11492r, i11, i12, this.f11493s + i11);
        m13035c(canvas, context, C2913x.f11760i, rect);
        int i13 = i11 + width;
        rect.set(i10, i13 - this.f11493s, this.f11492r + i10, i13);
        m13035c(canvas, context, C2913x.f11757f, rect);
        rect.set(i12 - this.f11492r, i13 - this.f11493s, i12, i13);
        m13035c(canvas, context, C2913x.f11759h, rect);
    }

    /* renamed from: e */
    private Rect m13037e(Context context) {
        int m13033a = m13033a(80.0f, context);
        int m13033a2 = m13033a(400.0f, context);
        int i10 = this.f11494t;
        int i11 = i10 - (m13033a * 2);
        if (i11 > m13033a2) {
            m13033a = (i10 - m13033a2) / 2;
        } else {
            m13033a2 = i11;
        }
        int i12 = (this.f11495u - m13033a2) / 2;
        return new Rect(m13033a, i12, m13033a + m13033a2, m13033a2 + i12);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Context context = getContext();
        this.f11494t = getWidth();
        this.f11495u = getHeight();
        m13034b(canvas, context);
        m13036d(canvas, context);
    }
}
