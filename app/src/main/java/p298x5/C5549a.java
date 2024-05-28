package p298x5;

import p298x5.AbstractC5552d;

/* renamed from: x5.a */
/* loaded from: classes.dex */
final class C5549a extends AbstractC5552d {

    /* renamed from: a */
    private final String f20573a;

    /* renamed from: b */
    private final String f20574b;

    /* renamed from: c */
    private final String f20575c;

    /* renamed from: d */
    private final AbstractC5554f f20576d;

    /* renamed from: e */
    private final AbstractC5552d.b f20577e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x5.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5552d.a {

        /* renamed from: a */
        private String f20578a;

        /* renamed from: b */
        private String f20579b;

        /* renamed from: c */
        private String f20580c;

        /* renamed from: d */
        private AbstractC5554f f20581d;

        /* renamed from: e */
        private AbstractC5552d.b f20582e;

        @Override // p298x5.AbstractC5552d.a
        /* renamed from: a */
        public AbstractC5552d mo20306a() {
            return new C5549a(this.f20578a, this.f20579b, this.f20580c, this.f20581d, this.f20582e);
        }

        @Override // p298x5.AbstractC5552d.a
        /* renamed from: b */
        public AbstractC5552d.a mo20307b(AbstractC5554f abstractC5554f) {
            this.f20581d = abstractC5554f;
            return this;
        }

        @Override // p298x5.AbstractC5552d.a
        /* renamed from: c */
        public AbstractC5552d.a mo20308c(String str) {
            this.f20579b = str;
            return this;
        }

        @Override // p298x5.AbstractC5552d.a
        /* renamed from: d */
        public AbstractC5552d.a mo20309d(String str) {
            this.f20580c = str;
            return this;
        }

        @Override // p298x5.AbstractC5552d.a
        /* renamed from: e */
        public AbstractC5552d.a mo20310e(AbstractC5552d.b bVar) {
            this.f20582e = bVar;
            return this;
        }

        @Override // p298x5.AbstractC5552d.a
        /* renamed from: f */
        public AbstractC5552d.a mo20311f(String str) {
            this.f20578a = str;
            return this;
        }
    }

    /* synthetic */ C5549a(String str, String str2, String str3, AbstractC5554f abstractC5554f, AbstractC5552d.b bVar, a aVar) {
        this(str, str2, str3, abstractC5554f, bVar);
    }

    @Override // p298x5.AbstractC5552d
    /* renamed from: b */
    public AbstractC5554f mo20301b() {
        return this.f20576d;
    }

    @Override // p298x5.AbstractC5552d
    /* renamed from: c */
    public String mo20302c() {
        return this.f20574b;
    }

    @Override // p298x5.AbstractC5552d
    /* renamed from: d */
    public String mo20303d() {
        return this.f20575c;
    }

    @Override // p298x5.AbstractC5552d
    /* renamed from: e */
    public AbstractC5552d.b mo20304e() {
        return this.f20577e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5552d)) {
            return false;
        }
        AbstractC5552d abstractC5552d = (AbstractC5552d) obj;
        String str = this.f20573a;
        if (str != null ? str.equals(abstractC5552d.mo20305f()) : abstractC5552d.mo20305f() == null) {
            String str2 = this.f20574b;
            if (str2 != null ? str2.equals(abstractC5552d.mo20302c()) : abstractC5552d.mo20302c() == null) {
                String str3 = this.f20575c;
                if (str3 != null ? str3.equals(abstractC5552d.mo20303d()) : abstractC5552d.mo20303d() == null) {
                    AbstractC5554f abstractC5554f = this.f20576d;
                    if (abstractC5554f != null ? abstractC5554f.equals(abstractC5552d.mo20301b()) : abstractC5552d.mo20301b() == null) {
                        AbstractC5552d.b bVar = this.f20577e;
                        if (bVar == null) {
                            if (abstractC5552d.mo20304e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC5552d.mo20304e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p298x5.AbstractC5552d
    /* renamed from: f */
    public String mo20305f() {
        return this.f20573a;
    }

    public int hashCode() {
        String str = this.f20573a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20574b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20575c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC5554f abstractC5554f = this.f20576d;
        int hashCode4 = (hashCode3 ^ (abstractC5554f == null ? 0 : abstractC5554f.hashCode())) * 1000003;
        AbstractC5552d.b bVar = this.f20577e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f20573a + ", fid=" + this.f20574b + ", refreshToken=" + this.f20575c + ", authToken=" + this.f20576d + ", responseCode=" + this.f20577e + "}";
    }

    private C5549a(String str, String str2, String str3, AbstractC5554f abstractC5554f, AbstractC5552d.b bVar) {
        this.f20573a = str;
        this.f20574b = str2;
        this.f20575c = str3;
        this.f20576d = abstractC5554f;
        this.f20577e = bVar;
    }
}
