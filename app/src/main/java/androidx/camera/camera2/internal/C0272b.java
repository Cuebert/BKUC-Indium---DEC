package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.C0298g0;
import java.util.Objects;
import p279w.C5015c2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.b */
/* loaded from: classes.dex */
public final class C0272b extends C0298g0.h {

    /* renamed from: a */
    private final String f1243a;

    /* renamed from: b */
    private final Class<?> f1244b;

    /* renamed from: c */
    private final C5015c2 f1245c;

    /* renamed from: d */
    private final Size f1246d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0272b(String str, Class<?> cls, C5015c2 c5015c2, Size size) {
        Objects.requireNonNull(str, "Null useCaseId");
        this.f1243a = str;
        Objects.requireNonNull(cls, "Null useCaseType");
        this.f1244b = cls;
        Objects.requireNonNull(c5015c2, "Null sessionConfig");
        this.f1245c = c5015c2;
        this.f1246d = size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0298g0.h
    /* renamed from: c */
    public C5015c2 mo1344c() {
        return this.f1245c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0298g0.h
    /* renamed from: d */
    public Size mo1345d() {
        return this.f1246d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0298g0.h
    /* renamed from: e */
    public String mo1346e() {
        return this.f1243a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0298g0.h)) {
            return false;
        }
        C0298g0.h hVar = (C0298g0.h) obj;
        if (this.f1243a.equals(hVar.mo1346e()) && this.f1244b.equals(hVar.mo1347f()) && this.f1245c.equals(hVar.mo1344c())) {
            Size size = this.f1246d;
            if (size == null) {
                if (hVar.mo1345d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.mo1345d())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0298g0.h
    /* renamed from: f */
    public Class<?> mo1347f() {
        return this.f1244b;
    }

    public int hashCode() {
        int hashCode = (((((this.f1243a.hashCode() ^ 1000003) * 1000003) ^ this.f1244b.hashCode()) * 1000003) ^ this.f1245c.hashCode()) * 1000003;
        Size size = this.f1246d;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f1243a + ", useCaseType=" + this.f1244b + ", sessionConfig=" + this.f1245c + ", surfaceResolution=" + this.f1246d + "}";
    }
}
