package p129j8;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1146f;
import p101h8.C3433g;

/* renamed from: j8.f */
/* loaded from: classes.dex */
public class C3663f implements InterfaceC3670m {

    /* renamed from: a */
    private String f15380a;

    /* renamed from: b */
    private String f15381b;

    /* renamed from: c */
    private long f15382c;

    /* renamed from: d */
    private String f15383d;

    /* renamed from: e */
    private long f15384e;

    /* renamed from: f */
    private long f15385f;

    /* renamed from: g */
    private String f15386g;

    public C3663f(C3666i c3666i) throws JSONException, C3433g {
        this.f15380a = c3666i.m15606c();
        JSONObject m15605b = c3666i.m15605b();
        this.f15383d = m15605b.isNull("AuthorUserName") ? null : m15605b.getString("AuthorUserName");
        this.f15384e = m15605b.getLong("AuthorUserId");
        this.f15381b = m15605b.isNull("BodyPreview") ? null : m15605b.getString("BodyPreview");
        this.f15382c = m15605b.getLong("MessageId");
        String string = m15605b.isNull("EventDate") ? null : m15605b.getString("EventDate");
        this.f15386g = string;
        this.f15385f = string == null ? -1L : C1146f.m6696a(string);
        m15594d();
    }

    /* renamed from: d */
    private void m15594d() throws C3433g {
        String str = this.f15383d;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new C3433g("PrivateMessageNotification authorUserName is null or empty");
        }
        if (this.f15384e > 0) {
            String str2 = this.f15386g;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                String str3 = this.f15381b;
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    throw new C3433g("PrivateMessageNotification bodyPreview is null or empty");
                }
                if (this.f15382c <= 0) {
                    throw new C3433g("PrivateMessageNotification messageId <= 0");
                }
                return;
            }
            throw new C3433g("PrivateMessageNotification date is null or empty");
        }
        throw new C3433g("PrivateMessageNotification authorUserId <= 0");
    }

    /* renamed from: g */
    private String m15595g() {
        return this.f15381b;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: a */
    public long mo15570a() {
        return this.f15385f;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: b */
    public String mo15571b() {
        return this.f15380a;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: c */
    public void mo15572c(InterfaceC3670m interfaceC3670m) {
        if (interfaceC3670m instanceof C3663f) {
            this.f15380a = interfaceC3670m.mo15571b();
            C3663f c3663f = (C3663f) interfaceC3670m;
            this.f15383d = c3663f.m15597f();
            this.f15384e = c3663f.m15596e();
            this.f15381b = c3663f.m15595g();
            this.f15382c = c3663f.m15598h();
            this.f15385f = interfaceC3670m.mo15570a();
        }
    }

    /* renamed from: e */
    public long m15596e() {
        return this.f15384e;
    }

    /* renamed from: f */
    public String m15597f() {
        return this.f15383d;
    }

    /* renamed from: h */
    public long m15598h() {
        return this.f15382c;
    }
}
