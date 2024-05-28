package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
class C2543a implements InputFilter {

    /* renamed from: a */
    private int f10035a;

    public C2543a(int i10) {
        this.f10035a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f10035a) {
                return null;
            }
            return BuildConfig.FLAVOR;
        } catch (NumberFormatException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
