package p193ob;

import ac.C0073c;
import ac.InterfaceC0074d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p205pb.C4286e;

/* renamed from: ob.w */
/* loaded from: classes.dex */
public final class C4198w extends AbstractC4179h0 {

    /* renamed from: c */
    private static final C4167b0 f17354c = C4167b0.m17278c("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f17355a;

    /* renamed from: b */
    private final List<String> f17356b;

    /* renamed from: ob.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<String> f17357a;

        /* renamed from: b */
        private final List<String> f17358b;

        /* renamed from: c */
        private final Charset f17359c;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public a m17541a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f17357a.add(C4201z.m17572c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f17359c));
            this.f17358b.add(C4201z.m17572c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f17359c));
            return this;
        }

        /* renamed from: b */
        public a m17542b(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f17357a.add(C4201z.m17572c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f17359c));
            this.f17358b.add(C4201z.m17572c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f17359c));
            return this;
        }

        /* renamed from: c */
        public C4198w m17543c() {
            return new C4198w(this.f17357a, this.f17358b);
        }

        public a(Charset charset) {
            this.f17357a = new ArrayList();
            this.f17358b = new ArrayList();
            this.f17359c = charset;
        }
    }

    C4198w(List<String> list, List<String> list2) {
        this.f17355a = C4286e.m17756t(list);
        this.f17356b = C4286e.m17756t(list2);
    }

    /* renamed from: j */
    private long m17540j(InterfaceC0074d interfaceC0074d, boolean z10) {
        C0073c mo348a;
        if (z10) {
            mo348a = new C0073c();
        } else {
            mo348a = interfaceC0074d.mo348a();
        }
        int size = this.f17355a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                mo348a.mo330G(38);
            }
            mo348a.mo350b0(this.f17355a.get(i10));
            mo348a.mo330G(61);
            mo348a.mo350b0(this.f17356b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long m381y0 = mo348a.m381y0();
        mo348a.m347Y();
        return m381y0;
    }

    @Override // p193ob.AbstractC4179h0
    /* renamed from: a */
    public long mo14714a() {
        return m17540j(null, true);
    }

    @Override // p193ob.AbstractC4179h0
    /* renamed from: b */
    public C4167b0 mo14715b() {
        return f17354c;
    }

    @Override // p193ob.AbstractC4179h0
    /* renamed from: i */
    public void mo14716i(InterfaceC0074d interfaceC0074d) throws IOException {
        m17540j(interfaceC0074d, false);
    }
}
