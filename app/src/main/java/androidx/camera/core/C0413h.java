package androidx.camera.core;

import android.graphics.Matrix;
import java.util.Objects;
import p279w.C5043j2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.h */
/* loaded from: classes.dex */
public final class C0413h extends AbstractC0455o1 {

    /* renamed from: a */
    private final C5043j2 f1900a;

    /* renamed from: b */
    private final long f1901b;

    /* renamed from: c */
    private final int f1902c;

    /* renamed from: d */
    private final Matrix f1903d;

    public C0413h(C5043j2 c5043j2, long j10, int i10, Matrix matrix) {
        Objects.requireNonNull(c5043j2, "Null tagBundle");
        this.f1900a = c5043j2;
        this.f1901b = j10;
        this.f1902c = i10;
        Objects.requireNonNull(matrix, "Null sensorToBufferTransformMatrix");
        this.f1903d = matrix;
    }

    @Override // androidx.camera.core.AbstractC0455o1, androidx.camera.core.InterfaceC0419i1
    /* renamed from: a */
    public C5043j2 mo2028a() {
        return this.f1900a;
    }

    @Override // androidx.camera.core.AbstractC0455o1, androidx.camera.core.InterfaceC0419i1
    /* renamed from: c */
    public long mo2029c() {
        return this.f1901b;
    }

    @Override // androidx.camera.core.AbstractC0455o1, androidx.camera.core.InterfaceC0419i1
    /* renamed from: d */
    public int mo2030d() {
        return this.f1902c;
    }

    @Override // androidx.camera.core.AbstractC0455o1, androidx.camera.core.InterfaceC0419i1
    /* renamed from: e */
    public Matrix mo2031e() {
        return this.f1903d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0455o1)) {
            return false;
        }
        AbstractC0455o1 abstractC0455o1 = (AbstractC0455o1) obj;
        return this.f1900a.equals(abstractC0455o1.mo2028a()) && this.f1901b == abstractC0455o1.mo2029c() && this.f1902c == abstractC0455o1.mo2030d() && this.f1903d.equals(abstractC0455o1.mo2031e());
    }

    public int hashCode() {
        int hashCode = (this.f1900a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f1901b;
        return ((((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f1902c) * 1000003) ^ this.f1903d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f1900a + ", timestamp=" + this.f1901b + ", rotationDegrees=" + this.f1902c + ", sensorToBufferTransformMatrix=" + this.f1903d + "}";
    }
}
