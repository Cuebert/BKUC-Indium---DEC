package p189o7;

import android.graphics.Rect;
import android.view.View;
import androidx.core.graphics.C0602b;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0684p;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.LiveData;

/* renamed from: o7.a */
/* loaded from: classes.dex */
public class C4145a implements InterfaceC0684p {

    /* renamed from: n */
    private C0851r<Rect> f16884n = new C0851r<>();

    /* renamed from: o */
    private C0851r<Rect> f16885o = new C0851r<>();

    @Override // androidx.core.view.InterfaceC0684p
    /* renamed from: L */
    public C0675g0 mo823L(View view, C0675g0 c0675g0) {
        Rect rect = new Rect();
        rect.top = c0675g0.m3669l();
        rect.left = c0675g0.m3667j();
        rect.right = c0675g0.m3668k();
        rect.bottom = c0675g0.m3666i();
        this.f16884n.mo4867o(rect);
        C0602b m3663f = c0675g0.m3663f(C0675g0.m.m3714a());
        Rect rect2 = new Rect();
        rect2.left = m3663f.f3319a;
        rect2.top = m3663f.f3320b;
        rect2.right = m3663f.f3321c;
        rect2.bottom = m3663f.f3322d;
        this.f16885o.mo4867o(rect2);
        return c0675g0;
    }

    /* renamed from: a */
    public LiveData<Rect> m17185a() {
        return this.f16885o;
    }

    /* renamed from: b */
    public C0851r<Rect> m17186b() {
        return this.f16884n;
    }

    /* renamed from: c */
    public Rect m17187c() {
        return this.f16884n.mo1579f();
    }

    /* renamed from: d */
    public void m17188d(View view) {
        C0690v.m3786B0(view, this);
    }
}
