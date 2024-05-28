package p129j8;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1146f;
import p101h8.C3433g;

/* renamed from: j8.d */
/* loaded from: classes.dex */
public class C3661d implements InterfaceC3670m {

    /* renamed from: a */
    private String f15374a;

    /* renamed from: b */
    private String f15375b;

    /* renamed from: c */
    private long f15376c;

    /* renamed from: d */
    private long f15377d;

    /* renamed from: e */
    private String f15378e;

    public C3661d(C3666i c3666i) throws JSONException, C3433g {
        this.f15374a = c3666i.m15606c();
        JSONObject m15605b = c3666i.m15605b();
        this.f15375b = m15605b.isNull("SenderUserName") ? null : m15605b.getString("SenderUserName");
        this.f15376c = m15605b.getLong("SenderUserId");
        String string = m15605b.isNull("EventDate") ? null : m15605b.getString("EventDate");
        this.f15378e = string;
        this.f15377d = string == null ? -1L : C1146f.m6696a(string);
        m15585d();
    }

    /* renamed from: d */
    private void m15585d() throws C3433g {
        String str = this.f15375b;
        if (str != null && !TextUtils.isEmpty(str)) {
            String str2 = this.f15378e;
            if (str2 == null || TextUtils.isEmpty(str2)) {
                throw new C3433g("FriendRequestReceivedNotification date is null or empty");
            }
            if (this.f15376c <= 0) {
                throw new C3433g("FriendRequestReceivedNotification userId <= 0");
            }
            return;
        }
        throw new C3433g("FriendRequestReceivedNotification username is null or empty");
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: a */
    public long mo15570a() {
        return this.f15377d;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: b */
    public String mo15571b() {
        return this.f15374a;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: c */
    public void mo15572c(InterfaceC3670m interfaceC3670m) {
        if (interfaceC3670m instanceof C3661d) {
            this.f15374a = interfaceC3670m.mo15571b();
            C3661d c3661d = (C3661d) interfaceC3670m;
            this.f15375b = c3661d.m15587f();
            this.f15376c = c3661d.m15586e();
            this.f15377d = interfaceC3670m.mo15570a();
        }
    }

    /* renamed from: e */
    public long m15586e() {
        return this.f15376c;
    }

    /* renamed from: f */
    public String m15587f() {
        return this.f15375b;
    }
}
