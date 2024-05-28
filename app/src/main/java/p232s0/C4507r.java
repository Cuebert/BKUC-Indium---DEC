package p232s0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p132jb.C3695l;
import p232s0.AbstractC4492c;
import p232s0.AbstractC4498i;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;
import p243t0.C4594c;
import p243t0.C4595d;
import p243t0.C4597f;
import p243t0.C4598g;
import p243t0.C4600i;
import p243t0.C4601j;
import p243t0.C4602k;
import p243t0.C4603l;
import p243t0.C4605n;
import p243t0.C4607p;
import p243t0.C4608q;
import p243t0.C4609r;
import p253ta.C4755l;
import p268v0.C4934b;
import p268v0.C4937e;
import p280w0.C5100b;

/* renamed from: s0.r */
/* loaded from: classes.dex */
public final class C4507r implements InterfaceC4505p {

    /* renamed from: b */
    private static final a f18237b = new a(null);

    /* renamed from: a */
    private final CredentialManager f18238a;

    /* renamed from: s0.r$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    /* renamed from: s0.r$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC3845j implements InterfaceC3030a<C4755l> {

        /* renamed from: n */
        final /* synthetic */ InterfaceC4501l<AbstractC4492c, AbstractC4596e> f18239n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC4501l<AbstractC4492c, AbstractC4596e> interfaceC4501l) {
            super(0);
            this.f18239n = interfaceC4501l;
        }

        @Override // p051db.InterfaceC3030a
        public /* bridge */ /* synthetic */ C4755l invoke() {
            invoke2();
            return C4755l.f18582a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f18239n.mo13660a(new C4601j("Your device doesn't support credential manager"));
        }
    }

    /* renamed from: s0.r$c */
    /* loaded from: classes.dex */
    public static final class c implements OutcomeReceiver<CreateCredentialResponse, CreateCredentialException> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4501l<AbstractC4492c, AbstractC4596e> f18240a;

        /* renamed from: b */
        final /* synthetic */ AbstractC4490b f18241b;

        /* renamed from: c */
        final /* synthetic */ C4507r f18242c;

        c(InterfaceC4501l<AbstractC4492c, AbstractC4596e> interfaceC4501l, AbstractC4490b abstractC4490b, C4507r c4507r) {
            this.f18240a = interfaceC4501l;
            this.f18241b = abstractC4490b;
            this.f18242c = c4507r;
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(CreateCredentialException error) {
            C3844i.m16253f(error, "error");
            Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
            this.f18240a.mo13660a(this.f18242c.m18510d(error));
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: b */
        public void onResult(CreateCredentialResponse response) {
            C3844i.m16253f(response, "response");
            Log.i("CredManProvService", "Create Result returned from framework: ");
            InterfaceC4501l<AbstractC4492c, AbstractC4596e> interfaceC4501l = this.f18240a;
            AbstractC4492c.a aVar = AbstractC4492c.f18210c;
            String m18470e = this.f18241b.m18470e();
            Bundle data = response.getData();
            C3844i.m16252e(data, "response.data");
            interfaceC4501l.onResult(aVar.m18473a(m18470e, data));
        }
    }

    /* renamed from: s0.r$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC3845j implements InterfaceC3030a<C4755l> {

        /* renamed from: n */
        final /* synthetic */ InterfaceC4501l<C4510u, AbstractC4604m> f18243n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC4501l<C4510u, AbstractC4604m> interfaceC4501l) {
            super(0);
            this.f18243n = interfaceC4501l;
        }

        @Override // p051db.InterfaceC3030a
        public /* bridge */ /* synthetic */ C4755l invoke() {
            invoke2();
            return C4755l.f18582a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f18243n.mo13660a(new C4608q("Your device doesn't support credential manager"));
        }
    }

    /* renamed from: s0.r$e */
    /* loaded from: classes.dex */
    public static final class e implements OutcomeReceiver<GetCredentialResponse, GetCredentialException> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4501l<C4510u, AbstractC4604m> f18244a;

        /* renamed from: b */
        final /* synthetic */ C4507r f18245b;

        e(InterfaceC4501l<C4510u, AbstractC4604m> interfaceC4501l, C4507r c4507r) {
            this.f18244a = interfaceC4501l;
            this.f18245b = c4507r;
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(GetCredentialException error) {
            C3844i.m16253f(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            this.f18244a.mo13660a(this.f18245b.m18511e(error));
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: b */
        public void onResult(GetCredentialResponse response) {
            C3844i.m16253f(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            this.f18244a.onResult(this.f18245b.m18509c(response));
        }
    }

    public C4507r(Context context) {
        C3844i.m16253f(context, "context");
        this.f18238a = (CredentialManager) context.getSystemService("credential");
    }

    /* renamed from: a */
    private final CreateCredentialRequest m18504a(AbstractC4490b abstractC4490b, Context context) {
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(abstractC4490b.m18470e(), C5100b.f19361a.m19741a(abstractC4490b, context), abstractC4490b.m18466a()).setIsSystemProviderRequired(abstractC4490b.m18471f()).setAlwaysSendAppInfoToProvider(true);
        C3844i.m16252e(alwaysSendAppInfoToProvider, "Builder(request.type,\n  …ndAppInfoToProvider(true)");
        m18507g(abstractC4490b, alwaysSendAppInfoToProvider);
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        C3844i.m16252e(build, "createCredentialRequestBuilder.build()");
        return build;
    }

    /* renamed from: b */
    private final GetCredentialRequest m18505b(C4509t c4509t) {
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(C4509t.f18246f.m18523a(c4509t));
        for (AbstractC4503n abstractC4503n : c4509t.m18516a()) {
            builder.addCredentialOption(new CredentialOption.Builder(abstractC4503n.m18495d(), abstractC4503n.m18494c(), abstractC4503n.m18493b()).setIsSystemProviderRequired(abstractC4503n.m18497f()).setAllowedProviders(abstractC4503n.m18492a()).build());
        }
        m18508h(c4509t, builder);
        GetCredentialRequest build = builder.build();
        C3844i.m16252e(build, "builder.build()");
        return build;
    }

    /* renamed from: f */
    private final boolean m18506f(InterfaceC3030a<C4755l> interfaceC3030a) {
        if (this.f18238a != null) {
            return false;
        }
        interfaceC3030a.invoke();
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: g */
    private final void m18507g(AbstractC4490b abstractC4490b, CreateCredentialRequest.Builder builder) {
        if (abstractC4490b.m18469d() != null) {
            builder.setOrigin(abstractC4490b.m18469d());
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: h */
    private final void m18508h(C4509t c4509t, GetCredentialRequest.Builder builder) {
        if (c4509t.m18517b() != null) {
            builder.setOrigin(c4509t.m18517b());
        }
    }

    /* renamed from: c */
    public final C4510u m18509c(GetCredentialResponse response) {
        C3844i.m16253f(response, "response");
        Credential credential = response.getCredential();
        C3844i.m16252e(credential, "response.credential");
        AbstractC4498i.a aVar = AbstractC4498i.f18222c;
        String type = credential.getType();
        C3844i.m16252e(type, "credential.type");
        Bundle data = credential.getData();
        C3844i.m16252e(data, "credential.data");
        return new C4510u(aVar.m18487a(type, data));
    }

    /* renamed from: d */
    public final AbstractC4596e m18510d(CreateCredentialException error) {
        boolean m15674e;
        C3844i.m16253f(error, "error");
        String type = error.getType();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new C4594c(error.getMessage());
                }
                break;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new C4600i(error.getMessage());
                }
                break;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new C4597f(error.getMessage());
                }
                break;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new C4598g(error.getMessage());
                }
                break;
        }
        String type2 = error.getType();
        C3844i.m16252e(type2, "error.type");
        m15674e = C3695l.m15674e(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null);
        if (m15674e) {
            C4934b.a aVar = C4934b.f18983q;
            String type3 = error.getType();
            C3844i.m16252e(type3, "error.type");
            return aVar.m19357a(type3, error.getMessage());
        }
        String type4 = error.getType();
        C3844i.m16252e(type4, "error.type");
        return new C4595d(type4, error.getMessage());
    }

    /* renamed from: e */
    public final AbstractC4604m m18511e(GetCredentialException error) {
        boolean m15674e;
        C3844i.m16253f(error, "error");
        String type = error.getType();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new C4607p(error.getMessage());
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new C4605n(error.getMessage());
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new C4602k(error.getMessage());
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new C4609r(error.getMessage());
                }
                break;
        }
        String type2 = error.getType();
        C3844i.m16252e(type2, "error.type");
        m15674e = C3695l.m15674e(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null);
        if (m15674e) {
            C4937e.a aVar = C4937e.f18988q;
            String type3 = error.getType();
            C3844i.m16252e(type3, "error.type");
            return aVar.m19362a(type3, error.getMessage());
        }
        String type4 = error.getType();
        C3844i.m16252e(type4, "error.type");
        return new C4603l(type4, error.getMessage());
    }

    @Override // p232s0.InterfaceC4505p
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @Override // p232s0.InterfaceC4505p
    public void onCreateCredential(Context context, AbstractC4490b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback) {
        C3844i.m16253f(context, "context");
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        if (m18506f(new b(callback))) {
            return;
        }
        c cVar = new c(callback, request, this);
        CredentialManager credentialManager = this.f18238a;
        C3844i.m16250c(credentialManager);
        credentialManager.createCredential(context, m18504a(request, context), cancellationSignal, executor, cVar);
    }

    @Override // p232s0.InterfaceC4505p
    public void onGetCredential(Context context, C4509t request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<C4510u, AbstractC4604m> callback) {
        C3844i.m16253f(context, "context");
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        if (m18506f(new d(callback))) {
            return;
        }
        e eVar = new e(callback, this);
        CredentialManager credentialManager = this.f18238a;
        C3844i.m16250c(credentialManager);
        credentialManager.getCredential(context, m18505b(request), cancellationSignal, executor, eVar);
    }
}
