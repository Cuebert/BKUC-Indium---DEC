package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2219m4;
import com.google.android.gms.measurement.internal.C2221m6;
import java.util.List;
import java.util.Map;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.a */
/* loaded from: classes.dex */
final class C2078a extends AbstractC2081d {

    /* renamed from: a */
    private final C2219m4 f7935a;

    /* renamed from: b */
    private final C2221m6 f7936b;

    public C2078a(C2219m4 c2219m4) {
        super(null);
        C5984j.m21286j(c2219m4);
        this.f7935a = c2219m4;
        this.f7936b = c2219m4.m10109I();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: d */
    public final String mo6234d() {
        return this.f7936b.m10161X();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: e */
    public final String mo6235e() {
        return this.f7936b.m10162Y();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: g */
    public final String mo6236g() {
        return this.f7936b.m10161X();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: h */
    public final int mo6237h(String str) {
        this.f7936b.m10156S(str);
        return 25;
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: l */
    public final String mo6238l() {
        return this.f7936b.m10163Z();
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: m */
    public final void mo6239m(String str) {
        this.f7935a.m10133y().m10397l(str, this.f7935a.mo9767e().mo13782b());
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: n */
    public final void mo6240n(String str, String str2, Bundle bundle) {
        this.f7935a.m10109I().m10168h0(str, str2, bundle);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: o */
    public final List<Bundle> mo6241o(String str, String str2) {
        return this.f7936b.m10165b0(str, str2);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: p */
    public final Map<String, Object> mo6242p(String str, String str2, boolean z10) {
        return this.f7936b.m10166c0(str, str2, z10);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: q */
    public final void mo6243q(String str) {
        this.f7935a.m10133y().m10398m(str, this.f7935a.mo9767e().mo13782b());
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: r */
    public final void mo6244r(Bundle bundle) {
        this.f7936b.m10144D(bundle);
    }

    @Override // p018b4.InterfaceC1006t
    /* renamed from: s */
    public final void mo6245s(String str, String str2, Bundle bundle) {
        this.f7936b.m10172r(str, str2, bundle);
    }

    @Override // p018b4.InterfaceC1006t
    public final long zzb() {
        return this.f7935a.m10114N().m9976r0();
    }
}
