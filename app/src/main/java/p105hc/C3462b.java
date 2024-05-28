package p105hc;

import ac.C0073c;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p091gc.InterfaceC3334f;
import p193ob.AbstractC4179h0;
import p193ob.C4167b0;

/* renamed from: hc.b */
/* loaded from: classes.dex */
final class C3462b<T> implements InterfaceC3334f<T, AbstractC4179h0> {

    /* renamed from: c */
    private static final C4167b0 f14378c = C4167b0.m17278c("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f14379d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C1055f f14380a;

    /* renamed from: b */
    private final AbstractC1071v<T> f14381b;

    public C3462b(C1055f c1055f, AbstractC1071v<T> abstractC1071v) {
        this.f14380a = c1055f;
        this.f14381b = abstractC1071v;
    }

    @Override // p091gc.InterfaceC3334f
    /* renamed from: b */
    public AbstractC4179h0 mo14629a(T t10) throws IOException {
        C0073c c0073c = new C0073c();
        JsonWriter m6311q = this.f14380a.m6311q(new OutputStreamWriter(c0073c.m365o0(), f14379d));
        this.f14381b.write(m6311q, t10);
        m6311q.close();
        return AbstractC4179h0.m17410c(f14378c, c0073c.m370r0());
    }
}
