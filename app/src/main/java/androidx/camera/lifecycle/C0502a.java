package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.InterfaceC0845l;
import java.util.Objects;
import p318z.C5937e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.lifecycle.a */
/* loaded from: classes.dex */
public final class C0502a extends LifecycleCameraRepository.AbstractC0501a {

    /* renamed from: a */
    private final InterfaceC0845l f2246a;

    /* renamed from: b */
    private final C5937e.b f2247b;

    public C0502a(InterfaceC0845l interfaceC0845l, C5937e.b bVar) {
        Objects.requireNonNull(interfaceC0845l, "Null lifecycleOwner");
        this.f2246a = interfaceC0845l;
        Objects.requireNonNull(bVar, "Null cameraId");
        this.f2247b = bVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC0501a
    /* renamed from: b */
    public C5937e.b mo2379b() {
        return this.f2247b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC0501a
    /* renamed from: c */
    public InterfaceC0845l mo2380c() {
        return this.f2246a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.AbstractC0501a)) {
            return false;
        }
        LifecycleCameraRepository.AbstractC0501a abstractC0501a = (LifecycleCameraRepository.AbstractC0501a) obj;
        return this.f2246a.equals(abstractC0501a.mo2380c()) && this.f2247b.equals(abstractC0501a.mo2379b());
    }

    public int hashCode() {
        return ((this.f2246a.hashCode() ^ 1000003) * 1000003) ^ this.f2247b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f2246a + ", cameraId=" + this.f2247b + "}";
    }
}
