package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p111i4.C3520b;
import p111i4.C3525g;

/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes.dex */
class C2393e {

    /* renamed from: a */
    private static final int[] f8959a = {R.attr.stateListAnimator};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10515a(View view, float f10) {
        int integer = view.getResources().getInteger(C3525g.f14649a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, C3520b.f14508A, -C3520b.f14509B}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
