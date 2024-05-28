package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.C0654h;
import androidx.core.view.C0690v;
import p111i4.C3530l;
import p272v4.C4981c;
import p310y4.C5888g;
import p310y4.C5892k;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
final class C2446a {

    /* renamed from: a */
    private final Rect f9326a;

    /* renamed from: b */
    private final ColorStateList f9327b;

    /* renamed from: c */
    private final ColorStateList f9328c;

    /* renamed from: d */
    private final ColorStateList f9329d;

    /* renamed from: e */
    private final int f9330e;

    /* renamed from: f */
    private final C5892k f9331f;

    private C2446a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C5892k c5892k, Rect rect) {
        C0654h.m3465d(rect.left);
        C0654h.m3465d(rect.top);
        C0654h.m3465d(rect.right);
        C0654h.m3465d(rect.bottom);
        this.f9326a = rect;
        this.f9327b = colorStateList2;
        this.f9328c = colorStateList;
        this.f9329d = colorStateList3;
        this.f9330e = i10;
        this.f9331f = c5892k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2446a m11041a(Context context, int i10) {
        C0654h.m3463b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, C3530l.f14765G2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C3530l.f14773H2, 0), obtainStyledAttributes.getDimensionPixelOffset(C3530l.f14789J2, 0), obtainStyledAttributes.getDimensionPixelOffset(C3530l.f14781I2, 0), obtainStyledAttributes.getDimensionPixelOffset(C3530l.f14796K2, 0));
        ColorStateList m19404a = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14803L2);
        ColorStateList m19404a2 = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14838Q2);
        ColorStateList m19404a3 = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14824O2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3530l.f14831P2, 0);
        C5892k m20906m = C5892k.m20863b(context, obtainStyledAttributes.getResourceId(C3530l.f14810M2, 0), obtainStyledAttributes.getResourceId(C3530l.f14817N2, 0)).m20906m();
        obtainStyledAttributes.recycle();
        return new C2446a(m19404a, m19404a2, m19404a3, dimensionPixelSize, m20906m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m11042b() {
        return this.f9326a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m11043c() {
        return this.f9326a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m11044d(TextView textView) {
        C5888g c5888g = new C5888g();
        C5888g c5888g2 = new C5888g();
        c5888g.setShapeAppearanceModel(this.f9331f);
        c5888g2.setShapeAppearanceModel(this.f9331f);
        c5888g.m20835X(this.f9328c);
        c5888g.m20840c0(this.f9330e, this.f9329d);
        textView.setTextColor(this.f9327b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f9327b.withAlpha(30), c5888g, c5888g2);
        Rect rect = this.f9326a;
        C0690v.m3859t0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
