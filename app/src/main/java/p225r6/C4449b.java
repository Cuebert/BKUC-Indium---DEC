package p225r6;

import android.content.Context;
import com.roblox.client.C2749c1;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: r6.b */
/* loaded from: classes.dex */
public final class C4449b {

    /* renamed from: a */
    private boolean f18049a;

    /* renamed from: b */
    private C2749c1.d f18050b;

    public C4449b() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public C4449b(boolean z10, C2749c1.d upgradeCheckResult) {
        C3844i.m16253f(upgradeCheckResult, "upgradeCheckResult");
        this.f18049a = z10;
        this.f18050b = upgradeCheckResult;
    }

    /* renamed from: a */
    public final boolean m18268a() {
        return this.f18049a;
    }

    /* renamed from: b */
    public final C2749c1.d m18269b() {
        return this.f18050b;
    }

    /* renamed from: c */
    public final void m18270c(Context context) {
        C3844i.m16253f(context, "context");
    }

    public /* synthetic */ C4449b(boolean z10, C2749c1.d dVar, int i10, C3840e c3840e) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new C2749c1.d() : dVar);
    }
}
