package p135k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: k1.a */
/* loaded from: classes.dex */
class C3715a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15806a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m15807b(Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m15808c(Animator animator) {
        animator.resume();
    }
}
