package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: s0.f */
/* loaded from: classes.dex */
public final class C4495f extends AbstractC4492c {

    /* renamed from: d */
    public static final a f18216d = new a(null);

    /* renamed from: s0.f$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final C4495f m18478a(Bundle data) {
            C3844i.m16253f(data, "data");
            return new C4495f(data, null);
        }
    }

    private C4495f(Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
    }

    public /* synthetic */ C4495f(Bundle bundle, C3840e c3840e) {
        this(bundle);
    }

    public C4495f() {
        this(new Bundle());
    }
}
