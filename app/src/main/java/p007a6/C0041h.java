package p007a6;

import android.content.Context;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;

/* renamed from: a6.h */
/* loaded from: classes.dex */
public class C0041h {

    /* renamed from: a6.h$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        String mo244a(T t10);
    }

    /* renamed from: b */
    public static C3617d<?> m241b(String str, String str2) {
        return C3617d.m15464i(AbstractC0039f.m239a(str, str2), AbstractC0039f.class);
    }

    /* renamed from: c */
    public static C3617d<?> m242c(final String str, final a<Context> aVar) {
        return C3617d.m15465j(AbstractC0039f.class).m15480b(C3631q.m15529h(Context.class)).m15484f(new InterfaceC3622h() { // from class: a6.g
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                AbstractC0039f m243d;
                m243d = C0041h.m243d(str, aVar, interfaceC3619e);
                return m243d;
            }
        }).m15482d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC0039f m243d(String str, a aVar, InterfaceC3619e interfaceC3619e) {
        return AbstractC0039f.m239a(str, aVar.mo244a((Context) interfaceC3619e.mo15448a(Context.class)));
    }
}
