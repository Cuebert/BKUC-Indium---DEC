package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p039d.C2948a;
import p066f.C3121a;

/* loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};
    private final C0250c mBackgroundTintHelper;
    private final C0258k mTextHelper;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0252e.m1193a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C3121a.m13770d(getContext(), i10));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1236q(context, i10);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12166r);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, TINT_ATTRS, i10, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        obtainStyledAttributes.recycle();
        C0250c c0250c = new C0250c(this);
        this.mBackgroundTintHelper = c0250c;
        c0250c.m1179e(attributeSet, i10);
        C0258k c0258k = new C0258k(this);
        this.mTextHelper = c0258k;
        c0258k.m1232m(attributeSet, i10);
        c0258k.m1222b();
    }
}
