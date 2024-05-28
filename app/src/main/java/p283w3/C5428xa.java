package p283w3;

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

/* renamed from: w3.xa */
/* loaded from: classes.dex */
public final class C5428xa implements InterfaceC5311oa {

    /* renamed from: a */
    private InterfaceC4733b<InterfaceC5597f<byte[]>> f20283a;

    /* renamed from: b */
    private final InterfaceC4733b<InterfaceC5597f<byte[]>> f20284b;

    /* renamed from: c */
    private final AbstractC5233ia f20285c;

    public C5428xa(Context context, AbstractC5233ia abstractC5233ia) {
        this.f20285c = abstractC5233ia;
        C1304a c1304a = C1304a.f5917g;
        C0025t.m161f(context);
        final InterfaceC5598g m163g = C0025t.m159c().m163g(c1304a);
        if (c1304a.mo127a().contains(C5593b.m20616b("json"))) {
            this.f20283a = new C3637w(new InterfaceC4733b() { // from class: w3.va
                @Override // p248t5.InterfaceC4733b
                public final Object get() {
                    return InterfaceC5598g.this.mo151a("FIREBASE_ML_SDK", byte[].class, C5593b.m20616b("json"), new InterfaceC5596e() { // from class: w3.ta
                        @Override // p307y1.InterfaceC5596e
                        /* renamed from: a */
                        public final Object mo16838a(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f20284b = new C3637w(new InterfaceC4733b() { // from class: w3.wa
            @Override // p248t5.InterfaceC4733b
            public final Object get() {
                return InterfaceC5598g.this.mo151a("FIREBASE_ML_SDK", byte[].class, C5593b.m20616b("proto"), new InterfaceC5596e() { // from class: w3.ua
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
    static AbstractC5594c<byte[]> m20038b(AbstractC5233ia abstractC5233ia, C5363sa c5363sa) {
        int mo19835a = abstractC5233ia.mo19835a();
        if (c5363sa.m19973a() != 0) {
            return AbstractC5594c.m20618d(c5363sa.m19975c(mo19835a, false));
        }
        return AbstractC5594c.m20619e(c5363sa.m19975c(mo19835a, false));
    }

    @Override // p283w3.InterfaceC5311oa
    /* renamed from: a */
    public final void mo19845a(C5363sa c5363sa) {
        if (this.f20285c.mo19835a() != 0) {
            this.f20284b.get().mo155a(m20038b(this.f20285c, c5363sa));
            return;
        }
        InterfaceC4733b<InterfaceC5597f<byte[]>> interfaceC4733b = this.f20283a;
        if (interfaceC4733b != null) {
            interfaceC4733b.get().mo155a(m20038b(this.f20285c, c5363sa));
        }
    }
}
