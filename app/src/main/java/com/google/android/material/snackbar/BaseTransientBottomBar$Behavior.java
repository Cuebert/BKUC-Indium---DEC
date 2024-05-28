package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C2491a f9670k = new C2491a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: E */
    public boolean mo10578E(View view) {
        return this.f9670k.m11388a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: k */
    public boolean mo2672k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f9670k.m11389b(coordinatorLayout, view, motionEvent);
        return super.mo2672k(coordinatorLayout, view, motionEvent);
    }
}
