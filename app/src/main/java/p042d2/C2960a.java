package p042d2;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p003a2.AbstractC0017l;
import p187o5.InterfaceC4137d;

/* renamed from: d2.a */
/* loaded from: classes.dex */
public final class C2960a {

    /* renamed from: e */
    private static final C2960a f12599e = new a().m13395b();

    /* renamed from: a */
    private final C2965f f12600a;

    /* renamed from: b */
    private final List<C2963d> f12601b;

    /* renamed from: c */
    private final C2961b f12602c;

    /* renamed from: d */
    private final String f12603d;

    /* renamed from: d2.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C2965f f12604a = null;

        /* renamed from: b */
        private List<C2963d> f12605b = new ArrayList();

        /* renamed from: c */
        private C2961b f12606c = null;

        /* renamed from: d */
        private String f12607d = BuildConfig.FLAVOR;

        a() {
        }

        /* renamed from: a */
        public a m13394a(C2963d c2963d) {
            this.f12605b.add(c2963d);
            return this;
        }

        /* renamed from: b */
        public C2960a m13395b() {
            return new C2960a(this.f12604a, Collections.unmodifiableList(this.f12605b), this.f12606c, this.f12607d);
        }

        /* renamed from: c */
        public a m13396c(String str) {
            this.f12607d = str;
            return this;
        }

        /* renamed from: d */
        public a m13397d(C2961b c2961b) {
            this.f12606c = c2961b;
            return this;
        }

        /* renamed from: e */
        public a m13398e(C2965f c2965f) {
            this.f12604a = c2965f;
            return this;
        }
    }

    C2960a(C2965f c2965f, List<C2963d> list, C2961b c2961b, String str) {
        this.f12600a = c2965f;
        this.f12601b = list;
        this.f12602c = c2961b;
        this.f12603d = str;
    }

    /* renamed from: e */
    public static a m13388e() {
        return new a();
    }

    @InterfaceC4137d(tag = 4)
    /* renamed from: a */
    public String m13389a() {
        return this.f12603d;
    }

    @InterfaceC4137d(tag = 3)
    /* renamed from: b */
    public C2961b m13390b() {
        return this.f12602c;
    }

    @InterfaceC4137d(tag = 2)
    /* renamed from: c */
    public List<C2963d> m13391c() {
        return this.f12601b;
    }

    @InterfaceC4137d(tag = 1)
    /* renamed from: d */
    public C2965f m13392d() {
        return this.f12600a;
    }

    /* renamed from: f */
    public byte[] m13393f() {
        return AbstractC0017l.m144a(this);
    }
}
