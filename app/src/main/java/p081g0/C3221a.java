package p081g0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public class C3221a extends FrameLayout {

    /* renamed from: t */
    private static final int[] f13596t = {R.attr.colorBackground};

    /* renamed from: u */
    private static final InterfaceC3224d f13597u;

    /* renamed from: n */
    private boolean f13598n;

    /* renamed from: o */
    private boolean f13599o;

    /* renamed from: p */
    int f13600p;

    /* renamed from: q */
    int f13601q;

    /* renamed from: r */
    final Rect f13602r;

    /* renamed from: s */
    private final InterfaceC3223c f13603s;

    static {
        C3222b c3222b = new C3222b();
        f13597u = c3222b;
        c3222b.mo14391f();
    }

    public ColorStateList getCardBackgroundColor() {
        return f13597u.mo14398m(this.f13603s);
    }

    public float getCardElevation() {
        return f13597u.mo14396k(this.f13603s);
    }

    public int getContentPaddingBottom() {
        return this.f13602r.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f13602r.left;
    }

    public int getContentPaddingRight() {
        return this.f13602r.right;
    }

    public int getContentPaddingTop() {
        return this.f13602r.top;
    }

    public float getMaxCardElevation() {
        return f13597u.mo14386a(this.f13603s);
    }

    public boolean getPreventCornerOverlap() {
        return this.f13599o;
    }

    public float getRadius() {
        return f13597u.mo14393h(this.f13603s);
    }

    public boolean getUseCompatPadding() {
        return this.f13598n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(f13597u instanceof C3222b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo14394i(this.f13603s)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo14390e(this.f13603s)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f13597u.mo14387b(this.f13603s, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f13597u.mo14392g(this.f13603s, f10);
    }

    public void setMaxCardElevation(float f10) {
        f13597u.mo14388c(this.f13603s, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f13601q = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f13600p = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f13599o) {
            this.f13599o = z10;
            f13597u.mo14397l(this.f13603s);
        }
    }

    public void setRadius(float f10) {
        f13597u.mo14389d(this.f13603s, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f13598n != z10) {
            this.f13598n = z10;
            f13597u.mo14395j(this.f13603s);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f13597u.mo14387b(this.f13603s, colorStateList);
    }
}
