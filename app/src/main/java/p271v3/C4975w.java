package p271v3;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p085g4.AbstractC3263l;
import p087g6.C3288c;
import p087g6.C3296g;
import p087g6.C3303n;
import p321z2.C5978g;

/* renamed from: v3.w */
/* loaded from: classes.dex */
public final class C4975w {

    /* renamed from: a */
    private final String f19040a;

    /* renamed from: b */
    private final String f19041b;

    /* renamed from: c */
    private final InterfaceC4974v f19042c;

    /* renamed from: d */
    private final C3303n f19043d;

    /* renamed from: e */
    private final AbstractC3263l<String> f19044e;

    /* renamed from: f */
    private final AbstractC3263l<String> f19045f;

    /* renamed from: g */
    private final String f19046g;

    /* renamed from: h */
    private final Map<Object, Long> f19047h = new HashMap();

    /* renamed from: i */
    private final Map<Object, Object> f19048i = new HashMap();

    public C4975w(Context context, final C3303n c3303n, InterfaceC4974v interfaceC4974v, final String str) {
        this.f19040a = context.getPackageName();
        this.f19041b = C3288c.m14547a(context);
        this.f19043d = c3303n;
        this.f19042c = interfaceC4974v;
        this.f19046g = str;
        this.f19044e = C3296g.m14553a().m14556b(new Callable() { // from class: v3.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5978g.m21262a().m21263b(str);
            }
        });
        C3296g m14553a = C3296g.m14553a();
        c3303n.getClass();
        this.f19045f = m14553a.m14556b(new Callable() { // from class: v3.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3303n.this.m14578a();
            }
        });
    }
}
