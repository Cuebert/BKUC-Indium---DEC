package p019b5;

import p019b5.InterfaceC1016c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b5.z */
/* loaded from: classes.dex */
public final class C1049z extends InterfaceC1016c.a.AbstractC6040a {

    /* renamed from: a */
    private long f5240a;

    /* renamed from: b */
    private byte f5241b;

    @Override // p019b5.InterfaceC1016c.a.AbstractC6040a
    /* renamed from: a */
    public final InterfaceC1016c.a mo6255a() {
        if (this.f5241b == 1) {
            return new C1015b0(this.f5240a, null);
        }
        throw new IllegalStateException("Missing required properties: cloudProjectNumber");
    }

    @Override // p019b5.InterfaceC1016c.a.AbstractC6040a
    /* renamed from: b */
    public final InterfaceC1016c.a.AbstractC6040a mo6256b(long j10) {
        this.f5240a = j10;
        this.f5241b = (byte) 1;
        return this;
    }
}
