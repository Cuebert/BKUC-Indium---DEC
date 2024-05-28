package p105hc;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1062m;
import p091gc.InterfaceC3334f;
import p193ob.AbstractC4183j0;

/* renamed from: hc.c */
/* loaded from: classes.dex */
final class C3463c<T> implements InterfaceC3334f<AbstractC4183j0, T> {

    /* renamed from: a */
    private final C1055f f14382a;

    /* renamed from: b */
    private final AbstractC1071v<T> f14383b;

    public C3463c(C1055f c1055f, AbstractC1071v<T> abstractC1071v) {
        this.f14382a = c1055f;
        this.f14383b = abstractC1071v;
    }

    @Override // p091gc.InterfaceC3334f
    /* renamed from: b */
    public T mo14629a(AbstractC4183j0 abstractC4183j0) throws IOException {
        JsonReader m6310p = this.f14382a.m6310p(abstractC4183j0.m17463c());
        try {
            T read = this.f14383b.read(m6310p);
            if (m6310p.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new C1062m("JSON document was not fully consumed.");
        } finally {
            abstractC4183j0.close();
        }
    }
}
