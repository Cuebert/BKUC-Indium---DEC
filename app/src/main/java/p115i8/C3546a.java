package p115i8;

import android.content.Context;
import com.roblox.client.C2822f0;
import com.roblox.client.C2872n;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.C0053k;
import p024bc.C1100c;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1155o;
import p091gc.C3348t;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3332d;
import p101h8.C3436j;
import p101h8.C3439m;
import p101h8.C3445s;
import p129j8.C3667j;
import p129j8.C3671n;
import p179n9.C4083g;
import p193ob.AbstractC4183j0;
import p252t9.C4743c;

/* renamed from: i8.a */
/* loaded from: classes.dex */
public class C3546a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3332d<AbstractC4183j0> {

        /* renamed from: a */
        final /* synthetic */ C3439m.b f15123a;

        /* renamed from: b */
        final /* synthetic */ Context f15124b;

        a(C3439m.b bVar, Context context) {
            this.f15123a = bVar;
            this.f15124b = context;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            if (c3348t.m14732b() == 200) {
                try {
                    String m6742a = C1155o.m6742a(c3348t);
                    C1151k.m6714h("rbx.push", m6742a);
                    C3546a.this.m15345d(this.f15123a, new C3671n(new JSONObject(m6742a)), this.f15124b);
                    return;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    C1100c.m6458d().m6469j(new C0053k("PushNotificationRegistrationFailed"));
                    return;
                }
            }
            C1100c.m6458d().m6469j(new C0053k("PushNotificationRegistrationFailed"));
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            C1100c.m6458d().m6469j(new C0053k("PushNotificationRegistrationFailed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.a$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC3332d<AbstractC4183j0> {
        b() {
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            C1151k.m6709c("rbx.push", "deregisterCurrentDevice failed: " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.a$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC3332d<AbstractC4183j0> {

        /* renamed from: a */
        final /* synthetic */ Context f15127a;

        /* renamed from: b */
        final /* synthetic */ String f15128b;

        /* renamed from: c */
        final /* synthetic */ String f15129c;

        /* renamed from: d */
        final /* synthetic */ C3445s.b f15130d;

        c(Context context, String str, String str2, C3445s.b bVar) {
            this.f15127a = context;
            this.f15128b = str;
            this.f15129c = str2;
            this.f15130d = bVar;
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            if (c3348t.m14732b() == 200) {
                try {
                    String m6742a = C1155o.m6742a(c3348t);
                    C1151k.m6712f("rbx.push", m6742a);
                    C3546a.this.m15346e(this.f15127a, this.f15128b, this.f15129c, this.f15130d, new C3667j(new JSONObject(m6742a)), new C3436j());
                    return;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    C1151k.m6709c("rbx.push", "RGLS.onMessageReceived() JSONException msg:" + e10.getMessage());
                    C2822f0.m12496r("metadataInaccessible", this.f15128b, this.f15129c);
                    return;
                }
            }
            if (c3348t.m14732b() == 401) {
                C2822f0.m12496r("unauthenticated", this.f15128b, this.f15129c);
            } else {
                C2822f0.m12496r("metadataInaccessible", this.f15128b, this.f15129c);
            }
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            C2822f0.m12496r("metadataInaccessible", this.f15128b, this.f15129c);
        }
    }

    /* renamed from: c */
    private void m15342c(Context context, String str, boolean z10, String str2, C3439m.b bVar) {
        C4743c c4743c = new C4743c(str, z10, str2);
        InterfaceC3330b<AbstractC4183j0> m12844o = C2872n.m12830h().m12844o(c4743c);
        if (m12844o == null) {
            if (C1152l.m6733d()) {
                m12844o = C4083g.m16979d().mo16970c().m18296d(c4743c);
            } else {
                m12844o = C4083g.m16979d().mo16970c().m18299g(c4743c);
            }
        }
        m12844o.mo14636W(new a(bVar, context));
    }

    /* renamed from: a */
    public void m15343a() {
        C4083g.m16979d().mo16970c().m18293a().mo14636W(new b());
    }

    /* renamed from: b */
    public void m15344b(Context context, String str, String str2, String str3, String str4, C3445s.b bVar) {
        C4083g.m16979d().mo16970c().m18294b(str, str2, str3).mo14636W(new c(context, str, str4, bVar));
    }

    /* renamed from: d */
    void m15345d(C3439m.b bVar, C3671n c3671n, Context context) {
        bVar.mo15140a(c3671n, context);
    }

    /* renamed from: e */
    void m15346e(Context context, String str, String str2, C3445s.b bVar, C3667j c3667j, C3436j c3436j) {
        bVar.mo15166a(c3667j, context, str, str2, c3436j);
    }

    /* renamed from: f */
    public void m15347f(Context context, String str, String str2, boolean z10, C3439m.b bVar) {
        m15342c(context, str, z10, str2, bVar);
    }
}
