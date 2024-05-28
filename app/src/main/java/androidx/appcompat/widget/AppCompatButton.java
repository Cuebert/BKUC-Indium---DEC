package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0707i;
import androidx.core.widget.InterfaceC0700b;
import androidx.core.widget.InterfaceC0709k;
import p039d.C2948a;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0700b, InterfaceC0709k {
    private final C0250c mBackgroundTintHelper;
    private final C0258k mTextHelper;

    public AppCompatButton(Context context) {
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0700b.f3720a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            return c0258k.m1224e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0700b.f3720a) {
            return super.getAutoSizeMinTextSize();
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            return c0258k.m1225f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0700b.f3720a) {
            return super.getAutoSizeStepGranularity();
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            return c0258k.m1226g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0700b.f3720a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0258k c0258k = this.mTextHelper;
        return c0258k != null ? c0258k.m1227h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0700b.f3720a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            return c0258k.m1228i();
        }
        return 0;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m1229j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m1230k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1234o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0258k c0258k = this.mTextHelper;
        if (c0258k == null || InterfaceC0700b.f3720a || !c0258k.m1231l()) {
            return;
        }
        this.mTextHelper.m1223c();
    }

    @Override // android.widget.TextView, androidx.core.widget.InterfaceC0700b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (InterfaceC0700b.f3720a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1239t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (InterfaceC0700b.f3720a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1240u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (InterfaceC0700b.f3720a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1241v(i10);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0707i.m4179r(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1238s(z10);
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

    @Override // androidx.core.widget.InterfaceC0709k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m1242w(colorStateList);
        this.mTextHelper.m1222b();
    }

    @Override // androidx.core.widget.InterfaceC0709k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m1243x(mode);
        this.mTextHelper.m1222b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1236q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC0700b.f3720a) {
            super.setTextSize(i10, f10);
            return;
        }
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1221A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12167s);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C0250c c0250c = new C0250c(this);
        this.mBackgroundTintHelper = c0250c;
        c0250c.m1179e(attributeSet, i10);
        C0258k c0258k = new C0258k(this);
        this.mTextHelper = c0258k;
        c0258k.m1232m(attributeSet, i10);
        c0258k.m1222b();
    }
}
