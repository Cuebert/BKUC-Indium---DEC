package p279w;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.c */
/* loaded from: classes.dex */
public final class C5012c extends AbstractC5094y0 {

    /* renamed from: a */
    private final Object f19121a;

    public C5012c(Object obj) {
        Objects.requireNonNull(obj, "Null value");
        this.f19121a = obj;
    }

    @Override // p279w.AbstractC5094y0
    /* renamed from: b */
    public Object mo19487b() {
        return this.f19121a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5094y0) {
            return this.f19121a.equals(((AbstractC5094y0) obj).mo19487b());
        }
        return false;
    }

    public int hashCode() {
        return this.f19121a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f19121a + "}";
    }
}
