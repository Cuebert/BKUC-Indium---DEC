package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.o */
/* loaded from: classes.dex */
public class C0683o {

    /* renamed from: a */
    private int f3629a;

    /* renamed from: b */
    private int f3630b;

    public C0683o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m3770a() {
        return this.f3629a | this.f3630b;
    }

    /* renamed from: b */
    public void m3771b(View view, View view2, int i10) {
        m3772c(view, view2, i10, 0);
    }

    /* renamed from: c */
    public void m3772c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f3630b = i10;
        } else {
            this.f3629a = i10;
        }
    }

    /* renamed from: d */
    public void m3773d(View view) {
        m3774e(view, 0);
    }

    /* renamed from: e */
    public void m3774e(View view, int i10) {
        if (i10 == 1) {
            this.f3630b = 0;
        } else {
            this.f3629a = 0;
        }
    }
}
