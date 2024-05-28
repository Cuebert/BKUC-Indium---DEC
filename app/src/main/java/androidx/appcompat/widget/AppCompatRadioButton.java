package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p039d.C2948a;
import p066f.C3121a;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton {
    private final C0250c mBackgroundTintHelper;
    private final C0251d mCompoundButtonHelper;
    private final C0258k mTextHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1176b();
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1222b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0251d c0251d = this.mCompoundButtonHelper;
        return c0251d != null ? c0251d.m1186b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            return c0250c.m1177c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            return c0250c.m1178d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0251d c0251d = this.mCompoundButtonHelper;
        if (c0251d != null) {
            return c0251d.m1187c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0251d c0251d = this.mCompoundButtonHelper;
        if (c0251d != null) {
            return c0251d.m1188d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1180f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1181g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0251d c0251d = this.mCompoundButtonHelper;
        if (c0251d != null) {
            c0251d.m1190f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1183i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1184j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0251d c0251d = this.mCompoundButtonHelper;
        if (c0251d != null) {
            c0251d.m1191g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0251d c0251d = this.mCompoundButtonHelper;
        if (c0251d != null) {
            c0251d.m1192h(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12140I);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C0251d c0251d = new C0251d(this);
        this.mCompoundButtonHelper = c0251d;
        c0251d.m1189e(attributeSet, i10);
        C0250c c0250c = new C0250c(this);
        this.mBackgroundTintHelper = c0250c;
        c0250c.m1179e(attributeSet, i10);
        C0258k c0258k = new C0258k(this);
        this.mTextHelper = c0258k;
        c0258k.m1232m(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C3121a.m13770d(getContext(), i10));
    }
}
