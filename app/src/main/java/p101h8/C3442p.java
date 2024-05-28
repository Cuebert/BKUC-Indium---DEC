package p101h8;

import android.content.Context;
import java.util.HashMap;
import p035c9.C1151k;
import p129j8.InterfaceC3670m;

/* renamed from: h8.p */
/* loaded from: classes.dex */
public class C3442p {

    /* renamed from: a */
    private HashMap<String, InterfaceC3435i> f14327a;

    /* renamed from: b */
    private HashMap<Long, String> f14328b;

    /* renamed from: h8.p$b */
    /* loaded from: classes.dex */
    private class b implements InterfaceC3435i {

        /* renamed from: a */
        private String f14329a;

        public b(String str) {
            this.f14329a = str;
        }

        @Override // p101h8.InterfaceC3435i
        /* renamed from: b */
        public void mo15052b(Context context, String str) {
            C1151k.m6709c("rbx.push", "PNS expireById() unknown type: " + this.f14329a);
        }

        @Override // p101h8.InterfaceC3435i
        /* renamed from: c */
        public void mo15053c(Context context, InterfaceC3670m interfaceC3670m) {
            C1151k.m6709c("rbx.push", "PNS put() unknown type: " + this.f14329a);
        }

        @Override // p101h8.InterfaceC3435i
        public void clear() {
            C1151k.m6709c("rbx.push", "PNS clear() unknown type: " + this.f14329a);
        }

        @Override // p101h8.InterfaceC3435i
        /* renamed from: d */
        public void mo15054d(Context context, long j10) {
            C1151k.m6709c("rbx.push", "PNS expireToDate() unknown type: " + this.f14329a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.p$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public static final C3442p f14331a = new C3442p();
    }

    /* renamed from: c */
    public static C3442p m15144c() {
        return c.f14331a;
    }

    /* renamed from: a */
    public void m15145a() {
        this.f14328b.clear();
        this.f14327a.clear();
        m15150g();
    }

    /* renamed from: b */
    public InterfaceC3435i m15146b(String str) {
        return this.f14327a.get(str);
    }

    /* renamed from: d */
    public InterfaceC3435i m15147d(String str) {
        if (!this.f14327a.containsKey(str)) {
            this.f14327a.put(str, new b(str));
        }
        return this.f14327a.get(str);
    }

    /* renamed from: e */
    public InterfaceC3435i m15148e(String str, long j10) {
        if (!this.f14327a.containsKey(str)) {
            this.f14327a.put(str, new C3428b(j10));
        }
        return this.f14327a.get(str);
    }

    /* renamed from: f */
    public String m15149f(long j10) {
        return this.f14328b.get(Long.valueOf(j10));
    }

    /* renamed from: g */
    public void m15150g() {
        this.f14327a.put("FriendRequestReceived", new C3432f());
        this.f14327a.put("FriendRequestAccepted", new C3431e());
        this.f14327a.put("PrivateMessageReceived", new C3437k());
    }

    /* renamed from: h */
    public String m15151h(long j10, String str) {
        return this.f14328b.put(Long.valueOf(j10), str);
    }

    /* renamed from: i */
    public void m15152i(String str) {
        this.f14327a.remove(str);
    }

    private C3442p() {
        this.f14327a = new HashMap<>();
        this.f14328b = new HashMap<>();
        m15150g();
    }
}
