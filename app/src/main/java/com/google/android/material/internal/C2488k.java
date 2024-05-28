package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes.dex */
public class C2488k {
    /* renamed from: a */
    public static TextView m11376a(Toolbar toolbar) {
        return m11377b(toolbar, toolbar.getSubtitle());
    }

    /* renamed from: b */
    private static TextView m11377b(Toolbar toolbar, CharSequence charSequence) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static TextView m11378c(Toolbar toolbar) {
        return m11377b(toolbar, toolbar.getTitle());
    }
}
