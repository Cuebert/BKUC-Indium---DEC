package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p280w0.C5099a;

/* renamed from: s0.y */
/* loaded from: classes.dex */
public final class C4514y extends AbstractC4498i {

    /* renamed from: f */
    public static final a f18263f = new a(null);

    /* renamed from: d */
    private final String f18264d;

    /* renamed from: e */
    private final String f18265e;

    /* renamed from: s0.y$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final C4514y m18530a(Bundle data) {
            C3844i.m16253f(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                C3844i.m16250c(string);
                C3844i.m16250c(string2);
                return new C4514y(string, string2, data, null);
            } catch (Exception unused) {
                throw new C5099a();
            }
        }

        /* renamed from: b */
        public final Bundle m18531b(String id, String password) {
            C3844i.m16253f(id, "id");
            C3844i.m16253f(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }
    }

    private C4514y(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.f18264d = str;
        this.f18265e = str2;
        if (!(str2.length() > 0)) {
            throw new IllegalArgumentException("password should not be empty".toString());
        }
    }

    public /* synthetic */ C4514y(String str, String str2, Bundle bundle, C3840e c3840e) {
        this(str, str2, bundle);
    }

    /* renamed from: a */
    public final String m18528a() {
        return this.f18264d;
    }

    /* renamed from: b */
    public final String m18529b() {
        return this.f18265e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4514y(String id, String password) {
        this(id, password, f18263f.m18531b(id, password));
        C3844i.m16253f(id, "id");
        C3844i.m16253f(password, "password");
    }
}
