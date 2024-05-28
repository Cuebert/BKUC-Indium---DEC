package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1774s2;
import java.util.List;
import java.util.Map;
import p018b4.InterfaceC1006t;

/* renamed from: com.google.firebase.analytics.a */
/* loaded from: classes.dex */
final class C2571a implements InterfaceC1006t {

    /* renamed from: a */
    final /* synthetic */ C1774s2 f10137a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2571a(C1774s2 c1774s2) {
        this.f10137a = c1774s2;
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: d */
    public final String mo6234d() {
        return this.f10137a.m8799t();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: e */
    public final String mo6235e() {
        return this.f10137a.m8800u();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: g */
    public final String mo6236g() {
        return this.f10137a.m8802w();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: h */
    public final int mo6237h(String str) {
        return this.f10137a.m8795m(str);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: l */
    public final String mo6238l() {
        return this.f10137a.m8801v();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: m */
    public final void mo6239m(String str) {
        this.f10137a.m8786C(str);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: n */
    public final void mo6240n(String str, String str2, Bundle bundle) {
        this.f10137a.m8787D(str, str2, bundle);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: o */
    public final List<Bundle> mo6241o(String str, String str2) {
        return this.f10137a.m8803x(str, str2);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: p */
    public final Map<String, Object> mo6242p(String str, String str2, boolean z10) {
        return this.f10137a.m8804y(str, str2, z10);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: q */
    public final void mo6243q(String str) {
        this.f10137a.m8788E(str);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: r */
    public final void mo6244r(Bundle bundle) {
        this.f10137a.m8791b(bundle);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: s */
    public final void mo6245s(String str, String str2, Bundle bundle) {
        this.f10137a.m8789F(str, str2, bundle);
    }

    @Override // p018b4.InterfaceC1006t
    public final long zzb() {
        return this.f10137a.m8796n();
    }
}
