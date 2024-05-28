package p019b5;

import p019b5.InterfaceC1016c;
import p085g4.AbstractC3263l;
import p085g4.C3269o;
import p085g4.InterfaceC3261k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b5.h */
/* loaded from: classes.dex */
public final class C1026h implements InterfaceC1016c {

    /* renamed from: a */
    private final C1043t f5199a;

    /* renamed from: b */
    private final C1047x f5200b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1026h(C1043t c1043t, C1047x c1047x) {
        this.f5199a = c1043t;
        this.f5200b = c1047x;
    }

    @Override // p019b5.InterfaceC1016c
    /* renamed from: a */
    public final AbstractC3263l<InterfaceC1016c.c> mo6253a(final InterfaceC1016c.a aVar) {
        return this.f5199a.m6286d(aVar.mo6252a()).mo14509p(new InterfaceC3261k() { // from class: b5.g
            @Override // p085g4.InterfaceC3261k
            /* renamed from: a */
            public final AbstractC3263l mo6267a(Object obj) {
                return C1026h.this.m6268b(aVar, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ AbstractC3263l m6268b(InterfaceC1016c.a aVar, Long l10) throws Exception {
        final C1047x c1047x = this.f5200b;
        final long mo6252a = aVar.mo6252a();
        final long longValue = l10.longValue();
        return C3269o.m14531f(new InterfaceC1016c.c() { // from class: b5.w
            @Override // p019b5.InterfaceC1016c.c
            /* renamed from: a */
            public final AbstractC3263l mo6258a(InterfaceC1016c.d dVar) {
                return C1047x.this.m6287a(mo6252a, longValue, dVar);
            }
        });
    }
}
