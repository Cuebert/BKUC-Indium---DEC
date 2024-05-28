package androidx.camera.core;

import p279w.InterfaceC5034h1;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.r0 */
/* loaded from: classes.dex */
public final class C0466r0 extends AbstractC0462q0 {

    /* renamed from: androidx.camera.core.r0$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0443l1 f2074a;

        a(InterfaceC0443l1 interfaceC0443l1) {
            this.f2074a = interfaceC0443l1;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            this.f2074a.close();
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r12) {
        }
    }

    @Override // androidx.camera.core.AbstractC0462q0
    /* renamed from: d */
    InterfaceC0443l1 mo2188d(InterfaceC5034h1 interfaceC5034h1) {
        return interfaceC5034h1.mo1877i();
    }

    @Override // androidx.camera.core.AbstractC0462q0
    /* renamed from: g */
    public void mo2191g() {
    }

    @Override // androidx.camera.core.AbstractC0462q0
    /* renamed from: p */
    void mo2193p(InterfaceC0443l1 interfaceC0443l1) {
        C5586f.m20502b(m2189e(interfaceC0443l1), new a(interfaceC0443l1), C5493a.m20219a());
    }
}
