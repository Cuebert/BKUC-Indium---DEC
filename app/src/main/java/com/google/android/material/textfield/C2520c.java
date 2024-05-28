package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p310y4.C5888g;
import p310y4.C5892k;

/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes.dex */
class C2520c extends C5888g {

    /* renamed from: L */
    private final Paint f9899L;

    /* renamed from: M */
    private final RectF f9900M;

    /* renamed from: N */
    private int f9901N;

    C2520c() {
        this(null);
    }

    /* renamed from: j0 */
    private void m11606j0(Canvas canvas) {
        if (m11610q0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f9901N);
    }

    /* renamed from: k0 */
    private void m11607k0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m11610q0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m11608m0(canvas);
    }

    /* renamed from: m0 */
    private void m11608m0(Canvas canvas) {
        this.f9901N = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    /* renamed from: p0 */
    private void m11609p0() {
        this.f9899L.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9899L.setColor(-1);
        this.f9899L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: q0 */
    private boolean m11610q0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m11607k0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f9900M, this.f9899L);
        m11606j0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public boolean m11611i0() {
        return !this.f9900M.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void m11612l0() {
        m11613n0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: n0 */
    void m11613n0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f9900M;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void m11614o0(RectF rectF) {
        m11613n0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2520c(C5892k c5892k) {
        super(c5892k == null ? new C5892k() : c5892k);
        this.f9899L = new Paint(1);
        m11609p0();
        this.f9900M = new RectF();
    }
}
