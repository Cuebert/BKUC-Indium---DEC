package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.InterfaceC0313j2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p218r.C4374b;
import p218r.C4378d;

/* renamed from: androidx.camera.camera2.internal.w2 */
/* loaded from: classes.dex */
final class C0365w2 extends InterfaceC0313j2.a {

    /* renamed from: a */
    private final List<InterfaceC0313j2.a> f1648a;

    C0365w2(List<InterfaceC0313j2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f1648a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static InterfaceC0313j2.a m1802v(InterfaceC0313j2.a... aVarArr) {
        return new C0365w2(Arrays.asList(aVarArr));
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: n */
    public void mo1591n(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1591n(interfaceC0313j2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: o */
    public void mo1592o(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1592o(interfaceC0313j2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: p */
    public void mo1593p(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1593p(interfaceC0313j2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: q */
    public void mo1594q(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1594q(interfaceC0313j2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: r */
    public void mo1595r(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1595r(interfaceC0313j2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: s */
    public void mo1596s(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1596s(interfaceC0313j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: t */
    public void mo1597t(InterfaceC0313j2 interfaceC0313j2) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1597t(interfaceC0313j2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: u */
    public void mo1598u(InterfaceC0313j2 interfaceC0313j2, Surface surface) {
        Iterator<InterfaceC0313j2.a> it = this.f1648a.iterator();
        while (it.hasNext()) {
            it.next().mo1598u(interfaceC0313j2, surface);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.w2$a */
    /* loaded from: classes.dex */
    static class a extends InterfaceC0313j2.a {

        /* renamed from: a */
        private final CameraCaptureSession.StateCallback f1649a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f1649a = stateCallback;
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: n */
        public void mo1591n(InterfaceC0313j2 interfaceC0313j2) {
            this.f1649a.onActive(interfaceC0313j2.mo1587i().m18125c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: o */
        public void mo1592o(InterfaceC0313j2 interfaceC0313j2) {
            C4378d.m18114b(this.f1649a, interfaceC0313j2.mo1587i().m18125c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: p */
        public void mo1593p(InterfaceC0313j2 interfaceC0313j2) {
            this.f1649a.onClosed(interfaceC0313j2.mo1587i().m18125c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: q */
        public void mo1594q(InterfaceC0313j2 interfaceC0313j2) {
            this.f1649a.onConfigureFailed(interfaceC0313j2.mo1587i().m18125c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: r */
        public void mo1595r(InterfaceC0313j2 interfaceC0313j2) {
            this.f1649a.onConfigured(interfaceC0313j2.mo1587i().m18125c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: s */
        public void mo1596s(InterfaceC0313j2 interfaceC0313j2) {
            this.f1649a.onReady(interfaceC0313j2.mo1587i().m18125c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: t */
        public void mo1597t(InterfaceC0313j2 interfaceC0313j2) {
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: u */
        public void mo1598u(InterfaceC0313j2 interfaceC0313j2, Surface surface) {
            C4374b.m18111a(this.f1649a, interfaceC0313j2.mo1587i().m18125c(), surface);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(List<CameraCaptureSession.StateCallback> list) {
            this(C0294f1.m1401a(list));
        }
    }
}
