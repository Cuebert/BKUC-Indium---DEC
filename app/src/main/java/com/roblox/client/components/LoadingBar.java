package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.roblox.client.C2738a0;
import com.roblox.client.C2915y;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class LoadingBar extends LinearLayout {

    /* renamed from: n */
    private final ArrayList<ImageView> f10803n;

    /* renamed from: o */
    private boolean f10804o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.components.LoadingBar$b */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2756b implements Animation.AnimationListener {

        /* renamed from: a */
        ImageView f10805a;

        /* renamed from: b */
        AnimationAnimationListenerC2757c f10806b;

        private AnimationAnimationListenerC2756b() {
        }

        /* renamed from: a */
        void m12276a(ImageView imageView) {
            this.f10805a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f10805a.startAnimation(LoadingBar.this.m12273d(this.f10806b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.components.LoadingBar$c */
    /* loaded from: classes.dex */
    public class AnimationAnimationListenerC2757c implements Animation.AnimationListener {

        /* renamed from: a */
        private ImageView f10808a;

        /* renamed from: b */
        AnimationAnimationListenerC2756b f10809b;

        private AnimationAnimationListenerC2757c() {
        }

        /* renamed from: a */
        void m12277a(ImageView imageView) {
            this.f10808a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f10808a.startAnimation(LoadingBar.this.m12272c(this.f10809b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10803n = new ArrayList<>(3);
        m12274e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public AlphaAnimation m12272c(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public AlphaAnimation m12273d(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    /* renamed from: e */
    private void m12274e() {
        LinearLayout.inflate(getContext(), C2738a0.f10398B, this);
        this.f10803n.add((ImageView) findViewById(C2915y.f11906v));
        this.f10803n.add((ImageView) findViewById(C2915y.f11909w));
        this.f10803n.add((ImageView) findViewById(C2915y.f11912x));
    }

    /* renamed from: f */
    private void m12275f() {
        int size = this.f10803n.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageView imageView = this.f10803n.get(i10);
            AnimationAnimationListenerC2757c animationAnimationListenerC2757c = new AnimationAnimationListenerC2757c();
            AnimationAnimationListenerC2756b animationAnimationListenerC2756b = new AnimationAnimationListenerC2756b();
            animationAnimationListenerC2756b.m12276a(imageView);
            animationAnimationListenerC2756b.f10806b = animationAnimationListenerC2757c;
            animationAnimationListenerC2757c.f10809b = animationAnimationListenerC2756b;
            animationAnimationListenerC2757c.m12277a(imageView);
            AlphaAnimation m12273d = m12273d(animationAnimationListenerC2757c);
            m12273d.setStartOffset(i10 * 400);
            imageView.startAnimation(m12273d);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.f10804o) {
            return;
        }
        this.f10804o = true;
        m12275f();
    }
}
