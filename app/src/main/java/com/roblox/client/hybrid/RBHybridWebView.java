package com.roblox.client.hybrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.roblox.client.components.C2813n;
import p033c7.C1134c;
import p154l7.C3887a;
import p154l7.C3888b;
import p154l7.C3889c;
import p154l7.C3890d;
import p154l7.C3891e;
import p154l7.C3892f;
import p154l7.C3893g;
import p154l7.C3894h;
import p154l7.C3895i;
import p154l7.C3896j;
import p156l9.C3902c;

/* loaded from: classes.dex */
public class RBHybridWebView extends C3902c {

    /* renamed from: p */
    protected C2813n f11264p;

    public RBHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p156l9.C3902c
    /* renamed from: c */
    public void mo12619c(Context context) {
        super.mo12619c(context);
        C2813n c2813n = new C2813n();
        this.f11264p = c2813n;
        c2813n.m12457a(C1134c.m6537a().mo6600d());
    }

    @Override // p156l9.C3902c
    /* renamed from: f */
    protected void mo12620f(Context context) {
        m16551e(new C3896j());
        m16551e(new C3889c());
        m16551e(new C3887a());
        m16551e(new C3890d());
        m16551e(new C3888b());
        m16551e(new C3895i());
        m16551e(new C3894h(context));
        m16551e(new C3892f());
        m16551e(new C3893g());
        m16551e(new C3891e());
    }

    /* renamed from: g */
    public void mo12621g() {
    }

    /* renamed from: h */
    public void mo12622h() {
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f11264p.m12458b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    public RBHybridWebView(Context context) {
        super(context);
    }
}
