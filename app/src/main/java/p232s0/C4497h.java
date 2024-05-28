package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p280w0.C5099a;
import p280w0.C5101c;

/* renamed from: s0.h */
/* loaded from: classes.dex */
public final class C4497h extends AbstractC4492c {

    /* renamed from: e */
    public static final a f18220e = new a(null);

    /* renamed from: d */
    private final String f18221d;

    /* renamed from: s0.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final C4497h m18485a(Bundle data) {
            C3844i.m16253f(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                C3844i.m16250c(string);
                return new C4497h(string, data, null);
            } catch (Exception unused) {
                throw new C5099a();
            }
        }

        /* renamed from: b */
        public final Bundle m18486b(String registrationResponseJson) {
            C3844i.m16253f(registrationResponseJson, "registrationResponseJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", registrationResponseJson);
            return bundle;
        }
    }

    private C4497h(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f18221d = str;
        if (!C5101c.f19362a.m19742a(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    public /* synthetic */ C4497h(String str, Bundle bundle, C3840e c3840e) {
        this(str, bundle);
    }

    /* renamed from: a */
    public final String m18484a() {
        return this.f18221d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4497h(String registrationResponseJson) {
        this(registrationResponseJson, f18220e.m18486b(registrationResponseJson));
        C3844i.m16253f(registrationResponseJson, "registrationResponseJson");
    }
}
