package p309y3;

/* renamed from: y3.x6 */
/* loaded from: classes.dex */
final class C5862x6 extends AbstractC5880z6 {

    /* renamed from: a */
    private final String f21436a;

    /* renamed from: b */
    private final boolean f21437b;

    /* renamed from: c */
    private final int f21438c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5862x6(String str, boolean z10, int i10, C5844v6 c5844v6) {
        this.f21436a = str;
        this.f21437b = z10;
        this.f21438c = i10;
    }

    @Override // p309y3.AbstractC5880z6
    /* renamed from: a */
    public final int mo20782a() {
        return this.f21438c;
    }

    @Override // p309y3.AbstractC5880z6
    /* renamed from: b */
    public final String mo20783b() {
        return this.f21436a;
    }

    @Override // p309y3.AbstractC5880z6
    /* renamed from: c */
    public final boolean mo20784c() {
        return this.f21437b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5880z6) {
            AbstractC5880z6 abstractC5880z6 = (AbstractC5880z6) obj;
            if (this.f21436a.equals(abstractC5880z6.mo20783b()) && this.f21437b == abstractC5880z6.mo20784c() && this.f21438c == abstractC5880z6.mo20782a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21436a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f21437b ? 1237 : 1231)) * 1000003) ^ this.f21438c;
    }

    public final String toString() {
        String str = this.f21436a;
        boolean z10 = this.f21437b;
        int i10 = this.f21438c;
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
