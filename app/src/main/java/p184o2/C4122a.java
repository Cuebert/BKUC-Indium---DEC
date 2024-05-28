package p184o2;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p197p2.InterfaceC4217d;
import p198p3.C4245l0;
import p234s2.InterfaceC4517a;
import p245t2.InterfaceC4618a;
import p258u2.C4824f;
import p295x2.C5506a;
import p321z2.C5980h;

/* renamed from: o2.a */
/* loaded from: classes.dex */
public final class C4122a {

    /* renamed from: a */
    @Deprecated
    public static final C5506a<C4124c> f16816a;

    /* renamed from: b */
    public static final C5506a<a> f16817b;

    /* renamed from: c */
    public static final C5506a<GoogleSignInOptions> f16818c;

    /* renamed from: d */
    @Deprecated
    public static final InterfaceC4517a f16819d;

    /* renamed from: e */
    public static final InterfaceC4217d f16820e;

    /* renamed from: f */
    public static final InterfaceC4618a f16821f;

    /* renamed from: g */
    public static final C5506a.g f16822g;

    /* renamed from: h */
    public static final C5506a.g f16823h;

    /* renamed from: i */
    private static final C5506a.a f16824i;

    /* renamed from: j */
    private static final C5506a.a f16825j;

    @Deprecated
    /* renamed from: o2.a$a */
    /* loaded from: classes.dex */
    public static class a implements C5506a.d {

        /* renamed from: q */
        public static final a f16826q = new a(new C6056a());

        /* renamed from: n */
        private final String f16827n = null;

        /* renamed from: o */
        private final boolean f16828o;

        /* renamed from: p */
        private final String f16829p;

        @Deprecated
        /* renamed from: o2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6056a {

            /* renamed from: a */
            protected Boolean f16830a;

            /* renamed from: b */
            protected String f16831b;

            public C6056a() {
                this.f16830a = Boolean.FALSE;
            }

            /* renamed from: a */
            public final C6056a m17126a(String str) {
                this.f16831b = str;
                return this;
            }

            public C6056a(a aVar) {
                this.f16830a = Boolean.FALSE;
                a.m17122b(aVar);
                this.f16830a = Boolean.valueOf(aVar.f16828o);
                this.f16831b = aVar.f16829p;
            }
        }

        public a(C6056a c6056a) {
            this.f16828o = c6056a.f16830a.booleanValue();
            this.f16829p = c6056a.f16831b;
        }

        /* renamed from: b */
        static /* bridge */ /* synthetic */ String m17122b(a aVar) {
            String str = aVar.f16827n;
            return null;
        }

        /* renamed from: a */
        public final Bundle m17125a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f16828o);
            bundle.putString("log_session_id", this.f16829p);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = aVar.f16827n;
            return C5980h.m21269b(null, null) && this.f16828o == aVar.f16828o && C5980h.m21269b(this.f16829p, aVar.f16829p);
        }

        public int hashCode() {
            return C5980h.m21270c(null, Boolean.valueOf(this.f16828o), this.f16829p);
        }
    }

    static {
        C5506a.g gVar = new C5506a.g();
        f16822g = gVar;
        C5506a.g gVar2 = new C5506a.g();
        f16823h = gVar2;
        C4125d c4125d = new C4125d();
        f16824i = c4125d;
        C4126e c4126e = new C4126e();
        f16825j = c4126e;
        f16816a = C4123b.f16832a;
        f16817b = new C5506a<>("Auth.CREDENTIALS_API", c4125d, gVar);
        f16818c = new C5506a<>("Auth.GOOGLE_SIGN_IN_API", c4126e, gVar2);
        f16819d = C4123b.f16833b;
        f16820e = new C4245l0();
        f16821f = new C4824f();
    }
}
