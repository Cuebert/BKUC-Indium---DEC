package com.roblox.client;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import com.roblox.client.components.C2813n;
import p033c7.C1134c;
import p035c9.C1151k;

/* loaded from: classes.dex */
public class RBXSurfaceView extends SurfaceView {

    /* renamed from: n */
    private Context f10378n;

    /* renamed from: o */
    protected C2813n f10379o;

    public RBXSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10378n = null;
        m12201a();
        this.f10378n = context;
    }

    /* renamed from: a */
    protected void m12201a() {
        C2813n c2813n = new C2813n();
        this.f10379o = c2813n;
        c2813n.m12457a(C1134c.m6537a().mo6600d());
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f10379o.m12458b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return PointerIcon.getSystemIcon(this.f10378n, 0);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        C1151k.m6712f("RBXSurfaceView", "SurfaceView size has changed: old width " + i12 + " new width " + i10 + " old height " + i13 + " new height " + i11);
    }
}
