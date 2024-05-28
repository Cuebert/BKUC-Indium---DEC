package p309y3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y3.w6 */
/* loaded from: classes.dex */
public final class C5853w6 extends AbstractC5871y6 {

    /* renamed from: a */
    private String f21415a;

    /* renamed from: b */
    private Boolean f21416b;

    /* renamed from: c */
    private Integer f21417c;

    @Override // p309y3.AbstractC5871y6
    /* renamed from: a */
    public final AbstractC5871y6 mo20776a(boolean z10) {
        this.f21416b = Boolean.TRUE;
        return this;
    }

    @Override // p309y3.AbstractC5871y6
    /* renamed from: b */
    public final AbstractC5871y6 mo20777b(int i10) {
        this.f21417c = 1;
        return this;
    }

    @Override // p309y3.AbstractC5871y6
    /* renamed from: c */
    public final AbstractC5880z6 mo20778c() {
        Boolean bool;
        String str = this.f21415a;
        if (str != null && (bool = this.f21416b) != null && this.f21417c != null) {
            return new C5862x6(str, bool.booleanValue(), this.f21417c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f21415a == null) {
            sb2.append(" libraryName");
        }
        if (this.f21416b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f21417c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: d */
    public final AbstractC5871y6 m20779d(String str) {
        this.f21415a = "vision-common";
        return this;
    }
}
