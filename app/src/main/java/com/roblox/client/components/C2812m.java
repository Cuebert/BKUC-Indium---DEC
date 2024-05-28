package com.roblox.client.components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.C2817d1;
import com.roblox.client.C2877p0;

/* renamed from: com.roblox.client.components.m */
/* loaded from: classes.dex */
public class C2812m {
    /* renamed from: a */
    public static void m12451a(Toolbar toolbar, Context context, int i10, int i11) {
        View findViewById = toolbar.findViewById(i10);
        if (findViewById != null) {
            ActionMenuView.LayoutParams layoutParams = (ActionMenuView.LayoutParams) findViewById.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).width = (int) C2817d1.m12464c(context, i11);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public static void m12452b(Toolbar toolbar, View.OnClickListener onClickListener) {
        toolbar.setNavigationOnClickListener(onClickListener);
    }

    /* renamed from: c */
    public static void m12453c(Toolbar toolbar, boolean z10) {
        if (C2877p0.m12937n0() || z10) {
            toolbar.setSubtitle(toolbar.getContext() != null ? C2877p0.m12913d(toolbar.getContext()) : null);
        }
    }

    /* renamed from: d */
    public static void m12454d(Toolbar toolbar, int i10) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt != null && childAt.getClass() == AppCompatImageButton.class) {
                ((AppCompatImageButton) childAt).setImageResource(i10);
            }
        }
    }

    /* renamed from: e */
    public static void m12455e(Toolbar toolbar, View.OnClickListener onClickListener) {
        m12456f(toolbar, onClickListener, false);
    }

    /* renamed from: f */
    public static void m12456f(Toolbar toolbar, View.OnClickListener onClickListener, boolean z10) {
        m12453c(toolbar, z10);
        m12452b(toolbar, onClickListener);
    }
}
