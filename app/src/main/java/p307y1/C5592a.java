package p307y1;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y1.a */
/* loaded from: classes.dex */
public final class C5592a<T> extends AbstractC5594c<T> {

    /* renamed from: a */
    private final Integer f20764a;

    /* renamed from: b */
    private final T f20765b;

    /* renamed from: c */
    private final EnumC5595d f20766c;

    public C5592a(Integer num, T t10, EnumC5595d enumC5595d) {
        this.f20764a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f20765b = t10;
        Objects.requireNonNull(enumC5595d, "Null priority");
        this.f20766c = enumC5595d;
    }

    @Override // p307y1.AbstractC5594c
    /* renamed from: a */
    public Integer mo20613a() {
        return this.f20764a;
    }

    @Override // p307y1.AbstractC5594c
    /* renamed from: b */
    public T mo20614b() {
        return this.f20765b;
    }

    @Override // p307y1.AbstractC5594c
    /* renamed from: c */
    public EnumC5595d mo20615c() {
        return this.f20766c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5594c)) {
            return false;
        }
        AbstractC5594c abstractC5594c = (AbstractC5594c) obj;
        Integer num = this.f20764a;
        if (num != null ? num.equals(abstractC5594c.mo20613a()) : abstractC5594c.mo20613a() == null) {
            if (this.f20765b.equals(abstractC5594c.mo20614b()) && this.f20766c.equals(abstractC5594c.mo20615c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f20764a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f20765b.hashCode()) * 1000003) ^ this.f20766c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f20764a + ", payload=" + this.f20765b + ", priority=" + this.f20766c + "}";
    }
}
