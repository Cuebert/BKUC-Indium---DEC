package p271v3;

import android.content.Context;
import com.google.android.datatransport.cct.C1304a;
import p003a2.C0025t;
import p126j5.C3637w;
import p248t5.InterfaceC4733b;
import p307y1.C5593b;
import p307y1.InterfaceC5596e;
import p307y1.InterfaceC5597f;
import p307y1.InterfaceC5598g;

/* renamed from: v3.b0 */
/* loaded from: classes.dex */
public final class C4944b0 implements InterfaceC4974v {

    /* renamed from: a */
    private InterfaceC4733b<InterfaceC5597f<byte[]>> f19010a;

    /* renamed from: b */
    private final InterfaceC4733b<InterfaceC5597f<byte[]>> f19011b;

    /* renamed from: c */
    private final AbstractC4970r f19012c;

    public C4944b0(Context context, AbstractC4970r abstractC4970r) {
        this.f19012c = abstractC4970r;
        C1304a c1304a = C1304a.f5917g;
        C0025t.m161f(context);
        final InterfaceC5598g m163g = C0025t.m159c().m163g(c1304a);
        if (c1304a.mo127a().contains(C5593b.m20616b("json"))) {
            this.f19010a = new C3637w(new InterfaceC4733b() { // from class: v3.z
                @Override // p248t5.InterfaceC4733b
                public final Object get() {
                    return InterfaceC5598g.this.mo151a("FIREBASE_ML_SDK", byte[].class, C5593b.m20616b("json"), new InterfaceC5596e() { // from class: v3.x
                        @Override // p307y1.InterfaceC5596e
                        /* renamed from: a */
                        public final Object mo16838a(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f19011b = new C3637w(new InterfaceC4733b() { // from class: v3.a0
            @Override // p248t5.InterfaceC4733b
            public final Object get() {
                return InterfaceC5598g.this.mo151a("FIREBASE_ML_SDK", byte[].class, C5593b.m20616b("proto"), new InterfaceC5596e() { // from class: v3.y
                    @Override // p307y1.InterfaceC5596e
                    /* renamed from: a */
                    public final Object mo16838a(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
