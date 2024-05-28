package p129j8;

import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1146f;

/* renamed from: j8.g */
/* loaded from: classes.dex */
public class C3664g implements InterfaceC3670m {

    /* renamed from: a */
    private String f15387a;

    /* renamed from: b */
    private String f15388b;

    /* renamed from: c */
    private String f15389c;

    /* renamed from: d */
    private String f15390d;

    public C3664g(C3666i c3666i) throws JSONException {
        this.f15387a = c3666i.m15606c();
        JSONObject m15605b = c3666i.m15605b();
        this.f15390d = m15605b.getString("category");
        this.f15388b = m15605b.getString("revokedNotificationType");
        this.f15389c = m15605b.getString("revokeUpToDate");
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: a */
    public long mo15570a() {
        return C1146f.m6696a(this.f15389c);
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: b */
    public String mo15571b() {
        return this.f15387a;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: c */
    public void mo15572c(InterfaceC3670m interfaceC3670m) {
        if (interfaceC3670m instanceof C3664g) {
            this.f15387a = interfaceC3670m.mo15571b();
            C3664g c3664g = (C3664g) interfaceC3670m;
            this.f15388b = c3664g.m15600e();
            this.f15389c = c3664g.m15601f();
            this.f15390d = c3664g.m15599d();
        }
    }

    /* renamed from: d */
    public String m15599d() {
        return this.f15390d;
    }

    /* renamed from: e */
    public String m15600e() {
        return this.f15388b;
    }

    /* renamed from: f */
    public String m15601f() {
        return this.f15389c;
    }
}
