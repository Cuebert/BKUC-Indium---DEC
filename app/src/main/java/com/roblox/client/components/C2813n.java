package com.roblox.client.components;

import android.view.MotionEvent;
import p035c9.C1151k;

/* renamed from: com.roblox.client.components.n */
/* loaded from: classes.dex */
public class C2813n {

    /* renamed from: b */
    public static int f10996b = 0;

    /* renamed from: c */
    public static int f10997c = 1;

    /* renamed from: d */
    public static int f10998d = 2;

    /* renamed from: a */
    protected int f10999a = f10996b;

    /* renamed from: a */
    public void m12457a(int i10) {
        this.f10999a = i10;
    }

    /* renamed from: b */
    public boolean m12458b(MotionEvent motionEvent) {
        int i10 = this.f10999a;
        if (i10 > f10996b) {
            if (i10 == f10997c && (motionEvent.getFlags() & 1) == 1) {
                C1151k.m6707a("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f10999a == f10998d && (motionEvent.getFlags() & 2) == 2) {
                C1151k.m6707a("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
