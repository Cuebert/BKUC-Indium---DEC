package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C2486i;
import com.google.android.material.textfield.TextInputLayout;
import p066f.C3121a;
import p111i4.C3523e;
import p111i4.C3528j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes.dex */
public class C2526i extends AbstractC2522e {

    /* renamed from: d */
    private final TextWatcher f9964d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC2516f f9965e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC2517g f9966f;

    /* renamed from: com.google.android.material.textfield.i$a */
    /* loaded from: classes.dex */
    class a extends C2486i {
        a() {
        }

        @Override // com.google.android.material.internal.C2486i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C2526i.this.f9933c.setChecked(!r1.m11695g());
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    /* loaded from: classes.dex */
    class b implements TextInputLayout.InterfaceC2516f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2516f
        /* renamed from: a */
        public void mo11593a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C2526i.this.f9933c.setChecked(!r4.m11695g());
            editText.removeTextChangedListener(C2526i.this.f9964d);
            editText.addTextChangedListener(C2526i.this.f9964d);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    /* loaded from: classes.dex */
    class c implements TextInputLayout.InterfaceC2517g {

        /* renamed from: com.google.android.material.textfield.i$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ EditText f9970n;

            a(EditText editText) {
                this.f9970n = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9970n.removeTextChangedListener(C2526i.this.f9964d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2517g
        /* renamed from: a */
        public void mo11594a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C2526i.this.f9931a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C2526i.this.m11695g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C2526i.this.f9931a.m11580V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2526i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9964d = new a();
        this.f9965e = new b();
        this.f9966f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m11695g() {
        EditText editText = this.f9931a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m11696h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2522e
    /* renamed from: a */
    public void mo11604a() {
        this.f9931a.setEndIconDrawable(C3121a.m13770d(this.f9932b, C3523e.f14600a));
        TextInputLayout textInputLayout = this.f9931a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C3528j.f14690t));
        this.f9931a.setEndIconOnClickListener(new d());
        this.f9931a.m11583e(this.f9965e);
        this.f9931a.m11585f(this.f9966f);
        EditText editText = this.f9931a.getEditText();
        if (m11696h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
