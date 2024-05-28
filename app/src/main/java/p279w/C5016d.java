package p279w;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.d */
/* loaded from: classes.dex */
public final class C5016d extends AbstractC5086v1 {

    /* renamed from: a */
    private final Surface f19143a;

    /* renamed from: b */
    private final Size f19144b;

    /* renamed from: c */
    private final int f19145c;

    public C5016d(Surface surface, Size size, int i10) {
        Objects.requireNonNull(surface, "Null surface");
        this.f19143a = surface;
        Objects.requireNonNull(size, "Null size");
        this.f19144b = size;
        this.f19145c = i10;
    }

    @Override // p279w.AbstractC5086v1
    /* renamed from: b */
    public int mo19525b() {
        return this.f19145c;
    }

    @Override // p279w.AbstractC5086v1
    /* renamed from: c */
    public Size mo19526c() {
        return this.f19144b;
    }

    @Override // p279w.AbstractC5086v1
    /* renamed from: d */
    public Surface mo19527d() {
        return this.f19143a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5086v1)) {
            return false;
        }
        AbstractC5086v1 abstractC5086v1 = (AbstractC5086v1) obj;
        return this.f19143a.equals(abstractC5086v1.mo19527d()) && this.f19144b.equals(abstractC5086v1.mo19526c()) && this.f19145c == abstractC5086v1.mo19525b();
    }

    public int hashCode() {
        return ((((this.f19143a.hashCode() ^ 1000003) * 1000003) ^ this.f19144b.hashCode()) * 1000003) ^ this.f19145c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f19143a + ", size=" + this.f19144b + ", imageFormat=" + this.f19145c + "}";
    }
}
