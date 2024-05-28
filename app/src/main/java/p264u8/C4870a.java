package p264u8;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import java.lang.ref.WeakReference;
import p035c9.C1151k;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3251f;
import p197p2.C4214a;
import p197p2.C4216c;
import p197p2.C4218e;
import p197p2.C4219f;
import p274v6.C4987b;
import p274v6.C4989d;
import p274v6.InterfaceC4986a;
import p295x2.C5507b;
import p295x2.C5516k;

/* renamed from: u8.a */
/* loaded from: classes.dex */
public class C4870a implements InterfaceC4986a {

    /* renamed from: a */
    private C4218e f18761a;

    /* renamed from: b */
    private C4987b f18762b;

    /* renamed from: c */
    WeakReference<Activity> f18763c = new WeakReference<>(null);

    /* renamed from: u8.a$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3251f<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4986a.a f18764a;

        /* renamed from: b */
        final /* synthetic */ int f18765b;

        a(InterfaceC4986a.a aVar, int i10) {
            this.f18764a = aVar;
            this.f18765b = i10;
        }

        @Override // p085g4.InterfaceC3251f
        /* renamed from: a */
        public void mo7517a(AbstractC3263l<Void> abstractC3263l) {
            C1151k.m6707a("SmartLockManager", "onCompleted: " + abstractC3263l.mo14503j());
            if (abstractC3263l.mo14508o()) {
                C1151k.m6707a("SmartLockManager", "SAVE: OK");
                C4870a.this.f18762b.m19426a("credentialSavedNoDialog");
                this.f18764a.mo12240c();
                return;
            }
            Exception mo14503j = abstractC3263l.mo14503j();
            if (mo14503j instanceof C5516k) {
                if (C4870a.this.f18763c.get() != null) {
                    try {
                        ((C5516k) mo14503j).m20290c(C4870a.this.f18763c.get(), this.f18765b);
                        this.f18764a.mo12239b();
                        C4870a.this.f18762b.m19426a("dialogShown");
                        return;
                    } catch (IntentSender.SendIntentException e10) {
                        C1151k.m6709c("SmartLockManager", "Failed to send resolution. " + e10.getMessage());
                        C4870a.this.f18762b.m19427b("dialogNotShown", e10.getMessage());
                        this.f18764a.mo12238a();
                        return;
                    }
                }
                C4870a.this.f18762b.m19427b("dialogNotShown", "nullActivity");
                this.f18764a.mo12238a();
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Task exception. ");
            sb2.append(mo14503j != null ? mo14503j.getMessage() : BuildConfig.FLAVOR);
            C1151k.m6709c("SmartLockManager", sb2.toString());
            C4870a.this.f18762b.m19427b("dialogNotShown", "noResolution");
            this.f18764a.mo12238a();
        }
    }

    /* renamed from: u8.a$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC3251f<C4214a> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4986a.b f18767a;

        /* renamed from: b */
        final /* synthetic */ int f18768b;

        b(InterfaceC4986a.b bVar, int i10) {
            this.f18767a = bVar;
            this.f18768b = i10;
        }

        @Override // p085g4.InterfaceC3251f
        /* renamed from: a */
        public void mo7517a(AbstractC3263l<C4214a> abstractC3263l) {
            if (abstractC3263l.mo14508o()) {
                C1151k.m6712f("SmartLockManager", "result: " + abstractC3263l.mo14504k().m17639c());
                C4870a.this.f18762b.m19428c("credentialSelectedNoDialog");
                this.f18767a.mo12237a(C4870a.this.m19071k(abstractC3263l.mo14504k().m17639c()));
                return;
            }
            Exception mo14503j = abstractC3263l.mo14503j();
            if (mo14503j instanceof C5516k) {
                if (C4870a.this.f18763c.get() != null) {
                    C5516k c5516k = (C5516k) mo14503j;
                    try {
                        if (((C5516k) mo14503j).m20260b() == 6) {
                            c5516k.m20290c(C4870a.this.f18763c.get(), this.f18768b);
                            C4870a.this.f18762b.m19428c("dialogShown");
                            return;
                        }
                        return;
                    } catch (IntentSender.SendIntentException e10) {
                        C1151k.m6709c("SmartLockManager", "Failed to send resolution." + e10);
                        C4870a.this.f18762b.m19429d("dialogNotShown", e10.getMessage());
                        return;
                    }
                }
                C4870a.this.f18762b.m19429d("dialogNotShown", "nullActivity");
                return;
            }
            if (mo14503j instanceof C5507b) {
                C1151k.m6709c("SmartLockManager", "Unsuccessful credential request." + mo14503j);
                C4870a.this.f18762b.m19429d("dialogNotShown", String.valueOf(((C5507b) mo14503j).m20260b()));
                return;
            }
            C4870a.this.f18762b.m19429d("dialogNotShown", "unknown");
        }
    }

    /* renamed from: u8.a$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC3251f<Void> {
        c() {
        }

        @Override // p085g4.InterfaceC3251f
        /* renamed from: a */
        public void mo7517a(AbstractC3263l<Void> abstractC3263l) {
            if (abstractC3263l.mo14508o()) {
                C1151k.m6707a("SmartLockManager", "Credential deleted.");
                return;
            }
            C1151k.m6707a("SmartLockManager", "Credential not deleted: " + abstractC3263l.mo14503j());
        }
    }

    public C4870a(Activity activity, C4987b c4987b) {
        this.f18761a = C4216c.m17641a(activity, new C4219f.a().m17649c().m17648b());
        this.f18762b = c4987b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public C4989d m19071k(Credential credential) {
        return new C4989d(credential.m7215A(), credential.m7218D(), credential.m7217C());
    }

    /* renamed from: l */
    private Credential m19072l(C4989d c4989d) {
        return new Credential.C1309a(c4989d.f19079a).m7224b(c4989d.f19081c).m7225c(c4989d.f19080b).m7223a();
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: a */
    public void mo19073a() {
        this.f18762b.m19426a("credentialSaved");
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: b */
    public void mo19074b() {
        this.f18762b.m19428c("dialogDismissed");
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: c */
    public void mo19075c(Activity activity, int i10, InterfaceC4986a.b bVar) {
        CredentialRequest m7237a = new CredentialRequest.C1311a().m7238b(true).m7237a();
        this.f18763c = new WeakReference<>(activity);
        this.f18761a.m17647z(m7237a).mo14495b(new b(bVar, i10));
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: d */
    public void mo19076d(C4989d c4989d) {
        this.f18761a.m17646y(m19072l(c4989d)).mo14495b(new c());
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: e */
    public void mo19077e() {
        this.f18762b.m19427b("credentialNotSaved", "neverClickedOrDialogDismissed");
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: f */
    public void mo19078f(Activity activity, int i10, C4989d c4989d, InterfaceC4986a.a aVar) {
        C1151k.m6707a("SmartLockManager", "saveCredential.");
        this.f18763c = new WeakReference<>(activity);
        this.f18761a.m17645A(m19072l(c4989d)).mo14495b(new a(aVar, i10));
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: g */
    public C4989d mo19079g(Intent intent) {
        return m19071k((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"));
    }

    @Override // p274v6.InterfaceC4986a
    /* renamed from: h */
    public void mo19080h() {
        this.f18762b.m19428c("credentialSelected");
    }
}
