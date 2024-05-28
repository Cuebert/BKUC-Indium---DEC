package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import p111i4.C3520b;
import p111i4.C3530l;

/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes.dex */
public final class C2487j {

    /* renamed from: a */
    private static final int[] f9661a = {C3520b.f14524j};

    /* renamed from: b */
    private static final int[] f9662b = {C3520b.f14525k};

    /* renamed from: a */
    public static void m11367a(Context context) {
        m11371e(context, f9661a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m11368b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f15088w6, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(C3530l.f15104y6, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C3520b.f14530p, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m11369c(context);
            }
        }
        m11367a(context);
    }

    /* renamed from: c */
    public static void m11369c(Context context) {
        m11371e(context, f9662b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m11370d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f15088w6, i10, i11);
        if (!obtainStyledAttributes.getBoolean(C3530l.f15112z6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z10 = m11372f(context, attributeSet, iArr, i10, i11, iArr2);
        } else {
            z10 = obtainStyledAttributes.getResourceId(C3530l.f15096x6, -1) != -1;
        }
        obtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m11371e(Context context, int[] iArr, String str) {
        if (m11373g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    private static boolean m11372f(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i12, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m11373g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m11374h(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m11368b(context, attributeSet, i10, i11);
        m11370d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    /* renamed from: i */
    public static TintTypedArray m11375i(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m11368b(context, attributeSet, i10, i11);
        m11370d(context, attributeSet, iArr, i10, i11, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, i11);
    }
}
