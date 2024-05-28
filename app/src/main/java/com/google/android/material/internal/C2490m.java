package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.m */
/* loaded from: classes.dex */
public class C2490m extends ImageButton {

    /* renamed from: n */
    private int f9669n;

    /* renamed from: b */
    public final void m11385b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f9669n = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f9669n;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        m11385b(i10, true);
    }
}
