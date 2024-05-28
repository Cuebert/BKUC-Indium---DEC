package p308y2;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p093h0.C3356a;
import p295x2.C5508c;
import p295x2.InterfaceC5512g;

/* renamed from: y2.f0 */
/* loaded from: classes.dex */
public final class C5611f0 {

    /* renamed from: d */
    private int f20791d;

    /* renamed from: b */
    private final C3356a<C5602b<?>, String> f20789b = new C3356a<>();

    /* renamed from: c */
    private final C3265m<Map<C5602b<?>, String>> f20790c = new C3265m<>();

    /* renamed from: e */
    private boolean f20792e = false;

    /* renamed from: a */
    private final C3356a<C5602b<?>, ConnectionResult> f20788a = new C3356a<>();

    public C5611f0(Iterable<? extends InterfaceC5512g<?>> iterable) {
        Iterator<? extends InterfaceC5512g<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f20788a.put(it.next().mo20264h(), null);
        }
        this.f20791d = this.f20788a.keySet().size();
    }

    /* renamed from: a */
    public final AbstractC3263l<Map<C5602b<?>, String>> m20631a() {
        return this.f20790c.m14512a();
    }

    /* renamed from: b */
    public final Set<C5602b<?>> m20632b() {
        return this.f20788a.keySet();
    }

    /* renamed from: c */
    public final void m20633c(C5602b<?> c5602b, ConnectionResult connectionResult, String str) {
        this.f20788a.put(c5602b, connectionResult);
        this.f20789b.put(c5602b, str);
        this.f20791d--;
        if (!connectionResult.m7379B()) {
            this.f20792e = true;
        }
        if (this.f20791d == 0) {
            if (this.f20792e) {
                this.f20790c.m14513b(new C5508c(this.f20788a));
            } else {
                this.f20790c.m14514c(this.f20789b);
            }
        }
    }
}
