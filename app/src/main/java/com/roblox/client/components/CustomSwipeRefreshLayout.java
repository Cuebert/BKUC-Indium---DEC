package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.C0932c;

/* loaded from: classes.dex */
public class CustomSwipeRefreshLayout extends C0932c {

    /* renamed from: g0 */
    private int f10801g0;

    /* renamed from: h0 */
    private float f10802h0;

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10801g0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.C0932c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10802h0 = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f10802h0) > this.f10801g0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
