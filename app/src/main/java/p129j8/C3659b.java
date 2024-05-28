package p129j8;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1146f;
import p101h8.C3433g;

/* renamed from: j8.b */
/* loaded from: classes.dex */
public class C3659b implements InterfaceC3670m {

    /* renamed from: a */
    private String f15357a;

    /* renamed from: b */
    private String f15358b;

    /* renamed from: c */
    private String f15359c;

    /* renamed from: d */
    private long f15360d;

    /* renamed from: e */
    private long f15361e;

    /* renamed from: f */
    private long f15362f;

    /* renamed from: g */
    private String f15363g;

    /* renamed from: h */
    private String f15364h;

    /* renamed from: i */
    private String f15365i;

    /* renamed from: j */
    private String f15366j;

    /* renamed from: k */
    private String f15367k;

    /* renamed from: l */
    private String f15368l;

    public C3659b(C3666i c3666i) throws JSONException, C3433g {
        this.f15357a = c3666i.m15606c();
        JSONObject m15605b = c3666i.m15605b();
        this.f15358b = m15605b.isNull("SenderUserName") ? null : m15605b.getString("SenderUserName");
        this.f15359c = m15605b.isNull("SenderDisplayName") ? null : m15605b.getString("SenderDisplayName");
        this.f15360d = m15605b.getLong("SenderUserId");
        String string = m15605b.isNull("EventDate") ? null : m15605b.getString("EventDate");
        this.f15368l = string;
        this.f15361e = string == null ? -1L : C1146f.m6696a(string);
        this.f15363g = m15605b.isNull("ConversationTitle") ? null : m15605b.getString("ConversationTitle");
        this.f15362f = m15605b.getLong("ConversationId");
        this.f15364h = m15605b.isNull("ConversationType") ? null : m15605b.getString("ConversationType");
        this.f15365i = m15605b.isNull("MessageId") ? null : m15605b.getString("MessageId");
        this.f15366j = m15605b.isNull("MessageContent") ? null : m15605b.getString("MessageContent");
        this.f15367k = m15605b.isNull("Category") ? null : m15605b.getString("Category");
        m15568d();
    }

    /* renamed from: d */
    private void m15568d() throws C3433g {
        String str = this.f15358b;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new C3433g("ChatNewMessageNotification senderName is null or empty");
        }
        if (this.f15360d > 0) {
            String str2 = this.f15367k;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                String str3 = this.f15368l;
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    String str4 = this.f15363g;
                    if (str4 == null || TextUtils.isEmpty(str4)) {
                        throw new C3433g("ChatNewMessageNotification conversationTitle is null or empty");
                    }
                    if (this.f15362f > 0) {
                        String str5 = this.f15365i;
                        if (str5 != null && !TextUtils.isEmpty(str5)) {
                            String str6 = this.f15366j;
                            if (str6 != null && !TextUtils.isEmpty(str6)) {
                                String str7 = this.f15364h;
                                if (str7 != null && !TextUtils.isEmpty(str7)) {
                                    if (!m15569n(this.f15364h)) {
                                        throw new C3433g("ChatNewMessageNotification conversationType is invalid");
                                    }
                                    return;
                                }
                                throw new C3433g("ChatNewMessageNotification conversationType is null or empty");
                            }
                            throw new C3433g("ChatNewMessageNotification messageContent is null or empty");
                        }
                        throw new C3433g("ChatNewMessageNotification messageId is null or empty");
                    }
                    throw new C3433g("ChatNewMessageNotification conversationId is null");
                }
                throw new C3433g("ChatNewMessageNotification date is null or empty");
            }
            throw new C3433g("ChatNewMessageNotification category is null or empty");
        }
        throw new C3433g("ChatNewMessageNotification senderId <= 0");
    }

    /* renamed from: n */
    private boolean m15569n(String str) {
        return str.equals("OneToOneConversation") || str.equals("MultiUserConversation");
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: a */
    public long mo15570a() {
        return this.f15361e;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: b */
    public String mo15571b() {
        return this.f15357a;
    }

    @Override // p129j8.InterfaceC3670m
    /* renamed from: c */
    public void mo15572c(InterfaceC3670m interfaceC3670m) {
        if (interfaceC3670m instanceof C3659b) {
            this.f15357a = interfaceC3670m.mo15571b();
            this.f15361e = interfaceC3670m.mo15570a();
            C3659b c3659b = (C3659b) interfaceC3670m;
            this.f15358b = c3659b.m15581m();
            this.f15359c = c3659b.m15579k();
            this.f15360d = c3659b.m15580l();
            this.f15362f = c3659b.m15574f();
            this.f15363g = c3659b.m15575g();
            this.f15364h = c3659b.m15576h();
            this.f15365i = c3659b.m15578j();
            this.f15366j = c3659b.m15577i();
            this.f15367k = c3659b.m15573e();
        }
    }

    /* renamed from: e */
    public String m15573e() {
        return this.f15367k;
    }

    /* renamed from: f */
    public long m15574f() {
        return this.f15362f;
    }

    /* renamed from: g */
    public String m15575g() {
        return this.f15363g;
    }

    /* renamed from: h */
    public String m15576h() {
        return this.f15364h;
    }

    /* renamed from: i */
    public String m15577i() {
        return this.f15366j;
    }

    /* renamed from: j */
    public String m15578j() {
        return this.f15365i;
    }

    /* renamed from: k */
    public String m15579k() {
        return this.f15359c;
    }

    /* renamed from: l */
    public long m15580l() {
        return this.f15360d;
    }

    /* renamed from: m */
    public String m15581m() {
        return this.f15358b;
    }

    public C3659b(String str, long j10, String str2, String str3) {
        this.f15367k = str;
        this.f15362f = j10;
        this.f15363g = str2;
        this.f15357a = str3;
    }
}
