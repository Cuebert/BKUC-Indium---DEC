package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p111i4.C3520b;
import p111i4.C3530l;
import p272v4.C4980b;
import p272v4.C4981c;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C2447b {

    /* renamed from: a */
    final C2446a f9332a;

    /* renamed from: b */
    final C2446a f9333b;

    /* renamed from: c */
    final C2446a f9334c;

    /* renamed from: d */
    final C2446a f9335d;

    /* renamed from: e */
    final C2446a f9336e;

    /* renamed from: f */
    final C2446a f9337f;

    /* renamed from: g */
    final C2446a f9338g;

    /* renamed from: h */
    final Paint f9339h;

    public C2447b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4980b.m19402c(context, C3520b.f14533s, C2450e.class.getCanonicalName()), C3530l.f15092x2);
        this.f9332a = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f14717A2, 0));
        this.f9338g = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f15100y2, 0));
        this.f9333b = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f15108z2, 0));
        this.f9334c = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f14725B2, 0));
        ColorStateList m19404a = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14733C2);
        this.f9335d = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f14749E2, 0));
        this.f9336e = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f14741D2, 0));
        this.f9337f = C2446a.m11041a(context, obtainStyledAttributes.getResourceId(C3530l.f14757F2, 0));
        Paint paint = new Paint();
        this.f9339h = paint;
        paint.setColor(m19404a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
