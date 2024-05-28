package p308y2;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1348b;
import p295x2.AbstractC5510e;
import p295x2.C5506a;
import p295x2.C5506a.d;
import p295x2.InterfaceC5518m;

/* renamed from: y2.s */
/* loaded from: classes.dex */
public final class C5629s<O extends C5506a.d> extends C5626p {

    /* renamed from: c */
    private final AbstractC5510e<O> f20823c;

    public C5629s(AbstractC5510e<O> abstractC5510e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f20823c = abstractC5510e;
    }

    @Override // p295x2.AbstractC5511f
    /* renamed from: a */
    public final <A extends C5506a.b, R extends InterfaceC5518m, T extends AbstractC1348b<R, A>> T mo20282a(T t10) {
        return (T) this.f20823c.m20268m(t10);
    }

    @Override // p295x2.AbstractC5511f
    /* renamed from: b */
    public final <A extends C5506a.b, T extends AbstractC1348b<? extends InterfaceC5518m, A>> T mo20283b(T t10) {
        return (T) this.f20823c.m20270o(t10);
    }

    @Override // p295x2.AbstractC5511f
    /* renamed from: d */
    public final Looper mo20284d() {
        return this.f20823c.m20274s();
    }
}
