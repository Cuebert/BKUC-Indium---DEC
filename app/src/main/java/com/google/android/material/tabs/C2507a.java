package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p125j4.C3600a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes.dex */
public class C2507a extends C2508b {
    /* renamed from: e */
    private static float m11499e(float f10) {
        return (float) (1.0d - Math.cos((f10 * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m11500f(float f10) {
        return (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.C2508b
    /* renamed from: c */
    public void mo11501c(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float m11500f;
        float m11499e;
        RectF m11502a = C2508b.m11502a(tabLayout, view);
        RectF m11502a2 = C2508b.m11502a(tabLayout, view2);
        if (m11502a.left < m11502a2.left) {
            m11500f = m11499e(f10);
            m11499e = m11500f(f10);
        } else {
            m11500f = m11500f(f10);
            m11499e = m11499e(f10);
        }
        drawable.setBounds(C3600a.m15419c((int) m11502a.left, (int) m11502a2.left, m11500f), drawable.getBounds().top, C3600a.m15419c((int) m11502a.right, (int) m11502a2.right, m11499e), drawable.getBounds().bottom);
    }
}
