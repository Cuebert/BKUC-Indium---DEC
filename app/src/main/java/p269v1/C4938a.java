package p269v1;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public class C4938a {

    /* renamed from: a */
    private String f18990a;

    /* renamed from: b */
    private long f18991b;

    /* renamed from: c */
    private int f18992c;

    public C4938a(String str) {
        this.f18990a = str;
    }

    /* renamed from: a */
    public long m19363a() {
        return this.f18991b;
    }

    /* renamed from: b */
    public int m19364b() {
        return this.f18992c;
    }

    /* renamed from: c */
    public String m19365c() {
        return this.f18990a;
    }

    /* renamed from: d */
    public void m19366d(long j10) {
        this.f18991b = j10;
    }

    /* renamed from: e */
    public void m19367e(int i10) {
        this.f18992c = i10;
    }

    public String toString() {
        return "SchedulerConstraint{uuid='" + this.f18990a + "', delayInMs=" + this.f18991b + ", networkStatus=" + this.f18992c + '}';
    }
}
