package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import p284w4.C5457b;
import p297x4.InterfaceC5548b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
public class C2473b extends C2472a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2473b(FloatingActionButton floatingActionButton, InterfaceC5548b interfaceC5548b) {
        super(floatingActionButton, interfaceC5548b);
    }

    /* renamed from: e0 */
    private Animator m11260e0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f9513x, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f9513x, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C2472a.f9479E);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: A */
    public void mo11212A() {
        m11238b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: C */
    public void mo11214C(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f9513x.isEnabled()) {
                this.f9513x.setElevation(this.f9496g);
                if (this.f9513x.isPressed()) {
                    this.f9513x.setTranslationZ(this.f9498i);
                    return;
                } else if (!this.f9513x.isFocused() && !this.f9513x.isHovered()) {
                    this.f9513x.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f9513x.setTranslationZ(this.f9497h);
                    return;
                }
            }
            this.f9513x.setElevation(0.0f);
            this.f9513x.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: D */
    void mo11215D(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f9513x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C2472a.f9480F, m11260e0(f10, f12));
            stateListAnimator.addState(C2472a.f9481G, m11260e0(f10, f11));
            stateListAnimator.addState(C2472a.f9482H, m11260e0(f10, f11));
            stateListAnimator.addState(C2472a.f9483I, m11260e0(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f9513x, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f9513x;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f9513x, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C2472a.f9479E);
            stateListAnimator.addState(C2472a.f9484J, animatorSet);
            stateListAnimator.addState(C2472a.f9485K, m11260e0(0.0f, 0.0f));
            this.f9513x.setStateListAnimator(stateListAnimator);
        }
        if (mo11233V()) {
            m11238b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: I */
    boolean mo11220I() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: R */
    public void mo11229R(ColorStateList colorStateList) {
        Drawable drawable = this.f9492c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C5457b.m20047d(colorStateList));
        } else {
            super.mo11229R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: V */
    boolean mo11233V() {
        return this.f9514y.mo11198b() || !m11234X();
    }

    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: Z */
    void mo11236Z() {
    }

    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: m */
    public float mo11244m() {
        return this.f9513x.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: r */
    public void mo11248r(Rect rect) {
        if (this.f9514y.mo11198b()) {
            super.mo11248r(rect);
        } else if (!m11234X()) {
            int sizeDimension = (this.f9499j - this.f9513x.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2472a
    /* renamed from: y */
    public void mo11255y() {
    }
}
