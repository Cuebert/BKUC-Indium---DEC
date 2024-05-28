package com.roblox.client.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.roblox.client.C2909v;

/* loaded from: classes.dex */
public class RbxLinearLayout extends LinearLayout {

    /* renamed from: n */
    private C2809j f10897n;

    /* renamed from: o */
    private float f10898o;

    /* renamed from: p */
    private boolean f10899p;

    /* renamed from: q */
    private float f10900q;

    /* renamed from: r */
    private float f10901r;

    /* renamed from: s */
    private Integer f10902s;

    public RbxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10897n = null;
        this.f10898o = 20.0f;
        this.f10899p = false;
        this.f10902s = 0;
        C2809j c2809j = new C2809j(this, attributeSet);
        this.f10897n = c2809j;
        c2809j.m12447m(getResources().getColor(C2909v.f11698g));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f10899p) {
            Paint paint = new Paint(1);
            paint.setColor(this.f10902s.intValue());
            canvas.drawCircle(this.f10900q, this.f10901r, this.f10898o, paint);
        }
        super.draw(canvas);
    }

    public float getXFraction() {
        return getX() / getWidth();
    }

    public float getYFraction() {
        return getY() / getHeight();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setXFraction(float f10) {
        int width = getWidth();
        setX(width > 0 ? f10 * width : -9999.0f);
    }

    public void setYFraction(float f10) {
        int height = getHeight();
        setY(height > 0 ? f10 * height : -9999.0f);
    }
}
