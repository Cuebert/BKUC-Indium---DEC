package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes.dex */
public abstract class AbstractC2522e {

    /* renamed from: a */
    TextInputLayout f9931a;

    /* renamed from: b */
    Context f9932b;

    /* renamed from: c */
    CheckableImageButton f9933c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2522e(TextInputLayout textInputLayout) {
        this.f9931a = textInputLayout;
        this.f9932b = textInputLayout.getContext();
        this.f9933c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo11604a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11645b(int i10) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11605c(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo11646d() {
        return false;
    }
}
