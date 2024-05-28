package p283w3;

/* renamed from: w3.ga */
/* loaded from: classes.dex */
final class C5207ga extends AbstractC5233ia {

    /* renamed from: a */
    private final String f19711a;

    /* renamed from: b */
    private final boolean f19712b;

    /* renamed from: c */
    private final int f19713c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5207ga(String str, boolean z10, int i10, C5181ea c5181ea) {
        this.f19711a = str;
        this.f19712b = z10;
        this.f19713c = i10;
    }

    @Override // p283w3.AbstractC5233ia
    /* renamed from: a */
    public final int mo19835a() {
        return this.f19713c;
    }

    @Override // p283w3.AbstractC5233ia
    /* renamed from: b */
    public final String mo19836b() {
        return this.f19711a;
    }

    @Override // p283w3.AbstractC5233ia
    /* renamed from: c */
    public final boolean mo19837c() {
        return this.f19712b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5233ia) {
            AbstractC5233ia abstractC5233ia = (AbstractC5233ia) obj;
            if (this.f19711a.equals(abstractC5233ia.mo19836b()) && this.f19712b == abstractC5233ia.mo19837c() && this.f19713c == abstractC5233ia.mo19835a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19711a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19712b ? 1237 : 1231)) * 1000003) ^ this.f19713c;
    }

    public final String toString() {
        String str = this.f19711a;
        boolean z10 = this.f19712b;
        int i10 = this.f19713c;
        StringBuilder sb2 = new StringBuilder(str.length() + 84);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
