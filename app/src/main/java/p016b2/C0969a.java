package p016b2;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import p003a2.AbstractC0014i;
import p016b2.AbstractC0974f;

/* renamed from: b2.a */
/* loaded from: classes.dex */
final class C0969a extends AbstractC0974f {

    /* renamed from: a */
    private final Iterable<AbstractC0014i> f5140a;

    /* renamed from: b */
    private final byte[] f5141b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0974f.a {

        /* renamed from: a */
        private Iterable<AbstractC0014i> f5142a;

        /* renamed from: b */
        private byte[] f5143b;

        @Override // p016b2.AbstractC0974f.a
        /* renamed from: a */
        public AbstractC0974f mo6148a() {
            Iterable<AbstractC0014i> iterable = this.f5142a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = BuildConfig.FLAVOR + " events";
            }
            if (str.isEmpty()) {
                return new C0969a(this.f5142a, this.f5143b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p016b2.AbstractC0974f.a
        /* renamed from: b */
        public AbstractC0974f.a mo6149b(Iterable<AbstractC0014i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f5142a = iterable;
            return this;
        }

        @Override // p016b2.AbstractC0974f.a
        /* renamed from: c */
        public AbstractC0974f.a mo6150c(byte[] bArr) {
            this.f5143b = bArr;
            return this;
        }
    }

    @Override // p016b2.AbstractC0974f
    /* renamed from: b */
    public Iterable<AbstractC0014i> mo6146b() {
        return this.f5140a;
    }

    @Override // p016b2.AbstractC0974f
    /* renamed from: c */
    public byte[] mo6147c() {
        return this.f5141b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0974f)) {
            return false;
        }
        AbstractC0974f abstractC0974f = (AbstractC0974f) obj;
        if (this.f5140a.equals(abstractC0974f.mo6146b())) {
            if (Arrays.equals(this.f5141b, abstractC0974f instanceof C0969a ? ((C0969a) abstractC0974f).f5141b : abstractC0974f.mo6147c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5140a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5141b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5140a + ", extras=" + Arrays.toString(this.f5141b) + "}";
    }

    private C0969a(Iterable<AbstractC0014i> iterable, byte[] bArr) {
        this.f5140a = iterable;
        this.f5141b = bArr;
    }
}
