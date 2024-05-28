package com.roblox.client.components;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* loaded from: classes.dex */
public class RbxButton extends Button {

    /* renamed from: n */
    RbxButton f10844n;

    /* renamed from: o */
    C2809j f10845o;

    /* renamed from: p */
    private View.OnClickListener f10846p;

    public RbxButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10844n = null;
        this.f10845o = null;
        C2808i.m12428c(this, context, attributeSet);
        m12307a(attributeSet);
    }

    /* renamed from: a */
    private void m12307a(AttributeSet attributeSet) {
        this.f10844n = this;
        this.f10845o = new C2809j(this, attributeSet);
    }

    /* renamed from: b */
    public void m12308b() {
        super.setOnClickListener(null);
    }

    /* renamed from: c */
    public void m12309c() {
        super.setOnClickListener(this.f10846p);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f10845o.m12445i(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10845o.m12446l(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f10846p = onClickListener;
    }
}
