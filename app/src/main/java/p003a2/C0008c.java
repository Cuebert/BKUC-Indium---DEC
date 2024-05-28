package p003a2;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import p003a2.AbstractC0019n;
import p307y1.AbstractC5594c;
import p307y1.C5593b;
import p307y1.InterfaceC5596e;

/* renamed from: a2.c */
/* loaded from: classes.dex */
final class C0008c extends AbstractC0019n {

    /* renamed from: a */
    private final AbstractC0020o f131a;

    /* renamed from: b */
    private final String f132b;

    /* renamed from: c */
    private final AbstractC5594c<?> f133c;

    /* renamed from: d */
    private final InterfaceC5596e<?, byte[]> f134d;

    /* renamed from: e */
    private final C5593b f135e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0019n.a {

        /* renamed from: a */
        private AbstractC0020o f136a;

        /* renamed from: b */
        private String f137b;

        /* renamed from: c */
        private AbstractC5594c<?> f138c;

        /* renamed from: d */
        private InterfaceC5596e<?, byte[]> f139d;

        /* renamed from: e */
        private C5593b f140e;

        @Override // p003a2.AbstractC0019n.a
        /* renamed from: a */
        public AbstractC0019n mo106a() {
            AbstractC0020o abstractC0020o = this.f136a;
            String str = BuildConfig.FLAVOR;
            if (abstractC0020o == null) {
                str = BuildConfig.FLAVOR + " transportContext";
            }
            if (this.f137b == null) {
                str = str + " transportName";
            }
            if (this.f138c == null) {
                str = str + " event";
            }
            if (this.f139d == null) {
                str = str + " transformer";
            }
            if (this.f140e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C0008c(this.f136a, this.f137b, this.f138c, this.f139d, this.f140e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p003a2.AbstractC0019n.a
        /* renamed from: b */
        public AbstractC0019n.a mo107b(C5593b c5593b) {
            Objects.requireNonNull(c5593b, "Null encoding");
            this.f140e = c5593b;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p003a2.AbstractC0019n.a
        /* renamed from: c */
        public AbstractC0019n.a mo108c(AbstractC5594c<?> abstractC5594c) {
            Objects.requireNonNull(abstractC5594c, "Null event");
            this.f138c = abstractC5594c;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p003a2.AbstractC0019n.a
        /* renamed from: d */
        public AbstractC0019n.a mo109d(InterfaceC5596e<?, byte[]> interfaceC5596e) {
            Objects.requireNonNull(interfaceC5596e, "Null transformer");
            this.f139d = interfaceC5596e;
            return this;
        }

        @Override // p003a2.AbstractC0019n.a
        /* renamed from: e */
        public AbstractC0019n.a mo110e(AbstractC0020o abstractC0020o) {
            Objects.requireNonNull(abstractC0020o, "Null transportContext");
            this.f136a = abstractC0020o;
            return this;
        }

        @Override // p003a2.AbstractC0019n.a
        /* renamed from: f */
        public AbstractC0019n.a mo111f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f137b = str;
            return this;
        }
    }

    /* synthetic */ C0008c(AbstractC0020o abstractC0020o, String str, AbstractC5594c abstractC5594c, InterfaceC5596e interfaceC5596e, C5593b c5593b, a aVar) {
        this(abstractC0020o, str, abstractC5594c, interfaceC5596e, c5593b);
    }

    @Override // p003a2.AbstractC0019n
    /* renamed from: b */
    public C5593b mo101b() {
        return this.f135e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p003a2.AbstractC0019n
    /* renamed from: c */
    public AbstractC5594c<?> mo102c() {
        return this.f133c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p003a2.AbstractC0019n
    /* renamed from: e */
    public InterfaceC5596e<?, byte[]> mo103e() {
        return this.f134d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0019n)) {
            return false;
        }
        AbstractC0019n abstractC0019n = (AbstractC0019n) obj;
        return this.f131a.equals(abstractC0019n.mo104f()) && this.f132b.equals(abstractC0019n.mo105g()) && this.f133c.equals(abstractC0019n.mo102c()) && this.f134d.equals(abstractC0019n.mo103e()) && this.f135e.equals(abstractC0019n.mo101b());
    }

    @Override // p003a2.AbstractC0019n
    /* renamed from: f */
    public AbstractC0020o mo104f() {
        return this.f131a;
    }

    @Override // p003a2.AbstractC0019n
    /* renamed from: g */
    public String mo105g() {
        return this.f132b;
    }

    public int hashCode() {
        return ((((((((this.f131a.hashCode() ^ 1000003) * 1000003) ^ this.f132b.hashCode()) * 1000003) ^ this.f133c.hashCode()) * 1000003) ^ this.f134d.hashCode()) * 1000003) ^ this.f135e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f131a + ", transportName=" + this.f132b + ", event=" + this.f133c + ", transformer=" + this.f134d + ", encoding=" + this.f135e + "}";
    }

    private C0008c(AbstractC0020o abstractC0020o, String str, AbstractC5594c<?> abstractC5594c, InterfaceC5596e<?, byte[]> interfaceC5596e, C5593b c5593b) {
        this.f131a = abstractC0020o;
        this.f132b = str;
        this.f133c = abstractC5594c;
        this.f134d = interfaceC5596e;
        this.f135e = c5593b;
    }
}
