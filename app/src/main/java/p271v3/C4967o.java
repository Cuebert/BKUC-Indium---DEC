package p271v3;

import com.appsflyer.oaid.BuildConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v3.o */
/* loaded from: classes.dex */
public final class C4967o extends AbstractC4969q {

    /* renamed from: a */
    private String f19031a;

    /* renamed from: b */
    private Boolean f19032b;

    /* renamed from: c */
    private Integer f19033c;

    @Override // p271v3.AbstractC4969q
    /* renamed from: a */
    public final AbstractC4969q mo19390a(boolean z10) {
        this.f19032b = Boolean.TRUE;
        return this;
    }

    @Override // p271v3.AbstractC4969q
    /* renamed from: b */
    public final AbstractC4969q mo19391b(int i10) {
        this.f19033c = 1;
        return this;
    }

    @Override // p271v3.AbstractC4969q
    /* renamed from: c */
    public final AbstractC4970r mo19392c() {
        String str = this.f19031a == null ? " libraryName" : BuildConfig.FLAVOR;
        if (this.f19032b == null) {
            str = str.concat(" enableFirelog");
        }
        if (this.f19033c == null) {
            str = String.valueOf(str).concat(" firelogEventType");
        }
        if (str.isEmpty()) {
            return new C4968p(this.f19031a, this.f19032b.booleanValue(), this.f19033c.intValue(), null);
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    /* renamed from: d */
    public final AbstractC4969q m19393d(String str) {
        this.f19031a = "common";
        return this;
    }
}
