package p019b5;

import android.content.Context;
import java.util.Objects;
import p045d5.C2993l;

/* renamed from: b5.j0 */
/* loaded from: classes.dex */
final class C1031j0 implements InterfaceC1018d {

    /* renamed from: a */
    private Context f5205a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1031j0(C1029i0 c1029i0) {
    }

    @Override // p019b5.InterfaceC1018d
    /* renamed from: a */
    public final C1035l0 mo6265a() {
        C2993l.m13463a(this.f5205a, Context.class);
        return new C1035l0(this.f5205a, null);
    }

    /* renamed from: b */
    public final C1031j0 m6271b(Context context) {
        Objects.requireNonNull(context);
        this.f5205a = context;
        return this;
    }
}
