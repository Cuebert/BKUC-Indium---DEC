package p309y3;

import android.content.Context;
import com.google.android.datatransport.cct.C1304a;
import p003a2.C0025t;
import p126j5.C3637w;
import p248t5.InterfaceC4733b;
import p307y1.AbstractC5594c;
import p307y1.C5593b;
import p307y1.InterfaceC5596e;
import p307y1.InterfaceC5597f;
import p307y1.InterfaceC5598g;

/* renamed from: y3.m7 */
/* loaded from: classes.dex */
public final class C5764m7 implements InterfaceC5685e7 {

    /* renamed from: a */
    private InterfaceC4733b<InterfaceC5597f<byte[]>> f21188a;

    /* renamed from: b */
    private final InterfaceC4733b<InterfaceC5597f<byte[]>> f21189b;

    /* renamed from: c */
    private final AbstractC5880z6 f21190c;

    public C5764m7(Context context, AbstractC5880z6 abstractC5880z6) {
        this.f21190c = abstractC5880z6;
        C1304a c1304a = C1304a.f5917g;
        C0025t.m161f(context);
        final InterfaceC5598g m163g = C0025t.m159c().m163g(c1304a);
        if (c1304a.mo127a().contains(C5593b.m20616b("json"))) {
            this.f21188a = new C3637w(new InterfaceC4733b() { // from class: y3.k7
                @Override // p248t5.InterfaceC4733b
                public final Object get() {
                    return InterfaceC5598g.this.mo151a("FIREBASE_ML_SDK", byte[].class, C5593b.m20616b("json"), new InterfaceC5596e() { // from class: y3.h7
                        @Override // p307y1.InterfaceC5596e
                        /* renamed from: a */
                        public final Object mo16838a(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f21189b = new C3637w(new InterfaceC4733b() { // from class: y3.l7
            @Override // p248t5.InterfaceC4733b
            public final Object get() {
                return InterfaceC5598g.this.mo151a("FIREBASE_ML_SDK", byte[].class, C5593b.m20616b("proto"), new InterfaceC5596e() { // from class: y3.j7
                    @Override // p307y1.InterfaceC5596e
                    /* renamed from: a */
                    public final Object mo16838a(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    /* renamed from: b */
    static AbstractC5594c<byte[]> m20708b(AbstractC5880z6 abstractC5880z6, C5705g7 c5705g7) {
        return AbstractC5594c.m20619e(c5705g7.m20687b(abstractC5880z6.mo20782a(), false));
    }

    @Override // p309y3.InterfaceC5685e7
    /* renamed from: a */
    public final void mo20659a(C5705g7 c5705g7) {
        if (this.f21190c.mo20782a() != 0) {
            this.f21189b.get().mo155a(m20708b(this.f21190c, c5705g7));
            return;
        }
        InterfaceC4733b<InterfaceC5597f<byte[]>> interfaceC4733b = this.f21188a;
        if (interfaceC4733b != null) {
            interfaceC4733b.get().mo155a(m20708b(this.f21190c, c5705g7));
        }
    }
}
