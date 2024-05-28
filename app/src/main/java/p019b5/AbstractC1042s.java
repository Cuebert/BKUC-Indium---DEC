package p019b5;

import p045d5.AbstractRunnableC3006y;
import p045d5.C2983e;
import p085g4.C3265m;

/* renamed from: b5.s */
/* loaded from: classes.dex */
abstract class AbstractC1042s extends AbstractRunnableC3006y {

    /* renamed from: o */
    final /* synthetic */ C1043t f5227o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1042s(C1043t c1043t, C3265m c3265m) {
        super(c3265m);
        this.f5227o = c1043t;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: a */
    public final void mo6279a(Exception exc) {
        if (!(exc instanceof C2983e)) {
            super.mo6279a(exc);
        } else if (C1043t.m6284g(this.f5227o)) {
            super.mo6279a(new C1014b(-2, exc));
        } else {
            super.mo6279a(new C1014b(-9, exc));
        }
    }
}
