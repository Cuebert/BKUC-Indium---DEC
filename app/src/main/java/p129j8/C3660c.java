package p129j8;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1146f;
import p101h8.C3433g;

/* renamed from: j8.c */
/* loaded from: classes.dex */
public class C3660c implements InterfaceC3670m {

    /* renamed from: a */
    private String f15369a;

    /* renamed from: b */
    private String f15370b;

    /* renamed from: c */
    private long f15371c;

    /* renamed from: d */
    private long f15372d;

    /* renamed from: e */
    private String f15373e;

    public C3660c(C3666i c3666i) throws JSONException, C3433g {
        this.f15369a = c3666i.m15606c();
        JSONObject m15605b = c3666i.m15605b();
        this.f15370b = m15605b.isNull("AccepterUserName") ? null : m15605b.getString("AccepterUserName");
        this.f15371c = m15605b.getLong("AccepterUserId");
        String string = m15605b.isNull("EventDate") ? null : m15605b.getString("EventDate");
        this.f15373e = string;
        this.f15372d = string == null ? -1L : C1146f.m6696a(string);
        m15582d();
    }

    /* renamed from: d */
    private void m15582d() throws C3433g {
        String str = this.f15370b;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new C3433g("FriendRequestAcceptedNotification username is null or empty");
        }
        if (this.f15371c > 0) {
            String str2 = this.f15373e;
            if (str2 == null || TextUtils.isEmpty(str2)) {
                throw new C3433g("FriendRequestAcceptedNotification date is null or empty");
            }
            return;
        }
        throw new C3433g("FriendRequestAcceptedNotification userId <= 0");
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: a */
    public long mo15570a() {
        return this.f15372d;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: b */
    public String mo15571b() {
        return this.f15369a;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: c */
    public void mo15572c(InterfaceC3670m interfaceC3670m) {
        if (interfaceC3670m instanceof C3660c) {
            this.f15369a = interfaceC3670m.mo15571b();
            C3660c c3660c = (C3660c) interfaceC3670m;
            this.f15370b = c3660c.m15584f();
            this.f15371c = c3660c.m15583e();
            this.f15372d = interfaceC3670m.mo15570a();
        }
    }

    /* renamed from: e */
    public long m15583e() {
        return this.f15371c;
    }

    /* renamed from: f */
    public String m15584f() {
        return this.f15370b;
    }
}
