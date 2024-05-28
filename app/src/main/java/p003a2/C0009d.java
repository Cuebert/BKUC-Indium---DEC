package p003a2;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import p003a2.AbstractC0020o;
import p307y1.EnumC5595d;

/* renamed from: a2.d */
/* loaded from: classes.dex */
final class C0009d extends AbstractC0020o {

    /* renamed from: a */
    private final String f141a;

    /* renamed from: b */
    private final byte[] f142b;

    /* renamed from: c */
    private final EnumC5595d f143c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0020o.a {

        /* renamed from: a */
        private String f144a;

        /* renamed from: b */
        private byte[] f145b;

        /* renamed from: c */
        private EnumC5595d f146c;

        @Override // p003a2.AbstractC0020o.a
        /* renamed from: a */
        public AbstractC0020o mo115a() {
            String str = this.f144a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " backendName";
            }
            if (this.f146c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C0009d(this.f144a, this.f145b, this.f146c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p003a2.AbstractC0020o.a
        /* renamed from: b */
        public AbstractC0020o.a mo116b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f144a = str;
            return this;
        }

        @Override // p003a2.AbstractC0020o.a
        /* renamed from: c */
        public AbstractC0020o.a mo117c(byte[] bArr) {
            this.f145b = bArr;
            return this;
        }

        @Override // p003a2.AbstractC0020o.a
        /* renamed from: d */
        public AbstractC0020o.a mo118d(EnumC5595d enumC5595d) {
            Objects.requireNonNull(enumC5595d, "Null priority");
            this.f146c = enumC5595d;
            return this;
        }
    }

    /* synthetic */ C0009d(String str, byte[] bArr, EnumC5595d enumC5595d, a aVar) {
        this(str, bArr, enumC5595d);
    }

    @Override // p003a2.AbstractC0020o
    /* renamed from: b */
    public String mo112b() {
        return this.f141a;
    }

    @Override // p003a2.AbstractC0020o
    /* renamed from: c */
    public byte[] mo113c() {
        return this.f142b;
    }

    @Override // p003a2.AbstractC0020o
    /* renamed from: d */
    public EnumC5595d mo114d() {
        return this.f143c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0020o)) {
            return false;
        }
        AbstractC0020o abstractC0020o = (AbstractC0020o) obj;
        if (this.f141a.equals(abstractC0020o.mo112b())) {
            if (Arrays.equals(this.f142b, abstractC0020o instanceof C0009d ? ((C0009d) abstractC0020o).f142b : abstractC0020o.mo113c()) && this.f143c.equals(abstractC0020o.mo114d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f141a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f142b)) * 1000003) ^ this.f143c.hashCode();
    }

    private C0009d(String str, byte[] bArr, EnumC5595d enumC5595d) {
        this.f141a = str;
        this.f142b = bArr;
        this.f143c = enumC5595d;
    }
}
