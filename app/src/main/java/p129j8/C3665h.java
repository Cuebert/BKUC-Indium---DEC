package p129j8;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j8.h */
/* loaded from: classes.dex */
public class C3665h implements InterfaceC3670m {

    /* renamed from: a */
    private String f15391a;

    /* renamed from: b */
    private String f15392b;

    /* renamed from: c */
    private String f15393c;

    public C3665h(C3666i c3666i) throws JSONException {
        this.f15391a = c3666i.m15606c();
        JSONObject m15605b = c3666i.m15605b();
        this.f15392b = m15605b.getString("revokedNotificationType");
        this.f15393c = m15605b.getString("revokedNotificationId");
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: a */
    public long mo15570a() {
        return 0L;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: b */
    public String mo15571b() {
        return this.f15391a;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: c */
    public void mo15572c(InterfaceC3670m interfaceC3670m) {
        if (interfaceC3670m instanceof C3665h) {
            this.f15391a = interfaceC3670m.mo15571b();
            C3665h c3665h = (C3665h) interfaceC3670m;
            this.f15393c = c3665h.m15602d();
            this.f15392b = c3665h.m15603e();
        }
    }

    /* renamed from: d */
    public String m15602d() {
        return this.f15393c;
    }

    /* renamed from: e */
    public String m15603e() {
        return this.f15392b;
    }
}
