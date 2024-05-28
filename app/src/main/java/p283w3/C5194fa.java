package p283w3;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.fa */
/* loaded from: classes.dex */
public final class C5194fa extends AbstractC5220ha {

    /* renamed from: a */
    private String f19688a;

    /* renamed from: b */
    private Boolean f19689b;

    /* renamed from: c */
    private Integer f19690c;

    @Override // p283w3.AbstractC5220ha
    /* renamed from: a */
    public final AbstractC5220ha mo19820a(boolean z10) {
        this.f19689b = Boolean.TRUE;
        return this;
    }

    @Override // p283w3.AbstractC5220ha
    /* renamed from: b */
    public final AbstractC5220ha mo19821b(int i10) {
        this.f19690c = 1;
        return this;
    }

    @Override // p283w3.AbstractC5220ha
    /* renamed from: c */
    public final AbstractC5233ia mo19822c() {
        Boolean bool;
        String str = this.f19688a;
        if (str != null && (bool = this.f19689b) != null && this.f19690c != null) {
            return new C5207ga(str, bool.booleanValue(), this.f19690c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f19688a == null) {
            sb2.append(" libraryName");
        }
        if (this.f19689b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f19690c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: d */
    public final AbstractC5220ha m19823d(String str) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f19688a = str;
        return this;
    }
}
