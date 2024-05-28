package p284w4;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC0610b;
import p310y4.C5888g;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public class C5456a extends Drawable implements InterfaceC5895n, InterfaceC0610b {

    /* renamed from: n */
    private b f20335n;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5456a mutate() {
        this.f20335n = new b(this.f20335n);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f20335n;
        if (bVar.f20337b) {
            bVar.f20336a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f20335n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20335n.f20336a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f20335n.f20336a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f20335n.f20336a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m20048e = C5457b.m20048e(iArr);
        b bVar = this.f20335n;
        if (bVar.f20337b == m20048e) {
            return onStateChange;
        }
        bVar.f20337b = m20048e;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20335n.f20336a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20335n.f20336a.setColorFilter(colorFilter);
    }

    @Override // p310y4.InterfaceC5895n
    public void setShapeAppearanceModel(C5892k c5892k) {
        this.f20335n.f20336a.setShapeAppearanceModel(c5892k);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f20335n.f20336a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f20335n.f20336a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f20335n.f20336a.setTintMode(mode);
    }

    public C5456a(C5892k c5892k) {
        this(new b(new C5888g(c5892k)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w4.a$b */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        C5888g f20336a;

        /* renamed from: b */
        boolean f20337b;

        public b(C5888g c5888g) {
            this.f20336a = c5888g;
            this.f20337b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5456a newDrawable() {
            return new C5456a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f20336a = (C5888g) bVar.f20336a.getConstantState().newDrawable();
            this.f20337b = bVar.f20337b;
        }
    }

    private C5456a(b bVar) {
        this.f20335n = bVar;
    }
}
