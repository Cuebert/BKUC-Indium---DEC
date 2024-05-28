package p019b5;

import android.content.Context;
import p045d5.AbstractRunnableC3006y;
import p045d5.C2989h;
import p085g4.C3265m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b5.m */
/* loaded from: classes.dex */
public final class C1036m extends AbstractRunnableC3006y {

    /* renamed from: o */
    final /* synthetic */ Context f5213o;

    /* renamed from: p */
    final /* synthetic */ C1043t f5214p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036m(C1043t c1043t, C3265m c3265m, Context context) {
        super(c3265m);
        this.f5214p = c1043t;
        this.f5213o = context;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: b */
    protected final void mo6274b() {
        C3265m c3265m;
        c3265m = this.f5214p.f5230c;
        c3265m.m14516e(Boolean.valueOf(C2989h.m13460a(this.f5213o)));
    }
}
