package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.internal.C2482e;
import com.google.android.material.internal.C2487j;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3524f;
import p111i4.C3529k;
import p111i4.C3530l;
import p323z4.C6011a;

/* loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: n */
    private final Rect f9782n;

    /* renamed from: o */
    private boolean f9783o;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14527m);
    }

    /* renamed from: a */
    private String m11505a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z10 = !TextUtils.isEmpty(text);
        boolean z11 = !TextUtils.isEmpty(hint);
        setLabelFor(C3524f.f14619M);
        String str = BuildConfig.FLAVOR;
        String charSequence = z11 ? hint.toString() : BuildConfig.FLAVOR;
        if (!z10) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb2.append(str);
        return sb2.toString();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f9783o || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f9782n);
        rect.bottom = this.f9782n.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f9783o && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f9782n, point);
            rect.bottom = this.f9782n.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m11578O()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m11578O() && super.getHint() == null && C2482e.m11345a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(m11505a(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f9783o) {
            this.f9782n.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C3522d.f14564R), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f9782n, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f9783o = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(C6011a.m21324c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f9782n = new Rect();
        TypedArray m11374h = C2487j.m11374h(context, attributeSet, C3530l.f14975i5, i10, C3529k.f14699i, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m11374h.getBoolean(C3530l.f14983j5, false));
        m11374h.recycle();
    }
}
