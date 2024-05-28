package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p280w0.C5099a;
import p280w0.C5101c;

/* renamed from: s0.a0 */
/* loaded from: classes.dex */
public final class C4489a0 extends AbstractC4498i {

    /* renamed from: e */
    public static final a f18191e = new a(null);

    /* renamed from: d */
    private final String f18192d;

    /* renamed from: s0.a0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final C4489a0 m18464a(Bundle data) {
            C3844i.m16253f(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                C3844i.m16250c(string);
                return new C4489a0(string, data, null);
            } catch (Exception unused) {
                throw new C5099a();
            }
        }

        /* renamed from: b */
        public final Bundle m18465b(String authenticationResponseJson) {
            C3844i.m16253f(authenticationResponseJson, "authenticationResponseJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", authenticationResponseJson);
            return bundle;
        }
    }

    private C4489a0(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f18192d = str;
        if (!C5101c.f19362a.m19742a(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    public /* synthetic */ C4489a0(String str, Bundle bundle, C3840e c3840e) {
        this(str, bundle);
    }

    /* renamed from: a */
    public final String m18463a() {
        return this.f18192d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4489a0(String authenticationResponseJson) {
        this(authenticationResponseJson, f18191e.m18465b(authenticationResponseJson));
        C3844i.m16253f(authenticationResponseJson, "authenticationResponseJson");
    }
}
