package p232s0;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import ua.C4903u;

/* renamed from: s0.t */
/* loaded from: classes.dex */
public final class C4509t {

    /* renamed from: f */
    public static final b f18246f = new b(null);

    /* renamed from: a */
    private final List<AbstractC4503n> f18247a;

    /* renamed from: b */
    private final String f18248b;

    /* renamed from: c */
    private final boolean f18249c;

    /* renamed from: d */
    private final ComponentName f18250d;

    /* renamed from: e */
    private final boolean f18251e;

    /* renamed from: s0.t$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private List<AbstractC4503n> f18252a = new ArrayList();

        /* renamed from: b */
        private String f18253b;

        /* renamed from: c */
        private boolean f18254c;

        /* renamed from: d */
        private boolean f18255d;

        /* renamed from: e */
        private ComponentName f18256e;

        /* renamed from: a */
        public final a m18521a(AbstractC4503n credentialOption) {
            C3844i.m16253f(credentialOption, "credentialOption");
            this.f18252a.add(credentialOption);
            return this;
        }

        /* renamed from: b */
        public final C4509t m18522b() {
            List m19147j;
            m19147j = C4903u.m19147j(this.f18252a);
            return new C4509t(m19147j, this.f18253b, this.f18254c, this.f18256e, this.f18255d);
        }
    }

    /* renamed from: s0.t$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final Bundle m18523a(C4509t request) {
            C3844i.m16253f(request, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", request.m18518c());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.m18520e());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.m18519d());
            return bundle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4509t(List<? extends AbstractC4503n> credentialOptions, String str, boolean z10, ComponentName componentName, boolean z11) {
        C3844i.m16253f(credentialOptions, "credentialOptions");
        this.f18247a = credentialOptions;
        this.f18248b = str;
        this.f18249c = z10;
        this.f18250d = componentName;
        this.f18251e = z11;
        if (!(!credentialOptions.isEmpty())) {
            throw new IllegalArgumentException("credentialOptions should not be empty".toString());
        }
    }

    /* renamed from: a */
    public final List<AbstractC4503n> m18516a() {
        return this.f18247a;
    }

    /* renamed from: b */
    public final String m18517b() {
        return this.f18248b;
    }

    /* renamed from: c */
    public final boolean m18518c() {
        return this.f18249c;
    }

    /* renamed from: d */
    public final ComponentName m18519d() {
        return this.f18250d;
    }

    /* renamed from: e */
    public final boolean m18520e() {
        return this.f18251e;
    }
}
