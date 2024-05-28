package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
public class C2391c<V extends View> extends CoordinatorLayout.AbstractC0559c<V> {

    /* renamed from: a */
    private C2392d f8949a;

    /* renamed from: b */
    private int f8950b;

    /* renamed from: c */
    private int f8951c;

    public C2391c() {
        this.f8950b = 0;
        this.f8951c = 0;
    }

    /* renamed from: E */
    public int mo10481E() {
        C2392d c2392d = this.f8949a;
        if (c2392d != null) {
            return c2392d.m10511b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo10504F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.m2636C(v10, i10);
    }

    /* renamed from: G */
    public boolean mo10482G(int i10) {
        C2392d c2392d = this.f8949a;
        if (c2392d != null) {
            return c2392d.m10514e(i10);
        }
        this.f8950b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: l */
    public boolean mo2673l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        mo10504F(coordinatorLayout, v10, i10);
        if (this.f8949a == null) {
            this.f8949a = new C2392d(v10);
        }
        this.f8949a.m10512c();
        this.f8949a.m10510a();
        int i11 = this.f8950b;
        if (i11 != 0) {
            this.f8949a.m10514e(i11);
            this.f8950b = 0;
        }
        int i12 = this.f8951c;
        if (i12 == 0) {
            return true;
        }
        this.f8949a.m10513d(i12);
        this.f8951c = 0;
        return true;
    }

    public C2391c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8950b = 0;
        this.f8951c = 0;
    }
}
