package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.C0492x2;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
public final class C0433j extends C0492x2.g {

    /* renamed from: a */
    private final Rect f1983a;

    /* renamed from: b */
    private final int f1984b;

    /* renamed from: c */
    private final int f1985c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0433j(Rect rect, int i10, int i11) {
        Objects.requireNonNull(rect, "Null cropRect");
        this.f1983a = rect;
        this.f1984b = i10;
        this.f1985c = i11;
    }

    @Override // androidx.camera.core.C0492x2.g
    /* renamed from: a */
    public Rect mo2121a() {
        return this.f1983a;
    }

    @Override // androidx.camera.core.C0492x2.g
    /* renamed from: b */
    public int mo2122b() {
        return this.f1984b;
    }

    @Override // androidx.camera.core.C0492x2.g
    /* renamed from: c */
    public int mo2123c() {
        return this.f1985c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0492x2.g)) {
            return false;
        }
        C0492x2.g gVar = (C0492x2.g) obj;
        return this.f1983a.equals(gVar.mo2121a()) && this.f1984b == gVar.mo2122b() && this.f1985c == gVar.mo2123c();
    }

    public int hashCode() {
        return ((((this.f1983a.hashCode() ^ 1000003) * 1000003) ^ this.f1984b) * 1000003) ^ this.f1985c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f1983a + ", rotationDegrees=" + this.f1984b + ", targetRotation=" + this.f1985c + "}";
    }
}
