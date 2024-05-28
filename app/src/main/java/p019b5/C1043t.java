package p019b5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import p045d5.AbstractBinderC3001t;
import p045d5.C2981d;
import p045d5.C2997p;
import p045d5.C3005x;
import p045d5.InterfaceC2984e0;
import p085g4.AbstractC3263l;
import p085g4.C3265m;

/* renamed from: b5.t */
/* loaded from: classes.dex */
final class C1043t {

    /* renamed from: a */
    private final C3005x f5228a;

    /* renamed from: b */
    private final String f5229b;

    /* renamed from: c */
    private final C3265m f5230c;

    /* renamed from: d */
    final C2981d f5231d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1043t(Context context, C3005x c3005x) {
        C3265m c3265m = new C3265m();
        this.f5230c = c3265m;
        this.f5229b = context.getPackageName();
        this.f5228a = c3005x;
        C2981d c2981d = new C2981d(context, c3005x, "ExpressIntegrityService", C1044u.f5232a, new InterfaceC2984e0() { // from class: b5.l
            @Override // p045d5.InterfaceC2984e0
            /* renamed from: a */
            public final Object mo6272a(IBinder iBinder) {
                return AbstractBinderC3001t.m13475l(iBinder);
            }
        }, null);
        this.f5231d = c2981d;
        c2981d.m13452c().post(new C1036m(this, c3265m, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m6280a(C1043t c1043t, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c1043t.f5229b);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        C2997p.m13469b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C2997p.m13468a(arrayList)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m6281b(C1043t c1043t, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c1043t.f5229b);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        C2997p.m13469b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C2997p.m13468a(arrayList)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m6284g(C1043t c1043t) {
        return c1043t.f5230c.m14512a().mo14508o() && !((Boolean) c1043t.f5230c.m14512a().mo14504k()).booleanValue();
    }

    /* renamed from: c */
    public final AbstractC3263l m6285c(String str, long j10, long j11) {
        this.f5228a.m13478b("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        C3265m c3265m = new C3265m();
        this.f5231d.m13454t(new C1038o(this, c3265m, str, j10, j11, c3265m), c3265m);
        return c3265m.m14512a();
    }

    /* renamed from: d */
    public final AbstractC3263l m6286d(long j10) {
        this.f5228a.m13478b("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        C3265m c3265m = new C3265m();
        this.f5231d.m13454t(new C1037n(this, c3265m, j10, c3265m), c3265m);
        return c3265m.m14512a();
    }
}
