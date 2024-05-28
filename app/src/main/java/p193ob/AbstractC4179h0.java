package p193ob;

import ac.C0076f;
import ac.InterfaceC0074d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import p205pb.C4286e;

/* renamed from: ob.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC4179h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ob.h0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4179h0 {

        /* renamed from: a */
        final /* synthetic */ C4167b0 f17132a;

        /* renamed from: b */
        final /* synthetic */ C0076f f17133b;

        a(C4167b0 c4167b0, C0076f c0076f) {
            this.f17132a = c4167b0;
            this.f17133b = c0076f;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: a */
        public long mo14714a() throws IOException {
            return this.f17133b.mo399r();
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: b */
        public C4167b0 mo14715b() {
            return this.f17132a;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: i */
        public void mo14716i(InterfaceC0074d interfaceC0074d) throws IOException {
            interfaceC0074d.mo326E(this.f17133b);
        }
    }

    /* renamed from: ob.h0$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC4179h0 {

        /* renamed from: a */
        final /* synthetic */ C4167b0 f17134a;

        /* renamed from: b */
        final /* synthetic */ int f17135b;

        /* renamed from: c */
        final /* synthetic */ byte[] f17136c;

        /* renamed from: d */
        final /* synthetic */ int f17137d;

        b(C4167b0 c4167b0, int i10, byte[] bArr, int i11) {
            this.f17134a = c4167b0;
            this.f17135b = i10;
            this.f17136c = bArr;
            this.f17137d = i11;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: a */
        public long mo14714a() {
            return this.f17135b;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: b */
        public C4167b0 mo14715b() {
            return this.f17134a;
        }

        @Override // p193ob.AbstractC4179h0
        /* renamed from: i */
        public void mo14716i(InterfaceC0074d interfaceC0074d) throws IOException {
            interfaceC0074d.mo357h(this.f17136c, this.f17137d, this.f17135b);
        }
    }

    /* renamed from: c */
    public static AbstractC4179h0 m17410c(C4167b0 c4167b0, C0076f c0076f) {
        return new a(c4167b0, c0076f);
    }

    /* renamed from: d */
    public static AbstractC4179h0 m17411d(C4167b0 c4167b0, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (c4167b0 != null && (charset = c4167b0.m17280a()) == null) {
            charset = StandardCharsets.UTF_8;
            c4167b0 = C4167b0.m17279d(c4167b0 + "; charset=utf-8");
        }
        return m17412e(c4167b0, str.getBytes(charset));
    }

    /* renamed from: e */
    public static AbstractC4179h0 m17412e(C4167b0 c4167b0, byte[] bArr) {
        return m17413f(c4167b0, bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static AbstractC4179h0 m17413f(C4167b0 c4167b0, byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "content == null");
        C4286e.m17742f(bArr.length, i10, i11);
        return new b(c4167b0, i11, bArr, i10);
    }

    /* renamed from: a */
    public long mo14714a() throws IOException {
        return -1L;
    }

    /* renamed from: b */
    public abstract C4167b0 mo14715b();

    /* renamed from: g */
    public boolean m17414g() {
        return false;
    }

    /* renamed from: h */
    public boolean m17415h() {
        return false;
    }

    /* renamed from: i */
    public abstract void mo14716i(InterfaceC0074d interfaceC0074d) throws IOException;
}
