package p019b5;

import android.content.Context;
import p045d5.C2990i;
import p045d5.C2992k;
import p045d5.InterfaceC2991j;
import p045d5.InterfaceC2994m;

/* renamed from: b5.l0 */
/* loaded from: classes.dex */
final class C1035l0 {

    /* renamed from: a */
    private final C1035l0 f5207a = this;

    /* renamed from: b */
    private final InterfaceC2994m f5208b;

    /* renamed from: c */
    private final InterfaceC2994m f5209c;

    /* renamed from: d */
    private final InterfaceC2994m f5210d;

    /* renamed from: e */
    private final InterfaceC2994m f5211e;

    /* renamed from: f */
    private final InterfaceC2994m f5212f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1035l0(Context context, C1033k0 c1033k0) {
        C1032k c1032k;
        InterfaceC2991j m13462b = C2992k.m13462b(context);
        this.f5208b = m13462b;
        c1032k = C1030j.f5204a;
        InterfaceC2994m m13461b = C2990i.m13461b(c1032k);
        this.f5209c = m13461b;
        InterfaceC2994m m13461b2 = C2990i.m13461b(new C1045v(m13462b, m13461b));
        this.f5210d = m13461b2;
        InterfaceC2994m m13461b3 = C2990i.m13461b(new C1048y(m13461b2));
        this.f5211e = m13461b3;
        this.f5212f = C2990i.m13461b(new C1028i(m13461b2, m13461b3));
    }

    /* renamed from: a */
    public final InterfaceC1016c m6273a() {
        return (InterfaceC1016c) this.f5212f.mo6269a();
    }
}
