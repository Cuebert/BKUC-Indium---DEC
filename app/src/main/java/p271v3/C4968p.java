package p271v3;

/* renamed from: v3.p */
/* loaded from: classes.dex */
final class C4968p extends AbstractC4970r {

    /* renamed from: a */
    private final String f19034a;

    /* renamed from: b */
    private final boolean f19035b;

    /* renamed from: c */
    private final int f19036c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4968p(String str, boolean z10, int i10, C4966n c4966n) {
        this.f19034a = str;
        this.f19035b = z10;
        this.f19036c = i10;
    }

    @Override // p271v3.AbstractC4970r
    /* renamed from: a */
    public final int mo19394a() {
        return this.f19036c;
    }

    @Override // p271v3.AbstractC4970r
    /* renamed from: b */
    public final String mo19395b() {
        return this.f19034a;
    }

    @Override // p271v3.AbstractC4970r
    /* renamed from: c */
    public final boolean mo19396c() {
        return this.f19035b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4970r) {
            AbstractC4970r abstractC4970r = (AbstractC4970r) obj;
            if (this.f19034a.equals(abstractC4970r.mo19395b()) && this.f19035b == abstractC4970r.mo19396c() && this.f19036c == abstractC4970r.mo19394a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19034a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19035b ? 1237 : 1231)) * 1000003) ^ this.f19036c;
    }

    public final String toString() {
        String str = this.f19034a;
        boolean z10 = this.f19035b;
        int i10 = this.f19036c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 84);
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
