package p081g0;

import android.content.res.ColorStateList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g0.b */
/* loaded from: classes.dex */
public class C3222b implements InterfaceC3224d {
    /* renamed from: n */
    private C3225e m14385n(InterfaceC3223c interfaceC3223c) {
        return (C3225e) interfaceC3223c.m14404e();
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: a */
    public float mo14386a(InterfaceC3223c interfaceC3223c) {
        return m14385n(interfaceC3223c).m14409c();
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: b */
    public void mo14387b(InterfaceC3223c interfaceC3223c, ColorStateList colorStateList) {
        m14385n(interfaceC3223c).m14411f(colorStateList);
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: c */
    public void mo14388c(InterfaceC3223c interfaceC3223c, float f10) {
        m14385n(interfaceC3223c).m14412g(f10, interfaceC3223c.m14403d(), interfaceC3223c.m14402c());
        m14399o(interfaceC3223c);
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: d */
    public void mo14389d(InterfaceC3223c interfaceC3223c, float f10) {
        m14385n(interfaceC3223c).m14413h(f10);
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: e */
    public float mo14390e(InterfaceC3223c interfaceC3223c) {
        return mo14393h(interfaceC3223c) * 2.0f;
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: f */
    public void mo14391f() {
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: g */
    public void mo14392g(InterfaceC3223c interfaceC3223c, float f10) {
        interfaceC3223c.m14401b().setElevation(f10);
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: h */
    public float mo14393h(InterfaceC3223c interfaceC3223c) {
        return m14385n(interfaceC3223c).m14410d();
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: i */
    public float mo14394i(InterfaceC3223c interfaceC3223c) {
        return mo14393h(interfaceC3223c) * 2.0f;
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: j */
    public void mo14395j(InterfaceC3223c interfaceC3223c) {
        mo14388c(interfaceC3223c, mo14386a(interfaceC3223c));
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: k */
    public float mo14396k(InterfaceC3223c interfaceC3223c) {
        return interfaceC3223c.m14401b().getElevation();
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: l */
    public void mo14397l(InterfaceC3223c interfaceC3223c) {
        mo14388c(interfaceC3223c, mo14386a(interfaceC3223c));
    }

    @Override // p081g0.InterfaceC3224d
    /* renamed from: m */
    public ColorStateList mo14398m(InterfaceC3223c interfaceC3223c) {
        return m14385n(interfaceC3223c).m14408b();
    }

    /* renamed from: o */
    public void m14399o(InterfaceC3223c interfaceC3223c) {
        if (!interfaceC3223c.m14403d()) {
            interfaceC3223c.m14400a(0, 0, 0, 0);
            return;
        }
        float mo14386a = mo14386a(interfaceC3223c);
        float mo14393h = mo14393h(interfaceC3223c);
        int ceil = (int) Math.ceil(C3226f.m14414a(mo14386a, mo14393h, interfaceC3223c.m14402c()));
        int ceil2 = (int) Math.ceil(C3226f.m14415b(mo14386a, mo14393h, interfaceC3223c.m14402c()));
        interfaceC3223c.m14400a(ceil, ceil2, ceil, ceil2);
    }
}
