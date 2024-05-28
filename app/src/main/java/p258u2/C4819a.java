package p258u2;

/* renamed from: u2.a */
/* loaded from: classes.dex */
public class C4819a {

    /* renamed from: b */
    static int f18690b = 31;

    /* renamed from: a */
    private int f18691a = 1;

    /* renamed from: a */
    public C4819a m19002a(Object obj) {
        this.f18691a = (f18690b * this.f18691a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m19003b() {
        return this.f18691a;
    }

    /* renamed from: c */
    public final C4819a m19004c(boolean z10) {
        this.f18691a = (f18690b * this.f18691a) + (z10 ? 1 : 0);
        return this;
    }
}
