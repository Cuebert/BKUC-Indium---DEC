package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes.dex */
public class C2396a {

    /* renamed from: a */
    public static final boolean f8995a = false;

    /* renamed from: a */
    public static void m10564a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m10566c(badgeDrawable, view, frameLayout);
        if (badgeDrawable.m10531h() != null) {
            badgeDrawable.m10531h().setForeground(badgeDrawable);
        } else {
            if (!f8995a) {
                view.getOverlay().add(badgeDrawable);
                return;
            }
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static void m10565b(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (!f8995a && badgeDrawable.m10531h() == null) {
            view.getOverlay().remove(badgeDrawable);
        } else {
            badgeDrawable.m10531h().setForeground(null);
        }
    }

    /* renamed from: c */
    public static void m10566c(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.m10542y(view, frameLayout);
    }

    /* renamed from: d */
    public static void m10567d(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
