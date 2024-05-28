package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C0492x2;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.i */
/* loaded from: classes.dex */
public final class C0417i extends C0492x2.f {

    /* renamed from: a */
    private final int f1906a;

    /* renamed from: b */
    private final Surface f1907b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0417i(int i10, Surface surface) {
        this.f1906a = i10;
        Objects.requireNonNull(surface, "Null surface");
        this.f1907b = surface;
    }

    @Override // androidx.camera.core.C0492x2.f
    /* renamed from: a */
    public int mo2033a() {
        return this.f1906a;
    }

    @Override // androidx.camera.core.C0492x2.f
    /* renamed from: b */
    public Surface mo2034b() {
        return this.f1907b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0492x2.f)) {
            return false;
        }
        C0492x2.f fVar = (C0492x2.f) obj;
        return this.f1906a == fVar.mo2033a() && this.f1907b.equals(fVar.mo2034b());
    }

    public int hashCode() {
        return ((this.f1906a ^ 1000003) * 1000003) ^ this.f1907b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f1906a + ", surface=" + this.f1907b + "}";
    }
}
