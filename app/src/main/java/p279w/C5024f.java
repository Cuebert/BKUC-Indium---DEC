package p279w;

import android.util.Size;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.f */
/* loaded from: classes.dex */
public final class C5024f extends AbstractC5039i2 {

    /* renamed from: a */
    private final Size f19162a;

    /* renamed from: b */
    private final Size f19163b;

    /* renamed from: c */
    private final Size f19164c;

    public C5024f(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f19162a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f19163b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f19164c = size3;
    }

    @Override // p279w.AbstractC5039i2
    /* renamed from: b */
    public Size mo19548b() {
        return this.f19162a;
    }

    @Override // p279w.AbstractC5039i2
    /* renamed from: c */
    public Size mo19549c() {
        return this.f19163b;
    }

    @Override // p279w.AbstractC5039i2
    /* renamed from: d */
    public Size mo19550d() {
        return this.f19164c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5039i2)) {
            return false;
        }
        AbstractC5039i2 abstractC5039i2 = (AbstractC5039i2) obj;
        return this.f19162a.equals(abstractC5039i2.mo19548b()) && this.f19163b.equals(abstractC5039i2.mo19549c()) && this.f19164c.equals(abstractC5039i2.mo19550d());
    }

    public int hashCode() {
        return ((((this.f19162a.hashCode() ^ 1000003) * 1000003) ^ this.f19163b.hashCode()) * 1000003) ^ this.f19164c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f19162a + ", previewSize=" + this.f19163b + ", recordSize=" + this.f19164c + "}";
    }
}
