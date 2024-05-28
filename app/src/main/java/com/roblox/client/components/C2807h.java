package com.roblox.client.components;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: com.roblox.client.components.h */
/* loaded from: classes.dex */
public class C2807h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.h$a */
    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f10963a;

        /* renamed from: b */
        final /* synthetic */ float f10964b;

        /* renamed from: c */
        final /* synthetic */ float f10965c;

        a(View view, float f10, float f11) {
            this.f10963a = view;
            this.f10964b = f10;
            this.f10965c = f11;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f10963a.setAlpha(this.f10965c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f10963a.setAlpha(this.f10964b);
        }
    }

    /* renamed from: a */
    public static void m12422a(View view, int i10, float f10, float f11, long j10) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f11);
        alphaAnimation.setDuration(j10);
        view.setAnimation(alphaAnimation);
        view.setVisibility(i10);
    }

    /* renamed from: b */
    public static AlphaAnimation m12423b(View view) {
        return m12424c(view, 1.0f, 0.35f, 200);
    }

    /* renamed from: c */
    private static AlphaAnimation m12424c(View view, float f10, float f11, int i10) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f11);
        alphaAnimation.setDuration(i10);
        alphaAnimation.setAnimationListener(new a(view, f10, f11));
        return alphaAnimation;
    }

    /* renamed from: d */
    public static AlphaAnimation m12425d(View view) {
        return m12424c(view, 0.35f, 1.0f, 200);
    }
}
