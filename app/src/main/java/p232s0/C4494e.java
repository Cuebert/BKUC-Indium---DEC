package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p232s0.AbstractC4490b;

/* renamed from: s0.e */
/* loaded from: classes.dex */
public final class C4494e extends AbstractC4490b {

    /* renamed from: l */
    public static final a f18213l = new a(null);

    /* renamed from: j */
    private final String f18214j;

    /* renamed from: k */
    private final String f18215k;

    /* renamed from: s0.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final Bundle m18476a() {
            return new Bundle();
        }

        /* renamed from: b */
        public final Bundle m18477b(String id, String password) {
            C3844i.m16253f(id, "id");
            C3844i.m16253f(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4494e(String id, String password) {
        this(id, password, null, false, false, 28, null);
        C3844i.m16253f(id, "id");
        C3844i.m16253f(password, "password");
    }

    /* synthetic */ C4494e(String str, String str2, boolean z10, AbstractC4490b.b bVar, String str3, boolean z11, Bundle bundle, Bundle bundle2, int i10, C3840e c3840e) {
        this(str, str2, z10, bVar, (i10 & 16) != 0 ? null : str3, z11, (i10 & 64) != 0 ? f18213l.m18477b(str, str2) : bundle, (i10 & 128) != 0 ? f18213l.m18476a() : bundle2);
    }

    /* renamed from: g */
    public final String m18474g() {
        return this.f18214j;
    }

    /* renamed from: h */
    public final String m18475h() {
        return this.f18215k;
    }

    private C4494e(String str, String str2, boolean z10, AbstractC4490b.b bVar, String str3, boolean z11, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z10, bVar, str3, z11);
        this.f18214j = str;
        this.f18215k = str2;
        if (!(str2.length() > 0)) {
            throw new IllegalArgumentException("password should not be empty".toString());
        }
    }

    public /* synthetic */ C4494e(String str, String str2, String str3, boolean z10, boolean z11, int i10, C3840e c3840e) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4494e(String id, String password, String str, boolean z10, boolean z11) {
        this(id, password, z11, new AbstractC4490b.b(id, null), str, z10, null, null, 192, null);
        C3844i.m16253f(id, "id");
        C3844i.m16253f(password, "password");
    }
}
