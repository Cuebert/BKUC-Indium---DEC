package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0156f;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C2524g;
import com.google.android.material.textview.MaterialTextView;
import p151l4.C3873a;
import p260u4.C4859a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0156f {
    @Override // androidx.appcompat.app.C0156f
    /* renamed from: b */
    protected AppCompatAutoCompleteTextView mo852b(Context context, AttributeSet attributeSet) {
        return new C2524g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0156f
    /* renamed from: c */
    protected AppCompatButton mo853c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0156f
    /* renamed from: d */
    protected AppCompatCheckBox mo854d(Context context, AttributeSet attributeSet) {
        return new C3873a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0156f
    /* renamed from: j */
    protected AppCompatRadioButton mo860j(Context context, AttributeSet attributeSet) {
        return new C4859a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0156f
    /* renamed from: n */
    protected AppCompatTextView mo864n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
