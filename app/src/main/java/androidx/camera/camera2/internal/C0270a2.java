package androidx.camera.camera2.internal;

import p206q.C4288a;
import p255u.C4765i;
import p279w.C5006a1;
import p279w.C5045k0;
import p279w.InterfaceC5063o2;

/* renamed from: androidx.camera.camera2.internal.a2 */
/* loaded from: classes.dex */
final class C0270a2 extends C0319l0 {

    /* renamed from: c */
    static final C0270a2 f1237c = new C0270a2(new C4765i());

    /* renamed from: b */
    private final C4765i f1238b;

    private C0270a2(C4765i c4765i) {
        this.f1238b = c4765i;
    }

    @Override // androidx.camera.camera2.internal.C0319l0, p279w.C5045k0.b
    /* renamed from: a */
    public void mo1337a(InterfaceC5063o2<?> interfaceC5063o2, C5045k0.a aVar) {
        super.mo1337a(interfaceC5063o2, aVar);
        if (interfaceC5063o2 instanceof C5006a1) {
            C5006a1 c5006a1 = (C5006a1) interfaceC5063o2;
            C4288a.a aVar2 = new C4288a.a();
            if (c5006a1.m19474Q()) {
                this.f1238b.m18946a(c5006a1.m19466I(), aVar2);
            }
            aVar.m19594e(aVar2.m17773c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
