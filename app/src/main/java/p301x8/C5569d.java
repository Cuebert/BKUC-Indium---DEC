package p301x8;

/* renamed from: x8.d */
/* loaded from: classes.dex */
public class C5569d {

    /* renamed from: a */
    private String f20675a;

    /* renamed from: b */
    private int f20676b;

    /* renamed from: c */
    private String f20677c = null;

    /* renamed from: d */
    private boolean f20678d = true;

    /* renamed from: e */
    int f20679e;

    public C5569d(String str, int i10) {
        this.f20675a = str;
        this.f20676b = i10;
    }

    /* renamed from: a */
    public void m20469a(String str) {
        this.f20677c = str;
    }

    /* renamed from: b */
    public void m20470b(boolean z10) {
        this.f20678d = z10;
    }

    public String toString() {
        return String.format("TCP Response for Address:Port -> %s:%s\nSuccessful: %s\nResponse Code: %s\nResponse Message: %s", this.f20675a, Integer.valueOf(this.f20676b), Boolean.valueOf(this.f20678d), Integer.valueOf(this.f20679e), this.f20677c);
    }
}
