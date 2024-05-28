package p321z2;

import android.os.Bundle;
import p295x2.C5506a;

/* renamed from: z2.o */
/* loaded from: classes.dex */
public class C5994o implements C5506a.d {

    /* renamed from: o */
    public static final C5994o f22064o = m21302a().m21304a();

    /* renamed from: n */
    private final String f22065n;

    /* renamed from: z2.o$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f22066a;

        /* synthetic */ a(C5998q c5998q) {
        }

        /* renamed from: a */
        public C5994o m21304a() {
            return new C5994o(this.f22066a, null);
        }

        /* renamed from: b */
        public a m21305b(String str) {
            this.f22066a = str;
            return this;
        }
    }

    /* synthetic */ C5994o(String str, C6000r c6000r) {
        this.f22065n = str;
    }

    /* renamed from: a */
    public static a m21302a() {
        return new a(null);
    }

    /* renamed from: b */
    public final Bundle m21303b() {
        Bundle bundle = new Bundle();
        String str = this.f22065n;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5994o) {
            return C5980h.m21269b(this.f22065n, ((C5994o) obj).f22065n);
        }
        return false;
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f22065n);
    }
}
