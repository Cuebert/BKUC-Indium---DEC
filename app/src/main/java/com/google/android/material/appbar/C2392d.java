package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C0690v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
public class C2392d {

    /* renamed from: a */
    private final View f8952a;

    /* renamed from: b */
    private int f8953b;

    /* renamed from: c */
    private int f8954c;

    /* renamed from: d */
    private int f8955d;

    /* renamed from: e */
    private int f8956e;

    /* renamed from: f */
    private boolean f8957f = true;

    /* renamed from: g */
    private boolean f8958g = true;

    public C2392d(View view) {
        this.f8952a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10510a() {
        View view = this.f8952a;
        C0690v.m3823b0(view, this.f8955d - (view.getTop() - this.f8953b));
        View view2 = this.f8952a;
        C0690v.m3821a0(view2, this.f8956e - (view2.getLeft() - this.f8954c));
    }

    /* renamed from: b */
    public int m10511b() {
        return this.f8955d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10512c() {
        this.f8953b = this.f8952a.getTop();
        this.f8954c = this.f8952a.getLeft();
    }

    /* renamed from: d */
    public boolean m10513d(int i10) {
        if (!this.f8958g || this.f8956e == i10) {
            return false;
        }
        this.f8956e = i10;
        m10510a();
        return true;
    }

    /* renamed from: e */
    public boolean m10514e(int i10) {
        if (!this.f8957f || this.f8955d == i10) {
            return false;
        }
        this.f8955d = i10;
        m10510a();
        return true;
    }
}
