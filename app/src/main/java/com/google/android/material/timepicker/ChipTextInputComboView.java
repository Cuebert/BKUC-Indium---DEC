package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C2486i;
import com.google.android.material.textfield.TextInputLayout;
import p111i4.C3524f;
import p111i4.C3526h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: n */
    private final Chip f9973n;

    /* renamed from: o */
    private final TextInputLayout f9974o;

    /* renamed from: p */
    private final EditText f9975p;

    /* renamed from: q */
    private TextWatcher f9976q;

    /* renamed from: r */
    private TextView f9977r;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes.dex */
    private class C2528b extends C2486i {
        private C2528b() {
        }

        @Override // com.google.android.material.internal.C2486i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f9973n.setText(ChipTextInputComboView.this.m11704c("00"));
            } else {
                ChipTextInputComboView.this.f9973n.setText(ChipTextInputComboView.this.m11704c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m11704c(CharSequence charSequence) {
        return TimeModel.m11730a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m11705d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f9975p.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9973n.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m11705d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f9973n.setChecked(z10);
        this.f9975p.setVisibility(z10 ? 0 : 4);
        this.f9973n.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            this.f9975p.requestFocus();
            if (TextUtils.isEmpty(this.f9975p.getText())) {
                return;
            }
            EditText editText = this.f9975p;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9973n.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f9973n.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f9973n.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C3526h.f14659i, (ViewGroup) this, false);
        this.f9973n = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C3526h.f14660j, (ViewGroup) this, false);
        this.f9974o = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f9975p = editText;
        editText.setVisibility(4);
        C2528b c2528b = new C2528b();
        this.f9976q = c2528b;
        editText.addTextChangedListener(c2528b);
        m11705d();
        addView(chip);
        addView(textInputLayout);
        this.f9977r = (TextView) findViewById(C3524f.f14634l);
        editText.setSaveEnabled(false);
    }
}
