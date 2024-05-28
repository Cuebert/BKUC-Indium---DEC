package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0846m;
import androidx.lifecycle.C0858y;
import androidx.lifecycle.InterfaceC0859z;
import androidx.savedstate.C0927b;
import androidx.savedstate.InterfaceC0928c;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public class C0823x implements InterfaceC0928c, InterfaceC0859z {

    /* renamed from: n */
    private final Fragment f4188n;

    /* renamed from: o */
    private final C0858y f4189o;

    /* renamed from: p */
    private C0846m f4190p = null;

    /* renamed from: q */
    private C0927b f4191q = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0823x(Fragment fragment, C0858y c0858y) {
        this.f4188n = fragment;
        this.f4189o = c0858y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4814a(AbstractC0839f.b bVar) {
        this.f4190p.m4909h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4815b() {
        if (this.f4190p == null) {
            this.f4190p = new C0846m(this);
            this.f4191q = C0927b.m5897a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m4816c() {
        return this.f4190p != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m4817d(Bundle bundle) {
        this.f4191q.m5899c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4818e(Bundle bundle) {
        this.f4191q.m5900d(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC0845l
    /* renamed from: f */
    public AbstractC0839f mo583f() {
        m4815b();
        return this.f4190p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m4819g(AbstractC0839f.c cVar) {
        this.f4190p.m4911o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0859z
    /* renamed from: i0 */
    public C0858y mo584i0() {
        m4815b();
        return this.f4189o;
    }

    @Override // androidx.savedstate.InterfaceC0928c
    /* renamed from: l */
    public SavedStateRegistry mo586l() {
        m4815b();
        return this.f4191q.m5898b();
    }
}
