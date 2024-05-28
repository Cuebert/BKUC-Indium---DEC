package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0690v;
import p039d.C2957j;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0256i extends C0254g {

    /* renamed from: d */
    private final SeekBar f1131d;

    /* renamed from: e */
    private Drawable f1132e;

    /* renamed from: f */
    private ColorStateList f1133f;

    /* renamed from: g */
    private PorterDuff.Mode f1134g;

    /* renamed from: h */
    private boolean f1135h;

    /* renamed from: i */
    private boolean f1136i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0256i(SeekBar seekBar) {
        super(seekBar);
        this.f1133f = null;
        this.f1134g = null;
        this.f1135h = false;
        this.f1136i = false;
        this.f1131d = seekBar;
    }

    /* renamed from: f */
    private void m1208f() {
        Drawable drawable = this.f1132e;
        if (drawable != null) {
            if (this.f1135h || this.f1136i) {
                Drawable m3263r = C0609a.m3263r(drawable.mutate());
                this.f1132e = m3263r;
                if (this.f1135h) {
                    C0609a.m3260o(m3263r, this.f1133f);
                }
                if (this.f1136i) {
                    C0609a.m3261p(this.f1132e, this.f1134g);
                }
                if (this.f1132e.isStateful()) {
                    this.f1132e.setState(this.f1131d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0254g
    /* renamed from: c */
    public void mo1200c(AttributeSet attributeSet, int i10) {
        super.mo1200c(attributeSet, i10);
        Context context = this.f1131d.getContext();
        int[] iArr = C2957j.f12451X;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1131d;
        C0690v.m3849o0(seekBar, seekBar.getContext(), iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(C2957j.f12456Y);
        if (drawableIfKnown != null) {
            this.f1131d.setThumb(drawableIfKnown);
        }
        m1212j(obtainStyledAttributes.getDrawable(C2957j.f12461Z));
        int i11 = C2957j.f12473b0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1134g = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i11, -1), this.f1134g);
            this.f1136i = true;
        }
        int i12 = C2957j.f12467a0;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f1133f = obtainStyledAttributes.getColorStateList(i12);
            this.f1135h = true;
        }
        obtainStyledAttributes.recycle();
        m1208f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1209g(Canvas canvas) {
        if (this.f1132e != null) {
            int max = this.f1131d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1132e.getIntrinsicWidth();
                int intrinsicHeight = this.f1132e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1132e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1131d.getWidth() - this.f1131d.getPaddingLeft()) - this.f1131d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1131d.getPaddingLeft(), this.f1131d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1132e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1210h() {
        Drawable drawable = this.f1132e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1131d.getDrawableState())) {
            this.f1131d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1211i() {
        Drawable drawable = this.f1132e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m1212j(Drawable drawable) {
        Drawable drawable2 = this.f1132e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1132e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1131d);
            C0609a.m3258m(drawable, C0690v.m3791E(this.f1131d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1131d.getDrawableState());
            }
            m1208f();
        }
        this.f1131d.invalidate();
    }
}
