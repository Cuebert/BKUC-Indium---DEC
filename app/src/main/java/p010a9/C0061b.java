package p010a9;

import com.roblox.client.C2877p0;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p100h7.C3416i;
import p100h7.C3417j;
import p100h7.InterfaceC3413f;
import p100h7.InterfaceC3419l;
import p114i7.C3540a;
import p114i7.C3541b;
import p277v9.C4995a;
import p300x7.C5563e;

/* renamed from: a9.b */
/* loaded from: classes.dex */
public class C0061b {

    /* renamed from: a */
    protected C5563e f230a;

    /* renamed from: b */
    protected InterfaceC3413f f231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a9.b$a */
    /* loaded from: classes.dex */
    public class a extends C3416i {

        /* renamed from: a */
        final /* synthetic */ c f232a;

        /* renamed from: b */
        final /* synthetic */ String f233b;

        a(c cVar, String str) {
            this.f232a = cVar;
            this.f233b = str;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            int m15027b = c3417j.m15027b();
            String str = "FailureUnknownError";
            String str2 = "FailureJSON";
            d dVar = null;
            int i10 = -1000;
            if (m15027b == 200) {
                C1151k.m6712f("rbx.2sv", "callAuthResend2SVCode. 2SV code resent.");
                try {
                    JSONObject jSONObject = new JSONObject(c3417j.m15026a());
                    this.f232a.mo274c(jSONObject.getString("ticket"), jSONObject.getString("mediaType"));
                    str = null;
                } catch (JSONException unused) {
                    C1151k.m6709c("rbx.2sv", "callAuthResend2SVCode. Error parsing json response.");
                }
            } else {
                try {
                    str2 = null;
                    dVar = new d(c3417j.m15026a());
                } catch (JSONException unused2) {
                }
                if (dVar != null) {
                    if (m15027b == 400) {
                        int i11 = dVar.f19089a;
                        if (i11 == 1) {
                            i10 = -1001;
                            str = "Failure2SVUserNotFound";
                        } else if (i11 == 5) {
                            i10 = -1002;
                            str = "Failure2SVDisabled";
                        } else if (i11 == 7) {
                            i10 = -1003;
                            str = "Failure2SVCredentialsCheck";
                        }
                    } else if (m15027b == 429) {
                        i10 = -1005;
                        str = "Failure2SVFloodCheck";
                    }
                }
                str = str2;
            }
            if (str != null) {
                C1151k.m6712f("rbx.2sv", "callAuthResend2SVCode. code:" + c3417j.m15027b() + " error:" + str);
                C0061b.this.f230a.m20414a(str, this.f233b, c3417j);
                this.f232a.mo273b(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a9.b$b */
    /* loaded from: classes.dex */
    public class b extends C3416i {

        /* renamed from: a */
        final /* synthetic */ c f235a;

        /* renamed from: b */
        final /* synthetic */ String f236b;

        b(c cVar, String str) {
            this.f235a = cVar;
            this.f236b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0078  */
        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo281b(p100h7.C3417j r11) {
            /*
                r10 = this;
                int r0 = r11.m15027b()
                r1 = 1
                java.lang.String r2 = "rbx.2sv"
                r3 = 0
                java.lang.String r4 = "FailureUnknownError"
                r5 = -1000(0xfffffffffffffc18, float:NaN)
                r6 = 0
                r7 = 200(0xc8, float:2.8E-43)
                if (r0 != r7) goto L2a
                java.lang.String r0 = "callAuthVerify2SVCode. 2SV code verified."
                p035c9.C1151k.m6712f(r2, r0)
                a9.b r0 = p010a9.C0061b.this
                x7.e r0 = r0.f230a
                int r1 = r11.m15027b()
                r0.m20416b(r1)
                a9.b$c r0 = r10.f235a
                r7 = -1
                r0.mo275e(r7)
            L28:
                r1 = 0
                goto L76
            L2a:
                a9.b$d r7 = new a9.b$d     // Catch: org.json.JSONException -> L37
                java.lang.String r8 = r11.m15026a()     // Catch: org.json.JSONException -> L37
                r7.<init>(r8)     // Catch: org.json.JSONException -> L37
                r9 = r7
                r7 = r3
                r3 = r9
                goto L39
            L37:
                java.lang.String r7 = "FailureJSON"
            L39:
                if (r3 == 0) goto L74
                r7 = 400(0x190, float:5.6E-43)
                if (r0 == r7) goto L5f
                r1 = 429(0x1ad, float:6.01E-43)
                if (r0 == r1) goto L54
                r1 = 503(0x1f7, float:7.05E-43)
                if (r0 == r1) goto L49
            L47:
                r3 = r4
                goto L28
            L49:
                int r0 = r3.f19089a
                r1 = 2
                if (r0 == r1) goto L4f
                goto L47
            L4f:
                r5 = -1002(0xfffffffffffffc16, float:NaN)
                java.lang.String r3 = "Failure2SVDisabled"
                goto L28
            L54:
                int r0 = r3.f19089a
                r1 = 3
                if (r0 == r1) goto L5a
                goto L47
            L5a:
                r5 = -1005(0xfffffffffffffc13, float:NaN)
                java.lang.String r3 = "Failure2SVFloodCheck"
                goto L28
            L5f:
                int r0 = r3.f19089a
                if (r0 == r1) goto L6f
                r3 = 6
                if (r0 == r3) goto L67
                goto L47
            L67:
                a9.b$c r0 = r10.f235a
                r0.mo272a()
                java.lang.String r3 = "Failure2SVInvalidCode"
                goto L76
            L6f:
                r5 = -1001(0xfffffffffffffc17, float:NaN)
                java.lang.String r3 = "Failure2SVUserNotFound"
                goto L28
            L74:
                r3 = r7
                goto L28
            L76:
                if (r3 == 0) goto La8
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "SM.callAuthVerify2SVCode() code:"
                r0.append(r4)
                int r4 = r11.m15027b()
                r0.append(r4)
                java.lang.String r4 = " error:"
                r0.append(r4)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                p035c9.C1151k.m6712f(r2, r0)
                a9.b r0 = p010a9.C0061b.this
                x7.e r0 = r0.f230a
                java.lang.String r2 = r10.f236b
                r0.m20414a(r3, r2, r11)
                if (r1 != 0) goto La8
                a9.b$c r11 = r10.f235a
                r11.mo273b(r5)
            La8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010a9.C0061b.b.mo281b(h7.j):void");
        }
    }

    /* renamed from: a9.b$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo272a();

        /* renamed from: b */
        void mo273b(int i10);

        /* renamed from: c */
        void mo274c(String str, String str2);

        /* renamed from: e */
        void mo275e(long j10);
    }

    /* renamed from: a9.b$d */
    /* loaded from: classes.dex */
    protected static class d extends C4995a {
        d(String str) throws JSONException {
            super(str);
            if (!m19445a()) {
                throw new JSONException("Invalid Error Payload");
            }
        }
    }

    public C0061b(C5563e c5563e, InterfaceC3413f interfaceC3413f) {
        this.f230a = c5563e;
        this.f231b = interfaceC3413f;
    }

    /* renamed from: c */
    private InterfaceC3419l m277c(String str, c cVar) {
        return new a(cVar, str);
    }

    /* renamed from: a */
    public void m278a(String str, String str2, c cVar) {
        this.f231b.mo15023a(C2877p0.m12889S0(), new C3540a(str, str2, "Login"), null, m277c(str, cVar)).mo15006c();
    }

    /* renamed from: b */
    public void m279b(String str, String str2, String str3, boolean z10, c cVar) {
        this.f231b.mo15023a(C2877p0.m12887R0(), new C3541b(str, str3, str2, z10, "Login"), null, m280d(str, cVar)).mo15006c();
    }

    /* renamed from: d */
    protected InterfaceC3419l m280d(String str, c cVar) {
        return new b(cVar, str);
    }
}
