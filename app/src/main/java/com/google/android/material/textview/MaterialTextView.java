package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p111i4.C3520b;
import p111i4.C3530l;
import p272v4.C4980b;
import p272v4.C4981c;
import p323z4.C6011a;

/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* renamed from: c */
    private void m11697c(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, C3530l.f14917b3);
        int m11700f = m11700f(getContext(), obtainStyledAttributes, C3530l.f14933d3, C3530l.f14941e3);
        obtainStyledAttributes.recycle();
        if (m11700f >= 0) {
            setLineHeight(m11700f);
        }
    }

    /* renamed from: d */
    private static boolean m11698d(Context context) {
        return C4980b.m19401b(context, C3520b.f14511D, true);
    }

    /* renamed from: e */
    private static int m11699e(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C3530l.f14949f3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(C3530l.f14957g3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: f */
    private static int m11700f(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = C4981c.m19406c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    /* renamed from: g */
    private static boolean m11701g(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C3530l.f14949f3, i10, i11);
        int m11700f = m11700f(context, obtainStyledAttributes, C3530l.f14965h3, C3530l.f14973i3);
        obtainStyledAttributes.recycle();
        return m11700f != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (m11698d(context)) {
            m11697c(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(C6011a.m21324c(context, attributeSet, i10, i11), attributeSet, i10);
        int m11699e;
        Context context2 = getContext();
        if (m11698d(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m11701g(context2, theme, attributeSet, i10, i11) || (m11699e = m11699e(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            m11697c(theme, m11699e);
        }
    }
}
