package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes.dex */
public final class C2483f {

    /* renamed from: a */
    private final ArrayList<b> f9630a = new ArrayList<>();

    /* renamed from: b */
    private b f9631b = null;

    /* renamed from: c */
    ValueAnimator f9632c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f9633d = new a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2483f c2483f = C2483f.this;
            if (c2483f.f9632c == animator) {
                c2483f.f9632c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a */
        final int[] f9635a;

        /* renamed from: b */
        final ValueAnimator f9636b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f9635a = iArr;
            this.f9636b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m11346a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f9633d);
        this.f9630a.add(bVar);
    }
}
