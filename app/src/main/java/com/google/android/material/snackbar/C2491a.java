package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C2495e;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public class C2491a {

    /* renamed from: a */
    private C2495e.b f9675a;

    public C2491a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.m10580K(0.1f);
        swipeDismissBehavior.m10579J(0.6f);
        swipeDismissBehavior.m10581L(0);
    }

    /* renamed from: a */
    public boolean m11388a(View view) {
        return view instanceof C2494d;
    }

    /* renamed from: b */
    public void m11389b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.m2654v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C2495e.m11393b().m11397e(this.f9675a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            C2495e.m11393b().m11398f(this.f9675a);
        }
    }
}
