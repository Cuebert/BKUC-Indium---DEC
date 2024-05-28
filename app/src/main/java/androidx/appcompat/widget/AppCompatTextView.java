package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C0604d;
import androidx.core.text.C0643b;
import androidx.core.widget.C0707i;
import androidx.core.widget.InterfaceC0700b;
import androidx.core.widget.InterfaceC0709k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p066f.C3121a;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0709k, InterfaceC0700b {
    private final C0250c mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<C0643b> mPrecomputedTextFuture;
    private final C0257j mTextClassifierHelper;
    private final C0258k mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C0643b> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C0707i.m4176o(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0707i.m4163b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0707i.m4164c(this);
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0257j c0257j;
        if (Build.VERSION.SDK_INT < 28 && (c0257j = this.mTextClassifierHelper) != null) {
            return c0257j.m1213a();
        }
        return super.getTextClassifier();
    }

    public C0643b.a getTextMetricsParamsCompat() {
        return C0707i.m4168g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m1237r(this, onCreateInputConnection, editorInfo);
        return C0252e.m1193a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1234o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1235p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1235p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1235p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1235p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0707i.m4179r(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            C0707i.m4173l(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            C0707i.m4174m(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C0707i.m4175n(this, i10);
    }

    public void setPrecomputedText(C0643b c0643b) {
        C0707i.m4176o(this, c0643b);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C0257j c0257j;
        if (Build.VERSION.SDK_INT < 28 && (c0257j = this.mTextClassifierHelper) != null) {
            c0257j.m1214b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<C0643b> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0643b.a aVar) {
        C0707i.m4178q(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            typeface2 = C0604d.m3202a(getContext(), typeface, i10);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C0250c c0250c = new C0250c(this);
        this.mBackgroundTintHelper = c0250c;
        c0250c.m1179e(attributeSet, i10);
        C0258k c0258k = new C0258k(this);
        this.mTextHelper = c0258k;
        c0258k.m1232m(attributeSet, i10);
        c0258k.m1222b();
        this.mTextClassifierHelper = new C0257j(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C3121a.m13770d(context, i10) : null, i11 != 0 ? C3121a.m13770d(context, i11) : null, i12 != 0 ? C3121a.m13770d(context, i12) : null, i13 != 0 ? C3121a.m13770d(context, i13) : null);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1235p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C3121a.m13770d(context, i10) : null, i11 != 0 ? C3121a.m13770d(context, i11) : null, i12 != 0 ? C3121a.m13770d(context, i12) : null, i13 != 0 ? C3121a.m13770d(context, i13) : null);
        C0258k c0258k = this.mTextHelper;
        if (c0258k != null) {
            c0258k.m1235p();
        }
    }
}
