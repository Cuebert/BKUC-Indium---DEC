package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2489l;
import com.google.android.material.tabs.TabLayout;
import p125j4.C3600a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes.dex */
public class C2508b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RectF m11502a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.m11441x() && (view instanceof TabLayout.C2505i)) {
            return m11503b((TabLayout.C2505i) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    static RectF m11503b(TabLayout.C2505i c2505i, int i10) {
        int contentWidth = c2505i.getContentWidth();
        int contentHeight = c2505i.getContentHeight();
        int m11380b = (int) C2489l.m11380b(c2505i.getContext(), i10);
        if (contentWidth < m11380b) {
            contentWidth = m11380b;
        }
        int left = (c2505i.getLeft() + c2505i.getRight()) / 2;
        int top = (c2505i.getTop() + c2505i.getBottom()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(left - i11, top - (contentHeight / 2), i11 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11501c(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF m11502a = m11502a(tabLayout, view);
        RectF m11502a2 = m11502a(tabLayout, view2);
        drawable.setBounds(C3600a.m15419c((int) m11502a.left, (int) m11502a2.left, f10), drawable.getBounds().top, C3600a.m15419c((int) m11502a.right, (int) m11502a2.right, f10), drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m11504d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m11502a = m11502a(tabLayout, view);
        drawable.setBounds((int) m11502a.left, drawable.getBounds().top, (int) m11502a.right, drawable.getBounds().bottom);
    }
}
