package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.C0832a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0843j {

    /* renamed from: n */
    private final Object f4250n;

    /* renamed from: o */
    private final C0832a.a f4251o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4250n = obj;
        this.f4251o = C0832a.f4256c.m4880c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        this.f4251o.m4883a(interfaceC0845l, bVar, this.f4250n);
    }
}
