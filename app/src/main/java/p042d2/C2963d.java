package p042d2;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p187o5.InterfaceC4137d;

/* renamed from: d2.d */
/* loaded from: classes.dex */
public final class C2963d {

    /* renamed from: c */
    private static final C2963d f12625c = new a().m13413a();

    /* renamed from: a */
    private final String f12626a;

    /* renamed from: b */
    private final List<C2962c> f12627b;

    /* renamed from: d2.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f12628a = BuildConfig.FLAVOR;

        /* renamed from: b */
        private List<C2962c> f12629b = new ArrayList();

        a() {
        }

        /* renamed from: a */
        public C2963d m13413a() {
            return new C2963d(this.f12628a, Collections.unmodifiableList(this.f12629b));
        }

        /* renamed from: b */
        public a m13414b(List<C2962c> list) {
            this.f12629b = list;
            return this;
        }

        /* renamed from: c */
        public a m13415c(String str) {
            this.f12628a = str;
            return this;
        }
    }

    C2963d(String str, List<C2962c> list) {
        this.f12626a = str;
        this.f12627b = list;
    }

    /* renamed from: c */
    public static a m13410c() {
        return new a();
    }

    @InterfaceC4137d(tag = 2)
    /* renamed from: a */
    public List<C2962c> m13411a() {
        return this.f12627b;
    }

    @InterfaceC4137d(tag = 1)
    /* renamed from: b */
    public String m13412b() {
        return this.f12626a;
    }
}
